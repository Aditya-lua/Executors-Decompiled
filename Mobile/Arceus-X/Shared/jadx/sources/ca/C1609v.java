package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import p325o9.C9717a;

/* JADX INFO: renamed from: ca.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1609v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        short sM38421A = 0;
        short sM38421A2 = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 2) {
                sM38421A = C9717a.m38421A(parcel, iM38447u);
            } else if (iM38440n != 3) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                sM38421A2 = C9717a.m38421A(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new UvmEntry(iM38449w, sM38421A, sM38421A2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new UvmEntry[i10];
    }
}
