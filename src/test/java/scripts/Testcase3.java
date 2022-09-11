package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericlibrary.BaseClass;
import pomPages.CorejavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass {
@Test
public void tc3() throws IOException {
SkillraryLoginPage s=new SkillraryLoginPage(driver);
s.searchTextbox(pdata.getPropertydata("coursedata"));
s.gobutton();
CorejavaPage c=new CorejavaPage(driver);
c.seleniumtraining();
WishlistPage w=new WishlistPage(driver);
utilities.switchframe(driver);
w.playbutton();
w.pausebutton();
utilities.switchbackfromframe(driver);
w.addtowishlistbtn();
}
}









