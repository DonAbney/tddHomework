import org.junit.Test

class GoonValidatorTest {

    @Test(expected = GoonException)
    void missingFirstNameThrowsGoonException() {
        Goon goon = new Goon()
        goon.setFirstName("")
        GoonValidator goonValidator = new GoonValidator()
        goonValidator.validate(goon)
    }
}
