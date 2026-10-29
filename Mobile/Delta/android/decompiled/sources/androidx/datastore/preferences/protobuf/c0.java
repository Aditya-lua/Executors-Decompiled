package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends d0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f2148e;

    public static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map.Entry<K, c0> f2149a;

        public c0 a() {
            return this.f2149a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f2149a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            c0 value = this.f2149a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof r0) {
                return this.f2149a.getValue().d((r0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public b(Map.Entry<K, c0> entry) {
            this.f2149a = entry;
        }
    }

    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f2150a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f2150a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f2150a.next();
            return next.getValue() instanceof c0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2150a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f2150a.remove();
        }
    }

    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public r0 f() {
        return c(this.f2148e);
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
