package en;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/app/Dialog;", "Landroid/view/View;", "b", "(Landroid/app/Dialog;)Landroid/view/View;", "decorView", "wf1-container-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class g {
    public static final View b(Dialog dialog) {
        Window window = dialog.getWindow();
        if (window == null) {
            return null;
        }
        return window.getDecorView();
    }
}
