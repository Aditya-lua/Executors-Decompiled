package p109en;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;

/* JADX INFO: renamed from: en.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31665d2 = {"Landroid/app/Dialog;", "Landroid/view/View;", "b", "(Landroid/app/Dialog;)Landroid/view/View;", "decorView", "wf1-container-android"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C5170g {
    /* JADX INFO: renamed from: b */
    public static final View m24042b(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window == null) {
            return null;
        }
        return window.getDecorView();
    }
}
