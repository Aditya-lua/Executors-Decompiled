package w1;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00015B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0010J\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0017J\u0015\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0001\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d¢\u0006\u0004\b\u001e\u0010\"J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b1\u00100J\u001d\u00102\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b2\u00100J\u001d\u00103\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b3\u00100R\"\u0010;\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010?R\"\u0010C\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010@\u001a\u0004\bA\u0010&\"\u0004\bB\u0010\u0007R\u0014\u0010E\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010&¨\u0006F"}, d2 = {"Lw1/b;", "E", "", "", "", "capacity", "<init>", "(I)V", "", "clear", "()V", "minimumCapacity", "b", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "key", "indexOf", "(Ljava/lang/Object;)I", "index", "m", "(I)Ljava/lang/Object;", "isEmpty", "()Z", "add", "remove", "g", "", "toArray", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "addAll", "removeAll", "retainAll", "", "a", "[I", "d", "()[I", "k", "([I)V", "hashes", "[Ljava/lang/Object;", "c", "i", "([Ljava/lang/Object;)V", "I", "f", "l", "_size", "e", "size", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b<E> implements Collection<E>, Set<E>, au.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public int[] hashes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Object[] array;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int _size;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lw1/b$a;", "Lw1/f;", "<init>", "(Lw1/b;)V", "", "index", "a", "(I)Ljava/lang/Object;", "", "b", "(I)V", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends f<E> {
        public a() {
            super(b.this.f());
        }

        @Override // w1.f
        public E a(int index) {
            return b.this.m(index);
        }

        @Override // w1.f
        public void b(int index) {
            b.this.g(index);
        }
    }

    public b() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E element) {
        int i10;
        int iC;
        int iF = f();
        if (element == null) {
            iC = d.d(this);
            i10 = 0;
        } else {
            int iHashCode = element.hashCode();
            i10 = iHashCode;
            iC = d.c(this, element, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i11 = ~iC;
        if (iF >= getHashes().length) {
            int i12 = 8;
            if (iF >= 8) {
                i12 = (iF >> 1) + iF;
            } else if (iF < 4) {
                i12 = 4;
            }
            int[] hashes = getHashes();
            Object[] array = getArray();
            d.a(this, i12);
            if (iF != f()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes().length == 0)) {
                kotlin.collections.l.k(hashes, getHashes(), 0, 0, hashes.length, 6, null);
                kotlin.collections.l.l(array, getArray(), 0, 0, array.length, 6, null);
            }
        }
        if (i11 < iF) {
            int i13 = i11 + 1;
            kotlin.collections.l.g(getHashes(), getHashes(), i13, i11, iF);
            kotlin.collections.l.i(getArray(), getArray(), i13, i11, iF);
        }
        if (iF != f() || i11 >= getHashes().length) {
            throw new ConcurrentModificationException();
        }
        getHashes()[i11] = i10;
        getArray()[i11] = element;
        l(f() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        b(f() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void b(int minimumCapacity) {
        int iF = f();
        if (getHashes().length < minimumCapacity) {
            int[] hashes = getHashes();
            Object[] array = getArray();
            d.a(this, minimumCapacity);
            if (f() > 0) {
                kotlin.collections.l.k(hashes, getHashes(), 0, 0, f(), 6, null);
                kotlin.collections.l.l(array, getArray(), 0, 0, f(), 6, null);
            }
        }
        if (f() != iF) {
            throw new ConcurrentModificationException();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object[] getArray() {
        return this.array;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (f() != 0) {
            k(x1.a.f34678a);
            i(x1.a.f34679c);
            l(0);
        }
        if (f() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int[] getHashes() {
        return this.hashes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public int get_size() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Set) || size() != ((Set) other).size()) {
            return false;
        }
        try {
            int iF = f();
            for (int i10 = 0; i10 < iF; i10++) {
                if (!((Set) other).contains(m(i10))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final int f() {
        return this._size;
    }

    public final E g(int index) {
        int i10;
        Object[] objArr;
        int iF = f();
        E e10 = (E) getArray()[index];
        if (iF <= 1) {
            clear();
            return e10;
        }
        int i11 = iF - 1;
        if (getHashes().length <= 8 || f() >= getHashes().length / 3) {
            if (index < i11) {
                int i12 = index + 1;
                kotlin.collections.l.g(getHashes(), getHashes(), index, i12, iF);
                kotlin.collections.l.i(getArray(), getArray(), index, i12, iF);
            }
            getArray()[i11] = null;
        } else {
            int iF2 = f() > 8 ? f() + (f() >> 1) : 8;
            int[] hashes = getHashes();
            Object[] array = getArray();
            d.a(this, iF2);
            if (index > 0) {
                kotlin.collections.l.k(hashes, getHashes(), 0, 0, index, 6, null);
                objArr = array;
                kotlin.collections.l.l(objArr, getArray(), 0, 0, index, 6, null);
                i10 = index;
            } else {
                i10 = index;
                objArr = array;
            }
            if (i10 < i11) {
                int i13 = i10 + 1;
                kotlin.collections.l.g(hashes, getHashes(), i10, i13, iF);
                kotlin.collections.l.i(objArr, getArray(), i10, i13, iF);
            }
        }
        if (iF != f()) {
            throw new ConcurrentModificationException();
        }
        l(i11);
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes = getHashes();
        int iF = f();
        int i10 = 0;
        for (int i11 = 0; i11 < iF; i11++) {
            i10 += hashes[i11];
        }
        return i10;
    }

    public final void i(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.array = objArr;
    }

    public final int indexOf(@Nullable Object key) {
        return key == null ? d.d(this) : d.c(this, key, key.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return f() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new a();
    }

    public final void k(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final void l(int i10) {
        this._size = i10;
    }

    public final E m(int index) {
        return (E) getArray()[index];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object element) {
        int iIndexOf = indexOf(element);
        if (iIndexOf < 0) {
            return false;
        }
        g(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        for (int iF = f() - 1; -1 < iF; iF--) {
            if (!CollectionsKt.W(elements, getArray()[iF])) {
                g(iF);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return get_size();
    }

    @Override // java.util.Collection, java.util.Set
    @NotNull
    public final Object[] toArray() {
        return kotlin.collections.l.n(this.array, 0, this._size);
    }

    @NotNull
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(f() * 14);
        sb2.append('{');
        int iF = f();
        for (int i10 = 0; i10 < iF; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E eM = m(i10);
            if (eM != this) {
                sb2.append(eM);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public b(int i10) {
        this.hashes = x1.a.f34678a;
        this.array = x1.a.f34679c;
        if (i10 > 0) {
            d.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    @NotNull
    public final <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        T[] tArr = (T[]) c.a(array, this._size);
        kotlin.collections.l.i(this.array, tArr, 0, 0, this._size);
        Intrinsics.checkNotNull(tArr);
        return tArr;
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
