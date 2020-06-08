package processor

import command.Command
import exception.ConsoleMessage
import exception.ParkingException
import model.Car
import service.manager.ParkingServiceManager
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
            Command.CREATE_PARKING.inputCommand -> {
                try {
                    val capacity: Int = inputs[1].toInt()
                    ParkingServiceManager.createParkingLot(capacity)
                } catch (e: NumberFormatException) {
                    throw ParkingException(ConsoleMessage.ERROR_INVALID_VALUE.message.replace("{variable}", "capacity"))
                }
            }

            Command.PARK.inputCommand -> {
                ParkingServiceManager.parkVehicle(Car(inputs[1]))
            }
        }
    }
}