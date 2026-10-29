package ml;

import com.roblox.protocols.systemdialogplatforminterface.generated.ISystemDialogCallback;
import com.roblox.protocols.systemdialogplatforminterface.generated.SystemDialogContext;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p151gk.C6124q;
import p229jt.C7348o;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: ml.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m31665d2 = {"Lml/d;", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/ISystemDialogCallback;", "Lku/p0;", "coroutineScope", "<init>", "(Lku/p0;)V", "Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;", "context", "", "onOpened", "(Lcom/roblox/protocols/systemdialogplatforminterface/generated/SystemDialogContext;)V", "onClosed", "onOkClicked", "onCancelClicked", "Ljava/lang/Runnable;", "work", "g", "(Ljava/lang/Runnable;)V", "a", "Lku/p0;", "", "b", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/CountDownLatch;", "c", "Ljava/util/concurrent/atomic/AtomicReference;", "latch", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8580d extends ISystemDialogCallback {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final AtomicReference<CountDownLatch> latch;

    /* JADX INFO: renamed from: ml.d$a */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.protocols.systemdialog.DeferredWorkSystemDialogObserver$waitIfBlockedAndDeferWork$1", m39664f = "DeferredWorkSystemDialogObserver.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f31529t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Runnable f31531v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Runnable runnable, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f31531v = runnable;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C8580d.this.new a(this.f31531v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f31529t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            try {
                CountDownLatch countDownLatch = (CountDownLatch) C8580d.this.latch.get();
                if (countDownLatch != null) {
                    countDownLatch.await();
                }
            } catch (InterruptedException e10) {
                C6124q.m27061f(C8580d.this.TAG, "Await for blockage calls failed.", e10);
            }
            this.f31531v.run();
            C8580d.this.latch.set(null);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C8580d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: e */
    public static final CountDownLatch m34608e(CountDownLatch countDownLatch) {
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        return countDownLatch;
    }

    /* JADX INFO: renamed from: f */
    public static final CountDownLatch m34609f(CountDownLatch countDownLatch) {
        return countDownLatch == null ? new CountDownLatch(1) : countDownLatch;
    }

    /* JADX INFO: renamed from: g */
    public final void m34610g(@NotNull Runnable work) {
        Intrinsics.checkNotNullParameter(work, "work");
        C7882k.m32780d(this.coroutineScope, null, null, new a(work, null), 3, null);
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
                return C8580d.m34608e((CountDownLatch) obj);
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
                return C8580d.m34609f((CountDownLatch) obj);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8580d(@NotNull InterfaceC7906p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.TAG = "rbx.DeferredWorkSystemDialogObserver";
        this.latch = new AtomicReference<>(null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
      (wrap ku.p0:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap ku.p0:0x0008: INVOKE (wrap ku.l0:0x0004: INVOKE  STATIC call: ku.g1.a():ku.l0 A[MD:():ku.l0 (m), WRAPPED] (LINE:6)) STATIC call: ku.q0.a(kotlin.coroutines.CoroutineContext):ku.p0 A[MD:(kotlin.coroutines.CoroutineContext):ku.p0 (m), WRAPPED] (LINE:6)) : (r1v0 ku.p0))
     A[MD:(ku.p0):void (m)] (LINE:7) call: ml.d.<init>(ku.p0):void type: THIS */
    public /* synthetic */ C8580d(InterfaceC7906p0 interfaceC7906p0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C7910q0.m32885a(C7864g1.m32643a()) : interfaceC7906p0);
    }
}
