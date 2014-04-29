class GoonValidator {

    void validate(Goon goon) throws GoonException {
        checkFirstName(goon)
        checkLastName(goon)
        checkBirthDate(goon)
        checkPhoneNumber(goon)
    }

    private void checkFirstName(Goon goon) {
        if(!goon.getFirstName()) throw new GoonException("No First Name")
    }

    private void checkLastName(Goon goon) {
        if(!goon.getLastName()) throw new GoonException("No Last Name")
    }

    private void checkBirthDate(Goon goon) {
        if(!goon.getBirthDate()) throw new GoonException("No Birth Date")
    }

    private void checkPhoneNumber(Goon goon) {
        if(!goon.getPhoneNumber()) throw new GoonException("No Phone Number")
    }
}
