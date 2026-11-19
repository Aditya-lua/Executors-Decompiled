package j;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class m extends f4.o {
    @Override // f4.o
    @NonNull
    public Dialog k2(Bundle bundle) {
        return new l(v(), j2());
    }

    @Override // f4.o
    public void s2(@NonNull Dialog dialog, int i10) {
        if (!(dialog instanceof l)) {
            super.s2(dialog, i10);
            return;
        }
        l lVar = (l) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        lVar.o(1);
    }
}
