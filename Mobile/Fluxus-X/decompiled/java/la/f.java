package la;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p9.a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f22023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f22024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f22025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f22026i;

    public f(List list, List list2, List list3, List list4) {
        this.f22023f = list;
        this.f22024g = list2;
        this.f22025h = list3;
        this.f22026i = list4;
    }

    public final List A3() {
        return this.f22025h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f22023f;
        int iA = p9.c.a(parcel);
        p9.c.x(parcel, 1, list, false);
        p9.c.z(parcel, 2, this.f22024g, false);
        p9.c.x(parcel, 3, this.f22025h, false);
        p9.c.x(parcel, 4, this.f22026i, false);
        p9.c.b(parcel, iA);
    }

    public final List zza() {
        return this.f22023f;
    }

    public final List zzb() {
        return this.f22024g;
    }

    public final List zzd() {
        return this.f22026i;
    }
}
