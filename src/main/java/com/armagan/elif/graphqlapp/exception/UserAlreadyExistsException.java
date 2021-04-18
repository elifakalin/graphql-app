package com.armagan.elif.graphqlapp.exception;

import graphql.*;
import graphql.language.*;

import java.util.*;

public class UserAlreadyExistsException extends RuntimeException implements GraphQLError {

    public UserAlreadyExistsException(String message) {
        super(message);
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorClassification getErrorType() {
        return ErrorType.ValidationError;
    }
}