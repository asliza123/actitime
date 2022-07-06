package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLibClass;
import com.actitime.pom.EnteryTimeTrackPage;
import com.actitime.pom.TasklistPage;
@Listeners(com.actitime.generic.ListenerImplimentations.class)
public class CustomerModule extends BaseClass{
	@Test
	public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("CreateCustomer",true);
		EnteryTimeTrackPage e=new EnteryTimeTrackPage(driver);
		e.setTaskBtn();
		TasklistPage t=new TasklistPage(driver);
		t.getAddnewbtn().click();
		t.getNewcustbtn().click();
		FileLibClass f=new FileLibClass();
		String cn = f.getExcelData("createcustomer", 1, 2);
		String cd = f.getExcelData("createcustomer", 1, 3);
		t.getCustnametbx().sendKeys(cn);
		t.getCustdesctbx().sendKeys(cd);
		t.getSelectcustdd().click();
		t.getOurcompoptn().click();
		t.getCrtcustbtn().click();
		Thread.sleep(3000);
		String title = t.getTitleofcust().getText();
		Assert.assertEquals(title,cn);
	}
}
