package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j5 extends gb implements tc {
    public j5() {
        throw null;
    }

    public final i5 B(int i10) {
        return ((k5) this.b).L(i10);
    }

    public final j5 C(int i10, h5 h5Var) {
        r();
        ((k5) this.b).Z(i10, (i5) h5Var.v());
        return this;
    }

    public final List D() {
        return Collections.unmodifiableList(((k5) this.b).M());
    }

    public final j5 F() {
        r();
        ((k5) this.b).a0();
        return this;
    }

    public final j5 G() {
        r();
        ((k5) this.b).b0();
        return this;
    }

    public final List H() {
        return Collections.unmodifiableList(((k5) this.b).P());
    }

    public final String J() {
        return ((k5) this.b).R();
    }

    public final int z() {
        return ((k5) this.b).K();
    }

    public /* synthetic */ j5(byte[] bArr) {
        super(k5.zzu);
    }
}
