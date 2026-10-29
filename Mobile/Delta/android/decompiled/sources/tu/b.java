package tu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import ku.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8F¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Ltu/b;", "", "", "timeMillis", "<init>", "(J)V", "Ltu/l;", "select", "ignoredParam", "", "d", "(Ltu/l;Ljava/lang/Object;)V", "a", "J", "Ltu/f;", "c", "()Ltu/f;", "getSelectClause$annotations", "()V", "selectClause", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final long timeMillis;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.k implements zt.n<b, l<?>, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31972a = new a();

        public a() {
            super(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void d(b bVar, l<?> lVar, Object obj) {
            bVar.d(lVar, obj);
        }

        @Override // zt.n
        public /* bridge */ /* synthetic */ Unit invoke(b bVar, l<?> lVar, Object obj) {
            d(bVar, lVar, obj);
            return Unit.f22483a;
        }
    }

    public b(long j10) {
        this.timeMillis = j10;
    }

    public static final void e(l lVar, b bVar) {
        lVar.f(bVar, Unit.f22483a);
    }

    @NotNull
    public final f c() {
        a aVar = a.f31972a;
        Intrinsics.d(aVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new g(this, (zt.n) h0.e(aVar, 3), null, 4, null);
    }

    public final void d(final l<?> select, Object ignoredParam) {
        if (this.timeMillis <= 0) {
            select.b(Unit.f22483a);
            return;
        }
        Runnable runnable = new Runnable() { // from class: tu.a
            @Override // java.lang.Runnable
            public final void run() {
                b.e(select, this);
            }
        };
        Intrinsics.d(select, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        k kVar = (k) select;
        CoroutineContext context = kVar.getContext();
        kVar.n(z0.d(context).f(this.timeMillis, runnable, context));
    }
}
