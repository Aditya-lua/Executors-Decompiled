package sl;

import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.p0;
import ku.w0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsl/w;", "", "Lsl/b;", "local", "Lsl/v;", "remote", "<init>", "(Lsl/b;Lsl/v;)V", "Ljava/io/Serializable;", "d", "(Lnt/b;)Ljava/lang/Object;", "", "c", "a", "Lsl/b;", "b", "Lsl/v;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final sl.b local;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final v remote;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)I"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2", f = "Replicator.kt", l = {41, 82}, m = "invokeSuspend", v = 1)
    public static final class b extends pt.m implements Function2<p0, nt.b<? super Integer>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31189t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31190u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f31191v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f31192w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f31193x;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lku/p0;", "Ljt/n;", "", "<anonymous>", "(Lku/p0;)Ljt/n;"}, k = 3, mv = {2, 2, 0})
        @pt.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$2$1$1", f = "Replicator.kt", l = {54}, m = "invokeSuspend", v = 1)
        public static final class a extends pt.m implements Function2<p0, nt.b<? super jt.n<? extends String>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f31195t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ w f31196u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Achievement f31197v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w wVar, Achievement achievement, nt.b<? super a> bVar) {
                super(2, bVar);
                this.f31196u = wVar;
                this.f31197v = achievement;
            }

            @Override // pt.a
            public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
                return new a(this.f31196u, this.f31197v, bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, nt.b<? super jt.n<? extends String>> bVar) {
                return invoke2(p0Var, (nt.b<? super jt.n<String>>) bVar);
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Object objB2;
                Object objE = ot.c.e();
                int i10 = this.f31195t;
                if (i10 == 0) {
                    jt.o.b(obj);
                    v vVar = this.f31196u.remote;
                    Achievement achievement = this.f31197v;
                    this.f31195t = 1;
                    objB = vVar.b(achievement, this);
                    if (objB == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jt.o.b(obj);
                    objB = ((jt.n) obj).getValue();
                }
                Achievement achievement2 = this.f31197v;
                if (jt.n.h(objB)) {
                    boolean zBooleanValue = ((Boolean) objB).booleanValue();
                    if (!zBooleanValue) {
                        Log.w("rbx.achievement.replicator", "remote grant of " + achievement2.getCodeName() + " failed");
                    }
                    if (th.h.a().A()) {
                        t.f31178a.n("remote", achievement2.getCodeName(), zBooleanValue);
                    }
                    String codeName = achievement2.getCodeName();
                    if (!zBooleanValue) {
                        codeName = null;
                    }
                    objB2 = jt.n.b(codeName);
                } else {
                    objB2 = jt.n.b(objB);
                }
                Achievement achievement3 = this.f31197v;
                Throwable thE = jt.n.e(objB2);
                if (thE != null) {
                    Log.w("rbx.achievement.replicator", "granting " + achievement3.getCodeName() + " failed exceptionally", thE);
                    objB2 = jt.n.b(null);
                }
                return jt.n.a(objB2);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(p0 p0Var, nt.b<? super jt.n<String>> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
            }
        }

        /* JADX INFO: renamed from: sl.w$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0545b implements nu.h<List<? extends Achievement>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ nu.h f31198a;

            /* JADX INFO: renamed from: sl.w$b$b$a */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a<T> implements nu.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ nu.i f31199a;

                /* JADX INFO: renamed from: sl.w$b$b$a$a, reason: collision with other inner class name */
                @pt.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$filter$1$2", f = "Replicator.kt", l = {50}, m = "emit", v = 1)
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C0546a extends pt.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f31200t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f31201u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f31202v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    public Object f31203w;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f31205y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f31206z;

                    public C0546a(nt.b bVar) {
                        super(bVar);
                    }

                    @Override // pt.a
                    public final Object invokeSuspend(Object obj) {
                        this.f31200t = obj;
                        this.f31201u |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(nu.i iVar) {
                    this.f31199a = iVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // nu.i
                public final Object emit(Object obj, nt.b bVar) {
                    C0546a c0546a;
                    if (bVar instanceof C0546a) {
                        c0546a = (C0546a) bVar;
                        int i10 = c0546a.f31201u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0546a.f31201u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0546a = new C0546a(bVar);
                        }
                    } else {
                        c0546a = new C0546a(bVar);
                    }
                    Object obj2 = c0546a.f31200t;
                    Object objE = ot.c.e();
                    int i11 = c0546a.f31201u;
                    if (i11 == 0) {
                        jt.o.b(obj2);
                        nu.i iVar = this.f31199a;
                        if (!((List) obj).isEmpty()) {
                            c0546a.f31202v = pt.l.a(obj);
                            c0546a.f31203w = pt.l.a(c0546a);
                            c0546a.f31205y = pt.l.a(obj);
                            c0546a.f31206z = pt.l.a(iVar);
                            c0546a.A = 0;
                            c0546a.f31201u = 1;
                            if (iVar.emit(obj, c0546a) == objE) {
                                return objE;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jt.o.b(obj2);
                    }
                    return Unit.f22483a;
                }
            }

            public C0545b(nu.h hVar) {
                this.f31198a = hVar;
            }

            @Override // nu.h
            public Object collect(nu.i<? super List<? extends Achievement>> iVar, nt.b bVar) {
                Object objCollect = this.f31198a.collect(new a(iVar), bVar);
                return objCollect == ot.c.e() ? objCollect : Unit.f22483a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c implements nu.h<List<? extends w0<? extends jt.n<? extends String>>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ nu.h f31207a;
            public final /* synthetic */ p0 b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f31208c;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a<T> implements nu.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ nu.i f31209a;
                public final /* synthetic */ p0 b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w f31210c;

                /* JADX INFO: renamed from: sl.w$b$c$a$a, reason: collision with other inner class name */
                @pt.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$map$1$2", f = "Replicator.kt", l = {50}, m = "emit", v = 1)
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C0547a extends pt.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f31211t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f31212u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f31213v;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public Object f31215x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f31216y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f31217z;

                    public C0547a(nt.b bVar) {
                        super(bVar);
                    }

                    @Override // pt.a
                    public final Object invokeSuspend(Object obj) {
                        this.f31211t = obj;
                        this.f31212u |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(nu.i iVar, p0 p0Var, w wVar) {
                    this.f31209a = iVar;
                    this.b = p0Var;
                    this.f31210c = wVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // nu.i
                public final Object emit(Object obj, nt.b bVar) {
                    C0547a c0547a;
                    if (bVar instanceof C0547a) {
                        c0547a = (C0547a) bVar;
                        int i10 = c0547a.f31212u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0547a.f31212u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0547a = new C0547a(bVar);
                        }
                    } else {
                        c0547a = new C0547a(bVar);
                    }
                    Object obj2 = c0547a.f31211t;
                    Object objE = ot.c.e();
                    int i11 = c0547a.f31212u;
                    if (i11 == 0) {
                        jt.o.b(obj2);
                        nu.i iVar = this.f31209a;
                        List list = (List) obj;
                        Log.i("rbx.achievement.replicator", "Syncing " + list + " achievements to remote");
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(ku.k.b(this.b, null, null, new a(this.f31210c, (Achievement) it.next(), null), 3, null));
                        }
                        c0547a.f31213v = pt.l.a(obj);
                        c0547a.f31215x = pt.l.a(c0547a);
                        c0547a.f31216y = pt.l.a(obj);
                        c0547a.f31217z = pt.l.a(iVar);
                        c0547a.A = 0;
                        c0547a.f31212u = 1;
                        if (iVar.emit(arrayList, c0547a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jt.o.b(obj2);
                    }
                    return Unit.f22483a;
                }
            }

            public c(nu.h hVar, p0 p0Var, w wVar) {
                this.f31207a = hVar;
                this.b = p0Var;
                this.f31208c = wVar;
            }

            @Override // nu.h
            public Object collect(nu.i<? super List<? extends w0<? extends jt.n<? extends String>>>> iVar, nt.b bVar) {
                Object objCollect = this.f31207a.collect(new a(iVar, this.b, this.f31208c), bVar);
                return objCollect == ot.c.e() ? objCollect : Unit.f22483a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d implements nu.h<jt.n<? extends Unit>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ nu.h f31218a;
            public final /* synthetic */ p0 b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f31219c;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a<T> implements nu.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ nu.i f31220a;
                public final /* synthetic */ p0 b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w f31221c;

                /* JADX INFO: renamed from: sl.w$b$d$a$a, reason: collision with other inner class name */
                @pt.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$map$2$2", f = "Replicator.kt", l = {52, 67, 50}, m = "emit", v = 1)
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C0548a extends pt.d {
                    public Object A;
                    public Object B;
                    public Object C;
                    public Object D;
                    public Object E;
                    public int F;
                    public int G;
                    public int H;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f31222t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f31223u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f31224v;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public Object f31226x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f31227y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f31228z;

                    public C0548a(nt.b bVar) {
                        super(bVar);
                    }

                    @Override // pt.a
                    public final Object invokeSuspend(Object obj) {
                        this.f31222t = obj;
                        this.f31223u |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(nu.i iVar, p0 p0Var, w wVar) {
                    this.f31220a = iVar;
                    this.b = p0Var;
                    this.f31221c = wVar;
                }

                /* JADX WARN: Code duplicated, block: B:51:0x01c3 A[Catch: all -> 0x006f, TryCatch #3 {all -> 0x006f, blocks: (B:18:0x006a, B:49:0x01b4, B:51:0x01c3, B:52:0x01cb), top: B:71:0x006a }] */
                /* JADX WARN: Code duplicated, block: B:59:0x01eb  */
                /* JADX WARN: Code duplicated, block: B:8:0x0018  */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x0220, code lost:
                
                    if (r4.emit(r0, r6) == r2) goto L62;
                 */
                @Override // nu.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r21, nt.b r22) {
                    /*
                        Method dump skipped, instruction units count: 550
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: sl.w.b.d.a.emit(java.lang.Object, nt.b):java.lang.Object");
                }
            }

            public d(nu.h hVar, p0 p0Var, w wVar) {
                this.f31218a = hVar;
                this.b = p0Var;
                this.f31219c = wVar;
            }

            @Override // nu.h
            public Object collect(nu.i<? super jt.n<? extends Unit>> iVar, nt.b bVar) {
                Object objCollect = this.f31218a.collect(new a(iVar, this.b, this.f31219c), bVar);
                return objCollect == ot.c.e() ? objCollect : Unit.f22483a;
            }
        }

        public b(nt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            b bVar2 = w.this.new b(bVar);
            bVar2.f31193x = obj;
            return bVar2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00f5, code lost:
        
            if (nu.j.i(r5, r11) == r1) goto L35;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sl.w.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Integer> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "Ljava/io/Serializable;", "<anonymous>", "(Lku/p0;)Ljava/io/Serializable;"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.universalapp.achievement.Replicator$syncRemoteToLocal$2", f = "Replicator.kt", l = {25, 31}, m = "invokeSuspend", v = 1)
    public static final class c extends pt.m implements Function2<p0, nt.b<? super Serializable>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31229t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f31230u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f31231v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f31232w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f31233x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f31234y;

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            c cVar = w.this.new c(bVar);
            cVar.f31234y = obj;
            return cVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
        
            if (r2.i(r7, r6) == r1) goto L22;
         */
        @Override // pt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f31234y
                ku.p0 r0 = (ku.p0) r0
                java.lang.Object r1 = ot.c.e()
                int r2 = r6.f31233x
                java.lang.String r3 = "rbx.achievement.replicator"
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L34
                if (r2 == r5) goto L2a
                if (r2 != r4) goto L22
                java.lang.Object r0 = r6.f31230u
                ku.p0 r0 = (ku.p0) r0
                java.lang.Object r0 = r6.f31229t
                java.util.List r0 = (java.util.List) r0
                jt.o.b(r7)     // Catch: java.lang.Throwable -> L20
                goto L76
            L20:
                r7 = move-exception
                goto L7d
            L22:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L2a:
                jt.o.b(r7)
                jt.n r7 = (jt.n) r7
                java.lang.Object r7 = r7.getValue()
                goto L48
            L34:
                jt.o.b(r7)
                sl.w r7 = sl.w.this
                sl.v r7 = sl.w.b(r7)
                r6.f31234y = r0
                r6.f31233x = r5
                java.lang.Object r7 = r7.a(r6)
                if (r7 != r1) goto L48
                goto L75
            L48:
                sl.w r2 = sl.w.this
                java.lang.Throwable r5 = jt.n.e(r7)
                if (r5 != 0) goto L97
                java.util.List r7 = (java.util.List) r7
                sl.b r2 = sl.w.a(r2)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r5 = pt.l.a(r0)     // Catch: java.lang.Throwable -> L20
                r6.f31234y = r5     // Catch: java.lang.Throwable -> L20
                java.lang.Object r5 = pt.l.a(r7)     // Catch: java.lang.Throwable -> L20
                r6.f31229t = r5     // Catch: java.lang.Throwable -> L20
                java.lang.Object r0 = pt.l.a(r0)     // Catch: java.lang.Throwable -> L20
                r6.f31230u = r0     // Catch: java.lang.Throwable -> L20
                r0 = 0
                r6.f31231v = r0     // Catch: java.lang.Throwable -> L20
                r6.f31232w = r0     // Catch: java.lang.Throwable -> L20
                r6.f31233x = r4     // Catch: java.lang.Throwable -> L20
                java.lang.Object r7 = r2.i(r7, r6)     // Catch: java.lang.Throwable -> L20
                if (r7 != r1) goto L76
            L75:
                return r1
            L76:
                kotlin.Unit r7 = kotlin.Unit.f22483a     // Catch: java.lang.Throwable -> L20
                java.lang.Object r7 = jt.n.b(r7)     // Catch: java.lang.Throwable -> L20
                goto L87
            L7d:
                jt.n$a r0 = jt.n.INSTANCE
                java.lang.Object r7 = jt.o.a(r7)
                java.lang.Object r7 = jt.n.b(r7)
            L87:
                java.lang.Throwable r0 = jt.n.e(r7)
                if (r0 == 0) goto L92
                java.lang.String r1 = "Unable to replicate remote achievements locally"
                android.util.Log.w(r3, r1, r0)
            L92:
                jt.n r7 = jt.n.a(r7)
                return r7
            L97:
                java.lang.String r7 = "Unable to gather remote achievements"
                int r7 = android.util.Log.w(r3, r7, r5)
                java.lang.Integer r7 = pt.b.d(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: sl.w.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Serializable> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public w(@NotNull sl.b local, @NotNull v remote) {
        Intrinsics.checkNotNullParameter(local, "local");
        Intrinsics.checkNotNullParameter(remote, "remote");
        this.local = local;
        this.remote = remote;
    }

    @Nullable
    public final Object c(@NotNull nt.b<? super Integer> bVar) {
        return ku.i.g(g1.b(), new b(null), bVar);
    }

    @Nullable
    public final Object d(@NotNull nt.b<? super Serializable> bVar) {
        return ku.i.g(g1.b(), new c(null), bVar);
    }
}
