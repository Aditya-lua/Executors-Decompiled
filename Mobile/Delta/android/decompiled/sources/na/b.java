package na;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.ParticipantEntity;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable.Creator {
    public ParticipantEntity a(Parcel parcel) {
        int iD = o9.a.D(parcel);
        while (parcel.dataPosition() < iD) {
            int iU = o9.a.u(parcel);
            o9.a.n(iU);
            o9.a.C(parcel, iU);
        }
        o9.a.m(parcel, iD);
        return new ParticipantEntity();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ParticipantEntity[i10];
    }
}
