package p203j;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import p093e4.DialogInterfaceOnCancelListenerC4819k;

/* JADX INFO: renamed from: j.m */
/* JADX INFO: loaded from: classes.dex */
public class C7003m extends DialogInterfaceOnCancelListenerC4819k {
    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k
    @NonNull
    /* JADX INFO: renamed from: k2 */
    public Dialog mo6459k2(Bundle bundle) {
        return new DialogC7002l(mo4715x(), m23330j2());
    }

    @Override // p093e4.DialogInterfaceOnCancelListenerC4819k
    /* JADX INFO: renamed from: s2 */
    public void mo23338s2(@NonNull Dialog dialog, int i10) {
        if (!(dialog instanceof DialogC7002l)) {
            super.mo23338s2(dialog, i10);
            return;
        }
        DialogC7002l dialogC7002l = (DialogC7002l) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialogC7002l.m29605o(1);
    }
}
