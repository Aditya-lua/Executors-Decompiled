package p125fb;

import android.app.Application;
import com.google.android.gms.games.internal.p049v2.resolution.C1938a;
import ga.C6072o;
import java.util.concurrent.atomic.AtomicReference;
import p305n9.C8953m;
import p348p1.C10146t;

/* JADX INFO: renamed from: fb.o */
/* JADX INFO: loaded from: classes.dex */
public final class C5547o {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f21332a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public static InterfaceC5541m m25217a(Application application) {
        AtomicReference atomicReference = f21332a;
        InterfaceC5541m interfaceC5541m = (InterfaceC5541m) atomicReference.get();
        if (interfaceC5541m != null) {
            return interfaceC5541m;
        }
        C5537k1 c5537k1M25218a = C5552p1.m25218a();
        c5537k1M25218a.m25210a(9);
        c5537k1M25218a.m25211b(application.getPackageName());
        C5552p1 c5552p1M25212c = c5537k1M25218a.m25212c();
        C6072o c6072oM26925a = C6072o.m26925a(application);
        C10146t.m39085a(atomicReference, null, new C5501b0(application, c6072oM26925a, C1938a.m9453a(), new C5517f0(application, c6072oM26925a, new C5544n(application, c5552p1M25212c))));
        return (InterfaceC5541m) C8953m.m36047l((InterfaceC5541m) atomicReference.get());
    }
}
