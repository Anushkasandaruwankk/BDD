Feature: User Choose a Language

  Scenario Outline: User go to www.gov.lk with different languages

      Given User on the Welcome page of "https://www.gov.lk/welcome.html"
      When User click on <language>
      Then User go to home page with selected language <language>
      Then User close the browser

    Examples:
      | language  |
      | "sinhala" |
      | "tamil"   |
      | "english" |




