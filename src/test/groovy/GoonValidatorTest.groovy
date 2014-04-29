import org.junit.Test

class GoonValidatorTest {

    @Test(expected = GoonException)
    void missingFirstNameThrowsGoonException() {
        Goon goon = new Goon()
        GoonValidator goonValidator = new GoonValidator()
        goonValidator.validate(goon)
    }
}
