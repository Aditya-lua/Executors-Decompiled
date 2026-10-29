package p526wq;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0582a;
import androidx.core.view.C0625o0;
import androidx.core.view.C0637u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p201iu.C6988p;

/* JADX INFO: renamed from: wq.z */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\b*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\",\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m31665d2 = {"Landroid/view/View;", "Lkotlin/Function0;", "", "onPreDraw", "b", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "f", "(Landroid/view/View;)V", "", "d", "(Landroid/view/View;)Ljava/util/List;", "Landroidx/core/view/a;", "value", "getAccessibilityDelegateCompat", "(Landroid/view/View;)Landroidx/core/view/a;", "e", "(Landroid/view/View;Landroidx/core/view/a;)V", "accessibilityDelegateCompat", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12543z {
    /* JADX INFO: renamed from: b */
    public static final void m46890b(@NotNull View view, @NotNull final Function0<Unit> onPreDraw) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onPreDraw, "onPreDraw");
        ViewTreeObserverOnPreDrawListenerC12525h.INSTANCE.m46880a(view, new Runnable() { // from class: wq.y
            @Override // java.lang.Runnable
            public final void run() {
                C12543z.m46891c(onPreDraw);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static final void m46891c(Function0 function0) {
        function0.invoke();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final List<View> m46892d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        linkedList.push(view);
        while (!linkedList.isEmpty()) {
            Object objPollLast = linkedList.pollLast();
            if (objPollLast == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            View view2 = (View) objPollLast;
            if (view2 instanceof ViewGroup) {
                Iterator it = CollectionsKt.m31727y0(C6988p.m29398z(C0637u0.m3198a((ViewGroup) view2))).iterator();
                while (it.hasNext()) {
                    linkedList.push((View) it.next());
                }
            }
            if (!Intrinsics.m31980c(view2, view)) {
                arrayList.add(view2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static final void m46893e(@NotNull View view, @Nullable C0582a c0582a) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        C0625o0.m3040m0(view, c0582a);
    }

    /* JADX INFO: renamed from: f */
    public static final void m46894f(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.sendAccessibilityEvent(32768);
    }
}
