package m9;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.NoSuchElementException;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public class c<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final b f24042a;
    public int b = -1;

    public c(@NonNull b bVar) {
        this.f24042a = (b) m.l(bVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.f24042a.getCount() + (-1);
    }

    @Override // java.util.Iterator
    @NonNull
    public Object next() {
        if (hasNext()) {
            b bVar = this.f24042a;
            int i10 = this.b + 1;
            this.b = i10;
            return bVar.get(i10);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.b);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
