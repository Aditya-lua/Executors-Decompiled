package sa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator<CreateCredentialResponse> {
    public static void c(CreateCredentialResponse createCredentialResponse, Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, createCredentialResponse.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), false);
        o9.b.f(parcel, 2, createCredentialResponse.getData(), false);
        o9.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CreateCredentialResponse createFromParcel(@NonNull Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        Bundle bundleB = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                strH = o9.a.h(parcel, iU);
            } else if (iN != 2) {
                o9.a.C(parcel, iU);
            } else {
                bundleB = o9.a.b(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new CreateCredentialResponse(strH, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CreateCredentialResponse[] newArray(int i10) {
        return new CreateCredentialResponse[i10];
    }
}
