package service.manager

import exception.ConsoleMessage
import exception.ParkingException
import model.Vehicle
import service.ParkingService

/**
 * Created by Pallaw Pathak on 08/06/20. - https://www.linkedin.com/in/pallaw-pathak-a6a324a1/
 */
object ParkingServiceManager : ParkingService {

    private var capacity: Int = 0
    private var parkingMap: HashMap<Int, Vehicle> = HashMap()


    @Throws(ParkingException::class)
    override fun createParkingLot(capacity: Int) {
        if (this.capacity == 0){
            this.capacity = capacity
            println(ConsoleMessage.SUCCESS_CREATE_PARKING.message.replace("{variable}", capacity.toString()))
        }
        else
            throw ParkingException(ConsoleMessage.ERROR_CREATE_PARKING.message)
    }
}