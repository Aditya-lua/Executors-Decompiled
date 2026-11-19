package t9;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends cb.b implements k {
    public j() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // cb.b
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        s9.h hVar = (s9.h) cb.c.a(parcel, s9.h.CREATOR);
        cb.c.b(parcel);
        K1(hVar);
        return true;
    }
}
