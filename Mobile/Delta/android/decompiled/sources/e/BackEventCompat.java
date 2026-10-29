package e;

import android.os.Build;
import android.window.BackEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o4.NavigationEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: e.b, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 #2\u00020\u0001:\u0001\u0015B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Le/b;", "", "", "touchX", "touchY", "progress", "", "swipeEdge", "", "frameTimeMillis", "<init>", "(FFFIJ)V", "Landroid/window/BackEvent;", "backEvent", "(Landroid/window/BackEvent;)V", "Lo4/b;", "navigationEvent", "(Lo4/b;)V", "", "toString", "()Ljava/lang/String;", "a", "F", "getTouchX", "()F", "b", "getTouchY", "c", "d", "I", "()I", "e", "J", "getFrameTimeMillis", "()J", "f", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BackEventCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final float touchX;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final float touchY;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final float progress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final int swipeEdge;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final long frameTimeMillis;

    public BackEventCompat(float f10, float f11, float f12, int i10, long j10) {
        this.touchX = f10;
        this.touchY = f11;
        this.progress = f12;
        this.swipeEdge = i10;
        this.frameTimeMillis = j10;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSwipeEdge() {
        return this.swipeEdge;
    }

    @NotNull
    public String toString() {
        return "BackEventCompat(touchX=" + this.touchX + ", touchY=" + this.touchY + ", progress=" + this.progress + ", swipeEdge=" + this.swipeEdge + ", frameTimeMillis=" + this.frameTimeMillis + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackEventCompat(@NotNull BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BackEventCompat(@NotNull NavigationEvent navigationEvent) {
        this(navigationEvent.getTouchX(), navigationEvent.getTouchY(), navigationEvent.getProgress(), navigationEvent.getSwipeEdge(), navigationEvent.getFrameTimeMillis());
        Intrinsics.checkNotNullParameter(navigationEvent, "navigationEvent");
    }
}
