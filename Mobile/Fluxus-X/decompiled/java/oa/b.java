package oa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.ParticipantEntity;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    public ParticipantEntity a(Parcel parcel) {
        int iD = p9.b.D(parcel);
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            p9.b.n(iU);
            p9.b.C(parcel, iU);
        }
        p9.b.m(parcel, iD);
        return new ParticipantEntity();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ParticipantEntity[i10];
    }
}
