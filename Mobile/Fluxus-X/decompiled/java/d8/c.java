package d8;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11964a;
    public final m8.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m8.a f11965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11966d;

    public c(Context context, m8.a aVar, m8.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f11964a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f11965c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f11966d = str;
    }

    @Override // d8.h
    public Context b() {
        return this.f11964a;
    }

    @Override // d8.h
    @NonNull
    public String c() {
        return this.f11966d;
    }

    @Override // d8.h
    public m8.a d() {
        return this.f11965c;
    }

    @Override // d8.h
    public m8.a e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f11964a.equals(hVar.b()) && this.b.equals(hVar.e()) && this.f11965c.equals(hVar.d()) && this.f11966d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f11964a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f11965c.hashCode()) * 1000003) ^ this.f11966d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f11964a + ", wallClock=" + this.b + ", monotonicClock=" + this.f11965c + ", backendName=" + this.f11966d + "}";
    }
}
