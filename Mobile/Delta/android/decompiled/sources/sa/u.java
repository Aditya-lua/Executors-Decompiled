package sa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.RegisterExportResponse;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Parcelable.Creator<RegisterExportResponse> {
    public static void c(RegisterExportResponse registerExportResponse, Parcel parcel, int i10) {
        o9.b.b(parcel, o9.b.a(parcel));
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RegisterExportResponse createFromParcel(@NonNull Parcel parcel) {
        int iD = o9.a.D(parcel);
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            o9.a.n(iU);
            o9.a.C(parcel, iU);
        }
        o9.a.m(parcel, iD);
        return new RegisterExportResponse();
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RegisterExportResponse[] newArray(int i10) {
        return new RegisterExportResponse[i10];
    }
}
