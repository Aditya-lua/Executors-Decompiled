package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.hd */
/* JADX INFO: loaded from: classes.dex */
public class C2107hd extends AbstractMap {

    /* JADX INFO: renamed from: a */
    public Object[] f8225a;

    /* JADX INFO: renamed from: b */
    public int f8226b;

    /* JADX INFO: renamed from: c */
    public Map f8227c;

    /* JADX INFO: renamed from: d */
    public boolean f8228d;

    /* JADX INFO: renamed from: e */
    public volatile C2088gd f8229e;

    /* JADX INFO: renamed from: f */
    public Map f8230f;

    public /* synthetic */ C2107hd(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.f8227c = map;
        this.f8230f = map;
    }

    /* JADX INFO: renamed from: a */
    public void mo9920a() {
        if (this.f8228d) {
            return;
        }
        this.f8227c = this.f8227c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f8227c);
        this.f8230f = this.f8230f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f8230f);
        this.f8228d = true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10201b() {
        return this.f8228d;
    }

    /* JADX INFO: renamed from: c */
    public final int m10202c() {
        return this.f8226b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m10207i();
        if (this.f8226b != 0) {
            this.f8225a = null;
            this.f8226b = 0;
        }
        if (this.f8227c.isEmpty()) {
            return;
        }
        this.f8227c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m10212n(comparable) >= 0 || this.f8227c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Map.Entry m10203d(int i10) {
        if (i10 < this.f8226b) {
            return (C2050ed) this.f8225a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    /* JADX INFO: renamed from: e */
    public final Iterable m10204e() {
        return this.f8227c.isEmpty() ? Collections.EMPTY_SET : this.f8227c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f8229e == null) {
            this.f8229e = new C2088gd(this, null);
        }
        return this.f8229e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2107hd)) {
            return super.equals(obj);
        }
        C2107hd c2107hd = (C2107hd) obj;
        int size = size();
        if (size != c2107hd.size()) {
            return false;
        }
        int i10 = this.f8226b;
        if (i10 != c2107hd.f8226b) {
            return entrySet().equals(c2107hd.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!m10203d(i11).equals(c2107hd.m10203d(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f8227c.equals(c2107hd.f8227c);
        }
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m10207i();
        int iM10212n = m10212n(comparable);
        if (iM10212n >= 0) {
            return ((C2050ed) this.f8225a[iM10212n]).setValue(obj);
        }
        m10207i();
        if (this.f8225a == null) {
            this.f8225a = new Object[16];
        }
        int i10 = -(iM10212n + 1);
        if (i10 >= 16) {
            return m10214p().put(comparable, obj);
        }
        if (this.f8226b == 16) {
            C2050ed c2050ed = (C2050ed) this.f8225a[15];
            this.f8226b = 15;
            m10214p().put(c2050ed.m9947a(), c2050ed.getValue());
        }
        Object[] objArr = this.f8225a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f8225a[i10] = new C2050ed(this, comparable, obj);
        this.f8226b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM10212n = m10212n(comparable);
        return iM10212n >= 0 ? ((C2050ed) this.f8225a[iM10212n]).getValue() : this.f8227c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f8226b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f8225a[i11].hashCode();
        }
        return this.f8227c.size() > 0 ? iHashCode + this.f8227c.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object[] m10208j() {
        return this.f8225a;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int m10209k() {
        return this.f8226b;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Map m10210l() {
        return this.f8227c;
    }

    /* JADX DEBUG: Method merged with bridge method: g(I)Ljava/lang/Object; */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object m10206g(int i10) {
        m10207i();
        Object value = ((C2050ed) this.f8225a[i10]).getValue();
        Object[] objArr = this.f8225a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f8226b - i10) - 1);
        this.f8226b--;
        if (!this.f8227c.isEmpty()) {
            Iterator it = m10214p().entrySet().iterator();
            Object[] objArr2 = this.f8225a;
            int i11 = this.f8226b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new C2050ed(this, (Comparable) entry.getKey(), entry.getValue());
            this.f8226b++;
            it.remove();
        }
        return value;
    }

    /* JADX INFO: renamed from: n */
    public final int m10212n(Comparable comparable) {
        int i10 = this.f8226b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((C2050ed) this.f8225a[i11]).m9947a());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((C2050ed) this.f8225a[i13]).m9947a());
            if (iCompareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX DEBUG: Method merged with bridge method: i()V */
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void m10207i() {
        if (this.f8228d) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: p */
    public final SortedMap m10214p() {
        m10207i();
        if (this.f8227c.isEmpty() && !(this.f8227c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f8227c = treeMap;
            this.f8230f = treeMap.descendingMap();
        }
        return (SortedMap) this.f8227c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m10207i();
        Comparable comparable = (Comparable) obj;
        int iM10212n = m10212n(comparable);
        if (iM10212n >= 0) {
            return m10206g(iM10212n);
        }
        if (this.f8227c.isEmpty()) {
            return null;
        }
        return this.f8227c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f8226b + this.f8227c.size();
    }
}
