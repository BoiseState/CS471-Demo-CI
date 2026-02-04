package edu.boisestate.cs.cs471assignmentsbuilder;

import java.util.List;

/**
 * The data is loaded from the json file
 */
class RepositoryData
{
    public String keyThatIsNotInTheJSONFileWillBeIgnoredByGson;

    public Repository repository;

    public List<Issue> listOfIssues;

    public String getKeyThatIsNotInTheJSONFileWillBeIgnoredByGson()
    {
        return keyThatIsNotInTheJSONFileWillBeIgnoredByGson;
    }

    public void setKeyThatIsNotInTheJSONFileWillBeIgnoredByGson(String keyThatIsNotInTheJSONFileWillBeIgnoredByGson)
    {
        this.keyThatIsNotInTheJSONFileWillBeIgnoredByGson = keyThatIsNotInTheJSONFileWillBeIgnoredByGson;
    }

    public List<Issue> getListOfIssues()
    {
        return listOfIssues;
    }

    public void setListOfIssues(List<Issue> listOfIssues)
    {
        this.listOfIssues = listOfIssues;
    }

    public Repository getRepository()
    {
        return repository;
    }

    public void setRepository(Repository repository)
    {
        this.repository = repository;
    }

    @Override
    public String toString()
    {
        String buf = "=== Repository data loaded from json - Start ===\n";
        buf += "keyThatIsNotInTheJSONFileWillBeIgnoredByGson: " + keyThatIsNotInTheJSONFileWillBeIgnoredByGson + "\n\n";

        buf += "Repository: " + repository + "\n\n";

        for (Issue issue : listOfIssues)
        {
            buf += "----------\n";
            buf += issue + "\n\n";
        }

        buf += "=== Repository data loaded from json - End ===";
        return buf;
    }

}
