package p125fb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.games_v2.zzq;
import com.google.android.gms.internal.games_v2.zzx;
import p325o9.C9717a;

/* JADX INFO: renamed from: fb.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5507c2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        zzx zzxVar = null;
        int iM38449w = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n != 2) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                zzxVar = (zzx) C9717a.m38433g(parcel, iM38447u, zzx.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzq(iM38449w, zzxVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}
