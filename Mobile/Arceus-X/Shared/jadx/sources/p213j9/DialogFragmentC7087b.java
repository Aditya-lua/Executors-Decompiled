package p213j9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import p305n9.C8953m;

/* JADX INFO: renamed from: j9.b */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC7087b extends DialogFragment {

    /* JADX INFO: renamed from: a */
    public Dialog f27685a;

    /* JADX INFO: renamed from: b */
    public DialogInterface.OnCancelListener f27686b;

    /* JADX INFO: renamed from: c */
    public Dialog f27687c;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static DialogFragmentC7087b m29848a(@NonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC7087b dialogFragmentC7087b = new DialogFragmentC7087b();
        Dialog dialog2 = (Dialog) C8953m.m36048m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC7087b.f27685a = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC7087b.f27686b = onCancelListener;
        }
        return dialogFragmentC7087b;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f27686b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f27685a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f27687c == null) {
            this.f27687c = new AlertDialog.Builder((Context) C8953m.m36047l(getActivity())).create();
        }
        return this.f27687c;
    }

    @Override // android.app.DialogFragment
    public void show(@NonNull FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
