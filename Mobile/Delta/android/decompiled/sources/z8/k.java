package z8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator {
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
        String strH7 = null;
        PublicKeyCredential publicKeyCredential = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 2:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 3:
                    strH3 = o9.a.h(parcel, iU);
                    break;
                case 4:
                    strH4 = o9.a.h(parcel, iU);
                    break;
                case 5:
                    uri = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
                    break;
                case 6:
                    strH5 = o9.a.h(parcel, iU);
                    break;
                case 7:
                    strH6 = o9.a.h(parcel, iU);
                    break;
                case 8:
                    strH7 = o9.a.h(parcel, iU);
                    break;
                case 9:
                    publicKeyCredential = (PublicKeyCredential) o9.a.g(parcel, iU, PublicKeyCredential.CREATOR);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new SignInCredential(strH, strH2, strH3, strH4, uri, strH5, strH6, strH7, publicKeyCredential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInCredential[i10];
    }
}
