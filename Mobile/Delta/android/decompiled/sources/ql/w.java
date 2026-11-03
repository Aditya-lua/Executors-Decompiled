package ql;

import android.util.Log;
import iu.g1;
import iu.p0;
import iu.w0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lql/w;", "", "Lql/b;", "local", "Lql/v;", "remote", "<init>", "(Lql/b;Lql/v;)V", "Ljava/io/Serializable;", "d", "(Llt/b;)Ljava/lang/Object;", "", "c", "a", "Lql/b;", "b", "Lql/v;", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ql.b local;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final v remote;

    @nt.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2", f = "Replicator.kt", l = {41, 82}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)I"}, k = 3, mv = {2, 2, 0})
    public static final class b extends nt.m implements Function2<p0, lt.b<? super Integer>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f29936t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f29937u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f29938v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f29939w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f29940x;

        @nt.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$2$1$1", f = "Replicator.kt", l = {54}, m = "invokeSuspend", v = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Liu/p0;", "Lgt/n;", "", "<anonymous>", "(Liu/p0;)Lgt/n;"}, k = 3, mv = {2, 2, 0})
        public static final class a extends nt.m implements Function2<p0, lt.b<? super gt.n<? extends String>>, Object> {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f29942t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ w f29943u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ Achievement f29944v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w wVar, Achievement achievement, lt.b<? super a> bVar) {
                super(2, bVar);
                this.f29943u = wVar;
                this.f29944v = achievement;
            }

            @Override // nt.a
            public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
                return new a(this.f29943u, this.f29944v, bVar);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(p0 p0Var, lt.b<? super gt.n<String>> bVar) {
                return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                Object objA;
                Object objB;
                Object objE = mt.c.e();
                int i10 = this.f29942t;
                if (i10 == 0) {
                    gt.o.b(obj);
                    v vVar = this.f29943u.remote;
                    Achievement achievement = this.f29944v;
                    this.f29942t = 1;
                    objA = vVar.a(achievement, this);
                    if (objA == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                    objA = ((gt.n) obj).getValue();
                }
                Achievement achievement2 = this.f29944v;
                if (gt.n.h(objA)) {
                    boolean zBooleanValue = ((Boolean) objA).booleanValue();
                    if (!zBooleanValue) {
                        Log.w("rbx.achievement.replicator", "remote grant of " + achievement2.getCodeName() + " failed");
                    }
                    if (rh.h.a().C()) {
                        t.f29925a.n("remote", achievement2.getCodeName(), zBooleanValue);
                    }
                    String codeName = achievement2.getCodeName();
                    if (!zBooleanValue) {
                        codeName = null;
                    }
                    objB = gt.n.b(codeName);
                } else {
                    objB = gt.n.b(objA);
                }
                Achievement achievement3 = this.f29944v;
                Throwable thE = gt.n.e(objB);
                if (thE != null) {
                    Log.w("rbx.achievement.replicator", "granting " + achievement3.getCodeName() + " failed exceptionally", thE);
                    objB = gt.n.b(null);
                }
                return gt.n.a(objB);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(p0 p0Var, lt.b<? super gt.n<? extends String>> bVar) {
                return invoke2(p0Var, (lt.b<? super gt.n<String>>) bVar);
            }
        }

        /* JADX INFO: renamed from: ql.w$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C0518b implements lu.h<List<? extends Achievement>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ lu.h f29945a;

            /* JADX INFO: renamed from: ql.w$b$b$a */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a<T> implements lu.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ lu.i f29946a;

                /* JADX INFO: renamed from: ql.w$b$b$a$a, reason: collision with other inner class name */
                @nt.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$filter$1$2", f = "Replicator.kt", l = {50}, m = "emit", v = 1)
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C0519a extends nt.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f29947t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f29948u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f29949v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    public Object f29950w;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f29952y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f29953z;

                    public C0519a(lt.b bVar) {
                        super(bVar);
                    }

                    @Override // nt.a
                    public final Object invokeSuspend(Object obj) {
                        this.f29947t = obj;
                        this.f29948u |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(lu.i iVar) {
                    this.f29946a = iVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // lu.i
                public final Object emit(Object obj, lt.b bVar) {
                    C0519a c0519a;
                    if (bVar instanceof C0519a) {
                        c0519a = (C0519a) bVar;
                        int i10 = c0519a.f29948u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0519a.f29948u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0519a = new C0519a(bVar);
                        }
                    } else {
                        c0519a = new C0519a(bVar);
                    }
                    Object obj2 = c0519a.f29947t;
                    Object objE = mt.c.e();
                    int i11 = c0519a.f29948u;
                    if (i11 == 0) {
                        gt.o.b(obj2);
                        lu.i iVar = this.f29946a;
                        if (!((List) obj).isEmpty()) {
                            c0519a.f29949v = nt.l.a(obj);
                            c0519a.f29950w = nt.l.a(c0519a);
                            c0519a.f29952y = nt.l.a(obj);
                            c0519a.f29953z = nt.l.a(iVar);
                            c0519a.A = 0;
                            c0519a.f29948u = 1;
                            if (iVar.emit(obj, c0519a) == objE) {
                                return objE;
                            }
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gt.o.b(obj2);
                    }
                    return Unit.f22938a;
                }
            }

            public C0518b(lu.h hVar) {
                this.f29945a = hVar;
            }

            @Override // lu.h
            public Object collect(lu.i<? super List<? extends Achievement>> iVar, lt.b bVar) {
                Object objCollect = this.f29945a.collect(new a(iVar), bVar);
                return objCollect == mt.c.e() ? objCollect : Unit.f22938a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class c implements lu.h<List<? extends w0<? extends gt.n<? extends String>>>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ lu.h f29954a;
            public final /* synthetic */ p0 b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f29955c;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a<T> implements lu.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ lu.i f29956a;
                public final /* synthetic */ p0 b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w f29957c;

                /* JADX INFO: renamed from: ql.w$b$c$a$a, reason: collision with other inner class name */
                @nt.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$map$1$2", f = "Replicator.kt", l = {50}, m = "emit", v = 1)
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C0520a extends nt.d {
                    public int A;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f29958t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f29959u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f29960v;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public Object f29962x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f29963y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f29964z;

                    public C0520a(lt.b bVar) {
                        super(bVar);
                    }

                    @Override // nt.a
                    public final Object invokeSuspend(Object obj) {
                        this.f29958t = obj;
                        this.f29959u |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(lu.i iVar, p0 p0Var, w wVar) {
                    this.f29956a = iVar;
                    this.b = p0Var;
                    this.f29957c = wVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // lu.i
                public final Object emit(Object obj, lt.b bVar) {
                    C0520a c0520a;
                    if (bVar instanceof C0520a) {
                        c0520a = (C0520a) bVar;
                        int i10 = c0520a.f29959u;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            c0520a.f29959u = i10 - Integer.MIN_VALUE;
                        } else {
                            c0520a = new C0520a(bVar);
                        }
                    } else {
                        c0520a = new C0520a(bVar);
                    }
                    Object obj2 = c0520a.f29958t;
                    Object objE = mt.c.e();
                    int i11 = c0520a.f29959u;
                    if (i11 == 0) {
                        gt.o.b(obj2);
                        lu.i iVar = this.f29956a;
                        List list = (List) obj;
                        Log.i("rbx.achievement.replicator", "Syncing " + list + " achievements to remote");
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(iu.k.b(this.b, null, null, new a(this.f29957c, (Achievement) it.next(), null), 3, null));
                        }
                        c0520a.f29960v = nt.l.a(obj);
                        c0520a.f29962x = nt.l.a(c0520a);
                        c0520a.f29963y = nt.l.a(obj);
                        c0520a.f29964z = nt.l.a(iVar);
                        c0520a.A = 0;
                        c0520a.f29959u = 1;
                        if (iVar.emit(arrayList, c0520a) == objE) {
                            return objE;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gt.o.b(obj2);
                    }
                    return Unit.f22938a;
                }
            }

            public c(lu.h hVar, p0 p0Var, w wVar) {
                this.f29954a = hVar;
                this.b = p0Var;
                this.f29955c = wVar;
            }

            @Override // lu.h
            public Object collect(lu.i<? super List<? extends w0<? extends gt.n<? extends String>>>> iVar, lt.b bVar) {
                Object objCollect = this.f29954a.collect(new a(iVar, this.b, this.f29955c), bVar);
                return objCollect == mt.c.e() ? objCollect : Unit.f22938a;
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class d implements lu.h<gt.n<? extends Unit>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ lu.h f29965a;
            public final /* synthetic */ p0 b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f29966c;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a<T> implements lu.i {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ lu.i f29967a;
                public final /* synthetic */ p0 b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ w f29968c;

                /* JADX INFO: renamed from: ql.w$b$d$a$a, reason: collision with other inner class name */
                @nt.f(c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$invokeSuspend$$inlined$map$2$2", f = "Replicator.kt", l = {52, 67, 50}, m = "emit", v = 1)
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C0521a extends nt.d {
                    public Object A;
                    public Object B;
                    public Object C;
                    public Object D;
                    public Object E;
                    public int F;
                    public int G;
                    public int H;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public /* synthetic */ Object f29969t;

                    /* JADX INFO: renamed from: u, reason: collision with root package name */
                    public int f29970u;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public Object f29971v;

                    /* JADX INFO: renamed from: x, reason: collision with root package name */
                    public Object f29973x;

                    /* JADX INFO: renamed from: y, reason: collision with root package name */
                    public Object f29974y;

                    /* JADX INFO: renamed from: z, reason: collision with root package name */
                    public Object f29975z;

                    public C0521a(lt.b bVar) {
                        super(bVar);
                    }

                    @Override // nt.a
                    public final Object invokeSuspend(Object obj) {
                        this.f29969t = obj;
                        this.f29970u |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(lu.i iVar, p0 p0Var, w wVar) {
                    this.f29967a = iVar;
                    this.b = p0Var;
                    this.f29968c = wVar;
                }

                /* JADX WARN: Code duplicated, block: B:51:0x01c3 A[Catch: all -> 0x006f, TryCatch #3 {all -> 0x006f, blocks: (B:18:0x006a, B:49:0x01b4, B:51:0x01c3, B:52:0x01cb), top: B:71:0x006a }] */
                /* JADX WARN: Code duplicated, block: B:59:0x01eb  */
                /* JADX WARN: Code duplicated, block: B:8:0x0018  */
                /* JADX WARN: Code restructure failed: missing block: B:61:0x0220, code lost:
                
                    if (r4.emit(r0, r6) == r2) goto L62;
                 */
                @Override // lu.i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r21, lt.b r22) {
                    /*
                        Method dump skipped, instruction units count: 550
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ql.w.b.d.a.emit(java.lang.Object, lt.b):java.lang.Object");
                }
            }

            public d(lu.h hVar, p0 p0Var, w wVar) {
                this.f29965a = hVar;
                this.b = p0Var;
                this.f29966c = wVar;
            }

            @Override // lu.h
            public Object collect(lu.i<? super gt.n<? extends Unit>> iVar, lt.b bVar) {
                Object objCollect = this.f29965a.collect(new a(iVar, this.b, this.f29966c), bVar);
                return objCollect == mt.c.e() ? objCollect : Unit.f22938a;
            }
        }

        public b(lt.b<? super b> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            b bVar2 = w.this.new b(bVar);
            bVar2.f29940x = obj;
            return bVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Integer> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00f5, code lost:
        
            if (lu.j.i(r5, r11) == r1) goto L35;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ql.w.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @nt.f(c = "com.roblox.universalapp.achievement.Replicator$syncRemoteToLocal$2", f = "Replicator.kt", l = {25, 31}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "Ljava/io/Serializable;", "<anonymous>", "(Liu/p0;)Ljava/io/Serializable;"}, k = 3, mv = {2, 2, 0})
    public static final class c extends nt.m implements Function2<p0, lt.b<? super Serializable>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f29976t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f29977u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f29978v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f29979w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f29980x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public /* synthetic */ Object f29981y;

        public c(lt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            c cVar = w.this.new c(bVar);
            cVar.f29981y = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Serializable> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
        
            if (r2.a(r7, r6) == r1) goto L22;
         */
        @Override // nt.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f29981y
                iu.p0 r0 = (iu.p0) r0
                java.lang.Object r1 = mt.c.e()
                int r2 = r6.f29980x
                java.lang.String r3 = "rbx.achievement.replicator"
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L34
                if (r2 == r5) goto L2a
                if (r2 != r4) goto L22
                java.lang.Object r0 = r6.f29977u
                iu.p0 r0 = (iu.p0) r0
                java.lang.Object r0 = r6.f29976t
                java.util.List r0 = (java.util.List) r0
                gt.o.b(r7)     // Catch: java.lang.Throwable -> L20
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
                gt.o.b(r7)
                gt.n r7 = (gt.n) r7
                java.lang.Object r7 = r7.getValue()
                goto L48
            L34:
                gt.o.b(r7)
                ql.w r7 = ql.w.this
                ql.v r7 = ql.w.b(r7)
                r6.f29981y = r0
                r6.f29980x = r5
                java.lang.Object r7 = r7.b(r6)
                if (r7 != r1) goto L48
                goto L75
            L48:
                ql.w r2 = ql.w.this
                java.lang.Throwable r5 = gt.n.e(r7)
                if (r5 != 0) goto L97
                java.util.List r7 = (java.util.List) r7
                ql.b r2 = ql.w.a(r2)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r5 = nt.l.a(r0)     // Catch: java.lang.Throwable -> L20
                r6.f29981y = r5     // Catch: java.lang.Throwable -> L20
                java.lang.Object r5 = nt.l.a(r7)     // Catch: java.lang.Throwable -> L20
                r6.f29976t = r5     // Catch: java.lang.Throwable -> L20
                java.lang.Object r0 = nt.l.a(r0)     // Catch: java.lang.Throwable -> L20
                r6.f29977u = r0     // Catch: java.lang.Throwable -> L20
                r0 = 0
                r6.f29978v = r0     // Catch: java.lang.Throwable -> L20
                r6.f29979w = r0     // Catch: java.lang.Throwable -> L20
                r6.f29980x = r4     // Catch: java.lang.Throwable -> L20
                java.lang.Object r7 = r2.a(r7, r6)     // Catch: java.lang.Throwable -> L20
                if (r7 != r1) goto L76
            L75:
                return r1
            L76:
                kotlin.Unit r7 = kotlin.Unit.f22938a     // Catch: java.lang.Throwable -> L20
                java.lang.Object r7 = gt.n.b(r7)     // Catch: java.lang.Throwable -> L20
                goto L87
            L7d:
                gt.n$a r0 = gt.n.INSTANCE
                java.lang.Object r7 = gt.o.a(r7)
                java.lang.Object r7 = gt.n.b(r7)
            L87:
                java.lang.Throwable r0 = gt.n.e(r7)
                if (r0 == 0) goto L92
                java.lang.String r1 = "Unable to replicate remote achievements locally"
                android.util.Log.w(r3, r1, r0)
            L92:
                gt.n r7 = gt.n.a(r7)
                return r7
            L97:
                java.lang.String r7 = "Unable to gather remote achievements"
                int r7 = android.util.Log.w(r3, r7, r5)
                java.lang.Integer r7 = nt.b.d(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ql.w.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public w(@NotNull ql.b local, @NotNull v remote) {
        Intrinsics.checkNotNullParameter(local, "local");
        Intrinsics.checkNotNullParameter(remote, "remote");
        this.local = local;
        this.remote = remote;
    }

    @Nullable
    public final Object c(@NotNull lt.b<? super Integer> bVar) {
        return iu.i.g(g1.b(), new b(null), bVar);
    }

    @Nullable
    public final Object d(@NotNull lt.b<? super Serializable> bVar) {
        return iu.i.g(g1.b(), new c(null), bVar);
    }
}
