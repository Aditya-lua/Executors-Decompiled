package p093e4;

import android.view.View;
import androidx.fragment.app.ComponentCallbacksC0929c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p235k2.AbstractC7429u;
import p322o5.C9663g;
import p504w1.C12277a;

/* JADX INFO: renamed from: e4.h0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\f\u001a\u00020\u000b*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJC\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001b\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 ¨\u0006#"}, m31665d2 = {"Le4/h0;", "", "<init>", "()V", "Lw1/a;", "", "value", "b", "(Lw1/a;Ljava/lang/String;)Ljava/lang/String;", "Landroid/view/View;", "namedViews", "", "d", "(Lw1/a;Lw1/a;)V", "Landroidx/fragment/app/c;", "inFragment", "outFragment", "", "isPop", "sharedElements", "isStart", "a", "(Landroidx/fragment/app/c;Landroidx/fragment/app/c;ZLw1/a;Z)V", "", "views", "", "visibility", "e", "(Ljava/util/List;I)V", "Le4/j0;", "c", "()Le4/j0;", "Le4/j0;", "PLATFORM_IMPL", "SUPPORT_IMPL", "fragment_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C4814h0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4814h0 f19434a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static final AbstractC4818j0 PLATFORM_IMPL;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static final AbstractC4818j0 SUPPORT_IMPL;

    static {
        C4814h0 c4814h0 = new C4814h0();
        f19434a = c4814h0;
        PLATFORM_IMPL = new C4816i0();
        SUPPORT_IMPL = c4814h0.m23292c();
    }

    /* JADX INFO: renamed from: a */
    public static final void m23288a(@NotNull ComponentCallbacksC0929c inFragment, @NotNull ComponentCallbacksC0929c outFragment, boolean isPop, @NotNull C12277a<String, View> sharedElements, boolean isStart) {
        Intrinsics.checkNotNullParameter(inFragment, "inFragment");
        Intrinsics.checkNotNullParameter(outFragment, "outFragment");
        Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
        AbstractC7429u abstractC7429uM4586B = isPop ? outFragment.m4586B() : inFragment.m4586B();
        if (abstractC7429uM4586B != null) {
            ArrayList arrayList = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it = sharedElements.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
            ArrayList arrayList2 = new ArrayList(sharedElements.size());
            Iterator<Map.Entry<String, View>> it2 = sharedElements.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getKey());
            }
            if (isStart) {
                abstractC7429uM4586B.m30951c(arrayList2, arrayList, null);
            } else {
                abstractC7429uM4586B.m30950b(arrayList2, arrayList, null);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m23289b(@NotNull C12277a<String, String> c12277a, @NotNull String value) {
        Intrinsics.checkNotNullParameter(c12277a, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : c12277a.entrySet()) {
            if (Intrinsics.m31980c(entry.getValue(), value)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) CollectionsKt.firstOrNull(arrayList);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0010 */
    /* JADX INFO: renamed from: d */
    public static final void m23290d(@NotNull C12277a<String, String> c12277a, @NotNull C12277a<String, View> namedViews) {
        Intrinsics.checkNotNullParameter(c12277a, "<this>");
        Intrinsics.checkNotNullParameter(namedViews, "namedViews");
        int size = c12277a.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!namedViews.containsKey(c12277a.m45629k(size))) {
                c12277a.m45627i(size);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m23291e(@NotNull List<? extends View> views, int visibility) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator<T> it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(visibility);
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC4818j0 m23292c() {
        try {
            Intrinsics.m31981d(C9663g.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (AbstractC4818j0) C9663g.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
