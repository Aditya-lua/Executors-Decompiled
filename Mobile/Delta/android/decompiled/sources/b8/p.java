package b8;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class p implements y7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<y7.c> f3941a;
    public final o b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f3942c;

    public p(Set<y7.c> set, o oVar, s sVar) {
        this.f3941a = set;
        this.b = oVar;
        this.f3942c = sVar;
    }

    @Override // y7.i
    public <T> y7.h<T> a(String str, Class<T> cls, y7.c cVar, y7.g<T, byte[]> gVar) {
        if (this.f3941a.contains(cVar)) {
            return new r(this.b, str, cVar, gVar, this.f3942c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, this.f3941a));
    }
}
