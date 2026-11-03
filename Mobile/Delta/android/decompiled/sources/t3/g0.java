package t3;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lt3/f0;", "a", "(Lt3/f0;Llt/b;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @nt.f(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {74}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"T", "Lt3/y;", "", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> extends nt.m implements xt.n<y<T>, Boolean, lt.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31891t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31892u;

        public a(lt.b<? super a> bVar) {
            super(3, bVar);
        }

        @Override // xt.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool, Object obj2) {
            return m((y) obj, bool.booleanValue(), (lt.b) obj2);
        }

        @Override // nt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = mt.c.e();
            int i10 = this.f31891t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gt.o.b(obj);
                return obj;
            }
            gt.o.b(obj);
            y yVar = (y) this.f31892u;
            this.f31891t = 1;
            Object objE2 = yVar.e(this);
            return objE2 == objE ? objE : objE2;
        }

        @Nullable
        public final Object m(@NotNull y<T> yVar, boolean z10, @Nullable lt.b<? super T> bVar) {
            a aVar = new a(bVar);
            aVar.f31892u = yVar;
            return aVar.invokeSuspend(Unit.f22938a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> Object a(@NotNull f0<T> f0Var, @NotNull lt.b<? super T> bVar) {
        return f0Var.b(new a(null), bVar);
    }
}
