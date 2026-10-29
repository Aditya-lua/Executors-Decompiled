package p242k9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiMetadata;

/* JADX INFO: renamed from: k9.t */
/* JADX INFO: loaded from: classes.dex */
public final class C7510t implements Parcelable.Creator {

    /* JADX INFO: renamed from: b */
    public static final C7510t f28868b = new C7510t(new C7511u());

    /* JADX INFO: renamed from: a */
    public final Parcelable.Creator f28869a;

    public C7510t(Parcelable.Creator creator) {
        this.f28869a = creator;
    }

    /* JADX INFO: renamed from: a */
    public static C7510t m31165a() {
        return f28868b;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return C7511u.m31166a(parcel);
        }
        parcel.setDataPosition(iDataPosition - 4);
        return ApiMetadata.m9147v3();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new ApiMetadata[i10];
    }
}
