package p290m9;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p305n9.C8953m;

/* JADX INFO: renamed from: m9.c */
/* JADX INFO: loaded from: classes.dex */
public class C8472c<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final InterfaceC8471b f31183a;

    /* JADX INFO: renamed from: b */
    public int f31184b = -1;

    public C8472c(@NonNull InterfaceC8471b interfaceC8471b) {
        this.f31183a = (InterfaceC8471b) C8953m.m36047l(interfaceC8471b);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31184b < this.f31183a.getCount() + (-1);
    }

    @Override // java.util.Iterator
    @NonNull
    public Object next() {
        if (hasNext()) {
            InterfaceC8471b interfaceC8471b = this.f31183a;
            int i10 = this.f31184b + 1;
            this.f31184b = i10;
            return interfaceC8471b.get(i10);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.f31184b);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
