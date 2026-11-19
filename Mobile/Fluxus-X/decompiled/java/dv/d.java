package dv;

import av.g2;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Ldv/d;", "T", "Ldv/c;", "Ldv/h;", "flow", "<init>", "(Ldv/h;)V", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "a", "Ldv/h;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<T> flow;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i<T> f12730a;

        /* JADX INFO: renamed from: dv.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @gu.f(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", l = {278}, m = "emit")
        public static final class C0239a extends gu.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f12731t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a<T> f12732u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f12733v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0239a(a<? super T> aVar, eu.b<? super C0239a> bVar) {
                super(bVar);
                this.f12732u = aVar;
            }

            @Override // gu.a
            public final Object invokeSuspend(Object obj) {
                this.f12731t = obj;
                this.f12733v |= Integer.MIN_VALUE;
                return this.f12732u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(i<? super T> iVar) {
            this.f12730a = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // dv.i
        public final Object emit(T t8, eu.b<? super Unit> bVar) {
            C0239a c0239a;
            if (bVar instanceof C0239a) {
                c0239a = (C0239a) bVar;
                int i10 = c0239a.f12733v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0239a.f12733v = i10 - Integer.MIN_VALUE;
                } else {
                    c0239a = new C0239a(this, bVar);
                }
            } else {
                c0239a = new C0239a(this, bVar);
            }
            Object obj = c0239a.f12731t;
            Object objE = fu.c.e();
            int i11 = c0239a.f12733v;
            if (i11 == 0) {
                zt.o.b(obj);
                g2.i(c0239a.getContext());
                i<T> iVar = this.f12730a;
                c0239a.f12733v = 1;
                if (iVar.emit(t8, c0239a) == objE) {
                    return objE;
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

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull h<? extends T> hVar) {
        this.flow = hVar;
    }

    @Override // dv.h
    @Nullable
    public Object collect(@NotNull i<? super T> iVar, @NotNull eu.b<? super Unit> bVar) {
        Object objCollect = this.flow.collect(new a(iVar), bVar);
        return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
    }
}
