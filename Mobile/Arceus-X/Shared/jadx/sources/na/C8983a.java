package na;

import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.ParticipantEntity;

/* JADX INFO: renamed from: na.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8983a extends C8984b {
    @Override // na.C8984b
    /* JADX INFO: renamed from: a */
    public final ParticipantEntity mo36086a(Parcel parcel) {
        return (GamesDowngradeableSafeParcel.m9433x3(DowngradeableSafeParcel.m9207v3()) || DowngradeableSafeParcel.m9206a(ParticipantEntity.class.getCanonicalName())) ? super.mo36086a(parcel) : new ParticipantEntity();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo36086a(parcel);
    }
}
