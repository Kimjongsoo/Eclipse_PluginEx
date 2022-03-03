package plugin_test.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SampleHandler extends AbstractHandler {
	/**
	 * The constructor.
	 */
	public SampleHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(
				window.getShell(),
				"Plugin_test",
				"Hello, Eclipse world");
		
		UI dialog = new UI(window.getShell(),SWT.DIALOG_TRIM);
		dialog.open();
		
//			String text = "Window Text";
//			String btntext = "Button Text";
//			String welcomtext = "Hello World";
//
//			Display display = new Display();
//	        Shell shell = window.getShell();
//	        shell.setText(text);
//	        //shell.setLayout(new Layout());
//	        shell.setLayout(new FillLayout());
//
//	        // 버튼 생성
//	        Button button1 = new Button(shell, 0);
//	        button1.setBounds(10, 10, 150, 30);
//	        button1.setText(btntext);
//
//	        // 텍스트박스 생성
//	        Text textBox1 = new Text(shell, 2626);
//	        String font = "굴림";
//	        textBox1.setLayoutData(new GridData(1808));
//	        textBox1.setFont(new Font(display, font, 20, 0));
//	        textBox1.setText(welcomtext);
//	        textBox1.setFocus();
//
//	        // 레이블 생성
//	        Label label1 = new Label(shell, 0);
//	        label1.setBounds(200, 10, 150, 30);
//	        label1.setText(welcomtext);
//
//	        shell.open();
//	        while (!shell.isDisposed()) {
//	            if (!display.readAndDispatch()) {
//	                display.sleep();
//	            }
//	        }
//	        display.dispose();
	    
		
		
		return null;
	}
}
