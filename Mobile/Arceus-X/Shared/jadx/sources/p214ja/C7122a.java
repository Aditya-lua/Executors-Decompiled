package p214ja;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;
import p325o9.C9717a;
import p325o9.C9718b;

/* JADX INFO: renamed from: ja.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7122a implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static void m29916a(MostRecentGameInfoEntity mostRecentGameInfoEntity, Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, mostRecentGameInfoEntity.zza(), false);
        C9718b.m38478v(parcel, 2, mostRecentGameInfoEntity.zzb(), false);
        C9718b.m38474r(parcel, 3, mostRecentGameInfoEntity.zzc());
        C9718b.m38476t(parcel, 4, mostRecentGameInfoEntity.zzd(), i10, false);
        C9718b.m38476t(parcel, 5, mostRecentGameInfoEntity.zze(), i10, false);
        C9718b.m38476t(parcel, 6, mostRecentGameInfoEntity.zzf(), i10, false);
        C9718b.m38458b(parcel, iM38457a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        String strM38434h2 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        long jM38451y = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 2:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 3:
                    jM38451y = C9717a.m38451y(parcel, iM38447u);
                    break;
                case 4:
                    uri = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                    break;
                case 5:
                    uri2 = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                    break;
                case 6:
                    uri3 = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new MostRecentGameInfoEntity(strM38434h, strM38434h2, jM38451y, uri, uri2, uri3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MostRecentGameInfoEntity[i10];
    }
}
