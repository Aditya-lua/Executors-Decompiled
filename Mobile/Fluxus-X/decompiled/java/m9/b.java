package m9;

import androidx.annotation.NonNull;
import l9.a.d;

/* JADX INFO: loaded from: classes.dex */
public final class b<O extends l9.a.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22974a;
    public final l9.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l9.a.d f22975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22976d;

    public b(l9.a aVar, l9.a.d dVar, String str) {
        this.b = aVar;
        this.f22975c = dVar;
        this.f22976d = str;
        this.f22974a = o9.q.c(aVar, dVar, str);
    }

    @NonNull
    public static <O extends l9.a.d> b<O> a(@NonNull l9.a<O> aVar, O o10, String str) {
        return new b<>(aVar, o10, str);
    }

    @NonNull
    public final String b() {
        return this.b.c();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return o9.q.b(this.b, bVar.b) && o9.q.b(this.f22975c, bVar.f22975c) && o9.q.b(this.f22976d, bVar.f22976d);
    }

    public final int hashCode() {
        return this.f22974a;
    }
}
