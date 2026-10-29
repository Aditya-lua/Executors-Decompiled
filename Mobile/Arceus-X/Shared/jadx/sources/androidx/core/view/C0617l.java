package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.core.view.l */
/* JADX INFO: loaded from: classes.dex */
public class C0617l {

    /* JADX INFO: renamed from: a */
    public static boolean f2435a;

    /* JADX INFO: renamed from: b */
    public static Method f2436b;

    /* JADX INFO: renamed from: c */
    public static boolean f2437c;

    /* JADX INFO: renamed from: d */
    public static Field f2438d;

    /* JADX INFO: renamed from: androidx.core.view.l$a */
    public interface a {
        /* JADX INFO: renamed from: D */
        boolean mo2939D(KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2933a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f2435a) {
            try {
                f2436b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f2435a = true;
        }
        Method method = f2436b;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(actionBar, keyEvent);
                if (objInvoke == null) {
                    return false;
                }
                return ((Boolean) objInvoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2934b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m2933a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0625o0.m3029h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2935c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListenerM2938f = m2938f(dialog);
        if (onKeyListenerM2938f != null && onKeyListenerM2938f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C0625o0.m3029h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2936d(View view, KeyEvent keyEvent) {
        return C0625o0.m3031i(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: e */
    public static boolean m2937e(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.mo2939D(keyEvent);
        }
        if (callback instanceof Activity) {
            return m2934b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m2935c((Dialog) callback, keyEvent);
        }
        return (view != null && C0625o0.m3029h(view, keyEvent)) || aVar.mo2939D(keyEvent);
    }

    /* JADX INFO: renamed from: f */
    public static DialogInterface.OnKeyListener m2938f(Dialog dialog) {
        if (!f2437c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f2438d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2437c = true;
        }
        Field field = f2438d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
