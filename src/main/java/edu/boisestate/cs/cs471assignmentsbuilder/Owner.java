package edu.boisestate.cs.cs471assignmentsbuilder;

public class Owner
{
    private int id;
    private String login;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    @Override
    public String toString()
    {
        return "Owner{" +
                "id=" + id +
                ", login='" + login + '\'' +
                '}';
    }
}
