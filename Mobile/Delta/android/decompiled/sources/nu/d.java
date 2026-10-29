package nu;

import kotlin.Metadata;
import kotlin.Unit;
import ku.g2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lnu/d;", "T", "Lnu/c;", "Lnu/h;", "flow", "<init>", "(Lnu/h;)V", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "a", "Lnu/h;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<T> flow;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i<T> f26684a;

        /* JADX INFO: renamed from: nu.d$a$a, reason: collision with other inner class name */
        @pt.f(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", l = {278}, m = "emit")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0452a extends pt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f26685t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a<T> f26686u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f26687v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0452a(a<? super T> aVar, nt.b<? super C0452a> bVar) {
                super(bVar);
                this.f26686u = aVar;
            }

            @Override // pt.a
            public final Object invokeSuspend(Object obj) {
                this.f26685t = obj;
                this.f26687v |= Integer.MIN_VALUE;
                return this.f26686u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(i<? super T> iVar) {
            this.f26684a = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // nu.i
        public final Object emit(T t8, nt.b<? super Unit> bVar) {
            C0452a c0452a;
            if (bVar instanceof C0452a) {
                c0452a = (C0452a) bVar;
                int i10 = c0452a.f26687v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0452a.f26687v = i10 - Integer.MIN_VALUE;
                } else {
                    c0452a = new C0452a(this, bVar);
                }
            } else {
                c0452a = new C0452a(this, bVar);
            }
            Object obj = c0452a.f26685t;
            Object objE = ot.c.e();
            int i11 = c0452a.f26687v;
            if (i11 == 0) {
                jt.o.b(obj);
                g2.f(c0452a.getContext());
                i<T> iVar = this.f26684a;
                c0452a.f26687v = 1;
                if (iVar.emit(t8, c0452a) == objE) {
                    return objE;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
            }
            return Unit.f22483a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull h<? extends T> hVar) {
        this.flow = hVar;
    }

    @Override // nu.h
    @Nullable
    public Object collect(@NotNull i<? super T> iVar, @NotNull nt.b<? super Unit> bVar) {
        Object objCollect = this.flow.collect(new a(iVar), bVar);
        return objCollect == ot.c.e() ? objCollect : Unit.f22483a;
    }
}
