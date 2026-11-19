package rb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import l9.p;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p9.a implements p {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f30633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f30634g;

    public h(List list, String str) {
        this.f30633f = list;
        this.f30634g = str;
    }

    @Override // l9.p
    public final Status n() {
        return this.f30634g != null ? Status.f6108k : Status.f6112o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f30633f;
        int iA = p9.c.a(parcel);
        p9.c.x(parcel, 1, list, false);
        p9.c.v(parcel, 2, this.f30634g, false);
        p9.c.b(parcel, iA);
    }
}
