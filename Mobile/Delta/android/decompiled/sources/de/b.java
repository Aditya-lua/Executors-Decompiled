package de;

import ae.v0;
import ae.x0;
import android.content.Context;
import be.u0;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f14604a;

    public static a a(Context context) {
        try {
            File fileZzb = x0.a(context).zzb();
            if (fileZzb == null) {
                throw new sd.a("Failed to retrieve local testing directory path");
            }
            if (fileZzb.exists()) {
                return b(context, fileZzb);
            }
            throw new sd.a(String.format("Local testing directory not found: %s", fileZzb));
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static synchronized a b(Context context, File file) {
        try {
            a aVar = f14604a;
            if (aVar == null) {
                f14604a = c(context, file);
            } else if (!aVar.g().getAbsolutePath().equals(file.getAbsolutePath())) {
                throw new RuntimeException(String.format("Different module directories used to initialize FakeSplitInstallManager: '%s' and '%s'", f14604a.g().getAbsolutePath(), file.getAbsolutePath()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f14604a;
    }

    public static a c(Context context, final File file) {
        zd.a.a(context);
        return new a(context, file, new v0(context, context.getPackageName()), new u0() { // from class: de.s
            @Override // be.u0
            public final Object zza() {
                return d.a(file);
            }
        });
    }
}
