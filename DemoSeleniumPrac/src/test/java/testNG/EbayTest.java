package testNG;

import org.testng.annotations.Test;

import EbayPages.HomePage;
import commonpkg.utilities;

public class EbayTest extends utilities {
  @Test
  public void f() {
	  HomePage home = new HomePage(driver);
	  home.SreachIcon();
	  home.SreachButton();
  }
}
