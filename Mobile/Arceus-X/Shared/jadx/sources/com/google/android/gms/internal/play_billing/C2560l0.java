package com.google.android.gms.internal.play_billing;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2560l0 extends AbstractC2582n0 {

    /* JADX INFO: renamed from: c */
    public final transient int f9092c;

    /* JADX INFO: renamed from: d */
    public final transient int f9093d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC2582n0 f9094e;

    public C2560l0(AbstractC2582n0 abstractC2582n0, int i10, int i11) {
        Objects.requireNonNull(abstractC2582n0);
        this.f9094e = abstractC2582n0;
        this.f9092c = i10;
        this.f9093d = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: b */
    public final int mo11325b() {
        return this.f9094e.mo11326c() + this.f9092c + this.f9093d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: c */
    public final int mo11326c() {
        return this.f9094e.mo11326c() + this.f9092c;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: e */
    public final boolean mo11169e() {
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: f */
    public final Object[] mo11327f() {
        return this.f9094e.mo11327f();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2582n0
    /* JADX INFO: renamed from: g */
    public final AbstractC2582n0 subList(int i10, int i11) {
        C2691x.m11818d(i10, i11, this.f9093d);
        int i12 = this.f9092c;
        return this.f9094e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C2691x.m11815a(i10, this.f9093d, "index");
        return this.f9094e.get(i10 + this.f9092c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9093d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2582n0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
