package p226jq;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.p616lifecycle.InterfaceC0980s;
import hu.C6568d;
import hu.InterfaceC6567c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p088e.C4723p0;
import p088e.C4737w0;
import p088e.InterfaceC4727r0;

/* JADX INFO: renamed from: jq.m0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a)\u0010\t\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a.\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000e*\u00020\r*\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0082\u0010¢\u0006\u0004\b\u0012\u0010\u0013\",\u0010\u001a\u001a\u0004\u0018\u00010\u0014*\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m31665d2 = {"Landroid/view/View;", "Le/r0;", "c", "(Landroid/view/View;)Le/r0;", "", "enabled", "Lkotlin/Function0;", "", "onBack", "f", "(Landroid/view/View;ZLkotlin/jvm/functions/Function0;)V", "e", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "", "T", "Landroid/content/Context;", "Lhu/c;", "ownerClass", "d", "(Landroid/content/Context;Lhu/c;)Ljava/lang/Object;", "Ljq/p;", "value", "b", "(Landroid/view/View;)Ljq/p;", "h", "(Landroid/view/View;Ljq/p;)V", "onBackPressedCallbackOrNull", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7272m0 {
    /* JADX INFO: renamed from: b */
    public static final ViewOnAttachStateChangeListenerC7277p m30299b(View view) {
        return (ViewOnAttachStateChangeListenerC7277p) view.getTag(C7282t.f28083u);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final InterfaceC4727r0 m30300c(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        InterfaceC4727r0 interfaceC4727r0M23108a = C4737w0.m23108a(view);
        if (interfaceC4727r0M23108a != null) {
            return interfaceC4727r0M23108a;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return (InterfaceC4727r0) m30301d(context, C7731d0.m32002b(InterfaceC4727r0.class));
    }

    /* JADX INFO: renamed from: d */
    public static final <T> T m30301d(Context context, InterfaceC6567c<T> interfaceC6567c) {
        while (!interfaceC6567c.mo28425b(context)) {
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == null) {
                return null;
            }
        }
        return (T) C6568d.m28428a(interfaceC6567c, context);
    }

    /* JADX INFO: renamed from: e */
    public static final void m30302e(@NotNull View view, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (function0 != null) {
            m30303f(view, true, function0);
        } else {
            m30303f(view, false, new Function0() { // from class: jq.l0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C7272m0.m30304g();
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m30303f(@NotNull View view, boolean z10, @NotNull Function0<Unit> onBack) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        ViewOnAttachStateChangeListenerC7277p viewOnAttachStateChangeListenerC7277pM30299b = m30299b(view);
        if (viewOnAttachStateChangeListenerC7277pM30299b == null) {
            viewOnAttachStateChangeListenerC7277pM30299b = new ViewOnAttachStateChangeListenerC7277p();
            m30305h(view, viewOnAttachStateChangeListenerC7277pM30299b);
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC7277pM30299b);
            InterfaceC4727r0 interfaceC4727r0M30300c = m30300c(view);
            C4723p0 c4723p0Mo23043Q = interfaceC4727r0M30300c != null ? interfaceC4727r0M30300c.mo23043Q() : null;
            if (c4723p0Mo23043Q == null) {
                throw new IllegalArgumentException(("Unable to find a onBackPressedDispatcherOwner for " + view + ".").toString());
            }
            InterfaceC0980s interfaceC0980sM4901a = androidx.p616lifecycle.View.m4901a(view);
            if (interfaceC0980sM4901a == null) {
                throw new IllegalArgumentException(("Unable to find a ViewTreeLifecycleOwner for " + view + ".").toString());
            }
            c4723p0Mo23043Q.m23077d(interfaceC0980sM4901a, viewOnAttachStateChangeListenerC7277pM30299b);
        }
        viewOnAttachStateChangeListenerC7277pM30299b.setEnabled(z10);
        viewOnAttachStateChangeListenerC7277pM30299b.m30320s(onBack);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m30304g() {
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m30305h(View view, ViewOnAttachStateChangeListenerC7277p viewOnAttachStateChangeListenerC7277p) {
        view.setTag(C7282t.f28083u, viewOnAttachStateChangeListenerC7277p);
    }
}
