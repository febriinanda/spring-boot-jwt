package com.auth0.samples.authapi.security;

public class SecurityConstant {
	public static  final String SECRET = "KMZWA8AWAH";
	public static final long EXPIRATION_TIME = 864_000_000; // 10 days
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	public static final String SIGN_UP_URL = "/users/signup";
}
