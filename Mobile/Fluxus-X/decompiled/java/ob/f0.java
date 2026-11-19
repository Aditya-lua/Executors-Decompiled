package ob;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f27309a;
    public final /* synthetic */ g0 b;

    public f0(g0 g0Var) {
        Objects.requireNonNull(g0Var);
        this.b = g0Var;
        this.f27309a = g0Var.E3().keySet().iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f27309a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27309a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
