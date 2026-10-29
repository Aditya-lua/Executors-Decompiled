package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.collections.o0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\n\u0010\rJ\u0018\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0014¢\u0006\u0004\b\u0018\u0010\u001aJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R$\u0010-\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b$\u0010,¨\u0006."}, m31665d2 = {"Lkotlin/collections/o0;", "T", "Lkotlin/collections/d;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "", "buffer", "", "filledSize", "<init>", "([Ljava/lang/Object;I)V", "capacity", "(I)V", "index", "get", "(I)Ljava/lang/Object;", "", "k", "()Z", "", "iterator", "()Ljava/util/Iterator;", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "maxCapacity", "i", "(I)Lkotlin/collections/o0;", "element", "", "g", "(Ljava/lang/Object;)V", "n", "l", "b", "[Ljava/lang/Object;", "c", "I", "d", "startIndex", "value", "e", "()I", "size", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7698o0<T> extends AbstractC7675d<T> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Object[] buffer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int startIndex;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: kotlin.collections.o0$a */
    @Metadata(m31664d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, m31665d2 = {"kotlin/collections/o0$a", "Lkotlin/collections/c;", "", "b", "()V", "", "c", "I", "count", "d", "index", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a extends AbstractC7673c<T> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public int count;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int index;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C7698o0<T> f29370e;

        public a(C7698o0<T> c7698o0) {
            this.f29370e = c7698o0;
            this.count = c7698o0.size();
            this.index = c7698o0.startIndex;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.collections.o0$a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.AbstractC7673c
        /* JADX INFO: renamed from: b */
        public void mo31745b() {
            if (this.count == 0) {
                m31746d();
                return;
            }
            m31747e(this.f29370e.buffer[this.index]);
            this.index = (this.index + 1) % this.f29370e.capacity;
            this.count--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7698o0(@NotNull Object[] buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.buffer = buffer;
        if (i10 < 0) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        }
        if (i10 <= buffer.length) {
            this.capacity = buffer.length;
            this.size = i10;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    @Override // kotlin.collections.AbstractC7671b
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: g */
    public final void m31883g(T element) {
        if (m31885k()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.buffer[(this.startIndex + size()) % this.capacity] = element;
        this.size = size() + 1;
    }

    @Override // kotlin.collections.AbstractC7675d, java.util.List
    public T get(int index) {
        AbstractC7675d.INSTANCE.m31750b(index, size());
        return (T) this.buffer[(this.startIndex + index) % this.capacity];
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.collections.o0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: i */
    public final C7698o0<T> m31884i(int maxCapacity) {
        Object[] array;
        int i10 = this.capacity;
        int iM32081f = C7764d.m32081f(i10 + (i10 >> 1) + 1, maxCapacity);
        if (this.startIndex == 0) {
            array = Arrays.copyOf(this.buffer, iM32081f);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        } else {
            array = toArray(new Object[iM32081f]);
        }
        return new C7698o0<>(array, size());
    }

    @Override // kotlin.collections.AbstractC7675d, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<T> iterator() {
        return new a(this);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m31885k() {
        return size() == this.capacity;
    }

    /* JADX INFO: renamed from: l */
    public final void m31886l(int n10) {
        if (n10 < 0) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + n10).toString());
        }
        if (n10 > size()) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + n10 + ", size = " + size()).toString());
        }
        if (n10 > 0) {
            int i10 = this.startIndex;
            int i11 = (i10 + n10) % this.capacity;
            if (i10 > i11) {
                C7691l.m31822q(this.buffer, null, i10, this.capacity);
                C7691l.m31822q(this.buffer, null, 0, i11);
            } else {
                C7691l.m31822q(this.buffer, null, i10, i11);
            }
            this.startIndex = i11;
            this.size = size() - n10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // kotlin.collections.AbstractC7671b, java.util.Collection
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        Object[] objArr = array;
        if (length < size()) {
            Object[] objArr2 = (T[]) Arrays.copyOf(array, size());
            Intrinsics.checkNotNullExpressionValue(objArr2, "copyOf(...)");
            objArr = objArr2;
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.startIndex; i11 < size && i12 < this.capacity; i12++) {
            objArr[i11] = this.buffer[i12];
            i11++;
        }
        while (i11 < size) {
            objArr[i11] = this.buffer[i10];
            i11++;
            i10++;
        }
        return (T[]) C7697o.m31879e(size, objArr);
    }

    public C7698o0(int i10) {
        this(new Object[i10], 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.collections.o0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC7671b, java.util.Collection
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
