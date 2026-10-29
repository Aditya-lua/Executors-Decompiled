package p231jv;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: jv.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C7392t {

    /* JADX INFO: renamed from: a */
    public static final Executor f28407a;

    /* JADX INFO: renamed from: b */
    public static final C7393u f28408b;

    /* JADX INFO: renamed from: c */
    public static final C7374c f28409c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f28407a = null;
            f28408b = new C7393u();
            f28409c = new C7374c();
        } else if (property.equals("Dalvik")) {
            f28407a = new ExecutorC7370a();
            f28408b = new C7393u.a();
            f28409c = new C7374c.a();
        } else {
            f28407a = null;
            f28408b = new C7393u.b();
            f28409c = new C7374c.a();
        }
    }
}
