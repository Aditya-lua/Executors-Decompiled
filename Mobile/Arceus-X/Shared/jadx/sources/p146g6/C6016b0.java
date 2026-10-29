package p146g6;

import android.os.PowerManager;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: g6.b0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\f\u001a\u0012\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m31665d2 = {"Lg6/b0;", "", "<init>", "()V", "Ljava/util/WeakHashMap;", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "", "b", "Ljava/util/WeakHashMap;", "a", "()Ljava/util/WeakHashMap;", "wakeLocks", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6016b0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C6016b0 f23276a = new C6016b0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final WeakHashMap<PowerManager.WakeLock, String> wakeLocks = new WeakHashMap<>();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final WeakHashMap<PowerManager.WakeLock, String> m26797a() {
        return wakeLocks;
    }
}
