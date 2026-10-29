package f9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator<GetRestoreCredentialRequest> {
    public static void c(GetRestoreCredentialRequest getRestoreCredentialRequest, Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.f(parcel, 1, getRestoreCredentialRequest.getRequestBundle(), false);
        o9.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public GetRestoreCredentialRequest createFromParcel(@NonNull Parcel parcel) {
        int iD = o9.a.D(parcel);
        Bundle bundleB = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            if (o9.a.n(iU) != 1) {
                o9.a.C(parcel, iU);
            } else {
                bundleB = o9.a.b(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new GetRestoreCredentialRequest(bundleB);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public GetRestoreCredentialRequest[] newArray(int i10) {
        return new GetRestoreCredentialRequest[i10];
    }
}
