package ka;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.games.internal.player.StockProfileImageEntity;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = p9.b.D(parcel);
        String strH = BuildConfig.FLAVOR;
        String strH2 = null;
        Uri uri = null;
        while (parcel.dataPosition() < iD) {
            int iU = p9.b.u(parcel);
            int iN = p9.b.n(iU);
            if (iN == 1) {
                strH2 = p9.b.h(parcel, iU);
            } else if (iN == 2) {
                uri = (Uri) p9.b.g(parcel, iU, Uri.CREATOR);
            } else if (iN != 3) {
                p9.b.C(parcel, iU);
            } else {
                strH = p9.b.h(parcel, iU);
            }
        }
        p9.b.m(parcel, iD);
        return new StockProfileImageEntity(strH2, uri, strH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new StockProfileImageEntity[i10];
    }
}
