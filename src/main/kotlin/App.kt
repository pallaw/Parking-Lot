import exception.ParkingException
import processor.BaseProcessor
import processor.RequestProcessor
import utils.ConsoleUtility
import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Created by Pallaw Pathak on 08/06/20. - https://www.linkedin.com/in/pallaw-pathak-a6a324a1/
 */
object App {

    val requestProcessor: BaseProcessor = RequestProcessor()

    @JvmStatic
    fun main(args: Array<String>) {
        //app related info
        ConsoleUtility.printAboutProject()

        //list of available commands
        ConsoleUtility.showAvailableCommands()

        //show command example
        ConsoleUtility.showCommandInstructions()

        while (true) {
            val bufferReader = BufferedReader(InputStreamReader(System.`in`))
            var input = bufferReader.readLine().trim()

            if (requestProcessor.validate(input)) {
                try {
                    requestProcessor.execute(input)
                }catch (parkingException: ParkingException) {
                    ConsoleUtility.showError(parkingException.message)
                }
            } else
                ConsoleUtility.showCommandInstructions()

        }
    }
}