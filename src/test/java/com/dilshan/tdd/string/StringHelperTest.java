package com.dilshan.tdd.string;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;

public class StringHelperTest {

    @Test
    public void testStringWithTwoCharsAreReversed() {
        StringHelper stringHelper = new StringHelper();
        String result = stringHelper.swapLastTwoChars("AB");
        AssertionsForClassTypes.assertThat(result).isEqualTo("BA");
    }

    @Test
    public void testNullOrEmptyInputReturnValue() {
        StringHelper stringHelper = new StringHelper();
        String result = stringHelper.swapLastTwoChars(null);
        AssertionsForClassTypes.assertThat(result).isEqualTo(null);
    }

    @Test
    public void testWithWhitespaceInput() {
        // Given
        StringHelper stringHelper = new StringHelper();
        String input = "   ";

        // When
        String result = stringHelper.swapLastTwoChars(input);

        // Then
        AssertionsForClassTypes.assertThat(result).isEqualTo(input);
    }

    @Test
    public void testWithLengthOfTenCharacters() {
        // Given
        StringHelper stringHelper = new StringHelper();
        String input = "ABCDEFGHIJ";

        // When
        String result = stringHelper.swapLastTwoChars(input);

        // Then
        AssertionsForClassTypes.assertThat(result).isEqualTo("JIHGFEDCBA");
    }

    @Test
    public void testRemoveFirstCharacter() {
        StringHelper stringHelper = new StringHelper();
        String result = stringHelper.removeFirstCharacters("ABCD");
        AssertionsForClassTypes.assertThat(result).isEqualTo("BCD");
    }


    //These below tests are auto generated via CODIUM AI tool
    // Returns a string with the last two characters swapped
    @Test
    public void test_swap_last_two_chars() {
        // Given
        StringHelper stringHelper = new StringHelper();
        String input = "AB";

        // When
        String result = stringHelper.swapLastTwoChars(input);

        // Then
        AssertionsForClassTypes.assertThat(result).isEqualTo("BA");
    }

    // Returns an empty string when given an empty string
    @Test
    public void test_empty_string_input() {
        // Given
        StringHelper stringHelper = new StringHelper();
        String input = "";

        // When
        String result = stringHelper.swapLastTwoChars(input);

        // Then
        AssertionsForClassTypes.assertThat(result).isEqualTo("");
    }

    // Returns the same string when given a string with only one character
    @Test
    public void test_single_character_input() {
        // Given
        StringHelper stringHelper = new StringHelper();
        String input = "A";

        // When
        String result = stringHelper.swapLastTwoChars(input);

        // Then
        AssertionsForClassTypes.assertThat(result).isEqualTo("A");
    }

    // Returns the same string when given a string with only whitespace characters
    @Test
    public void test_whitespace_input() {
        // Given
        StringHelper stringHelper = new StringHelper();
        String input = "   ";

        // When
        String result = stringHelper.swapLastTwoChars(input);

        // Then
        AssertionsForClassTypes.assertThat(result).isEqualTo("   ");
    }

    // Returns the same string when given a string with only non-whitespace characters
    /*@Test
    public void test_non_whitespace_input() {
        // Given
        StringHelper stringHelper = new StringHelper();
        String input = "ABC";

        // When
        String result = stringHelper.swapLastTwoChars(input);

        // Then
        AssertionsForClassTypes.assertThat(result).isEqualTo("ABC");
    }*/

    // Returns a string with the last two characters swapped when given a string with only whitespace characters followed by non-whitespace characters
    @Test
    public void test_whitespace_followed_by_non_whitespace_input() {
        // Given
        StringHelper stringHelper = new StringHelper();
        String input = "   ABC";

        // When
        String result = stringHelper.swapLastTwoChars(input);

        // Then
        AssertionsForClassTypes.assertThat(result).isEqualTo("CBA   ");
    }

    // Returns null when given a null input
    @Test
    public void test_null_input() {
        // Given
        StringHelper stringHelper = new StringHelper();
        String input = null;

        // When
        String result = stringHelper.swapLastTwoChars(input);

        // Then
        AssertionsForClassTypes.assertThat(result).isNull();
    }

    // Returns a string with the last two characters swapped when given a string with only non-whitespace characters followed by whitespace characters
    @Test
    public void test_non_whitespace_followed_by_whitespace_input() {
        // Given
        StringHelper stringHelper = new StringHelper();
        String input = "ABC   ";

        // When
        String result = stringHelper.swapLastTwoChars(input);

        // Then
        AssertionsForClassTypes.assertThat(result).isEqualTo("   CBA");
    }

    // Returns a string with the last two characters swapped when given a string with both whitespace and non-whitespace characters
    @Test
    public void test_mixed_whitespace_and_non_whitespace_input() {
        // Given
        StringHelper stringHelper = new StringHelper();
        String input = "A B C";

        // When
        String result = stringHelper.swapLastTwoChars(input);

        // Then
        AssertionsForClassTypes.assertThat(result).isEqualTo("C B A");
    }

    // Returns a string with the last two characters swapped when given a string with special characters
    @Test
    public void test_special_characters_input() {
        // Given
        StringHelper stringHelper = new StringHelper();
        String input = "!@#$%^&*()";

        // When
        String result = stringHelper.swapLastTwoChars(input);

        // Then
        AssertionsForClassTypes.assertThat(result).isEqualTo(")(*&^%$#@!");
    }

    // Returns a string with the last two characters swapped when given a string with unicode characters
    /*@Test
    public void test_unicode_characters_input() {
        // Given
        StringHelper stringHelper = new StringHelper();
        String input = "😀😁😂";

        // When
        String result = stringHelper.swapLastTwoChars(input);

        // Then
        AssertionsForClassTypes.assertThat(result).isEqualTo("😂😁😀");
    }*/

    // Returns a string with the last two characters swapped when given a string with leading/trailing whitespace characters
    @Test
    public void test_leading_trailing_whitespace_input() {
        // Given
        StringHelper stringHelper = new StringHelper();
        String input = "  ABC  ";

        // When
        String result = stringHelper.swapLastTwoChars(input);

        // Then
        AssertionsForClassTypes.assertThat(result).isEqualTo("  CBA  ");
    }

}
