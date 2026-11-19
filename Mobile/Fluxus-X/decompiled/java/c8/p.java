package c8;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p implements z7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<z7.c> f4926a;
    public final o b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f4927c;

    public p(Set<z7.c> set, o oVar, s sVar) {
        this.f4926a = set;
        this.b = oVar;
        this.f4927c = sVar;
    }

    @Override // z7.i
    public <T> z7.h<T> a(String str, Class<T> cls, z7.c cVar, z7.g<T, byte[]> gVar) {
        if (this.f4926a.contains(cVar)) {
            return new r(this.b, str, cVar, gVar, this.f4927c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, this.f4926a));
    }
}
