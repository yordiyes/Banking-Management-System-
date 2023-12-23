// Import necessary classes for document filtering
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

// Document filter to allow only alphabetic (character) input in any text field
public class CharOnlyDocumentFilter extends DocumentFilter {

    // Override insertString method to filter and allow only alphabetic characters during insertion
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
            throws BadLocationException {
        // Check if the inserted string contains only alphabetic characters
        if (containsOnlyChars(string)) {
            // If so, call the superclass method to perform the insertion
            super.insertString(fb, offset, string, attr);
        }
    }

    // Override replace method to filter and allow only alphabetic characters during replacement
    @Override
    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
            throws BadLocationException {
        // Check if the replacement text contains only alphabetic characters
        if (containsOnlyChars(text)) {
            // If so, call the superclass method to perform the replacement
            super.replace(fb, offset, length, text, attrs);
        }
    }

    // Private method to check if a given string contains only alphabetic characters
    private boolean containsOnlyChars(String text) {
        // Use Java 8 Stream API to check if all characters are letters
        return text.chars().allMatch(Character::isLetter);
    }
}
