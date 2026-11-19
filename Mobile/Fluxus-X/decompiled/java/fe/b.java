package fe;

import android.content.Context;
import ce.v0;
import ce.x0;
import de.u0;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f15941a;

    public static a a(Context context) {
        try {
            File fileZzb = x0.a(context).zzb();
            if (fileZzb == null) {
                throw new ud.a("Failed to retrieve local testing directory path");
            }
            if (fileZzb.exists()) {
                return b(context, fileZzb);
            }
            throw new ud.a(String.format("Local testing directory not found: %s", fileZzb));
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static synchronized a b(Context context, File file) {
        try {
            a aVar = f15941a;
            if (aVar == null) {
                f15941a = c(context, file);
            } else if (!aVar.g().getAbsolutePath().equals(file.getAbsolutePath())) {
                throw new RuntimeException(String.format("Different module directories used to initialize FakeSplitInstallManager: '%s' and '%s'", f15941a.g().getAbsolutePath(), file.getAbsolutePath()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f15941a;
    }

    public static a c(Context context, final File file) {
        be.a.a(context);
        return new a(context, file, new v0(context, context.getPackageName()), new u0() { // from class: fe.s
            @Override // de.u0
            public final Object zza() {
                return d.a(file);
            }
        });
    }
}
