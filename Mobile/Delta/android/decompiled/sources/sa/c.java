package sa;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.ClearExportResponse;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator<ClearExportResponse> {
    public static void c(ClearExportResponse clearExportResponse, Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.c(parcel, 1, clearExportResponse.getIsDeleted());
        o9.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ClearExportResponse createFromParcel(@NonNull Parcel parcel) {
        int iD = o9.a.D(parcel);
        boolean zO = false;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            if (o9.a.n(iU) != 1) {
                o9.a.C(parcel, iU);
            } else {
                zO = o9.a.o(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new ClearExportResponse(zO);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ClearExportResponse[] newArray(int i10) {
        return new ClearExportResponse[i10];
    }
}
