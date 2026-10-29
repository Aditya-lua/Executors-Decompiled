package k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    public static final t b = new t(new u());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable.Creator f22286a;

    public t(Parcelable.Creator creator) {
        this.f22286a = creator;
    }

    public static t a() {
        return b;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return u.a(parcel);
        }
        parcel.setDataPosition(iDataPosition - 4);
        return ApiMetadata.v3();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new ApiMetadata[i10];
    }
}
