## 第一步创建 弹窗工具类 ##

    DialogUtil dialogUtil = new DialogUtil(this);

## 第二步设置 弹窗的布局文件##

	顶部弹窗
    View view =  View view = DialogUtil.getInstance(this).showTopDialog(R.layout.dialog);		
	showTopDialogPadding(int layout,int padding,int margin)

	中间弹窗
    showMiddleDialog(R.layout.dialog);
	showMiddleDialogPadding(int layout,int padding,int margin)

	底部弹窗
    showBottomDialog(R.layout.dialog);
	showBottoDialogPadding(int layout,int padding,int margin)


## 第三步设置 关闭弹窗 ##	

	顶部弹窗
    dialogUtil.closeTopDialog();
	closeTopDialogPadding();

	中间弹窗
    dialogUtil.closemiddleDialog();
	closeMiddleDialogPadding();

	底部弹窗
    dialogUtil.closeBottomDialog();
	dialogUtil.closeTopDialogPadding();  

	

