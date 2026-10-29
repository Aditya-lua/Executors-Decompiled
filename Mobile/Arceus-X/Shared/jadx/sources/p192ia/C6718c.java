package p192ia;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.games.internal.game.ScreenshotEntity;
import p325o9.C9717a;

/* JADX INFO: renamed from: ia.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6718c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        int iM38449w = 0;
        Uri uri = null;
        int iM38449w2 = 0;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            int iM38440n = C9717a.m38440n(iM38447u);
            if (iM38440n == 1) {
                uri = (Uri) C9717a.m38433g(parcel, iM38447u, Uri.CREATOR);
            } else if (iM38440n == 2) {
                iM38449w = C9717a.m38449w(parcel, iM38447u);
            } else if (iM38440n != 3) {
                C9717a.m38423C(parcel, iM38447u);
            } else {
                iM38449w2 = C9717a.m38449w(parcel, iM38447u);
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new ScreenshotEntity(uri, iM38449w, iM38449w2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new ScreenshotEntity[i10];
    }
}
