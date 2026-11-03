package hv;

import com.appsflyer.sdk_base.referrer.Payload;
import iu.g1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a$\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H\u0087@¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0087@¢\u0006\u0004\b\u0007\u0010\u0004\u001a&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\t\u0010\u0004\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\nH\u0080@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "T", "Lhv/d;", "a", "(Lhv/d;Llt/b;)Ljava/lang/Object;", "b", "", "d", "Lhv/x;", "c", "", "", "e", "(Ljava/lang/Throwable;Llt/b;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ hv.d<T> f19876a;

        public a(hv.d<T> dVar) {
            this.f19876a = dVar;
        }

        public final void a(Throwable th2) {
            this.f19876a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22938a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"hv/p$b", "Lhv/f;", "Lhv/d;", "call", "Lhv/x;", Payload.RESPONSE, "", "a", "(Lhv/d;Lhv/x;)V", "", "t", "b", "(Lhv/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements hv.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ iu.n<T> f19877a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(iu.n<? super T> nVar) {
            this.f19877a = nVar;
        }

        @Override // hv.f
        public void a(hv.d<T> call, x<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!response.g()) {
                iu.n<T> nVar = this.f19877a;
                gt.n.Companion companion = gt.n.INSTANCE;
                nVar.resumeWith(gt.n.b(gt.o.a(new m(response))));
                return;
            }
            T tA = response.a();
            if (tA != null) {
                this.f19877a.resumeWith(gt.n.b(tA));
                return;
            }
            Object objTag = call.request().tag(o.class);
            Intrinsics.checkNotNull(objTag);
            o oVar = (o) objTag;
            gt.e eVar = new gt.e("Response from " + oVar.b().getName() + '.' + oVar.a().getName() + " was null but response body type was declared as non-null");
            iu.n<T> nVar2 = this.f19877a;
            gt.n.Companion companion2 = gt.n.INSTANCE;
            nVar2.resumeWith(gt.n.b(gt.o.a(eVar)));
        }

        @Override // hv.f
        public void b(hv.d<T> call, Throwable t8) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t8, "t");
            iu.n<T> nVar = this.f19877a;
            gt.n.Companion companion = gt.n.INSTANCE;
            nVar.resumeWith(gt.n.b(gt.o.a(t8)));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ hv.d<T> f19878a;

        public c(hv.d<T> dVar) {
            this.f19878a = dVar;
        }

        public final void a(Throwable th2) {
            this.f19878a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22938a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J/\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"hv/p$d", "Lhv/f;", "Lhv/d;", "call", "Lhv/x;", Payload.RESPONSE, "", "a", "(Lhv/d;Lhv/x;)V", "", "t", "b", "(Lhv/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements hv.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ iu.n<T> f19879a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(iu.n<? super T> nVar) {
            this.f19879a = nVar;
        }

        @Override // hv.f
        public void a(hv.d<T> call, x<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.g()) {
                iu.n<T> nVar = this.f19879a;
                gt.n.Companion companion = gt.n.INSTANCE;
                nVar.resumeWith(gt.n.b(response.a()));
            } else {
                iu.n<T> nVar2 = this.f19879a;
                gt.n.Companion companion2 = gt.n.INSTANCE;
                nVar2.resumeWith(gt.n.b(gt.o.a(new m(response))));
            }
        }

        @Override // hv.f
        public void b(hv.d<T> call, Throwable t8) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t8, "t");
            iu.n<T> nVar = this.f19879a;
            gt.n.Companion companion = gt.n.INSTANCE;
            nVar.resumeWith(gt.n.b(gt.o.a(t8)));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ hv.d<T> f19880a;

        public e(hv.d<T> dVar) {
            this.f19880a = dVar;
        }

        public final void a(Throwable th2) {
            this.f19880a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22938a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"hv/p$f", "Lhv/f;", "Lhv/d;", "call", "Lhv/x;", Payload.RESPONSE, "", "a", "(Lhv/d;Lhv/x;)V", "", "t", "b", "(Lhv/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f<T> implements hv.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ iu.n<x<T>> f19881a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(iu.n<? super x<T>> nVar) {
            this.f19881a = nVar;
        }

        @Override // hv.f
        public void a(hv.d<T> call, x<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f19881a.resumeWith(gt.n.b(response));
        }

        @Override // hv.f
        public void b(hv.d<T> call, Throwable t8) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t8, "t");
            iu.n<x<T>> nVar = this.f19881a;
            gt.n.Companion companion = gt.n.INSTANCE;
            nVar.resumeWith(gt.n.b(gt.o.a(t8)));
        }
    }

    @nt.f(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {119}, m = "suspendAndThrow")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f19882t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f19883u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f19884v;

        public g(lt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f19883u = obj;
            this.f19884v |= Integer.MIN_VALUE;
            return p.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lt.b<?> f19885a;
        public final /* synthetic */ Throwable b;

        public h(lt.b<?> bVar, Throwable th2) {
            this.f19885a = bVar;
            this.b = th2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            lt.b bVarC = mt.b.c(this.f19885a);
            gt.n.Companion companion = gt.n.INSTANCE;
            bVarC.resumeWith(gt.n.b(gt.o.a(this.b)));
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull hv.d<T> dVar, @NotNull lt.b<? super T> bVar) {
        iu.p pVar = new iu.p(mt.b.c(bVar), 1);
        pVar.H();
        pVar.o(new a(dVar));
        dVar.m(new b(pVar));
        Object objA = pVar.A();
        if (objA == mt.c.e()) {
            nt.h.c(bVar);
        }
        return objA;
    }

    @Nullable
    public static final <T> Object b(@NotNull hv.d<T> dVar, @NotNull lt.b<? super T> bVar) {
        iu.p pVar = new iu.p(mt.b.c(bVar), 1);
        pVar.H();
        pVar.o(new c(dVar));
        dVar.m(new d(pVar));
        Object objA = pVar.A();
        if (objA == mt.c.e()) {
            nt.h.c(bVar);
        }
        return objA;
    }

    @Nullable
    public static final <T> Object c(@NotNull hv.d<T> dVar, @NotNull lt.b<? super x<T>> bVar) {
        iu.p pVar = new iu.p(mt.b.c(bVar), 1);
        pVar.H();
        pVar.o(new e(dVar));
        dVar.m(new f(pVar));
        Object objA = pVar.A();
        if (objA == mt.c.e()) {
            nt.h.c(bVar);
        }
        return objA;
    }

    @Nullable
    public static final Object d(@NotNull hv.d<Unit> dVar, @NotNull lt.b<? super Unit> bVar) {
        Intrinsics.d(dVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return b(dVar, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object e(@NotNull Throwable th2, @NotNull lt.b<?> bVar) {
        g gVar;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.f19884v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f19884v = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        Object obj = gVar.f19883u;
        Object objE = mt.c.e();
        int i11 = gVar.f19884v;
        if (i11 == 0) {
            gt.o.b(obj);
            gVar.f19882t = th2;
            gVar.f19884v = 1;
            g1.a().w(gVar.getContext(), new h(gVar, th2));
            Object objE2 = mt.c.e();
            if (objE2 == mt.c.e()) {
                nt.h.c(gVar);
            }
            if (objE2 == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gt.o.b(obj);
        }
        throw new gt.d();
    }
}
