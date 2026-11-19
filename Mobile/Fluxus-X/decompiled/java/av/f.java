package av;

import com.github.luben.zstd.BuildConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a,\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001a\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0086@¢\u0006\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"T", BuildConfig.FLAVOR, "Lav/w0;", BuildConfig.FLAVOR, "a", "(Ljava/util/Collection;Leu/b;)Ljava/lang/Object;", "Lav/d2;", BuildConfig.FLAVOR, "b", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @gu.f(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {58}, m = "joinAll")
    public static final class a extends gu.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f3402t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f3403u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f3404v;

        public a(eu.b<? super a> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3403u = obj;
            this.f3404v |= Integer.MIN_VALUE;
            return f.b(null, this);
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull Collection<? extends w0<? extends T>> collection, @NotNull eu.b<? super List<? extends T>> bVar) {
        return collection.isEmpty() ? p001kotlin.collections.p.k() : new e((w0[]) collection.toArray(new w0[0])).c(bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object b(@NotNull Collection<? extends d2> collection, @NotNull eu.b<? super Unit> bVar) {
        a aVar;
        Iterator it;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f3404v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f3404v = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f3403u;
        Object objE = fu.c.e();
        int i11 = aVar.f3404v;
        if (i11 == 0) {
            zt.o.b(obj);
            it = collection.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) aVar.f3402t;
            zt.o.b(obj);
        }
        while (it.hasNext()) {
            d2 d2Var = (d2) it.next();
            aVar.f3402t = it;
            aVar.f3404v = 1;
            if (d2Var.z(aVar) == objE) {
                return objE;
            }
        }
        return Unit.f21506a;
    }
}
