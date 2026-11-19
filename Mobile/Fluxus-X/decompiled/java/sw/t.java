package sw;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f32032a;
    public static final u b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f32033c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f32032a = null;
            b = new u();
            f32033c = new c();
        } else if (property.equals("Dalvik")) {
            f32032a = new a();
            b = new u.a();
            f32033c = new c.a();
        } else {
            f32032a = null;
            b = new u.b();
            f32033c = new c.a();
        }
    }
}
