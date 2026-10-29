package p410rf;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: rf.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C10868d {

    /* JADX INFO: renamed from: a */
    public final String f38595a;

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, Object> f38596b;

    /* JADX INFO: renamed from: rf.d$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f38597a;

        /* JADX INFO: renamed from: b */
        public Map<Class<?>, Object> f38598b = null;

        public b(String str) {
            this.f38597a = str;
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public C10868d m41324a() {
            return new C10868d(this.f38597a, this.f38598b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f38598b)));
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public <T extends Annotation> b m41325b(@NonNull T t8) {
            if (this.f38598b == null) {
                this.f38598b = new HashMap();
            }
            this.f38598b.put(t8.annotationType(), t8);
            return this;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static b m41320a(@NonNull String str) {
        return new b(str);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static C10868d m41321d(@NonNull String str) {
        return new C10868d(str, Collections.EMPTY_MAP);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String m41322b() {
        return this.f38595a;
    }

    /* JADX INFO: renamed from: c */
    public <T extends Annotation> T m41323c(@NonNull Class<T> cls) {
        return (T) this.f38596b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10868d)) {
            return false;
        }
        C10868d c10868d = (C10868d) obj;
        return this.f38595a.equals(c10868d.f38595a) && this.f38596b.equals(c10868d.f38596b);
    }

    public int hashCode() {
        return (this.f38595a.hashCode() * 31) + this.f38596b.hashCode();
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.f38595a + ", properties=" + this.f38596b.values() + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C10868d(String str, Map<Class<?>, Object> map) {
        this.f38595a = str;
        this.f38596b = map;
    }
}
