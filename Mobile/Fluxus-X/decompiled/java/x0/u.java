package x0;

import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class u<T> implements x2.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x2.a<T> f36114a;

    public void a(x2.a<T> aVar) {
        this.f36114a = aVar;
    }

    @Override // x2.a
    public void accept(T t8) {
        Intrinsics.d(this.f36114a, "Listener is not set.");
        this.f36114a.accept(t8);
    }
}
