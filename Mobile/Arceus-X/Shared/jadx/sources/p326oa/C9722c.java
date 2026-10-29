package p326oa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import p325o9.C9717a;

/* JADX INFO: renamed from: oa.c */
/* JADX INFO: loaded from: classes.dex */
public class C9722c implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public RoomEntity mo38485a(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            C9717a.m38440n(iM38447u);
            C9717a.m38423C(parcel, iM38447u);
        }
        C9717a.m38439m(parcel, iM38424D);
        return new RoomEntity();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RoomEntity[i10];
    }
}
