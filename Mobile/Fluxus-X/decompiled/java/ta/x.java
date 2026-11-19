package ta;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Parcelable.Creator<GetCredentialRequest> {
    public static void c(GetCredentialRequest getCredentialRequest, Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.z(parcel, 1, getCredentialRequest.A3(), false);
        p9.c.f(parcel, 2, getCredentialRequest.getData(), false);
        p9.c.v(parcel, 3, getCredentialRequest.getOrigin(), false);
        p9.c.t(parcel, 4, getCredentialRequest.getResultReceiver(), i10, false);
        p9.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GetCredentialRequest createFromParcel(@NonNull Parcel parcel) {
        int iD = p9.b.D(parcel);
        ArrayList arrayListL = null;
        Bundle bundleB = null;
        String strH = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                arrayListL = p9.b.l(parcel, iU, q.CREATOR);
            } else if (iN == 2) {
                bundleB = p9.b.b(parcel, iU);
            } else if (iN == 3) {
                strH = p9.b.h(parcel, iU);
            } else if (iN != 4) {
                p9.b.C(parcel, iU);
            } else {
                resultReceiver = (ResultReceiver) p9.b.g(parcel, iU, ResultReceiver.CREATOR);
            }
        }
        p9.b.m(parcel, iD);
        return new GetCredentialRequest(arrayListL, bundleB, strH, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public GetCredentialRequest[] newArray(int i10) {
        return new GetCredentialRequest[i10];
    }
}
