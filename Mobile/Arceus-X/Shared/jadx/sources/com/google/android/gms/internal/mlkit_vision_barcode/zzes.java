package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
final class zzes {
    private final zzbc zza = new zzbc();
    private final String zzb;
    private volatile Logger zzc;

    public zzes(Class cls) {
        this.zzb = cls.getName();
    }

    public final Logger zza() {
        Logger logger = this.zzc;
        if (logger != null) {
            return logger;
        }
        synchronized (this.zza) {
            try {
                Logger logger2 = this.zzc;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.zzb);
                this.zzc = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
