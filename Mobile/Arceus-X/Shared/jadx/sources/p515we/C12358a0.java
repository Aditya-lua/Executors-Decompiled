package p515we;

import java.util.concurrent.atomic.AtomicReference;
import pe.AbstractC10231l;

/* JADX INFO: renamed from: we.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C12358a0 {

    /* JADX INFO: renamed from: b */
    public static C12358a0 f44215b = new C12358a0();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C12374i0> f44216a = new AtomicReference<>(C12374i0.m46345c().m46352c());

    /* JADX INFO: renamed from: c */
    public static C12358a0 m46226c() {
        return f44215b;
    }

    /* JADX INFO: renamed from: a */
    public <WrapperPrimitiveT> Class<?> m46227a(Class<WrapperPrimitiveT> cls) {
        return this.f44216a.get().m46347e(cls);
    }

    /* JADX INFO: renamed from: b */
    public <KeyT extends AbstractC10231l, PrimitiveT> PrimitiveT m46228b(KeyT keyt, Class<PrimitiveT> cls) {
        return (PrimitiveT) this.f44216a.get().m46348f(keyt, cls);
    }

    /* JADX INFO: renamed from: d */
    public synchronized <KeyT extends AbstractC10231l, PrimitiveT> void m46229d(AbstractC12372h0<KeyT, PrimitiveT> abstractC12372h0) {
        this.f44216a.set(C12374i0.m46346d(this.f44216a.get()).m46353d(abstractC12372h0).m46352c());
    }

    /* JADX INFO: renamed from: e */
    public synchronized <InputPrimitiveT, WrapperPrimitiveT> void m46230e(InterfaceC12378k0<InputPrimitiveT, WrapperPrimitiveT> interfaceC12378k0) {
        this.f44216a.set(C12374i0.m46346d(this.f44216a.get()).m46354e(interfaceC12378k0).m46352c());
    }

    /* JADX INFO: renamed from: f */
    public <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT m46231f(C12376j0<InputPrimitiveT> c12376j0, Class<WrapperPrimitiveT> cls) {
        return (WrapperPrimitiveT) this.f44216a.get().m46349g(c12376j0, cls);
    }
}
