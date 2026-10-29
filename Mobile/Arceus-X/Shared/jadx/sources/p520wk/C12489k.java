package p520wk;

/* JADX INFO: renamed from: wk.k */
/* JADX INFO: loaded from: classes2.dex */
public class C12489k {

    /* JADX INFO: renamed from: a */
    public static final Object f44650a = new Object();

    /* JADX INFO: renamed from: b */
    public static InterfaceC12479a f44651b;

    /* JADX INFO: renamed from: a */
    public static InterfaceC12479a m46786a() {
        synchronized (f44650a) {
            try {
                InterfaceC12479a interfaceC12479a = f44651b;
                if (interfaceC12479a != null) {
                    return interfaceC12479a;
                }
                C12480b c12480b = new C12480b();
                f44651b = c12480b;
                return c12480b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m46787b(InterfaceC12479a interfaceC12479a) {
        synchronized (f44650a) {
            f44651b = interfaceC12479a;
        }
    }
}
