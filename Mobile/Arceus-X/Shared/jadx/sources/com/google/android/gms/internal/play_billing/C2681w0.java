package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2681w0 extends AbstractC2582n0 {

    /* JADX INFO: renamed from: e */
    public static final AbstractC2582n0 f9407e = new C2681w0(new Object[0], 0);

    /* JADX INFO: renamed from: c */
    public final transient Object[] f9408c;

    /* JADX INFO: renamed from: d */
    public final transient int f9409d;

    public C2681w0(Object[] objArr, int i10) {
        this.f9408c = objArr;
        this.f9409d = i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2582n0, com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: a */
    public final int mo11324a(Object[] objArr, int i10) {
        Object[] objArr2 = this.f9408c;
        int i11 = this.f9409d;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: b */
    public final int mo11325b() {
        return this.f9409d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: c */
    public final int mo11326c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: e */
    public final boolean mo11169e() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: f */
    public final Object[] mo11327f() {
        return this.f9408c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C2691x.m11815a(i10, this.f9409d, "index");
        Object obj = this.f9408c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9409d;
    }
}
