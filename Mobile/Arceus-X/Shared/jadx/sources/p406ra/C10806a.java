package p406ra;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.video.VideoCapabilities;
import p325o9.C9717a;

/* JADX INFO: renamed from: ra.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10806a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        boolean[] zArrM38427a = null;
        boolean[] zArrM38427a2 = null;
        boolean zM38441o = false;
        boolean zM38441o2 = false;
        boolean zM38441o3 = false;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                zM38441o = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n == 2) {
                zM38441o2 = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n == 3) {
                zM38441o3 = C9717a.m38441o(parcel, iM38447u);
            } else if (iM38440n == 4) {
                zArrM38427a = C9717a.m38427a(parcel, iM38447u);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                zArrM38427a2 = C9717a.m38427a(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new VideoCapabilities(zM38441o, zM38441o2, zM38441o3, zArrM38427a, zArrM38427a2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new VideoCapabilities[i10];
    }
}
