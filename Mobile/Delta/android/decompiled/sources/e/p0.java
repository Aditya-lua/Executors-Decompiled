package e;

import android.window.OnBackInvokedDispatcher;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001bB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010)\u001a\u00060'R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(¨\u0006*"}, d2 = {"Le/p0;", "", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Lx2/a;", "", "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;Lx2/a;)V", "(Ljava/lang/Runnable;)V", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "", "j", "(Landroid/window/OnBackInvokedDispatcher;)V", "Le/m0;", "onBackPressedCallback", "e", "(Le/m0;)V", "Landroidx/lifecycle/s;", "owner", "d", "(Landroidx/lifecycle/s;Le/m0;)V", "h", "()Z", "i", "()V", "a", "Ljava/lang/Runnable;", "b", "Lx2/a;", "c", "Z", "hasEnabledCallbacks", "Lo4/c;", "Lo4/c;", "g", "()Lo4/c;", "eventDispatcher", "Le/p0$a;", "Le/p0$a;", "eventInput", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Runnable fallbackOnBackPressed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final x2.a<Boolean> onHasEnabledCallbacksChanged;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean hasEnabledCallbacks;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o4.c eventDispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final a eventInput;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Le/p0$a;", "Lo4/h;", "<init>", "(Le/p0;)V", "", "hasEnabledHandlers", "", "j", "(Z)V", "m", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a extends o4.h {
        public a() {
        }

        @Override // o4.h
        public void j(boolean hasEnabledHandlers) {
            p0.this.hasEnabledCallbacks = hasEnabledHandlers;
            x2.a aVar = p0.this.onHasEnabledCallbacksChanged;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(hasEnabledHandlers));
            }
        }

        public final void m() {
            b();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"e/p0$b", "Landroidx/lifecycle/p;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Landroidx/lifecycle/s;", Payload.SOURCE, "Landroidx/lifecycle/l$a;", "event", "", "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "close", "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements androidx.p000lifecycle.p, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o4.e<?> f14944a;
        public final /* synthetic */ m0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p0 f14945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ androidx.p000lifecycle.l f14946d;

        public b(o4.e<?> eVar, m0 m0Var, p0 p0Var, androidx.p000lifecycle.l lVar) {
            this.f14944a = eVar;
            this.b = m0Var;
            this.f14945c = p0Var;
            this.f14946d = lVar;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.f14946d.d(this);
        }

        @Override // androidx.p000lifecycle.p
        public void g(androidx.p000lifecycle.s source, androidx.lifecycle.l.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            boolean z10 = false;
            if (e.a.isOnBackPressedLifecycleOrderMaintained) {
                o4.e<?> eVar = this.f14944a;
                if (event.b().b(androidx.lifecycle.l.b.STARTED) && this.b.getIsEnabled()) {
                    z10 = true;
                }
                eVar.x(z10);
            } else if (event == androidx.lifecycle.l.a.ON_START) {
                o4.c.b(this.f14945c.getEventDispatcher(), this.f14944a, 0, 2, null);
            } else if (event == androidx.lifecycle.l.a.ON_STOP) {
                this.f14944a.w();
            }
            if (event == androidx.lifecycle.l.a.ON_DESTROY) {
                this.f14944a.w();
                this.f14946d.d(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final void f(p0 p0Var) {
        Runnable runnable = p0Var.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void d(@NotNull androidx.p000lifecycle.s owner, @NotNull m0 onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        androidx.p000lifecycle.l lVarA = owner.a();
        if (lVarA.getState() == androidx.lifecycle.l.b.DESTROYED) {
            return;
        }
        o4.e<?> eVarCreateNavigationEventHandler$activity = onBackPressedCallback.createNavigationEventHandler$activity(new OnBackPressedCallbackInfo(onBackPressedCallback, owner));
        if (e.a.isOnBackPressedLifecycleOrderMaintained) {
            eVarCreateNavigationEventHandler$activity.x(false);
            o4.c.b(this.eventDispatcher, eVarCreateNavigationEventHandler$activity, 0, 2, null);
        }
        b bVar = new b(eVarCreateNavigationEventHandler$activity, onBackPressedCallback, this, lVarA);
        lVarA.a(bVar);
        onBackPressedCallback.addCloseable$activity(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(@NotNull m0 onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        o4.c.b(this.eventDispatcher, onBackPressedCallback.createNavigationEventHandler$activity(new OnBackPressedCallbackInfo(onBackPressedCallback, null, 2, 0 == true ? 1 : 0)), 0, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final o4.c getEventDispatcher() {
        return this.eventDispatcher;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getHasEnabledCallbacks() {
        return this.hasEnabledCallbacks;
    }

    public final void i() {
        this.eventInput.m();
    }

    public final void j(@NotNull OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.eventDispatcher.d(new o4.m(invoker), 1);
        this.eventDispatcher.d(new o4.p(invoker), 0);
    }

    public p0(@Nullable Runnable runnable, @Nullable x2.a<Boolean> aVar) {
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = aVar;
        o4.c cVar = new o4.c(new o4.l() { // from class: e.o0
            @Override // o4.l
            public final void a() {
                p0.f(this.f14911a);
            }
        });
        this.eventDispatcher = cVar;
        a aVar2 = new a();
        this.eventInput = aVar2;
        cVar.c(aVar2);
    }

    public p0(@Nullable Runnable runnable) {
        this(runnable, null);
    }

    public /* synthetic */ p0(Runnable runnable, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : runnable);
    }
}
