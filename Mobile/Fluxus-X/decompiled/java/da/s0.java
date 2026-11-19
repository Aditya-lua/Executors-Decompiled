package da;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        u uVar = null;
        w wVar = null;
        byte[] bArrC = null;
        ArrayList arrayListL = null;
        Double dR = null;
        ArrayList arrayListL2 = null;
        k kVar = null;
        Integer numX = null;
        a0 a0Var = null;
        String strH = null;
        d dVar = null;
        String strH2 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 2:
                    uVar = (u) p9.b.g(parcel, iU, u.CREATOR);
                    break;
                case 3:
                    wVar = (w) p9.b.g(parcel, iU, w.CREATOR);
                    break;
                case 4:
                    bArrC = p9.b.c(parcel, iU);
                    break;
                case 5:
                    arrayListL = p9.b.l(parcel, iU, t.CREATOR);
                    break;
                case 6:
                    dR = p9.b.r(parcel, iU);
                    break;
                case 7:
                    arrayListL2 = p9.b.l(parcel, iU, s.CREATOR);
                    break;
                case 8:
                    kVar = (k) p9.b.g(parcel, iU, k.CREATOR);
                    break;
                case 9:
                    numX = p9.b.x(parcel, iU);
                    break;
                case 10:
                    a0Var = (a0) p9.b.g(parcel, iU, a0.CREATOR);
                    break;
                case 11:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 12:
                    dVar = (d) p9.b.g(parcel, iU, d.CREATOR);
                    break;
                case 13:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                case 14:
                    resultReceiver = (ResultReceiver) p9.b.g(parcel, iU, ResultReceiver.CREATOR);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new r(uVar, wVar, bArrC, arrayListL, dR, arrayListL2, kVar, numX, a0Var, strH, dVar, strH2, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new r[i10];
    }
}
