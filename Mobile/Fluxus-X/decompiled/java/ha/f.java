package ha;

import android.os.Parcel;
import gb.l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends gb.r implements g {
    public f() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    @Override // gb.r
    public final boolean r2(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1001) {
            return false;
        }
        gb.e eVarZzb = zzb();
        parcel2.writeNoException();
        int i12 = l0.f17644a;
        parcel2.writeInt(1);
        eVarZzb.writeToParcel(parcel2, 1);
        return true;
    }
}
