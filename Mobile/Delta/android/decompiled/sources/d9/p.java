package d9;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends ya.s implements q {
    public p() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // ya.s
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            E();
        } else {
            if (i10 != 2) {
                return false;
            }
            t();
        }
        return true;
    }
}
