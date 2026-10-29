package et;

import android.util.Log;
import androidx.fragment.app.ComponentCallbacksC0929c;
import p086dt.InterfaceC4687a;
import p086dt.InterfaceC4690d;
import p093e4.ActivityC4831q;
import p136ft.C5834h;

/* JADX INFO: renamed from: et.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C5214a {
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:? */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: androidx.fragment.app.c */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: androidx.fragment.app.c */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: androidx.fragment.app.c */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: e4.q */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static InterfaceC4690d m24167a(ComponentCallbacksC0929c componentCallbacksC0929c) {
        ComponentCallbacksC0929c componentCallbacksC0929cM4612K = componentCallbacksC0929c;
        do {
            componentCallbacksC0929cM4612K = componentCallbacksC0929cM4612K.m4612K();
            if (componentCallbacksC0929cM4612K == 0) {
                ActivityC4831q activityC4831qM4693p = componentCallbacksC0929c.m4693p();
                if (activityC4831qM4693p instanceof InterfaceC4690d) {
                    return (InterfaceC4690d) activityC4831qM4693p;
                }
                if (activityC4831qM4693p.getApplication() instanceof InterfaceC4690d) {
                    return (InterfaceC4690d) activityC4831qM4693p.getApplication();
                }
                throw new IllegalArgumentException(String.format("No injector was found for %s", componentCallbacksC0929c.getClass().getCanonicalName()));
            }
        } while (!(componentCallbacksC0929cM4612K instanceof InterfaceC4690d));
        return (InterfaceC4690d) componentCallbacksC0929cM4612K;
    }

    /* JADX INFO: renamed from: b */
    public static void m24168b(ComponentCallbacksC0929c componentCallbacksC0929c) {
        C5834h.m26192c(componentCallbacksC0929c, "fragment");
        InterfaceC4690d interfaceC4690dM24167a = m24167a(componentCallbacksC0929c);
        if (Log.isLoggable("dagger.android.support", 3)) {
            Log.d("dagger.android.support", String.format("An injector for %s was found in %s", componentCallbacksC0929c.getClass().getCanonicalName(), interfaceC4690dM24167a.getClass().getCanonicalName()));
        }
        m24169c(componentCallbacksC0929c, interfaceC4690dM24167a);
    }

    /* JADX INFO: renamed from: c */
    public static void m24169c(Object obj, InterfaceC4690d interfaceC4690d) {
        InterfaceC4687a<Object> interfaceC4687aMo18834c = interfaceC4690d.mo18834c();
        C5834h.m26193d(interfaceC4687aMo18834c, "%s.androidInjector() returned null", interfaceC4690d.getClass());
        interfaceC4687aMo18834c.mo18369a(obj);
    }
}
