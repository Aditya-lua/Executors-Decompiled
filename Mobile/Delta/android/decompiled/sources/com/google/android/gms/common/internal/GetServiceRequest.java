package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import n9.d1;

/* JADX INFO: loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new d1();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Scope[] f5774t = new Scope[0];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Feature[] f5775u = new Feature[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f5779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IBinder f5780j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Scope[] f5781k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bundle f5782l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Account f5783m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Feature[] f5784n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Feature[] f5785o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f5786p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f5787q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5788r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f5789s;

    public GetServiceRequest(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f5774t : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f5775u : featureArr;
        featureArr2 = featureArr2 == null ? f5775u : featureArr2;
        this.f5776f = i10;
        this.f5777g = i11;
        this.f5778h = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f5779i = "com.google.android.gms";
        } else {
            this.f5779i = str;
        }
        if (i10 < 2) {
            this.f5783m = iBinder != null ? a.t2(b.a.s2(iBinder)) : null;
        } else {
            this.f5780j = iBinder;
            this.f5783m = account;
        }
        this.f5781k = scopeArr;
        this.f5782l = bundle;
        this.f5784n = featureArr;
        this.f5785o = featureArr2;
        this.f5786p = z10;
        this.f5787q = i13;
        this.f5788r = z11;
        this.f5789s = str2;
    }

    public String v3() {
        return this.f5789s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        d1.a(this, parcel, i10);
    }
}
