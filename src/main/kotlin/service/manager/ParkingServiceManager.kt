package service.manager

import exception.ConsoleMessage
import exception.ParkingException
import model.Car
import model.Vehicle
import model.strategy.NearestFirstParkingStrategy
import service.ParkingService

/**
 * Created by Pallaw Pathak on 08/06/20. - https://www.linkedin.com/in/pallaw-pathak-a6a324a1/
 */
object ParkingServiceManager : ParkingService {

    private var capacity: Int = 0
    private val parkingStrategy: NearestFirstParkingStrategy = NearestFirstParkingStrategy()
    private val parkingMap: HashMap<Int, Vehicle> = HashMap()


    @Throws(ParkingException::class)
    override fun createParkingLot(capacity: Int) {
        if (this.capacity == 0) {
            this.capacity = capacity
            //initialize free slots
            for (slotNo in 1..capacity) {
                parkingStrategy.addSlot(slotNo)
            }
            println(ConsoleMessage.SUCCESS_CREATE_PARKING.message.replace("{variable}", capacity.toString()))
        } else
            throw ParkingException(ConsoleMessage.ERROR_CREATE_PARKING.message)
    }

    override fun parkVehicle(car: Car) {
        try {
            val slotNumber = parkingStrategy.getSlot()
            parkingMap.put(slotNumber, car)
            parkingStrategy.removeSlot(slotNumber)
            println(ConsoleMessage.SUCCESS_PARK.message.replace("{variable}", slotNumber.toString()))
        } catch (e: Exception) {
            println(ConsoleMessage.ERROR_PARK.message)
        }
    }
}