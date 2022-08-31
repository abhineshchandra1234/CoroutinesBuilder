import kotlinx.coroutines.*


fun main()   = runBlocking { //creates a coroutine that blocks the main thread

        //executes in main thread
        println("Main program starts: ${Thread.currentThread().name}")

        val jobDeferred: Deferred<Int> = async {//Thread: main
            println("Fake work starts: ${Thread.currentThread().name}")//Thread: main
            mySuspendFunc(1000) //Coroutine is suspended but Thread: main is free
            println("Fake work finished: ${Thread.currentThread().name}") //Thread: main
            15
        }


        val num: Int = jobDeferred.await()
        println(num)
        //jobDeferred.join()
        println("Main program ends: ${Thread.currentThread().name}") // main thread
    }

suspend fun mySuspendFunc(time: Long) {
    //code..
    delay(time)
}

suspend fun addTwoInts(nums1: Int, nums2: Int) : Int {
    return nums1 + nums2;
}

