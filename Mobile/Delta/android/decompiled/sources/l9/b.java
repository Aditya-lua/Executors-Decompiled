package l9;

import androidx.annotation.NonNull;
import k9.a.d;

/* JADX INFO: loaded from: classes.dex */
public final class b<O extends k9.a.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22989a;
    public final k9.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k9.a.d f22990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22991d;

    public b(k9.a aVar, k9.a.d dVar, String str) {
        this.b = aVar;
        this.f22990c = dVar;
        this.f22991d = str;
        this.f22989a = n9.k.c(aVar, dVar, str);
    }

    @NonNull
    public static <O extends k9.a.d> b<O> a(@NonNull k9.a<O> aVar, O o8, String str) {
        return new b<>(aVar, o8, str);
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
        return n9.k.b(this.b, bVar.b) && n9.k.b(this.f22990c, bVar.f22990c) && n9.k.b(this.f22991d, bVar.f22991d);
    }

    public final int hashCode() {
        return this.f22989a;
    }
}
