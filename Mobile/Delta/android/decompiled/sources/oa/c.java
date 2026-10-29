package oa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;

/* JADX INFO: loaded from: classes.dex */
public class c implements Parcelable.Creator {
    public RoomEntity a(Parcel parcel) {
        int iD = o9.a.D(parcel);
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            o9.a.n(iU);
            o9.a.C(parcel, iU);
        }
        o9.a.m(parcel, iD);
        return new RoomEntity();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RoomEntity[i10];
    }
}
