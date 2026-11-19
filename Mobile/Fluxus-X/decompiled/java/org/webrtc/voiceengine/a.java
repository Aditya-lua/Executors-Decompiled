package org.webrtc.voiceengine;

import j.b;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f28526a;

    /* JADX INFO: renamed from: org.webrtc.voiceengine.a$a, reason: collision with other inner class name */
    public interface InterfaceC0549a {
        void a(String str, Set<String> set);
    }

    public static a b() {
        return f28526a;
    }

    public static boolean c() {
        return f28526a != null;
    }

    public void a() {
        a aVar = f28526a;
        if (this == aVar) {
            aVar.d();
            f28526a = null;
        }
    }

    public abstract void d();

    public abstract void e(b bVar);

    public void f(boolean z10) {
    }

    public void g(a aVar) {
        f28526a = aVar;
    }

    public abstract void h(InterfaceC0549a interfaceC0549a);

    public abstract void i();
}
