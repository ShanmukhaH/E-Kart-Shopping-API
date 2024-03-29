package com.ecommerce.ekart.service;

import org.springframework.http.ResponseEntity;

import com.ecommerce.ekart.requestdto.UserRequest;
import com.ecommerce.ekart.responsedto.UserResponse;
import com.ecommerce.ekart.utility.ResponseStrcture;

public interface AuthService {

	ResponseEntity<ResponseStrcture<UserResponse>> registerUser(UserRequest userrequest);

}
