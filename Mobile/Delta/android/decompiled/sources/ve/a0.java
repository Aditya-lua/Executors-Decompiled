package ve;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {
    public static a0 b = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<i0> f32917a = new AtomicReference<>(i0.c().c());

    public static a0 c() {
        return b;
    }

    public <WrapperPrimitiveT> Class<?> a(Class<WrapperPrimitiveT> cls) {
        return this.f32917a.get().e(cls);
    }

    public <KeyT extends oe.l, PrimitiveT> PrimitiveT b(KeyT keyt, Class<PrimitiveT> cls) {
        return (PrimitiveT) this.f32917a.get().f(keyt, cls);
    }

    public synchronized <KeyT extends oe.l, PrimitiveT> void d(h0<KeyT, PrimitiveT> h0Var) {
        this.f32917a.set(i0.d(this.f32917a.get()).d(h0Var).c());
    }

    public synchronized <InputPrimitiveT, WrapperPrimitiveT> void e(k0<InputPrimitiveT, WrapperPrimitiveT> k0Var) {
        this.f32917a.set(i0.d(this.f32917a.get()).e(k0Var).c());
    }

    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT f(j0<InputPrimitiveT> j0Var, Class<WrapperPrimitiveT> cls) {
        return (WrapperPrimitiveT) this.f32917a.get().g(j0Var, cls);
    }
}
