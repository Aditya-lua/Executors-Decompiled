package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ed */
/* JADX INFO: loaded from: classes.dex */
public final class C2050ed implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    public final Comparable f8164a;

    /* JADX INFO: renamed from: b */
    public Object f8165b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2107hd f8166c;

    public C2050ed(C2107hd c2107hd, Comparable comparable, Object obj) {
        Objects.requireNonNull(c2107hd);
        this.f8166c = c2107hd;
        this.f8164a = comparable;
        this.f8165b = obj;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m9946b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: a */
    public final Comparable m9947a() {
        return this.f8164a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f8164a.compareTo(((C2050ed) obj).f8164a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return m9946b(this.f8164a, entry.getKey()) && m9946b(this.f8165b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f8164a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f8165b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f8164a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f8165b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f8166c.m10207i();
        Object obj2 = this.f8165b;
        this.f8165b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f8164a);
        String strValueOf2 = String.valueOf(this.f8165b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return sb2.toString();
    }
}
