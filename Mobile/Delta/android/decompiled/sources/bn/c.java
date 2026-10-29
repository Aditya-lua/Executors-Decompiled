package bn;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.p000lifecycle.s;
import d5.i;
import d5.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\r*\u00020\u0001*\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0082\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lbn/c;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/lifecycle/s;", "a", "(Landroid/view/View;)Landroidx/lifecycle/s;", "Ld5/i;", "c", "(Landroid/view/View;)Ld5/i;", "d", "T", "Landroid/content/Context;", "Lhu/c;", "ownerClass", "b", "(Landroid/content/Context;Lhu/c;)Ljava/lang/Object;", "wf1-core-android"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f4262a = new c();

    @Nullable
    public final s a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        s sVarA = androidx.p000lifecycle.View.a(view);
        if (sVarA != null) {
            return sVarA;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        return (s) b(context, d0.b(s.class));
    }

    public final <T> T b(Context context, hu.c<T> cVar) {
        while (!cVar.b(context)) {
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == null) {
                return null;
            }
        }
        return (T) hu.d.a(cVar, context);
    }

    @NotNull
    public final i c(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        i iVarD = d(view);
        if (iVarD != null) {
            return iVarD;
        }
        throw new IllegalStateException(Intrinsics.l("Expected to find a SavedStateRegistryOwner either in a parent view or the Context of ", view).toString());
    }

    public final i d(View view) {
        i iVarA = m.a(view);
        if (iVarA != null) {
            return iVarA;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        return (i) b(context, d0.b(i.class));
    }
}
