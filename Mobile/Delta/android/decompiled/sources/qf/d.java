package qf;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29361a;
    public final Map<Class<?>, Object> b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29362a;
        public Map<Class<?>, Object> b = null;

        public b(String str) {
            this.f29362a = str;
        }

        @NonNull
        public d a() {
            return new d(this.f29362a, this.b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.b)));
        }

        @NonNull
        public <T extends Annotation> b b(@NonNull T t8) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(t8.annotationType(), t8);
            return this;
        }
    }

    @NonNull
    public static b a(@NonNull String str) {
        return new b(str);
    }

    @NonNull
    public static d d(@NonNull String str) {
        return new d(str, Collections.EMPTY_MAP);
    }

    @NonNull
    public String b() {
        return this.f29361a;
    }

    public <T extends Annotation> T c(@NonNull Class<T> cls) {
        return (T) this.b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f29361a.equals(dVar.f29361a) && this.b.equals(dVar.b);
    }

    public int hashCode() {
        return (this.f29361a.hashCode() * 31) + this.b.hashCode();
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.f29361a + ", properties=" + this.b.values() + "}";
    }

    public d(String str, Map<Class<?>, Object> map) {
        this.f29361a = str;
        this.b = map;
    }
}
