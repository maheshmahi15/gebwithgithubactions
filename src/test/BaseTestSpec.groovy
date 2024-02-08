class BaseTestSpec extends GebReportingSpec {

    def "verify geb actions"() {
        when:"geb with githubactions"
        then:"text print"
        print("learn........")
    }

}
