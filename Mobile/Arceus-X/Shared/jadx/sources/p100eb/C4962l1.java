package p100eb;

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

/* JADX INFO: renamed from: eb.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4962l1 extends AbstractC4926f1 implements NavigableMap {

    /* JADX INFO: renamed from: f */
    public static final Comparator f19682f;

    /* JADX INFO: renamed from: g */
    public static final C4962l1 f19683g;

    /* JADX INFO: renamed from: c */
    public final transient C5022v1 f19684c;

    /* JADX INFO: renamed from: d */
    public final transient AbstractC4920e1 f19685d;

    /* JADX INFO: renamed from: e */
    public final transient C4962l1 f19686e;

    static {
        C4992q1 c4992q1 = C4992q1.f19767a;
        f19682f = c4992q1;
        C5022v1 c5022v1M23664B = AbstractC4968m1.m23664B(c4992q1);
        AbstractC4915d2 abstractC4915d2 = AbstractC4920e1.f19644b;
        f19683g = new C4962l1(c5022v1M23664B, C5010t1.f19809e, null);
    }

    public C4962l1(C5022v1 c5022v1, AbstractC4920e1 abstractC4920e1, C4962l1 c4962l1) {
        this.f19684c = c5022v1;
        this.f19685d = abstractC4920e1;
        this.f19686e = c4962l1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.util.Map */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static C4962l1 m23653e(Map map) {
        final Comparator comparator = f19682f;
        Comparator comparator2 = map.comparator();
        int i10 = 1;
        boolean zEquals = comparator2 == null ? true : comparator.equals(comparator2);
        Collection collectionEntrySet = map.entrySet();
        Map.Entry[] entryArr = AbstractC4926f1.f19649b;
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
            return m23654f(comparator);
        }
        if (length == 1) {
            Map.Entry entry = entryArr2[0];
            Objects.requireNonNull(entry);
            Map.Entry entry2 = entry;
            return new C4962l1(new C5022v1(AbstractC4920e1.m23573k(entry2.getKey()), comparator), AbstractC4920e1.m23573k(entry2.getValue()), null);
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
                C5027w0.m23713a(key, value);
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
            C5027w0.m23713a(objArr[0], value2);
            while (i10 < length) {
                Map.Entry entry7 = entryArr2[i10 - 1];
                Objects.requireNonNull(entry7);
                Map.Entry entry8 = entry7;
                Map.Entry entry9 = entryArr2[i10];
                Objects.requireNonNull(entry9);
                Map.Entry entry10 = entry9;
                Object key3 = entry10.getKey();
                Object value3 = entry10.getValue();
                C5027w0.m23713a(key3, value3);
                objArr[i10] = key3;
                objArr2[i10] = value3;
                if (comparator.compare(key2, key3) == 0) {
                    throw new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(entry8) + " and " + String.valueOf(entry10));
                }
                i10++;
                key2 = key3;
            }
        }
        return new C4962l1(new C5022v1(AbstractC4920e1.m23571h(objArr, length), comparator), AbstractC4920e1.m23571h(objArr2, length), null);
    }

    /* JADX INFO: renamed from: f */
    public static C4962l1 m23654f(Comparator comparator) {
        if (C4992q1.f19767a.equals(comparator)) {
            return f19683g;
        }
        C5022v1 c5022v1M23664B = AbstractC4968m1.m23664B(comparator);
        AbstractC4915d2 abstractC4915d2 = AbstractC4920e1.f19644b;
        return new C4962l1(c5022v1M23664B, C5010t1.f19809e, null);
    }

    @Override // p100eb.AbstractC4926f1
    /* JADX INFO: renamed from: a */
    public final AbstractC5044z0 mo23590a() {
        return this.f19685d;
    }

    @Override // p100eb.AbstractC4926f1
    /* JADX INFO: renamed from: b */
    public final AbstractC4938h1 mo23591b() {
        return isEmpty() ? C5016u1.f19816i : new C4956k1(this);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return C4980o1.m23684a(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f19684c.f19696c;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.f19684c.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        C4962l1 c4962l1 = this.f19686e;
        if (c4962l1 != null) {
            return c4962l1;
        }
        if (!isEmpty()) {
            return new C4962l1((C5022v1) this.f19684c.descendingSet(), this.f19685d.mo23560f(), this);
        }
        Comparator comparator = this.f19684c.f19696c;
        return m23654f((comparator instanceof AbstractC5004s1 ? (AbstractC5004s1) comparator : new C5033x0(comparator)).mo23692a());
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return m23592c();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) m23592c().mo23611i().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f19684c.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return C4980o1.m23684a(floorEntry(obj));
    }

    /* JADX DEBUG: Method merged with bridge method: headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap; */
    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C4962l1 headMap(Object obj, boolean z10) {
        obj.getClass();
        return m23659l(0, this.f19684c.m23710D(obj, z10));
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005  */
    @Override // p100eb.AbstractC4926f1, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        C5022v1 c5022v1 = this.f19684c;
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(c5022v1.f19831e, obj, c5022v1.f19696c);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.f19685d.get(iBinarySearch);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
        return C4980o1.m23684a(higherEntry(obj));
    }

    /* JADX DEBUG: Method merged with bridge method: subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap; */
    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final C4962l1 subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.f19684c.f19696c.compare(obj, obj2) <= 0) {
            return headMap(obj2, z11).tailMap(obj, z10);
        }
        throw new IllegalArgumentException(C4985p0.m23687a("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    /* JADX DEBUG: Method merged with bridge method: tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap; */
    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final C4962l1 tailMap(Object obj, boolean z10) {
        obj.getClass();
        return m23659l(this.f19684c.m23711E(obj, z10), this.f19685d.size());
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.f19684c;
    }

    /* JADX INFO: renamed from: l */
    public final C4962l1 m23659l(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == this.f19685d.size()) {
                return this;
            }
            i10 = 0;
        }
        if (i10 == i11) {
            return m23654f(this.f19684c.f19696c);
        }
        return new C4962l1(this.f19684c.m23712F(i10, i11), this.f19685d.subList(i10, i11), null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) m23592c().mo23611i().get(this.f19685d.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f19684c.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return C4980o1.m23684a(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f19684c;
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
        return this.f19685d.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.f19685d;
    }
}
