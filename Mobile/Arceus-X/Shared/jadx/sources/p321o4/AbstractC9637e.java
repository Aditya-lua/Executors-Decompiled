package p321o4;

import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p321o4.AbstractC9639g;

/* JADX INFO: renamed from: o4.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\u0018\u0010\rJ\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u001a\u0010\u0011J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u001c\u0010\u0011J\u000f\u0010\u001d\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001f\u0010\rJ\u000f\u0010 \u001a\u00020\u000bH\u0015¢\u0006\u0004\b \u0010\rR$\u0010%\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R0\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000&2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b(\u0010)R0\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000&2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b+\u0010)R$\u00101\u001a\u00020-2\u0006\u0010!\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R*\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u0010\u0007\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00102\u001a\u0004\b7\u00104\"\u0004\b8\u00106R$\u0010?\u001a\u0004\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006@"}, m31665d2 = {"Lo4/e;", "Lo4/g;", "T", "", "initialInfo", "", "isBackEnabled", "isForwardEnabled", "<init>", "(Lo4/g;ZZ)V", "(Lo4/g;Z)V", "", "w", "()V", "Lo4/b;", NotificationCompat.CATEGORY_EVENT, "d", "(Lo4/b;)V", "r", "c", "q", "b", "p", "a", "o", "h", "v", "g", "u", "f", "t", "e", "s", "value", "Lo4/g;", "j", "()Lo4/g;", "currentInfo", "", "Ljava/util/List;", "i", "()Ljava/util/List;", "backInfo", "l", "forwardInfo", "Lo4/j;", "Lo4/j;", "getTransitionState", "()Lo4/j;", "transitionState", "Z", "m", "()Z", "x", "(Z)V", "n", "setForwardEnabled", "Lo4/c;", "Lo4/c;", "k", "()Lo4/c;", "y", "(Lo4/c;)V", "dispatcher", "navigationevent"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public abstract class AbstractC9637e<T extends AbstractC9639g> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public T currentInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<? extends T> backInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public List<? extends T> forwardInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public AbstractC9642j transitionState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean isBackEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isForwardEnabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public C9635c dispatcher;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC9637e(@NotNull T initialInfo, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(initialInfo, "initialInfo");
        this.currentInfo = initialInfo;
        this.backInfo = C7699p.m31892k();
        this.forwardInfo = C7699p.m31892k();
        this.transitionState = AbstractC9642j.b.f34975b;
        this.isBackEnabled = z10;
        this.isForwardEnabled = z11;
    }

    /* JADX INFO: renamed from: a */
    public final void m38034a() {
        this.transitionState = AbstractC9642j.b.f34975b;
        mo23007o();
    }

    /* JADX INFO: renamed from: b */
    public final void m38035b() {
        this.transitionState = AbstractC9642j.b.f34975b;
        mo23008p();
    }

    /* JADX INFO: renamed from: c */
    public final void m38036c(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.transitionState = new AbstractC9642j.InProgress(event, -1);
        mo23009q(event);
    }

    /* JADX INFO: renamed from: d */
    public final void m38037d(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.transitionState = new AbstractC9642j.InProgress(event, -1);
        mo23010r(event);
    }

    /* JADX INFO: renamed from: e */
    public final void m38038e() {
        this.transitionState = AbstractC9642j.b.f34975b;
        m38048s();
    }

    /* JADX INFO: renamed from: f */
    public final void m38039f() {
        this.transitionState = AbstractC9642j.b.f34975b;
        m38049t();
    }

    /* JADX INFO: renamed from: g */
    public final void m38040g(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.transitionState = new AbstractC9642j.InProgress(event, 1);
        m38050u(event);
    }

    /* JADX INFO: renamed from: h */
    public final void m38041h(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.transitionState = new AbstractC9642j.InProgress(event, 1);
        m38051v(event);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final List<T> m38042i() {
        return this.backInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final T m38043j() {
        return this.currentInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final C9635c getDispatcher() {
        return this.dispatcher;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final List<T> m38045l() {
        return this.forwardInfo;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m38046m() {
        C9635c c9635c = this.dispatcher;
        if (c9635c == null || c9635c.m38032l()) {
            return this.isBackEnabled;
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m38047n() {
        C9635c c9635c = this.dispatcher;
        if (c9635c == null || c9635c.m38032l()) {
            return this.isForwardEnabled;
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public void mo23007o() {
    }

    /* JADX INFO: renamed from: p */
    public void mo23008p() {
        throw new UnsupportedOperationException("A handler that receives a 'backCompleted' event must override 'onBackCompleted()' to handle the callback.");
    }

    /* JADX INFO: renamed from: q */
    public void mo23009q(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    /* JADX INFO: renamed from: r */
    public void mo23010r(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    /* JADX INFO: renamed from: s */
    public void m38048s() {
    }

    /* JADX INFO: renamed from: t */
    public void m38049t() {
        throw new UnsupportedOperationException("A handler that receives a 'forwardCompleted' event must override 'onForwardCompleted()' to handle the callback.");
    }

    /* JADX INFO: renamed from: u */
    public void m38050u(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    /* JADX INFO: renamed from: v */
    public void m38051v(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    /* JADX INFO: renamed from: w */
    public final void m38052w() {
        C9635c c9635c = this.dispatcher;
        if (c9635c != null) {
            c9635c.m38033m(this);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m38053x(boolean z10) {
        C9641i sharedProcessor;
        if (this.isBackEnabled == z10) {
            return;
        }
        this.isBackEnabled = z10;
        C9635c c9635c = this.dispatcher;
        if (c9635c == null || (sharedProcessor = c9635c.getSharedProcessor()) == null) {
            return;
        }
        sharedProcessor.m38073g();
    }

    /* JADX INFO: renamed from: y */
    public final void m38054y(@Nullable C9635c c9635c) {
        this.dispatcher = c9635c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC9637e(@NotNull T initialInfo, boolean z10) {
        this(initialInfo, z10, false);
        Intrinsics.checkNotNullParameter(initialInfo, "initialInfo");
    }
}
