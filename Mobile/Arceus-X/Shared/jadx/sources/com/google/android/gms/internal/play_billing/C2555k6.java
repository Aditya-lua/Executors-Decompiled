package com.google.android.gms.internal.play_billing;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2555k6 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    public final Comparable f9070a;

    /* JADX INFO: renamed from: b */
    public Object f9071b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2610p6 f9072c;

    public C2555k6(C2610p6 c2610p6, Comparable comparable, Object obj) {
        Objects.requireNonNull(c2610p6);
        this.f9072c = c2610p6;
        this.f9070a = comparable;
        this.f9071b = obj;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m11530b(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: a */
    public final Comparable m11531a() {
        return this.f9070a;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f9070a.compareTo(((C2555k6) obj).f9070a);
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
        return m11530b(this.f9070a, entry.getKey()) && m11530b(this.f9071b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f9070a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9071b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f9070a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f9071b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f9072c.m11662p();
        Object obj2 = this.f9071b;
        this.f9071b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f9070a) + "=" + String.valueOf(this.f9071b);
    }
}
