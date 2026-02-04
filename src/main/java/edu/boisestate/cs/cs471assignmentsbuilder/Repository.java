package edu.boisestate.cs.cs471assignmentsbuilder;

public class Repository
{
    private int id;
    private String fullName;
    private Owner owner;

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Owner getOwner()
    {
        return owner;
    }

    public void setOwner(Owner owner)
    {
        this.owner = owner;
    }

    @Override
    public String toString()
    {
        return "Repository{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", owner=" + owner +
                '}';
    }
}
