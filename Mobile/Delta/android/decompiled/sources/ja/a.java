package ja;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    public static void a(MostRecentGameInfoEntity mostRecentGameInfoEntity, Parcel parcel, int i10) {
        int iA = o9.b.a(parcel);
        o9.b.v(parcel, 1, mostRecentGameInfoEntity.zza(), false);
        o9.b.v(parcel, 2, mostRecentGameInfoEntity.zzb(), false);
        o9.b.r(parcel, 3, mostRecentGameInfoEntity.zzc());
        o9.b.t(parcel, 4, mostRecentGameInfoEntity.zzd(), i10, false);
        o9.b.t(parcel, 5, mostRecentGameInfoEntity.zze(), i10, false);
        o9.b.t(parcel, 6, mostRecentGameInfoEntity.zzf(), i10, false);
        o9.b.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = o9.a.D(parcel);
        String strH = null;
        String strH2 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        long jY = 0;
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            switch (o9.a.n(iU)) {
                case 1:
                    strH = o9.a.h(parcel, iU);
                    break;
                case 2:
                    strH2 = o9.a.h(parcel, iU);
                    break;
                case 3:
                    jY = o9.a.y(parcel, iU);
                    break;
                case 4:
                    uri = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
                    break;
                case 5:
                    uri2 = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
                    break;
                case 6:
                    uri3 = (Uri) o9.a.g(parcel, iU, Uri.CREATOR);
                    break;
                default:
                    o9.a.C(parcel, iU);
                    break;
            }
        }
        o9.a.m(parcel, iD);
        return new MostRecentGameInfoEntity(strH, strH2, jY, uri, uri2, uri3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new MostRecentGameInfoEntity[i10];
    }
}
