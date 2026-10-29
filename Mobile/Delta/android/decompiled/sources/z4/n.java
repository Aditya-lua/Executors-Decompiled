package z4;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.g0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0018B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012B\b\u0002\u0010\u000b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006j\b\u0012\u0002\b\u0003\u0018\u0001`\n¢\u0006\u0004\b\f\u0010\rJB\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bRN\u0010\u000b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006j\b\u0012\u0002\b\u0003\u0018\u0001`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lz4/n;", "Lz4/c;", "Lf5/c;", "driver", "", "fileName", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lnt/b;", "", "Landroidx/room/coroutines/TransactionWrapper;", "transactionWrapper", "<init>", "(Lf5/c;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "R", "", "isReadOnly", "Lx4/g0;", "block", "n3", "(ZLkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "", "close", "()V", "a", "Lf5/c;", "b", "Ljava/lang/String;", "c", "Lkotlin/jvm/functions/Function2;", "Ljt/h;", "Lf5/b;", "d", "Ljt/h;", "connection", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f5.c driver;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String fileName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function2<Function1<? super nt.b<Object>, ? extends Object>, nt.b<Object>, Object> transactionWrapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h<f5.b> connection;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lz4/n$a;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lz4/l;", "connectionWrapper", "<init>", "(Lz4/l;)V", "a", "Lz4/l;", "()Lz4/l;", "Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "key", "b", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements CoroutineContext.Element {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final l connectionWrapper;

        /* JADX INFO: renamed from: z4.n$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lz4/n$a$a;", "Lkotlin/coroutines/CoroutineContext$b;", "Lz4/n$a;", "<init>", "()V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion implements CoroutineContext.b<a> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }

        public a(@NotNull l connectionWrapper) {
            Intrinsics.checkNotNullParameter(connectionWrapper, "connectionWrapper");
            this.connectionWrapper = connectionWrapper;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final l getConnectionWrapper() {
            return this.connectionWrapper;
        }

        @Override // kotlin.coroutines.CoroutineContext
        public <R> R fold(R r8, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.a.a(this, r8, function2);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
        @Nullable
        public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.Element.a.b(this, bVar);
        }

        @Override // kotlin.coroutines.CoroutineContext.Element
        @NotNull
        public CoroutineContext.b<a> getKey() {
            return INSTANCE;
        }

        @Override // kotlin.coroutines.CoroutineContext
        @NotNull
        public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
            return CoroutineContext.Element.a.c(this, bVar);
        }

        @Override // kotlin.coroutines.CoroutineContext
        @NotNull
        public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(this, coroutineContext);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lku/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.room.coroutines.PassthroughConnectionPool$useConnection$2", f = "PassthroughConnectionPool.kt", l = {59}, m = "invokeSuspend")
    public static final class b<R> extends pt.m implements Function2<p0, nt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37217t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function2<g0, nt.b<? super R>, Object> f37218u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ l f37219v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super g0, ? super nt.b<? super R>, ? extends Object> function2, l lVar, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f37218u = function2;
            this.f37219v = lVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f37218u, this.f37219v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f37217t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            Function2<g0, nt.b<? super R>, Object> function2 = this.f37218u;
            l lVar = this.f37219v;
            this.f37217t = 1;
            Object objInvoke = function2.invoke(lVar, this);
            return objInvoke == objE ? objE : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super R> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(@NotNull f5.c driver, @NotNull String fileName, @Nullable Function2<? super Function1<? super nt.b<Object>, ? extends Object>, ? super nt.b<Object>, ? extends Object> function2) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.driver = driver;
        this.fileName = fileName;
        this.transactionWrapper = function2;
        this.connection = jt.i.b(new Function0() { // from class: z4.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.b(this.f37212a);
            }
        });
    }

    public static final f5.b b(n nVar) {
        return nVar.driver.a(nVar.fileName);
    }

    @Override // z4.c, java.lang.AutoCloseable
    public void close() {
        if (this.connection.isInitialized()) {
            this.connection.getValue().close();
        }
    }

    @Override // z4.c
    @Nullable
    public <R> Object n3(boolean z10, @NotNull Function2<? super g0, ? super nt.b<? super R>, ? extends Object> function2, @NotNull nt.b<? super R> bVar) {
        a aVar = (a) bVar.getContext().get(a.INSTANCE);
        l connectionWrapper = aVar != null ? aVar.getConnectionWrapper() : null;
        if (connectionWrapper != null) {
            return function2.invoke(connectionWrapper, bVar);
        }
        l lVar = new l(this.transactionWrapper, this.connection.getValue());
        return ku.i.g(new a(lVar), new b(function2, lVar, null), bVar);
    }
}
