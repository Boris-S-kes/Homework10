public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        System.out.println("Hello world!");
        String firstName = " Ivan ";
        String middleName = " Ivanovich ";
        String lastName = " Ivanov ";
        String fullName = " Ivanov Ivan Ivanovich ";
        System.out.println( "Ф. И. О. сотрудника — " + fullName);

        fullName = "ivanov ivan ivanovich ";
        System.out.println( "Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        fullName = "Иванов Семён Семёнович ";
       String s = fullName.replace('ё' ,'е');
       System.out.println( " Данные Ф. И. О. сотрудника — " +s);
        }
    }
