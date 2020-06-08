/**
 * Created by Pallaw Pathak on 08/06/20. - https://www.linkedin.com/in/pallaw-pathak-a6a324a1/
 */
object App {
    @JvmStatic
    fun main(args: Array<String>) {
        //app related info
        aboutProject()

        //list of available commands
        availableCommands()
    }

    fun aboutProject() {
        println(
            """
    |###################################################################################################################
    |#########################################      PARKING LOT     ####################################################
    |###################################################################################################################                        
    |""".trimMargin()
        )
    }

    fun availableCommands() {
        println(
            """
    |######### Please Enter one of the below commands. Replace variables (written in capitals) with your values ########
    |
    |A) Create parking lot of size n                        ---> create_parking_lot {CAPACITY}
    |B) Park a car                                          ---> park {CAR_NUMBER}
    |C) Remove(Unpark) car from                             ---> leave {CAR_NUMBER} {HOURS}
    |D) Print status of parking slot                        ---> status
    |""".trimMargin()
        )
    }
}