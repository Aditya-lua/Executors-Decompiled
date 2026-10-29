package p016an;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: an.h0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"$\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"6\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00018@@@X\u0081\u000e¢\u0006\u0012\u0012\u0004\b\u000b\u0010\u0005\u001a\u0004\b\b\u0010\u0003\"\u0004\b\t\u0010\n\"\"\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\r*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u000e\u0010\u000f\"\"\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0012*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m31665d2 = {"Landroid/view/View;", "Lan/g0;", "d", "(Landroid/view/View;)Lan/g0;", "getWorkflowViewStateOrNull$annotations", "(Landroid/view/View;)V", "workflowViewStateOrNull", "value", "a", "e", "(Landroid/view/View;Lan/g0;)V", "getWorkflowViewState$annotations", "workflowViewState", "Lan/g0$a;", "b", "(Landroid/view/View;)Lan/g0$a;", "getWorkflowViewStateAsNew$annotations", "workflowViewStateAsNew", "Lan/g0$b;", "c", "(Landroid/view/View;)Lan/g0$b;", "getWorkflowViewStateAsStarted$annotations", "workflowViewStateAsStarted", "wf1-core-android"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C0378h0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final AbstractC0376g0<?> m1430a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        AbstractC0376g0<?> abstractC0376g0M1433d = m1433d(view);
        if (abstractC0376g0M1433d != null) {
            return abstractC0376g0M1433d;
        }
        throw new IllegalStateException(("Expected " + view + " to have been built by a ViewFactory. Perhaps the factory did not call View.bindShowRendering.").toString());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final AbstractC0376g0.New<?> m1431b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        AbstractC0376g0<?> abstractC0376g0M1430a = m1430a(view);
        AbstractC0376g0.New<?> aVar = abstractC0376g0M1430a instanceof AbstractC0376g0.New ? (AbstractC0376g0.New) abstractC0376g0M1430a : null;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Expected " + view + " to be un-started, but View.start() has been called").toString());
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final AbstractC0376g0.Started<?> m1432c(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        AbstractC0376g0<?> abstractC0376g0M1430a = m1430a(view);
        AbstractC0376g0.Started<?> bVar = abstractC0376g0M1430a instanceof AbstractC0376g0.Started ? (AbstractC0376g0.Started) abstractC0376g0M1430a : null;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException(("Expected " + view + " to have been started, but View.start() has not been called").toString());
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final AbstractC0376g0<?> m1433d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(C0386o.f950e);
        if (tag instanceof AbstractC0376g0) {
            return (AbstractC0376g0) tag;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final void m1434e(@NotNull View view, @NotNull AbstractC0376g0<?> value) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        view.setTag(C0386o.f950e, value);
    }
}
