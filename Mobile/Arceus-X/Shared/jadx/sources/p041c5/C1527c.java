package p041c5;

import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.room.C1075c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C7721e;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7745l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119f5.InterfaceC5359b;
import p229jt.C7348o;
import p256ku.C7872i;
import p256ku.InterfaceC7906p0;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p477ut.C11958c;
import p535x4.AbstractC12682u;
import p535x4.C12655c0;
import p535x4.C12683v;
import p535x4.InterfaceC12661f0;
import p535x4.InterfaceC12663g0;
import p594z4.C13718r;
import p594z4.InterfaceC13717q;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: c5.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001aB\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0087@¢\u0006\u0004\b\t\u0010\n\u001aA\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a<\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006H\u0087@¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"R", "Lx4/u;", "db", "", "isReadOnly", "inTransaction", "Lkotlin/Function1;", "Lf5/b;", "block", "d", "(Lx4/u;ZZLkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "b", "(Lx4/u;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lnt/b;", "", "c", "(Lx4/u;Lkotlin/jvm/functions/Function1;Lnt/b;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "a", "(Lx4/u;ZLnt/b;)Ljava/lang/Object;", "Ljava/io/File;", "databaseFile", "", "e", "(Ljava/io/File;)I", "room-runtime"}, m31666k = 5, m31667mv = {2, 1, 0}, m31669xi = 48, m31670xs = "androidx/room/util/DBUtil")
public final /* synthetic */ class C1527c {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: c5.c$a */
    @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m31665d2 = {"R", "Lku/p0;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", m39664f = "DBUtil.android.kt", m39665l = {72}, m39666m = "invokeSuspend")
    public static final class a<R> extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super R>, Object> {

        /* JADX INFO: renamed from: t */
        public int f6122t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ CoroutineContext f6123u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ AbstractC12682u f6124v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ boolean f6125w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ boolean f6126x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ Function1<InterfaceC5359b, R> f6127y;

        /* JADX INFO: renamed from: c5.c$a$a, reason: collision with other inner class name */
        @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m31665d2 = {"R", "Lku/p0;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1", m39664f = "DBUtil.android.kt", m39665l = {260}, m39666m = "invokeSuspend")
        public static final class C14098a extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super R>, Object> {

            /* JADX INFO: renamed from: t */
            public int f6128t;

            /* JADX INFO: renamed from: u */
            public final /* synthetic */ AbstractC12682u f6129u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ boolean f6130v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ boolean f6131w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ Function1<InterfaceC5359b, R> f6132x;

            /* JADX INFO: renamed from: c5.c$a$a$a, reason: collision with other inner class name */
            @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m31665d2 = {"R", "Lx4/g0;", "transactor", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
            @InterfaceC10344f(m39663c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1", m39664f = "DBUtil.android.kt", m39665l = {56, 57, 59, 60}, m39666m = "invokeSuspend")
            public static final class C14099a extends AbstractC10351m implements Function2<InterfaceC12663g0, InterfaceC9557b<? super R>, Object> {

                /* JADX INFO: renamed from: t */
                public Object f6133t;

                /* JADX INFO: renamed from: u */
                public int f6134u;

                /* JADX INFO: renamed from: v */
                public /* synthetic */ Object f6135v;

                /* JADX INFO: renamed from: w */
                public final /* synthetic */ boolean f6136w;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ boolean f6137x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ AbstractC12682u f6138y;

                /* JADX INFO: renamed from: z */
                public final /* synthetic */ Function1 f6139z;

                /* JADX INFO: renamed from: c5.c$a$a$a$a, reason: collision with other inner class name */
                @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, m31665d2 = {"R", "Lx4/f0;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
                @InterfaceC10344f(m39663c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1$1", m39664f = "DBUtil.android.kt", m39665l = {}, m39666m = "invokeSuspend")
                public static final class C14100a extends AbstractC10351m implements Function2<InterfaceC12661f0<R>, InterfaceC9557b<? super R>, Object> {

                    /* JADX INFO: renamed from: t */
                    public int f6140t;

                    /* JADX INFO: renamed from: u */
                    public /* synthetic */ Object f6141u;

                    /* JADX INFO: renamed from: v */
                    public final /* synthetic */ Function1 f6142v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C14100a(InterfaceC9557b interfaceC9557b, Function1 function1) {
                        super(2, interfaceC9557b);
                        this.f6142v = function1;
                    }

                    @Override // pt.AbstractC10339a
                    public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                        C14100a c14100a = new C14100a(interfaceC9557b, this.f6142v);
                        c14100a.f6141u = obj;
                        return c14100a;
                    }

                    @Override // pt.AbstractC10339a
                    public final Object invokeSuspend(Object obj) {
                        C10047c.m38805e();
                        if (this.f6140t != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                        InterfaceC12661f0 interfaceC12661f0 = (InterfaceC12661f0) this.f6141u;
                        Intrinsics.m31981d(interfaceC12661f0, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                        return this.f6142v.invoke(((InterfaceC13717q) interfaceC12661f0).getDelegate());
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(InterfaceC12661f0<R> interfaceC12661f0, InterfaceC9557b<? super R> interfaceC9557b) {
                        return ((C14100a) create(interfaceC12661f0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14099a(boolean z10, boolean z11, AbstractC12682u abstractC12682u, InterfaceC9557b interfaceC9557b, Function1 function1) {
                    super(2, interfaceC9557b);
                    this.f6136w = z10;
                    this.f6137x = z11;
                    this.f6138y = abstractC12682u;
                    this.f6139z = function1;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                    C14099a c14099a = new C14099a(this.f6136w, this.f6137x, this.f6138y, interfaceC9557b, this.f6139z);
                    c14099a.f6135v = obj;
                    return c14099a;
                }

                /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[PHI: r1 r8
                  0x00a2: PHI (r1v11 x4.g0) = (r1v8 x4.g0), (r1v18 x4.g0) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
                  0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
                /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
                /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
                /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[RETURN] */
                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    InterfaceC12663g0.a aVar;
                    InterfaceC12663g0 interfaceC12663g0;
                    InterfaceC12663g0 interfaceC12663g1;
                    InterfaceC12663g0.a aVar2;
                    InterfaceC12663g0 interfaceC12663g2;
                    Object objMo47174b;
                    Object obj2;
                    Object objM38805e = C10047c.m38805e();
                    int i10 = this.f6134u;
                    if (i10 == 0) {
                        C7348o.m30470b(obj);
                        InterfaceC12663g0 interfaceC12663g3 = (InterfaceC12663g0) this.f6135v;
                        if (!this.f6136w) {
                            Intrinsics.m31981d(interfaceC12663g3, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                            return this.f6139z.invoke(((InterfaceC13717q) interfaceC12663g3).getDelegate());
                        }
                        boolean z10 = this.f6137x;
                        aVar = z10 ? InterfaceC12663g0.a.DEFERRED : InterfaceC12663g0.a.IMMEDIATE;
                        if (z10) {
                            interfaceC12663g0 = interfaceC12663g3;
                            C14100a c14100a = new C14100a(null, this.f6139z);
                            this.f6135v = interfaceC12663g0;
                            this.f6133t = null;
                            this.f6134u = 3;
                            obj = interfaceC12663g0.mo47175c(aVar, c14100a, this);
                            if (obj != objM38805e) {
                                if (this.f6137x) {
                                    return obj;
                                }
                                this.f6135v = obj;
                                this.f6134u = 4;
                                objMo47174b = interfaceC12663g0.mo47174b(this);
                                if (objMo47174b != objM38805e) {
                                    obj2 = obj;
                                    obj = objMo47174b;
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.f6138y.m47279t().m6122u();
                                    }
                                    return obj2;
                                }
                            }
                        } else {
                            this.f6135v = interfaceC12663g3;
                            this.f6133t = aVar;
                            this.f6134u = 1;
                            Object objMo47174b2 = interfaceC12663g3.mo47174b(this);
                            if (objMo47174b2 != objM38805e) {
                                interfaceC12663g1 = interfaceC12663g3;
                                obj = objMo47174b2;
                                aVar2 = aVar;
                            }
                        }
                        return objM38805e;
                    }
                    if (i10 == 1) {
                        aVar2 = (InterfaceC12663g0.a) this.f6133t;
                        interfaceC12663g1 = (InterfaceC12663g0) this.f6135v;
                        C7348o.m30470b(obj);
                    } else {
                        if (i10 == 2) {
                            aVar2 = (InterfaceC12663g0.a) this.f6133t;
                            interfaceC12663g2 = (InterfaceC12663g0) this.f6135v;
                            C7348o.m30470b(obj);
                            aVar = aVar2;
                            interfaceC12663g0 = interfaceC12663g2;
                            C14100a c14100a2 = new C14100a(null, this.f6139z);
                            this.f6135v = interfaceC12663g0;
                            this.f6133t = null;
                            this.f6134u = 3;
                            obj = interfaceC12663g0.mo47175c(aVar, c14100a2, this);
                            if (obj != objM38805e) {
                                if (this.f6137x) {
                                    return obj;
                                }
                                this.f6135v = obj;
                                this.f6134u = 4;
                                objMo47174b = interfaceC12663g0.mo47174b(this);
                                if (objMo47174b != objM38805e) {
                                    obj2 = obj;
                                    obj = objMo47174b;
                                }
                            }
                            return objM38805e;
                        }
                        if (i10 == 3) {
                            interfaceC12663g0 = (InterfaceC12663g0) this.f6135v;
                            C7348o.m30470b(obj);
                            if (this.f6137x) {
                                return obj;
                            }
                            this.f6135v = obj;
                            this.f6134u = 4;
                            objMo47174b = interfaceC12663g0.mo47174b(this);
                            if (objMo47174b != objM38805e) {
                                obj2 = obj;
                                obj = objMo47174b;
                            }
                            return objM38805e;
                        }
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f6135v;
                        C7348o.m30470b(obj);
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        this.f6138y.m47279t().m6122u();
                    }
                    return obj2;
                    if (((Boolean) obj).booleanValue()) {
                        aVar = aVar2;
                        interfaceC12663g0 = interfaceC12663g1;
                        C14100a c14100a3 = new C14100a(null, this.f6139z);
                        this.f6135v = interfaceC12663g0;
                        this.f6133t = null;
                        this.f6134u = 3;
                        obj = interfaceC12663g0.mo47175c(aVar, c14100a3, this);
                        if (obj != objM38805e) {
                            if (this.f6137x) {
                                return obj;
                            }
                            this.f6135v = obj;
                            this.f6134u = 4;
                            objMo47174b = interfaceC12663g0.mo47174b(this);
                            if (objMo47174b != objM38805e) {
                                obj2 = obj;
                                obj = objMo47174b;
                                if (!((Boolean) obj).booleanValue()) {
                                    this.f6138y.m47279t().m6122u();
                                }
                                return obj2;
                            }
                        }
                    } else {
                        C1075c c1075cM47279t = this.f6138y.m47279t();
                        this.f6135v = interfaceC12663g1;
                        this.f6133t = aVar2;
                        this.f6134u = 2;
                        if (c1075cM47279t.m6109A(this) != objM38805e) {
                            interfaceC12663g2 = interfaceC12663g1;
                            aVar = aVar2;
                            interfaceC12663g0 = interfaceC12663g2;
                            C14100a c14100a4 = new C14100a(null, this.f6139z);
                            this.f6135v = interfaceC12663g0;
                            this.f6133t = null;
                            this.f6134u = 3;
                            obj = interfaceC12663g0.mo47175c(aVar, c14100a4, this);
                            if (obj != objM38805e) {
                                if (this.f6137x) {
                                    return obj;
                                }
                                this.f6135v = obj;
                                this.f6134u = 4;
                                objMo47174b = interfaceC12663g0.mo47174b(this);
                                if (objMo47174b != objM38805e) {
                                    obj2 = obj;
                                    obj = objMo47174b;
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.f6138y.m47279t().m6122u();
                                    }
                                    return obj2;
                                }
                            }
                        }
                    }
                    return objM38805e;
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC12663g0 interfaceC12663g0, InterfaceC9557b<? super R> interfaceC9557b) {
                    return ((C14099a) create(interfaceC12663g0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super f5.b, ? extends R> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C14098a(AbstractC12682u abstractC12682u, boolean z10, boolean z11, Function1<? super InterfaceC5359b, ? extends R> function1, InterfaceC9557b<? super C14098a> interfaceC9557b) {
                super(2, interfaceC9557b);
                this.f6129u = abstractC12682u;
                this.f6130v = z10;
                this.f6131w = z11;
                this.f6132x = function1;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                return new C14098a(this.f6129u, this.f6130v, this.f6131w, this.f6132x, interfaceC9557b);
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f6128t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                boolean z10 = !(this.f6129u.m47254F() && this.f6129u.m47255G()) && this.f6130v;
                AbstractC12682u abstractC12682u = this.f6129u;
                boolean z11 = this.f6131w;
                C14099a c14099a = new C14099a(z10, z11, abstractC12682u, null, this.f6132x);
                this.f6128t = 1;
                Object objM47268W = abstractC12682u.m47268W(z11, c14099a, this);
                return objM47268W == objM38805e ? objM38805e : objM47268W;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super R> interfaceC9557b) {
                return ((C14098a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super f5.b, ? extends R> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(CoroutineContext coroutineContext, AbstractC12682u abstractC12682u, boolean z10, boolean z11, Function1<? super InterfaceC5359b, ? extends R> function1, InterfaceC9557b<? super a> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f6123u = coroutineContext;
            this.f6124v = abstractC12682u;
            this.f6125w = z10;
            this.f6126x = z11;
            this.f6127y = function1;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new a(this.f6123u, this.f6124v, this.f6125w, this.f6126x, this.f6127y, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f6122t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            CoroutineContext coroutineContext = this.f6123u;
            C14098a c14098a = new C14098a(this.f6124v, this.f6125w, this.f6126x, this.f6127y, null);
            this.f6122t = 1;
            Object objM32684g = C7872i.m32684g(coroutineContext, c14098a, this);
            return objM32684g == objM38805e ? objM38805e : objM32684g;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super R> interfaceC9557b) {
            return ((a) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: c5.c$b */
    @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m31665d2 = {"R", "Lku/p0;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", m39664f = "DBUtil.android.kt", m39665l = {261}, m39666m = "invokeSuspend")
    public static final class b<R> extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super R>, Object> {

        /* JADX INFO: renamed from: t */
        public int f6143t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC12682u f6144u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Function1 f6145v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC9557b interfaceC9557b, AbstractC12682u abstractC12682u, Function1 function1) {
            super(2, interfaceC9557b);
            this.f6144u = abstractC12682u;
            this.f6145v = function1;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new b(interfaceC9557b, this.f6144u, this.f6145v);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f6143t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            AbstractC12682u abstractC12682u = this.f6144u;
            e eVar = new e(true, false, abstractC12682u, null, this.f6145v);
            this.f6143t = 1;
            Object objM47268W = abstractC12682u.m47268W(false, eVar, this);
            return objM47268W == objM38805e ? objM38805e : objM47268W;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super R> interfaceC9557b) {
            return ((b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: c5.c$c */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.room.util.DBUtil__DBUtil_androidKt", m39664f = "DBUtil.android.kt", m39665l = {97, 262, 264, 264}, m39666m = "performInTransactionSuspending")
    public static final class c<R> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f6146t;

        /* JADX INFO: renamed from: u */
        public Object f6147u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f6148v;

        /* JADX INFO: renamed from: w */
        public int f6149w;

        public c(InterfaceC9557b<? super c> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f6148v = obj;
            this.f6149w |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C1525a.m8066d(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: c5.c$d */
    @Metadata(m31664d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n"}, m31665d2 = {"<anonymous>", "R"}, m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2", m39664f = "DBUtil.android.kt", m39665l = {260}, m39666m = "invokeSuspend")
    public static final class d<R> extends AbstractC10351m implements Function1<InterfaceC9557b<? super R>, Object> {

        /* JADX INFO: renamed from: t */
        public int f6150t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC12682u f6151u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Function1<InterfaceC9557b<? super R>, Object> f6152v;

        /* JADX INFO: renamed from: c5.c$d$a */
        @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m31665d2 = {"R", "Lx4/g0;", "transactor", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1", m39664f = "DBUtil.android.kt", m39665l = {56, 57, 59, 60, 172}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC12663g0, InterfaceC9557b<? super R>, Object> {

            /* JADX INFO: renamed from: t */
            public Object f6153t;

            /* JADX INFO: renamed from: u */
            public int f6154u;

            /* JADX INFO: renamed from: v */
            public /* synthetic */ Object f6155v;

            /* JADX INFO: renamed from: w */
            public final /* synthetic */ boolean f6156w;

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ boolean f6157x;

            /* JADX INFO: renamed from: y */
            public final /* synthetic */ AbstractC12682u f6158y;

            /* JADX INFO: renamed from: z */
            public final /* synthetic */ Function1 f6159z;

            /* JADX INFO: renamed from: c5.c$d$a$a, reason: collision with other inner class name */
            @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, m31665d2 = {"R", "Lx4/f0;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
            @InterfaceC10344f(m39663c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1", m39664f = "DBUtil.android.kt", m39665l = {60}, m39666m = "invokeSuspend")
            public static final class C14101a extends AbstractC10351m implements Function2<InterfaceC12661f0<R>, InterfaceC9557b<? super R>, Object> {

                /* JADX INFO: renamed from: t */
                public int f6160t;

                /* JADX INFO: renamed from: u */
                public /* synthetic */ Object f6161u;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ Function1 f6162v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14101a(InterfaceC9557b interfaceC9557b, Function1 function1) {
                    super(2, interfaceC9557b);
                    this.f6162v = function1;
                }

                @Override // pt.AbstractC10339a
                public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                    C14101a c14101a = new C14101a(interfaceC9557b, this.f6162v);
                    c14101a.f6161u = obj;
                    return c14101a;
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    Object objM38805e = C10047c.m38805e();
                    int i10 = this.f6160t;
                    if (i10 != 0) {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                        return obj;
                    }
                    C7348o.m30470b(obj);
                    Function1 function1 = this.f6162v;
                    this.f6160t = 1;
                    C7745l.m32061c(6);
                    Object objInvoke = function1.invoke(this);
                    C7745l.m32061c(7);
                    return objInvoke == objM38805e ? objM38805e : objInvoke;
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC12661f0<R> interfaceC12661f0, InterfaceC9557b<? super R> interfaceC9557b) {
                    return ((C14101a) create(interfaceC12661f0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z10, boolean z11, AbstractC12682u abstractC12682u, InterfaceC9557b interfaceC9557b, Function1 function1) {
                super(2, interfaceC9557b);
                this.f6156w = z10;
                this.f6157x = z11;
                this.f6158y = abstractC12682u;
                this.f6159z = function1;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                a aVar = new a(this.f6156w, this.f6157x, this.f6158y, interfaceC9557b, this.f6159z);
                aVar.f6155v = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:38:0x00a8 A[PHI: r1 r9
              0x00a8: PHI (r1v12 x4.g0) = (r1v9 x4.g0), (r1v19 x4.g0) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
              0x00a8: PHI (r9v14 java.lang.Object) = (r9v13 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
            /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
            /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
            /* JADX WARN: Code duplicated, block: B:48:0x00cb A[RETURN] */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
            
                if (r9.m6109A(r8) == r0) goto L51;
             */
            @Override // pt.AbstractC10339a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                InterfaceC12663g0.a aVar;
                InterfaceC12663g0 interfaceC12663g0;
                InterfaceC12663g0 interfaceC12663g1;
                InterfaceC12663g0.a aVar2;
                Object objMo47174b;
                Object obj2;
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f6154u;
                if (i10 == 0) {
                    C7348o.m30470b(obj);
                    InterfaceC12663g0 interfaceC12663g2 = (InterfaceC12663g0) this.f6155v;
                    if (this.f6156w) {
                        boolean z10 = this.f6157x;
                        aVar = z10 ? InterfaceC12663g0.a.DEFERRED : InterfaceC12663g0.a.IMMEDIATE;
                        if (z10) {
                            interfaceC12663g0 = interfaceC12663g2;
                            C14101a c14101a = new C14101a(null, this.f6159z);
                            this.f6155v = interfaceC12663g0;
                            this.f6153t = null;
                            this.f6154u = 3;
                            obj = interfaceC12663g0.mo47175c(aVar, c14101a, this);
                            if (obj != objM38805e) {
                                if (!this.f6157x) {
                                    return obj;
                                }
                                this.f6155v = obj;
                                this.f6154u = 4;
                                objMo47174b = interfaceC12663g0.mo47174b(this);
                                if (objMo47174b != objM38805e) {
                                    obj2 = obj;
                                    obj = objMo47174b;
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.f6158y.m47279t().m6122u();
                                    }
                                    return obj2;
                                }
                            }
                        } else {
                            this.f6155v = interfaceC12663g2;
                            this.f6153t = aVar;
                            this.f6154u = 1;
                            Object objMo47174b2 = interfaceC12663g2.mo47174b(this);
                            if (objMo47174b2 != objM38805e) {
                                InterfaceC12663g0.a aVar3 = aVar;
                                interfaceC12663g1 = interfaceC12663g2;
                                obj = objMo47174b2;
                                aVar2 = aVar3;
                            }
                        }
                    } else {
                        Function1 function1 = this.f6159z;
                        this.f6154u = 5;
                        C7745l.m32061c(6);
                        Object objInvoke = function1.invoke(this);
                        C7745l.m32061c(7);
                        if (objInvoke != objM38805e) {
                            return objInvoke;
                        }
                    }
                    return objM38805e;
                }
                if (i10 == 1) {
                    aVar2 = (InterfaceC12663g0.a) this.f6153t;
                    interfaceC12663g1 = (InterfaceC12663g0) this.f6155v;
                    C7348o.m30470b(obj);
                } else {
                    if (i10 == 2) {
                        aVar2 = (InterfaceC12663g0.a) this.f6153t;
                        interfaceC12663g1 = (InterfaceC12663g0) this.f6155v;
                        C7348o.m30470b(obj);
                        InterfaceC12663g0 interfaceC12663g3 = interfaceC12663g1;
                        aVar = aVar2;
                        interfaceC12663g0 = interfaceC12663g3;
                        C14101a c14101a2 = new C14101a(null, this.f6159z);
                        this.f6155v = interfaceC12663g0;
                        this.f6153t = null;
                        this.f6154u = 3;
                        obj = interfaceC12663g0.mo47175c(aVar, c14101a2, this);
                        if (obj != objM38805e) {
                            if (!this.f6157x) {
                                return obj;
                            }
                            this.f6155v = obj;
                            this.f6154u = 4;
                            objMo47174b = interfaceC12663g0.mo47174b(this);
                            if (objMo47174b != objM38805e) {
                                obj2 = obj;
                                obj = objMo47174b;
                            }
                        }
                        return objM38805e;
                    }
                    if (i10 == 3) {
                        interfaceC12663g0 = (InterfaceC12663g0) this.f6155v;
                        C7348o.m30470b(obj);
                        if (!this.f6157x) {
                            return obj;
                        }
                        this.f6155v = obj;
                        this.f6154u = 4;
                        objMo47174b = interfaceC12663g0.mo47174b(this);
                        if (objMo47174b != objM38805e) {
                            obj2 = obj;
                            obj = objMo47174b;
                        }
                        return objM38805e;
                    }
                    if (i10 != 4) {
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7348o.m30470b(obj);
                        return obj;
                    }
                    obj2 = this.f6155v;
                    C7348o.m30470b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    this.f6158y.m47279t().m6122u();
                }
                return obj2;
                if (!((Boolean) obj).booleanValue()) {
                    C1075c c1075cM47279t = this.f6158y.m47279t();
                    this.f6155v = interfaceC12663g1;
                    this.f6153t = aVar2;
                    this.f6154u = 2;
                }
                InterfaceC12663g0 interfaceC12663g4 = interfaceC12663g1;
                aVar = aVar2;
                interfaceC12663g0 = interfaceC12663g4;
                C14101a c14101a3 = new C14101a(null, this.f6159z);
                this.f6155v = interfaceC12663g0;
                this.f6153t = null;
                this.f6154u = 3;
                obj = interfaceC12663g0.mo47175c(aVar, c14101a3, this);
                if (obj != objM38805e) {
                    if (!this.f6157x) {
                        return obj;
                    }
                    this.f6155v = obj;
                    this.f6154u = 4;
                    objMo47174b = interfaceC12663g0.mo47174b(this);
                    if (objMo47174b != objM38805e) {
                        obj2 = obj;
                        obj = objMo47174b;
                        if (!((Boolean) obj).booleanValue()) {
                            this.f6158y.m47279t().m6122u();
                        }
                        return obj2;
                    }
                }
                return objM38805e;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC12663g0 interfaceC12663g0, InterfaceC9557b<? super R> interfaceC9557b) {
                return ((a) create(interfaceC12663g0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super nt.b<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(AbstractC12682u abstractC12682u, Function1<? super InterfaceC9557b<? super R>, ? extends Object> function1, InterfaceC9557b<? super d> interfaceC9557b) {
            super(1, interfaceC9557b);
            this.f6151u = abstractC12682u;
            this.f6152v = function1;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(InterfaceC9557b<?> interfaceC9557b) {
            return new d(this.f6151u, this.f6152v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f6150t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            AbstractC12682u abstractC12682u = this.f6151u;
            a aVar = new a(true, false, abstractC12682u, null, this.f6152v);
            this.f6150t = 1;
            Object objM47268W = abstractC12682u.m47268W(false, aVar, this);
            return objM47268W == objM38805e ? objM38805e : objM47268W;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9557b<? super R> interfaceC9557b) {
            return ((d) create(interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: c5.c$e */
    @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m31665d2 = {"R", "Lx4/g0;", "transactor", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1", m39664f = "DBUtil.android.kt", m39665l = {56, 57, 59, 60, 172}, m39666m = "invokeSuspend")
    public static final class e<R> extends AbstractC10351m implements Function2<InterfaceC12663g0, InterfaceC9557b<? super R>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f6163t;

        /* JADX INFO: renamed from: u */
        public int f6164u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f6165v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ boolean f6166w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ boolean f6167x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ AbstractC12682u f6168y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ Function1 f6169z;

        /* JADX INFO: renamed from: c5.c$e$a */
        @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, m31665d2 = {"R", "Lx4/f0;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1$1", m39664f = "DBUtil.android.kt", m39665l = {60}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC12661f0<R>, InterfaceC9557b<? super R>, Object> {

            /* JADX INFO: renamed from: t */
            public int f6170t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f6171u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ Function1 f6172v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC9557b interfaceC9557b, Function1 function1) {
                super(2, interfaceC9557b);
                this.f6172v = function1;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                a aVar = new a(interfaceC9557b, this.f6172v);
                aVar.f6171u = obj;
                return aVar;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                Object objM38805e = C10047c.m38805e();
                int i10 = this.f6170t;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                C7348o.m30470b(obj);
                Function1 function1 = this.f6172v;
                this.f6170t = 1;
                C7745l.m32061c(6);
                Object objInvoke = function1.invoke(this);
                C7745l.m32061c(7);
                return objInvoke == objM38805e ? objM38805e : objInvoke;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC12661f0<R> interfaceC12661f0, InterfaceC9557b<? super R> interfaceC9557b) {
                return ((a) create(interfaceC12661f0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, boolean z11, AbstractC12682u abstractC12682u, InterfaceC9557b interfaceC9557b, Function1 function1) {
            super(2, interfaceC9557b);
            this.f6166w = z10;
            this.f6167x = z11;
            this.f6168y = abstractC12682u;
            this.f6169z = function1;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            e eVar = new e(this.f6166w, this.f6167x, this.f6168y, interfaceC9557b, this.f6169z);
            eVar.f6165v = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00a8 A[PHI: r1 r9
          0x00a8: PHI (r1v12 x4.g0) = (r1v9 x4.g0), (r1v19 x4.g0) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
          0x00a8: PHI (r9v14 java.lang.Object) = (r9v13 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:46:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:48:0x00cb A[RETURN] */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
        
            if (r9.m6109A(r8) == r0) goto L51;
         */
        @Override // pt.AbstractC10339a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC12663g0.a aVar;
            InterfaceC12663g0 interfaceC12663g0;
            InterfaceC12663g0 interfaceC12663g1;
            InterfaceC12663g0.a aVar2;
            Object objMo47174b;
            Object obj2;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f6164u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC12663g0 interfaceC12663g2 = (InterfaceC12663g0) this.f6165v;
                if (this.f6166w) {
                    boolean z10 = this.f6167x;
                    aVar = z10 ? InterfaceC12663g0.a.DEFERRED : InterfaceC12663g0.a.IMMEDIATE;
                    if (z10) {
                        interfaceC12663g0 = interfaceC12663g2;
                        a aVar3 = new a(null, this.f6169z);
                        this.f6165v = interfaceC12663g0;
                        this.f6163t = null;
                        this.f6164u = 3;
                        obj = interfaceC12663g0.mo47175c(aVar, aVar3, this);
                        if (obj != objM38805e) {
                            if (!this.f6167x) {
                                return obj;
                            }
                            this.f6165v = obj;
                            this.f6164u = 4;
                            objMo47174b = interfaceC12663g0.mo47174b(this);
                            if (objMo47174b != objM38805e) {
                                obj2 = obj;
                                obj = objMo47174b;
                                if (!((Boolean) obj).booleanValue()) {
                                    this.f6168y.m47279t().m6122u();
                                }
                                return obj2;
                            }
                        }
                    } else {
                        this.f6165v = interfaceC12663g2;
                        this.f6163t = aVar;
                        this.f6164u = 1;
                        Object objMo47174b2 = interfaceC12663g2.mo47174b(this);
                        if (objMo47174b2 != objM38805e) {
                            InterfaceC12663g0.a aVar4 = aVar;
                            interfaceC12663g1 = interfaceC12663g2;
                            obj = objMo47174b2;
                            aVar2 = aVar4;
                        }
                    }
                } else {
                    Function1 function1 = this.f6169z;
                    this.f6164u = 5;
                    C7745l.m32061c(6);
                    Object objInvoke = function1.invoke(this);
                    C7745l.m32061c(7);
                    if (objInvoke != objM38805e) {
                        return objInvoke;
                    }
                }
                return objM38805e;
            }
            if (i10 == 1) {
                aVar2 = (InterfaceC12663g0.a) this.f6163t;
                interfaceC12663g1 = (InterfaceC12663g0) this.f6165v;
                C7348o.m30470b(obj);
            } else {
                if (i10 == 2) {
                    aVar2 = (InterfaceC12663g0.a) this.f6163t;
                    interfaceC12663g1 = (InterfaceC12663g0) this.f6165v;
                    C7348o.m30470b(obj);
                    InterfaceC12663g0 interfaceC12663g3 = interfaceC12663g1;
                    aVar = aVar2;
                    interfaceC12663g0 = interfaceC12663g3;
                    a aVar5 = new a(null, this.f6169z);
                    this.f6165v = interfaceC12663g0;
                    this.f6163t = null;
                    this.f6164u = 3;
                    obj = interfaceC12663g0.mo47175c(aVar, aVar5, this);
                    if (obj != objM38805e) {
                        if (!this.f6167x) {
                            return obj;
                        }
                        this.f6165v = obj;
                        this.f6164u = 4;
                        objMo47174b = interfaceC12663g0.mo47174b(this);
                        if (objMo47174b != objM38805e) {
                            obj2 = obj;
                            obj = objMo47174b;
                        }
                    }
                    return objM38805e;
                }
                if (i10 == 3) {
                    interfaceC12663g0 = (InterfaceC12663g0) this.f6165v;
                    C7348o.m30470b(obj);
                    if (!this.f6167x) {
                        return obj;
                    }
                    this.f6165v = obj;
                    this.f6164u = 4;
                    objMo47174b = interfaceC12663g0.mo47174b(this);
                    if (objMo47174b != objM38805e) {
                        obj2 = obj;
                        obj = objMo47174b;
                    }
                    return objM38805e;
                }
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj);
                    return obj;
                }
                obj2 = this.f6165v;
                C7348o.m30470b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                this.f6168y.m47279t().m6122u();
            }
            return obj2;
            if (!((Boolean) obj).booleanValue()) {
                C1075c c1075cM47279t = this.f6168y.m47279t();
                this.f6165v = interfaceC12663g1;
                this.f6163t = aVar2;
                this.f6164u = 2;
            }
            InterfaceC12663g0 interfaceC12663g4 = interfaceC12663g1;
            aVar = aVar2;
            interfaceC12663g0 = interfaceC12663g4;
            a aVar6 = new a(null, this.f6169z);
            this.f6165v = interfaceC12663g0;
            this.f6163t = null;
            this.f6164u = 3;
            obj = interfaceC12663g0.mo47175c(aVar, aVar6, this);
            if (obj != objM38805e) {
                if (!this.f6167x) {
                    return obj;
                }
                this.f6165v = obj;
                this.f6164u = 4;
                objMo47174b = interfaceC12663g0.mo47174b(this);
                if (objMo47174b != objM38805e) {
                    obj2 = obj;
                    obj = objMo47174b;
                    if (!((Boolean) obj).booleanValue()) {
                        this.f6168y.m47279t().m6122u();
                    }
                    return obj2;
                }
            }
            return objM38805e;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC12663g0 interfaceC12663g0, InterfaceC9557b<? super R> interfaceC9557b) {
            return ((e) create(interfaceC12663g0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: c5.c$f */
    @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m31665d2 = {"R", "Lku/p0;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", m39664f = "DBUtil.android.kt", m39665l = {261}, m39666m = "invokeSuspend")
    public static final class f<R> extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super R>, Object> {

        /* JADX INFO: renamed from: t */
        public int f6173t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbstractC12682u f6174u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ boolean f6175v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ boolean f6176w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ Function1 f6177x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC9557b interfaceC9557b, AbstractC12682u abstractC12682u, boolean z10, boolean z11, Function1 function1) {
            super(2, interfaceC9557b);
            this.f6174u = abstractC12682u;
            this.f6175v = z10;
            this.f6176w = z11;
            this.f6177x = function1;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new f(interfaceC9557b, this.f6174u, this.f6175v, this.f6176w, this.f6177x);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f6173t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                return obj;
            }
            C7348o.m30470b(obj);
            AbstractC12682u abstractC12682u = this.f6174u;
            boolean z10 = this.f6175v;
            h hVar = new h(this.f6176w, z10, abstractC12682u, null, this.f6177x);
            this.f6173t = 1;
            Object objM47268W = abstractC12682u.m47268W(z10, hVar, this);
            return objM47268W == objM38805e ? objM38805e : objM47268W;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super R> interfaceC9557b) {
            return ((f) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: c5.c$g */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    @InterfaceC10344f(m39663c = "androidx.room.util.DBUtil__DBUtil_androidKt", m39664f = "DBUtil.android.kt", m39665l = {262, 264, 264}, m39666m = "performSuspending")
    public static final class g<R> extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f6178t;

        /* JADX INFO: renamed from: u */
        public Object f6179u;

        /* JADX INFO: renamed from: v */
        public boolean f6180v;

        /* JADX INFO: renamed from: w */
        public boolean f6181w;

        /* JADX INFO: renamed from: x */
        public /* synthetic */ Object f6182x;

        /* JADX INFO: renamed from: y */
        public int f6183y;

        public g(InterfaceC9557b<? super g> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f6182x = obj;
            this.f6183y |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C1525a.m8067e(null, false, false, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: c5.c$h */
    @Metadata(m31664d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m31665d2 = {"R", "Lx4/g0;", "transactor", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
    @InterfaceC10344f(m39663c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1", m39664f = "DBUtil.android.kt", m39665l = {56, 57, 59, 60}, m39666m = "invokeSuspend")
    public static final class h<R> extends AbstractC10351m implements Function2<InterfaceC12663g0, InterfaceC9557b<? super R>, Object> {

        /* JADX INFO: renamed from: t */
        public Object f6184t;

        /* JADX INFO: renamed from: u */
        public int f6185u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f6186v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ boolean f6187w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ boolean f6188x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ AbstractC12682u f6189y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ Function1 f6190z;

        /* JADX INFO: renamed from: c5.c$h$a */
        @Metadata(m31664d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n"}, m31665d2 = {"R", "Lx4/f0;", "<anonymous>"}, m31666k = 3, m31667mv = {2, 1, 0})
        @InterfaceC10344f(m39663c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1$1", m39664f = "DBUtil.android.kt", m39665l = {}, m39666m = "invokeSuspend")
        public static final class a extends AbstractC10351m implements Function2<InterfaceC12661f0<R>, InterfaceC9557b<? super R>, Object> {

            /* JADX INFO: renamed from: t */
            public int f6191t;

            /* JADX INFO: renamed from: u */
            public /* synthetic */ Object f6192u;

            /* JADX INFO: renamed from: v */
            public final /* synthetic */ Function1 f6193v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC9557b interfaceC9557b, Function1 function1) {
                super(2, interfaceC9557b);
                this.f6193v = function1;
            }

            @Override // pt.AbstractC10339a
            public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
                a aVar = new a(interfaceC9557b, this.f6193v);
                aVar.f6192u = obj;
                return aVar;
            }

            @Override // pt.AbstractC10339a
            public final Object invokeSuspend(Object obj) {
                C10047c.m38805e();
                if (this.f6191t != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(obj);
                InterfaceC12661f0 interfaceC12661f0 = (InterfaceC12661f0) this.f6192u;
                Intrinsics.m31981d(interfaceC12661f0, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return this.f6193v.invoke(((InterfaceC13717q) interfaceC12661f0).getDelegate());
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC12661f0<R> interfaceC12661f0, InterfaceC9557b<? super R> interfaceC9557b) {
                return ((a) create(interfaceC12661f0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z10, boolean z11, AbstractC12682u abstractC12682u, InterfaceC9557b interfaceC9557b, Function1 function1) {
            super(2, interfaceC9557b);
            this.f6187w = z10;
            this.f6188x = z11;
            this.f6189y = abstractC12682u;
            this.f6190z = function1;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            h hVar = new h(this.f6187w, this.f6188x, this.f6189y, interfaceC9557b, this.f6190z);
            hVar.f6186v = obj;
            return hVar;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[PHI: r1 r8
          0x00a2: PHI (r1v11 x4.g0) = (r1v8 x4.g0), (r1v18 x4.g0) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
          0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[RETURN] */
        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            InterfaceC12663g0.a aVar;
            InterfaceC12663g0 interfaceC12663g0;
            InterfaceC12663g0 interfaceC12663g1;
            InterfaceC12663g0.a aVar2;
            InterfaceC12663g0 interfaceC12663g2;
            Object objMo47174b;
            Object obj2;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f6185u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                InterfaceC12663g0 interfaceC12663g3 = (InterfaceC12663g0) this.f6186v;
                if (!this.f6187w) {
                    Intrinsics.m31981d(interfaceC12663g3, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                    return this.f6190z.invoke(((InterfaceC13717q) interfaceC12663g3).getDelegate());
                }
                boolean z10 = this.f6188x;
                aVar = z10 ? InterfaceC12663g0.a.DEFERRED : InterfaceC12663g0.a.IMMEDIATE;
                if (z10) {
                    interfaceC12663g0 = interfaceC12663g3;
                    a aVar3 = new a(null, this.f6190z);
                    this.f6186v = interfaceC12663g0;
                    this.f6184t = null;
                    this.f6185u = 3;
                    obj = interfaceC12663g0.mo47175c(aVar, aVar3, this);
                    if (obj != objM38805e) {
                        if (this.f6188x) {
                            return obj;
                        }
                        this.f6186v = obj;
                        this.f6185u = 4;
                        objMo47174b = interfaceC12663g0.mo47174b(this);
                        if (objMo47174b != objM38805e) {
                            obj2 = obj;
                            obj = objMo47174b;
                            if (!((Boolean) obj).booleanValue()) {
                                this.f6189y.m47279t().m6122u();
                            }
                            return obj2;
                        }
                    }
                } else {
                    this.f6186v = interfaceC12663g3;
                    this.f6184t = aVar;
                    this.f6185u = 1;
                    Object objMo47174b2 = interfaceC12663g3.mo47174b(this);
                    if (objMo47174b2 != objM38805e) {
                        interfaceC12663g1 = interfaceC12663g3;
                        obj = objMo47174b2;
                        aVar2 = aVar;
                    }
                }
                return objM38805e;
            }
            if (i10 == 1) {
                aVar2 = (InterfaceC12663g0.a) this.f6184t;
                interfaceC12663g1 = (InterfaceC12663g0) this.f6186v;
                C7348o.m30470b(obj);
            } else {
                if (i10 == 2) {
                    aVar2 = (InterfaceC12663g0.a) this.f6184t;
                    interfaceC12663g2 = (InterfaceC12663g0) this.f6186v;
                    C7348o.m30470b(obj);
                    aVar = aVar2;
                    interfaceC12663g0 = interfaceC12663g2;
                    a aVar4 = new a(null, this.f6190z);
                    this.f6186v = interfaceC12663g0;
                    this.f6184t = null;
                    this.f6185u = 3;
                    obj = interfaceC12663g0.mo47175c(aVar, aVar4, this);
                    if (obj != objM38805e) {
                        if (this.f6188x) {
                            return obj;
                        }
                        this.f6186v = obj;
                        this.f6185u = 4;
                        objMo47174b = interfaceC12663g0.mo47174b(this);
                        if (objMo47174b != objM38805e) {
                            obj2 = obj;
                            obj = objMo47174b;
                        }
                    }
                    return objM38805e;
                }
                if (i10 == 3) {
                    interfaceC12663g0 = (InterfaceC12663g0) this.f6186v;
                    C7348o.m30470b(obj);
                    if (this.f6188x) {
                        return obj;
                    }
                    this.f6186v = obj;
                    this.f6185u = 4;
                    objMo47174b = interfaceC12663g0.mo47174b(this);
                    if (objMo47174b != objM38805e) {
                        obj2 = obj;
                        obj = objMo47174b;
                    }
                    return objM38805e;
                }
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f6186v;
                C7348o.m30470b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                this.f6189y.m47279t().m6122u();
            }
            return obj2;
            if (((Boolean) obj).booleanValue()) {
                aVar = aVar2;
                interfaceC12663g0 = interfaceC12663g1;
                a aVar5 = new a(null, this.f6190z);
                this.f6186v = interfaceC12663g0;
                this.f6184t = null;
                this.f6185u = 3;
                obj = interfaceC12663g0.mo47175c(aVar, aVar5, this);
                if (obj != objM38805e) {
                    if (this.f6188x) {
                        return obj;
                    }
                    this.f6186v = obj;
                    this.f6185u = 4;
                    objMo47174b = interfaceC12663g0.mo47174b(this);
                    if (objMo47174b != objM38805e) {
                        obj2 = obj;
                        obj = objMo47174b;
                        if (!((Boolean) obj).booleanValue()) {
                            this.f6189y.m47279t().m6122u();
                        }
                        return obj2;
                    }
                }
            } else {
                C1075c c1075cM47279t = this.f6189y.m47279t();
                this.f6186v = interfaceC12663g1;
                this.f6184t = aVar2;
                this.f6185u = 2;
                if (c1075cM47279t.m6109A(this) != objM38805e) {
                    interfaceC12663g2 = interfaceC12663g1;
                    aVar = aVar2;
                    interfaceC12663g0 = interfaceC12663g2;
                    a aVar6 = new a(null, this.f6190z);
                    this.f6186v = interfaceC12663g0;
                    this.f6184t = null;
                    this.f6185u = 3;
                    obj = interfaceC12663g0.mo47175c(aVar, aVar6, this);
                    if (obj != objM38805e) {
                        if (this.f6188x) {
                            return obj;
                        }
                        this.f6186v = obj;
                        this.f6185u = 4;
                        objMo47174b = interfaceC12663g0.mo47174b(this);
                        if (objMo47174b != objM38805e) {
                            obj2 = obj;
                            obj = objMo47174b;
                            if (!((Boolean) obj).booleanValue()) {
                                this.f6189y.m47279t().m6122u();
                            }
                            return obj2;
                        }
                    }
                }
            }
            return objM38805e;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC12663g0 interfaceC12663g0, InterfaceC9557b<? super R> interfaceC9557b) {
            return ((h) create(interfaceC12663g0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static final Object m8070a(@NotNull AbstractC12682u abstractC12682u, boolean z10, @NotNull InterfaceC9557b<? super CoroutineContext> interfaceC9557b) {
        C12655c0 c12655c0 = (C12655c0) interfaceC9557b.getContext().get(C12655c0.INSTANCE);
        CoroutineContext transactionDispatcher = c12655c0 != null ? c12655c0.getTransactionDispatcher() : null;
        if (abstractC12682u.m47254F()) {
            if (transactionDispatcher != null) {
                return abstractC12682u.m47281v().plus(transactionDispatcher);
            }
            return z10 ? abstractC12682u.m47251C() : abstractC12682u.m47281v();
        }
        CoroutineContext coroutineContextM47281v = abstractC12682u.m47281v();
        if (transactionDispatcher == null) {
            transactionDispatcher = C7721e.f29393a;
        }
        return coroutineContextM47281v.plus(transactionDispatcher);
    }

    /* JADX INFO: renamed from: b */
    public static final <R> R m8071b(@NotNull AbstractC12682u db2, boolean z10, boolean z11, @NotNull Function1<? super InterfaceC5359b, ? extends R> block) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(block, "block");
        db2.m47270g();
        db2.m47271h();
        CoroutineContext coroutineContext = db2.m47250B().get();
        if (coroutineContext == null) {
            coroutineContext = C7721e.f29393a;
        }
        return (R) C13718r.m50112a(new a(coroutineContext, db2, z11, z10, block, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final <R> Object m8072c(@NotNull AbstractC12682u abstractC12682u, @NotNull Function1<? super InterfaceC9557b<? super R>, ? extends Object> function1, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        c cVar;
        AbstractC12682u abstractC12682u2;
        Function1<? super InterfaceC9557b<? super R>, ? extends Object> function2;
        if (interfaceC9557b instanceof c) {
            cVar = (c) interfaceC9557b;
            int i10 = cVar.f6149w;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                cVar.f6149w = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                cVar = new c(interfaceC9557b);
            }
        } else {
            cVar = new c(interfaceC9557b);
        }
        c cVar2 = cVar;
        Object objM8064b = cVar2.f6148v;
        Object objM38805e = C10047c.m38805e();
        int i11 = cVar2.f6149w;
        if (i11 == 0) {
            C7348o.m30470b(objM8064b);
            if (abstractC12682u.m47254F()) {
                d dVar = new d(abstractC12682u, function1, null);
                cVar2.f6149w = 1;
                Object objM47312e = C12683v.m47312e(abstractC12682u, dVar, cVar2);
                if (objM47312e != objM38805e) {
                    return objM47312e;
                }
            } else if (abstractC12682u.m47254F() && abstractC12682u.m47261M() && abstractC12682u.m47255G()) {
                e eVar = new e(true, false, abstractC12682u, null, function1);
                cVar2.f6149w = 2;
                Object objM47268W = abstractC12682u.m47268W(false, eVar, cVar2);
                if (objM47268W != objM38805e) {
                    return objM47268W;
                }
            } else {
                cVar2.f6146t = abstractC12682u;
                cVar2.f6147u = function1;
                cVar2.f6149w = 3;
                objM8064b = C1525a.m8064b(abstractC12682u, true, cVar2);
                if (objM8064b != objM38805e) {
                    abstractC12682u2 = abstractC12682u;
                    function2 = function1;
                }
            }
        }
        if (i11 == 1) {
            C7348o.m30470b(objM8064b);
            return objM8064b;
        }
        if (i11 == 2) {
            C7348o.m30470b(objM8064b);
            return objM8064b;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objM8064b);
            return objM8064b;
        }
        function2 = (Function1) cVar2.f6147u;
        abstractC12682u2 = (AbstractC12682u) cVar2.f6146t;
        C7348o.m30470b(objM8064b);
        b bVar = new b(null, abstractC12682u2, function2);
        cVar2.f6146t = null;
        cVar2.f6147u = null;
        cVar2.f6149w = 4;
        Object objM32684g = C7872i.m32684g((CoroutineContext) objM8064b, bVar, cVar2);
        return objM32684g == objM38805e ? objM38805e : objM32684g;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final <R> Object m8073d(@NotNull AbstractC12682u abstractC12682u, boolean z10, boolean z11, @NotNull Function1<? super InterfaceC5359b, ? extends R> function1, @NotNull InterfaceC9557b<? super R> interfaceC9557b) {
        g gVar;
        AbstractC12682u abstractC12682u2;
        boolean z12;
        Function1<? super InterfaceC5359b, ? extends R> function2;
        if (interfaceC9557b instanceof g) {
            gVar = (g) interfaceC9557b;
            int i10 = gVar.f6183y;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                gVar.f6183y = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                gVar = new g(interfaceC9557b);
            }
        } else {
            gVar = new g(interfaceC9557b);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f6182x;
        Object objM38805e = C10047c.m38805e();
        int i11 = gVar2.f6183y;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            if (abstractC12682u.m47254F() && abstractC12682u.m47261M() && abstractC12682u.m47255G()) {
                h hVar = new h(z11, z10, abstractC12682u, null, function1);
                gVar2.f6183y = 1;
                Object objM47268W = abstractC12682u.m47268W(z10, hVar, gVar2);
                if (objM47268W != objM38805e) {
                    return objM47268W;
                }
            } else {
                gVar2.f6178t = abstractC12682u;
                gVar2.f6179u = function1;
                gVar2.f6180v = z10;
                gVar2.f6181w = z11;
                gVar2.f6183y = 2;
                Object objM8064b = C1525a.m8064b(abstractC12682u, z11, gVar2);
                if (objM8064b != objM38805e) {
                    abstractC12682u2 = abstractC12682u;
                    obj = objM8064b;
                    z12 = z11;
                    function2 = function1;
                }
            }
        }
        if (i11 == 1) {
            C7348o.m30470b(obj);
            return obj;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            return obj;
        }
        boolean z13 = gVar2.f6181w;
        z10 = gVar2.f6180v;
        Function1<? super InterfaceC5359b, ? extends R> function3 = (Function1) gVar2.f6179u;
        AbstractC12682u abstractC12682u3 = (AbstractC12682u) gVar2.f6178t;
        C7348o.m30470b(obj);
        z12 = z13;
        function2 = function3;
        abstractC12682u2 = abstractC12682u3;
        f fVar = new f(null, abstractC12682u2, z10, z12, function2);
        gVar2.f6178t = null;
        gVar2.f6179u = null;
        gVar2.f6183y = 3;
        Object objM32684g = C7872i.m32684g((CoroutineContext) obj, fVar, gVar2);
        return objM32684g == objM38805e ? objM38805e : objM32684g;
    }

    /* JADX INFO: renamed from: e */
    public static final int m8074e(@NotNull File databaseFile) {
        Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i10 = byteBufferAllocate.getInt();
            C11958c.m44629a(channel, null);
            return i10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C11958c.m44629a(channel, th2);
                throw th3;
            }
        }
    }
}
