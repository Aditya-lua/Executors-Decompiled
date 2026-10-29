package eh;

import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import ku.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"Leh/i;", "", "Lil/c;", "designFoundations", "Ljava/lang/Runnable;", "onTokensChanged", "<init>", "(Lil/c;Ljava/lang/Runnable;)V", "", "b", "()V", "c", "a", "Lil/c;", "Ljava/lang/Runnable;", "Lku/p0;", "Lku/p0;", "scope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final il.c designFoundations;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Runnable onTokensChanged;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public p0 scope;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @pt.f(c = "com.roblox.client.components.ToolbarTokensObserver$start$1", f = "ToolbarTokensObserver.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<Unit, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f15557t;

        public a(nt.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return i.this.new a(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f15557t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            i.this.onTokensChanged.run();
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, nt.b<? super Unit> bVar) {
            return ((a) create(unit, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public i(@NotNull il.c designFoundations, @NotNull Runnable onTokensChanged) {
        Intrinsics.checkNotNullParameter(designFoundations, "designFoundations");
        Intrinsics.checkNotNullParameter(onTokensChanged, "onTokensChanged");
        this.designFoundations = designFoundations;
        this.onTokensChanged = onTokensChanged;
    }

    public final void b() {
        this.scope = q0.b();
        nu.h hVarE = nu.j.E(this.designFoundations.a(), new a(null));
        p0 p0Var = this.scope;
        Intrinsics.checkNotNull(p0Var);
        nu.j.z(hVarE, p0Var);
    }

    public final void c() {
        p0 p0Var = this.scope;
        if (p0Var != null) {
            q0.f(p0Var, null, 1, null);
        }
        this.scope = null;
    }
}
