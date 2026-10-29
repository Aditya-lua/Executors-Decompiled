package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f5 extends cb implements pc {
    public f5() {
        throw null;
    }

    public final f5 A(int i10, d5 d5Var) {
        p();
        ((g5) this.b).Z(i10, (e5) d5Var.t());
        return this;
    }

    public final List C() {
        return Collections.unmodifiableList(((g5) this.b).O());
    }

    public final f5 D() {
        p();
        ((g5) this.b).a0();
        return this;
    }

    public final f5 E() {
        p();
        ((g5) this.b).b0();
        return this;
    }

    public final List G() {
        return Collections.unmodifiableList(((g5) this.b).R());
    }

    public final String J() {
        return ((g5) this.b).S();
    }

    public final int x() {
        return ((g5) this.b).L();
    }

    public final e5 z(int i10) {
        return ((g5) this.b).N(i10);
    }

    public /* synthetic */ f5(byte[] bArr) {
        super(g5.zzu);
    }
}
