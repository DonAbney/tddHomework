import org.junit.Test
import org.junit.Before

class GoonValidatorTest {

    Goon goon
    GoonValidator goonValidator = new GoonValidator()

    @Before
    void setUp() {
        goon = new Goon([firstName: "John", birthDate: new Date(), addressOne: "123 Someplace", city: "Columbus", state: "Ohio", zipCode: 12345, phoneNumber: "614-555-1212"])
    }

    @Test(expected = GoonException)
    void missingFirstNameThrowsGoonException() {
        goon.setFirstName("")
        goonValidator.validate(goon)
    }

    @Test(expected = GoonException)
    void missingLastNameThrowsGoonException() {
        goon.setLastName("")
        goonValidator.validate(goon)
    }

    @Test(expected = GoonException)
    void missingBirthDateThrowsGoonException() {
        goon.setBirthDate(null)
        goonValidator.validate(goon)
    }

    @Test(expected = GoonException)
    void missingPhoneNumberThrowsGoonException() {
        goon.setPhoneNumber("")
        goonValidator.validate(goon)
    }
}
