package com.vti.academy.web.service;

import java.util.Optional;

import org.json.JSONObject;

import com.vti.academy.web.model.Account;
import com.vti.academy.web.model.dto.CommonDTO;
import com.vti.academy.web.model.dto.RefreshTokenDTO;
import com.vti.academy.web.response.CommonResponse;

public interface AccountService {

	Optional<Account> findByUserName(String userName);
	
	CommonResponse resetPassword(String account);
	
	CommonResponse changePassword(String account, String oldPassword, String newPassword);
	
	CommonResponse getFirstLoginByAccount(String userName);
	
	CommonResponse updateAvatar(CommonDTO commonDTO);
	
	CommonResponse getAccountInfo(String userName);
	
	CommonResponse getListAccountWhenLoginWithAccountAdmin();
	
	Optional<Account> findByDetailToken(JSONObject payload);
	
	CommonResponse genToken(String userName);
	
	CommonResponse getAuthenDetail(String accessToken);
	
	CommonResponse refreshToken(RefreshTokenDTO refreshTokenDTO);
	
}
