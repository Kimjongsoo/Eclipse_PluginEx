package plugin_test.handlers;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class UI extends Dialog{
	
	protected Object result;
	protected Shell shell;


	public UI(Shell parent, int style) {
		super(parent, style);
		setText("text용 swt plugin");
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
		
		Text title;
		Button btnGo;
		Button btnReset;
		Button btnSearch;
		Button btnDBquery;

		shell = new Shell(getParent(), SWT.DIALOG_TRIM|SWT.RESIZE);
		shell.setSize(750,600);
		org.eclipse.swt.graphics.Rectangle screenSize = shell.getDisplay().getPrimaryMonitor().getBounds();
		shell.setLocation((screenSize.width - shell.getBounds().width) /2,
				(screenSize.height -shell.getBounds().height) /2);
		shell.setText(getText());
		
		title = new Text(shell, SWT.BORDER);
		title.setBounds(50, 19, 400, 25);
		title.setText("단순 조회 자바 소스 GENERATOR");
		title.setBackground(title.getDisplay().getSystemColor(SWT.COLOR_YELLOW));
		Font font = new Font(title.getDisplay(), new FontData("굴림체", 14, SWT.NORMAL));
		title.setFont(font);
		title.setEditable(false);
		
		btnGo = new Button(shell, SWT.NONE);
		btnGo.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		
		btnGo.setBounds(530, 19, 76, 25);
		btnGo.setText("실행");
		
		btnReset = new Button(shell, SWT.NONE);
		btnReset.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnReset.setBounds(620, 19, 85, 25);
		btnReset.setText("초기화");
	}

}
