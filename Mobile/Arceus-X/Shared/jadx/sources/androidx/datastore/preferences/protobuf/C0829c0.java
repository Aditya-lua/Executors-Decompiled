package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c0 */
/* JADX INFO: loaded from: classes.dex */
public class C0829c0 extends C0832d0 {

    /* JADX INFO: renamed from: e */
    public final InterfaceC0874r0 f2833e;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c0$b */
    public static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a */
        public Map.Entry<K, C0829c0> f2834a;

        /* JADX INFO: renamed from: a */
        public C0829c0 m3362a() {
            return this.f2834a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f2834a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C0829c0 value = this.f2834a.getValue();
            if (value == null) {
                return null;
            }
            return value.m3361f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC0874r0) {
                return this.f2834a.getValue().m3374d((InterfaceC0874r0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(Map.Entry<K, C0829c0> entry) {
            this.f2834a = entry;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c0$c */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, Object>> f2835a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f2835a = it;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f2835a.next();
            return next.getValue() instanceof C0829c0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2835a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f2835a.remove();
        }
    }

    public boolean equals(Object obj) {
        return m3361f().equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC0874r0 m3361f() {
        return m3373c(this.f2833e);
    }

    public int hashCode() {
        return m3361f().hashCode();
    }

    public String toString() {
        return m3361f().toString();
    }
}
