package na;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import p325o9.C9717a;

/* JADX INFO: renamed from: na.b */
/* JADX INFO: loaded from: classes.dex */
public class C8984b implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public ParticipantEntity mo36086a(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            C9717a.m38440n(iM38447u);
            C9717a.m38423C(parcel, iM38447u);
        }
        C9717a.m38439m(parcel, iM38424D);
        return new ParticipantEntity();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ParticipantEntity[i10];
    }
}
