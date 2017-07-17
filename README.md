## 第一步创建 弹窗工具类 ##

    DialogUtil dialogUtil = new DialogUtil(this);

## 第二步设置 弹窗的布局文件##

	顶部弹窗
    View view = dialogUtil.showTopDialog(R.layout.dialog);		
	
	中间弹窗
    View view = dialogUtil.showMiddleDialog(R.layout.dialog);

	底部弹窗
    View view = dialogUtil.showBottomDialog(R.layout.dialog);
	


## 第三步设置 关闭弹窗 ##	

	顶部弹窗
    dialogUtil.closeTopDialog();

	中间弹窗
    dialogUtil.closemiddleDialog();

	底部弹窗
    dialogUtil.closeBottomDialog();  

	

