/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.edu.colegiominayticha.msidentitymanagementneg.api;

import com.edu.colegiominayticha.msidentitymanagementneg.model.ErrorDto;
import java.util.UUID;
import com.edu.colegiominayticha.msidentitymanagementneg.model.UserDto;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-15T19:26:32.326386Z[Etc/UTC]")
@Validated
@Api(value = "users", description = "the users API")
public interface UsersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /users : Create User
     * This operation allows you to create a new user within the system.
     *
     * @param userId This specifies the user who carries out actions on the system. (required) (required)
     * @param body  (required)
     * @return Created (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Create User", nickname = "createUser", notes = "This operation allows you to create a new user within the system.", response = UserDto.class, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = UserDto.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorDto.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDto.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ErrorDto.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorDto.class) })
    @PostMapping(
        value = "/users",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserDto> createUser(@ApiParam(value = "This specifies the user who carries out actions on the system. (required)" ,required=true) @RequestHeader(value="userId", required=true) String userId,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UserDto body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"lastName\" : \"lastName\", \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"password\" : \"password\", \"roles\" : [ { \"name\" : \"name\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"name\" : \"name\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"name\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"updatedUser\" : \"updatedUser\", \"email\" : \"email\", \"enabled\" : true, \"createdUser\" : \"createdUser\", \"username\" : \"username\", \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /users/{userId} : Delete user
     * This operation allows you to delete a user.
     *
     * @param userId This specifies the user who carries out actions on the system. (required) (required)
     * @param userId2 User identification. (required)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Delete user", nickname = "deleteUser", notes = "This operation allows you to delete a user.", tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorDto.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDto.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ErrorDto.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorDto.class) })
    @DeleteMapping(
        value = "/users/{userId}",
        produces = { "*/*" }
    )
    default ResponseEntity<Void> deleteUser(@ApiParam(value = "This specifies the user who carries out actions on the system. (required)" ,required=true) @RequestHeader(value="userId", required=true) String userId,@ApiParam(value = "User identification.",required=true) @PathVariable("userId") UUID userId2) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /users : Find all users
     * This operation allows you to retrieve a list of users.
     *
     * @param userId This specifies the user who carries out actions on the system. (required) (required)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Find all users", nickname = "findAllUsers", notes = "This operation allows you to retrieve a list of users.", response = UserDto.class, responseContainer = "List", tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserDto.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorDto.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDto.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ErrorDto.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorDto.class) })
    @GetMapping(
        value = "/users",
        produces = { "application/json" }
    )
    default ResponseEntity<List<UserDto>> findAllUsers(@ApiParam(value = "This specifies the user who carries out actions on the system. (required)" ,required=true) @RequestHeader(value="userId", required=true) String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"lastName\" : \"lastName\", \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"password\" : \"password\", \"roles\" : [ { \"name\" : \"name\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"name\" : \"name\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"name\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"updatedUser\" : \"updatedUser\", \"email\" : \"email\", \"enabled\" : true, \"createdUser\" : \"createdUser\", \"username\" : \"username\", \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /users/{userId} : Find user by id
     * This operation allows you to retrieve a user by its identification.
     *
     * @param userId This specifies the user who carries out actions on the system. (required) (required)
     * @param userId2 User identification. (required)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Find user by id", nickname = "findUserById", notes = "This operation allows you to retrieve a user by its identification.", response = UserDto.class, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserDto.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorDto.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDto.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ErrorDto.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorDto.class) })
    @GetMapping(
        value = "/users/{userId}",
        produces = { "application/json" }
    )
    default ResponseEntity<UserDto> findUserById(@ApiParam(value = "This specifies the user who carries out actions on the system. (required)" ,required=true) @RequestHeader(value="userId", required=true) String userId,@ApiParam(value = "User identification.",required=true) @PathVariable("userId") UUID userId2) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"lastName\" : \"lastName\", \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"password\" : \"password\", \"roles\" : [ { \"name\" : \"name\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"name\" : \"name\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"name\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"updatedUser\" : \"updatedUser\", \"email\" : \"email\", \"enabled\" : true, \"createdUser\" : \"createdUser\", \"username\" : \"username\", \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /users/username/{username} : Find user by its username
     * This operation allows you to retrieve a user by its username.
     *
     * @param userId This specifies the user who carries out actions on the system. (required) (required)
     * @param username Username. (required)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Find user by its username", nickname = "findUserByUsername", notes = "This operation allows you to retrieve a user by its username.", response = UserDto.class, tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = UserDto.class),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorDto.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDto.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ErrorDto.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorDto.class) })
    @GetMapping(
        value = "/users/username/{username}",
        produces = { "application/json" }
    )
    default ResponseEntity<UserDto> findUserByUsername(@ApiParam(value = "This specifies the user who carries out actions on the system. (required)" ,required=true) @RequestHeader(value="userId", required=true) String userId,@ApiParam(value = "Username.",required=true) @PathVariable("username") String username) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"lastName\" : \"lastName\", \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"password\" : \"password\", \"roles\" : [ { \"name\" : \"name\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" }, { \"name\" : \"name\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\" } ], \"name\" : \"name\", \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\", \"updatedUser\" : \"updatedUser\", \"email\" : \"email\", \"enabled\" : true, \"createdUser\" : \"createdUser\", \"username\" : \"username\", \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /users/{userId} : Update user
     * This operation allows you to update the information of a user.
     *
     * @param userId This specifies the user who carries out actions on the system. (required) (required)
     * @param userId2 User identification. (required)
     * @param body  (required)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Update user", nickname = "updateUser", notes = "This operation allows you to update the information of a user.", tags={ "Users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad Request", response = ErrorDto.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = ErrorDto.class),
        @ApiResponse(code = 403, message = "Forbidden", response = ErrorDto.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = ErrorDto.class) })
    @PutMapping(
        value = "/users/{userId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> updateUser(@ApiParam(value = "This specifies the user who carries out actions on the system. (required)" ,required=true) @RequestHeader(value="userId", required=true) String userId,@ApiParam(value = "User identification.",required=true) @PathVariable("userId") UUID userId2,@ApiParam(value = "" ,required=true )  @Valid @RequestBody UserDto body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
