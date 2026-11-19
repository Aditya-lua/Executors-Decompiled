package y6;

import android.view.View;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "Ly6/w;", "a", "(Landroid/view/View;)Ly6/w;", "requestManager", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class x {
    @NotNull
    public static final w a(@NotNull View view) {
        w wVar;
        Object tag = view.getTag(m6.a.f22935a);
        w wVar2 = tag instanceof w ? (w) tag : null;
        if (wVar2 != null) {
            return wVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(m6.a.f22935a);
                wVar = tag2 instanceof w ? (w) tag2 : null;
                if (wVar == null) {
                    wVar = new w(view);
                    view.addOnAttachStateChangeListener(wVar);
                    view.setTag(m6.a.f22935a, wVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }
}
