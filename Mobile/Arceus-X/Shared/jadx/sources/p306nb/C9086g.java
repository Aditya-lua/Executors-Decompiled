package p306nb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzaf;
import p325o9.C9717a;

/* JADX INFO: renamed from: nb.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9086g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        long jM38451y = 0;
        long jM38451y2 = 0;
        int iM38449w = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                jM38451y = C9717a.m38451y(parcel, iM38447u);
            } else if (iM38440n == 2) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n != 3) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                jM38451y2 = C9717a.m38451y(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzaf(jM38451y, iM38449w, jM38451y2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaf[i10];
    }
}
