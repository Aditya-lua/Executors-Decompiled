package p073da;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* JADX INFO: renamed from: da.q */
/* JADX INFO: loaded from: classes.dex */
public final class C4513q extends C4514r {
    @Override // p073da.C4514r
    /* JADX INFO: renamed from: a */
    public final PlayerEntity mo22479a(Parcel parcel) {
        if (GamesDowngradeableSafeParcel.m9433x3(DowngradeableSafeParcel.m9207v3()) || DowngradeableSafeParcel.m9206a(PlayerEntity.class.getCanonicalName())) {
            return super.mo22479a(parcel);
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        return new PlayerEntity(string, string2, string3 == null ? null : Uri.parse(string3), string4 != null ? Uri.parse(string4) : null, parcel.readLong(), -1, -1L, null, null, null, null, null, true, false, parcel.readString(), parcel.readString(), null, null, null, null, -1L, null, null, false, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo22479a(parcel);
    }
}
