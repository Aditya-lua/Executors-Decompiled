package k9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends p9.a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f21253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f21254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f21257j;

    public h0(boolean z10, String str, int i10, int i11, long j10) {
        this.f21253f = z10;
        this.f21254g = str;
        this.f21255h = p0.a(i10) - 1;
        this.f21256i = s.a(i11) - 1;
        this.f21257j = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.c(parcel, 1, this.f21253f);
        p9.c.v(parcel, 2, this.f21254g, false);
        p9.c.n(parcel, 3, this.f21255h);
        p9.c.n(parcel, 4, this.f21256i);
        p9.c.r(parcel, 5, this.f21257j);
        p9.c.b(parcel, iA);
    }

    public final boolean zza() {
        return this.f21253f;
    }

    public final String zzb() {
        return this.f21254g;
    }

    public final long zzc() {
        return this.f21257j;
    }

    public final int zzd() {
        return p0.a(this.f21255h);
    }

    public final int zze() {
        return s.a(this.f21256i);
    }
}
