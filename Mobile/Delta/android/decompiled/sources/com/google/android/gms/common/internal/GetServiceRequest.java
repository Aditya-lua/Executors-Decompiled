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
    public static final Scope[] f5847t = new Scope[0];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Feature[] f5848u = new Feature[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f5852i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IBinder f5853j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Scope[] f5854k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bundle f5855l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Account f5856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Feature[] f5857n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Feature[] f5858o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f5859p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f5860q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5861r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f5862s;

    public GetServiceRequest(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f5847t : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f5848u : featureArr;
        featureArr2 = featureArr2 == null ? f5848u : featureArr2;
        this.f5849f = i10;
        this.f5850g = i11;
        this.f5851h = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f5852i = "com.google.android.gms";
        } else {
            this.f5852i = str;
        }
        if (i10 < 2) {
            this.f5856m = iBinder != null ? a.t2(b.a.s2(iBinder)) : null;
        } else {
            this.f5853j = iBinder;
            this.f5856m = account;
        }
        this.f5854k = scopeArr;
        this.f5855l = bundle;
        this.f5857n = featureArr;
        this.f5858o = featureArr2;
        this.f5859p = z10;
        this.f5860q = i13;
        this.f5861r = z11;
        this.f5862s = str2;
    }

    public String v3() {
        return this.f5862s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        d1.a(this, parcel, i10);
    }
}
