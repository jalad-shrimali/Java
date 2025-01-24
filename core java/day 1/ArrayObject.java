class Student{
    int rollNo;
    String name;
    int marks;
}
public class ArrayObject {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.rollNo = 001;
        s1.name = "Abhi";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollNo = 002;
        s2.name = "Ayushi";
        s2.marks = 94;

        Student s3 = new Student();
        s3.rollNo = 003;
        s3.name = "Badal";
        s3.marks = 92;

        Student students[] = new Student[3]; // Array of objects.
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
//        for(int i = 0; i<students.length;i++){
//            System.out.println(students[i].rollNo+" "+students[i].name+": "+ students[i].marks);
//        }
        // using enhanced for loop i.e. for-each loop
        for( Student studs : students){
            System.out.println(studs.rollNo+" "+studs.name+": "+ studs.marks);
        }
    }
}
