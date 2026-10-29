package p376qb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import p325o9.C9717a;

/* JADX INFO: renamed from: qb.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10493h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        zat zatVar = null;
        int iM38449w = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n != 2) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                zatVar = (zat) C9717a.m38433g(parcel, iM38447u, zat.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zai(iM38449w, zatVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zai[i10];
    }
}
