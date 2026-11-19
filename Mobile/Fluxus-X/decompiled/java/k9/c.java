package k9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class c extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Dialog f21223a;
    public DialogInterface.OnCancelListener b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Dialog f21224c;

    @NonNull
    public static c a(@NonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        c cVar = new c();
        Dialog dialog2 = (Dialog) o9.s.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        cVar.f21223a = dialog2;
        if (onCancelListener != null) {
            cVar.b = onCancelListener;
        }
        return cVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f21223a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f21224c == null) {
            this.f21224c = new AlertDialog.Builder((Context) o9.s.l(getActivity())).create();
        }
        return this.f21224c;
    }

    @Override // android.app.DialogFragment
    public void show(@NonNull FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
