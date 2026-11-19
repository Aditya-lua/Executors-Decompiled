package dv;

import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0005¢\u0006\u0004\b\t\u0010\n\u001a]\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\f\u001a\u00028\u00012*\b\u0001\u0010\u000e\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {BuildConfig.FLAVOR, "T", "Ldv/h;", "a", "(Ldv/h;)Ldv/h;", "Lkotlin/Function2;", "Leu/b;", BuildConfig.FLAVOR, "action", "b", "(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;", "R", "initial", "Lkotlin/Function3;", "operation", "c", "(Ldv/h;Ljava/lang/Object;Lpu/n;)Ldv/h;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class a0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f12697a;

        /* JADX INFO: renamed from: dv.a0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0236a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f12698a;

            /* JADX INFO: renamed from: dv.a0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @gu.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit")
            public static final class C0237a extends gu.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f12699t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f12700u;

                public C0237a(eu.b bVar) {
                    super(bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    this.f12699t = obj;
                    this.f12700u |= Integer.MIN_VALUE;
                    return C0236a.this.emit(null, this);
                }
            }

            public C0236a(i iVar) {
                this.f12698a = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // dv.i
            public final Object emit(T t8, eu.b<? super Unit> bVar) {
                C0237a c0237a;
                if (bVar instanceof C0237a) {
                    c0237a = (C0237a) bVar;
                    int i10 = c0237a.f12700u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0237a.f12700u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0237a = new C0237a(bVar);
                    }
                } else {
                    c0237a = new C0237a(bVar);
                }
                Object obj = c0237a.f12699t;
                Object objE = fu.c.e();
                int i11 = c0237a.f12700u;
                if (i11 == 0) {
                    zt.o.b(obj);
                    i iVar = this.f12698a;
                    if (t8 != null) {
                        c0237a.f12700u = 1;
                        if (iVar.emit(t8, c0237a) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
        }

        public a(h hVar) {
            this.f12697a = hVar;
        }

        @Override // dv.h
        public Object collect(i iVar, eu.b bVar) {
            Object objCollect = this.f12697a.collect(new C0236a(iVar), bVar);
            return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f12702a;
        public final /* synthetic */ Function2 b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f12703a;
            public final /* synthetic */ Function2 b;

            /* JADX INFO: renamed from: dv.a0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @gu.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {RequestError.RESPONSE_CODE_FAILURE, 51}, m = "emit")
            public static final class C0238a extends gu.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f12704t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f12705u;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public Object f12707w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public Object f12708x;

                public C0238a(eu.b bVar) {
                    super(bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    this.f12704t = obj;
                    this.f12705u |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(i iVar, Function2 function2) {
                this.f12703a = iVar;
                this.b = function2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
            
                if (r6.emit(r2, r0) == r1) goto L22;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // dv.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(T t8, eu.b<? super Unit> bVar) {
                C0238a c0238a;
                Object obj;
                i iVar;
                if (bVar instanceof C0238a) {
                    c0238a = (C0238a) bVar;
                    int i10 = c0238a.f12705u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0238a.f12705u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0238a = new C0238a(bVar);
                    }
                } else {
                    c0238a = new C0238a(bVar);
                }
                Object obj2 = c0238a.f12704t;
                Object objE = fu.c.e();
                int i11 = c0238a.f12705u;
                if (i11 != 0) {
                    if (i11 == 1) {
                        i iVar2 = (i) c0238a.f12708x;
                        obj = c0238a.f12707w;
                        zt.o.b(obj2);
                        iVar = iVar2;
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zt.o.b(obj2);
                    }
                    return Unit.f21506a;
                }
                zt.o.b(obj2);
                i iVar3 = this.f12703a;
                Function2 function2 = this.b;
                c0238a.f12707w = t8;
                c0238a.f12708x = iVar3;
                c0238a.f12705u = 1;
                p001kotlin.jvm.internal.l.c(6);
                Object objInvoke = function2.invoke(t8, c0238a);
                p001kotlin.jvm.internal.l.c(7);
                if (objInvoke != objE) {
                    obj = t8;
                    iVar = iVar3;
                }
                return objE;
                c0238a.f12707w = null;
                c0238a.f12708x = null;
                c0238a.f12705u = 2;
            }
        }

        public b(h hVar, Function2 function2) {
            this.f12702a = hVar;
            this.b = function2;
        }

        @Override // dv.h
        public Object collect(i iVar, eu.b bVar) {
            Object objCollect = this.f12702a.collect(new a(iVar, this.b), bVar);
            return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"dv/a0$c", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<R> implements h<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f12709a;
        public final /* synthetic */ h b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ pu.n f12710c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", l = {110, 111}, m = "collect")
        public static final class a extends gu.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f12711t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f12712u;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public Object f12714w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public Object f12715x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public Object f12716y;

            public a(eu.b bVar) {
                super(bVar);
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                this.f12711t = obj;
                this.f12712u |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(Object obj, h hVar, pu.n nVar) {
            this.f12709a = obj;
            this.b = hVar;
            this.f12710c = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
        
            if (r8.collect(r5, r0) == r1) goto L22;
         */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // dv.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object collect(i<? super R> iVar, eu.b<? super Unit> bVar) {
            a aVar;
            c<R> cVar;
            i iVar2;
            p001kotlin.jvm.internal.c0 c0Var;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f12712u;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f12712u = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(bVar);
                }
            } else {
                aVar = new a(bVar);
            }
            Object obj = aVar.f12711t;
            Object objE = fu.c.e();
            int i11 = aVar.f12712u;
            if (i11 != 0) {
                if (i11 == 1) {
                    c0Var = (p001kotlin.jvm.internal.c0) aVar.f12716y;
                    i iVar3 = (i) aVar.f12715x;
                    cVar = (c) aVar.f12714w;
                    zt.o.b(obj);
                    iVar2 = iVar3;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
            zt.o.b(obj);
            p001kotlin.jvm.internal.c0 c0Var2 = new p001kotlin.jvm.internal.c0();
            ?? r10 = this.f12709a;
            c0Var2.f21575a = r10;
            aVar.f12714w = this;
            aVar.f12715x = iVar;
            aVar.f12716y = c0Var2;
            aVar.f12712u = 1;
            if (iVar.emit(r10, aVar) != objE) {
                cVar = this;
                iVar2 = iVar;
                c0Var = c0Var2;
            }
            return objE;
            h hVar = cVar.b;
            d dVar = new d(c0Var, cVar.f12710c, iVar2);
            aVar.f12714w = null;
            aVar.f12715x = null;
            aVar.f12716y = null;
            aVar.f12712u = 2;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p001kotlin.jvm.internal.c0<R> f12717a;
        public final /* synthetic */ pu.n<R, T, eu.b<? super R>, Object> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i<R> f12718c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @gu.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", l = {105, 106}, m = "emit")
        public static final class a extends gu.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f12719t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f12720u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public /* synthetic */ Object f12721v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ d<T> f12722w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public int f12723x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, eu.b<? super a> bVar) {
                super(bVar);
                this.f12722w = dVar;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                this.f12721v = obj;
                this.f12723x |= Integer.MIN_VALUE;
                return this.f12722w.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(p001kotlin.jvm.internal.c0<R> c0Var, pu.n<? super R, ? super T, ? super eu.b<? super R>, ? extends Object> nVar, i<? super R> iVar) {
            this.f12717a = c0Var;
            this.b = nVar;
            this.f12718c = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        
            if (r7.emit((R) r8, r0) == r1) goto L22;
         */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // dv.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t8, eu.b<? super Unit> bVar) {
            a aVar;
            p001kotlin.jvm.internal.c0 c0Var;
            d<T> dVar;
            if (bVar instanceof a) {
                aVar = (a) bVar;
                int i10 = aVar.f12723x;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f12723x = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, bVar);
                }
            } else {
                aVar = new a(this, bVar);
            }
            Object obj = aVar.f12721v;
            Object objE = fu.c.e();
            int i11 = aVar.f12723x;
            if (i11 != 0) {
                if (i11 == 1) {
                    c0Var = (p001kotlin.jvm.internal.c0) aVar.f12720u;
                    dVar = (d) aVar.f12719t;
                    zt.o.b(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                return Unit.f21506a;
            }
            zt.o.b(obj);
            p001kotlin.jvm.internal.c0 c0Var2 = this.f12717a;
            pu.n<R, T, eu.b<? super R>, Object> nVar = this.b;
            T t10 = c0Var2.f21575a;
            aVar.f12719t = this;
            aVar.f12720u = c0Var2;
            aVar.f12723x = 1;
            Object objInvoke = nVar.invoke((R) t10, t8, aVar);
            if (objInvoke != objE) {
                obj = (T) objInvoke;
                c0Var = c0Var2;
                dVar = this;
            }
            return objE;
            c0Var.f21575a = (T) obj;
            i<R> iVar = dVar.f12718c;
            T t11 = dVar.f12717a.f21575a;
            aVar.f12719t = null;
            aVar.f12720u = null;
            aVar.f12723x = 2;
        }
    }

    @NotNull
    public static final <T> h<T> a(@NotNull h<? extends T> hVar) {
        return new a(hVar);
    }

    @NotNull
    public static final <T> h<T> b(@NotNull h<? extends T> hVar, @NotNull Function2<? super T, ? super eu.b<? super Unit>, ? extends Object> function2) {
        return new b(hVar, function2);
    }

    @NotNull
    public static final <T, R> h<R> c(@NotNull h<? extends T> hVar, R r10, @NotNull pu.n<? super R, ? super T, ? super eu.b<? super R>, ? extends Object> nVar) {
        return new c(r10, hVar, nVar);
    }
}
