package b8;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p implements y7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<y7.c> f4043a;
    public final o b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f4044c;

    public p(Set<y7.c> set, o oVar, s sVar) {
        this.f4043a = set;
        this.b = oVar;
        this.f4044c = sVar;
    }

    @Override // y7.i
    public <T> y7.h<T> a(String str, Class<T> cls, y7.c cVar, y7.g<T, byte[]> gVar) {
        if (this.f4043a.contains(cVar)) {
            return new r(this.b, str, cVar, gVar, this.f4044c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, this.f4043a));
    }
}
