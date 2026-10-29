package p594z4;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5360c;
import p229jt.C7342i;
import p229jt.C7348o;
import p229jt.InterfaceC7341h;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p535x4.InterfaceC12663g0;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: z4.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012B\b\u0002\u0010\u000b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006j\b\u0012\u0002\b\u0003\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJB\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bRN\u0010\u000b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006j\b\u0012\u0002\b\u0003\u0018\u0001`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m31665d2 = {"Lz4/n;", "Lz4/c;", "Lf5/c;", "driver", "", "fileName", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lnt/b;", "", "Landroidx/room/coroutines/TransactionWrapper;", "transactionWrapper", "<init>", "(Lf5/c;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "R", "", "isReadOnly", "Lx4/g0;", "block", "n3", "(ZLkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "", "close", "()V", "a", "Lf5/c;", "b", "Ljava/lang/String;", "c", "Lkotlin/jvm/functions/Function2;", "Ljt/h;", "Lf5/b;", "d", "Ljt/h;", "connection", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13714n implements InterfaceC13703c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5360c driver;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String fileName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Function2<Function1<? super InterfaceC9557b<Object>, ? extends Object>, InterfaceC9557b<Object>, Object> transactionWrapper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h<InterfaceC5359b> connection;

    /* JADX INFO: renamed from: z4.n$a */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, m31665d2 = {"Lz4/n$a;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lz4/l;", "connectionWrapper", "<init>", "(Lz4/l;)V", "a", "Lz4/l;", "()Lz4/l;", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "b", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a implements CoroutineContext.Element {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final C13712l connectionWrapper;

        /* JADX INFO: renamed from: z4.n$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"Lz4/n$a$a;", "Lkotlin/coroutines/CoroutineContext$b;", "Lz4/n$a;", "<init>", "()V", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
        public static final class Companion implements CoroutineContext.InterfaceC7716b<a> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: z4.n.a.a.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public Companion() {
            }
        }

        public a(@NotNull C13712l connectionWrapper) {
            Intrinsics.checkNotNullParameter(connectionWrapper, "connectionWrapper");
            this.connectionWrapper = connectionWrapper;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final C13712l getConnectionWrapper() {
            return this.connectionWrapper;
        }

        @Override // kotlin.coroutines.CoroutineContext
        public <R> R fold(R r8, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.C7714a.m31947a(this, r8, function2);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        @Nullable
        public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.InterfaceC7716b<E> interfaceC7716b) {
            return (E) CoroutineContext.Element.C7714a.m31948b(this, interfaceC7716b);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element
        @NotNull
        public CoroutineContext.InterfaceC7716b<a> getKey() {
            return INSTANCE;
        }

        @Override // kotlin.coroutines.CoroutineContext
        @NotNull
        public CoroutineContext minusKey(@NotNull CoroutineContext.InterfaceC7716b<?> interfaceC7716b) {
            return CoroutineContext.Element.C7714a.m31949c(this, interfaceC7716b);
        }

        @Override // kotlin.coroutines.CoroutineContext
        @NotNull
        public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.C7714a.m31950d(this, coroutineContext);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: z4.n$b */
    @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m31665d2 = {"R", "Lku/p0;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.coroutines.PassthroughConnectionPool$useConnection$2", m39664f = "PassthroughConnectionPool.kt", m39665l = {59}, m39666m = "invokeSuspend")
    public static final class b<R> extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super R>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48173t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Function2<InterfaceC12663g0, InterfaceC9557b<? super R>, Object> f48174u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C13712l f48175v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super x4.g0, ? super nt.b<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super InterfaceC12663g0, ? super InterfaceC9557b<? super R>, ? extends Object> function2, C13712l c13712l, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48174u = function2;
            this.f48175v = c13712l;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f48174u, this.f48175v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f48173t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            Function2<InterfaceC12663g0, InterfaceC9557b<? super R>, Object> function2 = this.f48174u;
            C13712l c13712l = this.f48175v;
            this.f48173t = 1;
            Object objInvoke = function2.invoke(c13712l, this);
            return objInvoke == objM38805e ? objM38805e : objInvoke;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super R> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super nt.b<java.lang.Object>, ? extends java.lang.Object>, ? super nt.b<java.lang.Object>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C13714n(@NotNull InterfaceC5360c driver, @NotNull String fileName, @Nullable Function2<? super Function1<? super InterfaceC9557b<Object>, ? extends Object>, ? super InterfaceC9557b<Object>, ? extends Object> function2) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.driver = driver;
        this.fileName = fileName;
        this.transactionWrapper = function2;
        this.connection = C7342i.m30456b(new Function0() { // from class: z4.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13714n.m50091b(this.f48166a);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC5359b m50091b(C13714n c13714n) {
        return c13714n.driver.mo24697a(c13714n.fileName);
    }

    @Override // p594z4.InterfaceC13703c, java.lang.AutoCloseable
    public void close() {
        if (this.connection.isInitialized()) {
            this.connection.getValue().close();
        }
    }

    @Override // p594z4.InterfaceC13703c
    @Nullable
    /* JADX INFO: renamed from: n3 */
    public <R> Object mo50063n3(boolean z10, @NotNull Function2<? super InterfaceC12663g0, ? super InterfaceC9557b<? super R>, ? extends Object> function2, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        a aVar = (a) interfaceC9557b.getContext().get(a.INSTANCE);
        C13712l connectionWrapper = aVar != null ? aVar.getConnectionWrapper() : null;
        if (connectionWrapper != null) {
            return function2.invoke(connectionWrapper, interfaceC9557b);
        }
        C13712l c13712l = new C13712l(this.transactionWrapper, this.connection.getValue());
        return C7872i.m32684g(new a(c13712l), new b(function2, c13712l, null), interfaceC9557b);
    }
}
