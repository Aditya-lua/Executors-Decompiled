package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class hd extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f6475a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f6476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile gd f6478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f6479f;

    public /* synthetic */ hd(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.f6476c = map;
        this.f6479f = map;
    }

    public void a() {
        if (this.f6477d) {
            return;
        }
        this.f6476c = this.f6476c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f6476c);
        this.f6479f = this.f6479f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f6479f);
        this.f6477d = true;
    }

    public final boolean b() {
        return this.f6477d;
    }

    public final int c() {
        return this.b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        if (this.b != 0) {
            this.f6475a = null;
            this.b = 0;
        }
        if (this.f6476c.isEmpty()) {
            return;
        }
        this.f6476c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return n(comparable) >= 0 || this.f6476c.containsKey(comparable);
    }

    public final Map.Entry d(int i10) {
        if (i10 < this.b) {
            return (ed) this.f6475a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final Iterable e() {
        return this.f6476c.isEmpty() ? Collections.EMPTY_SET : this.f6476c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f6478e == null) {
            this.f6478e = new gd(this, null);
        }
        return this.f6478e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd)) {
            return super.equals(obj);
        }
        hd hdVar = (hd) obj;
        int size = size();
        if (size != hdVar.size()) {
            return false;
        }
        int i10 = this.b;
        if (i10 != hdVar.b) {
            return entrySet().equals(hdVar.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!d(i11).equals(hdVar.d(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f6476c.equals(hdVar.f6476c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        i();
        int iN = n(comparable);
        if (iN >= 0) {
            return ((ed) this.f6475a[iN]).setValue(obj);
        }
        i();
        if (this.f6475a == null) {
            this.f6475a = new Object[16];
        }
        int i10 = -(iN + 1);
        if (i10 >= 16) {
            return p().put(comparable, obj);
        }
        if (this.b == 16) {
            ed edVar = (ed) this.f6475a[15];
            this.b = 15;
            p().put(edVar.a(), edVar.getValue());
        }
        Object[] objArr = this.f6475a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f6475a[i10] = new ed(this, comparable, obj);
        this.b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        return iN >= 0 ? ((ed) this.f6475a[iN]).getValue() : this.f6476c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f6475a[i11].hashCode();
        }
        return this.f6476c.size() > 0 ? iHashCode + this.f6476c.hashCode() : iHashCode;
    }

    public final /* synthetic */ Object[] j() {
        return this.f6475a;
    }

    public final /* synthetic */ int k() {
        return this.b;
    }

    public final /* synthetic */ Map l() {
        return this.f6476c;
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object g(int i10) {
        i();
        Object value = ((ed) this.f6475a[i10]).getValue();
        Object[] objArr = this.f6475a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.b - i10) - 1);
        this.b--;
        if (!this.f6476c.isEmpty()) {
            Iterator it = p().entrySet().iterator();
            Object[] objArr2 = this.f6475a;
            int i11 = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new ed(this, (Comparable) entry.getKey(), entry.getValue());
            this.b++;
            it.remove();
        }
        return value;
    }

    public final int n(Comparable comparable) {
        int i10 = this.b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((ed) this.f6475a[i11]).a());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((ed) this.f6475a[i13]).a());
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

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void i() {
        if (this.f6477d) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap p() {
        i();
        if (this.f6476c.isEmpty() && !(this.f6476c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f6476c = treeMap;
            this.f6479f = treeMap.descendingMap();
        }
        return (SortedMap) this.f6476c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        if (iN >= 0) {
            return g(iN);
        }
        if (this.f6476c.isEmpty()) {
            return null;
        }
        return this.f6476c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.b + this.f6476c.size();
    }
}
