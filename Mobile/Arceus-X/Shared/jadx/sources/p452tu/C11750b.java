package p452tu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C7739h0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p256ku.C7946z0;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: tu.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8F¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m31665d2 = {"Ltu/b;", "", "", "timeMillis", "<init>", "(J)V", "Ltu/l;", "select", "ignoredParam", "", "d", "(Ltu/l;Ljava/lang/Object;)V", "a", "J", "Ltu/f;", "c", "()Ltu/f;", "getSelectClause$annotations", "()V", "selectClause", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C11750b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long timeMillis;

    /* JADX INFO: renamed from: tu.b$a */
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public /* synthetic */ class a extends C7744k implements InterfaceC14057n<C11750b, InterfaceC11760l<?>, Object, Unit> {

        /* JADX INFO: renamed from: a */
        public static final a f41424a = new a();

        public a() {
            super(3, C11750b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        /* JADX INFO: renamed from: d */
        public final void m43990d(C11750b c11750b, InterfaceC11760l<?> interfaceC11760l, Object obj) {
            c11750b.m43989d(interfaceC11760l, obj);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p615zt.InterfaceC14057n
        public /* bridge */ /* synthetic */ Unit invoke(C11750b c11750b, InterfaceC11760l<?> interfaceC11760l, Object obj) {
            m43990d(c11750b, interfaceC11760l, obj);
            return Unit.f29331a;
        }
    }

    public C11750b(long j10) {
        this.timeMillis = j10;
    }

    /* JADX INFO: renamed from: e */
    public static final void m43987e(InterfaceC11760l interfaceC11760l, C11750b c11750b) {
        interfaceC11760l.mo44011f(c11750b, Unit.f29331a);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC11754f m43988c() {
        a aVar = a.f41424a;
        Intrinsics.m31981d(aVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new C11755g(this, (InterfaceC14057n) C7739h0.m32040e(aVar, 3), null, 4, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m43989d(final InterfaceC11760l<?> select, Object ignoredParam) {
        if (this.timeMillis <= 0) {
            select.mo44010b(Unit.f29331a);
            return;
        }
        Runnable runnable = new Runnable() { // from class: tu.a
            @Override // java.lang.Runnable
            public final void run() {
                C11750b.m43987e(select, this);
            }
        };
        Intrinsics.m31981d(select, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        C11759k c11759k = (C11759k) select;
        CoroutineContext context = c11759k.getContext();
        c11759k.m44015n(C7946z0.m32940d(context).mo32840f(this.timeMillis, runnable, context));
    }
}
