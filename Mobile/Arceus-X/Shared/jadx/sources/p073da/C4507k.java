package p073da;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.DowngradeableSafeParcel;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

/* JADX INFO: renamed from: da.k */
/* JADX INFO: loaded from: classes.dex */
public final class C4507k extends C4508l {
    @Override // p073da.C4508l
    /* JADX INFO: renamed from: a */
    public final GameEntity mo22469a(Parcel parcel) {
        if (GamesDowngradeableSafeParcel.m9433x3(DowngradeableSafeParcel.m9207v3()) || DowngradeableSafeParcel.m9206a(GameEntity.class.getCanonicalName())) {
            return super.mo22469a(parcel);
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        Uri uri = string7 == null ? null : Uri.parse(string7);
        String string8 = parcel.readString();
        Uri uri2 = string8 == null ? null : Uri.parse(string8);
        String string9 = parcel.readString();
        Uri uri3 = string9 != null ? Uri.parse(string9) : null;
        boolean z10 = true;
        if (parcel.readInt() <= 0) {
            z10 = false;
        }
        return new GameEntity(string, string2, string3, string4, string5, string6, uri, uri2, uri3, z10, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false, false);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo22469a(parcel);
    }
}
