package p341oq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import et.C5214a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086dt.C4688b;
import p086dt.InterfaceC4687a;
import p086dt.InterfaceC4690d;
import p253kq.C7810a;
import p402r5.InterfaceC10784a;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: oq.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B)\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR1\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR*\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, m31665d2 = {"Loq/a;", "Lr5/a;", "T", "Lkq/a;", "Ldt/d;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "inflateFn", "<init>", "(Lzt/n;)V", "Landroid/content/Context;", "context", "", "C0", "(Landroid/content/Context;)V", "inflater", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Ldt/a;", "", "c", "()Ldt/a;", "h0", "Lzt/n;", "getInflateFn", "()Lzt/n;", "Ldt/b;", "i0", "Ldt/b;", "f2", "()Ldt/b;", "setAndroidInjector", "(Ldt/b;)V", "androidInjector", "shared_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC9842a<T extends InterfaceC10784a> extends C7810a<T> implements InterfaceC4690d {

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC14057n<LayoutInflater, ViewGroup, Boolean, T> inflateFn;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public C4688b<Object> androidInjector;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: zt.n<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends T extends r5.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC9842a(@NotNull InterfaceC14057n<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> inflateFn) {
        Intrinsics.checkNotNullParameter(inflateFn, "inflateFn");
        this.inflateFn = inflateFn;
    }

    @Override // p253kq.C7810a, androidx.fragment.app.ComponentCallbacksC0929c
    /* JADX INFO: renamed from: C0 */
    public void mo4590C0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C5214a.m24168b(this);
        super.mo4590C0(context);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC0929c
    @NotNull
    /* JADX INFO: renamed from: J0 */
    public View mo1225J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.mo1225J0(inflater, container, savedInstanceState);
        m32424e2(this.inflateFn.invoke(inflater, container, Boolean.FALSE));
        View root = m32421b2().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // p086dt.InterfaceC4690d
    @Nullable
    /* JADX INFO: renamed from: c */
    public InterfaceC4687a<Object> mo18834c() {
        return m38730f2();
    }

    @NotNull
    /* JADX INFO: renamed from: f2 */
    public final C4688b<Object> m38730f2() {
        C4688b<Object> c4688b = this.androidInjector;
        if (c4688b != null) {
            return c4688b;
        }
        Intrinsics.m31998u("androidInjector");
        return null;
    }
}
