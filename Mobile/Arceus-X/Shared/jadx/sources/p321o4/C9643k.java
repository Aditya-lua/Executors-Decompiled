package p321o4;

import android.annotation.SuppressLint;
import android.os.Build;
import android.window.BackEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o4.k */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"Landroid/window/BackEvent;", "backEvent", "Lo4/b;", "a", "(Landroid/window/BackEvent;)Lo4/b;", "navigationevent"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C9643k {
    @SuppressLint({"WrongConstant"})
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final NavigationEvent m38078a(@NotNull BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new NavigationEvent(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }
}
