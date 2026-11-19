package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends s0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object[] f7014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c1 f7015i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f7016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f7017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f7018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f7019f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f7020g;

    static {
        Object[] objArr = new Object[0];
        f7014h = objArr;
        f7015i = new c1(objArr, 0, objArr, 0, 0);
    }

    public c1(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f7016c = objArr;
        this.f7017d = i10;
        this.f7018e = objArr2;
        this.f7019f = i11;
        this.f7020g = i12;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final int a(Object[] objArr, int i10) {
        Object[] objArr2 = this.f7016c;
        int i11 = this.f7020g;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final int b() {
        return this.f7020g;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final int c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.j0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f7018e;
            if (objArr.length != 0) {
                int iA = g0.a(obj.hashCode());
                while (true) {
                    int i10 = iA & this.f7019f;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iA = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.j0
    public final Object[] f() {
        return this.f7016c;
    }

    @Override // com.google.android.gms.internal.play_billing.s0
    public final n0 h() {
        return n0.h(this.f7016c, this.f7020g);
    }

    @Override // com.google.android.gms.internal.play_billing.s0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7017d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return d().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.s0
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7020g;
    }
}
