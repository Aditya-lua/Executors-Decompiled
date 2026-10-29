package p292mf;

import p575yf.InterfaceC13188b;

/* JADX INFO: renamed from: mf.x */
/* JADX INFO: loaded from: classes2.dex */
public class C8517x<T> implements InterfaceC13188b<T> {

    /* JADX INFO: renamed from: c */
    public static final Object f31268c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile Object f31269a = f31268c;

    /* JADX INFO: renamed from: b */
    public volatile InterfaceC13188b<T> f31270b;

    public C8517x(InterfaceC13188b<T> interfaceC13188b) {
        this.f31270b = interfaceC13188b;
    }

    @Override // p575yf.InterfaceC13188b
    public T get() {
        T t8;
        T t10 = (T) this.f31269a;
        Object obj = f31268c;
        if (t10 != obj) {
            return t10;
        }
        synchronized (this) {
            try {
                t8 = (T) this.f31269a;
                if (t8 == obj) {
                    t8 = this.f31270b.get();
                    this.f31269a = t8;
                    this.f31270b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t8;
    }
}
