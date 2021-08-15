package models

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Someone who uses Round.
 *
 * All the values are optional, and may or may not be needed for serialisation or returned from deserialisation.
 *
 * @param id the user's unique ID
 * @param firstName the user's first name
 * @param lastName the user's last name
 * @param email the user's email address used to log in to Round
 * @param phone the user's mobile phone number
 * @param password the user's Round password
 * @param acceptedSMSMarketing whether the user opted to get marketing text messages
 * @param acceptedEmailMarketing whether the user opted to get marketing emails
 * @param acceptedNotificationMarketing whether the user opted to get marketing via push notifications
 * @param dateOfBirth midnight on the day the user was born
 * @param phoneConfirmed whether the user's phone number has been confirmed to be able to receive text messages
 * @param gender the user's gender. Must be between 0 and 3 (inclusive) or null. The default value set by the official app is 3.
 * @param occupation the user's occupation. Must be between 0 and 5 (includive) or null. The values normally used are 1 and 4.
 * @param appleAuthorised whether the user logged in with an Apple ID
 * @param googleAuthorised whether the user logged in with Google
 * @param facebookAuthorised whether the user logged in with Facebook
 */
@Serializable
data class User(
    @SerialName("Id") val id: String? = null,
    @SerialName("FirstName") val firstName: String? = null,
    @SerialName("LastName") val lastName: String? = null,
    @SerialName("Email") val email: String? = null,
    @SerialName("MobileNumber") val phone: String? = null,
    @SerialName("Password") val password: String? = null,
    @SerialName("AccptedMarketingSMS") val acceptedSMSMarketing: Boolean? = null,
    @SerialName("AcceptedMarketingEmails") val acceptedEmailMarketing: Boolean? = null,
    @SerialName("AcceptedMarketingPushNotifications") val acceptedNotificationMarketing: Boolean? = null,
    @SerialName("DOB") val dateOfBirth: LocalDateTime? = null,
    @SerialName("PhoneNumberConfirmed") val phoneConfirmed: Boolean? = null,
    @SerialName("Gender") val gender: Int? = null,
    @SerialName("Occupation") val occupation: Int? = null,
    @SerialName("IsAppleAuthorisedUser") val appleAuthorised: Boolean? = null,
    @SerialName("IsGoogleAuthorisedUser") val googleAuthorised: Boolean? = null,
    @SerialName("IsFacebookAuthorisedUser") val facebookAuthorised: Boolean? = null,
) {
    init {
        require(gender == null || gender in 0..3) { "Gender must be between 0 and 3 (inclusive) or null" }
        require(occupation == null || occupation in 0..5) { "Occupation must be between 0 and 5 (inclusive) or null"}
    }
}
