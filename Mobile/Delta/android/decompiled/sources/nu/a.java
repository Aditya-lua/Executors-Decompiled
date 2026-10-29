package nu;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H¦@¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lnu/a;", "T", "Lnu/h;", "Lnu/c;", "<init>", "()V", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "b", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<T> implements h<T>, c<T> {

    /* JADX INFO: renamed from: nu.a$a, reason: collision with other inner class name */
    @pt.f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {226}, m = "collect")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C0448a extends pt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f26662t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f26663u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ a<T> f26664v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f26665w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0448a(a<T> aVar, nt.b<? super C0448a> bVar) {
            super(bVar);
            this.f26664v = aVar;
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f26663u = obj;
            this.f26665w |= Integer.MIN_VALUE;
            return this.f26664v.collect(null, this);
        }
    }

    @Nullable
    public abstract Object b(@NotNull i<? super T> iVar, @NotNull nt.b<? super Unit> bVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // nu.h
    @Nullable
    public final Object collect(@NotNull i<? super T> iVar, @NotNull nt.b<? super Unit> bVar) throws Throwable {
        C0448a c0448a;
        Throwable th2;
        p001ou.v vVar;
        if (bVar instanceof C0448a) {
            c0448a = (C0448a) bVar;
            int i10 = c0448a.f26665w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0448a.f26665w = i10 - Integer.MIN_VALUE;
            } else {
                c0448a = new C0448a(this, bVar);
            }
        } else {
            c0448a = new C0448a(this, bVar);
        }
        Object obj = c0448a.f26663u;
        Object objE = ot.c.e();
        int i11 = c0448a.f26665w;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (p001ou.v) c0448a.f26662t;
            try {
                jt.o.b(obj);
                vVar.releaseIntercepted();
                return Unit.f22483a;
            } catch (Throwable th3) {
                th2 = th3;
                vVar.releaseIntercepted();
                throw th2;
            }
        }
        jt.o.b(obj);
        p001ou.v vVar2 = new p001ou.v(iVar, c0448a.getContext());
        try {
            c0448a.f26662t = vVar2;
            c0448a.f26665w = 1;
            if (b(vVar2, c0448a) == objE) {
                return objE;
            }
            vVar = vVar2;
            vVar.releaseIntercepted();
            return Unit.f22483a;
        } catch (Throwable th4) {
            th2 = th4;
            vVar = vVar2;
            vVar.releaseIntercepted();
            throw th2;
        }
    }
}
