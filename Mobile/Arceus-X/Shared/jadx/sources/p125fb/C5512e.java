package p125fb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.games_v2.zzaf;
import p325o9.C9717a;

/* JADX INFO: renamed from: fb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5512e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        Bundle bundleM38428b = null;
        IBinder iBinderM38448v = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                bundleM38428b = C9717a.m38428b(parcel, iM38447u);
            } else if (iM38440n != 2) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                iBinderM38448v = C9717a.m38448v(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzaf(bundleM38428b, iBinderM38448v);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaf[i10];
    }
}
