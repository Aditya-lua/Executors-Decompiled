package ka;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.v2.appshortcuts.zzr;

/* JADX INFO: loaded from: classes.dex */
public final class o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        ComponentName componentName = null;
        String strH2 = null;
        int iW = 0;
        long jY = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                jY = o9.a.y(parcel, iU);
            } else if (iN == 2) {
                strH = o9.a.h(parcel, iU);
            } else if (iN == 3) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 4) {
                componentName = (ComponentName) o9.a.g(parcel, iU, ComponentName.CREATOR);
            } else if (iN != 5) {
                o9.a.C(parcel, iU);
            } else {
                strH2 = o9.a.h(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzr(jY, strH, iW, componentName, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
