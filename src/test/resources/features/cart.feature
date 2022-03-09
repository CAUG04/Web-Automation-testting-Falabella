#language:en
Feature: Cart Operations

  Scenario Outline: Add a product
    Given that "user" has opened the ecommerce
    When he select the product from the section
      | category        | subcategory        | product        |
      | <user_category> | <user_subcategory> | <user_product> |
    And he adds the product to the cart with
    Then he should see the added product in the cart

    Examples:
      | user_category | user_subcategory | user_product       |
      | Tecnología    | Accesorios TV    | Antena para TDT HD |