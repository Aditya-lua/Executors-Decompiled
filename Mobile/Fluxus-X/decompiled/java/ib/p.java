package ib;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p extends p9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LocationRequest f19323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<o9.e> f19324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f19325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19326i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19327j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f19328k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f19329l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f19330m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f19331n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f19332o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f19333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final List<o9.e> f19322q = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<p> CREATOR = new q();

    public p(LocationRequest locationRequest, List<o9.e> list, String str, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, long j10) {
        this.f19323f = locationRequest;
        this.f19324g = list;
        this.f19325h = str;
        this.f19326i = z10;
        this.f19327j = z11;
        this.f19328k = z12;
        this.f19329l = str2;
        this.f19330m = z13;
        this.f19331n = z14;
        this.f19332o = str3;
        this.f19333p = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (o9.q.b(this.f19323f, pVar.f19323f) && o9.q.b(this.f19324g, pVar.f19324g) && o9.q.b(this.f19325h, pVar.f19325h) && this.f19326i == pVar.f19326i && this.f19327j == pVar.f19327j && this.f19328k == pVar.f19328k && o9.q.b(this.f19329l, pVar.f19329l) && this.f19330m == pVar.f19330m && this.f19331n == pVar.f19331n && o9.q.b(this.f19332o, pVar.f19332o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f19323f.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f19323f);
        if (this.f19325h != null) {
            sb2.append(" tag=");
            sb2.append(this.f19325h);
        }
        if (this.f19329l != null) {
            sb2.append(" moduleId=");
            sb2.append(this.f19329l);
        }
        if (this.f19332o != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.f19332o);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.f19326i);
        sb2.append(" clients=");
        sb2.append(this.f19324g);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.f19327j);
        if (this.f19328k) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.f19330m) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.f19331n) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = p9.c.a(parcel);
        p9.c.t(parcel, 1, this.f19323f, i10, false);
        p9.c.z(parcel, 5, this.f19324g, false);
        p9.c.v(parcel, 6, this.f19325h, false);
        p9.c.c(parcel, 7, this.f19326i);
        p9.c.c(parcel, 8, this.f19327j);
        p9.c.c(parcel, 9, this.f19328k);
        p9.c.v(parcel, 10, this.f19329l, false);
        p9.c.c(parcel, 11, this.f19330m);
        p9.c.c(parcel, 12, this.f19331n);
        p9.c.v(parcel, 13, this.f19332o, false);
        p9.c.r(parcel, 14, this.f19333p);
        p9.c.b(parcel, iA);
    }
}
