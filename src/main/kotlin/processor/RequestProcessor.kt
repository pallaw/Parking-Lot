package processor

import command.Command
import utils.ConsoleUtility
import kotlin.system.exitProcess

/**
 * Created by Pallaw Pathak on 08/06/20. - https://www.linkedin.com/in/pallaw-pathak-a6a324a1/
 */
class RequestProcessor : BaseProcessor {
    override fun execute(command: String) {
        val inputs = command.split(" ")
        val key = inputs[0]

        when (key) {
            Command.HELP.inputCommand -> {
                ConsoleUtility.showAvailableCommands()
            }
            Command.EXIT.inputCommand -> {
                exitProcess(0)
            }
        }
    }
}