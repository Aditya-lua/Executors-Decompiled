package da;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        o oVar = null;
        y1 y1Var = null;
        b0 b0Var = null;
        e2 e2Var = null;
        h0 h0Var = null;
        j0 j0Var = null;
        a2 a2Var = null;
        m0 m0Var = null;
        p pVar = null;
        q0 q0Var = null;
        a1 a1Var = null;
        o0 o0Var = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 2:
                    oVar = (o) p9.b.g(parcel, iU, o.CREATOR);
                    break;
                case 3:
                    y1Var = (y1) p9.b.g(parcel, iU, y1.CREATOR);
                    break;
                case 4:
                    b0Var = (b0) p9.b.g(parcel, iU, b0.CREATOR);
                    break;
                case 5:
                    e2Var = (e2) p9.b.g(parcel, iU, e2.CREATOR);
                    break;
                case 6:
                    h0Var = (h0) p9.b.g(parcel, iU, h0.CREATOR);
                    break;
                case 7:
                    j0Var = (j0) p9.b.g(parcel, iU, j0.CREATOR);
                    break;
                case 8:
                    a2Var = (a2) p9.b.g(parcel, iU, a2.CREATOR);
                    break;
                case 9:
                    m0Var = (m0) p9.b.g(parcel, iU, m0.CREATOR);
                    break;
                case 10:
                    pVar = (p) p9.b.g(parcel, iU, p.CREATOR);
                    break;
                case 11:
                    q0Var = (q0) p9.b.g(parcel, iU, q0.CREATOR);
                    break;
                case 12:
                    a1Var = (a1) p9.b.g(parcel, iU, a1.CREATOR);
                    break;
                case 13:
                    o0Var = (o0) p9.b.g(parcel, iU, o0.CREATOR);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new d(oVar, y1Var, b0Var, e2Var, h0Var, j0Var, a2Var, m0Var, pVar, q0Var, a1Var, o0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
