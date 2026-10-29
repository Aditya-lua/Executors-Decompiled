package kotlin.collections;

import au.InterfaceC1170a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.collections.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH$¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0004¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0007R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"Lkotlin/collections/c;", "T", "", "<init>", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "b", "value", "e", "(Ljava/lang/Object;)V", "d", "f", "", "a", "I", "state", "Ljava/lang/Object;", "nextValue", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC7673c<T> implements Iterator<T>, InterfaceC1170a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public T nextValue;

    /* JADX INFO: renamed from: b */
    public abstract void mo31745b();

    /* JADX INFO: renamed from: d */
    public final void m31746d() {
        this.state = 2;
    }

    /* JADX INFO: renamed from: e */
    public final void m31747e(T value) {
        this.nextValue = value;
        this.state = 1;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m31748f() {
        this.state = 3;
        mo31745b();
        return this.state == 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.state;
        if (i10 == 0) {
            return m31748f();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public T next() {
        int i10 = this.state;
        if (i10 == 1) {
            this.state = 0;
            return this.nextValue;
        }
        if (i10 == 2 || !m31748f()) {
            throw new NoSuchElementException();
        }
        this.state = 0;
        return this.nextValue;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
