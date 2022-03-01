package plugin_test.handlers;

import java.awt.Dialog;

import javax.inject.Named;
import javax.swing.JButton;
import javax.swing.JDialog;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;

/** <b>Warning</b> : 
  As explained in <a href="http://wiki.eclipse.org/Eclipse4/RCP/FAQ#Why_aren.27t_my_handler_fields_being_re-injected.3F">this wiki page</a>, it is not recommended to define @Inject fields in a handler. <br/><br/>
  <b>Inject the values in the @Execute methods</b>
*/
public class HelloWorldHandler {
	
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell s) {
		
		//MessageDialog.openInformation(s, "E4 Information Dialog", "Hello world from a pure Eclipse 4 plug-in");
		Dialog dialog = new JDialog();
		dialog.setTitle("나의 다이얼로그");
		dialog.add(new JButton("click!"));
		dialog.setSize(300,300);
		dialog.setVisible(true);
		

	}


}
