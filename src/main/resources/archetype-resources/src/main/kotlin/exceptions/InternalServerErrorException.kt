package ${packageId}.exceptions

class InternalServerErrorException : RuntimeException {

    constructor(message: String) : super(message)
    constructor() : super("Internal server error. Please contact us.")

}
