package iu;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a,\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001a\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0086@¢\u0006\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"T", "", "Liu/w0;", "", "a", "(Ljava/util/Collection;Llt/b;)Ljava/lang/Object;", "Liu/d2;", "", "b", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    @nt.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {58}, m = "joinAll")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f21351t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f21352u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f21353v;

        public a(lt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21352u = obj;
            this.f21353v |= Integer.MIN_VALUE;
            return f.b(null, this);
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull Collection<? extends w0<? extends T>> collection, @NotNull lt.b<? super List<? extends T>> bVar) {
        return collection.isEmpty() ? kotlin.collections.p.k() : new e((w0[]) collection.toArray(new w0[0])).c(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object b(@NotNull Collection<? extends d2> collection, @NotNull lt.b<? super Unit> bVar) {
        a aVar;
        Iterator it;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f21353v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f21353v = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f21352u;
        Object objE = mt.c.e();
        int i11 = aVar.f21353v;
        if (i11 == 0) {
            gt.o.b(obj);
            it = collection.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) aVar.f21351t;
            gt.o.b(obj);
        }
        while (it.hasNext()) {
            d2 d2Var = (d2) it.next();
            aVar.f21351t = it;
            aVar.f21353v = 1;
            if (d2Var.F(aVar) == objE) {
                return objE;
            }
        }
        return Unit.f22938a;
    }
}
