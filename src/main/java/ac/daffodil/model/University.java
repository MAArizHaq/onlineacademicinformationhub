package ac.daffodil.model;

import javax.persistence.*;


@Entity
@Table(name = "university")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="university_id")
    private Long universityId;

    @Column(name="university_name")
    private String universityName;

    @Lob
    @Column(name="image", nullable=false, columnDefinition="mediumblob")
    private byte[] image;

    @Column(name="status")
    private String status;

    @Column(name="location")
    private String location;

    @Column(name="average_fees")
    private String averageFees;

    @Column(name="total_student")
    private Long totalStudent;

    @Column(name="international_students")
    private Long internationalStudents;

    @Column(name="employability")
    private String employability;

    @Column(name="short_note", columnDefinition = "TEXT")
    private String shortNote;

    @Column(name="about", columnDefinition = "TEXT")
    private String about;

    @Column(name="academic_staff")
    private Long academicStaff;

    @Column(name="administrative_staff")
    private Long administrativeStaff;

    @Column(name="undergraduates")
    private Long undergraduates;

    @Column(name="postgraduates")
    private Long postgraduates;

    @Column(name="research")
    private String research;

    @Column(name="age")
    private String age;

    public University() {
    }

    public University(String universityName, String status, String location, Long totalStudent, String about, Long academicStaff, Long administrativeStaff, Long undergraduates, Long postgraduates) {
        this.universityName = universityName;
        this.status = status;
        this.location = location;
        this.totalStudent = totalStudent;
        this.about = about;
        this.academicStaff = academicStaff;
        this.administrativeStaff = administrativeStaff;
        this.undergraduates = undergraduates;
        this.postgraduates = postgraduates;
    }

    public Long getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Long universityId) {
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getTotalStudent() {
        return totalStudent;
    }

    public void setTotalStudent(Long totalStudent) {
        this.totalStudent = totalStudent;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Long getAcademicStaff() {
        return academicStaff;
    }

    public void setAcademicStaff(Long academicStaff) {
        this.academicStaff = academicStaff;
    }

    public Long getAdministrativeStaff() {
        return administrativeStaff;
    }

    public void setAdministrativeStaff(Long administrativeStaff) {
        this.administrativeStaff = administrativeStaff;
    }

    public Long getUndergraduates() {
        return undergraduates;
    }

    public void setUndergraduates(Long undergraduates) {
        this.undergraduates = undergraduates;
    }

    public Long getPostgraduates() {
        return postgraduates;
    }

    public void setPostgraduates(Long postgraduates) {
        this.postgraduates = postgraduates;
    }

    public String getAverageFees() {
        return averageFees;
    }

    public void setAverageFees(String averageFees) {
        this.averageFees = averageFees;
    }

    public String getEmployability() {
        return employability;
    }

    public void setEmployability(String employability) {
        this.employability = employability;
    }

    public Long getInternationalStudents() {
        return internationalStudents;
    }

    public void setInternationalStudents(Long internationalStudents) {
        this.internationalStudents = internationalStudents;
    }

    public String getShortNote() {
        return shortNote;
    }

    public void setShortNote(String shortNote) {
        this.shortNote = shortNote;
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityId=" + universityId +
                ", universityName='" + universityName + '\'' +
                ", status='" + status + '\'' +
                ", location='" + location + '\'' +
                ", averageFees='" + averageFees + '\'' +
                ", employability='" + employability + '\'' +
                ", totalStudent=" + totalStudent +
                ", internationalStudents=" + internationalStudents +
                ", shortNote='" + shortNote + '\'' +
                ", about='" + about + '\'' +
                ", academicStaff=" + academicStaff +
                ", administrativeStaff=" + administrativeStaff +
                ", undergraduates=" + undergraduates +
                ", postgraduates=" + postgraduates +
                ", research='" + research + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
