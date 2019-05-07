import demo.SpellChecker;
import demo.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public void executeCase(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");

        TextEditor te = (TextEditor) context.getBean("textEditor");
        System.out.println(te.getSpellChecker().getS());

        SpellChecker sc = (SpellChecker) context.getBean("spellChecker");
        sc.setS("App2");
        System.out.println(sc.getS());

        System.out.println(te.getSpellChecker().getS());
        TextEditor te2 = (TextEditor) context.getBean("textEditor");
        System.out.println(te2.getSpellChecker().getS());
    }
}
