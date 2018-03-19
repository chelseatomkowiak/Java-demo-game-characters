public class MyCharacter
{

    String gender;
    String hairColor;
    String eyeColor;
    
    public void MyCharacter()
        {
        gender = "XXX";
        hairColor = "XXX";
        eyeColor = "XXX";
        }

    public void setGender(String whatIsGender)
        {
        gender = whatIsGender;
        }
    
    public void setHairColor(String whatIsHairColor)
        {
        hairColor = whatIsHairColor;
        }  
        
    public void setEyeColor(String whatIsEyeColor)
        {
        eyeColor = whatIsEyeColor;
        }
        
    public String getGender()
        {
        return gender;
        }
        
    public String getHairColor()
        {
        return hairColor;
        }
        
    public String getEyeColor()
        {
        return eyeColor;
        }
        
    public void display()
        {
        System.out.println("Your first character is a " +
        gender + " with " + hairColor + " hair and " +
        eyeColor + " eyes.");
        }
        
    public void displayAgain()
        {
        System.out.println("Your second character is a " +
        gender + " with " + hairColor + " hair and " +
        eyeColor + " eyes.");
        }

}