package jq;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import e.r0;
import e.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a)\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a.\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000e*\u00020\r*\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0082\u0010¢\u0006\u0004\b\u0012\u0010\u0013\",\u0010\u001a\u001a\u0004\u0018\u00010\u0014*\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroid/view/View;", "Le/r0;", "c", "(Landroid/view/View;)Le/r0;", "", "enabled", "Lkotlin/Function0;", "", "onBack", "f", "(Landroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "e", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "", "T", "Landroid/content/Context;", "Lhu/c;", "ownerClass", "d", "(Landroid/content/Context;Lhu/c;)Ljava/lang/Object;", "Ljq/p;", "value", "b", "(Landroid/view/View;)Ljq/p;", "h", "(Landroid/view/View;Ljq/p;)V", "onBackPressedCallbackOrNull", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m0 {
    public static final p b(View view) {
        return (p) view.getTag(t.f21673u);
    }

    @Nullable
    public static final r0 c(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        r0 r0VarA = w0.a(view);
        if (r0VarA != null) {
            return r0VarA;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return (r0) d(context, kotlin.jvm.internal.d0.b(r0.class));
    }

    public static final <T> T d(Context context, hu.c<T> cVar) {
        while (!cVar.b(context)) {
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == null) {
                return null;
            }
        }
        return (T) hu.d.a(cVar, context);
    }

    public static final void e(@NotNull View view, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (function0 != null) {
            f(view, true, function0);
        } else {
            f(view, false, new Function0() { // from class: jq.l0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m0.g();
                }
            });
        }
    }

    public static final void f(@NotNull View view, boolean z10, @NotNull Function0<Unit> onBack) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        p pVarB = b(view);
        if (pVarB == null) {
            pVarB = new p();
            h(view, pVarB);
            view.addOnAttachStateChangeListener(pVarB);
            r0 r0VarC = c(view);
            e.p0 p0VarQ = r0VarC != null ? r0VarC.Q() : null;
            if (p0VarQ == null) {
                throw new IllegalArgumentException(("Unable to find a onBackPressedDispatcherOwner for " + view + ".").toString());
            }
            androidx.p000lifecycle.s sVarA = androidx.p000lifecycle.View.a(view);
            if (sVarA == null) {
                throw new IllegalArgumentException(("Unable to find a ViewTreeLifecycleOwner for " + view + ".").toString());
            }
            p0VarQ.d(sVarA, pVarB);
        }
        pVarB.setEnabled(z10);
        pVarB.s(onBack);
    }

    public static final Unit g() {
        return Unit.f22483a;
    }

    public static final void h(View view, p pVar) {
        view.setTag(t.f21673u, pVar);
    }
}
