package hello.core.member.domain;

public class Member {

    Long id;
    String name;
    Grade grade;

    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public Grade getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }
}
