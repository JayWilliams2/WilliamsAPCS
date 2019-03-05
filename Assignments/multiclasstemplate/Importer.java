import packagename.ImportedStaticClass;
import packagename.ImportedConstructedClass;
public class Importer{
    public static void main(String[] args){
        System.out.println(ImportedStaticClass.getMessage());
        ImportedConstructedClass icc = new ImportedConstructedClass("I also work!");
        System.out.println(icc.getMessage());

    }
}