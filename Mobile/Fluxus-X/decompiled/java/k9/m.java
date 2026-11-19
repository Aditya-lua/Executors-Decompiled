package k9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class m extends f4.o {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Dialog f21272v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f21273w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Dialog f21274x0;

    @NonNull
    public static m u2(@NonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        m mVar = new m();
        Dialog dialog2 = (Dialog) o9.s.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        mVar.f21272v0 = dialog2;
        if (onCancelListener != null) {
            mVar.f21273w0 = onCancelListener;
        }
        return mVar;
    }

    @Override // f4.o
    @NonNull
    public Dialog k2(Bundle bundle) {
        Dialog dialog = this.f21272v0;
        if (dialog != null) {
            return dialog;
        }
        q2(false);
        if (this.f21274x0 == null) {
            this.f21274x0 = new AlertDialog.Builder((Context) o9.s.l(v())).create();
        }
        return this.f21274x0;
    }

    @Override // f4.o, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f21273w0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // f4.o
    public void t2(@NonNull f4.k0 k0Var, String str) {
        super.t2(k0Var, str);
    }
}
