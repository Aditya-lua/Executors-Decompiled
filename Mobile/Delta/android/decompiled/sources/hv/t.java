package hv;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f19934a;
    public static final u b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f19935c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f19934a = null;
            b = new u();
            f19935c = new c();
        } else if (property.equals("Dalvik")) {
            f19934a = new a();
            b = new u.a();
            f19935c = new c.a();
        } else {
            f19934a = null;
            b = new u.b();
            f19935c = new c.a();
        }
    }
}
