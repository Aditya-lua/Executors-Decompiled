package p594z4;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7685i;
import kotlin.collections.C7697o;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119f5.C5358a;
import p119f5.InterfaceC5359b;
import p229jt.C7334d;
import p229jt.C7348o;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p478uu.C11981l;
import p478uu.InterfaceC11977h;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: z4.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\f2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b$\u0010 R\u0018\u0010(\u001a\u00060%j\u0002`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010+R\u001c\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, m31665d2 = {"Lz4/o;", "", "", "capacity", "Lkotlin/Function0;", "Lf5/b;", "connectionFactory", "preparedStatementCacheSize", "<init>", "(ILkotlin/jvm/functions/Function0;I)V", "Lkotlin/time/a;", "timeout", "", "onTimeout", "Lz4/j;", "b", "(JLkotlin/jvm/functions/Function0;Lnt/b;)Ljava/lang/Object;", "a", "(Lnt/b;)Ljava/lang/Object;", "connection", "e", "(Lz4/j;)V", "c", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "d", "(Ljava/lang/StringBuilder;)V", "f", "I", "getCapacity", "()I", "Lkotlin/jvm/functions/Function0;", "getConnectionFactory", "()Lkotlin/jvm/functions/Function0;", "getPreparedStatementCacheSize", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "size", "", "Z", "isClosed", "", "g", "[Lz4/j;", "connections", "Luu/h;", "h", "Luu/h;", "connectionPermits", "Lkotlin/collections/i;", "i", "Lkotlin/collections/i;", "availableConnections", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13715o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Function0<InterfaceC5359b> connectionFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int preparedStatementCacheSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ReentrantLock lock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isClosed;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final C13710j[] connections;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11977h connectionPermits;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final C7685i<C13710j> availableConnections;

    /* JADX INFO: renamed from: z4.o$a */
    @InterfaceC10344f(m39663c = "androidx.room.coroutines.Pool", m39664f = "ConnectionPoolImpl.kt", m39665l = {253}, m39666m = "acquire")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f48185t;

        /* JADX INFO: renamed from: v */
        public int f48187v;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48185t = obj;
            this.f48187v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C13715o.this.m50093a(this);
        }
    }

    /* JADX INFO: renamed from: z4.o$b */
    @InterfaceC10344f(m39663c = "androidx.room.coroutines.Pool", m39664f = "ConnectionPoolImpl.kt", m39665l = {231}, m39666m = "acquireWithTimeout-KLykuaI")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class b extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public long f48188t;

        /* JADX INFO: renamed from: u */
        public Object f48189u;

        /* JADX INFO: renamed from: v */
        public Object f48190v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f48191w;

        /* JADX INFO: renamed from: y */
        public int f48193y;

        public b(InterfaceC9557b<? super b> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48191w = obj;
            this.f48193y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C13715o.this.m50094b(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: z4.o$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", m39664f = "ConnectionPoolImpl.kt", m39665l = {231}, m39666m = "invokeSuspend")
    public static final class c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f48194t;

        /* JADX INFO: renamed from: u */
        public int f48195u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C7729c0<C13710j> f48196v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ C13715o f48197w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C7729c0<C13710j> c7729c0, C13715o c13715o, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48196v = c7729c0;
            this.f48197w = c13715o;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f48196v, this.f48197w, interfaceC9557b);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C7729c0<C13710j> c7729c0;
            T t8;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f48195u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C7729c0<C13710j> c7729c1 = this.f48196v;
                C13715o c13715o = this.f48197w;
                this.f48194t = c7729c1;
                this.f48195u = 1;
                Object objM50093a = c13715o.m50093a(this);
                if (objM50093a == objM38805e) {
                    return objM38805e;
                }
                c7729c0 = c7729c1;
                t8 = objM50093a;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c7729c0 = (C7729c0) this.f48194t;
                C7348o.m30470b(obj);
                t8 = obj;
            }
            c7729c0.f29425a = t8;
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends f5.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public C13715o(int i10, @NotNull Function0<? extends InterfaceC5359b> connectionFactory, int i11) {
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.capacity = i10;
        this.connectionFactory = connectionFactory;
        this.preparedStatementCacheSize = i11;
        this.lock = new ReentrantLock();
        this.connections = new C13710j[i10];
        this.connectionPermits = C11981l.m44724b(i10, 0, 2, null);
        this.availableConnections = new C7685i<>(i10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m50093a(@NotNull InterfaceC9557b<? super C13710j> interfaceC9557b) {
        a aVar;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f48187v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f48187v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f48185t;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f48187v;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            InterfaceC11977h interfaceC11977h = this.connectionPermits;
            aVar.f48187v = 1;
            if (interfaceC11977h.m44700b(aVar) == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
        }
        try {
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (this.isClosed) {
                    C5358a.m24694b(21, "Connection pool is closed");
                    throw new C7334d();
                }
                if (this.availableConnections.isEmpty()) {
                    m50098f();
                }
                C13710j c13710jRemoveLast = this.availableConnections.removeLast();
                reentrantLock.unlock();
                return c13710jRemoveLast;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            this.connectionPermits.m44699a();
            throw th3;
        }
    }

    /* JADX DEBUG: Duplicate block (B:27:0x0066) to fix multi-entry loop: BACK_EDGE: B:27:0x0066 -> B:45:0x006b */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: T */
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
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m50094b(long r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r10, @org.jetbrains.annotations.NotNull p315nt.InterfaceC9557b<? super p594z4.C13710j> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof p594z4.C13715o.b
            if (r0 == 0) goto L13
            r0 = r11
            z4.o$b r0 = (p594z4.C13715o.b) r0
            int r1 = r0.f48193y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48193y = r1
            goto L18
        L13:
            z4.o$b r0 = new z4.o$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f48191w
            java.lang.Object r1 = p344ot.C10047c.m38805e()
            int r2 = r0.f48193y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            long r8 = r0.f48188t
            java.lang.Object r10 = r0.f48190v
            kotlin.jvm.internal.c0 r10 = (kotlin.jvm.internal.C7729c0) r10
            java.lang.Object r2 = r0.f48189u
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            p229jt.C7348o.m30470b(r11)     // Catch: java.lang.Throwable -> L34
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
            p229jt.C7348o.m30470b(r11)
        L41:
            kotlin.jvm.internal.c0 r11 = new kotlin.jvm.internal.c0
            r11.<init>()
            z4.o$c r2 = new z4.o$c     // Catch: java.lang.Throwable -> L61
            r2.<init>(r11, r7, r4)     // Catch: java.lang.Throwable -> L61
            r0.f48189u = r10     // Catch: java.lang.Throwable -> L61
            r0.f48190v = r11     // Catch: java.lang.Throwable -> L61
            r0.f48188t = r8     // Catch: java.lang.Throwable -> L61
            r0.f48193y = r3     // Catch: java.lang.Throwable -> L61
            java.lang.Object r2 = p256ku.C7866g3.m32661d(r8, r2, r0)     // Catch: java.lang.Throwable -> L61
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
            boolean r5 = r0 instanceof p256ku.C7856e3     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L75
            r10.invoke()     // Catch: java.lang.Throwable -> L73
            goto L7c
        L73:
            r8 = move-exception
            goto L7f
        L75:
            if (r0 != 0) goto L7e
            T r11 = r11.f29425a     // Catch: java.lang.Throwable -> L73
            if (r11 == 0) goto L7c
            return r11
        L7c:
            r0 = r2
            goto L41
        L7e:
            throw r0     // Catch: java.lang.Throwable -> L73
        L7f:
            T r9 = r11.f29425a
            z4.j r9 = (p594z4.C13710j) r9
            if (r9 == 0) goto L88
            r7.m50097e(r9)
        L88:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p594z4.C13715o.m50094b(long, kotlin.jvm.functions.Function0, nt.b):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public final void m50095c() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isClosed = true;
            for (C13710j c13710j : this.connections) {
                if (c13710j != null) {
                    c13710j.close();
                }
            }
            Unit unit = Unit.f29331a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m50096d(@NotNull StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List listM31877c = C7697o.m31877c();
            int size = this.availableConnections.size();
            for (int i10 = 0; i10 < size; i10++) {
                listM31877c.add(this.availableConnections.get(i10));
            }
            List listM31875a = C7697o.m31875a(listM31877c);
            builder.append('\t' + super.toString() + " (");
            builder.append("capacity=" + this.capacity + ", ");
            builder.append("permits=" + this.connectionPermits.m44701c() + ", ");
            builder.append("queue=(size=" + listM31875a.size() + ")[" + CollectionsKt.m31715m0(listM31875a, null, null, null, 0, null, null, 63, null) + ']');
            builder.append(")");
            builder.append('\n');
            C13710j[] c13710jArr = this.connections;
            int length = c13710jArr.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                C13710j c13710j = c13710jArr[i12];
                i11++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i11);
                sb2.append("] - ");
                sb2.append(c13710j != null ? c13710j.toString() : null);
                builder.append(sb2.toString());
                builder.append('\n');
                if (c13710j != null) {
                    c13710j.m50078b(builder);
                }
            }
            Unit unit = Unit.f29331a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m50097e(@NotNull C13710j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.availableConnections.addLast(connection);
            Unit unit = Unit.f29331a;
            reentrantLock.unlock();
            this.connectionPermits.m44699a();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m50098f() {
        if (this.size >= this.capacity) {
            return;
        }
        C13710j c13710j = new C13710j(this.connectionFactory.invoke(), null, this.preparedStatementCacheSize, 2, null);
        C13710j[] c13710jArr = this.connections;
        int i10 = this.size;
        this.size = i10 + 1;
        c13710jArr[i10] = c13710j;
        this.availableConnections.addLast(c13710j);
    }
}
