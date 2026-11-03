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
    public final LocationRequest f6415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<ClientIdentity> f6416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f6419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f6420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f6421l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f6422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6423n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f6424o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f6425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final List<ClientIdentity> f6414q = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<zzba> CREATOR = new p();

    public zzba(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, long j10) {
        this.f6415f = locationRequest;
        this.f6416g = list;
        this.f6417h = str;
        this.f6418i = z10;
        this.f6419j = z11;
        this.f6420k = z12;
        this.f6421l = str2;
        this.f6422m = z13;
        this.f6423n = z14;
        this.f6424o = str3;
        this.f6425p = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (k.b(this.f6415f, zzbaVar.f6415f) && k.b(this.f6416g, zzbaVar.f6416g) && k.b(this.f6417h, zzbaVar.f6417h) && this.f6418i == zzbaVar.f6418i && this.f6419j == zzbaVar.f6419j && this.f6420k == zzbaVar.f6420k && k.b(this.f6421l, zzbaVar.f6421l) && this.f6422m == zzbaVar.f6422m && this.f6423n == zzbaVar.f6423n && k.b(this.f6424o, zzbaVar.f6424o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6415f.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6415f);
        if (this.f6417h != null) {
            sb2.append(" tag=");
            sb2.append(this.f6417h);
        }
        if (this.f6421l != null) {
            sb2.append(" moduleId=");
            sb2.append(this.f6421l);
        }
        if (this.f6424o != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.f6424o);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.f6418i);
        sb2.append(" clients=");
        sb2.append(this.f6416g);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.f6419j);
        if (this.f6420k) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.f6422m) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.f6423n) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = b.a(parcel);
        b.t(parcel, 1, this.f6415f, i10, false);
        b.z(parcel, 5, this.f6416g, false);
        b.v(parcel, 6, this.f6417h, false);
        b.c(parcel, 7, this.f6418i);
        b.c(parcel, 8, this.f6419j);
        b.c(parcel, 9, this.f6420k);
        b.v(parcel, 10, this.f6421l, false);
        b.c(parcel, 11, this.f6422m);
        b.c(parcel, 12, this.f6423n);
        b.v(parcel, 13, this.f6424o, false);
        b.r(parcel, 14, this.f6425p);
        b.b(parcel, iA);
    }
}
