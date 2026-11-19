package gm;

import android.util.Log;
import av.g1;
import av.p0;
import av.w0;
import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lgm/w;", BuildConfig.FLAVOR, "Lgm/b;", "local", "Lgm/v;", "remote", "<init>", "(Lgm/b;Lgm/v;)V", "Ljava/io/Serializable;", "d", "(Leu/b;)Ljava/lang/Object;", BuildConfig.FLAVOR, "c", "a", "Lgm/b;", "b", "Lgm/v;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final gm.b local;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final v remote;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)I"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2", f = "Replicator.kt", l = {RequestError.NO_DEV_KEY, 82}, m = "invokeSuspend", v = 1)
    public static final class b extends gu.m implements Function2<p0, eu.b<? super Integer>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f17810t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f17811u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f17812v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f17813w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f17814x;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lav/p0;", "Lzt/n;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)Lzt/n;"}, k = 3, mv = {2, 2, 0})
        @gu.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$2$1$1", f = "Replicator.kt", l = {54}, m = "invokeSuspend", v = 1)
        public static final class a extends gu.m implements Function2<p0, eu.b<? super zt.n<? extends String>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f17816t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ w f17817u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Achievement f17818v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w wVar, Achievement achievement, eu.b<? super a> bVar) {
                super(2, bVar);
                this.f17817u = wVar;
                this.f17818v = achievement;
            }

            @Override // gu.a
            public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
                return new a(this.f17817u, this.f17818v, bVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(p0 p0Var, eu.b<? super zt.n<String>> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                Object objA;
                Object objB;
                Object objE = fu.c.e();
                int i10 = this.f17816t;
                if (i10 == 0) {
                    zt.o.b(obj);
                    v vVar = this.f17817u.remote;
                    Achievement achievement = this.f17818v;
                    this.f17816t = 1;
                    objA = vVar.a(achievement, this);
                    if (objA == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                    objA = ((zt.n) obj).getValue();
                }
                Achievement achievement2 = this.f17818v;
                if (zt.n.h(objA)) {
                    boolean zBooleanValue = ((Boolean) objA).booleanValue();
                    if (!zBooleanValue) {
                        Log.w("rbx.achievement.replicator", "remote grant of " + achievement2.getCodeName() + " failed");
                    }
                    if (bi.h.a().C()) {
                        t.f17799a.n("remote", achievement2.getCodeName(), zBooleanValue);
                    }
                    String codeName = achievement2.getCodeName();
                    if (!zBooleanValue) {
                        codeName = null;
                    }
                    objB = zt.n.b(codeName);
                } else {
                    objB = zt.n.b(objA);
                }
                Achievement achievement3 = this.f17818v;
                Throwable thE = zt.n.e(objB);
                if (thE != null) {
                    Log.w("rbx.achievement.replicator", "granting " + achievement3.getCodeName() + " failed exceptionally", thE);
                    objB = zt.n.b(null);
                }
                return zt.n.a(objB);
            }

            @Override // p001kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, eu.b<? super zt.n<? extends String>> bVar) {
                return invoke2(p0Var, (eu.b<? super zt.n<String>>) bVar);
            }
        }

        /* JADX INFO: renamed from: gm.w$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0323b implements dv.h<List<? extends Achievement>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.h f17819a;

            /* JADX INFO: renamed from: gm.w$b$b$a */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a<T> implements dv.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ dv.i f17820a;

                /* JADX INFO: renamed from: gm.w$b$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @gu.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$filter$1$2", f = "Replicator.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit", v = 1)
                public static final class C0324a extends gu.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f17821t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f17822u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f17823v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    public Object f17824w;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f17826y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f17827z;

                    public C0324a(eu.b bVar) {
                        super(bVar);
                    }

                    @Override // gu.a
                    public final Object invokeSuspend(Object obj) {
                        this.f17821t = obj;
                        this.f17822u |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(dv.i iVar) {
                    this.f17820a = iVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // dv.i
                public final Object emit(Object obj, eu.b bVar) {
                    C0324a c0324a;
                    if (bVar instanceof C0324a) {
                        c0324a = (C0324a) bVar;
                        int i10 = c0324a.f17822u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0324a.f17822u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0324a = new C0324a(bVar);
                        }
                    } else {
                        c0324a = new C0324a(bVar);
                    }
                    Object obj2 = c0324a.f17821t;
                    Object objE = fu.c.e();
                    int i11 = c0324a.f17822u;
                    if (i11 == 0) {
                        zt.o.b(obj2);
                        dv.i iVar = this.f17820a;
                        if (!((List) obj).isEmpty()) {
                            c0324a.f17823v = gu.l.a(obj);
                            c0324a.f17824w = gu.l.a(c0324a);
                            c0324a.f17826y = gu.l.a(obj);
                            c0324a.f17827z = gu.l.a(iVar);
                            c0324a.A = 0;
                            c0324a.f17822u = 1;
                            if (iVar.emit(obj, c0324a) == objE) {
                                return objE;
                            }
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

            public C0323b(dv.h hVar) {
                this.f17819a = hVar;
            }

            @Override // dv.h
            public Object collect(dv.i<? super List<? extends Achievement>> iVar, eu.b bVar) {
                Object objCollect = this.f17819a.collect(new a(iVar), bVar);
                return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c implements dv.h<List<? extends w0<? extends zt.n<? extends String>>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.h f17828a;
            public final /* synthetic */ p0 b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f17829c;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a<T> implements dv.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ dv.i f17830a;
                public final /* synthetic */ p0 b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w f17831c;

                /* JADX INFO: renamed from: gm.w$b$c$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @gu.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$map$1$2", f = "Replicator.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit", v = 1)
                public static final class C0325a extends gu.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f17832t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f17833u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f17834v;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public Object f17836x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f17837y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f17838z;

                    public C0325a(eu.b bVar) {
                        super(bVar);
                    }

                    @Override // gu.a
                    public final Object invokeSuspend(Object obj) {
                        this.f17832t = obj;
                        this.f17833u |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(dv.i iVar, p0 p0Var, w wVar) {
                    this.f17830a = iVar;
                    this.b = p0Var;
                    this.f17831c = wVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // dv.i
                public final Object emit(Object obj, eu.b bVar) {
                    C0325a c0325a;
                    if (bVar instanceof C0325a) {
                        c0325a = (C0325a) bVar;
                        int i10 = c0325a.f17833u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0325a.f17833u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0325a = new C0325a(bVar);
                        }
                    } else {
                        c0325a = new C0325a(bVar);
                    }
                    Object obj2 = c0325a.f17832t;
                    Object objE = fu.c.e();
                    int i11 = c0325a.f17833u;
                    if (i11 == 0) {
                        zt.o.b(obj2);
                        dv.i iVar = this.f17830a;
                        List list = (List) obj;
                        Log.i("rbx.achievement.replicator", "Syncing " + list + " achievements to remote");
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(av.k.b(this.b, null, null, new a(this.f17831c, (Achievement) it.next(), null), 3, null));
                        }
                        c0325a.f17834v = gu.l.a(obj);
                        c0325a.f17836x = gu.l.a(c0325a);
                        c0325a.f17837y = gu.l.a(obj);
                        c0325a.f17838z = gu.l.a(iVar);
                        c0325a.A = 0;
                        c0325a.f17833u = 1;
                        if (iVar.emit(arrayList, c0325a) == objE) {
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

            public c(dv.h hVar, p0 p0Var, w wVar) {
                this.f17828a = hVar;
                this.b = p0Var;
                this.f17829c = wVar;
            }

            @Override // dv.h
            public Object collect(dv.i<? super List<? extends w0<? extends zt.n<? extends String>>>> iVar, eu.b bVar) {
                Object objCollect = this.f17828a.collect(new a(iVar, this.b, this.f17829c), bVar);
                return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d implements dv.h<zt.n<? extends Unit>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ dv.h f17839a;
            public final /* synthetic */ p0 b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f17840c;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a<T> implements dv.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ dv.i f17841a;
                public final /* synthetic */ p0 b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w f17842c;

                /* JADX INFO: renamed from: gm.w$b$d$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                @gu.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$map$2$2", f = "Replicator.kt", l = {52, 67, RequestError.RESPONSE_CODE_FAILURE}, m = "emit", v = 1)
                public static final class C0326a extends gu.d {
                    public Object A;
                    public Object B;
                    public Object C;
                    public Object D;
                    public Object E;
                    public int F;
                    public int G;
                    public int H;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f17843t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f17844u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f17845v;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public Object f17847x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f17848y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f17849z;

                    public C0326a(eu.b bVar) {
                        super(bVar);
                    }

                    @Override // gu.a
                    public final Object invokeSuspend(Object obj) {
                        this.f17843t = obj;
                        this.f17844u |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(dv.i iVar, p0 p0Var, w wVar) {
                    this.f17841a = iVar;
                    this.b = p0Var;
                    this.f17842c = wVar;
                }

                /* JADX WARN: Code duplicated, block: B:51:0x01c3 A[Catch: all -> 0x006f, TryCatch #3 {all -> 0x006f, blocks: (B:18:0x006a, B:49:0x01b4, B:51:0x01c3, B:52:0x01cb), top: B:71:0x006a }] */
                /* JADX WARN: Code duplicated, block: B:59:0x01eb  */
                /* JADX WARN: Code duplicated, block: B:8:0x0018  */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x0220, code lost:
                
                    if (r4.emit(r0, r6) == r2) goto L62;
                 */
                @Override // dv.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, eu.b bVar) {
                    C0326a c0326a;
                    dv.i iVar;
                    p0 p0Var;
                    int i10;
                    Object obj2;
                    Object obj3;
                    dv.i iVar2;
                    eu.b bVar2;
                    int i11;
                    int i12;
                    dv.i iVar3;
                    dv.i iVar4;
                    eu.b bVar3;
                    List list;
                    Object obj4;
                    eu.b bVar4;
                    Object obj5;
                    Object objB;
                    Throwable thE;
                    if (bVar instanceof C0326a) {
                        c0326a = (C0326a) bVar;
                        int i13 = c0326a.f17844u;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c0326a.f17844u = i13 - Integer.MIN_VALUE;
                        } else {
                            c0326a = new C0326a(bVar);
                        }
                    } else {
                        c0326a = new C0326a(bVar);
                    }
                    C0326a c0326a2 = c0326a;
                    Object objA = c0326a2.f17843t;
                    Object objE = fu.c.e();
                    int i14 = c0326a2.f17844u;
                    try {
                        if (i14 == 0) {
                            zt.o.b(objA);
                            iVar = this.f17841a;
                            List list2 = (List) obj;
                            p0Var = this.b;
                            i10 = 0;
                            try {
                                zt.n.Companion companion = zt.n.INSTANCE;
                                c0326a2.f17845v = gu.l.a(obj);
                                c0326a2.f17847x = gu.l.a(c0326a2);
                                c0326a2.f17848y = gu.l.a(obj);
                                c0326a2.f17849z = gu.l.a(iVar);
                                c0326a2.A = iVar;
                                c0326a2.B = gu.l.a(c0326a2);
                                c0326a2.C = gu.l.a(list2);
                                c0326a2.D = gu.l.a(p0Var);
                                c0326a2.F = 0;
                                c0326a2.G = 0;
                                c0326a2.H = 0;
                                c0326a2.f17844u = 1;
                                objA = av.f.a(list2, c0326a2);
                                if (objA != objE) {
                                    obj2 = obj;
                                    obj3 = obj2;
                                    i11 = 0;
                                    i12 = 0;
                                    iVar3 = iVar;
                                    iVar4 = iVar3;
                                    bVar3 = c0326a2;
                                    list = list2;
                                    bVar2 = bVar3;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj2 = obj;
                                obj3 = obj2;
                                iVar2 = iVar;
                                bVar2 = c0326a2;
                                zt.n.Companion companion2 = zt.n.INSTANCE;
                                objB = zt.n.b(zt.o.a(th));
                                obj4 = obj3;
                                bVar4 = bVar2;
                                obj5 = obj2;
                            }
                            return objE;
                        }
                        if (i14 == 1) {
                            i10 = c0326a2.H;
                            i11 = c0326a2.G;
                            int i15 = c0326a2.F;
                            p0Var = (p0) c0326a2.D;
                            List list3 = (List) c0326a2.C;
                            eu.b bVar5 = (eu.b) c0326a2.B;
                            iVar4 = (dv.i) c0326a2.A;
                            dv.i iVar5 = (dv.i) c0326a2.f17849z;
                            obj3 = c0326a2.f17848y;
                            C0326a c0326a3 = (C0326a) c0326a2.f17847x;
                            obj2 = c0326a2.f17845v;
                            try {
                                zt.o.b(objA);
                                bVar2 = c0326a3;
                                list = list3;
                                i12 = i15;
                                bVar3 = bVar5;
                                iVar3 = iVar5;
                            } catch (Throwable th3) {
                                th = th3;
                                bVar2 = c0326a3;
                                i10 = i15;
                                iVar2 = iVar5;
                                iVar = iVar4;
                                zt.n.Companion companion3 = zt.n.INSTANCE;
                                objB = zt.n.b(zt.o.a(th));
                                obj4 = obj3;
                                bVar4 = bVar2;
                                obj5 = obj2;
                                thE = zt.n.e(objB);
                                if (thE != null) {
                                    Log.w("rbx.achievement.replicator", "Unable to mark achievements synced", thE);
                                }
                                zt.n nVarA = zt.n.a(objB);
                                c0326a2.f17845v = gu.l.a(obj5);
                                c0326a2.f17847x = gu.l.a(bVar4);
                                c0326a2.f17848y = gu.l.a(obj4);
                                c0326a2.f17849z = gu.l.a(iVar2);
                                c0326a2.A = null;
                                c0326a2.B = null;
                                c0326a2.C = null;
                                c0326a2.D = null;
                                c0326a2.E = null;
                                c0326a2.F = i10;
                                c0326a2.f17844u = 3;
                            }
                        } else if (i14 == 2) {
                            i10 = c0326a2.F;
                            iVar = (dv.i) c0326a2.A;
                            iVar2 = (dv.i) c0326a2.f17849z;
                            obj4 = c0326a2.f17848y;
                            bVar4 = (C0326a) c0326a2.f17847x;
                            obj5 = c0326a2.f17845v;
                            try {
                                zt.o.b(objA);
                                Log.i("rbx.achievement.replicator", "All achievements marked.");
                                if (bi.h.a().C()) {
                                    t.f17799a.o("remote", true);
                                }
                                objB = zt.n.b(Unit.f21506a);
                            } catch (Throwable th4) {
                                th = th4;
                                obj3 = obj4;
                                obj2 = obj5;
                                bVar2 = bVar4;
                                zt.n.Companion companion4 = zt.n.INSTANCE;
                                objB = zt.n.b(zt.o.a(th));
                                obj4 = obj3;
                                bVar4 = bVar2;
                                obj5 = obj2;
                            }
                            thE = zt.n.e(objB);
                            if (thE != null) {
                                Log.w("rbx.achievement.replicator", "Unable to mark achievements synced", thE);
                            }
                            zt.n nVarA2 = zt.n.a(objB);
                            c0326a2.f17845v = gu.l.a(obj5);
                            c0326a2.f17847x = gu.l.a(bVar4);
                            c0326a2.f17848y = gu.l.a(obj4);
                            c0326a2.f17849z = gu.l.a(iVar2);
                            c0326a2.A = null;
                            c0326a2.B = null;
                            c0326a2.C = null;
                            c0326a2.D = null;
                            c0326a2.E = null;
                            c0326a2.F = i10;
                            c0326a2.f17844u = 3;
                        } else {
                            if (i14 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            zt.o.b(objA);
                        }
                        return Unit.f21506a;
                        List list4 = list;
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = ((Iterable) objA).iterator();
                        while (it.hasNext()) {
                            Object value = ((zt.n) it.next()).getValue();
                            if (zt.n.g(value)) {
                                value = null;
                            }
                            Iterator<T> it2 = it;
                            String str = (String) value;
                            if (str != null) {
                                arrayList.add(str);
                            }
                            it = it2;
                        }
                        Log.i("rbx.achievement.replicator", "Marking " + arrayList.size() + " achievements synced");
                        gm.b bVar6 = this.f17842c.local;
                        c0326a2.f17845v = gu.l.a(obj2);
                        c0326a2.f17847x = gu.l.a(bVar2);
                        c0326a2.f17848y = gu.l.a(obj3);
                        c0326a2.f17849z = gu.l.a(iVar3);
                        c0326a2.A = iVar4;
                        c0326a2.B = gu.l.a(bVar3);
                        c0326a2.C = gu.l.a(list4);
                        c0326a2.D = gu.l.a(p0Var);
                        c0326a2.E = gu.l.a(arrayList);
                        c0326a2.F = i12;
                        c0326a2.G = i11;
                        c0326a2.H = i10;
                        c0326a2.f17844u = 2;
                        if (gm.b.f(bVar6, arrayList, null, c0326a2, 2, null) != objE) {
                            i10 = i12;
                            obj4 = obj3;
                            bVar4 = bVar2;
                            iVar2 = iVar3;
                            iVar = iVar4;
                            obj5 = obj2;
                            Log.i("rbx.achievement.replicator", "All achievements marked.");
                            if (bi.h.a().C()) {
                                t.f17799a.o("remote", true);
                            }
                            objB = zt.n.b(Unit.f21506a);
                            thE = zt.n.e(objB);
                            if (thE != null) {
                                Log.w("rbx.achievement.replicator", "Unable to mark achievements synced", thE);
                            }
                            zt.n nVarA3 = zt.n.a(objB);
                            c0326a2.f17845v = gu.l.a(obj5);
                            c0326a2.f17847x = gu.l.a(bVar4);
                            c0326a2.f17848y = gu.l.a(obj4);
                            c0326a2.f17849z = gu.l.a(iVar2);
                            c0326a2.A = null;
                            c0326a2.B = null;
                            c0326a2.C = null;
                            c0326a2.D = null;
                            c0326a2.E = null;
                            c0326a2.F = i10;
                            c0326a2.f17844u = 3;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        i10 = i12;
                        iVar2 = iVar3;
                        iVar = iVar4;
                        zt.n.Companion companion5 = zt.n.INSTANCE;
                        objB = zt.n.b(zt.o.a(th));
                        obj4 = obj3;
                        bVar4 = bVar2;
                        obj5 = obj2;
                    }
                    return objE;
                }
            }

            public d(dv.h hVar, p0 p0Var, w wVar) {
                this.f17839a = hVar;
                this.b = p0Var;
                this.f17840c = wVar;
            }

            @Override // dv.h
            public Object collect(dv.i<? super zt.n<? extends Unit>> iVar, eu.b bVar) {
                Object objCollect = this.f17839a.collect(new a(iVar, this.b, this.f17840c), bVar);
                return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
            }
        }

        public b(eu.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            b bVar2 = w.this.new b(bVar);
            bVar2.f17814x = obj;
            return bVar2;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Integer> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00f5, code lost:
        
            if (dv.j.i(r5, r11) == r1) goto L35;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Integer num;
            p0 p0Var = (p0) this.f17814x;
            Object objE = fu.c.e();
            int i10 = this.f17813w;
            if (i10 != 0) {
                if (i10 == 1) {
                    zt.o.b(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return gu.b.c(Log.i("rbx.achievement.replicator", "Finished local to remote achievement sync"));
            }
            zt.o.b(obj);
            Log.i("rbx.achievement.replicator", "Starting local to remote achievement sync");
            gm.b bVar = w.this.local;
            this.f17814x = p0Var;
            this.f17813w = 1;
            obj = bVar.c(this);
            if (obj != objE) {
            }
            return objE;
            List list = (List) obj;
            List list2 = list;
            Iterator it = list2.iterator();
            if (it.hasNext()) {
                Integer numC = gu.b.c(((Achievement) it.next()).getId());
                while (it.hasNext()) {
                    Integer numC2 = gu.b.c(((Achievement) it.next()).getId());
                    if (numC.compareTo(numC2) < 0) {
                        numC = numC2;
                    }
                }
                num = numC;
            } else {
                num = null;
            }
            int iIntValue = num != null ? num.intValue() : 0;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (((Achievement) obj2).getSyncedTs() == null) {
                    arrayList.add(obj2);
                }
            }
            d dVar = new d(new c(new C0323b(dv.j.C(dv.j.x(arrayList), dv.j.k(w.this.local.b(iIntValue)))), p0Var, w.this), p0Var, w.this);
            this.f17814x = gu.l.a(p0Var);
            this.f17810t = gu.l.a(list);
            this.f17811u = gu.l.a(arrayList);
            this.f17812v = iIntValue;
            this.f17813w = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", "Ljava/io/Serializable;", "<anonymous>", "(Lav/p0;)Ljava/io/Serializable;"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.universalapp.achievement.Replicator$syncRemoteToLocal$2", f = "Replicator.kt", l = {25, 31}, m = "invokeSuspend", v = 1)
    public static final class c extends gu.m implements Function2<p0, eu.b<? super Serializable>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f17850t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f17851u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f17852v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f17853w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f17854x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f17855y;

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            c cVar = w.this.new c(bVar);
            cVar.f17855y = obj;
            return cVar;
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Serializable> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
        
            if (r2.d(r7, r6) == r1) goto L22;
         */
        @Override // gu.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objB2;
            p0 p0Var = (p0) this.f17855y;
            Object objE = fu.c.e();
            int i10 = this.f17854x;
            try {
                if (i10 == 0) {
                    zt.o.b(obj);
                    v vVar = w.this.remote;
                    this.f17855y = p0Var;
                    this.f17854x = 1;
                    objB2 = vVar.b(this);
                    if (objB2 != objE) {
                    }
                    return objE;
                }
                if (i10 == 1) {
                    zt.o.b(obj);
                    objB2 = ((zt.n) obj).getValue();
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                objB = zt.n.b(Unit.f21506a);
                Throwable thE = zt.n.e(objB);
                if (thE != null) {
                    Log.w("rbx.achievement.replicator", "Unable to replicate remote achievements locally", thE);
                }
                return zt.n.a(objB);
                w wVar = w.this;
                Throwable thE2 = zt.n.e(objB2);
                if (thE2 != null) {
                    return gu.b.c(Log.w("rbx.achievement.replicator", "Unable to gather remote achievements", thE2));
                }
                List<RemoteAchievement> list = (List) objB2;
                gm.b bVar = wVar.local;
                this.f17855y = gu.l.a(p0Var);
                this.f17850t = gu.l.a(list);
                this.f17851u = gu.l.a(p0Var);
                this.f17852v = 0;
                this.f17853w = 0;
                this.f17854x = 2;
            } catch (Throwable th2) {
                zt.n.Companion companion = zt.n.INSTANCE;
                objB = zt.n.b(zt.o.a(th2));
            }
        }
    }

    public w(@NotNull gm.b local, @NotNull v remote) {
        Intrinsics.checkNotNullParameter(local, "local");
        Intrinsics.checkNotNullParameter(remote, "remote");
        this.local = local;
        this.remote = remote;
    }

    @Nullable
    public final Object c(@NotNull eu.b<? super Integer> bVar) {
        return av.i.g(g1.b(), new b(null), bVar);
    }

    @Nullable
    public final Object d(@NotNull eu.b<? super Serializable> bVar) {
        return av.i.g(g1.b(), new c(null), bVar);
    }
}
