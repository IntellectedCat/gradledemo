package groovy

public class ProjectVersion {
    private int major;
    private int minor

    public ProjectVersion(int major, int minor) {
        this.major = major
        this.minor = minor;
    }
    public int getMajor() {
        major;
//        return major;
    }
    public void setMajor(int major) {
        this.major = major;
    }
//    public int getMinor() {
//        return minor;
//    }
//
//    public void setMinor(int minor) {
//        this.minor = minor;
//    }
}

ProjectVersion v1 = new ProjectVersion(1, 2)
println(v1.minor)

ProjectVersion v2 = null

println(v2 == v1)