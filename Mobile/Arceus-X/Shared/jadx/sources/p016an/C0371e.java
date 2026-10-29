package p016an;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p088e.InterfaceC4727r0;

/* JADX INFO: renamed from: an.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0087\u0010¢\u0006\u0004\b\u0002\u0010\u0003\"J\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007*\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u00078F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\" \u0010\u0014\u001a\u0004\u0018\u00010\u0010*\u00020\u00048BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012*\u0018\b\u0007\u0010\u0015\"\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0016"}, m31665d2 = {"Landroid/content/Context;", "Le/r0;", "b", "(Landroid/content/Context;)Le/r0;", "Landroid/view/View;", "Lkotlin/Function0;", "", "Lcom/squareup/workflow1/ui/BackPressHandler;", "value", "getBackPressedHandler", "(Landroid/view/View;)Lkotlin/jvm/functions/Function0;", "c", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "getBackPressedHandler$annotations", "(Landroid/view/View;)V", "backPressedHandler", "Lan/j;", "a", "(Landroid/view/View;)Lan/j;", "getHandlerWrapperOrNull$annotations", "handlerWrapperOrNull", "BackPressHandler", "wf1-core-android"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C0371e {
    /* JADX INFO: renamed from: a */
    public static final ViewOnAttachStateChangeListenerC0381j m1405a(View view) {
        return (ViewOnAttachStateChangeListenerC0381j) view.getTag(C0386o.f948c);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.content.Context] */
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final InterfaceC4727r0 m1406b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        while (!(context instanceof InterfaceC4727r0)) {
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper == null || (context = contextWrapper.getBaseContext()) == 0) {
                return null;
            }
        }
        return (InterfaceC4727r0) context;
    }

    /* JADX INFO: renamed from: c */
    public static final void m1407c(@NotNull View view, @Nullable Function0<Unit> function0) {
        Object obj;
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewOnAttachStateChangeListenerC0381j viewOnAttachStateChangeListenerC0381jM1405a = m1405a(view);
        if (viewOnAttachStateChangeListenerC0381jM1405a != null) {
            viewOnAttachStateChangeListenerC0381jM1405a.m1441c();
        }
        if (function0 == null) {
            obj = null;
        } else {
            ViewOnAttachStateChangeListenerC0381j viewOnAttachStateChangeListenerC0381j = new ViewOnAttachStateChangeListenerC0381j(view, function0);
            viewOnAttachStateChangeListenerC0381j.m1440b();
            obj = viewOnAttachStateChangeListenerC0381j;
        }
        view.setTag(C0386o.f948c, obj);
    }
}
