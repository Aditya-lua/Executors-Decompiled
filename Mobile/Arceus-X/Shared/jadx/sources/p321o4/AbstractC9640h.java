package p321o4;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: o4.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0015¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0005¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0006H\u0005¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0005¢\u0006\u0004\b\u001a\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\bR\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001f¨\u0006!"}, m31665d2 = {"Lo4/h;", "", "<init>", "()V", "Lo4/c;", "dispatcher", "", "e", "(Lo4/c;)V", "i", "", "hasEnabledHandlers", "f", "(Z)V", "j", "Lo4/f;", "history", "g", "(Lo4/f;)V", "k", "Lo4/b;", NotificationCompat.CATEGORY_EVENT, "d", "(Lo4/b;)V", "c", "a", "b", "Lo4/c;", "h", "()Lo4/c;", "l", "Z", "isPredictiveBackInProgress", "navigationevent"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public abstract class AbstractC9640h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public C9635c dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isPredictiveBackInProgress;

    /* JADX INFO: renamed from: a */
    public final void m38055a() {
        C9635c c9635c = this.dispatcher;
        if (c9635c == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.isPredictiveBackInProgress) {
            c9635c.m38029i(this, -1, null);
        }
        c9635c.m38026f(this, -1);
        this.isPredictiveBackInProgress = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m38056b() {
        C9635c c9635c = this.dispatcher;
        if (c9635c == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.isPredictiveBackInProgress) {
            c9635c.m38029i(this, -1, null);
        }
        c9635c.m38027g(this, -1);
        this.isPredictiveBackInProgress = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m38057c(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C9635c c9635c = this.dispatcher;
        if (c9635c == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (this.isPredictiveBackInProgress) {
            c9635c.m38028h(this, -1, event);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m38058d(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C9635c c9635c = this.dispatcher;
        if (c9635c == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (this.isPredictiveBackInProgress) {
            return;
        }
        c9635c.m38029i(this, -1, event);
        this.isPredictiveBackInProgress = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m38059e(@NotNull C9635c dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        m38063i(dispatcher);
    }

    /* JADX INFO: renamed from: f */
    public final void m38060f(boolean hasEnabledHandlers) {
        mo23083j(hasEnabledHandlers);
    }

    /* JADX INFO: renamed from: g */
    public final void m38061g(@NotNull NavigationEventHistory history) {
        Intrinsics.checkNotNullParameter(history, "history");
        m38064k(history);
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final C9635c getDispatcher() {
        return this.dispatcher;
    }

    /* JADX INFO: renamed from: i */
    public void m38063i(@NotNull C9635c dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
    }

    /* JADX INFO: renamed from: j */
    public void mo23083j(boolean hasEnabledHandlers) {
    }

    /* JADX INFO: renamed from: k */
    public void m38064k(@NotNull NavigationEventHistory history) {
        Intrinsics.checkNotNullParameter(history, "history");
    }

    /* JADX INFO: renamed from: l */
    public final void m38065l(@Nullable C9635c c9635c) {
        this.dispatcher = c9635c;
    }
}
