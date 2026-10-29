package ia;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.game.GameBadgeEntity;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    @Override // ia.b
    public final GameBadgeEntity a(Parcel parcel) {
        if (GamesDowngradeableSafeParcel.x3(DowngradeableSafeParcel.v3()) || DowngradeableSafeParcel.a(GameBadgeEntity.class.getCanonicalName())) {
            return super.a(parcel);
        }
        int i10 = parcel.readInt();
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        return new GameBadgeEntity(i10, string, string2, string3 == null ? null : Uri.parse(string3));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
