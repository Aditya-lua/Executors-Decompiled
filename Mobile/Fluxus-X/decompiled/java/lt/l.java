package lt;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<? extends eo.s>, t> f22531a;

    public static class a implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<? extends eo.s>, t> f22532a = new HashMap(3);

        @Override // lt.k.a
        @NonNull
        public <N extends eo.s> k.a a(@NonNull Class<N> cls, t tVar) {
            if (tVar == null) {
                this.f22532a.remove(cls);
                return this;
            }
            this.f22532a.put(cls, tVar);
            return this;
        }

        @Override // lt.k.a
        @NonNull
        public k build() {
            return new l(Collections.unmodifiableMap(this.f22532a));
        }
    }

    public l(@NonNull Map<Class<? extends eo.s>, t> map) {
        this.f22531a = map;
    }

    @Override // lt.k
    public <N extends eo.s> t a(@NonNull Class<N> cls) {
        return this.f22531a.get(cls);
    }
}
