package za;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends s implements g0 {
    public f0() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // za.s
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) t.a(parcel, Status.CREATOR);
        a9.h hVar = (a9.h) t.a(parcel, a9.h.CREATOR);
        t.b(parcel);
        k0(status, hVar);
        return true;
    }
}
