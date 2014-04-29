class GoonValidator {

    void validate(Goon goon) throws GoonException {
        checkNameFields(goon)
    }

    void checkNameFields(Goon goon) {
        if(!goon.getFirstName()) throw new GoonException("No First Name")
    }
}
