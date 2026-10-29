package p271lf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzj;
import p325o9.C9717a;

/* JADX INFO: renamed from: lf.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C8136h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        Bundle bundleM38428b = null;
        zzj zzjVar = null;
        String strM38434h = null;
        String strM38434h2 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                bundleM38428b = C9717a.m38428b(parcel, iM38447u);
            } else if (iM38440n == 2) {
                zzjVar = (zzj) C9717a.m38433g(parcel, iM38447u, zzj.CREATOR);
            } else if (iM38440n == 3) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 4) {
                strM38434h2 = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n != 1000) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new Thing(iM38449w, bundleM38428b, zzjVar, strM38434h, strM38434h2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Thing[i10];
    }
}
