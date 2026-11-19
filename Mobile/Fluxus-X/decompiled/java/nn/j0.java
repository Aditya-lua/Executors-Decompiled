package nn;

import android.view.View;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"$\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"6\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00018@@@X\u0081\u000e¢\u0006\u0012\u0012\u0004\b\u000b\u0010\u0005\u001a\u0004\b\b\u0010\u0003\"\u0004\b\t\u0010\n\"\"\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\r*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u000e\u0010\u000f\"\"\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0012*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroid/view/View;", "Lnn/i0;", "d", "(Landroid/view/View;)Lnn/i0;", "getWorkflowViewStateOrNull$annotations", "(Landroid/view/View;)V", "workflowViewStateOrNull", "value", "a", "e", "(Landroid/view/View;Lnn/i0;)V", "getWorkflowViewState$annotations", "workflowViewState", "Lnn/i0$a;", "b", "(Landroid/view/View;)Lnn/i0$a;", "getWorkflowViewStateAsNew$annotations", "workflowViewStateAsNew", "Lnn/i0$b;", "c", "(Landroid/view/View;)Lnn/i0$b;", "getWorkflowViewStateAsStarted$annotations", "workflowViewStateAsStarted", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class j0 {
    @NotNull
    public static final i0<?> a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        i0<?> i0VarD = d(view);
        if (i0VarD != null) {
            return i0VarD;
        }
        throw new IllegalStateException(("Expected " + view + " to have been built by a ViewFactory. Perhaps the factory did not call View.bindShowRendering.").toString());
    }

    @NotNull
    public static final i0.New<?> b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        i0<?> i0VarA = a(view);
        i0.New<?> aVar = i0VarA instanceof i0.New ? (i0.New) i0VarA : null;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Expected " + view + " to be un-started, but View.start() has been called").toString());
    }

    @NotNull
    public static final i0.Started<?> c(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        i0<?> i0VarA = a(view);
        i0.Started<?> bVar = i0VarA instanceof i0.Started ? (i0.Started) i0VarA : null;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException(("Expected " + view + " to have been started, but View.start() has not been called").toString());
    }

    @Nullable
    public static final i0<?> d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(p.f25886e);
        if (tag instanceof i0) {
            return (i0) tag;
        }
        return null;
    }

    public static final void e(@NotNull View view, @NotNull i0<?> value) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        view.setTag(p.f25886e, value);
    }
}
