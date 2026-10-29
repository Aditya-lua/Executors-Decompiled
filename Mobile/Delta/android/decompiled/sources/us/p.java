package us;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32615a;

    public p(@NonNull String str) {
        this.f32615a = str;
    }

    @NonNull
    public static <T> p<T> b(@NonNull String str) {
        return new p<>(str);
    }

    public T a(@NonNull r rVar) {
        return (T) rVar.a(this);
    }

    @NonNull
    public T c(@NonNull r rVar) {
        T tA = a(rVar);
        if (tA != null) {
            return tA;
        }
        throw new NullPointerException(this.f32615a);
    }

    public void d(@NonNull r rVar, T t8) {
        rVar.b(this, t8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f32615a.equals(((p) obj).f32615a);
    }

    public int hashCode() {
        return this.f32615a.hashCode();
    }

    public String toString() {
        return "Prop{name='" + this.f32615a + "'}";
    }
}
