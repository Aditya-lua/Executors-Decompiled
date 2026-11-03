package lu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u001a6\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a:\u0010\t\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "Llu/h;", "", "destination", "", "b", "(Llu/h;Ljava/util/List;Llt/b;)Ljava/lang/Object;", "", "C", "a", "(Llu/h;Ljava/util/Collection;Llt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class n {

    @nt.f(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", l = {22}, m = "toCollection")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T, C extends Collection<? super T>> extends nt.d {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f24031t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f24032u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f24033v;

        public a(lt.b<? super a> bVar) {
            super(bVar);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24032u = obj;
            this.f24033v |= Integer.MIN_VALUE;
            return j.P(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements i {

        /* JADX INFO: Incorrect field signature: TC; */
        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Collection f24034a;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public b(Collection collection) {
            this.f24034a = collection;
        }

        @Override // lu.i
        public final Object emit(T t8, lt.b<? super Unit> bVar) {
            this.f24034a.add(t8);
            return Unit.f22938a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T, C extends Collection<? super T>> Object a(@NotNull h<? extends T> hVar, @NotNull C c10, @NotNull lt.b<? super C> bVar) {
        a aVar;
        if (bVar instanceof a) {
            aVar = (a) bVar;
            int i10 = aVar.f24033v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f24033v = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(bVar);
            }
        } else {
            aVar = new a(bVar);
        }
        Object obj = aVar.f24032u;
        Object objE = mt.c.e();
        int i11 = aVar.f24033v;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Collection collection = (Collection) aVar.f24031t;
            gt.o.b(obj);
            return collection;
        }
        gt.o.b(obj);
        i<? super Object> bVar2 = new b<>(c10);
        aVar.f24031t = c10;
        aVar.f24033v = 1;
        return hVar.collect(bVar2, aVar) == objE ? objE : c10;
    }

    @Nullable
    public static final <T> Object b(@NotNull h<? extends T> hVar, @NotNull List<T> list, @NotNull lt.b<? super List<? extends T>> bVar) {
        return j.P(hVar, list, bVar);
    }

    public static /* synthetic */ Object c(h hVar, List list, lt.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return j.Q(hVar, list, bVar);
    }
}
