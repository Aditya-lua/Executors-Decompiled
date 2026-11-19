package ka;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    public static void a(MostRecentGameInfoEntity mostRecentGameInfoEntity, Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, mostRecentGameInfoEntity.zza(), false);
        p9.c.v(parcel, 2, mostRecentGameInfoEntity.zzb(), false);
        p9.c.r(parcel, 3, mostRecentGameInfoEntity.zzc());
        p9.c.t(parcel, 4, mostRecentGameInfoEntity.zzd(), i10, false);
        p9.c.t(parcel, 5, mostRecentGameInfoEntity.zze(), i10, false);
        p9.c.t(parcel, 6, mostRecentGameInfoEntity.zzf(), i10, false);
        p9.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = null;
        String strH2 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        long jY = 0;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            switch (p9.b.n(iU)) {
                case 1:
                    strH = p9.b.h(parcel, iU);
                    break;
                case 2:
                    strH2 = p9.b.h(parcel, iU);
                    break;
                case 3:
                    jY = p9.b.y(parcel, iU);
                    break;
                case 4:
                    uri = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 5:
                    uri2 = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
                    break;
                case 6:
                    uri3 = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
                    break;
                default:
                    p9.b.C(parcel, iU);
                    break;
            }
        }
        p9.b.m(parcel, iD);
        return new MostRecentGameInfoEntity(strH, strH2, jY, uri, uri2, uri3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MostRecentGameInfoEntity[i10];
    }
}
