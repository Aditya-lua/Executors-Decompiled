package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import p166hb.C6342p;
import p305n9.C8947k;
import p325o9.C9718b;

/* JADX INFO: loaded from: classes.dex */
public final class zzba extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: f */
    public final LocationRequest f8062f;

    /* JADX INFO: renamed from: g */
    public final List<ClientIdentity> f8063g;

    /* JADX INFO: renamed from: h */
    public final String f8064h;

    /* JADX INFO: renamed from: i */
    public final boolean f8065i;

    /* JADX INFO: renamed from: j */
    public final boolean f8066j;

    /* JADX INFO: renamed from: k */
    public final boolean f8067k;

    /* JADX INFO: renamed from: l */
    public final String f8068l;

    /* JADX INFO: renamed from: m */
    public final boolean f8069m;

    /* JADX INFO: renamed from: n */
    public boolean f8070n;

    /* JADX INFO: renamed from: o */
    public String f8071o;

    /* JADX INFO: renamed from: p */
    public long f8072p;

    /* JADX INFO: renamed from: q */
    public static final List<ClientIdentity> f8061q = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<zzba> CREATOR = new C6342p();

    public zzba(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z10, boolean z11, boolean z12, String str2, boolean z13, boolean z14, String str3, long j10) {
        this.f8062f = locationRequest;
        this.f8063g = list;
        this.f8064h = str;
        this.f8065i = z10;
        this.f8066j = z11;
        this.f8067k = z12;
        this.f8068l = str2;
        this.f8069m = z13;
        this.f8070n = z14;
        this.f8071o = str3;
        this.f8072p = j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            zzba zzbaVar = (zzba) obj;
            if (C8947k.m36026b(this.f8062f, zzbaVar.f8062f) && C8947k.m36026b(this.f8063g, zzbaVar.f8063g) && C8947k.m36026b(this.f8064h, zzbaVar.f8064h) && this.f8065i == zzbaVar.f8065i && this.f8066j == zzbaVar.f8066j && this.f8067k == zzbaVar.f8067k && C8947k.m36026b(this.f8068l, zzbaVar.f8068l) && this.f8069m == zzbaVar.f8069m && this.f8070n == zzbaVar.f8070n && C8947k.m36026b(this.f8071o, zzbaVar.f8071o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8062f.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8062f);
        if (this.f8064h != null) {
            sb2.append(" tag=");
            sb2.append(this.f8064h);
        }
        if (this.f8068l != null) {
            sb2.append(" moduleId=");
            sb2.append(this.f8068l);
        }
        if (this.f8071o != null) {
            sb2.append(" contextAttributionTag=");
            sb2.append(this.f8071o);
        }
        sb2.append(" hideAppOps=");
        sb2.append(this.f8065i);
        sb2.append(" clients=");
        sb2.append(this.f8063g);
        sb2.append(" forceCoarseLocation=");
        sb2.append(this.f8066j);
        if (this.f8067k) {
            sb2.append(" exemptFromBackgroundThrottle");
        }
        if (this.f8069m) {
            sb2.append(" locationSettingsIgnored");
        }
        if (this.f8070n) {
            sb2.append(" inaccurateLocationsDelayed");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38476t(parcel, 1, this.f8062f, i10, false);
        C9718b.m38482z(parcel, 5, this.f8063g, false);
        C9718b.m38478v(parcel, 6, this.f8064h, false);
        C9718b.m38459c(parcel, 7, this.f8065i);
        C9718b.m38459c(parcel, 8, this.f8066j);
        C9718b.m38459c(parcel, 9, this.f8067k);
        C9718b.m38478v(parcel, 10, this.f8068l, false);
        C9718b.m38459c(parcel, 11, this.f8069m);
        C9718b.m38459c(parcel, 12, this.f8070n);
        C9718b.m38478v(parcel, 13, this.f8071o, false);
        C9718b.m38474r(parcel, 14, this.f8072p);
        C9718b.m38458b(parcel, iM38457a);
    }
}
