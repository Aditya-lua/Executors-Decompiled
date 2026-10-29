package an;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ku.g2;
import ku.p0;
import ku.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001b"}, d2 = {"Lan/c;", "Landroid/view/View$OnAttachStateChangeListener;", "Lku/p0;", "parentCoroutineScope", "<init>", "(Lku/p0;)V", "Lkotlin/Function0;", "", "block", "c", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "", "a", "Ljava/util/List;", "attachHandlers", "Lku/a0;", "b", "Lku/a0;", "attachedJob", "Lku/p0;", "()Lku/p0;", "coroutineScope", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class c implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Function0<Unit>> attachHandlers;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final ku.a0 attachedJob;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends kotlin.jvm.internal.m implements Function1<Throwable, Unit> {
        public a() {
            super(1);
        }

        public final void a(@Nullable Throwable th2) {
            c.this.attachHandlers.clear();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22483a;
        }
    }

    public c(@NotNull p0 parentCoroutineScope) {
        Intrinsics.checkNotNullParameter(parentCoroutineScope, "parentCoroutineScope");
        this.attachHandlers = new ArrayList();
        ku.a0 a0VarA = g2.a(g2.h(parentCoroutineScope.getCoroutineContext()));
        a0VarA.q(new a());
        this.attachedJob = a0VarA;
        this.coroutineScope = q0.j(parentCoroutineScope, a0VarA);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final p0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final void c(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!q0.i(this.coroutineScope)) {
            throw new IllegalStateException("Expected AttachedScope to be active when adding attach handler.");
        }
        this.attachHandlers.add(block);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NotNull View v5) {
        Intrinsics.checkNotNullParameter(v5, "v");
        List<Function0<Unit>> list = this.attachHandlers;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
        list.clear();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NotNull View v5) {
        Intrinsics.checkNotNullParameter(v5, "v");
        q0.e(this.coroutineScope, "View detached", null, 2, null);
        v5.removeOnAttachStateChangeListener(this);
    }
}
