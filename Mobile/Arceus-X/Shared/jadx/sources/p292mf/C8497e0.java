package p292mf;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: mf.e0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8497e0<T> {

    /* JADX INFO: renamed from: a */
    public final Class<? extends Annotation> f31218a;

    /* JADX INFO: renamed from: b */
    public final Class<T> f31219b;

    /* JADX INFO: renamed from: mf.e0$a */
    public @interface a {
    }

    public C8497e0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f31218a = cls;
        this.f31219b = cls2;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static <T> C8497e0<T> m34315a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new C8497e0<>(cls, cls2);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static <T> C8497e0<T> m34316b(Class<T> cls) {
        return new C8497e0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8497e0.class != obj.getClass()) {
            return false;
        }
        C8497e0 c8497e0 = (C8497e0) obj;
        if (this.f31219b.equals(c8497e0.f31219b)) {
            return this.f31218a.equals(c8497e0.f31218a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f31219b.hashCode() * 31) + this.f31218a.hashCode();
    }

    public String toString() {
        if (this.f31218a == a.class) {
            return this.f31219b.getName();
        }
        return "@" + this.f31218a.getName() + " " + this.f31219b.getName();
    }
}
