package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f7200a = new Object[8];
    public int b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o0 f7201c;

    public final p0 a(Object obj, Object obj2) {
        int i10 = this.b + 1;
        Object[] objArr = this.f7200a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            this.f7200a = Arrays.copyOf(objArr, i0.a(length, i11));
        }
        f0.a(obj, obj2);
        Object[] objArr2 = this.f7200a;
        int i12 = this.b;
        int i13 = i12 + i12;
        objArr2[i13] = obj;
        objArr2[i13 + 1] = obj2;
        this.b = i12 + 1;
        return this;
    }

    public final q0 b() {
        o0 o0Var = this.f7201c;
        if (o0Var != null) {
            throw o0Var.a();
        }
        b1 b1VarG = b1.g(this.b, this.f7200a, this);
        o0 o0Var2 = this.f7201c;
        if (o0Var2 == null) {
            return b1VarG;
        }
        throw o0Var2.a();
    }
}
