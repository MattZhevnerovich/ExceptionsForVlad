import Exceptions.IncorrectMarkFormatException;
import Exceptions.ZeroSubjectsException;

import java.util.Scanner;

import static java.lang.System.out;

public class MainStudent {
    public static void main(String args[]) {
        Student st1 = new Student("Vasya Ivanov", "Filological", 1, "English",
                10.00, "Italian", 7.00, "Literature", 7.00);
        Student st2 = new Student("Alena Lareonova", "Filological", 1, "English",
                9.00, "French", 8.00, null, null);
        Student st3 = new Student("Pupkin Kirill", "Filological", 2, "Literature",
                10.00, "English", 6.00, null, null);
        Student st4 = new Student("Shlyupkin Sergey", "Mathematical", 1, "Maths",
                3.00, "Physics", 9.00, null, null);
        Student st5 = new Student("Radkevich Maria", "Mathematicall", 1, "Physics",
                8.00, null, null, null, null);
        Student st6 = new Student("Moshkin Vadim", "Mathematical", 2, "Maths",
                8.00, "Geometry", 9.00, null, null);
        Student st7 = new Student("Reven Aleksandr", "Filological", 1, "Italian",
                8.00, "German", 8.00, null, null);
        Student st8 = new Student("Lepkin Valeriy", "Mathematical", 2, "Maths",
                10.00, "Physycs", 10.00, null, null);

        Student[] list = new Student[8];
        list[0] = st1;
        list[1] = st2;
        list[2] = st3;
        list[3] = st4;
        list[4] = st5;
        list[5] = st6;
        list[6] = st7;
        list[7] = st8;

        System.out.println("Rating by all subjects is: ");
        try {
            RatingByAllSubjects(list);
        } catch (IncorrectMarkFormatException e) {
            e.printStackTrace();
        }

//        System.out.println("Rating by a particular subject in a chosen group of a chosen faculty is: ");
//        try {
//            CertainRatingByGroupAndFaculty(list);
//        } catch (ZeroSubjectsException e) {
//            e.printStackTrace();
//        } catch (IncorrectMarkFormatException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("University rating by a certain subject is: ");
//        UniversitySubjectRating(list);

    }

    public static void RatingByAllSubjects(Student[] spisok) throws IncorrectMarkFormatException {
        Double rating = 0.00;
        for (int i = 0; i < spisok.length; i++) {
            if (((spisok[i].getFirstSubjectMark() <= 10.00 && spisok[i].getFirstSubjectMark() > 0.00)
                    && (spisok[i].getSecondSubjectMark() <= 10.00 && spisok[i].getSecondSubjectMark() > 0.00)
                    && (spisok[i].getThirdSubjectMark() <= 10.00 && spisok[i].getThirdSubjectMark() > 0.00))

                    || (((spisok[i].getFirstSubjectMark() <= 10.00 && spisok[i].getFirstSubjectMark() > 0.00)
                            && (spisok[i].getSecondSubjectMark() <= 10.00 && spisok[i].getSecondSubjectMark() > 0.00)
                            && spisok[i].getThirdSubjectMark() == null))
                    || (((spisok[i].getFirstSubjectMark() <= 10.00 && spisok[i].getFirstSubjectMark() > 0.00)
                    && (spisok[i].getSecondSubjectMark() == null)
                    && spisok[i].getThirdSubjectMark() == null)))

                {
                if (spisok[i].getFirstSubjectMark() != null && spisok[i].getSecondSubjectMark() != null && spisok[i].getThirdSubjectMark() != null) {
                    rating = (spisok[i].getFirstSubjectMark() + spisok[i].getSecondSubjectMark() + spisok[i].getThirdSubjectMark()) / 3;
                    out.println(spisok[i].getName() + " " + rating);
                } else if (spisok[i].getFirstSubjectMark() != null && spisok[i].getSecondSubjectMark() != null && spisok[i].getThirdSubjectMark() == null) {
                    rating = (spisok[i].getFirstSubjectMark() + spisok[i].getSecondSubjectMark()) / 2;
                    out.println(spisok[i].getName() + " " + rating);
                } else if (spisok[i].getFirstSubjectMark() != null && spisok[i].getSecondSubjectMark() == null && spisok[i].getThirdSubjectMark() == null) {
                    rating = spisok[i].getFirstSubjectMark();
                    out.println(spisok[i].getName() + " " + rating);
                }
            } else {
                throw new IncorrectMarkFormatException("Проверьте оценку! ");
            }
        }
    }

