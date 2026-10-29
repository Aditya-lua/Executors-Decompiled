package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2518h2 {

    /* JADX INFO: renamed from: a */
    public final C2472d0 f9028a = new C2472d0();

    /* JADX INFO: renamed from: b */
    public final String f9029b;

    /* JADX INFO: renamed from: c */
    public volatile Logger f9030c;

    public C2518h2(Class cls) {
        this.f9029b = cls.getName();
    }

    /* JADX INFO: renamed from: a */
    public final Logger m11443a() {
        Logger logger = this.f9030c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f9028a) {
            try {
                Logger logger2 = this.f9030c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f9029b);
                this.f9030c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
