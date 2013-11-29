package edu.Unitec.Classparticipation;

/**
 * Created by Henry on 11-28-13.
 */
public class Student {

    private int _StudentId;
    private String _StudentName;
    private String _StudentMajor;

    public Student(){}

    public Student(int _StudentId, String _StudentName, String _StudentMajor)
    {
        super();
        this._StudentId = _StudentId;
        this._StudentName = _StudentName;
        this._StudentMajor = _StudentMajor;
    }
    public Student(int _StudentId, String _StudentName)
    {
        super();
        this._StudentId = _StudentId;
        this._StudentName = _StudentName;
        this._StudentMajor = "I-1";
    }
    public int get_StudentId()
    {
        return _StudentId;
    }
    public void set_StudentId(int _StudentId)
    {
        this._StudentId = _StudentId;
    }
    public String get_StudentName()
    {
        return _StudentName;
    }
    public void set_StudentName(String _StudentName)
    {
        this._StudentName = _StudentName;
    }
    public String get_StudentMajor()
    {
        return _StudentMajor;
    }
    public void set_StudentMajor(String _StudentMajor)
    {
        this._StudentMajor = _StudentMajor;
    }
}
