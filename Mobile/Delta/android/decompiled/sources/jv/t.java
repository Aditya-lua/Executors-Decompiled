package jv;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f21924a;
    public static final u b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f21925c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f21924a = null;
            b = new u();
            f21925c = new c();
        } else if (property.equals("Dalvik")) {
            f21924a = new a();
            b = new u.a();
            f21925c = new c.a();
        } else {
            f21924a = null;
            b = new u.b();
            f21925c = new c.a();
        }
    }
}
