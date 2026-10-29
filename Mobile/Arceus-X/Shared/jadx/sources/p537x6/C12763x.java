package p537x6;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p265l6.C8001a;

/* JADX INFO: renamed from: x6.x */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31665d2 = {"Landroid/view/View;", "Lx6/w;", "a", "(Landroid/view/View;)Lx6/w;", "requestManager", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12763x {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final ViewOnAttachStateChangeListenerC12762w m47631a(@NotNull View view) {
        ViewOnAttachStateChangeListenerC12762w viewOnAttachStateChangeListenerC12762w;
        int i10 = C8001a.f29925a;
        Object tag = view.getTag(i10);
        ViewOnAttachStateChangeListenerC12762w viewOnAttachStateChangeListenerC12762w2 = tag instanceof ViewOnAttachStateChangeListenerC12762w ? (ViewOnAttachStateChangeListenerC12762w) tag : null;
        if (viewOnAttachStateChangeListenerC12762w2 != null) {
            return viewOnAttachStateChangeListenerC12762w2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(i10);
                viewOnAttachStateChangeListenerC12762w = tag2 instanceof ViewOnAttachStateChangeListenerC12762w ? (ViewOnAttachStateChangeListenerC12762w) tag2 : null;
                if (viewOnAttachStateChangeListenerC12762w == null) {
                    viewOnAttachStateChangeListenerC12762w = new ViewOnAttachStateChangeListenerC12762w(view);
                    view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC12762w);
                    view.setTag(i10, viewOnAttachStateChangeListenerC12762w);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return viewOnAttachStateChangeListenerC12762w;
    }
}
