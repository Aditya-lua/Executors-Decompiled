package jv;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a$\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002H\u0087@¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0087@¢\u0006\u0004\b\u0007\u0010\u0004\u001a&\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\t\u0010\u0004\u001a\u0014\u0010\f\u001a\u00020\u000b*\u00020\nH\u0080@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "T", "Ljv/d;", "a", "(Ljv/d;Lnt/b;)Ljava/lang/Object;", "b", "", "d", "Ljv/x;", "c", "", "", "e", "(Ljava/lang/Throwable;Lnt/b;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ jv.d<T> f21866a;

        public a(jv.d<T> dVar) {
            this.f21866a = dVar;
        }

        public final void a(Throwable th2) {
            this.f21866a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22483a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"jv/p$b", "Ljv/f;", "Ljv/d;", "call", "Ljv/x;", Payload.RESPONSE, "", "a", "(Ljv/d;Ljv/x;)V", "", "t", "b", "(Ljv/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements jv.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ku.n<T> f21867a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(ku.n<? super T> nVar) {
            this.f21867a = nVar;
        }

        @Override // jv.f
        public void a(jv.d<T> call, x<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!response.g()) {
                ku.n<T> nVar = this.f21867a;
                jt.n.Companion companion = jt.n.INSTANCE;
                nVar.resumeWith(jt.n.b(jt.o.a(new m(response))));
                return;
            }
            T tA = response.a();
            if (tA != null) {
                this.f21867a.resumeWith(jt.n.b(tA));
                return;
            }
            Object objTag = call.request().tag(o.class);
            Intrinsics.checkNotNull(objTag);
            o oVar = (o) objTag;
            jt.e eVar = new jt.e("Response from " + oVar.b().getName() + '.' + oVar.a().getName() + " was null but response body type was declared as non-null");
            ku.n<T> nVar2 = this.f21867a;
            jt.n.Companion companion2 = jt.n.INSTANCE;
            nVar2.resumeWith(jt.n.b(jt.o.a(eVar)));
        }

        @Override // jv.f
        public void b(jv.d<T> call, Throwable t8) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t8, "t");
            ku.n<T> nVar = this.f21867a;
            jt.n.Companion companion = jt.n.INSTANCE;
            nVar.resumeWith(jt.n.b(jt.o.a(t8)));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ jv.d<T> f21868a;

        public c(jv.d<T> dVar) {
            this.f21868a = dVar;
        }

        public final void a(Throwable th2) {
            this.f21868a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22483a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J/\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"jv/p$d", "Ljv/f;", "Ljv/d;", "call", "Ljv/x;", Payload.RESPONSE, "", "a", "(Ljv/d;Ljv/x;)V", "", "t", "b", "(Ljv/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements jv.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ku.n<T> f21869a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(ku.n<? super T> nVar) {
            this.f21869a = nVar;
        }

        @Override // jv.f
        public void a(jv.d<T> call, x<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.g()) {
                ku.n<T> nVar = this.f21869a;
                jt.n.Companion companion = jt.n.INSTANCE;
                nVar.resumeWith(jt.n.b(response.a()));
            } else {
                ku.n<T> nVar2 = this.f21869a;
                jt.n.Companion companion2 = jt.n.INSTANCE;
                nVar2.resumeWith(jt.n.b(jt.o.a(new m(response))));
            }
        }

        @Override // jv.f
        public void b(jv.d<T> call, Throwable t8) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t8, "t");
            ku.n<T> nVar = this.f21869a;
            jt.n.Companion companion = jt.n.INSTANCE;
            nVar.resumeWith(jt.n.b(jt.o.a(t8)));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ jv.d<T> f21870a;

        public e(jv.d<T> dVar) {
            this.f21870a = dVar;
        }

        public final void a(Throwable th2) {
            this.f21870a.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f22483a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"jv/p$f", "Ljv/f;", "Ljv/d;", "call", "Ljv/x;", Payload.RESPONSE, "", "a", "(Ljv/d;Ljv/x;)V", "", "t", "b", "(Ljv/d;Ljava/lang/Throwable;)V", "retrofit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f<T> implements jv.f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ku.n<x<T>> f21871a;

        /* JADX WARN: Multi-variable type inference failed */
        public f(ku.n<? super x<T>> nVar) {
            this.f21871a = nVar;
        }

        @Override // jv.f
        public void a(jv.d<T> call, x<T> response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            this.f21871a.resumeWith(jt.n.b(response));
        }

        @Override // jv.f
        public void b(jv.d<T> call, Throwable t8) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(t8, "t");
            ku.n<x<T>> nVar = this.f21871a;
            jt.n.Companion companion = jt.n.INSTANCE;
            nVar.resumeWith(jt.n.b(jt.o.a(t8)));
        }
    }

    @pt.f(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {119}, m = "suspendAndThrow")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f21872t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f21873u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f21874v;

        public g(nt.b<? super g> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21873u = obj;
            this.f21874v |= Integer.MIN_VALUE;
            return p.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ nt.b<?> f21875a;
        public final /* synthetic */ Throwable b;

        public h(nt.b<?> bVar, Throwable th2) {
            this.f21875a = bVar;
            this.b = th2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            nt.b bVarC = ot.b.c(this.f21875a);
            jt.n.Companion companion = jt.n.INSTANCE;
            bVarC.resumeWith(jt.n.b(jt.o.a(this.b)));
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull jv.d<T> dVar, @NotNull nt.b<? super T> bVar) {
        ku.p pVar = new ku.p(ot.b.c(bVar), 1);
        pVar.H();
        pVar.n(new a(dVar));
        dVar.B(new b(pVar));
        Object objA = pVar.A();
        if (objA == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objA;
    }

    @Nullable
    public static final <T> Object b(@NotNull jv.d<T> dVar, @NotNull nt.b<? super T> bVar) {
        ku.p pVar = new ku.p(ot.b.c(bVar), 1);
        pVar.H();
        pVar.n(new c(dVar));
        dVar.B(new d(pVar));
        Object objA = pVar.A();
        if (objA == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objA;
    }

    @Nullable
    public static final <T> Object c(@NotNull jv.d<T> dVar, @NotNull nt.b<? super x<T>> bVar) {
        ku.p pVar = new ku.p(ot.b.c(bVar), 1);
        pVar.H();
        pVar.n(new e(dVar));
        dVar.B(new f(pVar));
        Object objA = pVar.A();
        if (objA == ot.c.e()) {
            pt.h.c(bVar);
        }
        return objA;
    }

    @Nullable
    public static final Object d(@NotNull jv.d<Unit> dVar, @NotNull nt.b<? super Unit> bVar) {
        Intrinsics.d(dVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return b(dVar, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object e(@NotNull Throwable th2, @NotNull nt.b<?> bVar) {
        g gVar;
        if (bVar instanceof g) {
            gVar = (g) bVar;
            int i10 = gVar.f21874v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f21874v = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(bVar);
            }
        } else {
            gVar = new g(bVar);
        }
        Object obj = gVar.f21873u;
        Object objE = ot.c.e();
        int i11 = gVar.f21874v;
        if (i11 == 0) {
            jt.o.b(obj);
            gVar.f21872t = th2;
            gVar.f21874v = 1;
            g1.a().w(gVar.getContext(), new h(gVar, th2));
            Object objE2 = ot.c.e();
            if (objE2 == ot.c.e()) {
                pt.h.c(gVar);
            }
            if (objE2 == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jt.o.b(obj);
        }
        throw new jt.d();
    }
}
