package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  
		           features="src/test/resources/CompanySetup/Targets.feature", 
                   tags= "@All",  
                   glue= {"cucumberMap1CompanySetup","MyHooks"}, 
                   monochrome=true, 
                   plugin= "pretty",     				   
                   dryRun=false 
                   
                 )

public class RunnerTest extends AbstractTestNGCucumberTests
{  

}

//         feature                               |      glue                        |tags
//1)    Login                                    |  cucumberMap                     |@All
//2)    CompanySetup/Targets                     |  cucumberMap1CompanySetup        |@All
//3)    AllotBundles                             |  cucumberMap1CompanySetup        |@All
//4)    Annoucements                             |  cucumberMap1CompanySetup        |@All
//5)    WithholdingTax                           |  cucumberMap1CompanySetup        |@All
//6)    BankAccounts                             |  cucumberMap1CompanySetup        |@All
//7)    USSDMMenu                                |  cucumberMap1CompanySetup        |@All
//8)    CompanyMaintenance/IPBlock               |  cucumber2CompanyMaintenance     |@All
//9)    BranchMaintenance                        |  cucumber2CompanyMaintenance     |@All
//10)   RegionMaintenance                        |  cucumber2CompanyMaintenance     |@All
//11)   ZoneMaintenance                          |  cucumber2CompanyMaintenance     |@All
//12)   Company Profile                          |  cucumber2CompanyMaintenance     |@All
//13)   ProductDefinition/ProductManagement      |  cucumber3ProductDefinition

//Defects
//1)allot bundles -display ,edit, delete icons not properly align
//2)branchMaintenance 2005-Please select proper manager, 2007-Branch limit has been reached. Kindly contact Smart Policy to create new branches.,