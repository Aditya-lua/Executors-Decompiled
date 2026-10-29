package androidx.p000lifecycle;

import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;
import d5.f;
import d5.i;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/lifecycle/k;", "", "<init>", "()V", "Ld5/f;", "registry", "Landroidx/lifecycle/l;", "lifecycle", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/n0;", "b", "(Ld5/f;Landroidx/lifecycle/l;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/n0;", "Landroidx/lifecycle/x0;", "viewModel", "", "a", "(Landroidx/lifecycle/x0;Ld5/f;Landroidx/lifecycle/l;)V", "c", "(Ld5/f;Landroidx/lifecycle/l;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f2810a = new k();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/k$a;", "Ld5/f$a;", "<init>", "()V", "Ld5/i;", "owner", "", "a", "(Ld5/i;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements f.a {
        @Override // d5.f.a
        public void a(@NotNull i owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof c1)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            b1 b1VarW = ((c1) owner).w();
            f fVarA = owner.A();
            Iterator<String> it = b1VarW.c().iterator();
            while (it.hasNext()) {
                x0 x0VarB = b1VarW.b(it.next());
                if (x0VarB != null) {
                    k.a(x0VarB, fVarA, owner.a());
                }
            }
            if (b1VarW.c().isEmpty()) {
                return;
            }
            fVarA.d(a.class);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/lifecycle/k$b", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/s;", Payload.SOURCE, "Landroidx/lifecycle/l$a;", "event", "", "g", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f2811a;
        public final /* synthetic */ f b;

        public b(l lVar, f fVar) {
            this.f2811a = lVar;
            this.b = fVar;
        }

        @Override // androidx.p000lifecycle.p
        public void g(s source, l.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == l.a.ON_START) {
                this.f2811a.d(this);
                this.b.d(a.class);
            }
        }
    }

    public static final void a(@NotNull x0 viewModel, @NotNull f registry, @NotNull l lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        n0 n0Var = (n0) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (n0Var == null || n0Var.getIsAttached()) {
            return;
        }
        n0Var.a(registry, lifecycle);
        f2810a.c(registry, lifecycle);
    }

    @NotNull
    public static final n0 b(@NotNull f registry, @NotNull l lifecycle, @Nullable String key, @Nullable Bundle defaultArgs) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(key);
        n0 n0Var = new n0(key, l0.INSTANCE.a(registry.a(key), defaultArgs));
        n0Var.a(registry, lifecycle);
        f2810a.c(registry, lifecycle);
        return n0Var;
    }

    public final void c(f registry, l lifecycle) {
        l.b state = lifecycle.getState();
        if (state == l.b.INITIALIZED || state.b(l.b.STARTED)) {
            registry.d(a.class);
        } else {
            lifecycle.a(new b(lifecycle, registry));
        }
    }
}
