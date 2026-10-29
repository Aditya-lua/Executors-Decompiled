package p025b5;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145g5.InterfaceC6008c;
import p145g5.InterfaceC6009d;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.C7946z0;
import p256ku.InterfaceC7850d2;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: b5.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0002%#B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001cJ\u001b\u0010 \u001a\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010,R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00104R$\u0010:\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b6\u0010\u001a\"\u0004\b8\u00109R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010?R\u0011\u0010C\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, m31665d2 = {"Lb5/b;", "", "", "timeoutAmount", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lb5/b$b;", "watch", "<init>", "(JLjava/util/concurrent/TimeUnit;Lb5/b$b;)V", "Lg5/d;", "delegateOpenHelper", "", "l", "(Lg5/d;)V", "Lku/p0;", "coroutineScope", "k", "(Lku/p0;)V", "V", "Lkotlin/Function1;", "Lg5/c;", "block", "h", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "j", "()Lg5/c;", "g", "()V", "f", "Lkotlin/Function0;", "onAutoClose", "n", "(Lkotlin/jvm/functions/Function0;)V", "e", "a", "Lb5/b$b;", "b", "Lg5/d;", "c", "Lku/p0;", "d", "Lkotlin/jvm/functions/Function0;", "onAutoCloseCallback", "Ljava/lang/Object;", "lock", "J", "autoCloseTimeoutInMs", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "referenceCount", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "lastDecrementRefCountTimeStamp", "i", "Lg5/c;", "setDelegateDatabase$room_runtime", "(Lg5/c;)V", "delegateDatabase", "", "Z", "manuallyClosed", "Lku/d2;", "Lku/d2;", "autoCloseJob", "m", "()Z", "isActive", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1224b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final b watch;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public InterfaceC6009d delegateOpenHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public InterfaceC7906p0 coroutineScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Function0<Unit> onAutoCloseCallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Object lock;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final long autoCloseTimeoutInMs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final AtomicInteger referenceCount;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public AtomicLong lastDecrementRefCountTimeStamp;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public InterfaceC6008c delegateDatabase;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean manuallyClosed;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public InterfaceC7850d2 autoCloseJob;

    /* JADX INFO: renamed from: b5.b$b */
    @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m31665d2 = {"Lb5/b$b;", "", "", "a", "()J", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        long mo6868a();
    }

    /* JADX INFO: renamed from: b5.b$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.support.AutoCloser$decrementCountAndScheduleClose$2", m39664f = "AutoCloser.android.kt", m39665l = {167}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f5122t;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C1224b.this.new c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f5122t;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                long j10 = C1224b.this.autoCloseTimeoutInMs;
                this.f5122t = 1;
                if (C7946z0.m32938b(j10, this) == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
            }
            C1224b.this.m6873e();
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1224b(long j10, @NotNull TimeUnit timeUnit, @NotNull b watch) {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(watch, "watch");
        this.watch = watch;
        this.lock = new Object();
        this.autoCloseTimeoutInMs = timeUnit.toMillis(j10);
        this.referenceCount = new AtomicInteger(0);
        this.lastDecrementRefCountTimeStamp = new AtomicLong(watch.mo6868a());
    }

    /* JADX INFO: renamed from: b */
    public static final long m6870b() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: e */
    public final void m6873e() {
        synchronized (this.lock) {
            try {
                if (this.watch.mo6868a() - this.lastDecrementRefCountTimeStamp.get() < this.autoCloseTimeoutInMs) {
                    return;
                }
                if (this.referenceCount.get() != 0) {
                    return;
                }
                Function0<Unit> function0 = this.onAutoCloseCallback;
                if (function0 == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should  have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                function0.invoke();
                InterfaceC6008c interfaceC6008c = this.delegateDatabase;
                if (interfaceC6008c != null && interfaceC6008c.isOpen()) {
                    interfaceC6008c.close();
                }
                this.delegateDatabase = null;
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m6874f() {
        synchronized (this.lock) {
            try {
                this.manuallyClosed = true;
                InterfaceC7850d2 interfaceC7850d2 = this.autoCloseJob;
                if (interfaceC7850d2 != null) {
                    InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
                }
                this.autoCloseJob = null;
                InterfaceC6008c interfaceC6008c = this.delegateDatabase;
                if (interfaceC6008c != null) {
                    interfaceC6008c.close();
                }
                this.delegateDatabase = null;
                Unit unit = Unit.f29331a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m6875g() {
        InterfaceC7906p0 interfaceC7906p0;
        int iDecrementAndGet = this.referenceCount.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("Unbalanced reference count.");
        }
        this.lastDecrementRefCountTimeStamp.set(this.watch.mo6868a());
        if (iDecrementAndGet == 0) {
            InterfaceC7906p0 interfaceC7906p1 = this.coroutineScope;
            if (interfaceC7906p1 == null) {
                Intrinsics.m31998u("coroutineScope");
                interfaceC7906p0 = null;
            } else {
                interfaceC7906p0 = interfaceC7906p1;
            }
            this.autoCloseJob = C7882k.m32780d(interfaceC7906p0, null, null, new c(null), 3, null);
        }
    }

    /* JADX INFO: renamed from: h */
    public final <V> V m6876h(@NotNull Function1<? super InterfaceC6008c, ? extends V> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke(m6878j());
        } finally {
            m6875g();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC6008c getDelegateDatabase() {
        return this.delegateDatabase;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final InterfaceC6008c m6878j() {
        InterfaceC7850d2 interfaceC7850d2 = this.autoCloseJob;
        InterfaceC6009d interfaceC6009d = null;
        if (interfaceC7850d2 != null) {
            InterfaceC7850d2.a.m32603a(interfaceC7850d2, null, 1, null);
        }
        this.autoCloseJob = null;
        this.referenceCount.incrementAndGet();
        if (this.manuallyClosed) {
            throw new IllegalStateException("Attempting to open already closed database.");
        }
        synchronized (this.lock) {
            InterfaceC6008c interfaceC6008c = this.delegateDatabase;
            if (interfaceC6008c != null && interfaceC6008c.isOpen()) {
                return interfaceC6008c;
            }
            InterfaceC6009d interfaceC6009d2 = this.delegateOpenHelper;
            if (interfaceC6009d2 == null) {
                Intrinsics.m31998u("delegateOpenHelper");
            } else {
                interfaceC6009d = interfaceC6009d2;
            }
            InterfaceC6008c interfaceC6008cMo6885t2 = interfaceC6009d.mo6885t2();
            this.delegateDatabase = interfaceC6008cMo6885t2;
            return interfaceC6008cMo6885t2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6879k(@NotNull InterfaceC7906p0 coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
    }

    /* JADX INFO: renamed from: l */
    public final void m6880l(@NotNull InterfaceC6009d delegateOpenHelper) {
        Intrinsics.checkNotNullParameter(delegateOpenHelper, "delegateOpenHelper");
        if (delegateOpenHelper instanceof C1229g) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.delegateOpenHelper = delegateOpenHelper;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m6881m() {
        return !this.manuallyClosed;
    }

    /* JADX INFO: renamed from: n */
    public final void m6882n(@NotNull Function0<Unit> onAutoClose) {
        Intrinsics.checkNotNullParameter(onAutoClose, "onAutoClose");
        this.onAutoCloseCallback = onAutoClose;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
      (r1v0 long)
      (r3v0 java.util.concurrent.TimeUnit)
      (wrap b5.b$b:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap b5.b$b:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:7) call: b5.a.<init>():void type: CONSTRUCTOR) : (r4v0 b5.b$b))
     A[MD:(long, java.util.concurrent.TimeUnit, b5.b$b):void (m)] (LINE:8) call: b5.b.<init>(long, java.util.concurrent.TimeUnit, b5.b$b):void type: THIS */
    public /* synthetic */ C1224b(long j10, TimeUnit timeUnit, b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, timeUnit, (i10 & 4) != 0 ? new b() { // from class: b5.a
            @Override // p025b5.C1224b.b
            /* JADX INFO: renamed from: a */
            public final long mo6868a() {
                return C1224b.m6870b();
            }
        } : bVar);
    }
}
