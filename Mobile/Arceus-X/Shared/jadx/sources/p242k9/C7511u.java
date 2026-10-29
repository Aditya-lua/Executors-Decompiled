package p242k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import p325o9.C9717a;

/* JADX INFO: renamed from: k9.u */
/* JADX INFO: loaded from: classes.dex */
public final class C7511u implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static final ApiMetadata m31166a(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        boolean zM38441o = false;
        ComplianceOptions complianceOptions = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                complianceOptions = (ComplianceOptions) C9717a.m38433g(parcel, iM38447u, ComplianceOptions.CREATOR);
            } else if (iM38440n != 2) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                zM38441o = C9717a.m38441o(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new ApiMetadata(complianceOptions, zM38441o);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m31166a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ApiMetadata[i10];
    }
}
