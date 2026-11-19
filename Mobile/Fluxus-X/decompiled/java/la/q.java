package la;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q extends p9.a {
    public static final Parcelable.Creator<q> CREATOR = new r();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22040f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22041g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ComponentName f22043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f22044j;

    public q(long j10, String str, int i10, ComponentName componentName, String str2) {
        this.f22040f = j10;
        this.f22041g = str;
        this.f22042h = i10;
        this.f22043i = componentName;
        this.f22044j = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.r(parcel, 1, this.f22040f);
        p9.c.v(parcel, 2, this.f22041g, false);
        p9.c.n(parcel, 3, this.f22042h);
        p9.c.t(parcel, 4, this.f22043i, i10, false);
        p9.c.v(parcel, 5, this.f22044j, false);
        p9.c.b(parcel, iA);
    }

    public final int zza() {
        return this.f22042h;
    }

    public final String zzb() {
        return this.f22044j;
    }
}
