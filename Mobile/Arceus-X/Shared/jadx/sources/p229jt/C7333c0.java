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

/* JADX INFO: renamed from: jt.c0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\t\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0088\u0001\u001e\u0092\u0001\u00020\u0019¨\u0006\""}, m31665d2 = {"Ljt/c0;", "", "Ljt/b0;", "", "k", "([S)Ljava/util/Iterator;", "element", "", "b", "([SS)Z", "elements", "c", "([SLjava/util/Collection;)Z", "i", "([S)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "a", "[S", "getStorage$annotations", "()V", "storage", "f", "([S)I", "size", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7333c0 implements Collection<C7331b0>, InterfaceC1170a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final short[] storage;

    /* JADX INFO: renamed from: jt.c0$a */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0011"}, m31665d2 = {"Ljt/c0$a;", "", "Ljt/b0;", "", "array", "<init>", "([S)V", "", "hasNext", "()Z", "b", "()S", "a", "[S", "", "I", "index", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements Iterator<C7331b0>, InterfaceC1170a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final short[] array;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int index;

        public a(@NotNull short[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.array = array;
        }

        /* JADX INFO: renamed from: b */
        public short m30448b() {
            int i10 = this.index;
            short[] sArr = this.array;
            if (i10 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.index));
            }
            this.index = i10 + 1;
            return C7331b0.m30432b(sArr[i10]);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.array.length;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ C7331b0 next() {
            return C7331b0.m30431a(m30448b());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m30437b(short[] sArr, short s8) {
        return C7693m.m31839H(sArr, s8);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m30438c(short[] sArr, @NotNull Collection<C7331b0> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<C7331b0> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C7331b0) || !C7693m.m31839H(sArr, ((C7331b0) obj).getData())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m30439d(short[] sArr, Object obj) {
        return (obj instanceof C7333c0) && Intrinsics.m31980c(sArr, ((C7333c0) obj).getStorage());
    }

    /* JADX INFO: renamed from: f */
    public static int m30440f(short[] sArr) {
        return sArr.length;
    }

    /* JADX INFO: renamed from: g */
    public static int m30441g(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m30442i(short[] sArr) {
        return sArr.length == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public static Iterator<C7331b0> m30443k(short[] sArr) {
        return new a(sArr);
    }

    /* JADX INFO: renamed from: l */
    public static String m30444l(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    /* JADX INFO: renamed from: a */
    public boolean m30445a(short s8) {
        return m30437b(this.storage, s8);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(C7331b0 c7331b0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends C7331b0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C7331b0) {
            return m30445a(((C7331b0) obj).getData());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m30438c(this.storage, elements);
    }

    /* JADX DEBUG: Method merged with bridge method: size()I */
    @Override // java.util.Collection
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int size() {
        return m30440f(this.storage);
    }

    @Override // java.util.Collection
    public boolean equals(Object other) {
        return m30439d(this.storage, other);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m30441g(this.storage);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m30442i(this.storage);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<C7331b0> iterator() {
        return m30443k(this.storage);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final /* synthetic */ short[] getStorage() {
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
        return m30444l(this.storage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) C7736g.m32035b(this, array);
    }
}
