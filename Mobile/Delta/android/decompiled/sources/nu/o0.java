package nu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnu/o0;", "Lnu/m0;", "<init>", "()V", "Lnu/p0;", "", "subscriptionCount", "Lnu/h;", "Lnu/k0;", "a", "(Lnu/p0;)Lnu/h;", "", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o0 implements m0 {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnu/i;", "Lnu/k0;", "", "<anonymous>", "(Lnu/i;)V"}, k = 3, mv = {2, 1, 0})
    @pt.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", l = {151}, m = "invokeSuspend")
    public static final class a extends pt.m implements Function2<i<? super k0>, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f26746t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f26747u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ p0<Integer> f26748v;

        /* JADX INFO: renamed from: nu.o0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0454a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.y f26749a;
            public final /* synthetic */ i<k0> b;

            /* JADX INFO: renamed from: nu.o0$a$a$a, reason: collision with other inner class name */
            @pt.f(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {154}, m = "emit")
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class C0455a extends pt.d {

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f26750t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ C0454a<T> f26751u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public int f26752v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0455a(C0454a<? super T> c0454a, nt.b<? super C0455a> bVar) {
                    super(bVar);
                    this.f26751u = c0454a;
                }

                @Override // pt.a
                public final Object invokeSuspend(Object obj) {
                    this.f26750t = obj;
                    this.f26752v |= Integer.MIN_VALUE;
                    return this.f26751u.b(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0454a(kotlin.jvm.internal.y yVar, i<? super k0> iVar) {
                this.f26749a = yVar;
                this.b = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            public final Object b(int i10, nt.b<? super Unit> bVar) {
                C0455a c0455a;
                if (bVar instanceof C0455a) {
                    c0455a = (C0455a) bVar;
                    int i11 = c0455a.f26752v;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c0455a.f26752v = i11 - Integer.MIN_VALUE;
                    } else {
                        c0455a = new C0455a(this, bVar);
                    }
                } else {
                    c0455a = new C0455a(this, bVar);
                }
                Object obj = c0455a.f26750t;
                Object objE = ot.c.e();
                int i12 = c0455a.f26752v;
                if (i12 == 0) {
                    jt.o.b(obj);
                    if (i10 > 0) {
                        kotlin.jvm.internal.y yVar = this.f26749a;
                        if (!yVar.f22568a) {
                            yVar.f22568a = true;
                            i<k0> iVar = this.b;
                            k0 k0Var = k0.START;
                            c0455a.f26752v = 1;
                            if (iVar.emit(k0Var, c0455a) == objE) {
                                return objE;
                            }
                        }
                    }
                    return Unit.f22483a;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return Unit.f22483a;
            }

            @Override // nu.i
            public /* bridge */ /* synthetic */ Object emit(Object obj, nt.b bVar) {
                return b(((Number) obj).intValue(), bVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p0<Integer> p0Var, nt.b<? super a> bVar) {
            super(2, bVar);
            this.f26748v = p0Var;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            a aVar = new a(this.f26748v, bVar);
            aVar.f26747u = obj;
            return aVar;
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f26746t;
            if (i10 == 0) {
                jt.o.b(obj);
                i iVar = (i) this.f26747u;
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                p0<Integer> p0Var = this.f26748v;
                C0454a c0454a = new C0454a(yVar, iVar);
                this.f26746t = 1;
                if (p0Var.collect(c0454a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            throw new jt.d();
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(i<? super k0> iVar, nt.b<? super Unit> bVar) {
            return ((a) create(iVar, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Override // nu.m0
    @NotNull
    public h<k0> a(@NotNull p0<Integer> subscriptionCount) {
        return j.w(new a(subscriptionCount, null));
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
