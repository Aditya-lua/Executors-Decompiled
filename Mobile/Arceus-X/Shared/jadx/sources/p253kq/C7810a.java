package p253kq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.ComponentCallbacksC0929c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p316o.C9611d;
import p402r5.InterfaceC10784a;
import p497vp.C12245h;

/* JADX INFO: renamed from: kq.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0017\u0010\u0005J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010\t\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006%"}, m31665d2 = {"Lkq/a;", "Lr5/a;", "T", "Landroidx/fragment/app/c;", "<init>", "()V", "", "d2", "()Z", "binding", "", "e2", "(Lr5/a;)V", "Landroid/content/Context;", "context", "C0", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/LayoutInflater;", "O0", "(Landroid/os/Bundle;)Landroid/view/LayoutInflater;", "M0", "N0", "x", "()Landroid/content/Context;", "Lkq/d;", "c2", "()Lkq/d;", "f0", "Lr5/a;", "_binding", "g0", "Landroid/content/Context;", "themedContext", "b2", "()Lr5/a;", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public class C7810a<T extends InterfaceC10784a> extends ComponentCallbacksC0929c {

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    @Nullable
    public T _binding;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    @Nullable
    public Context themedContext;

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: C0 */
    public void mo4590C0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.mo4590C0(context);
        InterfaceC7813d interfaceC7813dM32422c2 = m32422c2();
        if (interfaceC7813dM32422c2 == null || !interfaceC7813dM32422c2.isInline()) {
            this.themedContext = context;
        } else {
            Integer theme = interfaceC7813dM32422c2.getTheme();
            this.themedContext = new C9611d(context, (theme == null || theme.intValue() == 0) ? C12245h.f43273c : theme.intValue());
        }
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: M0 */
    public void mo4618M0() {
        super.mo4618M0();
        this._binding = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: N0 */
    public void mo4621N0() {
        super.mo4621N0();
        this.themedContext = null;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    @NotNull
    /* JADX INFO: renamed from: O0 */
    public LayoutInflater mo4624O0(@Nullable Bundle savedInstanceState) {
        LayoutInflater layoutInflaterMo4624O0 = super.mo4624O0(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterMo4624O0, "onGetLayoutInflater(...)");
        Context contextMo4715x = this.themedContext;
        if (contextMo4715x == null) {
            contextMo4715x = mo4715x();
        }
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterMo4624O0.cloneInContext(contextMo4715x);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterCloneInContext, "cloneInContext(...)");
        return layoutInflaterCloneInContext;
    }

    @NotNull
    /* JADX INFO: renamed from: b2 */
    public final T m32421b2() {
        T t8 = this._binding;
        Intrinsics.checkNotNull(t8);
        return t8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: androidx.fragment.app.c */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: androidx.fragment.app.c */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: androidx.fragment.app.c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c2 */
    public final InterfaceC7813d m32422c2() {
        for (ComponentCallbacksC0929c componentCallbacksC0929cM4612K = m4612K(); componentCallbacksC0929cM4612K != 0; componentCallbacksC0929cM4612K = componentCallbacksC0929cM4612K.m4612K()) {
            if (componentCallbacksC0929cM4612K instanceof InterfaceC7813d) {
                return (InterfaceC7813d) componentCallbacksC0929cM4612K;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d2 */
    public final boolean m32423d2() {
        return this._binding != null;
    }

    /* JADX INFO: renamed from: e2 */
    public final void m32424e2(@NotNull T binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this._binding = binding;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    @Nullable
    /* JADX INFO: renamed from: x */
    public Context mo4715x() {
        Context context = this.themedContext;
        return context == null ? super.mo4715x() : context;
    }
}
