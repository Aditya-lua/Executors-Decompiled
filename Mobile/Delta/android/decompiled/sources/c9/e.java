package c9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        String strH2 = null;
        String strH3 = null;
        String strH4 = null;
        Uri uri = null;
        String strH5 = null;
        String strH6 = null;
        ArrayList arrayListL = null;
        String strH7 = null;
        String strH8 = null;
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
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 4:
                    strH3 = o9.a.h(parcel, iU);
                    break;
                case 5:
                    strH4 = o9.a.h(parcel, iU);
                    break;
                case 6:
                    uri = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
                    break;
                case 7:
                    strH5 = o9.a.h(parcel, iU);
                    break;
                case 8:
                    jY = o9.a.y(parcel, iU);
                    break;
                case 9:
                    strH6 = o9.a.h(parcel, iU);
                    break;
                case 10:
                    arrayListL = o9.a.l(parcel, iU, Scope.CREATOR);
                    break;
                case 11:
                    strH7 = o9.a.h(parcel, iU);
                    break;
                case 12:
                    strH8 = o9.a.h(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new GoogleSignInAccount(iW, strH, strH2, strH3, strH4, uri, strH5, jY, strH6, arrayListL, strH7, strH8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
