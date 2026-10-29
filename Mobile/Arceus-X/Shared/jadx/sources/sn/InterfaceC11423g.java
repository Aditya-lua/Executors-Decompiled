package sn;

import java.util.Objects;
import p338on.C9830l;
import p388qn.AbstractC10623s;

/* JADX INFO: renamed from: sn.g */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC11423g {
    /* JADX INFO: renamed from: a */
    static InterfaceC11423g m42792a() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    static InterfaceC11423g m42793b(AbstractC10623s abstractC10623s, C11424h c11424h) {
        Objects.requireNonNull(abstractC10623s, "node must not be null");
        Objects.requireNonNull(c11424h, "position must not be null");
        return new C9830l(abstractC10623s, c11424h);
    }
}
