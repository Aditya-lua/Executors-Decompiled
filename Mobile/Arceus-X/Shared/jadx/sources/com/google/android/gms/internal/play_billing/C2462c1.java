package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2462c1 extends AbstractC2637s0 {

    /* JADX INFO: renamed from: h */
    public static final Object[] f8934h;

    /* JADX INFO: renamed from: i */
    public static final C2462c1 f8935i;

    /* JADX INFO: renamed from: c */
    public final transient Object[] f8936c;

    /* JADX INFO: renamed from: d */
    public final transient int f8937d;

    /* JADX INFO: renamed from: e */
    public final transient Object[] f8938e;

    /* JADX INFO: renamed from: f */
    public final transient int f8939f;

    /* JADX INFO: renamed from: g */
    public final transient int f8940g;

    static {
        Object[] objArr = new Object[0];
        f8934h = objArr;
        f8935i = new C2462c1(objArr, 0, objArr, 0, 0);
    }

    public C2462c1(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f8936c = objArr;
        this.f8937d = i10;
        this.f8938e = objArr2;
        this.f8939f = i11;
        this.f8940g = i12;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: a */
    public final int mo11324a(Object[] objArr, int i10) {
        Object[] objArr2 = this.f8936c;
        int i11 = this.f8940g;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: b */
    public final int mo11325b() {
        return this.f8940g;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: c */
    public final int mo11326c() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f8938e;
            if (objArr.length != 0) {
                int iM11418a = C2505g0.m11418a(obj.hashCode());
                while (true) {
                    int i10 = iM11418a & this.f8939f;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM11418a = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2538j0
    /* JADX INFO: renamed from: f */
    public final Object[] mo11327f() {
        return this.f8936c;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2637s0
    /* JADX INFO: renamed from: h */
    public final AbstractC2582n0 mo11328h() {
        return AbstractC2582n0.m11597h(this.f8936c, this.f8940g);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2637s0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f8937d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo11376d().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2637s0
    /* JADX INFO: renamed from: l */
    public final boolean mo11329l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f8940g;
    }
}
