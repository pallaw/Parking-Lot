package service

import exception.ParkingException

/**
 * Created by Pallaw Pathak on 08/06/20. - https://www.linkedin.com/in/pallaw-pathak-a6a324a1/
 */
interface ParkingService: BaseService {
    @Throws(ParkingException::class)
    fun createParkingLot(capacity: Int)
}