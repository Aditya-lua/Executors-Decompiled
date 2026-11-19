package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ke.w f6398d = ke.w.v("_syn", "_err", "_el");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6399a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f6400c;

    public b(String str, long j10, Map map) {
        this.f6399a = str;
        this.b = j10;
        HashMap map2 = new HashMap();
        this.f6400c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object h(String str, Object obj, Object obj2) {
        if (f6398d.contains(str) && (obj2 instanceof Double)) {
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

    public final long a() {
        return this.b;
    }

    public final String b() {
        return this.f6399a;
    }

    public final void c(String str) {
        this.f6399a = str;
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f6400c.remove(str);
        } else {
            Map map = this.f6400c;
            map.put(str, h(str, map.get(str), obj));
        }
    }

    public final Object e(String str) {
        Map map = this.f6400c;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.b == bVar.b && this.f6399a.equals(bVar.f6399a)) {
            return this.f6400c.equals(bVar.f6400c);
        }
        return false;
    }

    public final Map f() {
        return this.f6400c;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        return new b(this.f6399a, this.b, new HashMap(this.f6400c));
    }

    public final int hashCode() {
        int iHashCode = this.f6399a.hashCode() * 31;
        long j10 = this.b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f6400c.hashCode();
    }

    public final String toString() {
        String str = this.f6399a;
        String string = this.f6400c.toString();
        int length = String.valueOf(str).length();
        long j10 = this.b;
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
