package jv;

import av.p;
import av.p0;
import av.q0;
import av.r0;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ljv/e;", "R", "Ljv/k;", "Leu/b;", "uCont", "<init>", "(Leu/b;)V", BuildConfig.FLAVOR, "B", "()Ljava/lang/Object;", BuildConfig.FLAVOR, "e", BuildConfig.FLAVOR, "C", "(Ljava/lang/Throwable;)V", "Lav/p;", "g", "Lav/p;", "cont", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e<R> extends k<R> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p<R> cont;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 1, 0})
    @gu.f(c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", f = "SelectOld.kt", l = {39}, m = "invokeSuspend")
    public static final class a extends gu.m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f20927t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ e<R> f20928u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e<R> eVar, eu.b<? super a> bVar) {
            super(2, bVar);
            this.f20928u = eVar;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new a(this.f20928u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((a) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            Object objE = fu.c.e();
            int i10 = this.f20927t;
            try {
                if (i10 == 0) {
                    zt.o.b(obj);
                    e<R> eVar = this.f20928u;
                    this.f20927t = 1;
                    obj = eVar.o(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zt.o.b(obj);
                }
                n.c(this.f20928u.cont, obj);
                return Unit.f21506a;
            } catch (Throwable th2) {
                n.d(this.f20928u.cont, th2);
                return Unit.f21506a;
            }
        }
    }

    public e(@NotNull eu.b<? super R> bVar) {
        super(bVar.getContext());
        this.cont = new p<>(fu.b.c(bVar), 1);
    }

    @Nullable
    public final Object B() {
        if (this.cont.d()) {
            return this.cont.y();
        }
        av.k.d(q0.a(getContext()), null, r0.UNDISPATCHED, new a(this, null), 1, null);
        return this.cont.y();
    }

    public final void C(@NotNull Throwable e10) {
        p<R> pVar = this.cont;
        zt.n.Companion companion = zt.n.INSTANCE;
        pVar.resumeWith(zt.n.b(zt.o.a(e10)));
    }
}
