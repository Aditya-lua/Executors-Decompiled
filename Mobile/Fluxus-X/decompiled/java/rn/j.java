package rn;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.github.luben.zstd.BuildConfig;
import e.p0;
import e.r0;
import nn.ViewEnvironment;
import nn.d0;
import nn.e0;
import nn.f0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB1\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lrn/j;", "Lrn/g;", BuildConfig.FLAVOR, "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", BuildConfig.FLAVOR, "defStyle", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/View;", "view", "Landroid/app/Dialog;", "g", "(Landroid/view/View;)Landroid/app/Dialog;", "initialModalRendering", "Lnn/z;", "initialViewEnvironment", "Lrn/g$a;", "b", "(Ljava/lang/Object;Lnn/z;)Lrn/g$a;", "dialogRef", BuildConfig.FLAVOR, "d", "(Lrn/g$a;)V", "e", "a", "wf1-container-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class j extends g<Object> {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()V"}, k = 3, mv = {1, 6, 0})
    public static final class b extends m implements Function0<Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f30831i = new b();

        public b() {
            super(0);
        }

        public final void b() {
        }

        @Override // p001kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            b();
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()V"}, k = 3, mv = {1, 6, 0})
    public static final class c extends m implements Function0<Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f30832i = new c();

        public c() {
            super(0);
        }

        public final void b() {
        }

        @Override // p001kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            b();
            return Unit.f21506a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final boolean f(View view, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        p0 p0VarP;
        Intrinsics.checkNotNullParameter(view, "$view");
        if (i10 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        r0 r0VarB = nn.e.b(context);
        if (r0VarB != null && (p0VarP = r0VarB.P()) != null && p0VarP.getHasEnabledCallbacks()) {
            p0VarP.i();
        }
        return true;
    }

    @Override // rn.g
    @NotNull
    public final g.a<Object> b(@NotNull Object initialModalRendering, @NotNull ViewEnvironment initialViewEnvironment) {
        Intrinsics.checkNotNullParameter(initialModalRendering, "initialModalRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        nn.d dVar = new nn.d(initialModalRendering, false, b.f30831i, 2, null);
        d0 d0Var = (d0) initialViewEnvironment.a(d0.INSTANCE);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.context");
        final View viewD = e0.d(d0Var, dVar, initialViewEnvironment, context, this, null, 16, null);
        f0.h(viewD);
        Dialog dialogG = g(viewD);
        dialogG.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: rn.i
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                return j.f(viewD, dialogInterface, i10, keyEvent);
            }
        });
        return new g.a<>(initialModalRendering, initialViewEnvironment, dialogG, viewD);
    }

    @Override // rn.g
    public void d(@NotNull g.a<Object> dialogRef) {
        Intrinsics.checkNotNullParameter(dialogRef, "dialogRef");
        nn.d dVar = new nn.d(dialogRef.f(), false, c.f30832i, 2, null);
        Object extra = dialogRef.getExtra();
        if (extra == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        f0.g((View) extra, dVar, dialogRef.getViewEnvironment());
    }

    @NotNull
    public Dialog g(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Dialog dialog = new Dialog(getContext());
        dialog.setCancelable(false);
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setLayout(-2, -2);
        Window window2 = dialog.getWindow();
        Intrinsics.checkNotNull(window2);
        window2.setBackgroundDrawable(null);
        return dialog;
    }
}
