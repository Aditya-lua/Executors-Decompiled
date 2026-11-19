package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class d0 extends e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s0 f8331e;

    public static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map.Entry<K, d0> f8332a;

        public d0 a() {
            return this.f8332a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f8332a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            d0 value = this.f8332a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof s0) {
                return this.f8332a.getValue().d((s0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public b(Map.Entry<K, d0> entry) {
            this.f8332a = entry;
        }
    }

    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f8333a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f8333a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f8333a.next();
            return next.getValue() instanceof d0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8333a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f8333a.remove();
        }
    }

    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public s0 f() {
        return c(this.f8331e);
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
