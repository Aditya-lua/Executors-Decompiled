package na;

import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.ParticipantEntity;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    @Override // na.b
    public final ParticipantEntity a(Parcel parcel) {
        return (GamesDowngradeableSafeParcel.x3(DowngradeableSafeParcel.v3()) || DowngradeableSafeParcel.a(ParticipantEntity.class.getCanonicalName())) ? super.a(parcel) : new ParticipantEntity();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
