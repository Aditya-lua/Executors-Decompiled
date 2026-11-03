package x0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class u<T> implements x2.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x2.a<T> f35148a;

    public void a(x2.a<T> aVar) {
        this.f35148a = aVar;
    }

    @Override // x2.a
    public void accept(T t8) {
        Intrinsics.d(this.f35148a, "Listener is not set.");
        this.f35148a.accept(t8);
    }
}
