package us;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<? extends qn.s>, t> f32607a;

    public static class a implements k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<? extends qn.s>, t> f32608a = new HashMap(3);

        @Override // us.k.a
        @NonNull
        public <N extends qn.s> k.a a(@NonNull Class<N> cls, t tVar) {
            if (tVar == null) {
                this.f32608a.remove(cls);
                return this;
            }
            this.f32608a.put(cls, tVar);
            return this;
        }

        @Override // us.k.a
        @NonNull
        public k build() {
            return new l(Collections.unmodifiableMap(this.f32608a));
        }
    }

    public l(@NonNull Map<Class<? extends qn.s>, t> map) {
        this.f32607a = map;
    }

    @Override // us.k
    public <N extends qn.s> t a(@NonNull Class<N> cls) {
        return this.f32607a.get(cls);
    }
}
