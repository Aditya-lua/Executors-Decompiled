package lu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001aG\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "T", "Llu/h;", "a", "(Llu/h;)Llu/h;", "Lkotlin/Function2;", "Llt/b;", "", "action", "b", "(Llu/h;Lkotlin/jvm/functions/Function2;)Llu/h;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class a0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f23955a;

        /* JADX INFO: renamed from: lu.a0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0417a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f23956a;

            /* JADX INFO: renamed from: lu.a0$a$a$a, reason: collision with other inner class name */
            @nt.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50}, m = "emit")
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0418a extends nt.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f23957t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f23958u;

                public C0418a(lt.b bVar) {
                    super(bVar);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    this.f23957t = obj;
                    this.f23958u |= Integer.MIN_VALUE;
                    return C0417a.this.emit(null, this);
                }
            }

            public C0417a(i iVar) {
                this.f23956a = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // lu.i
            public final Object emit(T t8, lt.b<? super Unit> bVar) {
                C0418a c0418a;
                if (bVar instanceof C0418a) {
                    c0418a = (C0418a) bVar;
                    int i10 = c0418a.f23958u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0418a.f23958u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0418a = new C0418a(bVar);
                    }
                } else {
                    c0418a = new C0418a(bVar);
                }
                Object obj = c0418a.f23957t;
                Object objE = mt.c.e();
                int i11 = c0418a.f23958u;
                if (i11 == 0) {
                    gt.o.b(obj);
                    i iVar = this.f23956a;
                    if (t8 != null) {
                        c0418a.f23958u = 1;
                        if (iVar.emit(t8, c0418a) == objE) {
                            return objE;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gt.o.b(obj);
                }
                return Unit.f22938a;
            }
        }

        public a(h hVar) {
            this.f23955a = hVar;
        }

        @Override // lu.h
        public Object collect(i iVar, lt.b bVar) {
            Object objCollect = this.f23955a.collect(new C0417a(iVar), bVar);
            return objCollect == mt.c.e() ? objCollect : Unit.f22938a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Llu/h;", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f23960a;
        public final /* synthetic */ Function2 b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f23961a;
            public final /* synthetic */ Function2 b;

            /* JADX INFO: renamed from: lu.a0$b$a$a, reason: collision with other inner class name */
            @nt.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50, 51}, m = "emit")
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0419a extends nt.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f23962t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f23963u;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public Object f23965w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public Object f23966x;

                public C0419a(lt.b bVar) {
                    super(bVar);
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    this.f23962t = obj;
                    this.f23963u |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(i iVar, Function2 function2) {
                this.f23961a = iVar;
                this.b = function2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
            
                if (r6.emit(r2, r0) == r1) goto L22;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // lu.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, lt.b<? super kotlin.Unit> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof lu.a0.b.a.C0419a
                    if (r0 == 0) goto L13
                    r0 = r7
                    lu.a0$b$a$a r0 = (lu.a0.b.a.C0419a) r0
                    int r1 = r0.f23963u
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f23963u = r1
                    goto L18
                L13:
                    lu.a0$b$a$a r0 = new lu.a0$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f23962t
                    java.lang.Object r1 = mt.c.e()
                    int r2 = r0.f23963u
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    gt.o.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f23966x
                    lu.i r6 = (lu.i) r6
                    java.lang.Object r2 = r0.f23965w
                    gt.o.b(r7)
                    goto L5c
                L3e:
                    gt.o.b(r7)
                    lu.i r7 = r5.f23961a
                    kotlin.jvm.functions.Function2 r2 = r5.b
                    r0.f23965w = r6
                    r0.f23966x = r7
                    r0.f23963u = r4
                    r4 = 6
                    kotlin.jvm.internal.l.c(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.l.c(r4)
                    if (r2 != r1) goto L5a
                    goto L69
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f23965w = r7
                    r0.f23966x = r7
                    r0.f23963u = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                L69:
                    return r1
                L6a:
                    kotlin.Unit r6 = kotlin.Unit.f22938a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: lu.a0.b.a.emit(java.lang.Object, lt.b):java.lang.Object");
            }
        }

        public b(h hVar, Function2 function2) {
            this.f23960a = hVar;
            this.b = function2;
        }

        @Override // lu.h
        public Object collect(i iVar, lt.b bVar) {
            Object objCollect = this.f23960a.collect(new a(iVar, this.b), bVar);
            return objCollect == mt.c.e() ? objCollect : Unit.f22938a;
        }
    }

    @NotNull
    public static final <T> h<T> a(@NotNull h<? extends T> hVar) {
        return new a(hVar);
    }

    @NotNull
    public static final <T> h<T> b(@NotNull h<? extends T> hVar, @NotNull Function2<? super T, ? super lt.b<? super Unit>, ? extends Object> function2) {
        return new b(hVar, function2);
    }
}
