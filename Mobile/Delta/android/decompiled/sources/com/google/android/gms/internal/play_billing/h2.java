package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f7091a = new d0();
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Logger f7092c;

    public h2(Class cls) {
        this.b = cls.getName();
    }

    public final Logger a() {
        Logger logger = this.f7092c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f7091a) {
            try {
                Logger logger2 = this.f7092c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.b);
                this.f7092c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
