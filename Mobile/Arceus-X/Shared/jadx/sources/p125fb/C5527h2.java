package p125fb;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.games_v2.zzx;
import p325o9.C9717a;

/* JADX INFO: renamed from: fb.h2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5527h2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            if (C9717a.m38440n(iM38447u) != 1) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                intent = (Intent) C9717a.m38433g(parcel, iM38447u, Intent.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzx(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzx[i10];
    }
}
