package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class ld extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f6598a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f6599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile kd f6601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f6602f;

    public /* synthetic */ ld(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.f6599c = map;
        this.f6602f = map;
    }

    public void a() {
        if (this.f6600d) {
            return;
        }
        this.f6599c = this.f6599c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f6599c);
        this.f6602f = this.f6602f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f6602f);
        this.f6600d = true;
    }

    public final boolean b() {
        return this.f6600d;
    }

    public final int c() {
        return this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (this.b != 0) {
            this.f6598a = null;
            this.b = 0;
        }
        if (this.f6599c.isEmpty()) {
            return;
        }
        this.f6599c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m(comparable) >= 0 || this.f6599c.containsKey(comparable);
    }

    public final Map.Entry d(int i10) {
        if (i10 < this.b) {
            return (id) this.f6598a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final Iterable e() {
        return this.f6599c.isEmpty() ? Collections.EMPTY_SET : this.f6599c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f6601e == null) {
            this.f6601e = new kd(this, null);
        }
        return this.f6601e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld)) {
            return super.equals(obj);
        }
        ld ldVar = (ld) obj;
        int size = size();
        if (size != ldVar.size()) {
            return false;
        }
        int i10 = this.b;
        if (i10 != ldVar.b) {
            return entrySet().equals(ldVar.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!d(i11).equals(ldVar.d(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f6599c.equals(ldVar.f6599c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int iM = m(comparable);
        if (iM >= 0) {
            return ((id) this.f6598a[iM]).setValue(obj);
        }
        h();
        if (this.f6598a == null) {
            this.f6598a = new Object[16];
        }
        int i10 = -(iM + 1);
        if (i10 >= 16) {
            return o().put(comparable, obj);
        }
        if (this.b == 16) {
            id idVar = (id) this.f6598a[15];
            this.b = 15;
            o().put(idVar.a(), idVar.getValue());
        }
        Object[] objArr = this.f6598a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f6598a[i10] = new id(this, comparable, obj);
        this.b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM = m(comparable);
        return iM >= 0 ? ((id) this.f6598a[iM]).getValue() : this.f6599c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f6598a[i11].hashCode();
        }
        return this.f6599c.size() > 0 ? iHashCode + this.f6599c.hashCode() : iHashCode;
    }

    public final /* synthetic */ Object[] i() {
        return this.f6598a;
    }

    public final /* synthetic */ int j() {
        return this.b;
    }

    public final /* synthetic */ Map k() {
        return this.f6599c;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object g(int i10) {
        h();
        Object value = ((id) this.f6598a[i10]).getValue();
        Object[] objArr = this.f6598a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.b - i10) - 1);
        this.b--;
        if (!this.f6599c.isEmpty()) {
            Iterator it = o().entrySet().iterator();
            Object[] objArr2 = this.f6598a;
            int i11 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new id(this, (Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return value;
    }

    public final int m(Comparable comparable) {
        int i10 = this.b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((id) this.f6598a[i11]).a());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((id) this.f6598a[i13]).a());
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

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void h() {
        if (this.f6600d) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap o() {
        h();
        if (this.f6599c.isEmpty() && !(this.f6599c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6599c = treeMap;
            this.f6602f = treeMap.descendingMap();
        }
        return (SortedMap) this.f6599c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iM = m(comparable);
        if (iM >= 0) {
            return g(iM);
        }
        if (this.f6599c.isEmpty()) {
            return null;
        }
        return this.f6599c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b + this.f6599c.size();
    }
}
