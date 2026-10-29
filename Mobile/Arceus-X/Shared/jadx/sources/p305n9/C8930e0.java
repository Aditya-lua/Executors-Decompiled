package p305n9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import p325o9.C9717a;

/* JADX INFO: renamed from: n9.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C8930e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = -1;
        int iM38449w2 = 0;
        int iM38449w3 = 0;
        int iM38449w4 = 0;
        int iM38449w5 = 0;
        String strM38434h = null;
        String strM38434h2 = null;
        long jM38451y = 0;
        long jM38451y2 = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    iM38449w2 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 2:
                    iM38449w3 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 3:
                    iM38449w4 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 4:
                    jM38451y = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 5:
                    jM38451y2 = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 6:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 7:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 8:
                    iM38449w5 = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 9:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new MethodInvocation(iM38449w2, iM38449w3, iM38449w4, jM38451y, jM38451y2, strM38434h, strM38434h2, iM38449w5, iM38449w);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MethodInvocation[i10];
    }
}
