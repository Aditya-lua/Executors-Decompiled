package j9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes.dex */
public class k extends e4.k {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Dialog f21203v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f21204w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Dialog f21205x0;

    @NonNull
    public static k u2(@NonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        k kVar = new k();
        Dialog dialog2 = (Dialog) n9.m.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        kVar.f21203v0 = dialog2;
        if (onCancelListener != null) {
            kVar.f21204w0 = onCancelListener;
        }
        return kVar;
    }

    @Override // e4.k
    @NonNull
    public Dialog k2(Bundle bundle) {
        Dialog dialog = this.f21203v0;
        if (dialog != null) {
            return dialog;
        }
        q2(false);
        if (this.f21205x0 == null) {
            this.f21205x0 = new AlertDialog.Builder((Context) n9.m.l(x())).create();
        }
        return this.f21205x0;
    }

    @Override // e4.k, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f21204w0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // e4.k
    public void t2(@NonNull FragmentManager fragmentManager, String str) {
        super.t2(fragmentManager, str);
    }
}
