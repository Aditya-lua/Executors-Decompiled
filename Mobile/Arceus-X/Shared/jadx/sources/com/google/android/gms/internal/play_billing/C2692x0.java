package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2692x0 extends AbstractC2582n0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2703y0 f9412c;

    public C2692x0(C2703y0 c2703y0) {
        Objects.requireNonNull(c2703y0);
        this.f9412c = c2703y0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: e */
    public final boolean mo11169e() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C2703y0 c2703y0 = this.f9412c;
        C2691x.m11815a(i10, c2703y0.f9421e, "index");
        int i11 = i10 + i10;
        Object obj = c2703y0.f9420d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = c2703y0.f9420d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f9412c.f9421e;
    }
}
