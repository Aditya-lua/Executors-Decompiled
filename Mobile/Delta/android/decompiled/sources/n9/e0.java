package n9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        int iW = -1;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        int iW5 = 0;
        String strH = null;
        String strH2 = null;
        long jY = 0;
        long jY2 = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    iW2 = o9.a.w(parcel, iU);
                    break;
                case 2:
                    iW3 = o9.a.w(parcel, iU);
                    break;
                case 3:
                    iW4 = o9.a.w(parcel, iU);
                    break;
                case 4:
                    jY = o9.a.y(parcel, iU);
                    break;
                case 5:
                    jY2 = o9.a.y(parcel, iU);
                    break;
                case 6:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 7:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 8:
                    iW5 = o9.a.w(parcel, iU);
                    break;
                case 9:
                    iW = o9.a.w(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new MethodInvocation(iW2, iW3, iW4, jY, jY2, strH, strH2, iW5, iW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MethodInvocation[i10];
    }
}
