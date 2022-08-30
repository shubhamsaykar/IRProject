package com.pwc.anemoi.vendor.roles.exceptions;

import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import jakarta.inject.Singleton;

@Produces
@Singleton
@Requires(classes = {RolesException.class, ExceptionHandler.class})
public class RoleExceptionHandler implements ExceptionHandler<RolesException, HttpResponse<RoleResponse>> {

	@Override
	public HttpResponse<RoleResponse> handle(HttpRequest request, RolesException exception) {

		String msg = exception.getMessage();

		return HttpResponse.ok(new RoleResponse(msg, false));
	}

}
