package p321o4;

import androidx.core.app.NotificationCompat;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: o4.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\rB\u001d\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0007J%\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001d\u0010\u0016J\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001e\u0010\u0016J\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010!R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010(\u001a\u00020$8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010'R*\u0010-\u001a\u00020$2\u0006\u0010)\u001a\u00020$8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010%\u001a\u0004\b*\u0010'\"\u0004\b+\u0010,R\u001a\u00102\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010/\u001a\u0004\b0\u00101R \u00107\u001a\b\u0012\u0004\u0012\u00020\u0000038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u00104\u001a\u0004\b5\u00106R\u001e\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0011038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00104¨\u0006:"}, m31665d2 = {"Lo4/c;", "", "parent", "Lo4/l;", "onBackCompletedFallback", "<init>", "(Lo4/c;Lo4/l;)V", "(Lo4/l;)V", "Lo4/e;", "handler", "", "priority", "", "a", "(Lo4/e;I)V", "m", "(Lo4/e;)V", "Lo4/h;", "input", "c", "(Lo4/h;)V", "d", "(Lo4/h;I)V", "direction", "Lo4/b;", NotificationCompat.CATEGORY_EVENT, "i", "(Lo4/h;ILo4/b;)V", "h", "g", "f", "e", "()V", "Lo4/c;", "b", "Lo4/l;", "", "Z", "k", "()Z", "isDisposed", "value", "l", "setEnabled", "(Z)V", "isEnabled", "Lo4/i;", "Lo4/i;", "j", "()Lo4/i;", "sharedProcessor", "", "Ljava/util/Set;", "getChildDispatchers$navigationevent", "()Ljava/util/Set;", "childDispatchers", "handlers", "inputs", "navigationevent"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C9635c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public C9635c parent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC9644l onBackCompletedFallback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean isDisposed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isEnabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C9641i sharedProcessor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Set<C9635c> childDispatchers;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Set<AbstractC9637e<?>> handlers;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Set<AbstractC9640h> inputs;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C9635c(C9635c c9635c, InterfaceC9644l interfaceC9644l) {
        C9641i c9641i;
        this.parent = c9635c;
        this.onBackCompletedFallback = interfaceC9644l;
        this.isEnabled = true;
        this.sharedProcessor = (c9635c == null || (c9641i = c9635c.sharedProcessor) == null) ? new C9641i() : c9641i;
        this.childDispatchers = new LinkedHashSet();
        this.handlers = new LinkedHashSet();
        this.inputs = new LinkedHashSet();
        C9635c c9635c2 = this.parent;
        if (c9635c2 != null) {
            c9635c2.childDispatchers.add(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m38021b(C9635c c9635c, AbstractC9637e abstractC9637e, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        c9635c.m38022a(abstractC9637e, i10);
    }

    /* JADX INFO: renamed from: a */
    public final void m38022a(@NotNull AbstractC9637e<?> handler, int priority) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        m38025e();
        if (this.handlers.add(handler)) {
            this.sharedProcessor.m38067a(this, handler, priority);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m38023c(@NotNull AbstractC9640h input) {
        Intrinsics.checkNotNullParameter(input, "input");
        m38025e();
        if (this.inputs.add(input)) {
            this.sharedProcessor.m38068b(this, input, -1);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m38024d(@NotNull AbstractC9640h input, int priority) {
        Intrinsics.checkNotNullParameter(input, "input");
        m38025e();
        if (priority == 1 || priority == 0) {
            if (this.inputs.add(input)) {
                this.sharedProcessor.m38068b(this, input, priority);
            }
        } else {
            throw new IllegalArgumentException(("Unsupported priority value: " + priority).toString());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m38025e() {
        if (m38031k()) {
            throw new IllegalStateException("This NavigationEventDispatcher has already been disposed and cannot be used.");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m38026f(@NotNull AbstractC9640h input, int direction) {
        Intrinsics.checkNotNullParameter(input, "input");
        m38025e();
        if (m38032l()) {
            this.sharedProcessor.m38069c(input, direction);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m38027g(@NotNull AbstractC9640h input, int direction) {
        Intrinsics.checkNotNullParameter(input, "input");
        m38025e();
        if (m38032l()) {
            this.sharedProcessor.m38070d(input, direction, this.onBackCompletedFallback);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m38028h(@NotNull AbstractC9640h input, int direction, @NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(event, "event");
        m38025e();
        if (m38032l()) {
            this.sharedProcessor.m38071e(input, direction, event);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m38029i(@NotNull AbstractC9640h input, int direction, @Nullable NavigationEvent event) {
        Intrinsics.checkNotNullParameter(input, "input");
        m38025e();
        if (m38032l()) {
            this.sharedProcessor.m38072f(input, direction, event);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final C9641i getSharedProcessor() {
        return this.sharedProcessor;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m38031k() {
        C9635c c9635c = this.parent;
        if (c9635c == null || !c9635c.m38031k()) {
            return this.isDisposed;
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m38032l() {
        C9635c c9635c = this.parent;
        if (c9635c == null || c9635c.m38032l()) {
            return this.isEnabled;
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m38033m(@NotNull AbstractC9637e<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (this.handlers.remove(handler)) {
            this.sharedProcessor.m38074h(handler);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9635c(@NotNull InterfaceC9644l onBackCompletedFallback) {
        this(null, onBackCompletedFallback);
        Intrinsics.checkNotNullParameter(onBackCompletedFallback, "onBackCompletedFallback");
    }
}
