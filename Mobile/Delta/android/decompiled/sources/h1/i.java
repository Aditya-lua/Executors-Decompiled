package h1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n0.a2;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements a2 {
    public static i h(int i10, int i11, List<a2.a> list, List<a2.c> list2) {
        x2.g.b(!list2.isEmpty(), "Should contain at least one VideoProfile.");
        return new a(i10, i11, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)), !list.isEmpty() ? list.get(0) : null, list2.get(0));
    }

    public static i i(a2 a2Var) {
        return h(a2Var.a(), a2Var.e(), a2Var.f(), a2Var.b());
    }

    public abstract a2.a j();

    public abstract a2.c k();
}
