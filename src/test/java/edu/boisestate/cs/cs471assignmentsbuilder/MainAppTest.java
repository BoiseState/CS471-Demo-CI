package edu.boisestate.cs.cs471assignmentsbuilder;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MainAppTest
{
    @Test
    public void parseAndLoadRepositoryDataFromJSON_concreteFieldsFromSampleFile() throws Exception
    {
        RepositoryData data = MainApp.parseAndLoadRepositoryDataFromJSON("src/main/resources/SampleRepositoryData.json");
        assertNotNull(data);

        // repository assertions
        Repository repository = data.getRepository();
        assertNotNull(repository);
        assertEquals(555, repository.getId());
        assertNotNull(repository.getOwner());
        assertEquals("BoiseState", repository.getOwner().getLogin());

        // issues assertions
        List<Issue> issues = data.getListOfIssues();
        assertNotNull(issues);
        assertEquals(3, issues.size());
        assertEquals(10, issues.get(0).getId());
        assertEquals("Sample bug", issues.get(1).getTitle());
        assertFalse(issues.get(2).isOpen());
    }

    @Test(expected = FileNotFoundException.class)
    public void parseAndLoadRepositoryDataFromJSON_missingFile_throwsFileNotFoundException() throws Exception
    {
        MainApp.parseAndLoadRepositoryDataFromJSON("non-existent-file.json");
    }
}
