package com.QA.QuestionnaireAssessment.controllers;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.QA.QuestionnaireAssessment.models.Users;
import com.QA.QuestionnaireAssessment.services.UsersService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class UsersController {
	
	@Autowired
	private UsersService userService;
	
	@GetMapping("/users")
	public List<Users> users() {
		return userService.findAll();
	}
	
	@GetMapping("/users/{uId}")
	public ResponseEntity<?> search(@PathVariable Long uId) {
		Optional<Users> user = null;
		Map<String, Object> response = new HashMap<>();
		try {
			user = userService.findById(uId);
		} catch (DataAccessException e) {
			response.put("MESSAGE", "Error consulting data base");
			response.put("ERROR", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		if (user.isPresent() == false) {
			response.put("MESSAGE", "ID: ".concat(uId.toString().concat(" doesn't exist")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Optional<Users>>(user, HttpStatus.OK);
	}
	
	@PostMapping("/users")
	public ResponseEntity<?> create(@Validated @RequestBody Users user, BindingResult result)
			throws ParseException {
		Users userNew = null;
		Map<String, Object> response = new HashMap<>();

		if (result.hasErrors()) {

			List<String> errors = result.getFieldErrors().stream()
					.map(err -> "Field " + err.getDefaultMessage() + ", " + err.getDefaultMessage())
					.collect(Collectors.toList());

			response.put("MESSAGE", "Empty data");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
		}

		try {
			userNew = userService.save(user);
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
		} catch (DataAccessException e) {
			response.put("MESSAGE", "Already exists");
			response.put("ERROR","Already exists");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/users/{uId}")
	public ResponseEntity<?> delete(@PathVariable Long uId) {

		Map<String, Object> response = new HashMap<>();

		try {
			userService.delete(uId);
		} catch (DataAccessException e) {
			response.put("MESSAGE", "Error deleting");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		response.put("MESSAGE","The Place ".concat(uId.toString().concat(" eliminated with success")));

		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
}
