package top.letuszou.dialoglibrary.view;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import top.letuszou.dialoglibrary.R;

/**
 * 弹窗工具类
 */

public class DialogUtil {

    private DisplayMetrics dm;
    private Context context;
    private Dialog topDialog;
    private Dialog middleDialog;
    private Dialog bottomDialog;
    private Dialog middleDialogPadding;
    private Dialog topDialogPadding;
    private Dialog bottomDialogPadding;

    static DialogUtil instance = null;

    public static DialogUtil getInstance(Context context) {
        if (instance == null) {
            createInstance(context);
        }
        return instance;
    }

    private synchronized static DialogUtil createInstance(Context context) {
        if (instance == null) {
            instance = new DialogUtil(context);
        }
        return instance;
    }

    private DialogUtil(Context context) {
        this.context = context;
        dm = context.getResources().getDisplayMetrics();
    }


    public View showTopDialog(@LayoutRes int resource) {

        View viewTop = LayoutInflater.from(context).inflate(resource, null);
        topDialog = new Dialog(context, R.style.dialog_style);
        topDialog.setContentView(viewTop, new ViewGroup.LayoutParams(LinearLayoutCompat.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        Window window = topDialog.getWindow();
        // 为dialog设置动画
        window.setWindowAnimations(R.style.dialog_animation_top);
        WindowManager.LayoutParams wl = window.getAttributes();
        //Dialog的初始位置
        wl.x = 0;
        wl.y = -dm.heightPixels;
        // 设置Dialog应该占的空间参数
        wl.width = ViewGroup.LayoutParams.MATCH_PARENT;
        wl.height = ViewGroup.LayoutParams.WRAP_CONTENT;

        // 把参数设置到Dialog里
        topDialog.onWindowAttributesChanged(wl);
        // 设置点击空白处消失
        topDialog.setCanceledOnTouchOutside(true);
        // 展示Dialog
        topDialog.show();
        return viewTop;
    }


    public void closeTopDialog() {
        if (topDialog != null) {
            if (topDialog.isShowing()) {
                topDialog.dismiss();
            }
        }
    }


    public View showMiddleDialog(@LayoutRes int resource) {
        View viewMiddle = LayoutInflater.from(context).inflate(resource, null);
        middleDialog = new Dialog(context, R.style.dialog_style);
        middleDialog.setContentView(viewMiddle, new ViewGroup.LayoutParams(LinearLayoutCompat.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        Window window = middleDialog.getWindow();
        WindowManager.LayoutParams wl = window.getAttributes();
//         设置Dialog应该占的空间参数
        wl.width = ViewGroup.LayoutParams.MATCH_PARENT;
        wl.height = ViewGroup.LayoutParams.WRAP_CONTENT;
//         把参数设置到Dialog里
        middleDialog.onWindowAttributesChanged(wl);
        // 设置点击空白处消失
        middleDialog.setCanceledOnTouchOutside(true);
        // 展示Dialog
        middleDialog.show();
        return viewMiddle;
    }


    public void closeMiddleDialog() {
        if (middleDialog != null) {
            if (middleDialog.isShowing()) {
                middleDialog.dismiss();
            }
        }
    }


    public View showBottomDialog(@LayoutRes int resource) {
        View viewBottom = LayoutInflater.from(context).inflate(resource, null);
        bottomDialog = new Dialog(context, R.style.dialog_style);
        bottomDialog.setContentView(viewBottom, new ViewGroup.LayoutParams(LinearLayoutCompat.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        Window window = bottomDialog.getWindow();
        // 为dialog设置动画
        window.setWindowAnimations(R.style.dialog_animation_bottom);
        WindowManager.LayoutParams wl = window.getAttributes();
        //Dialog的初始位置
        wl.x = 0;
        wl.y = dm.heightPixels;
        // 设置Dialog应该占的空间参数
        wl.width = ViewGroup.LayoutParams.MATCH_PARENT;
        wl.height = ViewGroup.LayoutParams.WRAP_CONTENT;

        // 把参数设置到Dialog里
        bottomDialog.onWindowAttributesChanged(wl);
        // 设置点击空白处消失
        bottomDialog.setCanceledOnTouchOutside(true);
        // 展示Dialog
        bottomDialog.show();
        return viewBottom;
    }


    public void closeBottomDialog() {
        if (bottomDialog != null) {
            if (bottomDialog.isShowing()) {
                bottomDialog.dismiss();
            }
        }
    }


    public View showTopDialogPadding(@LayoutRes int resource, int margin, int padding) {

        View viewTopPadding = LayoutInflater.from(context).inflate(resource, null);
        topDialogPadding = new Dialog(context, R.style.dialog_style);
        topDialogPadding.setContentView(viewTopPadding, new ViewGroup.LayoutParams(LinearLayoutCompat.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        Window window = topDialogPadding.getWindow();
        window.getDecorView().setPadding(padding, 0, padding, 0);
        // 为dialog设置动画
        window.setWindowAnimations(R.style.dialog_animation_top);
        WindowManager.LayoutParams wl = window.getAttributes();
        //Dialog的初始位置
        wl.x = 0;
        wl.y = -dm.heightPixels;
        // 设置Dialog应该占的空间参数
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        int windowWidth = wm.getDefaultDisplay().getWidth();
        wl.width = windowWidth - margin;
        wl.height = ViewGroup.LayoutParams.WRAP_CONTENT;
//         把参数设置到Dialog里
        topDialogPadding.onWindowAttributesChanged(wl);
        // 设置点击空白处消失
        topDialogPadding.setCanceledOnTouchOutside(true);
        // 展示Dialog
        topDialogPadding.show();

        return viewTopPadding;

    }

    public void closeTopDialogPadding() {
        if (topDialogPadding != null) {
            if (topDialogPadding.isShowing()) {
                topDialogPadding.dismiss();
            }
        }
    }


    public View showMiddleDialogPadding(@LayoutRes int resource, int margin, int padding) {

        View viewMiddlePadding = LayoutInflater.from(context).inflate(resource, null);
        middleDialogPadding = new Dialog(context, R.style.dialog_style);
        middleDialogPadding.setContentView(viewMiddlePadding, new ViewGroup.LayoutParams(LinearLayoutCompat.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        Window window = middleDialogPadding.getWindow();
        window.getDecorView().setPadding(padding, 0, padding, 0);
        WindowManager.LayoutParams wl = window.getAttributes();
//         设置Dialog应该占的空间参数
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        int windowWidth = wm.getDefaultDisplay().getWidth();
        wl.width = windowWidth - margin;
        wl.height = ViewGroup.LayoutParams.WRAP_CONTENT;
//         把参数设置到Dialog里
        middleDialogPadding.onWindowAttributesChanged(wl);
        // 设置点击空白处消失
        middleDialogPadding.setCanceledOnTouchOutside(true);
        // 展示Dialog
        middleDialogPadding.show();

        return viewMiddlePadding;

    }

    public void closeMiddleDialogPadding() {
        if (middleDialogPadding != null) {
            if (middleDialogPadding.isShowing()) {
                middleDialogPadding.dismiss();
            }
        }
    }


    public View showBottomDialogPadding(@LayoutRes int resource, int margin, int padding) {
        View viewMiddlePadding = LayoutInflater.from(context).inflate(resource, null);
        bottomDialogPadding = new Dialog(context, R.style.dialog_style);
        bottomDialogPadding.setContentView(viewMiddlePadding, new ViewGroup.LayoutParams(LinearLayoutCompat.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        Window window = bottomDialogPadding.getWindow();
        window.getDecorView().setPadding(padding, 0, padding, 0);
        WindowManager.LayoutParams wl = window.getAttributes();
        //Dialog的初始位置
        wl.x = 0;
        wl.y = dm.heightPixels;
        // 设置Dialog应该占的空间参数
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        int windowWidth = wm.getDefaultDisplay().getWidth();
        wl.width = windowWidth - margin;
        wl.height = ViewGroup.LayoutParams.WRAP_CONTENT;
//         把参数设置到Dialog里
        bottomDialogPadding.onWindowAttributesChanged(wl);
        // 设置点击空白处消失
        bottomDialogPadding.setCanceledOnTouchOutside(true);
        // 展示Dialog
        bottomDialogPadding.show();

        return viewMiddlePadding;

    }

    public void closeBottomDialogPadding() {
        if (bottomDialogPadding != null) {
            if (bottomDialogPadding.isShowing()) {
                bottomDialogPadding.dismiss();
            }
        }
    }


}
