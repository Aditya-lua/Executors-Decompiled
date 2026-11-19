package dv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ldv/o0;", "Ldv/m0;", "<init>", "()V", "Ldv/p0;", BuildConfig.FLAVOR, "subscriptionCount", "Ldv/h;", "Ldv/k0;", "a", "(Ldv/p0;)Ldv/h;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o0 implements m0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldv/i;", "Ldv/k0;", BuildConfig.FLAVOR, "<anonymous>", "(Ldv/i;)V"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<i<? super k0>, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f12792t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f12793u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ p0<Integer> f12794v;

        /* JADX INFO: renamed from: dv.o0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0241a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p001kotlin.jvm.internal.y f12795a;
            public final /* synthetic */ i<k0> b;

            /* JADX INFO: renamed from: dv.o0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @gu.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {154}, m = "emit")
            public static final class C0242a extends gu.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f12796t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ C0241a<T> f12797u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public int f12798v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0242a(C0241a<? super T> c0241a, eu.b<? super C0242a> bVar) {
                    super(bVar);
                    this.f12797u = c0241a;
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    this.f12796t = obj;
                    this.f12798v |= Integer.MIN_VALUE;
                    return this.f12797u.b(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0241a(p001kotlin.jvm.internal.y yVar, i<? super k0> iVar) {
                this.f12795a = yVar;
                this.b = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object b(int i10, eu.b<? super Unit> bVar) {
                C0242a c0242a;
                if (bVar instanceof C0242a) {
                    c0242a = (C0242a) bVar;
                    int i11 = c0242a.f12798v;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0242a.f12798v = i11 - Integer.MIN_VALUE;
                    } else {
                        c0242a = new C0242a(this, bVar);
                    }
                } else {
                    c0242a = new C0242a(this, bVar);
                }
                Object obj = c0242a.f12796t;
                Object objE = fu.c.e();
                int i12 = c0242a.f12798v;
                if (i12 == 0) {
                    zt.o.b(obj);
                    if (i10 > 0) {
                        p001kotlin.jvm.internal.y yVar = this.f12795a;
                        if (!yVar.f21591a) {
                            yVar.f21591a = true;
                            i<k0> iVar = this.b;
                            k0 k0Var = k0.START;
                            c0242a.f12798v = 1;
                            if (iVar.emit(k0Var, c0242a) == objE) {
                                return objE;
                            }
                        }
                    }
                    return Unit.f21506a;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
                return Unit.f21506a;
            }

            @Override // dv.i
            public /* bridge */ /* synthetic */ Object emit(Object obj, eu.b bVar) {
                return b(((Number) obj).intValue(), bVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p0<Integer> p0Var, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f12794v = p0Var;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            a aVar = new a(this.f12794v, bVar);
            aVar.f12793u = obj;
            return aVar;
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f12792t;
            if (i10 == 0) {
                zt.o.b(obj);
                i iVar = (i) this.f12793u;
                p001kotlin.jvm.internal.y yVar = new p001kotlin.jvm.internal.y();
                p0<Integer> p0Var = this.f12794v;
                C0241a c0241a = new C0241a(yVar, iVar);
                this.f12792t = 1;
                if (p0Var.collect(c0241a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zt.o.b(obj);
            }
            throw new zt.d();
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super k0> iVar, eu.b<? super Unit> bVar) {
            return ((a) create(iVar, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    @Override // dv.m0
    @NotNull
    public h<k0> a(@NotNull p0<Integer> subscriptionCount) {
        return j.w(new a(subscriptionCount, null));
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
