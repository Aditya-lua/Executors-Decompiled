package z4;

import android.database.SQLException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x4.g0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fJB\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u001a0-j\b\u0012\u0004\u0012\u00020\u001a`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010B\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lz4/h;", "Lz4/c;", "Lf5/c;", "driver", "", "fileName", "", "preparedStatementCacheSize", "<init>", "(Lf5/c;Ljava/lang/String;I)V", "maxNumOfReaders", "maxNumOfWriters", "(Lf5/c;Ljava/lang/String;III)V", "R", "", "isReadOnly", "Lkotlin/Function2;", "Lx4/g0;", "Lnt/b;", "", "block", "n3", "(ZLkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "", "close", "()V", "Lz4/p;", "connection", "Lkotlin/coroutines/CoroutineContext;", "h", "(Lz4/p;)Lkotlin/coroutines/CoroutineContext;", "j", "(Z)V", "a", "Lf5/c;", "Lz4/o;", "b", "Lz4/o;", "readers", "c", "writers", "Lz4/b;", "d", "Lz4/b;", "connectionElementKey", "Ljava/lang/ThreadLocal;", "Landroidx/room/concurrent/ThreadLocal;", "e", "Ljava/lang/ThreadLocal;", "connectionThreadLocal", "f", "Z", "isClosed", "Lkotlin/time/a;", "g", "J", "getTimeout-UwyO8pc$room_runtime", "()J", "setTimeout-LRDsOJo$room_runtime", "(J)V", "timeout", "I", "getOnTimeout$room_runtime", "()I", "setOnTimeout$room_runtime", "(I)V", "onTimeout", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements z4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f5.c driver;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final o readers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final o writers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final z4.b connectionElementKey;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ThreadLocal<p> connectionThreadLocal;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public volatile boolean isClosed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public long timeout;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int onTimeout;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @pt.f(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", l = {131, 135, 154, 159}, m = "useConnection")
    public static final class a<R> extends pt.d {
        public /* synthetic */ Object A;
        public int C;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f37161t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37162u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f37163v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f37164w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f37165x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f37166y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f37167z;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return h.this.n3(false, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lku/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", f = "ConnectionPoolImpl.kt", l = {132}, m = "invokeSuspend")
    public static final class b<R> extends pt.m implements Function2<p0, nt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37168t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function2<g0, nt.b<? super R>, Object> f37169u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ p f37170v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super g0, ? super nt.b<? super R>, ? extends Object> function2, p pVar, nt.b<? super b> bVar) {
            super(2, bVar);
            this.f37169u = function2;
            this.f37170v = pVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new b(this.f37169u, this.f37170v, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f37168t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            Function2<g0, nt.b<? super R>, Object> function2 = this.f37169u;
            p pVar = this.f37170v;
            this.f37168t = 1;
            Object objInvoke = function2.invoke(pVar, this);
            return objInvoke == objE ? objE : objInvoke;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super R> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lku/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", f = "ConnectionPoolImpl.kt", l = {159}, m = "invokeSuspend")
    public static final class c<R> extends pt.m implements Function2<p0, nt.b<? super R>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f37171t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Function2<g0, nt.b<? super R>, Object> f37172u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ c0<p> f37173v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<? super g0, ? super nt.b<? super R>, ? extends Object> function2, c0<p> c0Var, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f37172u = function2;
            this.f37173v = c0Var;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(this.f37172u, this.f37173v, bVar);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to z4.h$c<R> for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // pt.a
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = ot.c.e()
                int r1 = r3.f37171t
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jt.o.b(r4)
                return r4
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                jt.o.b(r4)
                kotlin.jvm.functions.Function2<x4.g0, nt.b<? super R>, java.lang.Object> r4 = r3.f37172u
                kotlin.jvm.internal.c0<z4.p> r1 = r3.f37173v
                T r1 = r1.f22552a
                r3.f37171t = r2
                java.lang.Object r4 = r4.invoke(r1, r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: z4.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super R> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public h(@NotNull final f5.c driver, @NotNull final String fileName, int i10) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.connectionElementKey = new z4.b();
        this.connectionThreadLocal = new ThreadLocal<>();
        kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
        this.timeout = kotlin.time.b.p(30, ju.b.SECONDS);
        this.onTimeout = 2;
        this.driver = driver;
        o oVar = new o(1, new Function0() { // from class: z4.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.e(driver, fileName);
            }
        }, i10);
        this.readers = oVar;
        this.writers = oVar;
    }

    public static final f5.b e(f5.c cVar, String str) {
        return cVar.a(str);
    }

    public static final f5.b f(f5.c cVar, String str) {
        f5.b bVarA = cVar.a(str);
        f5.a.a(bVarA, "PRAGMA query_only = 1");
        return bVarA;
    }

    public static final f5.b g(f5.c cVar, String str) {
        return cVar.a(str);
    }

    public static final Unit l(h hVar, boolean z10) {
        hVar.j(z10);
        return Unit.f22483a;
    }

    @Override // z4.c, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.readers.c();
        this.writers.c();
    }

    public final CoroutineContext h(p connection) {
        return new z4.a(this.connectionElementKey, connection).plus(y4.d.a(this.connectionThreadLocal, connection));
    }

    public final void j(boolean isReadOnly) {
        String str = isReadOnly ? "reader" : "writer";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Timed out attempting to acquire a " + str + " connection.");
        sb2.append('\n');
        sb2.append('\n');
        sb2.append("Writer pool:");
        sb2.append('\n');
        this.writers.d(sb2);
        sb2.append("Reader pool:");
        sb2.append('\n');
        this.readers.d(sb2);
        try {
            f5.a.b(5, sb2.toString());
            throw new jt.d();
        } catch (SQLException e10) {
            int i10 = this.onTimeout;
            if (i10 == 1) {
                throw e10;
            }
            if (i10 != 2) {
                return;
            }
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0130  */
    /* JADX WARN: Code duplicated, block: B:71:0x013c A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #2 {all -> 0x0176, blocks: (B:64:0x0121, B:69:0x0131, B:71:0x013c, B:81:0x017a, B:82:0x0181), top: B:101:0x0121 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x015c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0164  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x017a A[Catch: all -> 0x0176, TRY_ENTER, TryCatch #2 {all -> 0x0176, blocks: (B:64:0x0121, B:69:0x0131, B:71:0x013c, B:81:0x017a, B:82:0x0181), top: B:101:0x0121 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, z4.p] */
    @Override // z4.c
    @Nullable
    public <R> Object n3(boolean z10, @NotNull Function2<? super g0, ? super nt.b<? super R>, ? extends Object> function2, @NotNull nt.b<? super R> bVar) {
        a aVar;
        c0 c0Var;
        Throwable th2;
        o oVar;
        CoroutineContext context;
        Function2<? super g0, ? super nt.b<? super R>, ? extends Object> function3;
        z4.b bVar2;
        o oVar2;
        c0 c0Var2;
        T t8;
        c0 c0Var3;
        p pVar;
        final boolean z11 = z10;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.C = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object objG = aVar.A;
        Object objE = ot.c.e();
        int i11 = aVar.C;
        boolean z12 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                jt.o.b(objG);
                return objG;
            }
            if (i11 == 2) {
                jt.o.b(objG);
                return objG;
            }
            if (i11 == 3) {
                z11 = aVar.f37161t;
                bVar2 = (z4.b) aVar.f37167z;
                c0 c0Var4 = (c0) aVar.f37166y;
                CoroutineContext coroutineContext = (CoroutineContext) aVar.f37165x;
                c0 c0Var5 = (c0) aVar.f37164w;
                oVar2 = (o) aVar.f37163v;
                function3 = (Function2) aVar.f37162u;
                try {
                    jt.o.b(objG);
                    c0Var2 = c0Var4;
                    c0Var = c0Var5;
                    context = coroutineContext;
                    try {
                        j jVarC = ((j) objG).c(context);
                        if (this.readers != this.writers || !z11) {
                            z12 = false;
                        }
                        c0Var2.f22552a = new p(bVar2, jVarC, z12);
                        t8 = c0Var.f22552a;
                        if (t8 != 0) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        CoroutineContext coroutineContextH = h((p) t8);
                        c cVar = new c(function3, c0Var, null);
                        aVar.f37162u = oVar2;
                        aVar.f37163v = c0Var;
                        aVar.f37164w = null;
                        aVar.f37165x = null;
                        aVar.f37166y = null;
                        aVar.f37167z = null;
                        aVar.C = 4;
                        objG = ku.i.g(coroutineContextH, cVar, aVar);
                        if (objG != objE) {
                            c0Var3 = c0Var;
                            oVar = oVar2;
                        }
                        return objE;
                    } catch (Throwable th3) {
                        th2 = th3;
                        oVar = oVar2;
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    c0Var = c0Var5;
                    oVar = oVar2;
                    throw th2;
                }
            }
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var3 = (c0) aVar.f37163v;
            oVar = (o) aVar.f37162u;
            try {
                jt.o.b(objG);
            } catch (Throwable th5) {
                c0Var = c0Var3;
                th2 = th5;
            }
            pVar = (p) c0Var3.f22552a;
            if (pVar != null) {
                pVar.n();
                pVar.getDelegate().g();
                oVar.e(pVar.getDelegate());
            }
            return objG;
        }
        jt.o.b(objG);
        if (this.isClosed) {
            f5.a.b(21, "Connection pool is closed");
            throw new jt.d();
        }
        p connectionWrapper = this.connectionThreadLocal.get();
        if (connectionWrapper == null) {
            z4.a aVar2 = (z4.a) aVar.getContext().get(this.connectionElementKey);
            connectionWrapper = aVar2 != null ? aVar2.getConnectionWrapper() : null;
        }
        if (connectionWrapper == null) {
            o oVar3 = z11 ? this.readers : this.writers;
            c0Var = new c0();
            try {
                context = aVar.getContext();
                z4.b bVar3 = this.connectionElementKey;
                long j10 = this.timeout;
                Function0<Unit> function0 = new Function0() { // from class: z4.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h.l(this.f37152a, z11);
                    }
                };
                aVar.f37162u = function2;
                aVar.f37163v = oVar3;
                aVar.f37164w = c0Var;
                aVar.f37165x = context;
                aVar.f37166y = c0Var;
                aVar.f37167z = bVar3;
                aVar.f37161t = z11;
                aVar.C = 3;
                Object objB = oVar3.b(j10, function0, aVar);
                if (objB != objE) {
                    function3 = function2;
                    bVar2 = bVar3;
                    oVar2 = oVar3;
                    objG = objB;
                    c0Var2 = c0Var;
                    j jVarC2 = ((j) objG).c(context);
                    if (this.readers != this.writers) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    c0Var2.f22552a = new p(bVar2, jVarC2, z12);
                    t8 = c0Var.f22552a;
                    if (t8 != 0) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    CoroutineContext coroutineContextH2 = h((p) t8);
                    c cVar2 = new c(function3, c0Var, null);
                    aVar.f37162u = oVar2;
                    aVar.f37163v = c0Var;
                    aVar.f37164w = null;
                    aVar.f37165x = null;
                    aVar.f37166y = null;
                    aVar.f37167z = null;
                    aVar.C = 4;
                    objG = ku.i.g(coroutineContextH2, cVar2, aVar);
                    if (objG != objE) {
                        c0Var3 = c0Var;
                        oVar = oVar2;
                        pVar = (p) c0Var3.f22552a;
                        if (pVar != null) {
                            pVar.n();
                            pVar.getDelegate().g();
                            oVar.e(pVar.getDelegate());
                        }
                        return objG;
                    }
                }
            } catch (Throwable th6) {
                th2 = th6;
                oVar = oVar3;
            }
        } else {
            if (!z11 && connectionWrapper.getIsReadOnly()) {
                f5.a.b(1, "Cannot upgrade connection from reader to writer");
                throw new jt.d();
            }
            if (aVar.getContext().get(this.connectionElementKey) == null) {
                CoroutineContext coroutineContextH3 = h(connectionWrapper);
                b bVar4 = new b(function2, connectionWrapper, null);
                aVar.C = 1;
                Object objG2 = ku.i.g(coroutineContextH3, bVar4, aVar);
                if (objG2 != objE) {
                    return objG2;
                }
            } else {
                aVar.C = 2;
                Object objInvoke = function2.invoke(connectionWrapper, aVar);
                if (objInvoke != objE) {
                    return objInvoke;
                }
            }
        }
        return objE;
        try {
            throw th2;
        } catch (Throwable th7) {
            try {
                p pVar2 = (p) c0Var.f22552a;
                if (pVar2 == null) {
                    throw th7;
                }
                pVar2.n();
                pVar2.getDelegate().g();
                oVar.e(pVar2.getDelegate());
                throw th7;
            } catch (Throwable th8) {
                jt.a.a(th2, th8);
                throw th7;
            }
        }
    }

    public h(@NotNull final f5.c driver, @NotNull final String fileName, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.connectionElementKey = new z4.b();
        this.connectionThreadLocal = new ThreadLocal<>();
        kotlin.time.a.Companion companion = kotlin.time.a.INSTANCE;
        this.timeout = kotlin.time.b.p(30, ju.b.SECONDS);
        this.onTimeout = 2;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        if (i11 > 0) {
            this.driver = driver;
            this.readers = new o(i10, new Function0() { // from class: z4.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.f(driver, fileName);
                }
            }, i12);
            this.writers = new o(i11, new Function0() { // from class: z4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h.g(driver, fileName);
                }
            }, i12);
            return;
        }
        throw new IllegalArgumentException("Maximum number of writers must be greater than 0");
    }
}
