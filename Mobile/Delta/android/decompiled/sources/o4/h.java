package o4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0015¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0005¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0006H\u0005¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0005¢\u0006\u0004\b\u001a\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\bR\u0016\u0010 \u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001f¨\u0006!"}, d2 = {"Lo4/h;", "", "<init>", "()V", "Lo4/c;", "dispatcher", "", "e", "(Lo4/c;)V", "i", "", "hasEnabledHandlers", "f", "(Z)V", "j", "Lo4/f;", "history", "g", "(Lo4/f;)V", "k", "Lo4/b;", "event", "d", "(Lo4/b;)V", "c", "a", "b", "Lo4/c;", "h", "()Lo4/c;", "l", "Z", "isPredictiveBackInProgress", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public c dispatcher;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isPredictiveBackInProgress;

    public final void a() {
        c cVar = this.dispatcher;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.isPredictiveBackInProgress) {
            cVar.i(this, -1, null);
        }
        cVar.f(this, -1);
        this.isPredictiveBackInProgress = false;
    }

    public final void b() {
        c cVar = this.dispatcher;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.isPredictiveBackInProgress) {
            cVar.i(this, -1, null);
        }
        cVar.g(this, -1);
        this.isPredictiveBackInProgress = false;
    }

    public final void c(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        c cVar = this.dispatcher;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (this.isPredictiveBackInProgress) {
            cVar.h(this, -1, event);
        }
    }

    public final void d(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        c cVar = this.dispatcher;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (this.isPredictiveBackInProgress) {
            return;
        }
        cVar.i(this, -1, event);
        this.isPredictiveBackInProgress = true;
    }

    public final void e(@NotNull c dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        i(dispatcher);
    }

    public final void f(boolean hasEnabledHandlers) {
        j(hasEnabledHandlers);
    }

    public final void g(@NotNull NavigationEventHistory history) {
        Intrinsics.checkNotNullParameter(history, "history");
        k(history);
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final c getDispatcher() {
        return this.dispatcher;
    }

    public void i(@NotNull c dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
    }

    public void j(boolean hasEnabledHandlers) {
    }

    public void k(@NotNull NavigationEventHistory history) {
        Intrinsics.checkNotNullParameter(history, "history");
    }

    public final void l(@Nullable c cVar) {
        this.dispatcher = cVar;
    }
}
