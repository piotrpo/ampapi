package avnet.toolla.net.avnet.communication.backend;

import avnet.toolla.net.avnet.communication.DefaultCallback;
import avnet.toolla.net.avnet.communication.backend.entities.BasicUserProfile;
import avnet.toolla.net.avnet.communication.backend.entities.CalendarEvent;
import avnet.toolla.net.avnet.communication.backend.entities.CallendarEventsCollection;
import avnet.toolla.net.avnet.communication.backend.entities.Credentials;
import avnet.toolla.net.avnet.communication.backend.entities.EnablementTracksCollection;
import avnet.toolla.net.avnet.communication.backend.entities.Message;
import avnet.toolla.net.avnet.communication.backend.entities.MessageHeadersCollection;
import avnet.toolla.net.avnet.communication.backend.entities.QuizContent;
import avnet.toolla.net.avnet.communication.backend.entities.ResourcesCollection;
import avnet.toolla.net.avnet.communication.backend.entities.Token;
import avnet.toolla.net.avnet.communication.backend.entities.UserProfile;
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
    String BASE_URL = "http://private-6dea31-avn.apiary-mock.com";

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
    void requestMessage(@Query("token") String tokenString, @Path("messageId") String messageId, DefaultCallback<Message> messageDefaultCallback);

    /**
     * Request all events
     * @param tokenString session token
     * @param callback callback with {@link CallendarEventsCollection}
     */
    @GET("/events")
    void requestAllEvents(@Query("token") String tokenString, Callback<CallendarEventsCollection> callback);

    /**
     * Request single event data
     * @param token session token
     * @param eventId id of event
     * @param callback callback with {@link CalendarEvent data}
     */
    @GET("/events/{id}")
    void requestEvent(@Query("token") String token, @Path("id") String eventId, DefaultCallback<CalendarEvent> callback);

    /**
     * Replace stored user's profile data with the new ones
     * @param tokenString session token
     * @param profile profile data
     * @param callback callback - no data
     */
    @PUT("/users/me/profile")
    void putProfile(@Query("token") String tokenString, @Body UserProfile profile, DefaultCallback<Void> callback);

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
