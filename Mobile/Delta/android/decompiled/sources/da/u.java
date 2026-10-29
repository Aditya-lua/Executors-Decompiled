package da;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.zzo;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Parcelable.Creator {
    public static void a(zzo zzoVar, Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.n(parcel, 1, zzoVar.Y());
        o9.b.v(parcel, 2, zzoVar.zza(), false);
        o9.b.v(parcel, 3, zzoVar.zzb(), false);
        o9.b.v(parcel, 4, zzoVar.zzc(), false);
        o9.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        String strH2 = null;
        int iW = 0;
        String strH3 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                iW = o9.a.w(parcel, iU);
            } else if (iN == 2) {
                strH = o9.a.h(parcel, iU);
            } else if (iN == 3) {
                strH3 = o9.a.h(parcel, iU);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                strH2 = o9.a.h(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new zzo(iW, strH, strH3, strH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzo[i10];
    }
}
