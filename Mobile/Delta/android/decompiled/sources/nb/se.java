package nb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzpl;

/* JADX INFO: loaded from: classes.dex */
public final class se implements Parcelable.Creator {
    public static void a(zzpl zzplVar, Parcel parcel, int i10) {
        int i11 = zzplVar.f7438f;
        int iA = o9.b.a(parcel);
        o9.b.n(parcel, 1, i11);
        o9.b.v(parcel, 2, zzplVar.f7439g, false);
        o9.b.r(parcel, 3, zzplVar.f7440h);
        o9.b.s(parcel, 4, zzplVar.f7441i, false);
        o9.b.l(parcel, 5, null, false);
        o9.b.v(parcel, 6, zzplVar.f7442j, false);
        o9.b.v(parcel, 7, zzplVar.f7443k, false);
        o9.b.j(parcel, 8, zzplVar.f7444l, false);
        o9.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        Long lZ = null;
        Float fT = null;
        String strH2 = null;
        String strH3 = null;
        Double dR = null;
        long jY = 0;
        int iW = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    iW = o9.a.w(parcel, iU);
                    break;
                case 2:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 3:
                    jY = o9.a.y(parcel, iU);
                    break;
                case 4:
                    lZ = o9.a.z(parcel, iU);
                    break;
                case 5:
                    fT = o9.a.t(parcel, iU);
                    break;
                case 6:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 7:
                    strH3 = o9.a.h(parcel, iU);
                    break;
                case 8:
                    dR = o9.a.r(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new zzpl(iW, strH, jY, lZ, fT, strH2, strH3, dR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzpl[i10];
    }
}
