package ob;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ee extends p9.a {
    public static final Parcelable.Creator<ee> CREATOR = new fe();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f27308f;

    public ee(List list) {
        this.f27308f = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f27308f;
        int iA = p9.c.a(parcel);
        p9.c.z(parcel, 1, list, false);
        p9.c.b(parcel, iA);
    }
}
