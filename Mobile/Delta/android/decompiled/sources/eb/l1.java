package eb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends f1 implements NavigableMap {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Comparator f15290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l1 f15291g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient v1 f15292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient e1 f15293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient l1 f15294e;

    static {
        q1 q1Var = q1.f15359a;
        f15290f = q1Var;
        v1 v1VarB = m1.B(q1Var);
        d2 d2Var = e1.b;
        f15291g = new l1(v1VarB, t1.f15397e, null);
    }

    public l1(v1 v1Var, e1 e1Var, l1 l1Var) {
        this.f15292c = v1Var;
        this.f15293d = e1Var;
        this.f15294e = l1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static l1 e(Map map) {
        final Comparator comparator = f15290f;
        Comparator comparator2 = map.comparator();
        int i10 = 1;
        boolean zEquals = comparator2 == null ? true : comparator.equals(comparator2);
        Collection collectionEntrySet = map.entrySet();
        Map.Entry[] entryArr = f1.b;
        if (!(collectionEntrySet instanceof Collection)) {
            Iterator it = collectionEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collectionEntrySet = arrayList;
        }
        Map.Entry[] entryArr2 = (Map.Entry[]) collectionEntrySet.toArray(entryArr);
        int length = entryArr2.length;
        if (length == 0) {
            return f(comparator);
        }
        if (length == 1) {
            Map.Entry entry = entryArr2[0];
            Objects.requireNonNull(entry);
            Map.Entry entry2 = entry;
            return new l1(new v1(e1.k(entry2.getKey()), comparator), e1.k(entry2.getValue()), null);
        }
        Object[] objArr = new Object[length];
        Object[] objArr2 = new Object[length];
        if (zEquals) {
            for (int i11 = 0; i11 < length; i11++) {
                Map.Entry entry3 = entryArr2[i11];
                Objects.requireNonNull(entry3);
                Map.Entry entry4 = entry3;
                Object key = entry4.getKey();
                Object value = entry4.getValue();
                w0.a(key, value);
                objArr[i11] = key;
                objArr2[i11] = value;
            }
        } else {
            Arrays.sort(entryArr2, 0, length, new Comparator() { // from class: eb.i1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Map.Entry entry5 = (Map.Entry) obj;
                    Map.Entry entry6 = (Map.Entry) obj2;
                    Objects.requireNonNull(entry5);
                    Objects.requireNonNull(entry6);
                    return comparator.compare(entry5.getKey(), entry6.getKey());
                }
            });
            Map.Entry entry5 = entryArr2[0];
            Objects.requireNonNull(entry5);
            Map.Entry entry6 = entry5;
            Object key2 = entry6.getKey();
            objArr[0] = key2;
            Object value2 = entry6.getValue();
            objArr2[0] = value2;
            w0.a(objArr[0], value2);
            while (i10 < length) {
                Map.Entry entry7 = entryArr2[i10 - 1];
                Objects.requireNonNull(entry7);
                Map.Entry entry8 = entry7;
                Map.Entry entry9 = entryArr2[i10];
                Objects.requireNonNull(entry9);
                Map.Entry entry10 = entry9;
                Object key3 = entry10.getKey();
                Object value3 = entry10.getValue();
                w0.a(key3, value3);
                objArr[i10] = key3;
                objArr2[i10] = value3;
                if (comparator.compare(key2, key3) == 0) {
                    throw new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(entry8) + " and " + String.valueOf(entry10));
                }
                i10++;
                key2 = key3;
            }
        }
        return new l1(new v1(e1.h(objArr, length), comparator), e1.h(objArr2, length), null);
    }

    public static l1 f(Comparator comparator) {
        if (q1.f15359a.equals(comparator)) {
            return f15291g;
        }
        v1 v1VarB = m1.B(comparator);
        d2 d2Var = e1.b;
        return new l1(v1VarB, t1.f15397e, null);
    }

    @Override // eb.f1
    public final z0 a() {
        return this.f15293d;
    }

    @Override // eb.f1
    public final h1 b() {
        return isEmpty() ? u1.f15404i : new k1(this);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return o1.a(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f15292c.f15303c;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.f15292c.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        l1 l1Var = this.f15294e;
        if (l1Var != null) {
            return l1Var;
        }
        if (!isEmpty()) {
            return new l1((v1) this.f15292c.descendingSet(), this.f15293d.f(), this);
        }
        Comparator comparator = this.f15292c.f15303c;
        return f((comparator instanceof s1 ? (s1) comparator : new x0(comparator)).a());
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return c();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) c().i().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f15292c.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return o1.a(floorEntry(obj));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final l1 headMap(Object obj, boolean z10) {
        obj.getClass();
        return l(0, this.f15292c.D(obj, z10));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005  */
    @Override // eb.f1, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        v1 v1Var = this.f15292c;
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(v1Var.f15417e, obj, v1Var.f15303c);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.f15293d.get(iBinarySearch);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return o1.a(higherEntry(obj));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final l1 subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.f15292c.f15303c.compare(obj, obj2) <= 0) {
            return headMap(obj2, z11).tailMap(obj, z10);
        }
        throw new IllegalArgumentException(p0.a("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final l1 tailMap(Object obj, boolean z10) {
        obj.getClass();
        return l(this.f15292c.E(obj, z10), this.f15293d.size());
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.f15292c;
    }

    public final l1 l(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == this.f15293d.size()) {
                return this;
            }
            i10 = 0;
        }
        if (i10 == i11) {
            return f(this.f15292c.f15303c);
        }
        return new l1(this.f15292c.F(i10, i11), this.f15293d.subList(i10, i11), null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) c().i().get(this.f15293d.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f15292c.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return o1.a(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f15292c;
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f15293d.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.f15293d;
    }
}
