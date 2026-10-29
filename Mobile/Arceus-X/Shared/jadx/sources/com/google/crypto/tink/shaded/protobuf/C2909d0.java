package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.d0 */
/* JADX INFO: loaded from: classes2.dex */
public class C2909d0 extends C2912e0 {

    /* JADX INFO: renamed from: e */
    public final InterfaceC2954s0 f10829e;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.d0$b */
    public static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a */
        public Map.Entry<K, C2909d0> f10830a;

        /* JADX INFO: renamed from: a */
        public C2909d0 m13420a() {
            return this.f10830a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f10830a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C2909d0 value = this.f10830a.getValue();
            if (value == null) {
                return null;
            }
            return value.m13419f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC2954s0) {
                return this.f10830a.getValue().m13473d((InterfaceC2954s0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(Map.Entry<K, C2909d0> entry) {
            this.f10830a = entry;
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.d0$c */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a */
        public Iterator<Map.Entry<K, Object>> f10831a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f10831a = it;
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f10831a.next();
            return next.getValue() instanceof C2909d0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10831a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f10831a.remove();
        }
    }

    public boolean equals(Object obj) {
        return m13419f().equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC2954s0 m13419f() {
        return m13472c(this.f10829e);
    }

    public int hashCode() {
        return m13419f().hashCode();
    }

    public String toString() {
        return m13419f().toString();
    }
}
