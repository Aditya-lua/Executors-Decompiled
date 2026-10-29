package p568y6;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: y6.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Landroid/view/View;", "T", "view", "", "subtractPadding", "Ly6/k;", "a", "(Landroid/view/View;Z)Ly6/k;", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13113l {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T extends View> InterfaceC13112k<T> m48722a(@NotNull T t8, boolean z10) {
        return new RealViewSizeResolver(t8, z10);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC13112k m48723b(View view, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return m48722a(view, z10);
    }
}
