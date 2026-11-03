package lu;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H¦@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Llu/a;", "T", "Llu/h;", "Llu/c;", "<init>", "()V", "Llu/i;", "collector", "", "collect", "(Llu/i;Llt/b;)Ljava/lang/Object;", "b", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<T> implements h<T>, c<T> {

    /* JADX INFO: renamed from: lu.a$a, reason: collision with other inner class name */
    @nt.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {226}, m = "collect")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C0416a extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f23951t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f23952u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ a<T> f23953v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f23954w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0416a(a<T> aVar, lt.b<? super C0416a> bVar) {
            super(bVar);
            this.f23953v = aVar;
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f23952u = obj;
            this.f23954w |= Integer.MIN_VALUE;
            return this.f23953v.collect(null, this);
        }
    }

    @Nullable
    public abstract Object b(@NotNull i<? super T> iVar, @NotNull lt.b<? super Unit> bVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // lu.h
    @Nullable
    public final Object collect(@NotNull i<? super T> iVar, @NotNull lt.b<? super Unit> bVar) throws Throwable {
        C0416a c0416a;
        Throwable th2;
        p001mu.v vVar;
        if (bVar instanceof C0416a) {
            c0416a = (C0416a) bVar;
            int i10 = c0416a.f23954w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0416a.f23954w = i10 - Integer.MIN_VALUE;
            } else {
                c0416a = new C0416a(this, bVar);
            }
        } else {
            c0416a = new C0416a(this, bVar);
        }
        Object obj = c0416a.f23952u;
        Object objE = mt.c.e();
        int i11 = c0416a.f23954w;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (p001mu.v) c0416a.f23951t;
            try {
                gt.o.b(obj);
                vVar.releaseIntercepted();
                return Unit.f22938a;
            } catch (Throwable th3) {
                th2 = th3;
                vVar.releaseIntercepted();
                throw th2;
            }
        }
        gt.o.b(obj);
        p001mu.v vVar2 = new p001mu.v(iVar, c0416a.getContext());
        try {
            c0416a.f23951t = vVar2;
            c0416a.f23954w = 1;
            if (b(vVar2, c0416a) == objE) {
                return objE;
            }
            vVar = vVar2;
            vVar.releaseIntercepted();
            return Unit.f22938a;
        } catch (Throwable th4) {
            th2 = th4;
            vVar = vVar2;
            vVar.releaseIntercepted();
            throw th2;
        }
    }
}
