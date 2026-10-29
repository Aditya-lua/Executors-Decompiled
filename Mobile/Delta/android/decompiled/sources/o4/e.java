package o4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o4.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\u0018\u0010\rJ\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u001a\u0010\u0011J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0015¢\u0006\u0004\b\u001c\u0010\u0011J\u000f\u0010\u001d\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001f\u0010\rJ\u000f\u0010 \u001a\u00020\u000bH\u0015¢\u0006\u0004\b \u0010\rR$\u0010%\u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b#\u0010$R0\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000&2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b(\u0010)R0\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000&2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b+\u0010)R$\u00101\u001a\u00020-2\u0006\u0010!\u001a\u00020-8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b/\u00100R*\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u0010\u0007\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00102\u001a\u0004\b7\u00104\"\u0004\b8\u00106R$\u0010?\u001a\u0004\u0018\u0001098\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lo4/e;", "Lo4/g;", "T", "", "initialInfo", "", "isBackEnabled", "isForwardEnabled", "<init>", "(Lo4/g;ZZ)V", "(Lo4/g;Z)V", "", "w", "()V", "Lo4/b;", "event", "d", "(Lo4/b;)V", "r", "c", "q", "b", "p", "a", "o", "h", "v", "g", "u", "f", "t", "e", "s", "value", "Lo4/g;", "j", "()Lo4/g;", "currentInfo", "", "Ljava/util/List;", "i", "()Ljava/util/List;", "backInfo", "l", "forwardInfo", "Lo4/j;", "Lo4/j;", "getTransitionState", "()Lo4/j;", "transitionState", "Z", "m", "()Z", "x", "(Z)V", "n", "setForwardEnabled", "Lo4/c;", "Lo4/c;", "k", "()Lo4/c;", "y", "(Lo4/c;)V", "dispatcher", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class e<T extends g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public T currentInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<? extends T> backInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<? extends T> forwardInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public j transitionState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isBackEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isForwardEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public c dispatcher;

    public e(@NotNull T initialInfo, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(initialInfo, "initialInfo");
        this.currentInfo = initialInfo;
        this.backInfo = kotlin.collections.p.k();
        this.forwardInfo = kotlin.collections.p.k();
        this.transitionState = j.b.b;
        this.isBackEnabled = z10;
        this.isForwardEnabled = z11;
    }

    public final void a() {
        this.transitionState = j.b.b;
        o();
    }

    public final void b() {
        this.transitionState = j.b.b;
        p();
    }

    public final void c(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.transitionState = new j.InProgress(event, -1);
        q(event);
    }

    public final void d(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.transitionState = new j.InProgress(event, -1);
        r(event);
    }

    public final void e() {
        this.transitionState = j.b.b;
        s();
    }

    public final void f() {
        this.transitionState = j.b.b;
        t();
    }

    public final void g(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.transitionState = new j.InProgress(event, 1);
        u(event);
    }

    public final void h(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.transitionState = new j.InProgress(event, 1);
        v(event);
    }

    @NotNull
    public final List<T> i() {
        return this.backInfo;
    }

    @NotNull
    public final T j() {
        return this.currentInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final c getDispatcher() {
        return this.dispatcher;
    }

    @NotNull
    public final List<T> l() {
        return this.forwardInfo;
    }

    public final boolean m() {
        c cVar = this.dispatcher;
        if (cVar == null || cVar.l()) {
            return this.isBackEnabled;
        }
        return false;
    }

    public final boolean n() {
        c cVar = this.dispatcher;
        if (cVar == null || cVar.l()) {
            return this.isForwardEnabled;
        }
        return false;
    }

    public void o() {
    }

    public void p() {
        throw new UnsupportedOperationException("A handler that receives a 'backCompleted' event must override 'onBackCompleted()' to handle the callback.");
    }

    public void q(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    public void r(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    public void s() {
    }

    public void t() {
        throw new UnsupportedOperationException("A handler that receives a 'forwardCompleted' event must override 'onForwardCompleted()' to handle the callback.");
    }

    public void u(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    public void v(@NotNull NavigationEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    public final void w() {
        c cVar = this.dispatcher;
        if (cVar != null) {
            cVar.m(this);
        }
    }

    public final void x(boolean z10) {
        i sharedProcessor;
        if (this.isBackEnabled == z10) {
            return;
        }
        this.isBackEnabled = z10;
        c cVar = this.dispatcher;
        if (cVar == null || (sharedProcessor = cVar.getSharedProcessor()) == null) {
            return;
        }
        sharedProcessor.g();
    }

    public final void y(@Nullable c cVar) {
        this.dispatcher = cVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull T initialInfo, boolean z10) {
        this(initialInfo, z10, false);
        Intrinsics.checkNotNullParameter(initialInfo, "initialInfo");
    }
}
