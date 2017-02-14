package truelecter.practice3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * Created by TrueLecter on 01.02.2017.
 */
@Component("textEditor")
public class TextEditor {
    @Autowired
    @Qualifier("spellCheckerA")
    private SpellChecker spellChecker;

    private List<SpellChecker> availableSpellCheckers = Collections.emptyList();

    public TextEditor(){
        this(null);
    }

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public void setAvailableSpellCheckers(List<SpellChecker> availableSpellCheckers) {
        this.availableSpellCheckers = availableSpellCheckers;
    }

    public List<SpellChecker> getAvailableSpellCheckers(){
        return availableSpellCheckers;
    }

    public void setSpellChecker(SpellChecker sc){
        spellChecker = sc;
    }
}