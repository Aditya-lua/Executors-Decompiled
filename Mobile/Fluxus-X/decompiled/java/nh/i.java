package nh;

import av.p0;
import av.q0;
import com.github.luben.zstd.BuildConfig;
import gu.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lnh/i;", BuildConfig.FLAVOR, "Lwl/c;", "designFoundations", "Ljava/lang/Runnable;", "onTokensChanged", "<init>", "(Lwl/c;Ljava/lang/Runnable;)V", BuildConfig.FLAVOR, "b", "()V", "c", "a", "Lwl/c;", "Ljava/lang/Runnable;", "Lav/p0;", "Lav/p0;", "scope", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wl.c designFoundations;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Runnable onTokensChanged;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public p0 scope;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "it"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.components.ToolbarTokensObserver$start$1", f = "ToolbarTokensObserver.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends m implements Function2<Unit, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f25627t;

        public a(eu.b<? super a> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return i.this.new a(bVar);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f25627t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            i.this.onTokensChanged.run();
            return Unit.f21506a;
        }

        @Override // p001kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Unit unit, eu.b<? super Unit> bVar) {
            return ((a) create(unit, bVar)).invokeSuspend(Unit.f21506a);
        }
    }

    public i(@NotNull wl.c designFoundations, @NotNull Runnable onTokensChanged) {
        Intrinsics.checkNotNullParameter(designFoundations, "designFoundations");
        Intrinsics.checkNotNullParameter(onTokensChanged, "onTokensChanged");
        this.designFoundations = designFoundations;
        this.onTokensChanged = onTokensChanged;
    }

    public final void b() {
        this.scope = q0.b();
        dv.h hVarE = dv.j.E(this.designFoundations.a(), new a(null));
        p0 p0Var = this.scope;
        Intrinsics.checkNotNull(p0Var);
        dv.j.z(hVarE, p0Var);
    }

    public final void c() {
        p0 p0Var = this.scope;
        if (p0Var != null) {
            q0.f(p0Var, null, 1, null);
        }
        this.scope = null;
    }
}
