package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p325o9.C9717a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2096h2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        Bundle bundleM38428b = null;
        String strM38434h = null;
        boolean zM38441o = false;
        long jM38451y = 0;
        long jM38451y2 = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                jM38451y = C9717a.m38451y(parcel, iM38447u);
            } else if (iM38440n == 2) {
                jM38451y2 = C9717a.m38451y(parcel, iM38447u);
            } else if (iM38440n == 3) {
                zM38441o = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n == 7) {
                bundleM38428b = C9717a.m38428b(parcel, iM38447u);
            } else if (iM38440n != 8) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzdd(jM38451y, jM38451y2, zM38441o, bundleM38428b, strM38434h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzdd[i10];
    }
}
