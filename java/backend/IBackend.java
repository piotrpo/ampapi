package net.toolla.backend;

import net.toolla.backend.entities.BasicUserProfile;
import net.toolla.backend.entities.CalendarEvent;
import net.toolla.backend.entities.CalendarEventsCollection;
import net.toolla.backend.entities.Credentials;
import net.toolla.backend.entities.EnablementTracksCollection;
import net.toolla.backend.entities.Message;
import net.toolla.backend.entities.MessageHeadersCollection;
import net.toolla.backend.entities.QuizContent;
import net.toolla.backend.entities.ResourcesCollection;
import net.toolla.backend.entities.Token;
import net.toolla.backend.entities.UserProfile;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by piotrpotulski on 05/01/16.
 * backend API definition
 */
public interface IBackend
{
    String BASE_URL = "http://private-6fb16-ampapi1.apiary-mock.com/";

    /**
     * Request new session token
     * @param credentials user credentials
     * @param callback callback with {@link Token} data
     */
    @POST("/login")
    void requestToken(@Body Credentials credentials, Callback<Token> callback);

    /**
     * Send registration request
     * @param basicUserProfile data used to place registration request
     * @param callback callback no data
     */
    @POST("/register")
    void registerUser(@Body BasicUserProfile basicUserProfile, Callback<Void> callback);

    /**
     * Request for single test data
     * @param token session token
     * @param testId id of requested test
     * @param callback callback with {@link QuizContent}
     */
    @GET("/quizzes/{testId}")
    void requestTestContent(@Query("token") String token, @Path("testId") int testId, Callback<QuizContent> callback);

    /**
     * Request all messages
     * @param tokenString session token
     * @param callback callback with {@link MessageHeadersCollection}
     */
    @GET("/messages")
    void requestMessagesCollection(@Query("token") String tokenString, Callback<MessageHeadersCollection> callback);

    /**
     * Request single message
     * @param tokenString session token
     * @param messageId id of message
     * @param messageDefaultCallback callback with {@link Message} data
     */
    @GET("/messages/{messageId}")
    void requestMessage(@Query("token") String tokenString, @Path("messageId") String messageId, Callback<Message> messageDefaultCallback);

    /**
     * Request all events
     * @param tokenString session token
     * @param callback callback with {@link CalendarEventsCollection}
     */
    @GET("/events")
    void requestAllEvents(@Query("token") String tokenString, Callback<CalendarEventsCollection> callback);

    /**
     * Request single event data
     * @param token session token
     * @param eventId id of event
     * @param callback callback with {@link CalendarEvent data}
     */
    @GET("/events/{id}")
    void requestEvent(@Query("token") String token, @Path("id") String eventId, Callback<CalendarEvent> callback);

    /**
     * Replace stored user's profile data with the new ones
     * @param tokenString session token
     * @param profile profile data
     * @param callback callback - no data
     */
    @PUT("/users/me/profile")
    void putProfile(@Query("token") String tokenString, @Body UserProfile profile, Callback<Void> callback);

    /**
     * Request own profile data
     * @param tokenString session data
     * @param userProfileDefaultCallback callback with {@link UserProfile}
     */
    @GET("/users/me/profile")
    void requestOwnProfile(@Query("token") String tokenString, Callback<UserProfile> userProfileDefaultCallback);

    /**
     * Request all enablement tracks in current user's context
     * @param tokenString session token
     * @param callback callback with {@link EnablementTracksCollection}
     */
    @GET("/tracks")
    void requestTracks(@Query("token") String tokenString, Callback<EnablementTracksCollection> callback);

    /**
     * Resources list
     * @param token session token
     * @param callback callback with {@link ResourcesCollection}
     */
    @GET("/resources")
    void requestResourcesList(@Query("token") String token, Callback<ResourcesCollection> callback);
}
