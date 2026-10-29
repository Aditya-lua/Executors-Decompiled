package us;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class q implements j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<j> f32616a;
    public final List<j> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<j> f32617c = new HashSet(3);

    public q(@NonNull List<j> list) {
        this.f32616a = list;
        this.b = new ArrayList(list.size());
    }

    public final void a(@NonNull j jVar) {
        if (this.b.contains(jVar)) {
            return;
        }
        if (this.f32617c.contains(jVar)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + this.f32617c);
        }
        this.f32617c.add(jVar);
        jVar.a(this);
        this.f32617c.remove(jVar);
        if (this.b.contains(jVar)) {
            return;
        }
        if (vs.a.class.isAssignableFrom(jVar.getClass())) {
            this.b.add(0, jVar);
        } else {
            this.b.add(jVar);
        }
    }

    @NonNull
    public List<j> b() {
        Iterator<j> it = this.f32616a.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this.b;
    }
}
