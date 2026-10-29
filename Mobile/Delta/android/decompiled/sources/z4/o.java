package z4;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c0;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\f2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b$\u0010 R\u0018\u0010(\u001a\u00060%j\u0002`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010+R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lz4/o;", "", "", "capacity", "Lkotlin/Function0;", "Lf5/b;", "connectionFactory", "preparedStatementCacheSize", "<init>", "(ILkotlin/jvm/functions/Function0;I)V", "Lkotlin/time/a;", "timeout", "", "onTimeout", "Lz4/j;", "b", "(JLkotlin/jvm/functions/Function0;Lnt/b;)Ljava/lang/Object;", "a", "(Lnt/b;)Ljava/lang/Object;", "connection", "e", "(Lz4/j;)V", "c", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "d", "(Ljava/lang/StringBuilder;)V", "f", "I", "getCapacity", "()I", "Lkotlin/jvm/functions/Function0;", "getConnectionFactory", "()Lkotlin/jvm/functions/Function0;", "getPreparedStatementCacheSize", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "size", "", "Z", "isClosed", "", "g", "[Lz4/j;", "connections", "Luu/h;", "h", "Luu/h;", "connectionPermits", "Lkotlin/collections/i;", "i", "Lkotlin/collections/i;", "availableConnections", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<f5.b> connectionFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int preparedStatementCacheSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReentrantLock lock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isClosed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final j[] connections;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uu.h connectionPermits;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final kotlin.collections.i<j> availableConnections;

    @pt.f(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {253}, m = "acquire")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f37228t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f37230v;

        public a(nt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37228t = obj;
            this.f37230v |= Integer.MIN_VALUE;
            return o.this.a(this);
        }
    }

    @pt.f(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {231}, m = "acquireWithTimeout-KLykuaI")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public long f37231t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f37232u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f37233v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f37234w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f37236y;

        public b(nt.b<? super b> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f37234w = obj;
            this.f37236y |= Integer.MIN_VALUE;
            return o.this.b(0L, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", l = {231}, m = "invokeSuspend")
    public static final class c extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f37237t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f37238u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ c0<j> f37239v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ o f37240w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c0<j> c0Var, o oVar, nt.b<? super c> bVar) {
            super(2, bVar);
            this.f37239v = c0Var;
            this.f37240w = oVar;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new c(this.f37239v, this.f37240w, bVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            c0<j> c0Var;
            T t8;
            Object objE = ot.c.e();
            int i10 = this.f37238u;
            if (i10 == 0) {
                jt.o.b(obj);
                c0<j> c0Var2 = this.f37239v;
                o oVar = this.f37240w;
                this.f37237t = c0Var2;
                this.f37238u = 1;
                Object objA = oVar.a(this);
                if (objA == objE) {
                    return objE;
                }
                c0Var = c0Var2;
                t8 = objA;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var = (c0) this.f37237t;
                jt.o.b(obj);
                t8 = obj;
            }
            c0Var.f22552a = t8;
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(int i10, @NotNull Function0<? extends f5.b> connectionFactory, int i11) {
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.capacity = i10;
        this.connectionFactory = connectionFactory;
        this.preparedStatementCacheSize = i11;
        this.lock = new ReentrantLock();
        this.connections = new j[i10];
        this.connectionPermits = uu.l.b(i10, 0, 2, null);
        this.availableConnections = new kotlin.collections.i<>(i10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull nt.b<? super j> bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f37230v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f37230v = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f37228t;
        Object objE = ot.c.e();
        int i11 = aVar.f37230v;
        if (i11 == 0) {
            jt.o.b(obj);
            uu.h hVar = this.connectionPermits;
            aVar.f37230v = 1;
            if (hVar.b(aVar) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
        }
        try {
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.isClosed) {
                    f5.a.b(21, "Connection pool is closed");
                    throw new jt.d();
                }
                if (this.availableConnections.isEmpty()) {
                    f();
                }
                j jVarRemoveLast = this.availableConnections.removeLast();
                reentrantLock.unlock();
                return jVarRemoveLast;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            this.connectionPermits.a();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f A[Catch: all -> 0x0073, TryCatch #1 {all -> 0x0073, blocks: (B:28:0x006b, B:30:0x006f, B:34:0x0077, B:38:0x007e), top: B:45:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077 A[Catch: all -> 0x0073, TryCatch #1 {all -> 0x0073, blocks: (B:28:0x006b, B:30:0x006f, B:34:0x0077, B:38:0x007e), top: B:45:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x007e A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #1 {all -> 0x0073, blocks: (B:28:0x006b, B:30:0x006f, B:34:0x0077, B:38:0x007e), top: B:45:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005a -> B:24:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object b(long r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r10, @org.jetbrains.annotations.NotNull nt.b<? super z4.j> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof z4.o.b
            if (r0 == 0) goto L13
            r0 = r11
            z4.o$b r0 = (z4.o.b) r0
            int r1 = r0.f37236y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37236y = r1
            goto L18
        L13:
            z4.o$b r0 = new z4.o$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f37234w
            java.lang.Object r1 = ot.c.e()
            int r2 = r0.f37236y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            long r8 = r0.f37231t
            java.lang.Object r10 = r0.f37233v
            kotlin.jvm.internal.c0 r10 = (kotlin.jvm.internal.c0) r10
            java.lang.Object r2 = r0.f37232u
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            jt.o.b(r11)     // Catch: java.lang.Throwable -> L34
            goto L5c
        L34:
            r11 = move-exception
            goto L66
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            jt.o.b(r11)
        L41:
            kotlin.jvm.internal.c0 r11 = new kotlin.jvm.internal.c0
            r11.<init>()
            z4.o$c r2 = new z4.o$c     // Catch: java.lang.Throwable -> L61
            r2.<init>(r11, r7, r4)     // Catch: java.lang.Throwable -> L61
            r0.f37232u = r10     // Catch: java.lang.Throwable -> L61
            r0.f37233v = r11     // Catch: java.lang.Throwable -> L61
            r0.f37231t = r8     // Catch: java.lang.Throwable -> L61
            r0.f37236y = r3     // Catch: java.lang.Throwable -> L61
            java.lang.Object r2 = ku.g3.d(r8, r2, r0)     // Catch: java.lang.Throwable -> L61
            if (r2 != r1) goto L5a
            return r1
        L5a:
            r2 = r10
            r10 = r11
        L5c:
            r11 = r10
            r10 = r2
            r2 = r0
            r0 = r4
            goto L6b
        L61:
            r2 = move-exception
            r6 = r2
            r2 = r10
            r10 = r11
            r11 = r6
        L66:
            r6 = r11
            r11 = r10
            r10 = r2
            r2 = r0
            r0 = r6
        L6b:
            boolean r5 = r0 instanceof ku.e3     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L75
            r10.invoke()     // Catch: java.lang.Throwable -> L73
            goto L7c
        L73:
            r8 = move-exception
            goto L7f
        L75:
            if (r0 != 0) goto L7e
            T r11 = r11.f22552a     // Catch: java.lang.Throwable -> L73
            if (r11 == 0) goto L7c
            return r11
        L7c:
            r0 = r2
            goto L41
        L7e:
            throw r0     // Catch: java.lang.Throwable -> L73
        L7f:
            T r9 = r11.f22552a
            z4.j r9 = (z4.j) r9
            if (r9 == 0) goto L88
            r7.e(r9)
        L88:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.o.b(long, kotlin.jvm.functions.Function0, nt.b):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isClosed = true;
            for (j jVar : this.connections) {
                if (jVar != null) {
                    jVar.close();
                }
            }
            Unit unit = Unit.f22483a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(@NotNull StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List listC = kotlin.collections.o.c();
            int size = this.availableConnections.size();
            for (int i10 = 0; i10 < size; i10++) {
                listC.add(this.availableConnections.get(i10));
            }
            List listA = kotlin.collections.o.a(listC);
            builder.append('\t' + super.toString() + " (");
            builder.append("capacity=" + this.capacity + ", ");
            builder.append("permits=" + this.connectionPermits.c() + ", ");
            builder.append("queue=(size=" + listA.size() + ")[" + CollectionsKt.m0(listA, null, null, null, 0, null, null, 63, null) + ']');
            builder.append(")");
            builder.append('\n');
            j[] jVarArr = this.connections;
            int length = jVarArr.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                j jVar = jVarArr[i12];
                i11++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i11);
                sb2.append("] - ");
                sb2.append(jVar != null ? jVar.toString() : null);
                builder.append(sb2.toString());
                builder.append('\n');
                if (jVar != null) {
                    jVar.b(builder);
                }
            }
            Unit unit = Unit.f22483a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(@NotNull j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.availableConnections.addLast(connection);
            Unit unit = Unit.f22483a;
            reentrantLock.unlock();
            this.connectionPermits.a();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void f() {
        if (this.size >= this.capacity) {
            return;
        }
        j jVar = new j(this.connectionFactory.invoke(), null, this.preparedStatementCacheSize, 2, null);
        j[] jVarArr = this.connections;
        int i10 = this.size;
        this.size = i10 + 1;
        jVarArr[i10] = jVar;
        this.availableConnections.addLast(jVar);
    }
}
