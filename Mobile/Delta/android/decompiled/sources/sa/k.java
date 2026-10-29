package sa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.ExportCredentialsToDeviceSetupResponse;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator<ExportCredentialsToDeviceSetupResponse> {
    public static void c(ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse, Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.f(parcel, 1, exportCredentialsToDeviceSetupResponse.getResponseBundle(), false);
        o9.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ExportCredentialsToDeviceSetupResponse createFromParcel(@NonNull Parcel parcel) {
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
        return new ExportCredentialsToDeviceSetupResponse(bundleB);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExportCredentialsToDeviceSetupResponse[] newArray(int i10) {
        return new ExportCredentialsToDeviceSetupResponse[i10];
    }
}
