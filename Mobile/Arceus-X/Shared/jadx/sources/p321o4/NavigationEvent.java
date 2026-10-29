package p321o4;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: o4.b, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0015B;\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006 "}, m31665d2 = {"Lo4/b;", "", "", "swipeEdge", "", NotificationCompat.CATEGORY_PROGRESS, "touchX", "touchY", "", "frameTimeMillis", "<init>", "(IFFFJ)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "c", "b", "F", "()F", "d", "e", "J", "()J", "f", "navigationevent"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class NavigationEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int swipeEdge;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final float progress;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final float touchX;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final float touchY;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    public final long frameTimeMillis;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NavigationEvent() {
        this(0, 0.0f, 0.0f, 0.0f, 0L, 31, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getFrameTimeMillis() {
        return this.frameTimeMillis;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSwipeEdge() {
        return this.swipeEdge;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getTouchX() {
        return this.touchX;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getTouchY() {
        return this.touchY;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && NavigationEvent.class == other.getClass()) {
            NavigationEvent navigationEvent = (NavigationEvent) other;
            return this.touchX == navigationEvent.touchX && this.touchY == navigationEvent.touchY && this.progress == navigationEvent.progress && this.swipeEdge == navigationEvent.swipeEdge && this.frameTimeMillis == navigationEvent.frameTimeMillis;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.touchX) * 31) + Float.hashCode(this.touchY)) * 31) + Float.hashCode(this.progress)) * 31) + Integer.hashCode(this.swipeEdge)) * 31) + Long.hashCode(this.frameTimeMillis);
    }

    @NotNull
    public String toString() {
        return "NavigationEvent(touchX=" + this.touchX + ", touchY=" + this.touchY + ", progress=" + this.progress + ", swipeEdge=" + this.swipeEdge + ", frameTimeMillis=" + this.frameTimeMillis + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public NavigationEvent(int i10, float f10, float f11, float f12, long j10) {
        this.swipeEdge = i10;
        this.progress = f10;
        this.touchX = f11;
        this.touchY = f12;
        this.frameTimeMillis = j10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
      (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r8v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r2v0 int))
      (wrap float:?: TERNARY null = ((wrap int:0x0005: ARITH (r8v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r3v0 float))
      (wrap float:?: TERNARY null = ((wrap int:0x000b: ARITH (r8v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r4v0 float))
      (wrap float:?: TERNARY null = ((wrap int:0x0010: ARITH (r8v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r5v0 float))
      (wrap long:?: TERNARY null = ((wrap int:0x0015: ARITH (r8v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r6v0 long))
     A[MD:(int, float, float, float, long):void (m)] (LINE:8) call: o4.b.<init>(int, float, float, float, long):void type: THIS */
    public /* synthetic */ NavigationEvent(int i10, float f10, float f11, float f12, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 2 : i10, (i11 & 2) != 0 ? 0.0f : f10, (i11 & 4) != 0 ? 0.0f : f11, (i11 & 8) != 0 ? 0.0f : f12, (i11 & 16) != 0 ? 0L : j10);
    }
}
