package uk;

import p138fv.C5840c;

/* JADX INFO: renamed from: uk.b */
/* JADX INFO: loaded from: classes2.dex */
public class C11863b {

    /* JADX INFO: renamed from: a */
    public static C5840c f42049a;

    /* JADX INFO: renamed from: a */
    public static C5840c m44278a() {
        if (f42049a == null) {
            synchronized (C11863b.class) {
                try {
                    if (f42049a == null) {
                        f42049a = C5840c.m26203b().m26220a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f42049a;
    }
}
