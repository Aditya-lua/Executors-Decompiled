package sa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.SignalCredentialStateRequest;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Parcelable.Creator<SignalCredentialStateRequest> {
    public static void c(SignalCredentialStateRequest signalCredentialStateRequest, Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, signalCredentialStateRequest.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), false);
        o9.b.v(parcel, 2, signalCredentialStateRequest.getOrigin(), false);
        o9.b.f(parcel, 3, signalCredentialStateRequest.getRequestData(), false);
        o9.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SignalCredentialStateRequest createFromParcel(@NonNull Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        String strH2 = null;
        Bundle bundleB = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                strH = o9.a.h(parcel, iU);
            } else if (iN == 2) {
                strH2 = o9.a.h(parcel, iU);
            } else if (iN != 3) {
                o9.a.C(parcel, iU);
            } else {
                bundleB = o9.a.b(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new SignalCredentialStateRequest(strH, strH2, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SignalCredentialStateRequest[] newArray(int i10) {
        return new SignalCredentialStateRequest[i10];
    }
}
