package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzab;
import p325o9.C9717a;

/* JADX INFO: renamed from: ca.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1585d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        long jM38451y = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            if (C9717a.m38440n(iM38447u) != 1) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                jM38451y = C9717a.m38451y(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzab(jM38451y);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzab[i10];
    }
}
