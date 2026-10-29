package c8;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4653a;
    public final l8.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l8.a f4654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4655d;

    public c(Context context, l8.a aVar, l8.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f4653a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f4654c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f4655d = str;
    }

    @Override // c8.h
    public Context b() {
        return this.f4653a;
    }

    @Override // c8.h
    @NonNull
    public String c() {
        return this.f4655d;
    }

    @Override // c8.h
    public l8.a d() {
        return this.f4654c;
    }

    @Override // c8.h
    public l8.a e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f4653a.equals(hVar.b()) && this.b.equals(hVar.e()) && this.f4654c.equals(hVar.d()) && this.f4655d.equals(hVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f4653a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.f4654c.hashCode()) * 1000003) ^ this.f4655d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f4653a + ", wallClock=" + this.b + ", monotonicClock=" + this.f4654c + ", backendName=" + this.f4655d + "}";
    }
}
