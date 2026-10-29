package pa;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import p325o9.C9717a;

/* JADX INFO: renamed from: pa.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10183a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        Contents contents = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            if (C9717a.m38440n(iM38447u) != 1) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                contents = (Contents) C9717a.m38433g(parcel, iM38447u, Contents.CREATOR);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new SnapshotContentsEntity(contents);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SnapshotContentsEntity[i10];
    }
}
