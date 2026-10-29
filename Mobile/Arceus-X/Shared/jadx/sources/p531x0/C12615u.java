package p531x0;

import kotlin.jvm.internal.Intrinsics;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: x0.u */
/* JADX INFO: loaded from: classes.dex */
public class C12615u<T> implements InterfaceC12631a<T> {

    /* JADX INFO: renamed from: a */
    public InterfaceC12631a<T> f44913a;

    /* JADX INFO: renamed from: a */
    public void m47004a(InterfaceC12631a<T> interfaceC12631a) {
        this.f44913a = interfaceC12631a;
    }

    @Override // p533x2.InterfaceC12631a
    public void accept(T t8) {
        Intrinsics.m31981d(this.f44913a, "Listener is not set.");
        this.f44913a.accept(t8);
    }
}
