import java.util.Scanner;
public class TwoCharacters
{

    public static void main(String[] args)
        {
        MyCharacter firstCharacter = new MyCharacter();
        MyCharacter secondCharacter = new MyCharacter();
        
        firstCharacter = getData(firstCharacter);
        secondCharacter = getDataAgain(secondCharacter);
        
        firstCharacter.display();
        secondCharacter.displayAgain();
        }
        
    public static MyCharacter getData(MyCharacter xy)
        {
        String gender;
        String hairColor;
        String eyeColor;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Is your first character male or female? >>");
        gender = keyboard.nextLine();
        System.out.print("What is your first character's hair color? >>");
        hairColor = keyboard.nextLine();
        System.out.print("What is your first character's eye color? >>");
        eyeColor = keyboard.nextLine();
        
        xy.setGender(gender);
        xy.setHairColor(hairColor);
        xy.setEyeColor(eyeColor);
        
        return xy;
        }
        
     public static MyCharacter getDataAgain(MyCharacter ff)
        {
        String gender;
        String hairColor;
        String eyeColor;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Is your second character male or female? >>");
        gender = keyboard.nextLine();
        System.out.print("What is your second character's hair color? >>");
        hairColor = keyboard.nextLine();
        System.out.print("What is your second character's eye color? >>");
        eyeColor = keyboard.nextLine();
        
        ff.setGender(gender);
        ff.setHairColor(hairColor);
        ff.setEyeColor(eyeColor);
        
        return ff;
        }



}