package com.roblox.audio;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f8859a;

    /* JADX INFO: renamed from: com.roblox.audio.a$a, reason: collision with other inner class name */
    public enum EnumC0130a {
        SPEAKER_PHONE,
        WIRED_HEADSET,
        EARPIECE,
        BLUETOOTH,
        NONE
    }

    public interface b {
        void a(EnumC0130a enumC0130a, Set<EnumC0130a> set);
    }

    public static a b() {
        return f8859a;
    }

    public static boolean d() {
        return f8859a != null;
    }

    public void a() {
        a aVar = f8859a;
        if (this == aVar) {
            aVar.e();
            f8859a = null;
        }
    }

    public abstract EnumC0130a c();

    public abstract void e();

    public abstract void f(j.b bVar);

    public void g(boolean z10) {
    }

    public void h(a aVar) {
        f8859a = aVar;
    }

    public abstract void i(b bVar);

    public abstract void j();
}
