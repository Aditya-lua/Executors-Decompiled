package w1;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0018\u0010\b\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0001¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u001a\u0010\u0018\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00028\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010!\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010\u001cJ'\u0010&\u001a\u00020\n2\u0016\u0010\b\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b&\u0010\tJ!\u0010'\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b'\u0010\u001cJ\u0019\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u0019J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010\u001fJ!\u0010+\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010\u001cJ'\u0010+\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010,\u001a\u00028\u00012\u0006\u0010-\u001a\u00028\u0001H\u0016¢\u0006\u0004\b+\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b2\u0010\u0012J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00100J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u00107\u001a\u00020\u0004H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u00100R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010<R\u001e\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010?R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010A¨\u0006B"}, d2 = {"Lw1/j;", "K", "V", "", "", "capacity", "<init>", "(I)V", "map", "(Lw1/j;)V", "", "clear", "()V", "minimumCapacity", "b", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "d", "(Ljava/lang/Object;)I", "value", "a", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "index", "f", "(I)Ljava/lang/Object;", "k", "j", "(ILjava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "put", "g", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "i", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "size", "()I", "other", "equals", "hashCode", "", "toString", "()Ljava/lang/String;", "hash", "c", "(Ljava/lang/Object;I)I", "e", "", "[I", "hashes", "", "[Ljava/lang/Object;", "array", "I", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class j<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public int[] hashes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Object[] array;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int size;

    public j() {
        this(0, 1, null);
    }

    public final int a(V value) {
        int i10 = this.size * 2;
        Object[] objArr = this.array;
        if (value == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (Intrinsics.c(value, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public void b(int minimumCapacity) {
        int i10 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < minimumCapacity) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, minimumCapacity);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, minimumCapacity * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
        }
        if (this.size != i10) {
            throw new ConcurrentModificationException();
        }
    }

    public final int c(K key, int hash) {
        int i10 = this.size;
        if (i10 == 0) {
            return -1;
        }
        int iA = x1.a.a(this.hashes, i10, hash);
        if (iA < 0 || Intrinsics.c(key, this.array[iA << 1])) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.hashes[i11] == hash) {
            if (Intrinsics.c(key, this.array[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.hashes[i12] == hash; i12--) {
            if (Intrinsics.c(key, this.array[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = x1.a.f34678a;
            this.array = x1.a.f34679c;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K key) {
        return d(key) >= 0;
    }

    public boolean containsValue(V value) {
        return a(value) >= 0;
    }

    public int d(K key) {
        return key == null ? e() : c(key, key.hashCode());
    }

    public final int e() {
        int i10 = this.size;
        if (i10 == 0) {
            return -1;
        }
        int iA = x1.a.a(this.hashes, i10, 0);
        if (iA < 0 || this.array[iA << 1] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.hashes[i11] == 0) {
            if (this.array[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.hashes[i12] == 0; i12--) {
            if (this.array[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof j) {
                if (getSize() != ((j) other).getSize()) {
                    return false;
                }
                j jVar = (j) other;
                int i10 = this.size;
                for (int i11 = 0; i11 < i10; i11++) {
                    K kF = f(i11);
                    V vK = k(i11);
                    Object obj = jVar.get(kF);
                    if (vK == null) {
                        if (obj != null || !jVar.containsKey(kF)) {
                            return false;
                        }
                    } else if (!Intrinsics.c(vK, obj)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(other instanceof Map) || getSize() != ((Map) other).size()) {
                return false;
            }
            int i12 = this.size;
            for (int i13 = 0; i13 < i12; i13++) {
                K kF2 = f(i13);
                V vK2 = k(i13);
                Object obj2 = ((Map) other).get(kF2);
                if (vK2 == null) {
                    if (obj2 != null || !((Map) other).containsKey(kF2)) {
                        return false;
                    }
                } else if (!Intrinsics.c(vK2, obj2)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public K f(int index) {
        boolean z10 = false;
        if (index >= 0 && index < this.size) {
            z10 = true;
        }
        if (!z10) {
            x1.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        return (K) this.array[index << 1];
    }

    public void g(@NotNull j<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        int i10 = map.size;
        b(this.size + i10);
        if (this.size != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(map.f(i11), map.k(i11));
            }
        } else if (i10 > 0) {
            kotlin.collections.l.g(map.hashes, this.hashes, 0, 0, i10);
            kotlin.collections.l.i(map.array, this.array, 0, 0, i10 << 1);
            this.size = i10;
        }
    }

    @Nullable
    public V get(K key) {
        int iD = d(key);
        if (iD >= 0) {
            return (V) this.array[(iD << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(@Nullable Object key, V defaultValue) {
        int iD = d(key);
        return iD >= 0 ? (V) this.array[(iD << 1) + 1] : defaultValue;
    }

    public int hashCode() {
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i10 = this.size;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public V i(int index) {
        if (!(index >= 0 && index < this.size)) {
            x1.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        Object[] objArr = this.array;
        int i10 = index << 1;
        V v5 = (V) objArr[i10 + 1];
        int i11 = this.size;
        if (i11 <= 1) {
            clear();
            return v5;
        }
        int i12 = i11 - 1;
        int[] iArr = this.hashes;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            if (index < i12) {
                int i13 = index + 1;
                kotlin.collections.l.g(iArr, iArr, index, i13, i11);
                Object[] objArr2 = this.array;
                kotlin.collections.l.i(objArr2, objArr2, i10, i13 << 1, i11 << 1);
            }
            Object[] objArr3 = this.array;
            int i14 = i12 << 1;
            objArr3[i14] = null;
            objArr3[i14 + 1] = null;
        } else {
            int i15 = i11 > 8 ? i11 + (i11 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i15);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i15 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
            if (i11 != this.size) {
                throw new ConcurrentModificationException();
            }
            if (index > 0) {
                kotlin.collections.l.g(iArr, this.hashes, 0, 0, index);
                kotlin.collections.l.i(objArr, this.array, 0, 0, i10);
            }
            if (index < i12) {
                int i16 = index + 1;
                kotlin.collections.l.g(iArr, this.hashes, index, i16, i11);
                kotlin.collections.l.i(objArr, this.array, i10, i16 << 1, i11 << 1);
            }
        }
        if (i11 != this.size) {
            throw new ConcurrentModificationException();
        }
        this.size = i12;
        return v5;
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public V j(int index, V value) {
        boolean z10 = false;
        if (index >= 0 && index < this.size) {
            z10 = true;
        }
        if (!z10) {
            x1.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        int i10 = (index << 1) + 1;
        Object[] objArr = this.array;
        V v5 = (V) objArr[i10];
        objArr[i10] = value;
        return v5;
    }

    public V k(int index) {
        boolean z10 = false;
        if (index >= 0 && index < this.size) {
            z10 = true;
        }
        if (!z10) {
            x1.d.a("Expected index to be within 0..size()-1, but was " + index);
        }
        return (V) this.array[(index << 1) + 1];
    }

    @Nullable
    public V put(K key, V value) {
        int i10 = this.size;
        int iHashCode = key != null ? key.hashCode() : 0;
        int iC = key != null ? c(key, iHashCode) : e();
        if (iC >= 0) {
            int i11 = (iC << 1) + 1;
            Object[] objArr = this.array;
            V v5 = (V) objArr[i11];
            objArr[i11] = value;
            return v5;
        }
        int i12 = ~iC;
        int[] iArr = this.hashes;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i13);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.hashes = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.array, i13 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.array = objArrCopyOf;
            if (i10 != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.hashes;
            int i14 = i12 + 1;
            kotlin.collections.l.g(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.array;
            kotlin.collections.l.i(objArr2, objArr2, i14 << 1, i12 << 1, this.size << 1);
        }
        int i15 = this.size;
        if (i10 == i15) {
            int[] iArr3 = this.hashes;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.array;
                int i16 = i12 << 1;
                objArr3[i16] = key;
                objArr3[i16 + 1] = value;
                this.size = i15 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Nullable
    public V putIfAbsent(K key, V value) {
        V v5 = get(key);
        return v5 == null ? put(key, value) : v5;
    }

    @Nullable
    public V remove(K key) {
        int iD = d(key);
        if (iD >= 0) {
            return i(iD);
        }
        return null;
    }

    @Nullable
    public V replace(K key, V value) {
        int iD = d(key);
        if (iD >= 0) {
            return j(iD, value);
        }
        return null;
    }

    /* JADX INFO: renamed from: size, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @NotNull
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.size * 28);
        sb2.append('{');
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            K kF = f(i11);
            if (kF != sb2) {
                sb2.append(kF);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V vK = k(i11);
            if (vK != sb2) {
                sb2.append(vK);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public j(int i10) {
        this.hashes = i10 == 0 ? x1.a.f34678a : new int[i10];
        this.array = i10 == 0 ? x1.a.f34679c : new Object[i10 << 1];
    }

    public boolean remove(K key, V value) {
        int iD = d(key);
        if (iD < 0 || !Intrinsics.c(value, k(iD))) {
            return false;
        }
        i(iD);
        return true;
    }

    public boolean replace(K key, V oldValue, V newValue) {
        int iD = d(key);
        if (iD < 0 || !Intrinsics.c(oldValue, k(iD))) {
            return false;
        }
        j(iD, newValue);
        return true;
    }

    public /* synthetic */ j(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public j(@Nullable j<? extends K, ? extends V> jVar) {
        this(0, 1, null);
        if (jVar != null) {
            g(jVar);
        }
    }
}
