package p146g6;

import android.content.Context;
import android.os.PowerManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p536x5.AbstractC12732w;

/* JADX INFO: renamed from: g6.a0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\n"}, m31665d2 = {"Landroid/content/Context;", "context", "", "tag", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/os/PowerManager$WakeLock;", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6014a0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f23273a;

    static {
        String strM47443i = AbstractC12732w.m47443i("WakeLocks");
        Intrinsics.checkNotNullExpressionValue(strM47443i, "tagWithPrefix(...)");
        f23273a = strM47443i;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final PowerManager.WakeLock m26796a(@NotNull Context context, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.m31981d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, str);
        C6016b0 c6016b0 = C6016b0.f23276a;
        synchronized (c6016b0) {
            c6016b0.m26797a().put(wakeLockNewWakeLock, str);
        }
        Intrinsics.checkNotNull(wakeLockNewWakeLock);
        return wakeLockNewWakeLock;
    }
}
