package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Parcelable.Creator {
    public static final ApiMetadata a(Parcel parcel) {
        int iD = o9.a.D(parcel);
        boolean zO = false;
        ComplianceOptions complianceOptions = null;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            int iN = o9.a.n(iU);
            if (iN == 1) {
                complianceOptions = (ComplianceOptions) o9.a.g(parcel, iU, ComplianceOptions.CREATOR);
            } else if (iN != 2) {
                o9.a.C(parcel, iU);
            } else {
                zO = o9.a.o(parcel, iU);
            }
        }
        o9.a.m(parcel, iD);
        return new ApiMetadata(complianceOptions, zO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ApiMetadata[i10];
    }
}
