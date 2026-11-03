package lu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Llu/o0;", "Llu/m0;", "<init>", "()V", "Llu/p0;", "", "subscriptionCount", "Llu/h;", "Llu/k0;", "a", "(Llu/p0;)Llu/h;", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o0 implements m0 {

    @nt.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Llu/i;", "Llu/k0;", "", "<anonymous>", "(Llu/i;)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends nt.m implements Function2<i<? super k0>, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24035t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f24036u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ p0<Integer> f24037v;

        /* JADX INFO: renamed from: lu.o0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0422a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.y f24038a;
            public final /* synthetic */ i<k0> b;

            /* JADX INFO: renamed from: lu.o0$a$a$a, reason: collision with other inner class name */
            @nt.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {154}, m = "emit")
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0423a extends nt.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f24039t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ C0422a<T> f24040u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public int f24041v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0423a(C0422a<? super T> c0422a, lt.b<? super C0423a> bVar) {
                    super(bVar);
                    this.f24040u = c0422a;
                }

                @Override // nt.a
                public final Object invokeSuspend(Object obj) {
                    this.f24039t = obj;
                    this.f24041v |= Integer.MIN_VALUE;
                    return this.f24040u.b(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0422a(kotlin.jvm.internal.y yVar, i<? super k0> iVar) {
                this.f24038a = yVar;
                this.b = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object b(int i10, lt.b<? super Unit> bVar) {
                C0423a c0423a;
                if (bVar instanceof C0423a) {
                    c0423a = (C0423a) bVar;
                    int i11 = c0423a.f24041v;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0423a.f24041v = i11 - Integer.MIN_VALUE;
                    } else {
                        c0423a = new C0423a(this, bVar);
                    }
                } else {
                    c0423a = new C0423a(this, bVar);
                }
                Object obj = c0423a.f24039t;
                Object objE = mt.c.e();
                int i12 = c0423a.f24041v;
                if (i12 == 0) {
                    gt.o.b(obj);
                    if (i10 > 0) {
                        kotlin.jvm.internal.y yVar = this.f24038a;
                        if (!yVar.f23023a) {
                            yVar.f23023a = true;
                            i<k0> iVar = this.b;
                            k0 k0Var = k0.START;
                            c0423a.f24041v = 1;
                            if (iVar.emit(k0Var, c0423a) == objE) {
                                return objE;
                            }
                        }
                    }
                    return Unit.f22938a;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return Unit.f22938a;
            }

            @Override // lu.i
            public /* bridge */ /* synthetic */ Object emit(Object obj, lt.b bVar) {
                return b(((Number) obj).intValue(), bVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p0<Integer> p0Var, lt.b<? super a> bVar) {
            super(2, bVar);
            this.f24037v = p0Var;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            a aVar = new a(this.f24037v, bVar);
            aVar.f24036u = obj;
            return aVar;
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f24035t;
            if (i10 == 0) {
                gt.o.b(obj);
                i iVar = (i) this.f24036u;
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                p0<Integer> p0Var = this.f24037v;
                C0422a c0422a = new C0422a(yVar, iVar);
                this.f24035t = 1;
                if (p0Var.collect(c0422a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
            }
            throw new gt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super k0> iVar, lt.b<? super Unit> bVar) {
            return ((a) create(iVar, bVar)).invokeSuspend(Unit.f22938a);
        }
    }

    @Override // lu.m0
    @NotNull
    public h<k0> a(@NotNull p0<Integer> subscriptionCount) {
        return j.w(new a(subscriptionCount, null));
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
