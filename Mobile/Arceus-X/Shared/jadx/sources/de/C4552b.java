package de;

import ae.C0194v0;
import ae.C0198x0;
import android.content.Context;
import be.InterfaceC1366u0;
import java.io.File;
import p601zd.C13772a;
import sd.C11289a;

/* JADX INFO: renamed from: de.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C4552b {

    /* JADX INFO: renamed from: a */
    public static C4551a f18665a;

    /* JADX INFO: renamed from: a */
    public static C4551a m22616a(Context context) {
        try {
            File fileZzb = C0198x0.m547a(context).zzb();
            if (fileZzb == null) {
                throw new C11289a("Failed to retrieve local testing directory path");
            }
            if (fileZzb.exists()) {
                return m22617b(context, fileZzb);
            }
            throw new C11289a(String.format("Local testing directory not found: %s", fileZzb));
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C4551a m22617b(Context context, File file) {
        try {
            C4551a c4551a = f18665a;
            if (c4551a == null) {
                f18665a = m22618c(context, file);
            } else if (!c4551a.m22603g().getAbsolutePath().equals(file.getAbsolutePath())) {
                throw new RuntimeException(String.format("Different module directories used to initialize FakeSplitInstallManager: '%s' and '%s'", f18665a.m22603g().getAbsolutePath(), file.getAbsolutePath()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f18665a;
    }

    /* JADX INFO: renamed from: c */
    public static C4551a m22618c(Context context, final File file) {
        C13772a.m50188a(context);
        return new C4551a(context, file, new C0194v0(context, context.getPackageName()), new InterfaceC1366u0() { // from class: de.s
            @Override // be.InterfaceC1366u0
            public final Object zza() {
                return C4554d.m22623a(file);
            }
        });
    }
}
