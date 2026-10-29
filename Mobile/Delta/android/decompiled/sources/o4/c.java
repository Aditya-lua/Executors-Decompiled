package o4;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\rB\u001d\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0007J%\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001d\u0010\u0016J\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001e\u0010\u0016J\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010!R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010(\u001a\u00020$8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010'R*\u0010-\u001a\u00020$2\u0006\u0010)\u001a\u00020$8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010%\u001a\u0004\b*\u0010'\"\u0004\b+\u0010,R\u001a\u00102\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010/\u001a\u0004\b0\u00101R \u00107\u001a\b\u0012\u0004\u0012\u00020\u0000038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u00104\u001a\u0004\b5\u00106R\u001e\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0011038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00104¨\u0006:"}, d2 = {"Lo4/c;", "", "parent", "Lo4/l;", "onBackCompletedFallback", "<init>", "(Lo4/c;Lo4/l;)V", "(Lo4/l;)V", "Lo4/e;", "handler", "", "priority", "", "a", "(Lo4/e;I)V", "m", "(Lo4/e;)V", "Lo4/h;", "input", "c", "(Lo4/h;)V", "d", "(Lo4/h;I)V", "direction", "Lo4/b;", "event", "i", "(Lo4/h;ILo4/b;)V", "h", "g", "f", "e", "()V", "Lo4/c;", "b", "Lo4/l;", "", "Z", "k", "()Z", "isDisposed", "value", "l", "setEnabled", "(Z)V", "isEnabled", "Lo4/i;", "Lo4/i;", "j", "()Lo4/i;", "sharedProcessor", "", "Ljava/util/Set;", "getChildDispatchers$navigationevent", "()Ljava/util/Set;", "childDispatchers", "handlers", "inputs", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public c parent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final l onBackCompletedFallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isDisposed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final i sharedProcessor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<c> childDispatchers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<e<?>> handlers;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<h> inputs;

    public c(c cVar, l lVar) {
        i iVar;
        this.parent = cVar;
        this.onBackCompletedFallback = lVar;
        this.isEnabled = true;
        this.sharedProcessor = (cVar == null || (iVar = cVar.sharedProcessor) == null) ? new i() : iVar;
        this.childDispatchers = new LinkedHashSet();
        this.handlers = new LinkedHashSet();
        this.inputs = new LinkedHashSet();
        c cVar2 = this.parent;
        if (cVar2 != null) {
            cVar2.childDispatchers.add(this);
        }
    }

    public static /* synthetic */ void b(c cVar, e eVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        cVar.a(eVar, i10);
    }

    public final void a(@NotNull e<?> handler, int priority) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        e();
        if (this.handlers.add(handler)) {
            this.sharedProcessor.a(this, handler, priority);
        }
    }

    public final void c(@NotNull h input) {
        Intrinsics.checkNotNullParameter(input, "input");
        e();
        if (this.inputs.add(input)) {
            this.sharedProcessor.b(this, input, -1);
        }
    }

    public final void d(@NotNull h input, int priority) {
        Intrinsics.checkNotNullParameter(input, "input");
        e();
        if (priority == 1 || priority == 0) {
            if (this.inputs.add(input)) {
                this.sharedProcessor.b(this, input, priority);
            }
        } else {
            throw new IllegalArgumentException(("Unsupported priority value: " + priority).toString());
        }
    }

    public final void e() {
        if (k()) {
            throw new IllegalStateException("This NavigationEventDispatcher has already been disposed and cannot be used.");
        }
    }

    public final void f(@NotNull h input, int direction) {
        Intrinsics.checkNotNullParameter(input, "input");
        e();
        if (l()) {
            this.sharedProcessor.c(input, direction);
        }
    }

    public final void g(@NotNull h input, int direction) {
        Intrinsics.checkNotNullParameter(input, "input");
        e();
        if (l()) {
            this.sharedProcessor.d(input, direction, this.onBackCompletedFallback);
        }
    }

    public final void h(@NotNull h input, int direction, @NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(event, "event");
        e();
        if (l()) {
            this.sharedProcessor.e(input, direction, event);
        }
    }

    public final void i(@NotNull h input, int direction, @Nullable NavigationEvent event) {
        Intrinsics.checkNotNullParameter(input, "input");
        e();
        if (l()) {
            this.sharedProcessor.f(input, direction, event);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final i getSharedProcessor() {
        return this.sharedProcessor;
    }

    public final boolean k() {
        c cVar = this.parent;
        if (cVar == null || !cVar.k()) {
            return this.isDisposed;
        }
        return true;
    }

    public final boolean l() {
        c cVar = this.parent;
        if (cVar == null || cVar.l()) {
            return this.isEnabled;
        }
        return false;
    }

    public final void m(@NotNull e<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.handlers.remove(handler)) {
            this.sharedProcessor.h(handler);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull l onBackCompletedFallback) {
        this(null, onBackCompletedFallback);
        Intrinsics.checkNotNullParameter(onBackCompletedFallback, "onBackCompletedFallback");
    }
}
