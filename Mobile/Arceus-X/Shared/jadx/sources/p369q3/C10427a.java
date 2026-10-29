package p369q3;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0637u0;
import androidx.core.view.C0639v0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: q3.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\b\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b\"(\u0010\r\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0014\u001a\u00020\u0011*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Landroid/view/View;", "", "a", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "b", "(Landroid/view/ViewGroup;)V", "", "I", "PoolingContainerListenerHolderTag", "IsPoolingContainerTag", "", "value", "isPoolingContainer", "(Landroid/view/View;)Z", "d", "(Landroid/view/View;Z)V", "Lq3/c;", "c", "(Landroid/view/View;)Lq3/c;", "poolingContainerListenerHolder", "customview-poolingcontainer_release"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C10427a {

    /* JADX INFO: renamed from: a */
    public static final int f37596a = C10430d.f37600b;

    /* JADX INFO: renamed from: b */
    public static final int f37597b = C10430d.f37599a;

    /* JADX INFO: renamed from: a */
    public static final void m40135a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Iterator<View> it = C0639v0.m3203a(view).iterator();
        while (it.hasNext()) {
            m40137c(it.next()).m40140a();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m40136b(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        Iterator<View> it = C0637u0.m3198a(viewGroup).iterator();
        while (it.hasNext()) {
            m40137c(it.next()).m40140a();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C10429c m40137c(View view) {
        int i10 = f37596a;
        C10429c c10429c = (C10429c) view.getTag(i10);
        if (c10429c != null) {
            return c10429c;
        }
        C10429c c10429c2 = new C10429c();
        view.setTag(i10, c10429c2);
        return c10429c2;
    }

    /* JADX INFO: renamed from: d */
    public static final void m40138d(@NotNull View view, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(f37597b, Boolean.valueOf(z10));
    }
}
