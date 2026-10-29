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
import p305n9.C8928d1;

/* JADX INFO: loaded from: classes.dex */
public class GetServiceRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C8928d1();

    /* JADX INFO: renamed from: t */
    public static final Scope[] f7463t = new Scope[0];

    /* JADX INFO: renamed from: u */
    public static final Feature[] f7464u = new Feature[0];

    /* JADX INFO: renamed from: f */
    public final int f7465f;

    /* JADX INFO: renamed from: g */
    public final int f7466g;

    /* JADX INFO: renamed from: h */
    public final int f7467h;

    /* JADX INFO: renamed from: i */
    public String f7468i;

    /* JADX INFO: renamed from: j */
    public IBinder f7469j;

    /* JADX INFO: renamed from: k */
    public Scope[] f7470k;

    /* JADX INFO: renamed from: l */
    public Bundle f7471l;

    /* JADX INFO: renamed from: m */
    public Account f7472m;

    /* JADX INFO: renamed from: n */
    public Feature[] f7473n;

    /* JADX INFO: renamed from: o */
    public Feature[] f7474o;

    /* JADX INFO: renamed from: p */
    public final boolean f7475p;

    /* JADX INFO: renamed from: q */
    public final int f7476q;

    /* JADX INFO: renamed from: r */
    public boolean f7477r;

    /* JADX INFO: renamed from: s */
    public final String f7478s;

    public GetServiceRequest(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f7463t : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f7464u : featureArr;
        featureArr2 = featureArr2 == null ? f7464u : featureArr2;
        this.f7465f = i10;
        this.f7466g = i11;
        this.f7467h = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f7468i = "com.google.android.gms";
        } else {
            this.f7468i = str;
        }
        if (i10 < 2) {
            this.f7472m = iBinder != null ? BinderC1902a.m9218t2(InterfaceC1903b.a.m9219s2(iBinder)) : null;
        } else {
            this.f7469j = iBinder;
            this.f7472m = account;
        }
        this.f7470k = scopeArr;
        this.f7471l = bundle;
        this.f7473n = featureArr;
        this.f7474o = featureArr2;
        this.f7475p = z10;
        this.f7476q = i13;
        this.f7477r = z11;
        this.f7478s = str2;
    }

    /* JADX INFO: renamed from: v3 */
    public String m9209v3() {
        return this.f7478s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        C8928d1.m35978a(this, parcel, i10);
    }
}
