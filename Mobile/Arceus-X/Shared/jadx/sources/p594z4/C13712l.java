package p594z4;

import android.database.SQLException;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119f5.C5358a;
import p119f5.InterfaceC5359b;
import p119f5.InterfaceC5361d;
import p229jt.C7328a;
import p229jt.C7345l;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p535x4.InterfaceC12661f0;
import p535x4.InterfaceC12663g0;
import p559xt.C12915a;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: z4.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012BQ\u0012@\u0010\b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003j\b\u0012\u0002\b\u0003\u0018\u0001`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\u0004H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0015\u001a\u00020\u00142(\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJH\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0015\u001a\u00020\u00142(\u0010\u0011\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H\u0082@¢\u0006\u0004\b\u001c\u0010\u0018RQ\u0010\b\u001a<\b\u0001\u0012\u0018\u0012\u0016\b\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003j\b\u0012\u0002\b\u0003\u0018\u0001`\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00060#j\u0002`$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\"¨\u0006+"}, m31665d2 = {"Lz4/l;", "Lx4/g0;", "Lz4/q;", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lnt/b;", "", "Landroidx/room/coroutines/TransactionWrapper;", "transactionWrapper", "Lf5/b;", "delegate", "<init>", "(Lkotlin/jvm/functions/Function2;Lf5/b;)V", "R", "", "sql", "Lf5/d;", "block", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "Lx4/g0$a;", Payload.TYPE, "Lx4/f0;", "c", "(Lx4/g0$a;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;", "", "b", "(Lnt/b;)Ljava/lang/Object;", "g", "Lkotlin/jvm/functions/Function2;", "getTransactionWrapper", "()Lkotlin/jvm/functions/Function2;", "Lf5/b;", "f", "()Lf5/b;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/room/concurrent/AtomicInt;", "Ljava/util/concurrent/atomic/AtomicInteger;", "nestedTransactionCount", "d", "Lx4/g0$a;", "currentTransactionType", "rawConnection", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C13712l implements InterfaceC12663g0, InterfaceC13717q {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Function2<Function1<? super InterfaceC9557b<Object>, ? extends Object>, InterfaceC9557b<Object>, Object> transactionWrapper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5359b delegate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public AtomicInteger nestedTransactionCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public InterfaceC12663g0.a currentTransactionType;

    /* JADX INFO: renamed from: z4.l$a */
    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"Lz4/l$a;", "T", "Lx4/f0;", "Lz4/q;", "<init>", "(Lz4/l;)V", "R", "", "sql", "Lkotlin/Function1;", "Lf5/d;", "block", "a", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "Lf5/b;", "d", "()Lf5/b;", "rawConnection", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public final class a<T> implements InterfaceC12661f0<T>, InterfaceC13717q {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a() {
        }

        @Override // p535x4.InterfaceC12674m
        @Nullable
        /* JADX INFO: renamed from: a */
        public <R> Object mo47227a(@NotNull String str, @NotNull Function1<? super InterfaceC5361d, ? extends R> function1, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
            return C13712l.this.mo47227a(str, function1, interfaceC9557b);
        }

        @Override // p594z4.InterfaceC13717q
        @NotNull
        /* JADX INFO: renamed from: d */
        public InterfaceC5359b getDelegate() {
            return C13712l.this.getDelegate();
        }
    }

    /* JADX INFO: renamed from: z4.l$b */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f48148a;

        static {
            int[] iArr = new int[InterfaceC12663g0.a.values().length];
            try {
                iArr[InterfaceC12663g0.a.DEFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC12663g0.a.IMMEDIATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterfaceC12663g0.a.EXCLUSIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f48148a = iArr;
        }
    }

    /* JADX INFO: renamed from: z4.l$c */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.room.coroutines.PassthroughConnection", m39664f = "PassthroughConnectionPool.kt", m39665l = {127}, m39666m = "transaction")
    public static final class c<R> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public int f48149t;

        /* JADX INFO: renamed from: u */
        public /* synthetic */ Object f48150u;

        /* JADX INFO: renamed from: w */
        public int f48152w;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48150u = obj;
            this.f48152w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C13712l.this.m50087g(null, null, this);
        }
    }

    /* JADX INFO: renamed from: z4.l$d */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.room.coroutines.PassthroughConnection", m39664f = "PassthroughConnectionPool.kt", m39665l = {89, 91}, m39666m = "usePrepared")
    public static final class d<R> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f48153t;

        /* JADX INFO: renamed from: u */
        public Object f48154u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f48155v;

        /* JADX INFO: renamed from: x */
        public int f48157x;

        public d(InterfaceC9557b<? super d> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48155v = obj;
            this.f48157x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C13712l.this.mo47227a(null, null, this);
        }
    }

    /* JADX INFO: renamed from: z4.l$e */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.room.coroutines.PassthroughConnection$usePrepared$2", m39664f = "PassthroughConnectionPool.kt", m39665l = {}, m39666m = "invokeSuspend")
    public static final class e extends AbstractC10351m implements Function1<InterfaceC9557b<? super Object>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48158t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f48160v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Function1<InterfaceC5361d, R> f48161w;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super f5.d, ? extends R> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, Function1<? super InterfaceC5361d, ? extends R> function1, InterfaceC9557b<? super e> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f48160v = str;
            this.f48161w = function1;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C13712l.this.new e(this.f48160v, this.f48161w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) throws Exception {
            C10047c.m38805e();
            if (this.f48158t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            InterfaceC5361d interfaceC5361dMo24696r3 = C13712l.this.m50086f().mo24696r3(this.f48160v);
            try {
                Object objInvoke = this.f48161w.invoke(interfaceC5361dMo24696r3);
                C12915a.m47941a(interfaceC5361dMo24696r3, null);
                return objInvoke;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                    throw th3;
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<Object> interfaceC9557b) {
            return ((e) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: z4.l$f */
    @Metadata(m31664d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m31665d2 = {"<anonymous>", ""}, m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.room.coroutines.PassthroughConnection$withTransaction$2", m39664f = "PassthroughConnectionPool.kt", m39665l = {103}, m39666m = "invokeSuspend")
    public static final class f extends AbstractC10351m implements Function1<InterfaceC9557b<? super Object>, Object> {

        /* JADX INFO: renamed from: t */
        public int f48162t;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ InterfaceC12663g0.a f48164v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ Function2<InterfaceC12661f0<R>, InterfaceC9557b<? super R>, Object> f48165w;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super x4.f0<R>, ? super nt.b<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(InterfaceC12663g0.a aVar, Function2<? super InterfaceC12661f0<R>, ? super InterfaceC9557b<? super R>, ? extends Object> function2, InterfaceC9557b<? super f> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f48164v = aVar;
            this.f48165w = function2;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return C13712l.this.new f(this.f48164v, this.f48165w, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f48162t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            C13712l c13712l = C13712l.this;
            InterfaceC12663g0.a aVar = this.f48164v;
            Function2<InterfaceC12661f0<R>, InterfaceC9557b<? super R>, Object> function2 = this.f48165w;
            this.f48162t = 1;
            Object objM50087g = c13712l.m50087g(aVar, function2, this);
            return objM50087g == objM38805e ? objM38805e : objM50087g;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<Object> interfaceC9557b) {
            return ((f) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function1<? super nt.b<java.lang.Object>, ? extends java.lang.Object>, ? super nt.b<java.lang.Object>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C13712l(@Nullable Function2<? super Function1<? super InterfaceC9557b<Object>, ? extends Object>, ? super InterfaceC9557b<Object>, ? extends Object> function2, @NotNull InterfaceC5359b delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.transactionWrapper = function2;
        this.delegate = delegate;
        this.nestedTransactionCount = new AtomicInteger(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p535x4.InterfaceC12674m
    @Nullable
    /* JADX INFO: renamed from: a */
    public <R> Object mo47227a(@NotNull String str, @NotNull Function1<? super InterfaceC5361d, ? extends R> function1, @NotNull InterfaceC9557b<? super R> interfaceC9557b) throws Exception {
        d dVar;
        Function2<Function1<? super InterfaceC9557b<Object>, ? extends Object>, InterfaceC9557b<Object>, Object> function2;
        if (interfaceC9557b instanceof d) {
            dVar = (d) interfaceC9557b;
            int i10 = dVar.f48157x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                dVar.f48157x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                dVar = new d(interfaceC9557b);
            }
        } else {
            dVar = new d(interfaceC9557b);
        }
        Object objMo47174b = dVar.f48155v;
        Object objM38805e = C10047c.m38805e();
        int i11 = dVar.f48157x;
        if (i11 == 0) {
            C7348o.m30470b(objMo47174b);
            dVar.f48153t = str;
            dVar.f48154u = function1;
            dVar.f48157x = 1;
            objMo47174b = mo47174b(dVar);
            if (objMo47174b != objM38805e) {
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objMo47174b);
            return objMo47174b;
        }
        function1 = (Function1) dVar.f48154u;
        str = (String) dVar.f48153t;
        C7348o.m30470b(objMo47174b);
        if (((Boolean) objMo47174b).booleanValue() && (function2 = this.transactionWrapper) != null) {
            e eVar = new e(str, function1, null);
            dVar.f48153t = null;
            dVar.f48154u = null;
            dVar.f48157x = 2;
            Object objInvoke = function2.invoke(eVar, dVar);
            return objInvoke == objM38805e ? objM38805e : objInvoke;
        }
        InterfaceC5361d interfaceC5361dMo24696r3 = this.delegate.mo24696r3(str);
        try {
            R rInvoke = function1.invoke(interfaceC5361dMo24696r3);
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                throw th3;
            }
        }
    }

    @Override // p535x4.InterfaceC12663g0
    @Nullable
    /* JADX INFO: renamed from: b */
    public Object mo47174b(@NotNull InterfaceC9557b<? super Boolean> interfaceC9557b) {
        return C10340b.m39658a(this.currentTransactionType != null || this.delegate.mo24695D());
    }

    @Override // p535x4.InterfaceC12663g0
    @Nullable
    /* JADX INFO: renamed from: c */
    public <R> Object mo47175c(@NotNull InterfaceC12663g0.a aVar, @NotNull Function2<? super InterfaceC12661f0<R>, ? super InterfaceC9557b<? super R>, ? extends Object> function2, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        Function2<Function1<? super InterfaceC9557b<Object>, ? extends Object>, InterfaceC9557b<Object>, Object> function3 = this.transactionWrapper;
        if (function3 == null) {
            return m50087g(aVar, function2, interfaceC9557b);
        }
        Object objInvoke = function3.invoke(new f(aVar, function2, null), interfaceC9557b);
        C10047c.m38805e();
        return objInvoke;
    }

    @Override // p594z4.InterfaceC13717q
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public InterfaceC5359b getDelegate() {
        return this.delegate;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final InterfaceC5359b m50086f() {
        return this.delegate;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00c6 A[Catch: SQLException -> 0x00c9, TryCatch #0 {SQLException -> 0x00c9, blocks: (B:56:0x00be, B:58:0x00c6, B:61:0x00cb), top: B:67:0x00be }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final <R> Object m50087g(InterfaceC12663g0.a aVar, Function2<? super InterfaceC12661f0<R>, ? super InterfaceC9557b<? super R>, ? extends Object> function2, InterfaceC9557b<? super R> interfaceC9557b) throws Throwable {
        c cVar;
        InterfaceC13703c.a aVar2;
        if (interfaceC9557b instanceof c) {
            cVar = (c) interfaceC9557b;
            int i10 = cVar.f48152w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                cVar.f48152w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                cVar = new c(interfaceC9557b);
            }
        } else {
            cVar = new c(interfaceC9557b);
        }
        Object objInvoke = cVar.f48150u;
        Object objM38805e = C10047c.m38805e();
        int i11 = cVar.f48152w;
        int i12 = 1;
        try {
            if (i11 == 0) {
                C7348o.m30470b(objInvoke);
                int i13 = b.f48148a[aVar.ordinal()];
                if (i13 == 1) {
                    C5358a.m24693a(this.delegate, "BEGIN DEFERRED TRANSACTION");
                } else if (i13 == 2) {
                    C5358a.m24693a(this.delegate, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i13 != 3) {
                        throw new C7345l();
                    }
                    C5358a.m24693a(this.delegate, "BEGIN EXCLUSIVE TRANSACTION");
                }
                if (this.nestedTransactionCount.incrementAndGet() > 0) {
                    this.currentTransactionType = aVar;
                }
                a aVar3 = new a();
                cVar.f48149t = 1;
                cVar.f48152w = 1;
                objInvoke = function2.invoke(aVar3, cVar);
                if (objInvoke == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i12 = cVar.f48149t;
                C7348o.m30470b(objInvoke);
            }
            if (this.nestedTransactionCount.decrementAndGet() == 0) {
                this.currentTransactionType = null;
            }
            if (i12 != 0) {
                C5358a.m24693a(this.delegate, "END TRANSACTION");
                return objInvoke;
            }
            C5358a.m24693a(this.delegate, "ROLLBACK TRANSACTION");
            return objInvoke;
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterfaceC13703c.a) {
                    Object objM50064a = th2.m50064a();
                    if (this.nestedTransactionCount.decrementAndGet() == 0) {
                        this.currentTransactionType = null;
                    }
                    C5358a.m24693a(this.delegate, "ROLLBACK TRANSACTION");
                    return objM50064a;
                }
                try {
                    throw th2;
                } catch (Throwable th3) {
                    aVar2 = th2;
                    th = th3;
                    if (this.nestedTransactionCount.decrementAndGet() == 0) {
                        this.currentTransactionType = null;
                    }
                    C5358a.m24693a(this.delegate, "ROLLBACK TRANSACTION");
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                aVar2 = null;
            }
            try {
                if (this.nestedTransactionCount.decrementAndGet() == 0) {
                    this.currentTransactionType = null;
                }
                C5358a.m24693a(this.delegate, "ROLLBACK TRANSACTION");
                throw th;
            } catch (SQLException e10) {
                if (aVar2 == null) {
                    throw e10;
                }
                C7328a.m30429a(aVar2, e10);
                throw th;
            }
        }
    }
}
