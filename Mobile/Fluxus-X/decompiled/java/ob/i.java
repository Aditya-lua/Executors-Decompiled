package ob;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p9.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public bf f27447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f27448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f27449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f27450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i0 f27451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f27452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i0 f27453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f27454o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i0 f27455p;

    public i(i iVar) {
        o9.s.l(iVar);
        this.f27445f = iVar.f27445f;
        this.f27446g = iVar.f27446g;
        this.f27447h = iVar.f27447h;
        this.f27448i = iVar.f27448i;
        this.f27449j = iVar.f27449j;
        this.f27450k = iVar.f27450k;
        this.f27451l = iVar.f27451l;
        this.f27452m = iVar.f27452m;
        this.f27453n = iVar.f27453n;
        this.f27454o = iVar.f27454o;
        this.f27455p = iVar.f27455p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.v(parcel, 2, this.f27445f, false);
        p9.c.v(parcel, 3, this.f27446g, false);
        p9.c.t(parcel, 4, this.f27447h, i10, false);
        p9.c.r(parcel, 5, this.f27448i);
        p9.c.c(parcel, 6, this.f27449j);
        p9.c.v(parcel, 7, this.f27450k, false);
        p9.c.t(parcel, 8, this.f27451l, i10, false);
        p9.c.r(parcel, 9, this.f27452m);
        p9.c.t(parcel, 10, this.f27453n, i10, false);
        p9.c.r(parcel, 11, this.f27454o);
        p9.c.t(parcel, 12, this.f27455p, i10, false);
        p9.c.b(parcel, iA);
    }

    public i(String str, String str2, bf bfVar, long j10, boolean z10, String str3, i0 i0Var, long j11, i0 i0Var2, long j12, i0 i0Var3) {
        this.f27445f = str;
        this.f27446g = str2;
        this.f27447h = bfVar;
        this.f27448i = j10;
        this.f27449j = z10;
        this.f27450k = str3;
        this.f27451l = i0Var;
        this.f27452m = j11;
        this.f27453n = i0Var2;
        this.f27454o = j12;
        this.f27455p = i0Var3;
    }
}
