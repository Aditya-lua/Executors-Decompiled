package wt;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<K, V> f36003a;

    public f(int i10) {
        this.f36003a = b.c(i10);
    }

    public static <K, V> f<K, V> b(int i10) {
        return new f<>(i10);
    }

    public Map<K, V> a() {
        return this.f36003a.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f36003a);
    }

    public f<K, V> c(K k10, V v8) {
        this.f36003a.put(k10, v8);
        return this;
    }
}
