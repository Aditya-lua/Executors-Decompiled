package p292mf;

import p575yf.InterfaceC13187a;
import p575yf.InterfaceC13188b;

/* JADX INFO: renamed from: mf.c0 */
/* JADX INFO: loaded from: classes2.dex */
public class C8493c0<T> implements InterfaceC13188b<T> {

    /* JADX INFO: renamed from: c */
    public static final InterfaceC13187a<Object> f31213c = new InterfaceC13187a() { // from class: mf.a0
        @Override // p575yf.InterfaceC13187a
        /* JADX INFO: renamed from: a */
        public final void mo34271a(InterfaceC13188b interfaceC13188b) {
            C8493c0.m34301b(interfaceC13188b);
        }
    };

    /* JADX INFO: renamed from: d */
    public static final InterfaceC13188b<Object> f31214d = new InterfaceC13188b() { // from class: mf.b0
        @Override // p575yf.InterfaceC13188b
        public final Object get() {
            return C8493c0.m34300a();
        }
    };

    /* JADX INFO: renamed from: a */
    public InterfaceC13187a<T> f31215a;

    /* JADX INFO: renamed from: b */
    public volatile InterfaceC13188b<T> f31216b;

    public C8493c0(InterfaceC13187a<T> interfaceC13187a, InterfaceC13188b<T> interfaceC13188b) {
        this.f31215a = interfaceC13187a;
        this.f31216b = interfaceC13188b;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m34300a() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m34301b(InterfaceC13188b interfaceC13188b) {
    }

    /* JADX INFO: renamed from: c */
    public static <T> C8493c0<T> m34302c() {
        return new C8493c0<>(f31213c, f31214d);
    }

    /* JADX INFO: renamed from: d */
    public void m34303d(InterfaceC13188b<T> interfaceC13188b) {
        InterfaceC13187a<T> interfaceC13187a;
        if (this.f31216b != f31214d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC13187a = this.f31215a;
            this.f31215a = null;
            this.f31216b = interfaceC13188b;
        }
        interfaceC13187a.mo34271a(interfaceC13188b);
    }

    @Override // p575yf.InterfaceC13188b
    public T get() {
        return this.f31216b.get();
    }
}
