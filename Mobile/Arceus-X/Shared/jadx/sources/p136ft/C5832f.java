package p136ft;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: ft.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C5832f<K, V> {

    /* JADX INFO: renamed from: a */
    public final Map<K, V> f22233a;

    public C5832f(int i10) {
        this.f22233a = C5828b.m26176c(i10);
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> C5832f<K, V> m26183b(int i10) {
        return new C5832f<>(i10);
    }

    /* JADX INFO: renamed from: a */
    public Map<K, V> m26184a() {
        return this.f22233a.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f22233a);
    }

    /* JADX INFO: renamed from: c */
    public C5832f<K, V> m26185c(K k10, V v5) {
        this.f22233a.put(k10, v5);
        return this;
    }
}
