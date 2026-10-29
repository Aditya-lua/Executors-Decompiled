package ml;

import com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback;
import com.roblox.protocols.systemdialogplatforminterface.generated.SystemDialogContext;
import gk.p;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.k;
import ku.p0;
import ku.q0;
import org.jetbrains.annotations.NotNull;
import pt.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lml/d;", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "Lku/p0;", "coroutineScope", "<init>", "(Lku/p0;)V", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;", "context", "", "onOpened", "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V", "onClosed", "onOkClicked", "onCancelClicked", "Ljava/lang/Runnable;", "work", "g", "(Ljava/lang/Runnable;)V", "a", "Lku/p0;", "", "b", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/CountDownLatch;", "c", "Ljava/util/concurrent/atomic/AtomicReference;", "latch", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends ISystemDialogCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 coroutineScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AtomicReference<CountDownLatch> latch;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.protocols.systemdialog.DeferredWorkSystemDialogObserver$waitIfBlockedAndDeferWork$1", f = "DeferredWorkSystemDialogObserver.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24409t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Runnable f24411v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Runnable runnable, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f24411v = runnable;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return d.this.new a(this.f24411v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f24409t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            try {
                CountDownLatch countDownLatch = (CountDownLatch) d.this.latch.get();
                if (countDownLatch != null) {
                    countDownLatch.await();
                }
            } catch (InterruptedException e10) {
                p.f(d.this.TAG, "Await for blockage calls failed.", e10);
            }
            this.f24411v.run();
            d.this.latch.set(null);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final CountDownLatch e(CountDownLatch countDownLatch) {
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        return countDownLatch;
    }

    public static final CountDownLatch f(CountDownLatch countDownLatch) {
        return countDownLatch == null ? new CountDownLatch(1) : countDownLatch;
    }

    public final void g(@NotNull Runnable work) {
        Intrinsics.checkNotNullParameter(work, "work");
        k.d(this.coroutineScope, null, null, new a(work, null), 3, null);
    }

    @Override // com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback
    public void onCancelClicked(@NotNull SystemDialogContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback
    public void onClosed(@NotNull SystemDialogContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.getId() < 0) {
            return;
        }
        this.latch.getAndUpdate(new UnaryOperator() { // from class: ml.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d.e((CountDownLatch) obj);
            }
        });
    }

    @Override // com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback
    public void onOkClicked(@NotNull SystemDialogContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback
    public void onOpened(@NotNull SystemDialogContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (context.getId() < 0) {
            return;
        }
        this.latch.getAndUpdate(new UnaryOperator() { // from class: ml.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return d.f((CountDownLatch) obj);
            }
        });
    }

    public d(@NotNull p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.TAG = "rbx.DeferredWorkSystemDialogObserver";
        this.latch = new AtomicReference<>(null);
    }

    public /* synthetic */ d(p0 p0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? q0.a(g1.a()) : p0Var);
    }
}
