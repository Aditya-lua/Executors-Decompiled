package us;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p500vs.C12258a;

/* JADX INFO: renamed from: us.q */
/* JADX INFO: loaded from: classes3.dex */
public class C11951q implements InterfaceC11944j.a {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC11944j> f42380a;

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC11944j> f42381b;

    /* JADX INFO: renamed from: c */
    public final Set<InterfaceC11944j> f42382c = new HashSet(3);

    public C11951q(@NonNull List<InterfaceC11944j> list) {
        this.f42380a = list;
        this.f42381b = new ArrayList(list.size());
    }

    /* JADX INFO: renamed from: a */
    public final void m44609a(@NonNull InterfaceC11944j interfaceC11944j) {
        if (this.f42381b.contains(interfaceC11944j)) {
            return;
        }
        if (this.f42382c.contains(interfaceC11944j)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + this.f42382c);
        }
        this.f42382c.add(interfaceC11944j);
        interfaceC11944j.mo44549a(this);
        this.f42382c.remove(interfaceC11944j);
        if (this.f42381b.contains(interfaceC11944j)) {
            return;
        }
        if (C12258a.class.isAssignableFrom(interfaceC11944j.getClass())) {
            this.f42381b.add(0, interfaceC11944j);
        } else {
            this.f42381b.add(interfaceC11944j);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public List<InterfaceC11944j> m44610b() {
        Iterator<InterfaceC11944j> it = this.f42380a.iterator();
        while (it.hasNext()) {
            m44609a(it.next());
        }
        return this.f42381b;
    }
}
