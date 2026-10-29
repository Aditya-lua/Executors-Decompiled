package p567y5;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7688j0;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import org.jetbrains.annotations.NotNull;
import p229jt.C7352s;
import p536x5.AbstractC12732w;

/* JADX INFO: renamed from: y5.i0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, m31665d2 = {"Ly5/i0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "c", "(Landroid/content/Context;)V", "", "Ljava/io/File;", "d", "(Landroid/content/Context;)Ljava/util/Map;", "b", "(Landroid/content/Context;)Ljava/io/File;", "a", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13056i0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C13056i0 f46216a = new C13056i0();

    /* JADX INFO: renamed from: c */
    public static final void m48597c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C13056i0 c13056i0 = f46216a;
        if (c13056i0.m48599b(context).exists()) {
            AbstractC12732w.m47441e().mo47444a(C13059j0.f46221a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : c13056i0.m48600d(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        AbstractC12732w.m47441e().mo47451k(C13059j0.f46221a, "Over-writing contents of " + value);
                    }
                    AbstractC12732w.m47441e().mo47444a(C13059j0.f46221a, key.renameTo(value) ? "Migrated " + key + "to " + value : "Renaming " + key + " to " + value + " failed");
                }
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final File m48598a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "getNoBackupFilesDir(...)");
        return noBackupFilesDir;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final File m48599b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "getDatabasePath(...)");
        return databasePath;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Map<File, File> m48600d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File fileM48599b = m48599b(context);
        File fileM48598a = m48598a(context);
        String[] strArr = C13059j0.f46222b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7764d.m32078c(C7688j0.m31790f(strArr.length), 16));
        for (String str : strArr) {
            Pair pairM30477a = C7352s.m30477a(new File(fileM48599b.getPath() + str), new File(fileM48598a.getPath() + str));
            linkedHashMap.put(pairM30477a.m31673c(), pairM30477a.m31674d());
        }
        return C7690k0.m31802q(linkedHashMap, C7352s.m30477a(fileM48599b, fileM48598a));
    }
}
