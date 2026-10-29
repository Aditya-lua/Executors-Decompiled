package p073da;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.zzo;
import p325o9.C9717a;
import p325o9.C9718b;

/* JADX INFO: renamed from: da.u */
/* JADX INFO: loaded from: classes.dex */
public final class C4517u implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static void m22480a(zzo zzoVar, Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38470n(parcel, 1, zzoVar.mo9413Y());
        C9718b.m38478v(parcel, 2, zzoVar.zza(), false);
        C9718b.m38478v(parcel, 3, zzoVar.zzb(), false);
        C9718b.m38478v(parcel, 4, zzoVar.zzc(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        String strM38434h2 = null;
        int iM38449w = 0;
        String strM38434h3 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n == 2) {
                strM38434h = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n == 3) {
                strM38434h3 = C9717a.m38434h(parcel, iM38447u);
            } else if (iM38440n != 4) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                strM38434h2 = C9717a.m38434h(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzo(iM38449w, strM38434h, strM38434h3, strM38434h2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzo[i10];
    }
}
