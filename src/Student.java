public class Student {
    public String Name;
    public String Faculty;
    public int Group;
    public String FirstSubjectName;
    public Double FirstSubjectMark;
    public String SecondSubjectName;
    public Double SecondSubjectMark;
    public String ThirdSubjectName;
    public Double ThirdSubjectMark;

    public Student(String name, String faculty, int group, String firstSubjectName, Double firstSubjectMark, String secondSubjectName, Double secondSubjectMark, String thirdSubjectName, Double thirdSubjectMark) {
        Name = name;
        Faculty = faculty;
        Group = group;
        FirstSubjectName = firstSubjectName;
        FirstSubjectMark = firstSubjectMark;
        SecondSubjectName = secondSubjectName;
        SecondSubjectMark = secondSubjectMark;
        ThirdSubjectName = thirdSubjectName;
        ThirdSubjectMark = thirdSubjectMark;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public int getGroup() {
        return Group;
    }

    public void setGroup(int group) {
        Group = group;
    }

    public String getFirstSubjectName() {
        return FirstSubjectName;
    }

    public void setFirstSubjectName(String firstSubjectName) {
        FirstSubjectName = firstSubjectName;
    }

    public Double getFirstSubjectMark() {
        return FirstSubjectMark;
    }

    public void setFirstSubjectMark(Double firstSubjectMark) {
        FirstSubjectMark = firstSubjectMark;
    }

    public String getSecondSubjectName() {
        return SecondSubjectName;
    }

    public void setSecondSubjectName(String secondSubjectName) {
        SecondSubjectName = secondSubjectName;
    }

    public Double getSecondSubjectMark() {
        return SecondSubjectMark;
    }

    public void setSecondSubjectMark(Double secondSubjectMark) {
        SecondSubjectMark = secondSubjectMark;
    }

    public String getThirdSubjectName() {
        return ThirdSubjectName;
    }

    public void setThirdSubjectName(String thirdSubjectName) {
        ThirdSubjectName = thirdSubjectName;
    }

    public Double getThirdSubjectMark() {
        return ThirdSubjectMark;
    }

    public void setThirdSubjectMark(Double thirdSubjectMark) {
        ThirdSubjectMark = thirdSubjectMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Faculty='" + Faculty + '\'' +
                ", Group=" + Group +
                ", FirstSubjectName='" + FirstSubjectName + '\'' +
                ", FirstSubjectMark=" + FirstSubjectMark +
                ", SecondSubjectName='" + SecondSubjectName + '\'' +
                ", SecondSubjectMark=" + SecondSubjectMark +
                ", ThirdSubjectName='" + ThirdSubjectName + '\'' +
                ", ThirdSubjectMark=" + ThirdSubjectMark +
                '}';
    }
}