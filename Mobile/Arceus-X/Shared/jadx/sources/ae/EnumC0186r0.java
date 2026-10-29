package ae;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ae.r0 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC0186r0 implements InterfaceC0170j0 {
    INSTANCE;


    /* JADX INFO: renamed from: b */
    public static final AtomicReference f580b = new AtomicReference(null);

    /* JADX INFO: renamed from: a */
    public final void m533a(InterfaceC0172k0 interfaceC0172k0) {
        f580b.set(interfaceC0172k0);
    }

    @Override // ae.InterfaceC0170j0
    public final InterfaceC0172k0 zza() {
        return (InterfaceC0172k0) f580b.get();
    }
}
