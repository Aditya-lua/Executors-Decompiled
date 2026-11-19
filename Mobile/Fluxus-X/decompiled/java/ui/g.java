package ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o0;
import androidx.core.view.y;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lui/g;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/view/View;", "view", BuildConfig.FLAVOR, "b", "(Landroid/view/View;)V", BuildConfig.FLAVOR, "top", "d", "(Landroid/view/View;I)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f33337a = new g();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"ui/g$a", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", BuildConfig.FLAVOR, "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f33338a;

        public a(View view) {
            this.f33338a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f33338a.removeOnAttachStateChangeListener(this);
            o0.j0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static final void b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        o0.A0(view, new y() { // from class: ui.f
            @Override // androidx.core.view.y
            public final WindowInsetsCompat J(View view2, WindowInsetsCompat windowInsetsCompat) {
                return g.c(view2, windowInsetsCompat);
            }
        });
        if (view.isAttachedToWindow()) {
            o0.j0(view);
        } else {
            view.addOnAttachStateChangeListener(new a(view));
        }
    }

    public static final WindowInsetsCompat c(View v8, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v8, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        int i10 = insets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout()).top;
        f33337a.d(v8, i10);
        return insets.inset(0, i10, 0, 0);
    }

    public final void d(View view, int top) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null || marginLayoutParams.topMargin == top) {
            return;
        }
        marginLayoutParams.topMargin = top;
        view.setLayoutParams(marginLayoutParams);
    }
}
