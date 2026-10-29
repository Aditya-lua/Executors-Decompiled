package oa;

import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    @Override // oa.c
    public final RoomEntity a(Parcel parcel) {
        return (GamesDowngradeableSafeParcel.x3(DowngradeableSafeParcel.v3()) || DowngradeableSafeParcel.a(RoomEntity.class.getCanonicalName())) ? super.a(parcel) : new RoomEntity();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }
}
