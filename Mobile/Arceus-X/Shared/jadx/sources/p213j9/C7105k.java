package p213j9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import p093e4.DialogInterfaceOnCancelListenerC4819k;
import p305n9.C8953m;

/* JADX INFO: renamed from: j9.k */
/* JADX INFO: loaded from: classes.dex */
public class C7105k extends DialogInterfaceOnCancelListenerC4819k {

    /* JADX INFO: renamed from: v0 */
    public Dialog f27730v0;

    /* JADX INFO: renamed from: w0 */
    public DialogInterface.OnCancelListener f27731w0;

    /* JADX INFO: renamed from: x0 */
    public Dialog f27732x0;

    @NonNull
    /* JADX INFO: renamed from: u2 */
    public static C7105k m29912u2(@NonNull Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C7105k c7105k = new C7105k();
        Dialog dialog2 = (Dialog) C8953m.m36048m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        c7105k.f27730v0 = dialog2;
        if (onCancelListener != null) {
            c7105k.f27731w0 = onCancelListener;
        }
        return c7105k;
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k
    @NonNull
    /* JADX INFO: renamed from: k2 */
    public Dialog mo6459k2(Bundle bundle) {
        Dialog dialog = this.f27730v0;
        if (dialog != null) {
            return dialog;
        }
        m23336q2(false);
        if (this.f27732x0 == null) {
            this.f27732x0 = new AlertDialog.Builder((Context) C8953m.m36047l(mo4715x())).create();
        }
        return this.f27732x0;
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f27731w0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k
    /* JADX INFO: renamed from: t2 */
    public void mo23339t2(@NonNull FragmentManager fragmentManager, String str) {
        super.mo23339t2(fragmentManager, str);
    }
}
