package sa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.CredentialOption;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.Creator<GetCredentialRequest> {
    public static void c(GetCredentialRequest getCredentialRequest, Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.z(parcel, 1, getCredentialRequest.v3(), false);
        o9.b.f(parcel, 2, getCredentialRequest.getData(), false);
        o9.b.v(parcel, 3, getCredentialRequest.getOrigin(), false);
        o9.b.t(parcel, 4, getCredentialRequest.getResultReceiver(), i10, false);
        o9.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GetCredentialRequest createFromParcel(@NonNull Parcel parcel) {
        int iD = o9.a.D(parcel);
        ArrayList arrayListL = null;
        Bundle bundleB = null;
        String strH = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                arrayListL = o9.a.l(parcel, iU, CredentialOption.CREATOR);
            } else if (iN == 2) {
                bundleB = o9.a.b(parcel, iU);
            } else if (iN == 3) {
                strH = o9.a.h(parcel, iU);
            } else if (iN != 4) {
                o9.a.C(parcel, iU);
            } else {
                resultReceiver = (ResultReceiver) o9.a.g(parcel, iU, ResultReceiver.CREATOR);
            }
        }
        o9.a.m(parcel, iD);
        return new GetCredentialRequest(arrayListL, bundleB, strH, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public GetCredentialRequest[] newArray(int i10) {
        return new GetCredentialRequest[i10];
    }
}
