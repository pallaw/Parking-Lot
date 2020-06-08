package exception

/**
 * Created by Pallaw Pathak on 08/06/20. - https://www.linkedin.com/in/pallaw-pathak-a6a324a1/
 */
enum class ConsoleMessage(var message: String) {
    ERROR_CREATE_PARKING("Sorry Parking Already Created, It CAN NOT be recreated."),
    SUCCESS_CREATE_PARKING("Created parking lot with {variable} slots"),
    ERROR_INVALID_VALUE("{variable} value is incorrect"),
}