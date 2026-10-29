package p166hb;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzj;
import com.google.android.gms.internal.location.zzl;
import p325o9.C9717a;

/* JADX INFO: renamed from: hb.x */
/* JADX INFO: loaded from: classes.dex */
public final class C6350x implements Parcelable.Creator<zzl> {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        zzj zzjVar = null;
        int iM38449w = 1;
        IBinder iBinderM38448v = null;
        IBinder iBinderM38448v2 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 2) {
                zzjVar = (zzj) C9717a.m38433g(parcel, iM38447u, zzj.CREATOR);
            } else if (iM38440n == 3) {
                iBinderM38448v = C9717a.m38448v(parcel, iM38447u);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                iBinderM38448v2 = C9717a.m38448v(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzl(iM38449w, zzjVar, iBinderM38448v, iBinderM38448v2);
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl[] newArray(int i10) {
        return new zzl[i10];
    }
}
