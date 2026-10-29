package oq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r5.a;
import zt.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B)\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR1\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR*\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006("}, d2 = {"Loq/a;", "Lr5/a;", "T", "Lkq/a;", "Ldt/d;", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "inflateFn", "<init>", "(Lzt/n;)V", "Landroid/content/Context;", "context", "", "C0", "(Landroid/content/Context;)V", "inflater", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "J0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Ldt/a;", "", "c", "()Ldt/a;", "h0", "Lzt/n;", "getInflateFn", "()Lzt/n;", "Ldt/b;", "i0", "Ldt/b;", "f2", "()Ldt/b;", "setAndroidInjector", "(Ldt/b;)V", "androidInjector", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a<T extends r5.a> extends kq.a<T> implements dt.d {

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final n<LayoutInflater, ViewGroup, Boolean, T> inflateFn;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    public dt.b<Object> androidInjector;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull n<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> inflateFn) {
        Intrinsics.checkNotNullParameter(inflateFn, "inflateFn");
        this.inflateFn = inflateFn;
    }

    @Override // kq.a, androidx.fragment.app.c
    public void C0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        et.a.b(this);
        super.C0(context);
    }

    @Override // androidx.fragment.app.c
    @NotNull
    public View J0(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.J0(inflater, container, savedInstanceState);
        e2(this.inflateFn.invoke(inflater, container, Boolean.FALSE));
        View root = b2().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // dt.d
    @Nullable
    public dt.a<Object> c() {
        return f2();
    }

    @NotNull
    public final dt.b<Object> f2() {
        dt.b<Object> bVar = this.androidInjector;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.u("androidInjector");
        return null;
    }
}
