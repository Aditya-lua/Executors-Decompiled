package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends h0 {
    public r0() {
        super(4);
    }

    public final r0 b(Object obj) {
        obj.getClass();
        int length = this.f7086a.length;
        int iA = i0.a(length, this.b + 1);
        if (iA > length || this.f7087c) {
            this.f7086a = Arrays.copyOf(this.f7086a, iA);
            this.f7087c = false;
        }
        Object[] objArr = this.f7086a;
        int i10 = this.b;
        this.b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    public final s0 c() {
        int i10 = this.b;
        if (i10 == 0) {
            return c1.f7015i;
        }
        if (i10 == 1) {
            Object obj = this.f7086a[0];
            Objects.requireNonNull(obj);
            return new e1(obj);
        }
        s0 s0VarM = s0.m(i10, this.f7086a);
        this.b = s0VarM.size();
        this.f7087c = true;
        return s0VarM;
    }
}
