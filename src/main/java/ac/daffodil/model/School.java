package ac.daffodil.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "school_id")
    private Long schoolId;

    @Column(name = "school_name")
    private String schoolName;

    @Column(name = "status")
    private String status;

    @Column(name = "location")
    private String location;

    @Column(name = "total_student")
    private int totalStudent;

    @Column(name = "avarage_cost")
    private int avarageCost;

    @Column(name = "short_note" , columnDefinition = "TEXT")
    private String shortNote;

    @Column(name = "about" , columnDefinition = "TEXT")
    private String about;

    @Column(name = "academic_staff")
    private int academicStaff;

    @Column(name = "administrative_staff")
    private int administrativeStaff;

    @Column(name = "result")
    private String result;

    @Column(name = "boarding_facility")
    private boolean boardingFacility;

    @Column(name = "establishedi_in")
    private int establishedIn;

    @Column(name = "study_group")
    private String studyGroup;

    @Column(name = "cost_of_group")
    private int costofGroup;

    @Column(name = "extra_curricular_activities")
    private String exatraCurricularActivities;

    @Column(name = "reknowned_alumni")
    private int reknownedAlumni;

    @Column(name = "addmissionStartDate")
    private Date addmissionStartDate;

    @Column(name = "addmissionENDDate")
    private Date addmissionEndDate;


    public School() {
    }

    public School(String schoolName, String status, String location, int totalStudent, int avarageCost, String shortNote, String about, int academicStaff, int administrativeStaff, String result, boolean boardingFacility, int establishedIn, String studyGroup, int costofGroup, String exatraCurricularActivities, int reknownedAlumni, Date addmissionStartDate, Date addmissionEndDate) {
        this.schoolName = schoolName;
        this.status = status;
        this.location = location;
        this.totalStudent = totalStudent;
        this.avarageCost = avarageCost;
        this.shortNote = shortNote;
        this.about = about;
        this.academicStaff = academicStaff;
        this.administrativeStaff = administrativeStaff;
        this.result = result;
        this.boardingFacility = boardingFacility;
        this.establishedIn = establishedIn;
        this.studyGroup = studyGroup;
        this.costofGroup = costofGroup;
        this.exatraCurricularActivities = exatraCurricularActivities;
        this.reknownedAlumni = reknownedAlumni;
        this.addmissionStartDate = addmissionStartDate;
        this.addmissionEndDate = addmissionEndDate;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
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

    public int getTotalStudent() {
        return totalStudent;
    }

    public void setTotalStudent(int totalStudent) {
        this.totalStudent = totalStudent;
    }

    public int getAvarageCost() {
        return avarageCost;
    }

    public void setAvarageCost(int avarageCost) {
        this.avarageCost = avarageCost;
    }

    public String getShortNote() {
        return shortNote;
    }

    public void setShortNote(String shortNote) {
        this.shortNote = shortNote;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getAcademicStaff() {
        return academicStaff;
    }

    public void setAcademicStaff(int academicStaff) {
        this.academicStaff = academicStaff;
    }

    public int getAdministrativeStaff() {
        return administrativeStaff;
    }

    public void setAdministrativeStaff(int administrativeStaff) {
        this.administrativeStaff = administrativeStaff;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isBoardingFacility() {
        return boardingFacility;
    }

    public void setBoardingFacility(boolean boardingFacility) {
        this.boardingFacility = boardingFacility;
    }

    public int getEstablishedIn() {
        return establishedIn;
    }

    public void setEstablishedIn(int establishedIn) {
        this.establishedIn = establishedIn;
    }

    public String getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(String studyGroup) {
        this.studyGroup = studyGroup;
    }

    public int getCostofGroup() {
        return costofGroup;
    }

    public void setCostofGroup(int costofGroup) {
        this.costofGroup = costofGroup;
    }

    public String getExatraCurricularActivities() {
        return exatraCurricularActivities;
    }

    public void setExatraCurricularActivities(String exatraCurricularActivities) {
        this.exatraCurricularActivities = exatraCurricularActivities;
    }

    public int getReknownedAlumni() {
        return reknownedAlumni;
    }

    public void setReknownedAlumni(int reknownedAlumni) {
        this.reknownedAlumni = reknownedAlumni;
    }

    public Date getAddmissionStartDate() {
        return addmissionStartDate;
    }

    public void setAddmissionStartDate(Date addmissionStartDate) {
        this.addmissionStartDate = addmissionStartDate;
    }

    public Date getAddmissionEndDate() {
        return addmissionEndDate;
    }

    public void setAddmissionEndDate(Date addmissionEndDate) {
        this.addmissionEndDate = addmissionEndDate;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolId=" + schoolId +
                ", schoolName='" + schoolName + '\'' +
                ", status='" + status + '\'' +
                ", location='" + location + '\'' +
                ", totalStudent=" + totalStudent +
                ", avarageCost=" + avarageCost +
                ", shortNote='" + shortNote + '\'' +
                ", about='" + about + '\'' +
                ", academicStaff=" + academicStaff +
                ", administrativeStaff=" + administrativeStaff +
                ", result='" + result + '\'' +
                ", boardingFacility=" + boardingFacility +
                ", establishedIn=" + establishedIn +
                ", studyGroup='" + studyGroup + '\'' +
                ", costofGroup=" + costofGroup +
                ", exatraCurricularActivities='" + exatraCurricularActivities + '\'' +
                ", reknownedAlumni=" + reknownedAlumni +
                ", addmissionStartDate=" + addmissionStartDate +
                ", addmissionEndDate=" + addmissionEndDate +
                '}';
    }
}


