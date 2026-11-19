package e9;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends za.s implements r {
    public q() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // za.s
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            F();
        } else {
            if (i10 != 2) {
                return false;
            }
            u();
        }
        return true;
    }
}
