package ul;

import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import dv.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.k0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010JA\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001e2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0019H\u0007¢\u0006\u0004\b!\u0010\u0003J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$R&\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010'R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010*R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lul/d;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "callId", BuildConfig.FLAVOR, "callerUserId", "callerName", "Lul/a;", "j", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lul/a;", "call", "b", "(Lul/a;)Lul/a;", "i", "(Ljava/lang/String;)Lul/a;", "Lkotlin/Function1;", BuildConfig.FLAVOR, "onlyIf", "change", "m", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lul/a;", "f", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lul/a;", BuildConfig.FLAVOR, "d", "(Lul/a;)V", "e", "(Ljava/lang/String;)V", "Ldv/h;", "g", "(Ljava/lang/String;)Ldv/h;", "c", BuildConfig.FLAVOR, "l", "(Ljava/lang/String;)I", "Ldv/c0;", BuildConfig.FLAVOR, "Ldv/c0;", "state", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "lastRecord", "Ldv/h;", "h", "()Ldv/h;", "changes", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f33495a = new d();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final dv.c0<Map<String, ActiveCall>> state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final AtomicInteger lastRecord;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final dv.h<ActiveCall> changes;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002*\u0010\u0004\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lul/a;", "<destruct>", "calls", "<anonymous>", "(Lkotlin/Pair;Ljava/util/Map;)Lkotlin/Pair;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.protocols.calling.ActiveCalls$changes$1", f = "ActiveCalls.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends gu.m implements pu.n<Pair<? extends Map<String, ? extends ActiveCall>, ? extends Map<String, ? extends ActiveCall>>, Map<String, ? extends ActiveCall>, eu.b<? super Pair<? extends Map<String, ? extends ActiveCall>, ? extends Map<String, ? extends ActiveCall>>>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33498t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f33499u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33500v;

        public a(eu.b<? super a> bVar) {
            super(3, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.f33499u;
            Map map = (Map) this.f33500v;
            fu.c.e();
            if (this.f33498t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
            return zt.s.a((Map) pair.b(), map);
        }

        @Override // pu.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Pair<? extends Map<String, ActiveCall>, ? extends Map<String, ActiveCall>> pair, Map<String, ActiveCall> map, eu.b<? super Pair<? extends Map<String, ActiveCall>, ? extends Map<String, ActiveCall>>> bVar) {
            a aVar = new a(bVar);
            aVar.f33499u = pair;
            aVar.f33500v = map;
            return aVar.invokeSuspend(Unit.f21506a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements dv.h<ActiveCall> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dv.h f33501a;
        public final /* synthetic */ String b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.i f33502a;
            public final /* synthetic */ String b;

            /* JADX INFO: renamed from: ul.d$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.roblox.protocols.calling.ActiveCalls$follow$$inlined$map$1$2", f = "ActiveCalls.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit", v = 1)
            public static final class C0679a extends gu.d {
                public int A;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f33503t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f33504u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f33505v;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public Object f33507x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public Object f33508y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public Object f33509z;

                public C0679a(eu.b bVar) {
                    super(bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    this.f33503t = obj;
                    this.f33504u |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(dv.i iVar, String str) {
                this.f33502a = iVar;
                this.b = str;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // dv.i
            public final Object emit(Object obj, eu.b bVar) {
                C0679a c0679a;
                if (bVar instanceof C0679a) {
                    c0679a = (C0679a) bVar;
                    int i10 = c0679a.f33504u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0679a.f33504u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0679a = new C0679a(bVar);
                    }
                } else {
                    c0679a = new C0679a(bVar);
                }
                Object obj2 = c0679a.f33503t;
                Object objE = fu.c.e();
                int i11 = c0679a.f33504u;
                if (i11 == 0) {
                    zt.o.b(obj2);
                    dv.i iVar = this.f33502a;
                    Object obj3 = ((Map) obj).get(this.b);
                    c0679a.f33505v = gu.l.a(obj);
                    c0679a.f33507x = gu.l.a(c0679a);
                    c0679a.f33508y = gu.l.a(obj);
                    c0679a.f33509z = gu.l.a(iVar);
                    c0679a.A = 0;
                    c0679a.f33504u = 1;
                    if (iVar.emit(obj3, c0679a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj2);
                }
                return Unit.f21506a;
            }
        }

        public b(dv.h hVar, String str) {
            this.f33501a = hVar;
            this.b = str;
        }

        @Override // dv.h
        public Object collect(dv.i<? super ActiveCall> iVar, eu.b bVar) {
            Object objCollect = this.f33501a.collect(new a(iVar, this.b), bVar);
            return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldv/i;", "Lul/a;", "call", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;Lul/a;)Z"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.protocols.calling.ActiveCalls$follow$2", f = "ActiveCalls.kt", l = {127}, m = "invokeSuspend", v = 1)
    public static final class c extends gu.m implements pu.n<dv.i<? super ActiveCall>, ActiveCall, eu.b<? super Boolean>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33510t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f33511u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public /* synthetic */ Object f33512v;

        public c(eu.b<? super c> bVar) {
            super(3, bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            dv.i iVar = (dv.i) this.f33511u;
            ActiveCall activeCall = (ActiveCall) this.f33512v;
            Object objE = fu.c.e();
            int i10 = this.f33510t;
            if (i10 == 0) {
                zt.o.b(obj);
                if (activeCall == null || activeCall.m()) {
                    return gu.b.a(false);
                }
                this.f33511u = gu.l.a(iVar);
                this.f33512v = gu.l.a(activeCall);
                this.f33510t = 1;
                if (iVar.emit(activeCall, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return gu.b.a(true);
        }

        @Override // pu.n
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super ActiveCall> iVar, ActiveCall activeCall, eu.b<? super Boolean> bVar) {
            c cVar = new c(bVar);
            cVar.f33511u = iVar;
            cVar.f33512v = activeCall;
            return cVar.invokeSuspend(Unit.f21506a);
        }
    }

    /* JADX INFO: renamed from: ul.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Ldv/i;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.protocols.calling.ActiveCalls$special$$inlined$transform$1", f = "ActiveCalls.kt", l = {36}, m = "invokeSuspend", v = 1)
    public static final class C0680d extends gu.m implements Function2<dv.i<? super ActiveCall>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f33513t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f33514u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ dv.h f33515v;

        /* JADX INFO: renamed from: ul.d$d$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements dv.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.i<ActiveCall> f33516a;

            /* JADX INFO: renamed from: ul.d$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            @gu.f(c = "com.roblox.protocols.calling.ActiveCalls$special$$inlined$transform$1$1", f = "ActiveCalls.kt", l = {44}, m = "emit", v = 1)
            public static final class C0681a extends gu.d {
                public Object A;
                public Object B;
                public Object C;
                public Object D;
                public int E;
                public int F;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f33517t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f33518u;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public Object f33520w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public Object f33521x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public Object f33522y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public Object f33523z;

                public C0681a(eu.b bVar) {
                    super(bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    this.f33517t = obj;
                    this.f33518u |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(dv.i iVar) {
                this.f33516a = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // dv.i
            public final Object emit(T t8, eu.b<? super Unit> bVar) {
                C0681a c0681a;
                Iterator it;
                dv.i<ActiveCall> iVar;
                int i10;
                Map map;
                Map map2;
                eu.b bVar2;
                Object obj;
                if (bVar instanceof C0681a) {
                    c0681a = (C0681a) bVar;
                    int i11 = c0681a.f33518u;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0681a.f33518u = i11 - Integer.MIN_VALUE;
                    } else {
                        c0681a = new C0681a(bVar);
                    }
                } else {
                    c0681a = new C0681a(bVar);
                }
                Object obj2 = c0681a.f33517t;
                Object objE = fu.c.e();
                int i12 = c0681a.f33518u;
                if (i12 == 0) {
                    zt.o.b(obj2);
                    dv.i<ActiveCall> iVar2 = this.f33516a;
                    Pair pair = (Pair) t8;
                    Map map3 = (Map) pair.a();
                    Map map4 = (Map) pair.b();
                    it = map4.values().iterator();
                    iVar = iVar2;
                    i10 = 0;
                    map = map3;
                    map2 = map4;
                    bVar2 = c0681a;
                    obj = t8;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i13 = c0681a.E;
                    Iterator it2 = (Iterator) c0681a.B;
                    map2 = (Map) c0681a.A;
                    Map map5 = (Map) c0681a.f33523z;
                    dv.i<ActiveCall> iVar3 = (dv.i) c0681a.f33522y;
                    eu.b bVar3 = (eu.b) c0681a.f33521x;
                    Object obj3 = c0681a.f33520w;
                    zt.o.b(obj2);
                    it = it2;
                    bVar2 = bVar3;
                    iVar = iVar3;
                    map = map5;
                    i10 = i13;
                    obj = (T) obj3;
                }
                while (it.hasNext()) {
                    ActiveCall activeCall = (ActiveCall) it.next();
                    ActiveCall activeCall2 = (ActiveCall) map.get(activeCall.getCallId());
                    int i14 = (activeCall2 != null && activeCall2.m() && activeCall2.getRecord() == activeCall.getRecord()) ? 1 : 0;
                    if (!Intrinsics.c(activeCall, activeCall2) && i14 == 0) {
                        c0681a.f33520w = gu.l.a(obj);
                        c0681a.f33521x = gu.l.a(bVar2);
                        c0681a.f33522y = iVar;
                        c0681a.f33523z = map;
                        c0681a.A = gu.l.a(map2);
                        c0681a.B = it;
                        c0681a.C = gu.l.a(activeCall);
                        c0681a.D = gu.l.a(activeCall2);
                        c0681a.E = i10;
                        c0681a.F = i14;
                        c0681a.f33518u = 1;
                        if (iVar.emit(activeCall, c0681a) == objE) {
                            return objE;
                        }
                    }
                }
                return Unit.f21506a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0680d(dv.h hVar, eu.b bVar) {
            super(2, bVar);
            this.f33515v = hVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            C0680d c0680d = new C0680d(this.f33515v, bVar);
            c0680d.f33514u = obj;
            return c0680d;
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f33513t;
            if (i10 == 0) {
                zt.o.b(obj);
                dv.i iVar = (dv.i) this.f33514u;
                dv.h hVar = this.f33515v;
                a aVar = new a(iVar);
                this.f33514u = gu.l.a(iVar);
                this.f33513t = 1;
                if (hVar.collect(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(dv.i<? super ActiveCall> iVar, eu.b<? super Unit> bVar) {
            return ((C0680d) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    static {
        dv.c0<Map<String, ActiveCall>> c0VarA = r0.a(k0.j());
        state = c0VarA;
        lastRecord = new AtomicInteger();
        changes = dv.j.w(new C0680d(dv.j.J(c0VarA, zt.s.a(k0.j(), k0.j()), new a(null)), null));
    }

    public static /* synthetic */ ActiveCall k(d dVar, String str, Long l10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            l10 = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return dVar.j(str, l10, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActiveCall n(d dVar, String str, Function1 function1, Function1 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = new Function1() { // from class: ul.c
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(d.o((ActiveCall) obj2));
                }
            };
        }
        return dVar.m(str, function1, function2);
    }

    public static final boolean o(ActiveCall it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    @Nullable
    public final ActiveCall b(@NotNull ActiveCall call) {
        Map<String, ActiveCall> value;
        Map<String, ActiveCall> mapR;
        boolean z10;
        Intrinsics.checkNotNullParameter(call, "call");
        dv.c0<Map<String, ActiveCall>> c0Var = state;
        do {
            value = c0Var.getValue();
            mapR = value;
            ActiveCall activeCall = mapR.get(call.getCallId());
            z10 = activeCall == null || activeCall.m();
            if (z10) {
                mapR = k0.r(mapR, zt.s.a(call.getCallId(), call));
            }
        } while (!c0Var.h(value, mapR));
        if (z10) {
            return call;
        }
        return null;
    }

    public final void c() {
        state.setValue(k0.j());
    }

    public final void d(@NotNull ActiveCall call) {
        Map<String, ActiveCall> value;
        Map<String, ActiveCall> mapN;
        Intrinsics.checkNotNullParameter(call, "call");
        dv.c0<Map<String, ActiveCall>> c0Var = state;
        do {
            value = c0Var.getValue();
            mapN = value;
            ActiveCall activeCall = mapN.get(call.getCallId());
            if (activeCall != null && activeCall.getRecord() == call.getRecord()) {
                mapN = k0.n(mapN, call.getCallId());
            }
        } while (!c0Var.h(value, mapN));
    }

    public final void e(@NotNull String callId) {
        Map<String, ActiveCall> value;
        Map<String, ActiveCall> mapR;
        Intrinsics.checkNotNullParameter(callId, "callId");
        dv.c0<Map<String, ActiveCall>> c0Var = state;
        do {
            value = c0Var.getValue();
            mapR = value;
            ActiveCall activeCall = mapR.get(callId);
            if (activeCall != null && activeCall.m() && activeCall.getCallerAvatar() != null) {
                mapR = k0.r(mapR, zt.s.a(callId, ActiveCall.b(activeCall, null, 0, 0, null, null, null, null, null, null, 383, null)));
            }
        } while (!c0Var.h(value, mapR));
    }

    @Nullable
    public final ActiveCall f(@NotNull String callId, @NotNull Function1<? super ActiveCall, ActiveCall> change) {
        Map<String, ActiveCall> value;
        Map<String, ActiveCall> mapR;
        ActiveCall activeCallInvoke;
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(change, "change");
        dv.c0<Map<String, ActiveCall>> c0Var = state;
        do {
            value = c0Var.getValue();
            mapR = value;
            ActiveCall activeCall = mapR.get(callId);
            if (activeCall == null || activeCall.m()) {
                activeCallInvoke = null;
            } else {
                activeCallInvoke = change.invoke(activeCall);
                if (!activeCallInvoke.m()) {
                    throw new IllegalStateException(("end() must leave " + callId + " MISSED or ENDED").toString());
                }
                mapR = k0.r(k0.n(mapR, callId), zt.s.a(callId, activeCallInvoke));
                Collection<ActiveCall> collectionValues = mapR.values();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    if (((ActiveCall) obj).m()) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() > 32) {
                    mapR = k0.n(mapR, ((ActiveCall) CollectionsKt.d0(arrayList)).getCallId());
                }
            }
        } while (!c0Var.h(value, mapR));
        return activeCallInvoke;
    }

    @NotNull
    public final dv.h<ActiveCall> g(@NotNull String callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        return dv.j.m(dv.j.U(new b(state, callId), new c(null)));
    }

    @NotNull
    public final dv.h<ActiveCall> h() {
        return changes;
    }

    @NotNull
    public final ActiveCall i(@NotNull String callId) {
        String str;
        ActiveCall activeCallK;
        Intrinsics.checkNotNullParameter(callId, "callId");
        dv.c0<Map<String, ActiveCall>> c0Var = state;
        while (true) {
            Map<String, ActiveCall> value = c0Var.getValue();
            Map<String, ActiveCall> mapR = value;
            ActiveCall activeCall = mapR.get(callId);
            if (activeCall == null || activeCall.m()) {
                activeCall = null;
            }
            if (activeCall == null) {
                str = callId;
                activeCallK = k(f33495a, str, null, null, 6, null);
            } else {
                str = callId;
                activeCallK = activeCall;
            }
            if (activeCall == null) {
                mapR = k0.r(mapR, zt.s.a(str, activeCallK));
            }
            if (c0Var.h(value, mapR)) {
                break;
            }
            callId = str;
        }
        if (activeCallK != null) {
            return activeCallK;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @NotNull
    public final ActiveCall j(@NotNull String callId, @Nullable Long callerUserId, @Nullable String callerName) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        return new ActiveCall(callId, l(callId), lastRecord.incrementAndGet(), callerUserId, callerName, null, null, null, null, 480, null);
    }

    public final int l(String callId) {
        return ((callId.hashCode() & Integer.MAX_VALUE) % 1000000000) + 2000;
    }

    @Nullable
    public final ActiveCall m(@NotNull String callId, @NotNull Function1<? super ActiveCall, Boolean> onlyIf, @NotNull Function1<? super ActiveCall, ActiveCall> change) {
        Map<String, ActiveCall> value;
        Map<String, ActiveCall> mapR;
        ActiveCall activeCallInvoke;
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(onlyIf, "onlyIf");
        Intrinsics.checkNotNullParameter(change, "change");
        dv.c0<Map<String, ActiveCall>> c0Var = state;
        do {
            value = c0Var.getValue();
            mapR = value;
            ActiveCall activeCall = mapR.get(callId);
            if (activeCall == null || activeCall.m() || !onlyIf.invoke(activeCall).booleanValue()) {
                activeCallInvoke = null;
            } else {
                activeCallInvoke = change.invoke(activeCall);
                mapR = k0.r(mapR, zt.s.a(callId, activeCallInvoke));
            }
        } while (!c0Var.h(value, mapR));
        return activeCallInvoke;
    }
}
