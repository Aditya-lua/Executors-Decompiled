package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p6 */
/* JADX INFO: loaded from: classes.dex */
public class C2610p6 extends AbstractMap {

    /* JADX INFO: renamed from: a */
    public Object[] f9187a;

    /* JADX INFO: renamed from: b */
    public int f9188b;

    /* JADX INFO: renamed from: c */
    public Map f9189c;

    /* JADX INFO: renamed from: d */
    public boolean f9190d;

    /* JADX INFO: renamed from: e */
    public volatile C2588n6 f9191e;

    /* JADX INFO: renamed from: f */
    public Map f9192f;

    public /* synthetic */ C2610p6(C2599o6 c2599o6) {
        Map map = Collections.EMPTY_MAP;
        this.f9189c = map;
        this.f9192f = map;
    }

    /* JADX INFO: renamed from: a */
    public void mo11509a() {
        if (this.f9190d) {
            return;
        }
        this.f9189c = this.f9189c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f9189c);
        this.f9192f = this.f9192f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f9192f);
        this.f9190d = true;
    }

    /* JADX INFO: renamed from: c */
    public final int m11654c() {
        return this.f9188b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m11662p();
        if (this.f9188b != 0) {
            this.f9187a = null;
            this.f9188b = 0;
        }
        if (this.f9189c.isEmpty()) {
            return;
        }
        this.f9189c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m11659m(comparable) >= 0 || this.f9189c.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Iterable m11655d() {
        return this.f9189c.isEmpty() ? Collections.EMPTY_SET : this.f9189c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f9191e == null) {
            this.f9191e = new C2588n6(this, null);
        }
        return this.f9191e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2610p6)) {
            return super.equals(obj);
        }
        C2610p6 c2610p6 = (C2610p6) obj;
        int size = size();
        if (size != c2610p6.size()) {
            return false;
        }
        int i10 = this.f9188b;
        if (i10 != c2610p6.f9188b) {
            return entrySet().equals(c2610p6.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!m11657g(i11).equals(c2610p6.m11657g(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f9189c.equals(c2610p6.f9189c);
        }
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        m11662p();
        int iM11659m = m11659m(comparable);
        if (iM11659m >= 0) {
            return ((C2555k6) this.f9187a[iM11659m]).setValue(obj);
        }
        m11662p();
        if (this.f9187a == null) {
            this.f9187a = new Object[16];
        }
        int i10 = -(iM11659m + 1);
        if (i10 >= 16) {
            return m11661o().put(comparable, obj);
        }
        if (this.f9188b == 16) {
            C2555k6 c2555k6 = (C2555k6) this.f9187a[15];
            this.f9188b = 15;
            m11661o().put(c2555k6.m11531a(), c2555k6.getValue());
        }
        Object[] objArr = this.f9187a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f9187a[i10] = new C2555k6(this, comparable, obj);
        this.f9188b++;
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Map.Entry m11657g(int i10) {
        if (i10 < this.f9188b) {
            return (C2555k6) this.f9187a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM11659m = m11659m(comparable);
        return iM11659m >= 0 ? ((C2555k6) this.f9187a[iM11659m]).getValue() : this.f9189c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f9188b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f9187a[i11].hashCode();
        }
        return this.f9189c.size() > 0 ? iHashCode + this.f9189c.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m11658k() {
        return this.f9190d;
    }

    /* JADX INFO: renamed from: m */
    public final int m11659m(Comparable comparable) {
        int i10 = this.f9188b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((C2555k6) this.f9187a[i11]).m11531a());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((C2555k6) this.f9187a[i13]).m11531a());
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

    /* JADX INFO: renamed from: n */
    public final Object m11660n(int i10) {
        m11662p();
        Object value = ((C2555k6) this.f9187a[i10]).getValue();
        Object[] objArr = this.f9187a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f9188b - i10) - 1);
        this.f9188b--;
        if (!this.f9189c.isEmpty()) {
            Iterator it = m11661o().entrySet().iterator();
            Object[] objArr2 = this.f9187a;
            int i11 = this.f9188b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new C2555k6(this, (Comparable) entry.getKey(), entry.getValue());
            this.f9188b++;
            it.remove();
        }
        return value;
    }

    /* JADX INFO: renamed from: o */
    public final SortedMap m11661o() {
        m11662p();
        if (this.f9189c.isEmpty() && !(this.f9189c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9189c = treeMap;
            this.f9192f = treeMap.descendingMap();
        }
        return (SortedMap) this.f9189c;
    }

    /* JADX INFO: renamed from: p */
    public final void m11662p() {
        if (this.f9190d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m11662p();
        Comparable comparable = (Comparable) obj;
        int iM11659m = m11659m(comparable);
        if (iM11659m >= 0) {
            return m11660n(iM11659m);
        }
        if (this.f9189c.isEmpty()) {
            return null;
        }
        return this.f9189c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9188b + this.f9189c.size();
    }
}
