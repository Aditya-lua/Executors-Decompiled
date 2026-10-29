package p594z4;

import android.database.SQLException;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7729c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C7800a;
import kotlin.time.C7801b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119f5.C5358a;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5360c;
import p229jt.C7328a;
import p229jt.C7334d;
import p229jt.C7348o;
import p230ju.EnumC7361b;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p535x4.InterfaceC12663g0;
import p566y4.C13030d;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: z4.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fJB\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u001a0-j\b\u0012\u0004\u0012\u00020\u001a`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010B\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006C"}, m31665d2 = {"Lz4/h;", "Lz4/c;", "Lf5/c;", "driver", "", "fileName", "", "preparedStatementCacheSize", "<init>", "(Lf5/c;Ljava/lang/String;I)V", "maxNumOfReaders", "maxNumOfWriters", "(Lf5/c;Ljava/lang/String;III)V", "R", "", "isReadOnly", "Lkotlin/Function2;", "Lx4/g0;", "Lnt/b;", "", "block", "n3", "(ZLkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "", "close", "()V", "Lz4/p;", "connection", "Lkotlin/coroutines/CoroutineContext;", "h", "(Lz4/p;)Lkotlin/coroutines/CoroutineContext;", "j", "(Z)V", "a", "Lf5/c;", "Lz4/o;", "b", "Lz4/o;", "readers", "c", "writers", "Lz4/b;", "d", "Lz4/b;", "connectionElementKey", "Ljava/lang/ThreadLocal;", "Landroidx/room/concurrent/ThreadLocal;", "e", "Ljava/lang/ThreadLocal;", "connectionThreadLocal", "f", "Z", "isClosed", "Lkotlin/time/a;", "g", "J", "getTimeout-UwyO8pc$room_runtime", "()J", "setTimeout-LRDsOJo$room_runtime", "(J)V", "timeout", "I", "getOnTimeout$room_runtime", "()I", "setOnTimeout$room_runtime", "(I)V", "onTimeout", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13708h implements InterfaceC13703c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5360c driver;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C13715o readers;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C13715o writers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final C13702b connectionElementKey;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final ThreadLocal<C13716p> connectionThreadLocal;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public volatile boolean isClosed;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long timeout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int onTimeout;

    /* JADX INFO: renamed from: z4.h$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.room.coroutines.ConnectionPoolImpl", m39664f = "ConnectionPoolImpl.kt", m39665l = {131, 135, 154, 159}, m39666m = "useConnection")
    public static final class a<R> extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public /* synthetic */ Object f48108A;

        /* JADX INFO: renamed from: C */
        public int f48110C;

        /* JADX INFO: renamed from: t */
        public boolean f48111t;

        /* JADX INFO: renamed from: u */
        public Object f48112u;

        /* JADX INFO: renamed from: v */
        public Object f48113v;

        /* JADX INFO: renamed from: w */
        public Object f48114w;

        /* JADX INFO: renamed from: x */
        public Object f48115x;

        /* JADX INFO: renamed from: y */
        public Object f48116y;

        /* JADX INFO: renamed from: z */
        public Object f48117z;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48108A = obj;
            this.f48110C |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C13708h.this.mo50063n3(false, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: z4.h$b */
    @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m31665d2 = {"R", "Lku/p0;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", m39664f = "ConnectionPoolImpl.kt", m39665l = {132}, m39666m = "invokeSuspend")
    public static final class b<R> extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super R>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48118t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Function2<InterfaceC12663g0, InterfaceC9557b<? super R>, Object> f48119u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C13716p f48120v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super x4.g0, ? super nt.b<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super InterfaceC12663g0, ? super InterfaceC9557b<? super R>, ? extends Object> function2, C13716p c13716p, InterfaceC9557b<? super b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48119u = function2;
            this.f48120v = c13716p;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(this.f48119u, this.f48120v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f48118t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            Function2<InterfaceC12663g0, InterfaceC9557b<? super R>, Object> function2 = this.f48119u;
            C13716p c13716p = this.f48120v;
            this.f48118t = 1;
            Object objInvoke = function2.invoke(c13716p, this);
            return objInvoke == objM38805e ? objM38805e : objInvoke;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super R> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: z4.h$c */
    @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m31665d2 = {"R", "Lku/p0;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", m39664f = "ConnectionPoolImpl.kt", m39665l = {159}, m39666m = "invokeSuspend")
    public static final class c<R> extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super R>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48121t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ Function2<InterfaceC12663g0, InterfaceC9557b<? super R>, Object> f48122u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ C7729c0<C13716p> f48123v;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super x4.g0, ? super nt.b<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function2<? super InterfaceC12663g0, ? super InterfaceC9557b<? super R>, ? extends Object> function2, C7729c0<C13716p> c7729c0, InterfaceC9557b<? super c> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f48122u = function2;
            this.f48123v = c7729c0;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new c(this.f48122u, this.f48123v, interfaceC9557b);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to z4.h$c<R> for r3v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // pt.AbstractC10339a
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r0 = p344ot.C10047c.m38805e()
                int r1 = r3.f48121t
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                p229jt.C7348o.m30470b(r4)
                return r4
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                p229jt.C7348o.m30470b(r4)
                kotlin.jvm.functions.Function2<x4.g0, nt.b<? super R>, java.lang.Object> r4 = r3.f48122u
                kotlin.jvm.internal.c0<z4.p> r1 = r3.f48123v
                T r1 = r1.f29425a
                r3.f48121t = r2
                java.lang.Object r4 = r4.invoke(r1, r3)
                if (r4 != r0) goto L29
                return r0
            L29:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p594z4.C13708h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super R> interfaceC9557b) {
            return ((c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C13708h(@NotNull final InterfaceC5360c driver, @NotNull final String fileName, int i10) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.connectionElementKey = new C13702b();
        this.connectionThreadLocal = new ThreadLocal<>();
        C7800a.Companion companion = C7800a.INSTANCE;
        this.timeout = C7801b.m32371p(30, EnumC7361b.SECONDS);
        this.onTimeout = 2;
        this.driver = driver;
        C13715o c13715o = new C13715o(1, new Function0() { // from class: z4.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C13708h.m50069e(driver, fileName);
            }
        }, i10);
        this.readers = c13715o;
        this.writers = c13715o;
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC5359b m50069e(InterfaceC5360c interfaceC5360c, String str) {
        return interfaceC5360c.mo24697a(str);
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC5359b m50070f(InterfaceC5360c interfaceC5360c, String str) {
        InterfaceC5359b interfaceC5359bMo24697a = interfaceC5360c.mo24697a(str);
        C5358a.m24693a(interfaceC5359bMo24697a, "PRAGMA query_only = 1");
        return interfaceC5359bMo24697a;
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC5359b m50071g(InterfaceC5360c interfaceC5360c, String str) {
        return interfaceC5360c.mo24697a(str);
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m50072l(C13708h c13708h, boolean z10) {
        c13708h.m50074j(z10);
        return Unit.f29331a;
    }

    @Override // p594z4.InterfaceC13703c, java.lang.AutoCloseable
    public void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.readers.m50095c();
        this.writers.m50095c();
    }

    /* JADX INFO: renamed from: h */
    public final CoroutineContext m50073h(C13716p connection) {
        return new C13701a(this.connectionElementKey, connection).plus(C13030d.m48545a(this.connectionThreadLocal, connection));
    }

    /* JADX INFO: renamed from: j */
    public final void m50074j(boolean isReadOnly) {
        String str = isReadOnly ? "reader" : "writer";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Timed out attempting to acquire a " + str + " connection.");
        sb2.append('\n');
        sb2.append('\n');
        sb2.append("Writer pool:");
        sb2.append('\n');
        this.writers.m50096d(sb2);
        sb2.append("Reader pool:");
        sb2.append('\n');
        this.readers.m50096d(sb2);
        try {
            C5358a.m24694b(5, sb2.toString());
            throw new C7334d();
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: T */
    /* JADX WARN: Code duplicated, block: B:68:0x0130  */
    /* JADX WARN: Code duplicated, block: B:71:0x013c A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #2 {all -> 0x0176, blocks: (B:64:0x0121, B:69:0x0131, B:71:0x013c, B:81:0x017a, B:82:0x0181), top: B:101:0x0121 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x015c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0164  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x017a A[Catch: all -> 0x0176, TRY_ENTER, TryCatch #2 {all -> 0x0176, blocks: (B:64:0x0121, B:69:0x0131, B:71:0x013c, B:81:0x017a, B:82:0x0181), top: B:101:0x0121 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, z4.p] */
    @Override // p594z4.InterfaceC13703c
    @Nullable
    /* JADX INFO: renamed from: n3 */
    public <R> Object mo50063n3(boolean z10, @NotNull Function2<? super InterfaceC12663g0, ? super InterfaceC9557b<? super R>, ? extends Object> function2, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        a aVar;
        C7729c0 c7729c0;
        Throwable th2;
        C13715o c13715o;
        CoroutineContext context;
        Function2<? super InterfaceC12663g0, ? super InterfaceC9557b<? super R>, ? extends Object> function3;
        C13702b c13702b;
        C13715o c13715o2;
        C7729c0 c7729c1;
        T t8;
        C7729c0 c7729c2;
        C13716p c13716p;
        final boolean z11 = z10;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f48110C;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f48110C = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object objM32684g = aVar.f48108A;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f48110C;
        boolean z12 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                C7348o.m30470b(objM32684g);
                return objM32684g;
            }
            if (i11 == 2) {
                C7348o.m30470b(objM32684g);
                return objM32684g;
            }
            if (i11 == 3) {
                z11 = aVar.f48111t;
                c13702b = (C13702b) aVar.f48117z;
                C7729c0 c7729c3 = (C7729c0) aVar.f48116y;
                CoroutineContext coroutineContext = (CoroutineContext) aVar.f48115x;
                C7729c0 c7729c4 = (C7729c0) aVar.f48114w;
                c13715o2 = (C13715o) aVar.f48113v;
                function3 = (Function2) aVar.f48112u;
                try {
                    C7348o.m30470b(objM32684g);
                    c7729c1 = c7729c3;
                    c7729c0 = c7729c4;
                    context = coroutineContext;
                    try {
                        C13710j c13710jM50079c = ((C13710j) objM32684g).m50079c(context);
                        if (this.readers != this.writers || !z11) {
                            z12 = false;
                        }
                        c7729c1.f29425a = new C13716p(c13702b, c13710jM50079c, z12);
                        t8 = c7729c0.f29425a;
                        if (t8 != 0) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        CoroutineContext coroutineContextM50073h = m50073h((C13716p) t8);
                        c cVar = new c(function3, c7729c0, null);
                        aVar.f48112u = c13715o2;
                        aVar.f48113v = c7729c0;
                        aVar.f48114w = null;
                        aVar.f48115x = null;
                        aVar.f48116y = null;
                        aVar.f48117z = null;
                        aVar.f48110C = 4;
                        objM32684g = C7872i.m32684g(coroutineContextM50073h, cVar, aVar);
                        if (objM32684g != objM38805e) {
                            c7729c2 = c7729c0;
                            c13715o = c13715o2;
                        }
                        return objM38805e;
                    } catch (Throwable th3) {
                        th2 = th3;
                        c13715o = c13715o2;
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    c7729c0 = c7729c4;
                    c13715o = c13715o2;
                    throw th2;
                }
            }
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7729c2 = (C7729c0) aVar.f48113v;
            c13715o = (C13715o) aVar.f48112u;
            try {
                C7348o.m30470b(objM32684g);
            } catch (Throwable th5) {
                c7729c0 = c7729c2;
                th2 = th5;
            }
            c13716p = (C13716p) c7729c2.f29425a;
            if (c13716p != null) {
                c13716p.m50109n();
                c13716p.getDelegate().m50080g();
                c13715o.m50097e(c13716p.getDelegate());
            }
            return objM32684g;
        }
        C7348o.m30470b(objM32684g);
        if (this.isClosed) {
            C5358a.m24694b(21, "Connection pool is closed");
            throw new C7334d();
        }
        C13716p connectionWrapper = this.connectionThreadLocal.get();
        if (connectionWrapper == null) {
            C13701a c13701a = (C13701a) aVar.getContext().get(this.connectionElementKey);
            connectionWrapper = c13701a != null ? c13701a.getConnectionWrapper() : null;
        }
        if (connectionWrapper == null) {
            C13715o c13715o3 = z11 ? this.readers : this.writers;
            c7729c0 = new C7729c0();
            try {
                context = aVar.getContext();
                C13702b c13702b2 = this.connectionElementKey;
                long j10 = this.timeout;
                Function0<Unit> function0 = new Function0() { // from class: z4.f
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C13708h.m50072l(this.f48096a, z11);
                    }
                };
                aVar.f48112u = function2;
                aVar.f48113v = c13715o3;
                aVar.f48114w = c7729c0;
                aVar.f48115x = context;
                aVar.f48116y = c7729c0;
                aVar.f48117z = c13702b2;
                aVar.f48111t = z11;
                aVar.f48110C = 3;
                Object objM50094b = c13715o3.m50094b(j10, function0, aVar);
                if (objM50094b != objM38805e) {
                    function3 = function2;
                    c13702b = c13702b2;
                    c13715o2 = c13715o3;
                    objM32684g = objM50094b;
                    c7729c1 = c7729c0;
                    C13710j c13710jM50079c2 = ((C13710j) objM32684g).m50079c(context);
                    if (this.readers != this.writers) {
                        z12 = false;
                    } else {
                        z12 = false;
                    }
                    c7729c1.f29425a = new C13716p(c13702b, c13710jM50079c2, z12);
                    t8 = c7729c0.f29425a;
                    if (t8 != 0) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    CoroutineContext coroutineContextM50073h2 = m50073h((C13716p) t8);
                    c cVar2 = new c(function3, c7729c0, null);
                    aVar.f48112u = c13715o2;
                    aVar.f48113v = c7729c0;
                    aVar.f48114w = null;
                    aVar.f48115x = null;
                    aVar.f48116y = null;
                    aVar.f48117z = null;
                    aVar.f48110C = 4;
                    objM32684g = C7872i.m32684g(coroutineContextM50073h2, cVar2, aVar);
                    if (objM32684g != objM38805e) {
                        c7729c2 = c7729c0;
                        c13715o = c13715o2;
                        c13716p = (C13716p) c7729c2.f29425a;
                        if (c13716p != null) {
                            c13716p.m50109n();
                            c13716p.getDelegate().m50080g();
                            c13715o.m50097e(c13716p.getDelegate());
                        }
                        return objM32684g;
                    }
                }
            } catch (Throwable th6) {
                th2 = th6;
                c13715o = c13715o3;
            }
        } else {
            if (!z11 && connectionWrapper.getIsReadOnly()) {
                C5358a.m24694b(1, "Cannot upgrade connection from reader to writer");
                throw new C7334d();
            }
            if (aVar.getContext().get(this.connectionElementKey) == null) {
                CoroutineContext coroutineContextM50073h3 = m50073h(connectionWrapper);
                b bVar = new b(function2, connectionWrapper, null);
                aVar.f48110C = 1;
                Object objM32684g2 = C7872i.m32684g(coroutineContextM50073h3, bVar, aVar);
                if (objM32684g2 != objM38805e) {
                    return objM32684g2;
                }
            } else {
                aVar.f48110C = 2;
                Object objInvoke = function2.invoke(connectionWrapper, aVar);
                if (objInvoke != objM38805e) {
                    return objInvoke;
                }
            }
        }
        return objM38805e;
        try {
            throw th2;
        } catch (Throwable th7) {
            try {
                C13716p c13716p2 = (C13716p) c7729c0.f29425a;
                if (c13716p2 == null) {
                    throw th7;
                }
                c13716p2.m50109n();
                c13716p2.getDelegate().m50080g();
                c13715o.m50097e(c13716p2.getDelegate());
                throw th7;
            } catch (Throwable th8) {
                C7328a.m30429a(th2, th8);
                throw th7;
            }
        }
    }

    public C13708h(@NotNull final InterfaceC5360c driver, @NotNull final String fileName, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.connectionElementKey = new C13702b();
        this.connectionThreadLocal = new ThreadLocal<>();
        C7800a.Companion companion = C7800a.INSTANCE;
        this.timeout = C7801b.m32371p(30, EnumC7361b.SECONDS);
        this.onTimeout = 2;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        if (i11 > 0) {
            this.driver = driver;
            this.readers = new C13715o(i10, new Function0() { // from class: z4.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C13708h.m50070f(driver, fileName);
                }
            }, i12);
            this.writers = new C13715o(i11, new Function0() { // from class: z4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C13708h.m50071g(driver, fileName);
                }
            }, i12);
            return;
        }
        throw new IllegalArgumentException("Maximum number of writers must be greater than 0");
    }
}
