public class check_alphabets {
    public static void main(String[] args) {
        String s1="ahmed";
        String s2="ahmed11";
        System.out.println(chek(s1));
        System.out.println(chek(s2));


    }
    public static boolean chek(String s){
        if (s != null && s != "" ){
            return s.chars().allMatch(Character::isLetter);
        }else {
            return false;
        }

    }
}
