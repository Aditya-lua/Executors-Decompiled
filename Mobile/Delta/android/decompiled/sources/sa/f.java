package sa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator<CreateCredentialRequest> {
    public static void c(CreateCredentialRequest createCredentialRequest, Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, createCredentialRequest.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), false);
        o9.b.f(parcel, 2, createCredentialRequest.getCredentialData(), false);
        o9.b.f(parcel, 3, createCredentialRequest.getCandidateQueryData(), false);
        o9.b.v(parcel, 4, createCredentialRequest.getOrigin(), false);
        o9.b.v(parcel, 5, createCredentialRequest.getRequestJson(), false);
        o9.b.t(parcel, 6, createCredentialRequest.getResultReceiver(), i10, false);
        o9.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CreateCredentialRequest createFromParcel(@NonNull Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        Bundle bundleB = null;
        Bundle bundleB2 = null;
        String strH2 = null;
        String strH3 = null;
        ResultReceiver resultReceiver = null;
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
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 5:
                    strH3 = o9.a.h(parcel, iU);
                    break;
                case 6:
                    resultReceiver = (ResultReceiver) o9.a.g(parcel, iU, ResultReceiver.CREATOR);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new CreateCredentialRequest(strH, bundleB, bundleB2, strH2, strH3, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CreateCredentialRequest[] newArray(int i10) {
        return new CreateCredentialRequest[i10];
    }
}
