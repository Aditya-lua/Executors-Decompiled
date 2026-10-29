package sa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.CredentialOption;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator<CredentialOption> {
    public static void c(CredentialOption credentialOption, Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, credentialOption.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), false);
        o9.b.f(parcel, 2, credentialOption.getCredentialRetrievalData(), false);
        o9.b.f(parcel, 3, credentialOption.getCandidateQueryData(), false);
        o9.b.v(parcel, 4, credentialOption.getRequestMatcher(), false);
        o9.b.v(parcel, 5, credentialOption.getRequestType(), false);
        o9.b.v(parcel, 6, credentialOption.getProtocolType(), false);
        o9.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CredentialOption createFromParcel(@NonNull Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = "";
        String strH2 = strH;
        String strH3 = strH2;
        Bundle bundleB = null;
        Bundle bundleB2 = null;
        String strH4 = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 2:
                    bundleB = o9.a.b(parcel, iU);
                    break;
                case 3:
                    bundleB2 = o9.a.b(parcel, iU);
                    break;
                case 4:
                    strH4 = o9.a.h(parcel, iU);
                    break;
                case 5:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 6:
                    strH3 = o9.a.h(parcel, iU);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new CredentialOption(strH, bundleB, bundleB2, strH4, strH2, strH3);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CredentialOption[] newArray(int i10) {
        return new CredentialOption[i10];
    }
}
