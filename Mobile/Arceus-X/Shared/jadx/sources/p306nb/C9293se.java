package p306nb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzpl;
import p325o9.C9717a;
import p325o9.C9718b;

/* JADX INFO: renamed from: nb.se */
/* JADX INFO: loaded from: classes.dex */
public final class C9293se implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static void m36777a(zzpl zzplVar, Parcel parcel, int i10) {
        int i11 = zzplVar.f9518f;
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, i11);
        C9718b.m38478v(parcel, 2, zzplVar.f9519g, false);
        C9718b.m38474r(parcel, 3, zzplVar.f9520h);
        C9718b.m38475s(parcel, 4, zzplVar.f9521i, false);
        C9718b.m38468l(parcel, 5, null, false);
        C9718b.m38478v(parcel, 6, zzplVar.f9522j, false);
        C9718b.m38478v(parcel, 7, zzplVar.f9523k, false);
        C9718b.m38466j(parcel, 8, zzplVar.f9524l, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        Long lM38452z = null;
        Float fM38446t = null;
        String strM38434h2 = null;
        String strM38434h3 = null;
        Double dM38444r = null;
        long jM38451y = 0;
        int iM38449w = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 2:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 3:
                    jM38451y = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 4:
                    lM38452z = C9717a.m38452z(parcel, iM38447u);
                    break;
                case 5:
                    fM38446t = C9717a.m38446t(parcel, iM38447u);
                    break;
                case 6:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 7:
                    strM38434h3 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 8:
                    dM38444r = C9717a.m38444r(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzpl(iM38449w, strM38434h, jM38451y, lM38452z, fM38446t, strM38434h2, strM38434h3, dM38444r);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzpl[i10];
    }
}
