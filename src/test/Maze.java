package test;

import org.eclipse.wb.swt.widgets.Display;
import org.eclipse.wb.swt.widgets.Label;
import org.eclipse.wb.swt.widgets.Shell;
//Just adding some code to test committing through eclipse
import org.eclipse.wb.swt.events.MouseEvent;
import org.eclipse.wb.swt.events.MouseAdapter;
import org.eclipse.wb.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;

public class Maze {

	protected Shell shell;
	int height;
	int width;
	int matrixSize = 6;
	int index = 0;
	final Label[] wallw = new Label[36];
	final Label[] wallh = new Label[36];

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Maze window = new Maze();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(600, 800);
		shell.setText("SWT Application");
		shell.setLayout(null);
		height = 4;
		width = 4;
		//Dimension wallDim = new Dimension(150,20);
		
		for(int k = 0; k < matrixSize; k++)
		{
			for(int i = 0; i < matrixSize; i++)
			{
				index = i + matrixSize * k;
				//System.out.println(index);
				wallw[index]=new Label(shell, SWT.None);
				wallw[index].setText(Integer.toString(index));
				//set Colors
				wallw[index].setBackground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
				wallw[index].setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
				//set Locations
				wallw[index].setBounds(150*k, 150*i, 150, 15);
				wallw[index].addMouseListener(new MouseAdapter() {
					@Override
					public void mouseDown(MouseEvent e)
					{
						String mouseE = e.toString();
						System.out.println(mouseE);
						String[] info = mouseE.split(" ");
						System.out.println(info[1]);
						String deta[] = info[1].split("\\{");
						String deta1[] = deta[1].split("\\}");
						System.out.println("deta = "+ deta[1]);
						System.out.println("deta1 = "+ deta1[0]);
						int newIndex = Integer.parseInt(deta1[0]);
					
						
						System.out.println("in wallw, index = " + index);
						System.out.println("before if wallw");
						if(wallw[newIndex].getBackground().equals(SWTResourceManager.getColor(SWT.COLOR_BLACK)))
						{	
							System.out.println("in if wallw");
							wallw[newIndex].setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_MAGENTA));
						}
						else
						{
							System.out.println("in else wallw");
							wallw[newIndex].setBackground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
						}
					}
				});//addMouseListener
			}//for-i
		}//for-k
		for(int k = 0; k < matrixSize; k++)
		{
			for(int i = 0; i < matrixSize; i++)
			{
				index = i + matrixSize*k;
				wallh[index] = new Label(shell, SWT.None);
				wallh[index].setText(Integer.toString(index));
				wallh[index].setBackground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
				wallh[index].setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
				wallh[index].setBounds(150*k, 150*i, 20, 150);
				wallh[index].addMouseListener(new MouseAdapter() {
					@Override
					public void mouseDown(MouseEvent e)
					{
						String mouseE = e.toString();
						System.out.println(mouseE);
						String[] info = mouseE.split(" ");
						System.out.println(info[1]);
						String deta[] = info[1].split("\\{");
						String deta1[] = deta[1].split("\\}");
						System.out.println("deta = "+ deta[1]);
						System.out.println("deta1 = "+ deta1[0]);
						int newIndex = Integer.parseInt(deta1[0]);
					
						
						System.out.println("in wallw, index = " + index);
						System.out.println("before if wallw");
						if(wallh[newIndex].getBackground().equals(SWTResourceManager.getColor(SWT.COLOR_BLACK)))
						{	
							System.out.println("in if wallw");
							wallh[newIndex].setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_MAGENTA));
						}
						else
						{
							System.out.println("in else wallw");
							wallh[newIndex].setBackground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
						}
					}
				});//addMouseListener
				
			}//for i
		}//for k
	}
}
