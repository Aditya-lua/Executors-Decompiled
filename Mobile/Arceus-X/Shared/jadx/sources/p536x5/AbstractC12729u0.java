package p536x5;

import android.content.Context;
import androidx.work.AbstractC1117c;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: x5.u0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\f¨\u0006\u000e"}, m31665d2 = {"Lx5/u0;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "Landroidx/work/c;", "a", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/c;", "b", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC12729u0 {
    /* JADX INFO: renamed from: c */
    public static final AbstractC1117c m47437c(Context context, String str, WorkerParameters workerParameters) {
        try {
            AbstractC1117c abstractC1117cNewInstance = m47438d(str).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            Intrinsics.checkNotNull(abstractC1117cNewInstance);
            return abstractC1117cNewInstance;
        } catch (Throwable th2) {
            AbstractC12732w.m47441e().mo47447d(C12731v0.f45335a, "Could not instantiate " + str, th2);
            throw th2;
        }
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: java.lang.Class<? extends U>, java.lang.Object, java.lang.Class<? extends androidx.work.c> */
    /* JADX INFO: renamed from: d */
    public static final Class<? extends AbstractC1117c> m47438d(String str) {
        try {
            Class clsAsSubclass = Class.forName(str).asSubclass(AbstractC1117c.class);
            Intrinsics.checkNotNull(clsAsSubclass);
            return clsAsSubclass;
        } catch (Throwable th2) {
            AbstractC12732w.m47441e().mo47447d(C12731v0.f45335a, "Invalid class: " + str, th2);
            throw th2;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract AbstractC1117c mo47372a(@NotNull Context appContext, @NotNull String workerClassName, @NotNull WorkerParameters workerParameters);

    @NotNull
    /* JADX INFO: renamed from: b */
    public final AbstractC1117c m47439b(@NotNull Context appContext, @NotNull String workerClassName, @NotNull WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        AbstractC1117c abstractC1117cMo47372a = mo47372a(appContext, workerClassName, workerParameters);
        if (abstractC1117cMo47372a == null) {
            abstractC1117cMo47372a = m47437c(appContext, workerClassName, workerParameters);
        }
        if (!abstractC1117cMo47372a.isUsed()) {
            return abstractC1117cMo47372a;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + workerClassName + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
