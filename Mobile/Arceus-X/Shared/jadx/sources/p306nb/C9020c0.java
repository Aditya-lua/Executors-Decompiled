package p306nb;

import com.google.android.gms.measurement.internal.zzbe;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: nb.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9020c0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f32745a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbe f32746b;

    public C9020c0(zzbe zzbeVar) {
        Objects.requireNonNull(zzbeVar);
        this.f32746b = zzbeVar;
        this.f32745a = zzbeVar.m11883z3().keySet().iterator();
    }

    /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f32745a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32745a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
