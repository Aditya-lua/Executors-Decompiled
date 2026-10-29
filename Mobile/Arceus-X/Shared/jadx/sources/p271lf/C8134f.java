package p271lf;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.appindex.zzk;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzg;
import p325o9.C9717a;

/* JADX INFO: renamed from: lf.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C8134f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        Thing[] thingArr = null;
        String[] strArrM38435i = null;
        String[] strArrM38435i2 = null;
        zzk zzkVar = null;
        String strM38434h = null;
        String strM38434h2 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    iM38449w = C9717a.m38449w(parcel, iM38447u);
                    break;
                case 2:
                    thingArr = (Thing[]) C9717a.m38437k(parcel, iM38447u, Thing.CREATOR);
                    break;
                case 3:
                    strArrM38435i = C9717a.m38435i(parcel, iM38447u);
                    break;
                case 4:
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
                case 5:
                    strArrM38435i2 = C9717a.m38435i(parcel, iM38447u);
                    break;
                case 6:
                    zzkVar = (zzk) C9717a.m38433g(parcel, iM38447u, zzk.CREATOR);
                    break;
                case 7:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 8:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzg(iM38449w, thingArr, strArrM38435i, strArrM38435i2, zzkVar, strM38434h, strM38434h2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzg[i10];
    }
}
