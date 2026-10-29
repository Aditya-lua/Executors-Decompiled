package d0;

import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import n0.k3;
import z.h5;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CaptureSessionOnClosedNotCalledQuirk f14251a;

    @FunctionalInterface
    public interface a {
        void a(h5 h5Var);
    }

    public h(k3 k3Var) {
        this.f14251a = (CaptureSessionOnClosedNotCalledQuirk) k3Var.b(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    public final void a(Set<h5> set) {
        for (h5 h5Var : set) {
            h5Var.b().r(h5Var);
        }
    }

    public final void b(Set<h5> set) {
        for (h5 h5Var : set) {
            h5Var.b().s(h5Var);
        }
    }

    public void c(h5 h5Var, List<h5> list, List<h5> list2, a aVar) {
        h5 next;
        h5 next2;
        if (d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<h5> it = list.iterator();
            while (it.hasNext() && (next2 = it.next()) != h5Var) {
                linkedHashSet.add(next2);
            }
            b(linkedHashSet);
        }
        aVar.a(h5Var);
        if (d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<h5> it2 = list2.iterator();
            while (it2.hasNext() && (next = it2.next()) != h5Var) {
                linkedHashSet2.add(next);
            }
            a(linkedHashSet2);
        }
    }

    public boolean d() {
        return this.f14251a != null;
    }
}
