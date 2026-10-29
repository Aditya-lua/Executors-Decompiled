package td;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import ee.AbstractBinderC5078k0;
import ee.C5067f;
import ee.C5070g0;
import ee.C5096t0;
import ee.InterfaceC5058a1;
import java.util.ArrayList;
import sb.C11264k;

/* JADX INFO: renamed from: td.n0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11605n0 {

    /* JADX INFO: renamed from: a */
    public final C5096t0 f40988a;

    /* JADX INFO: renamed from: b */
    public final String f40989b;

    /* JADX INFO: renamed from: c */
    public final C11264k f40990c;

    /* JADX INFO: renamed from: d */
    public final C11622t f40991d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC11576d1 f40992e;

    /* JADX INFO: renamed from: f */
    public final C5067f f40993f;

    public C11605n0(Context context, C5096t0 c5096t0, C11622t c11622t, InterfaceC11576d1 interfaceC11576d1) {
        C11264k c11264k = new C11264k();
        this.f40990c = c11264k;
        this.f40989b = context.getPackageName();
        this.f40988a = c5096t0;
        this.f40991d = c11622t;
        this.f40992e = interfaceC11576d1;
        C5067f c5067f = new C5067f(context, c5096t0, "ExpressIntegrityService", C11608o0.f40998a, new InterfaceC5058a1() { // from class: td.e0
            @Override // ee.InterfaceC5058a1
            /* JADX INFO: renamed from: a */
            public final Object mo23770a(IBinder iBinder) {
                return AbstractBinderC5078k0.m23813s2(iBinder);
            }
        }, null);
        this.f40993f = c5067f;
        c5067f.m23791c().post(new C11581f0(this, c11264k, context));
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ Bundle m43268a(C11605n0 c11605n0, InterfaceC11571c.d dVar, long j10, long j11, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c11605n0.f40989b);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", dVar.mo43239b());
        bundle.putLong("warm.up.sid", j11);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(dVar.mo43240c()));
        ArrayList arrayList = new ArrayList();
        C5070g0.m23802b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C5070g0.m23801a(arrayList)));
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ Bundle m43269b(C11605n0 c11605n0, long j10, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", c11605n0.f40989b);
        bundle.putLong("cloud.prj", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        C5070g0.m23802b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(C5070g0.m23801a(arrayList)));
        return bundle;
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ boolean m43274i(C11605n0 c11605n0, int i10) {
        return c11605n0.f40990c.m42326a().isSuccessful() && ((Integer) c11605n0.f40990c.m42326a().getResult()).intValue() < 83420000;
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ boolean m43275j(C11605n0 c11605n0) {
        return c11605n0.f40990c.m42326a().isSuccessful() && ((Integer) c11605n0.f40990c.m42326a().getResult()).intValue() == 0;
    }

    /* JADX INFO: renamed from: c */
    public final Task m43276c(InterfaceC11571c.d dVar, long j10, long j11, int i10) {
        this.f40988a.m23841c("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        C11264k c11264k = new C11264k();
        this.f40993f.m23793t(new C11587h0(this, c11264k, 0, dVar, j10, j11, c11264k), c11264k);
        return c11264k.m42326a();
    }

    /* JADX INFO: renamed from: d */
    public final Task m43277d(long j10, int i10) {
        this.f40988a.m23841c("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        C11264k c11264k = new C11264k();
        this.f40993f.m23793t(new C11584g0(this, c11264k, 0, j10, c11264k), c11264k);
        return c11264k.m42326a();
    }
}
