package ss;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<? extends on.s>, t> f31797a;

    public static class a implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<? extends on.s>, t> f31798a = new HashMap(3);

        @Override // ss.k.a
        @NonNull
        public <N extends on.s> k.a a(@NonNull Class<N> cls, t tVar) {
            if (tVar == null) {
                this.f31798a.remove(cls);
                return this;
            }
            this.f31798a.put(cls, tVar);
            return this;
        }

        @Override // ss.k.a
        @NonNull
        public k build() {
            return new l(Collections.unmodifiableMap(this.f31798a));
        }
    }

    public l(@NonNull Map<Class<? extends on.s>, t> map) {
        this.f31797a = map;
    }

    @Override // ss.k
    public <N extends on.s> t a(@NonNull Class<N> cls) {
        return this.f31797a.get(cls);
    }
}
