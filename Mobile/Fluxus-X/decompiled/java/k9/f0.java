package k9;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends p9.a {
    public static final Parcelable.Creator<f0> CREATOR = new g0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f21245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f21246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f21247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f21248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f21249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f21250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f21251l;

    public f0(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12, boolean z13, boolean z14) {
        this.f21245f = str;
        this.f21246g = z10;
        this.f21247h = z11;
        this.f21248i = (Context) z9.b.t2(z9.a.AbstractBinderC0786a.s2(iBinder));
        this.f21249j = z12;
        this.f21250k = z13;
        this.f21251l = z14;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, z9.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f21245f;
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 1, str, false);
        p9.c.c(parcel, 2, this.f21246g);
        p9.c.c(parcel, 3, this.f21247h);
        p9.c.m(parcel, 4, z9.b.u2(this.f21248i), false);
        p9.c.c(parcel, 5, this.f21249j);
        p9.c.c(parcel, 6, this.f21250k);
        p9.c.c(parcel, 8, this.f21251l);
        p9.c.b(parcel, iA);
    }
}
