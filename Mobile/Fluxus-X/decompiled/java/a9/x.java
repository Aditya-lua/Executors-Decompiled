package a9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        Uri uri = null;
        String strH5 = null;
        String strH6 = null;
        String strH7 = null;
        da.q qVar = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 2:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                case 3:
                    strH3 = p9.b.h(parcel, iU);
                    break;
                case 4:
                    strH4 = p9.b.h(parcel, iU);
                    break;
                case 5:
                    uri = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 6:
                    strH5 = p9.b.h(parcel, iU);
                    break;
                case 7:
                    strH6 = p9.b.h(parcel, iU);
                    break;
                case 8:
                    strH7 = p9.b.h(parcel, iU);
                    break;
                case 9:
                    qVar = (da.q) p9.b.g(parcel, iU, da.q.CREATOR);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new j(strH, strH2, strH3, strH4, uri, strH5, strH6, strH7, qVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
