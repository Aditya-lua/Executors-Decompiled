package p243ka;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.p049v2.appshortcuts.zzr;
import p325o9.C9717a;

/* JADX INFO: renamed from: ka.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7529o implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        ComponentName componentName = null;
        String strM38434h2 = null;
        int iM38449w = 0;
        long jM38451y = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                jM38451y = C9717a.m38451y(parcel, iM38447u);
            } else if (iM38440n == 2) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 3) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 4) {
                componentName = (ComponentName) C9717a.m38433g(parcel, iM38447u, ComponentName.CREATOR);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                strM38434h2 = C9717a.m38434h(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzr(jM38451y, strM38434h, iM38449w, componentName, strM38434h2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzr[i10];
    }
}
