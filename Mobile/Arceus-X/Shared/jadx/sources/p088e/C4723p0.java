package p088e;

import android.window.OnBackInvokedDispatcher;
import androidx.core.app.NotificationCompat;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0974p;
import androidx.p616lifecycle.InterfaceC0980s;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p321o4.AbstractC9637e;
import p321o4.AbstractC9640h;
import p321o4.C9635c;
import p321o4.C9645m;
import p321o4.C9648p;
import p321o4.InterfaceC9644l;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: e.p0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001bB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010&\u001a\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%R\u0018\u0010)\u001a\u00060'R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010(¨\u0006*"}, m31665d2 = {"Le/p0;", "", "Ljava/lang/Runnable;", "fallbackOnBackPressed", "Lx2/a;", "", "onHasEnabledCallbacksChanged", "<init>", "(Ljava/lang/Runnable;Lx2/a;)V", "(Ljava/lang/Runnable;)V", "Landroid/window/OnBackInvokedDispatcher;", "invoker", "", "j", "(Landroid/window/OnBackInvokedDispatcher;)V", "Le/m0;", "onBackPressedCallback", "e", "(Le/m0;)V", "Landroidx/lifecycle/s;", "owner", "d", "(Landroidx/lifecycle/s;Le/m0;)V", "h", "()Z", "i", "()V", "a", "Ljava/lang/Runnable;", "b", "Lx2/a;", "c", "Z", "hasEnabledCallbacks", "Lo4/c;", "Lo4/c;", "g", "()Lo4/c;", "eventDispatcher", "Le/p0$a;", "Le/p0$a;", "eventInput", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C4723p0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Runnable fallbackOnBackPressed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC12631a<Boolean> onHasEnabledCallbacksChanged;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean hasEnabledCallbacks;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C9635c eventDispatcher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final a eventInput;

    /* JADX INFO: renamed from: e.p0$a */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Le/p0$a;", "Lo4/h;", "<init>", "(Le/p0;)V", "", "hasEnabledHandlers", "", "j", "(Z)V", "m", "()V", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public final class a extends AbstractC9640h {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // p321o4.AbstractC9640h
        /* JADX INFO: renamed from: j */
        public void mo23083j(boolean hasEnabledHandlers) {
            C4723p0.this.hasEnabledCallbacks = hasEnabledHandlers;
            InterfaceC12631a interfaceC12631a = C4723p0.this.onHasEnabledCallbacksChanged;
            if (interfaceC12631a != null) {
                interfaceC12631a.accept(Boolean.valueOf(hasEnabledHandlers));
            }
        }

        /* JADX INFO: renamed from: m */
        public final void m23084m() {
            m38056b();
        }
    }

    /* JADX INFO: renamed from: e.p0$b */
    @Metadata(m31664d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"e/p0$b", "Landroidx/lifecycle/p;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Landroidx/lifecycle/s;", Payload.SOURCE, "Landroidx/lifecycle/l$a;", NotificationCompat.CATEGORY_EVENT, "", "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "close", "()V", "activity"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
    public static final class b implements InterfaceC0974p, AutoCloseable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC9637e<?> f19244a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC4717m0 f19245b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C4723p0 f19246c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC0966l f19247d;

        public b(AbstractC9637e<?> abstractC9637e, AbstractC4717m0 abstractC4717m0, C4723p0 c4723p0, AbstractC0966l abstractC0966l) {
            this.f19244a = abstractC9637e;
            this.f19245b = abstractC4717m0;
            this.f19246c = c4723p0;
            this.f19247d = abstractC0966l;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            this.f19247d.mo4938d(this);
        }

        @Override // androidx.p616lifecycle.InterfaceC0974p
        /* JADX INFO: renamed from: g */
        public void mo1334g(InterfaceC0980s source, AbstractC0966l.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            boolean z10 = false;
            if (C4692a.isOnBackPressedLifecycleOrderMaintained) {
                AbstractC9637e<?> abstractC9637e = this.f19244a;
                if (event.m4940b().m4945b(AbstractC0966l.b.STARTED) && this.f19245b.getIsEnabled()) {
                    z10 = true;
                }
                abstractC9637e.m38053x(z10);
            } else if (event == AbstractC0966l.a.ON_START) {
                C9635c.m38021b(this.f19246c.getEventDispatcher(), this.f19244a, 0, 2, null);
            } else if (event == AbstractC0966l.a.ON_STOP) {
                this.f19244a.m38052w();
            }
            if (event == AbstractC0966l.a.ON_DESTROY) {
                this.f19244a.m38052w();
                this.f19247d.mo4938d(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C4723p0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: f */
    public static final void m23076f(C4723p0 c4723p0) {
        Runnable runnable = c4723p0.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m23077d(@NotNull InterfaceC0980s owner, @NotNull AbstractC4717m0 onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        AbstractC0966l abstractC0966lMo4656a = owner.mo4656a();
        if (abstractC0966lMo4656a.getState() == AbstractC0966l.b.DESTROYED) {
            return;
        }
        AbstractC9637e<?> abstractC9637eCreateNavigationEventHandler$activity = onBackPressedCallback.createNavigationEventHandler$activity(new OnBackPressedCallbackInfo(onBackPressedCallback, owner));
        if (C4692a.isOnBackPressedLifecycleOrderMaintained) {
            abstractC9637eCreateNavigationEventHandler$activity.m38053x(false);
            C9635c.m38021b(this.eventDispatcher, abstractC9637eCreateNavigationEventHandler$activity, 0, 2, null);
        }
        b bVar = new b(abstractC9637eCreateNavigationEventHandler$activity, onBackPressedCallback, this, abstractC0966lMo4656a);
        abstractC0966lMo4656a.mo4935a(bVar);
        onBackPressedCallback.addCloseable$activity(bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final void m23078e(@NotNull AbstractC4717m0 onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        C9635c.m38021b(this.eventDispatcher, onBackPressedCallback.createNavigationEventHandler$activity(new OnBackPressedCallbackInfo(onBackPressedCallback, null, 2, 0 == true ? 1 : 0)), 0, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final C9635c getEventDispatcher() {
        return this.eventDispatcher;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getHasEnabledCallbacks() {
        return this.hasEnabledCallbacks;
    }

    /* JADX INFO: renamed from: i */
    public final void m23081i() {
        this.eventInput.m23084m();
    }

    /* JADX INFO: renamed from: j */
    public final void m23082j(@NotNull OnBackInvokedDispatcher invoker) {
        Intrinsics.checkNotNullParameter(invoker, "invoker");
        this.eventDispatcher.m38024d(new C9645m(invoker), 1);
        this.eventDispatcher.m38024d(new C9648p(invoker), 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4723p0(@Nullable Runnable runnable, @Nullable InterfaceC12631a<Boolean> interfaceC12631a) {
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = interfaceC12631a;
        C9635c c9635c = new C9635c(new InterfaceC9644l() { // from class: e.o0
            @Override // p321o4.InterfaceC9644l
            /* JADX INFO: renamed from: a */
            public final void mo23011a() {
                C4723p0.m23076f(this.f19208a);
            }
        });
        this.eventDispatcher = c9635c;
        a aVar = new a();
        this.eventInput = aVar;
        c9635c.m38023c(aVar);
    }

    public C4723p0(@Nullable Runnable runnable) {
        this(runnable, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
      (wrap java.lang.Runnable:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Runnable) : (r1v0 java.lang.Runnable))
     A[MD:(java.lang.Runnable):void (m)] (LINE:9) call: e.p0.<init>(java.lang.Runnable):void type: THIS */
    public /* synthetic */ C4723p0(Runnable runnable, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : runnable);
    }
}
