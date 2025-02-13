package Second;
//1  Create a Record for the Student with the following Fields: id, name, standard
//Make sure that no null values should be used for initialization.
//Use equal and hashCode methods with Student records

class Student{
    record StudentRecord(int id,String name,int standarad){

        StudentRecord{
            if((id<=0) || name==null || standarad<=0){
                throw new NullPointerException("No null value is accepted. Enter Correct Values");
            }
        }
        @Override
        public String toString() {
            return "Student with ID "+id();
        }
        public void educationType(){
            if(standarad>8 && standarad<=12) System.out.println("Secondary Education");
            else if (standarad>5) System.out.println("Primary Education");
            else System.out.println("Early Childhood Education");
        }


    }
}

public class Ques1 {
    public static void main(String[] args) {
        Student.StudentRecord newStudent = new Student.StudentRecord(1,"Krishna",12);
        Student.StudentRecord newStudent2 = new Student.StudentRecord(1,"Krishna",12);

        System.out.println(newStudent.id());
        System.out.println(newStudent.name());
        System.out.println(newStudent.standarad());
        System.out.println(newStudent.toString());
        newStudent.educationType();

        System.out.println(newStudent.equals(newStudent2)); // This will return true because as its internally override equals and hashcode on basis of keys
        System.out.println(newStudent.hashCode()); // Still same as unique reference id is generated




    }
}
