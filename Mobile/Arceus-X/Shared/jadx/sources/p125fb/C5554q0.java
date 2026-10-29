package p125fb;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import ga.C6060c;
import ga.C6067j;
import ga.C6072o;
import java.util.concurrent.atomic.AtomicReference;
import p073da.C4511o;
import p242k9.C7491a;
import p268l9.InterfaceC8030e;
import p268l9.InterfaceC8057n;
import p305n9.C8926d;

/* JADX INFO: renamed from: fb.q0 */
/* JADX INFO: loaded from: classes.dex */
public class C5554q0 extends C7491a.a {
    public /* synthetic */ C5554q0(byte[] bArr) {
    }

    @Override // p242k9.C7491a.a
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ C7491a.f mo299b(Context context, Looper looper, C8926d c8926d, Object obj, InterfaceC8030e interfaceC8030e, InterfaceC8057n interfaceC8057n) {
        C4511o c4511oM22475d = (C4511o) obj;
        if (c4511oM22475d == null) {
            c4511oM22475d = C4511o.m22476a().m22475d();
        }
        C4511o c4511o = c4511oM22475d;
        C6060c c6060c = new C6060c(context, looper, c8926d, c4511o, interfaceC8030e, interfaceC8057n, C6067j.m26922a());
        if (c4511o.f18564o.m26941a()) {
            AtomicReference atomicReference = C6072o.f23362g;
            c6060c.m26906l(C6072o.m26925a((Application) context.getApplicationContext()));
        }
        return c6060c;
    }
}
