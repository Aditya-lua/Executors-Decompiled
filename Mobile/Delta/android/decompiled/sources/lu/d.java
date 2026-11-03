package lu;

import iu.g2;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Llu/d;", "T", "Llu/c;", "Llu/h;", "flow", "<init>", "(Llu/h;)V", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "a", "Llu/h;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d<T> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h<T> flow;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i<T> f23973a;

        /* JADX INFO: renamed from: lu.d$a$a, reason: collision with other inner class name */
        @nt.f(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", l = {278}, m = "emit")
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C0420a extends nt.d {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public /* synthetic */ Object f23974t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ a<T> f23975u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f23976v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0420a(a<? super T> aVar, lt.b<? super C0420a> bVar) {
                super(bVar);
                this.f23975u = aVar;
            }

            @Override // nt.a
            public final Object invokeSuspend(Object obj) {
                this.f23974t = obj;
                this.f23976v |= Integer.MIN_VALUE;
                return this.f23975u.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(i<? super T> iVar) {
            this.f23973a = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // lu.i
        public final Object emit(T t8, lt.b<? super Unit> bVar) {
            C0420a c0420a;
            if (bVar instanceof C0420a) {
                c0420a = (C0420a) bVar;
                int i10 = c0420a.f23976v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0420a.f23976v = i10 - Integer.MIN_VALUE;
                } else {
                    c0420a = new C0420a(this, bVar);
                }
            } else {
                c0420a = new C0420a(this, bVar);
            }
            Object obj = c0420a.f23974t;
            Object objE = mt.c.e();
            int i11 = c0420a.f23976v;
            if (i11 == 0) {
                gt.o.b(obj);
                g2.g(c0420a.getContext());
                i<T> iVar = this.f23973a;
                c0420a.f23976v = 1;
                if (iVar.emit(t8, c0420a) == objE) {
                    return objE;
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

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull h<? extends T> hVar) {
        this.flow = hVar;
    }

    @Override // lu.h
    @Nullable
    public Object collect(@NotNull i<? super T> iVar, @NotNull lt.b<? super Unit> bVar) {
        Object objCollect = this.flow.collect(new a(iVar), bVar);
        return objCollect == mt.c.e() ? objCollect : Unit.f22938a;
    }
}
