package p229jt;

import au.InterfaceC1170a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C7693m;
import kotlin.jvm.internal.C7736g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jt.x */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\t\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0088\u0001\u001e\u0092\u0001\u00020\u0019¨\u0006\""}, m31665d2 = {"Ljt/x;", "", "Ljt/w;", "", "l", "([I)Ljava/util/Iterator;", "element", "", "c", "([II)Z", "elements", "d", "([ILjava/util/Collection;)Z", "k", "([I)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "a", "[I", "getStorage$annotations", "()V", "storage", "g", "([I)I", "size", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7357x implements Collection<C7356w>, InterfaceC1170a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final int[] storage;

    /* JADX INFO: renamed from: jt.x$a */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Ljt/x$a;", "", "Ljt/w;", "", "array", "<init>", "([I)V", "", "hasNext", "()Z", "b", "()I", "a", "[I", "", "I", "index", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements Iterator<C7356w>, InterfaceC1170a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final int[] array;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int index;

        public a(@NotNull int[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        /* JADX INFO: renamed from: b */
        public int m30513b() {
            int i10 = this.index;
            int[] iArr = this.array;
            if (i10 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i10 + 1;
            return C7356w.m30497b(iArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ C7356w next() {
            return C7356w.m30496a(m30513b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m30502c(int[] iArr, int i10) {
        return C7693m.m31836E(iArr, i10);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m30503d(int[] iArr, @NotNull Collection<C7356w> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<C7356w> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C7356w) || !C7693m.m31836E(iArr, ((C7356w) obj).getData())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m30504e(int[] iArr, Object obj) {
        return (obj instanceof C7357x) && Intrinsics.m31980c(iArr, ((C7357x) obj).getStorage());
    }

    /* JADX INFO: renamed from: g */
    public static int m30505g(int[] iArr) {
        return iArr.length;
    }

    /* JADX INFO: renamed from: i */
    public static int m30506i(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m30507k(int[] iArr) {
        return iArr.length == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public static Iterator<C7356w> m30508l(int[] iArr) {
        return new a(iArr);
    }

    /* JADX INFO: renamed from: m */
    public static String m30509m(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(C7356w c7356w) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends C7356w> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: b */
    public boolean m30510b(int i10) {
        return m30502c(this.storage, i10);
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C7356w) {
            return m30510b(((C7356w) obj).getData());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m30503d(this.storage, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object other) {
        return m30504e(this.storage, other);
    }

    /* JADX DEBUG: Method merged with bridge method: size()I */
    @Override // java.util.Collection
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m30505g(this.storage);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m30506i(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m30507k(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<C7356w> iterator() {
        return m30508l(this.storage);
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final /* synthetic */ int[] getStorage() {
        return this.storage;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public Object[] toArray() {
        return C7736g.m32034a(this);
    }

    public String toString() {
        return m30509m(this.storage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) C7736g.m32035b(this, array);
    }
}
