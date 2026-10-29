package ka;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import com.google.android.gms.games.internal.v2.appshortcuts.zzi;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        PersistableBundle persistableBundle = null;
        Boolean boolP = null;
        Boolean boolP2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                strH = o9.a.h(parcel, iU);
            } else if (iN == 2) {
                persistableBundle = (PersistableBundle) o9.a.g(parcel, iU, PersistableBundle.CREATOR);
            } else if (iN == 3) {
                boolP = o9.a.p(parcel, iU);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                boolP2 = o9.a.p(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzi(strH, persistableBundle, boolP, boolP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzi[i10];
    }
}
