package yq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.github.luben.zstd.BuildConfig;
import f4.q;
import jq.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import s5.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0017\u0010\u0005J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010\t\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lyq/a;", "Ls5/a;", "T", "Lf4/q;", "<init>", "()V", BuildConfig.FLAVOR, "d2", "()Z", "binding", BuildConfig.FLAVOR, "e2", "(Ls5/a;)V", "Landroid/content/Context;", "context", "C0", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/LayoutInflater;", "O0", "(Landroid/os/Bundle;)Landroid/view/LayoutInflater;", "M0", "N0", "v", "()Landroid/content/Context;", "Lyq/d;", "c2", "()Lyq/d;", "f0", "Ls5/a;", "_binding", "g0", "Landroid/content/Context;", "themedContext", "b2", "()Ls5/a;", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class a<T extends s5.a> extends q {

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public T _binding;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Context themedContext;

    @Override // f4.q
    public void C0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.C0(context);
        d dVarC2 = c2();
        if (dVarC2 == null || !dVarC2.isInline()) {
            this.themedContext = context;
        } else {
            Integer theme = dVarC2.getTheme();
            this.themedContext = new o.d(context, (theme == null || theme.intValue() == 0) ? h.f20898c : theme.intValue());
        }
    }

    @Override // f4.q
    public void M0() {
        super.M0();
        this._binding = null;
    }

    @Override // f4.q
    public void N0() {
        super.N0();
        this.themedContext = null;
    }

    @Override // f4.q
    @NotNull
    public LayoutInflater O0(@Nullable Bundle savedInstanceState) {
        LayoutInflater layoutInflaterO0 = super.O0(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterO0, "onGetLayoutInflater(...)");
        Context contextV = this.themedContext;
        if (contextV == null) {
            contextV = v();
        }
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterO0.cloneInContext(contextV);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterCloneInContext, "cloneInContext(...)");
        return layoutInflaterCloneInContext;
    }

    @NotNull
    public final T b2() {
        T t8 = this._binding;
        Intrinsics.checkNotNull(t8);
        return t8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d c2() {
        for (q qVarJ = J(); qVarJ != 0; qVarJ = qVarJ.J()) {
            if (qVarJ instanceof d) {
                return (d) qVarJ;
            }
        }
        return null;
    }

    public final boolean d2() {
        return this._binding != null;
    }

    public final void e2(@NotNull T binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this._binding = binding;
    }

    @Override // f4.q
    @Nullable
    public Context v() {
        Context context = this.themedContext;
        return context == null ? super.v() : context;
    }
}
