package nb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Parcelable.Creator {
    public static void a(zzbg zzbgVar, Parcel parcel, int i10) {
        String str = zzbgVar.f7422f;
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 2, str, false);
        o9.b.t(parcel, 3, zzbgVar.f7423g, i10, false);
        o9.b.v(parcel, 4, zzbgVar.f7424h, false);
        o9.b.r(parcel, 5, zzbgVar.f7425i);
        o9.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        long jY = 0;
        String strH = null;
        zzbe zzbeVar = null;
        String strH2 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 2) {
                strH = o9.a.h(parcel, iU);
            } else if (iN == 3) {
                zzbeVar = (zzbe) o9.a.g(parcel, iU, zzbe.CREATOR);
            } else if (iN == 4) {
                strH2 = o9.a.h(parcel, iU);
            } else if (iN != 5) {
                o9.a.C(parcel, iU);
            } else {
                jY = o9.a.y(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzbg(strH, zzbeVar, strH2, jY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbg[i10];
    }
}
