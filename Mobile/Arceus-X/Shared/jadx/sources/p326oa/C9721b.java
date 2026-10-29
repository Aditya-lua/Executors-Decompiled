package p326oa;

import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;

/* JADX INFO: renamed from: oa.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9721b extends C9722c {
    @Override // p326oa.C9722c
    /* JADX INFO: renamed from: a */
    public final RoomEntity mo38485a(Parcel parcel) {
        return (GamesDowngradeableSafeParcel.m9433x3(DowngradeableSafeParcel.m9207v3()) || DowngradeableSafeParcel.m9206a(RoomEntity.class.getCanonicalName())) ? super.mo38485a(parcel) : new RoomEntity();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo38485a(parcel);
    }
}
