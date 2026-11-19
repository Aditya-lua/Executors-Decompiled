package sw;

import av.g1;
import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a$\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H\u0087@¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0087@¢\u0006\u0004\b\u0007\u0010\u0004\u001a&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\t\u0010\u0004\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\nH\u0080@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {BuildConfig.FLAVOR, "T", "Lsw/d;", "a", "(Lsw/d;Leu/b;)Ljava/lang/Object;", "b", BuildConfig.FLAVOR, "d", "Lsw/x;", "c", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "e", "(Ljava/lang/Throwable;Leu/b;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sw.d<T> f31973a;

        public a(sw.d<T> dVar) {
            this.f31973a = dVar;
        }

        public final void a(Throwable th2) {
            this.f31973a.cancel();
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f21506a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"sw/p$b", "Lsw/f;", "Lsw/d;", "call", "Lsw/x;", Payload.RESPONSE, BuildConfig.FLAVOR, "b", "(Lsw/d;Lsw/x;)V", BuildConfig.FLAVOR, "t", "a", "(Lsw/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements sw.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ av.n<T> f31974a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(av.n<? super T> nVar) {
            this.f31974a = nVar;
        }

        @Override // sw.f
        public void a(sw.d<T> call, Throwable t8) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t8, "t");
            av.n<T> nVar = this.f31974a;
            zt.n.Companion companion = zt.n.INSTANCE;
            nVar.resumeWith(zt.n.b(zt.o.a(t8)));
        }

        @Override // sw.f
        public void b(sw.d<T> call, x<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!response.g()) {
                av.n<T> nVar = this.f31974a;
                zt.n.Companion companion = zt.n.INSTANCE;
                nVar.resumeWith(zt.n.b(zt.o.a(new m(response))));
                return;
            }
            T tA = response.a();
            if (tA != null) {
                this.f31974a.resumeWith(zt.n.b(tA));
                return;
            }
            Object objK = call.h().k(o.class);
            Intrinsics.checkNotNull(objK);
            o oVar = (o) objK;
            zt.e eVar = new zt.e("Response from " + oVar.b().getName() + '.' + oVar.a().getName() + " was null but response body type was declared as non-null");
            av.n<T> nVar2 = this.f31974a;
            zt.n.Companion companion2 = zt.n.INSTANCE;
            nVar2.resumeWith(zt.n.b(zt.o.a(eVar)));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sw.d<T> f31975a;

        public c(sw.d<T> dVar) {
            this.f31975a = dVar;
        }

        public final void a(Throwable th2) {
            this.f31975a.cancel();
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f21506a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J/\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"sw/p$d", "Lsw/f;", "Lsw/d;", "call", "Lsw/x;", Payload.RESPONSE, BuildConfig.FLAVOR, "b", "(Lsw/d;Lsw/x;)V", BuildConfig.FLAVOR, "t", "a", "(Lsw/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements sw.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ av.n<T> f31976a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(av.n<? super T> nVar) {
            this.f31976a = nVar;
        }

        @Override // sw.f
        public void a(sw.d<T> call, Throwable t8) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t8, "t");
            av.n<T> nVar = this.f31976a;
            zt.n.Companion companion = zt.n.INSTANCE;
            nVar.resumeWith(zt.n.b(zt.o.a(t8)));
        }

        @Override // sw.f
        public void b(sw.d<T> call, x<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.g()) {
                av.n<T> nVar = this.f31976a;
                zt.n.Companion companion = zt.n.INSTANCE;
                nVar.resumeWith(zt.n.b(response.a()));
            } else {
                av.n<T> nVar2 = this.f31976a;
                zt.n.Companion companion2 = zt.n.INSTANCE;
                nVar2.resumeWith(zt.n.b(zt.o.a(new m(response))));
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ sw.d<T> f31977a;

        public e(sw.d<T> dVar) {
            this.f31977a = dVar;
        }

        public final void a(Throwable th2) {
            this.f31977a.cancel();
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f21506a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"sw/p$f", "Lsw/f;", "Lsw/d;", "call", "Lsw/x;", Payload.RESPONSE, BuildConfig.FLAVOR, "b", "(Lsw/d;Lsw/x;)V", BuildConfig.FLAVOR, "t", "a", "(Lsw/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f<T> implements sw.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ av.n<x<T>> f31978a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(av.n<? super x<T>> nVar) {
            this.f31978a = nVar;
        }

        @Override // sw.f
        public void a(sw.d<T> call, Throwable t8) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t8, "t");
            av.n<x<T>> nVar = this.f31978a;
            zt.n.Companion companion = zt.n.INSTANCE;
            nVar.resumeWith(zt.n.b(zt.o.a(t8)));
        }

        @Override // sw.f
        public void b(sw.d<T> call, x<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f31978a.resumeWith(zt.n.b(response));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {119}, m = "suspendAndThrow")
    public static final class g extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f31979t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31980u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f31981v;

        public g(eu.b<? super g> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31980u = obj;
            this.f31981v |= Integer.MIN_VALUE;
            return p.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eu.b<?> f31982a;
        public final /* synthetic */ Throwable b;

        public h(eu.b<?> bVar, Throwable th2) {
            this.f31982a = bVar;
            this.b = th2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            eu.b bVarC = fu.b.c(this.f31982a);
            zt.n.Companion companion = zt.n.INSTANCE;
            bVarC.resumeWith(zt.n.b(zt.o.a(this.b)));
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull sw.d<T> dVar, @NotNull eu.b<? super T> bVar) {
        av.p pVar = new av.p(fu.b.c(bVar), 1);
        pVar.G();
        pVar.j(new a(dVar));
        dVar.L(new b(pVar));
        Object objY = pVar.y();
        if (objY == fu.c.e()) {
            gu.h.c(bVar);
        }
        return objY;
    }

    @Nullable
    public static final <T> Object b(@NotNull sw.d<T> dVar, @NotNull eu.b<? super T> bVar) {
        av.p pVar = new av.p(fu.b.c(bVar), 1);
        pVar.G();
        pVar.j(new c(dVar));
        dVar.L(new d(pVar));
        Object objY = pVar.y();
        if (objY == fu.c.e()) {
            gu.h.c(bVar);
        }
        return objY;
    }

    @Nullable
    public static final <T> Object c(@NotNull sw.d<T> dVar, @NotNull eu.b<? super x<T>> bVar) {
        av.p pVar = new av.p(fu.b.c(bVar), 1);
        pVar.G();
        pVar.j(new e(dVar));
        dVar.L(new f(pVar));
        Object objY = pVar.y();
        if (objY == fu.c.e()) {
            gu.h.c(bVar);
        }
        return objY;
    }

    @Nullable
    public static final Object d(@NotNull sw.d<Unit> dVar, @NotNull eu.b<? super Unit> bVar) {
        Intrinsics.d(dVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return b(dVar, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object e(@NotNull Throwable th2, @NotNull eu.b<?> bVar) {
        g gVar;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.f31981v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f31981v = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        Object obj = gVar.f31980u;
        Object objE = fu.c.e();
        int i11 = gVar.f31981v;
        if (i11 == 0) {
            zt.o.b(obj);
            gVar.f31979t = th2;
            gVar.f31981v = 1;
            g1.a().I(gVar.getContext(), new h(gVar, th2));
            Object objE2 = fu.c.e();
            if (objE2 == fu.c.e()) {
                gu.h.c(gVar);
            }
            if (objE2 == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zt.o.b(obj);
        }
        throw new zt.d();
    }
}
