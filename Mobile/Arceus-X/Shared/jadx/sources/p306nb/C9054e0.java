package p306nb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import p325o9.C9717a;
import p325o9.C9718b;

/* JADX INFO: renamed from: nb.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9054e0 implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static void m36287a(zzbg zzbgVar, Parcel parcel, int i10) {
        String str = zzbgVar.f9502f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 2, str, false);
        C9718b.m38476t(parcel, 3, zzbgVar.f9503g, i10, false);
        C9718b.m38478v(parcel, 4, zzbgVar.f9504h, false);
        C9718b.m38474r(parcel, 5, zzbgVar.f9505i);
        C9718b.m38458b(parcel, iM38457a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        long jM38451y = 0;
        String strM38434h = null;
        zzbe zzbeVar = null;
        String strM38434h2 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 2) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 3) {
                zzbeVar = (zzbe) C9717a.m38433g(parcel, iM38447u, zzbe.CREATOR);
            } else if (iM38440n == 4) {
                strM38434h2 = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n != 5) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                jM38451y = C9717a.m38451y(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzbg(strM38434h, zzbeVar, strM38434h2, jM38451y);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzbg[i10];
    }
}
