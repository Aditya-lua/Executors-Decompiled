package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z6 extends gb implements tc {
    public z6() {
        throw null;
    }

    public final int B() {
        return ((c7) this.b).G();
    }

    public final e7 C(int i10) {
        return ((c7) this.b).H(i10);
    }

    public final z6 D(int i10, d7 d7Var) {
        r();
        ((c7) this.b).O(i10, (e7) d7Var.v());
        return this;
    }

    public final z6 F(d7 d7Var) {
        r();
        ((c7) this.b).P((e7) d7Var.v());
        return this;
    }

    public final z6 G(Iterable iterable) {
        r();
        ((c7) this.b).R(iterable);
        return this;
    }

    public final z6 H() {
        r();
        ((c7) this.b).S();
        return this;
    }

    public final String J() {
        return ((c7) this.b).J();
    }

    public final z6 M(String str) {
        r();
        ((c7) this.b).U(str);
        return this;
    }

    public final z6 O(String str) {
        r();
        ((c7) this.b).V(str);
        return this;
    }

    public final List z() {
        return Collections.unmodifiableList(((c7) this.b).F());
    }

    public /* synthetic */ z6(byte[] bArr) {
        super(c7.zzh);
    }
}
