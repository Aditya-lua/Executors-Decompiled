package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import hb.p;
import java.util.Collections;
import java.util.List;
import n9.k;
import o9.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzba extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LocationRequest f6342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<ClientIdentity> f6343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f6346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f6347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f6349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6350n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f6351o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f6352p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final List<ClientIdentity> f6341q = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<zzba> CREATOR = new p();

    public zzba(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, long j10) {
        this.f6342f = locationRequest;
        this.f6343g = list;
        this.f6344h = str;
        this.f6345i = z10;
        this.f6346j = z11;
        this.f6347k = z12;
        this.f6348l = str2;
        this.f6349m = z13;
        this.f6350n = z14;
        this.f6351o = str3;
        this.f6352p = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (k.b(this.f6342f, zzbaVar.f6342f) && k.b(this.f6343g, zzbaVar.f6343g) && k.b(this.f6344h, zzbaVar.f6344h) && this.f6345i == zzbaVar.f6345i && this.f6346j == zzbaVar.f6346j && this.f6347k == zzbaVar.f6347k && k.b(this.f6348l, zzbaVar.f6348l) && this.f6349m == zzbaVar.f6349m && this.f6350n == zzbaVar.f6350n && k.b(this.f6351o, zzbaVar.f6351o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6342f.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6342f);
        if (this.f6344h != null) {
            sb2.append(" tag=");
            sb2.append(this.f6344h);
        }
        if (this.f6348l != null) {
            sb2.append(" moduleId=");
            sb2.append(this.f6348l);
        }
        if (this.f6351o != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.f6351o);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.f6345i);
        sb2.append(" clients=");
        sb2.append(this.f6343g);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.f6346j);
        if (this.f6347k) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.f6349m) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.f6350n) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.t(parcel, 1, this.f6342f, i10, false);
        b.z(parcel, 5, this.f6343g, false);
        b.v(parcel, 6, this.f6344h, false);
        b.c(parcel, 7, this.f6345i);
        b.c(parcel, 8, this.f6346j);
        b.c(parcel, 9, this.f6347k);
        b.v(parcel, 10, this.f6348l, false);
        b.c(parcel, 11, this.f6349m);
        b.c(parcel, 12, this.f6350n);
        b.v(parcel, 13, this.f6351o, false);
        b.r(parcel, 14, this.f6352p);
        b.b(parcel, iA);
    }
}
