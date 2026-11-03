package nb;

import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f26203a;
    public final /* synthetic */ zzbe b;

    public c0(zzbe zzbeVar) {
        Objects.requireNonNull(zzbeVar);
        this.b = zzbeVar;
        this.f26203a = zzbeVar.z3().keySet().iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f26203a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26203a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
