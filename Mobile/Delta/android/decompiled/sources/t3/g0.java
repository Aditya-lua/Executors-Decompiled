package t3;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lt3/f0;", "a", "(Lt3/f0;Lnt/b;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"T", "Lt3/y;", "", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @pt.f(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {74}, m = "invokeSuspend")
    public static final class a<T> extends pt.m implements zt.n<y<T>, Boolean, nt.b<? super T>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f31372t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f31373u;

        public a(nt.b<? super a> bVar) {
            super(3, bVar);
        }

        @Override // zt.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool, Object obj2) {
            return q((y) obj, bool.booleanValue(), (nt.b) obj2);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objE = ot.c.e();
            int i10 = this.f31372t;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jt.o.b(obj);
                return obj;
            }
            jt.o.b(obj);
            y yVar = (y) this.f31373u;
            this.f31372t = 1;
            Object objA = yVar.a(this);
            return objA == objE ? objE : objA;
        }

        @Nullable
        public final Object q(@NotNull y<T> yVar, boolean z10, @Nullable nt.b<? super T> bVar) {
            a aVar = new a(bVar);
            aVar.f31373u = yVar;
            return aVar.invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> Object a(@NotNull f0<T> f0Var, @NotNull nt.b<? super T> bVar) {
        return f0Var.d(new a(null), bVar);
    }
}
