package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2055f implements Iterable, InterfaceC2255q, InterfaceC2183m {

    /* JADX INFO: renamed from: a */
    public final SortedMap f8171a;

    /* JADX INFO: renamed from: b */
    public final Map f8172b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2055f() {
        this.f8171a = new TreeMap();
        this.f8172b = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9950a() {
        C2055f c2055f = new C2055f();
        for (Map.Entry entry : this.f8171a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2183m) {
                c2055f.f8171a.put((Integer) entry.getKey(), (InterfaceC2255q) entry.getValue());
            } else {
                c2055f.f8171a.put((Integer) entry.getKey(), ((InterfaceC2255q) entry.getValue()).mo9950a());
            }
        }
        return c2055f;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2255q mo9951c(String str) {
        InterfaceC2255q interfaceC2255q;
        if ("length".equals(str)) {
            return new C2129j(Double.valueOf(m9957k()));
        }
        return (!mo9954g(str) || (interfaceC2255q = (InterfaceC2255q) this.f8172b.get(str)) == null) ? InterfaceC2255q.f8587zo : interfaceC2255q;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    /* JADX INFO: renamed from: d */
    public final void mo9952d(String str, InterfaceC2255q interfaceC2255q) {
        if (interfaceC2255q == null) {
            this.f8172b.remove(str);
        } else {
            this.f8172b.put(str, interfaceC2255q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: e */
    public final InterfaceC2255q mo9953e(String str, C2332u4 c2332u4, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? C2018d0.m9897a(str, this, c2332u4, list) : InterfaceC2183m.m10368b(this, new C2327u(str), c2332u4, list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2055f)) {
            return false;
        }
        C2055f c2055f = (C2055f) obj;
        if (m9957k() != c2055f.m9957k()) {
            return false;
        }
        SortedMap sortedMap = this.f8171a;
        if (sortedMap.isEmpty()) {
            return c2055f.f8171a.isEmpty();
        }
        for (int iIntValue = ((Integer) sortedMap.firstKey()).intValue(); iIntValue <= ((Integer) sortedMap.lastKey()).intValue(); iIntValue++) {
            if (!m9959m(iIntValue).equals(c2055f.m9959m(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2183m
    /* JADX INFO: renamed from: g */
    public final boolean mo9954g(String str) {
        return "length".equals(str) || this.f8172b.containsKey(str);
    }

    /* JADX INFO: renamed from: h */
    public final List m9955h() {
        ArrayList arrayList = new ArrayList(m9957k());
        for (int i10 = 0; i10 < m9957k(); i10++) {
            arrayList.add(m9959m(i10));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f8171a.hashCode() * 31;
    }

    /* JADX INFO: renamed from: i */
    public final Iterator m9956i() {
        return this.f8171a.keySet().iterator();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2036e(this);
    }

    /* JADX INFO: renamed from: k */
    public final int m9957k() {
        SortedMap sortedMap = this.f8171a;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    /* JADX INFO: renamed from: l */
    public final int m9958l() {
        return this.f8171a.size();
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC2255q m9959m(int i10) {
        InterfaceC2255q interfaceC2255q;
        if (i10 < m9957k()) {
            return (!m9961t(i10) || (interfaceC2255q = (InterfaceC2255q) this.f8171a.get(Integer.valueOf(i10))) == null) ? InterfaceC2255q.f8587zo : interfaceC2255q;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    /* JADX INFO: renamed from: p */
    public final void m9960p(int i10, InterfaceC2255q interfaceC2255q) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Out of bounds index: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (interfaceC2255q == null) {
            this.f8171a.remove(Integer.valueOf(i10));
        } else {
            this.f8171a.put(Integer.valueOf(i10), interfaceC2255q);
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m9961t(int i10) {
        if (i10 >= 0) {
            SortedMap sortedMap = this.f8171a;
            if (i10 <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i10));
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final String toString() {
        return m9965z(",");
    }

    /* JADX INFO: renamed from: u */
    public final void m9962u() {
        this.f8171a.clear();
    }

    /* JADX INFO: renamed from: x */
    public final void m9963x(int i10, InterfaceC2255q interfaceC2255q) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Invalid value index: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 >= m9957k()) {
            m9960p(i10, interfaceC2255q);
            return;
        }
        SortedMap sortedMap = this.f8171a;
        for (int iIntValue = ((Integer) sortedMap.lastKey()).intValue(); iIntValue >= i10; iIntValue--) {
            Integer numValueOf = Integer.valueOf(iIntValue);
            InterfaceC2255q interfaceC2255q2 = (InterfaceC2255q) sortedMap.get(numValueOf);
            if (interfaceC2255q2 != null) {
                m9960p(iIntValue + 1, interfaceC2255q2);
                sortedMap.remove(numValueOf);
            }
        }
        m9960p(i10, interfaceC2255q);
    }

    /* JADX INFO: renamed from: y */
    public final void m9964y(int i10) {
        SortedMap sortedMap = this.f8171a;
        int iIntValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i10 > iIntValue || i10 < 0) {
            return;
        }
        sortedMap.remove(Integer.valueOf(i10));
        if (i10 == iIntValue) {
            int i11 = i10 - 1;
            Integer numValueOf = Integer.valueOf(i11);
            if (sortedMap.containsKey(numValueOf) || i11 < 0) {
                return;
            }
            sortedMap.put(numValueOf, InterfaceC2255q.f8587zo);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i10);
            InterfaceC2255q interfaceC2255q = (InterfaceC2255q) sortedMap.get(numValueOf2);
            if (interfaceC2255q != null) {
                sortedMap.put(Integer.valueOf(i10 - 1), interfaceC2255q);
                sortedMap.remove(numValueOf2);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final String m9965z(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f8171a.isEmpty()) {
            int i10 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i10 >= m9957k()) {
                    break;
                }
                InterfaceC2255q interfaceC2255qM9959m = m9959m(i10);
                sb2.append(str2);
                if (!(interfaceC2255qM9959m instanceof C2345v) && !(interfaceC2255qM9959m instanceof C2219o)) {
                    sb2.append(interfaceC2255qM9959m.zzc());
                }
                i10++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final String zzc() {
        return m9965z(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Double zzd() {
        SortedMap sortedMap = this.f8171a;
        if (sortedMap.size() == 1) {
            return m9959m(0).zzd();
        }
        return sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Iterator zzf() {
        return new C2017d(this, this.f8171a.keySet().iterator(), this.f8172b.keySet().iterator());
    }

    public C2055f(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                m9960p(i10, (InterfaceC2255q) list.get(i10));
            }
        }
    }
}
