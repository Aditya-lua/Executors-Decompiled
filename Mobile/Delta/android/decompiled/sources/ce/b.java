package ce;

import ae.u0;
import android.content.Context;
import java.io.File;
import zd.v0;
import zd.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f4766a;

    public static a a(Context context) {
        try {
            File fileZzb = x0.a(context).zzb();
            if (fileZzb == null) {
                throw new rd.a("Failed to retrieve local testing directory path");
            }
            if (fileZzb.exists()) {
                return b(context, fileZzb);
            }
            throw new rd.a(String.format("Local testing directory not found: %s", fileZzb));
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static synchronized a b(Context context, File file) {
        try {
            a aVar = f4766a;
            if (aVar == null) {
                f4766a = c(context, file);
            } else if (!aVar.g().getAbsolutePath().equals(file.getAbsolutePath())) {
                throw new RuntimeException(String.format("Different module directories used to initialize FakeSplitInstallManager: '%s' and '%s'", f4766a.g().getAbsolutePath(), file.getAbsolutePath()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f4766a;
    }

    public static a c(Context context, final File file) {
        yd.a.a(context);
        return new a(context, file, new v0(context, context.getPackageName()), new u0() { // from class: ce.s
            @Override // ae.u0
            public final Object zza() {
                return d.a(file);
            }
        });
    }
}