    public static void CertainRatingByGroupAndFaculty(Student[] spisok) throws ZeroSubjectsException, IncorrectMarkFormatException {
        Scanner keyboard = new Scanner(System.in);
        out.println("Введите название факультета (Filological или Mathematical) ");
        String faculty = keyboard.nextLine();
        out.println("Введите название группы (1 или 2) ");
        int group = keyboard.nextInt();
        out.println("Введите название предмета (English/Italian/German/French/Literature/Physics/Geometry/Maths)");
        String subject = keyboard.next();
        keyboard.close();
        Double CertainRating;
        int NumberOfMarks = 0;
        Double SumOfMarks = 0.00;
        for (int i = 0; i < spisok.length; i++) {
            if ((spisok[i].getFirstSubjectName() != null)) {

                if ((spisok[i].getFirstSubjectMark() <= 10.00 && spisok[i].getFirstSubjectMark() > 0.00)
                        && (spisok[i].getSecondSubjectMark() <= 10.00 && spisok[i].getSecondSubjectMark() > 0.00)
                        && (spisok[i].getThirdSubjectMark() <= 10.00 && spisok[i].getThirdSubjectMark() > 0.00)) {
                    if (spisok[i].getFaculty().equals(faculty) && spisok[i].getGroup() == group && spisok[i].getFirstSubjectName().equals(subject)) {
                        SumOfMarks += spisok[i].getFirstSubjectMark();
                    } else if (spisok[i].getFaculty().equals(faculty) && spisok[i].getGroup() == group && spisok[i].getSecondSubjectName().equals(subject)) {
                        SumOfMarks += spisok[i].getSecondSubjectMark();
                    } else if (spisok[i].getFaculty().equals(faculty) && spisok[i].getGroup() == group && spisok[i].getThirdSubjectName().equals(subject)) {
                        SumOfMarks += spisok[i].getThirdSubjectMark();
                    }
                    NumberOfMarks++;
                } else {
                    throw new IncorrectMarkFormatException("Проверьте оценку! ");
                }

            } else {
                throw new ZeroSubjectsException("Проверьте наличие предметов! ");
            }
        }
        CertainRating = SumOfMarks / NumberOfMarks;
        out.println("Subject rating is " + CertainRating);
    }

    public static void UniversitySubjectRating(Student[] spisok){
        Scanner keyboard = new Scanner(System.in);
        out.println("Введите название предмета (English/Italian/German/French/Literature/Physics/Geometry/Maths)");
        String subject = keyboard.next();
        keyboard.close();
        Double UniRating = 0.00;
        int NumberOfMarks = 0;
        Double SumOfMarks = 0.00;
            for (int i = 0; i < spisok.length; i++) {
                if (spisok[i].getFirstSubjectName().equals(subject)) {

                    SumOfMarks += spisok[i].getFirstSubjectMark();
                }
                else if (spisok[i].getSecondSubjectName().equals(subject)){
                    SumOfMarks += spisok[i].getSecondSubjectMark();
                }
                else if (spisok[i].getThirdSubjectName().equals(subject)){
                    SumOfMarks += spisok[i].getThirdSubjectMark();
                }
            NumberOfMarks++;
            }
        UniRating = SumOfMarks/NumberOfMarks;
            System.out.println("Rating of a subject in the University is: " + UniRating);
    }
}



//    if(Name != null) { код
//    }
//    else {
//            throw new NoStudentsInGroupException
//    }

//    if(Group = 1 || Group = 2) { код
//            }
//            else {
//            throw new NoSuchGroupException
//            }

//    if(Faculy = "Filological" || Faculty = "Mathematical") { код
//            }
//            else {
//            throw new NoSuchFacultyException
//            }