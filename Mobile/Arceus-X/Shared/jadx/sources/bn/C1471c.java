package bn;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.p616lifecycle.InterfaceC0980s;
import hu.C6568d;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p068d5.C4449m;
import p068d5.InterfaceC4445i;

/* JADX INFO: renamed from: bn.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\f\u0010\u000bJ.\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\r*\u00020\u0001*\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0082\u0010¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m31665d2 = {"Lbn/c;", "", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/lifecycle/s;", "a", "(Landroid/view/View;)Landroidx/lifecycle/s;", "Ld5/i;", "c", "(Landroid/view/View;)Ld5/i;", "d", "T", "Landroid/content/Context;", "Lhu/c;", "ownerClass", "b", "(Landroid/content/Context;Lhu/c;)Ljava/lang/Object;", "wf1-core-android"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C1471c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C1471c f5714a = new C1471c();

    @Nullable
    /* JADX INFO: renamed from: a */
    public final InterfaceC0980s m7545a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC0980s interfaceC0980sM4901a = androidx.p616lifecycle.View.m4901a(view);
        if (interfaceC0980sM4901a != null) {
            return interfaceC0980sM4901a;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        return (InterfaceC0980s) m7546b(context, C7731d0.m32002b(InterfaceC0980s.class));
    }

    /* JADX INFO: renamed from: b */
    public final <T> T m7546b(Context context, InterfaceC6567c<T> interfaceC6567c) {
        while (!interfaceC6567c.mo28425b(context)) {
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == null) {
                return null;
            }
        }
        return (T) C6568d.m28428a(interfaceC6567c, context);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC4445i m7547c(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC4445i interfaceC4445iM7548d = m7548d(view);
        if (interfaceC4445iM7548d != null) {
            return interfaceC4445iM7548d;
        }
        throw new IllegalStateException(Intrinsics.m31989l("Expected to find a SavedStateRegistryOwner either in a parent view or the Context of ", view).toString());
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC4445i m7548d(View view) {
        InterfaceC4445i interfaceC4445iM22372a = C4449m.m22372a(view);
        if (interfaceC4445iM22372a != null) {
            return interfaceC4445iM22372a;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        return (InterfaceC4445i) m7546b(context, C7731d0.m32002b(InterfaceC4445i.class));
    }
}
