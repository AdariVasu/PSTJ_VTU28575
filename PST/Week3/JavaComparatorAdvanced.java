import java.util.*;
class JavaComparatorAdvanced {
    static class Student {String name;int id;double cgpa;Student(String n,int i,double c){name=n;id=i;cgpa=c;}}
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("A",2,8.7));students.add(new Student("B",1,9.1));students.add(new Student("C",3,8.7));
        students.sort(Comparator.comparingDouble((Student s)->s.cgpa).reversed()
            .thenComparing(s->s.name).thenComparingInt(s->s.id));
        for(Student s:students)System.out.println(s.name+" "+s.id+" "+s.cgpa);
    }
}
