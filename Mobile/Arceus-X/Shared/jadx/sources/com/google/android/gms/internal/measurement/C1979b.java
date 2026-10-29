package com.google.android.gms.internal.measurement;

import ie.AbstractC6802w;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1979b {

    /* JADX INFO: renamed from: d */
    public static final AbstractC6802w f8106d = AbstractC6802w.m29142x("_syn", "_err", "_el");

    /* JADX INFO: renamed from: a */
    public String f8107a;

    /* JADX INFO: renamed from: b */
    public final long f8108b;

    /* JADX INFO: renamed from: c */
    public final Map f8109c;

    public C1979b(String str, long j10, Map map) {
        this.f8107a = str;
        this.f8108b = j10;
        HashMap map2 = new HashMap();
        this.f8109c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    /* JADX INFO: renamed from: h */
    public static Object m9766h(String str, Object obj, Object obj2) {
        if (f8106d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: a */
    public final long m9767a() {
        return this.f8108b;
    }

    /* JADX INFO: renamed from: b */
    public final String m9768b() {
        return this.f8107a;
    }

    /* JADX INFO: renamed from: c */
    public final void m9769c(String str) {
        this.f8107a = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m9770d(String str, Object obj) {
        if (obj == null) {
            this.f8109c.remove(str);
        } else {
            Map map = this.f8109c;
            map.put(str, m9766h(str, map.get(str), obj));
        }
    }

    /* JADX INFO: renamed from: e */
    public final Object m9771e(String str) {
        Map map = this.f8109c;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1979b)) {
            return false;
        }
        C1979b c1979b = (C1979b) obj;
        if (this.f8108b == c1979b.f8108b && this.f8107a.equals(c1979b.f8107a)) {
            return this.f8109c.equals(c1979b.f8109c);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Map m9772f() {
        return this.f8109c;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C1979b clone() {
        return new C1979b(this.f8107a, this.f8108b, new HashMap(this.f8109c));
    }

    public final int hashCode() {
        int iHashCode = this.f8107a.hashCode() * 31;
        long j10 = this.f8108b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f8109c.hashCode();
    }

    public final String toString() {
        String str = this.f8107a;
        String string = this.f8109c.toString();
        int length = String.valueOf(str).length();
        long j10 = this.f8108b;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j10).length() + 9 + string.length() + 1);
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j10);
        sb2.append(", params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
