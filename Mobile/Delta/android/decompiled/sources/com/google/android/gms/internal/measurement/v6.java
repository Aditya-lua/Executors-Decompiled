package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v6 extends cb implements pc {
    public v6() {
        throw null;
    }

    public final a7 A(int i10) {
        return ((y6) this.b).H(i10);
    }

    public final v6 C(int i10, z6 z6Var) {
        p();
        ((y6) this.b).Q(i10, (a7) z6Var.t());
        return this;
    }

    public final v6 D(z6 z6Var) {
        p();
        ((y6) this.b).R((a7) z6Var.t());
        return this;
    }

    public final v6 E(Iterable iterable) {
        p();
        ((y6) this.b).S(iterable);
        return this;
    }

    public final v6 G() {
        p();
        ((y6) this.b).T();
        return this;
    }

    public final String J() {
        return ((y6) this.b).K();
    }

    public final v6 K(String str) {
        p();
        ((y6) this.b).U(str);
        return this;
    }

    public final v6 N(String str) {
        p();
        ((y6) this.b).V(str);
        return this;
    }

    public final List x() {
        return Collections.unmodifiableList(((y6) this.b).F());
    }

    public final int z() {
        return ((y6) this.b).G();
    }

    public /* synthetic */ v6(byte[] bArr) {
        super(y6.zzh);
    }
}
