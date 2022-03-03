package plugin_test.handlers;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class UI extends Dialog{
	
	protected Object result;
	protected Shell shell;


	public UI(Shell parent, int style) {
		super(parent, style);
		setText("text¿ë swt plugin");
		// TODO Auto-generated constructor stub
	}

	public Object open() {
		// TODO Auto-generated method stub
		createContents();
		shell.open();
		shell.layout();
		Display display = getParent().getDisplay();
		while (!shell.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		return result;
	}

	private void createContents() {
		// TODO Auto-generated method stub
		shell = new Shell(getParent(), SWT.DIALOG_TRIM|SWT.RESIZE);
		shell.setSize(660,390);
		org.eclipse.swt.graphics.Rectangle screenSize = shell.getDisplay().getPrimaryMonitor().getBounds();
		shell.setLocation((screenSize.width - shell.getBounds().width) /2,
				(screenSize.height -shell.getBounds().height) /2);
		shell.setText(getText());
		Button btnNewButton = new Button(shell, SWT.NONE);
		
	}

}
