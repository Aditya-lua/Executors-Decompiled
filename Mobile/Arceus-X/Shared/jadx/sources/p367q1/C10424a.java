package p367q1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.core.app.NotificationCompat;
import cu.C4366b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: q1.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 H2\u00020\u0001:\u0003\u0019\u0017\u0015B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\"\u0010\u001f\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010!R\u0016\u0010'\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010+\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010&R\u0016\u0010-\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010&R\u0016\u0010/\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010&R\u0016\u00101\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010&R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010\u001eR\u0016\u00109\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010&R\u0016\u0010;\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00104R\u0016\u0010=\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010&R\u0016\u0010?\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010&R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010\u0018R\u0016\u0010E\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010\u001e¨\u0006I"}, m31665d2 = {"Lq1/a;", "", "Landroid/content/Context;", "context", "", "spanSlop", "minSpan", "Lq1/a$b;", "listener", "<init>", "(Landroid/content/Context;IILq1/a$b;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "f", "(Landroid/view/MotionEvent;)Z", "e", "()Z", "", "d", "()F", "a", "Landroid/content/Context;", "b", "I", "c", "Lq1/a$b;", "focusX", "focusY", "g", "Z", "isQuickZoomEnabled", "setQuickZoomEnabled", "(Z)V", "h", "isStylusZoomEnabled", "setStylusZoomEnabled", "i", "F", "currentSpan", "j", "previousSpan", "k", "currentSpanX", "l", "currentSpanY", "m", "previousSpanX", "n", "previousSpanY", "", "o", "J", "eventTime", "p", "isInProgress", "q", "initialSpan", "r", "prevTime", "s", "anchoredZoomStartX", "t", "anchoredZoomStartY", "u", "anchoredZoomMode", "Landroid/view/GestureDetector;", "v", "Landroid/view/GestureDetector;", "gestureDetector", "w", "eventBeforeOrAboveStartingGestureEvent", "x", "camera-view_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C10424a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int spanSlop;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int minSpan;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final b listener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int focusX;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int focusY;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isQuickZoomEnabled;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isStylusZoomEnabled;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public float currentSpan;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public float previousSpan;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public float currentSpanX;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public float currentSpanY;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float previousSpanX;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public float previousSpanY;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public long eventTime;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean isInProgress;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public float initialSpan;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public long prevTime;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public float anchoredZoomStartX;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public float anchoredZoomStartY;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public int anchoredZoomMode;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @NotNull
    public GestureDetector gestureDetector;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public boolean eventBeforeOrAboveStartingGestureEvent;

    /* JADX INFO: renamed from: q1.a$b */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m31665d2 = {"Lq1/a$b;", "", "Lq1/a$c;", "zoomEvent", "", "a", "(Lq1/a$c;)Z", "camera-view_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo39084a(@NotNull c zoomEvent);
    }

    /* JADX INFO: renamed from: q1.a$c */
    @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001:\u0003\t\u0011\rB'\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, m31665d2 = {"Lq1/a$c;", "", "", "eventTime", "", "focusX", "focusY", "<init>", "(JII)V", "a", "J", "getEventTime", "()J", "b", "I", "getFocusX", "()I", "c", "getFocusY", "camera-view_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final long eventTime;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final int focusX;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public final int focusY;

        /* JADX INFO: renamed from: q1.a$c$a */
        @Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lq1/a$c$a;", "Lq1/a$c;", "", "eventTime", "", "focusX", "focusY", "<init>", "(JII)V", "camera-view_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
        public static final class a extends c {
            public a(long j10, int i10, int i11) {
                super(j10, i10, i11, null);
            }
        }

        /* JADX INFO: renamed from: q1.a$c$b */
        @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lq1/a$c$b;", "Lq1/a$c;", "", "eventTime", "", "focusX", "focusY", "", "incrementalScaleFactor", "<init>", "(JIIF)V", "d", "F", "getIncrementalScaleFactor", "()F", "camera-view_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
        public static final class b extends c {

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public final float incrementalScaleFactor;

            public b(long j10, int i10, int i11, float f10) {
                super(j10, i10, i11, null);
                this.incrementalScaleFactor = f10;
            }
        }

        /* JADX INFO: renamed from: q1.a$c$c, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lq1/a$c$c;", "Lq1/a$c;", "", "eventTime", "", "focusX", "focusY", "", "incrementalScaleFactor", "<init>", "(JIIF)V", "d", "F", "a", "()F", "camera-view_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
        public static final class C14233c extends c {

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public final float incrementalScaleFactor;

            public C14233c(long j10, int i10, int i11, float f10) {
                super(j10, i10, i11, null);
                this.incrementalScaleFactor = f10;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 long), (r3v0 int), (r4v0 int) A[MD:(long, int, int):void (m)] (LINE:1) call: q1.a.c.<init>(long, int, int):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ c(long j10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10, i10, i11);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(long j10, int i10, int i11) {
            this.eventTime = j10;
            this.focusX = i10;
            this.focusY = i11;
        }
    }

    /* JADX INFO: renamed from: q1.a$d */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"q1/a$d", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "e", "", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", "camera-view_release"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class d extends GestureDetector.SimpleOnGestureListener {
        public d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            C10424a.this.anchoredZoomStartX = e10.getX();
            C10424a.this.anchoredZoomStartY = e10.getY();
            C10424a.this.anchoredZoomMode = 1;
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"ExecutorRegistration"})
    public C10424a(@NotNull Context context, @NotNull b listener) {
        this(context, 0, 0, listener, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    /* JADX INFO: renamed from: d */
    public final float m40100d() {
        if (!m40101e()) {
            float f10 = this.previousSpan;
            if (f10 > 0.0f) {
                return this.currentSpan / f10;
            }
            return 1.0f;
        }
        boolean z10 = this.eventBeforeOrAboveStartingGestureEvent;
        boolean z11 = (z10 && this.currentSpan < this.previousSpan) || (!z10 && this.currentSpan > this.previousSpan);
        float fAbs = Math.abs(1 - (this.currentSpan / this.previousSpan)) * 0.5f;
        if (this.previousSpan <= this.spanSlop) {
            return 1.0f;
        }
        return z11 ? fAbs + 1.0f : 1.0f - fAbs;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m40101e() {
        return this.anchoredZoomMode != 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m40102f(@NotNull MotionEvent event) {
        boolean z10;
        float f10;
        float f11;
        Intrinsics.checkNotNullParameter(event, "event");
        this.eventTime = event.getEventTime();
        int actionMasked = event.getActionMasked();
        if (this.isQuickZoomEnabled) {
            this.gestureDetector.onTouchEvent(event);
        }
        int pointerCount = event.getPointerCount();
        boolean z11 = (event.getButtonState() & 32) != 0;
        boolean z12 = this.anchoredZoomMode == 2 && !z11;
        boolean z13 = actionMasked == 1 || actionMasked == 3 || z12;
        float fAbs = 0.0f;
        if (actionMasked == 0 || z13) {
            if (this.isInProgress) {
                z10 = true;
                this.listener.mo39084a(new c.b(this.eventTime, this.focusX, this.focusY, m40100d()));
                this.isInProgress = false;
                this.initialSpan = 0.0f;
                this.anchoredZoomMode = 0;
            } else {
                z10 = true;
                if (m40101e() && z13) {
                    this.isInProgress = false;
                    this.initialSpan = 0.0f;
                    this.anchoredZoomMode = 0;
                }
            }
            if (z13) {
                return z10;
            }
        } else {
            z10 = true;
        }
        if (!this.isInProgress && this.isStylusZoomEnabled && !m40101e() && !z13 && z11) {
            this.anchoredZoomStartX = event.getX();
            this.anchoredZoomStartY = event.getY();
            this.anchoredZoomMode = 2;
            this.initialSpan = 0.0f;
        }
        boolean z14 = (actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z12) ? z10 : false;
        boolean z15 = actionMasked == 6 ? z10 : false;
        int actionIndex = z15 ? event.getActionIndex() : -1;
        int i10 = z15 ? pointerCount - 1 : pointerCount;
        if (m40101e()) {
            f11 = this.anchoredZoomStartX;
            f10 = this.anchoredZoomStartY;
            this.eventBeforeOrAboveStartingGestureEvent = event.getY() < f10 ? z10 : false;
        } else {
            float x10 = 0.0f;
            float y10 = 0.0f;
            for (int i11 = 0; i11 < pointerCount; i11++) {
                if (actionIndex != i11) {
                    x10 += event.getX(i11);
                    y10 += event.getY(i11);
                }
            }
            float f12 = i10;
            float f13 = x10 / f12;
            f10 = y10 / f12;
            f11 = f13;
        }
        float fAbs2 = 0.0f;
        for (int i12 = 0; i12 < pointerCount; i12++) {
            if (actionIndex != i12) {
                fAbs += Math.abs(event.getX(i12) - f11);
                fAbs2 += Math.abs(event.getY(i12) - f10);
            }
        }
        float f14 = i10;
        float f15 = fAbs / f14;
        float f16 = fAbs2 / f14;
        float f17 = 2;
        float f18 = f15 * f17;
        float f19 = f16 * f17;
        float fHypot = m40101e() ? f19 : (float) Math.hypot(f18, f19);
        boolean z16 = this.isInProgress;
        this.focusX = C4366b.m22016d(f11);
        this.focusY = C4366b.m22016d(f10);
        if (!m40101e() && this.isInProgress && (fHypot < this.minSpan || z14)) {
            this.listener.mo39084a(new c.b(this.eventTime, this.focusX, this.focusY, m40100d()));
            this.isInProgress = false;
            this.initialSpan = fHypot;
        }
        if (z14) {
            this.currentSpanX = f18;
            this.previousSpanX = f18;
            this.currentSpanY = f19;
            this.previousSpanY = f19;
            this.currentSpan = fHypot;
            this.previousSpan = fHypot;
            this.initialSpan = fHypot;
        }
        int i13 = m40101e() ? this.spanSlop : this.minSpan;
        if (!this.isInProgress && fHypot >= i13 && (z16 || Math.abs(fHypot - this.initialSpan) > this.spanSlop)) {
            this.currentSpanX = f18;
            this.previousSpanX = f18;
            this.currentSpanY = f19;
            this.previousSpanY = f19;
            this.currentSpan = fHypot;
            this.previousSpan = fHypot;
            long j10 = this.eventTime;
            this.prevTime = j10;
            this.isInProgress = this.listener.mo39084a(new c.a(j10, this.focusX, this.focusY));
        }
        if (actionMasked == 2) {
            this.currentSpanX = f18;
            this.currentSpanY = f19;
            this.currentSpan = fHypot;
            if (this.isInProgress ? this.listener.mo39084a(new c.C14233c(this.eventTime, this.focusX, this.focusY, m40100d())) : z10) {
                this.previousSpanX = this.currentSpanX;
                this.previousSpanY = this.currentSpanY;
                this.previousSpan = this.currentSpan;
                this.prevTime = this.eventTime;
            }
        }
        return z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @SuppressLint({"ExecutorRegistration"})
    public C10424a(@NotNull Context context, int i10, int i11, @NotNull b listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.spanSlop = i10;
        this.minSpan = i11;
        this.listener = listener;
        this.isQuickZoomEnabled = true;
        this.isStylusZoomEnabled = true;
        this.gestureDetector = new GestureDetector(context, new d());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
      (r1v0 android.content.Context)
      (wrap int:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap int:0x000c: ARITH (wrap int:0x0008: INVOKE 
      (wrap android.view.ViewConfiguration:0x0004: INVOKE (r1v0 android.content.Context) STATIC call: android.view.ViewConfiguration.get(android.content.Context):android.view.ViewConfiguration A[MD:(android.content.Context):android.view.ViewConfiguration (c), WRAPPED] (LINE:12))
     VIRTUAL call: android.view.ViewConfiguration.getScaledTouchSlop():int A[MD:():int (c), WRAPPED] (LINE:12)) * (2 int) A[WRAPPED] (LINE:12)) : (r2v0 int))
      (wrap int:?: TERNARY null = ((wrap int:0x000e: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
      (r4v0 q1.a$b)
     A[MD:(android.content.Context, int, int, q1.a$b):void (m)] (LINE:13) call: q1.a.<init>(android.content.Context, int, int, q1.a$b):void type: THIS */
    public /* synthetic */ C10424a(Context context, int i10, int i11, b bVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i10, (i12 & 4) != 0 ? 0 : i11, bVar);
    }
}
