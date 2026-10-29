package p192ia;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.game.GameBadgeEntity;

/* JADX INFO: renamed from: ia.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6716a extends C6717b {
    @Override // p192ia.C6717b
    /* JADX INFO: renamed from: a */
    public final GameBadgeEntity mo28811a(Parcel parcel) {
        if (GamesDowngradeableSafeParcel.m9433x3(DowngradeableSafeParcel.m9207v3()) || DowngradeableSafeParcel.m9206a(GameBadgeEntity.class.getCanonicalName())) {
            return super.mo28811a(parcel);
        }
        int i10 = parcel.readInt();
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        return new GameBadgeEntity(i10, string, string2, string3 == null ? null : Uri.parse(string3));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo28811a(parcel);
    }
}
