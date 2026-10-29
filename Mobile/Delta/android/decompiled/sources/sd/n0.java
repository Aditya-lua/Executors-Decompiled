package sd;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final de.t0 f30662a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sb.k f30663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f30664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1 f30665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final de.f f30666f;

    public n0(Context context, de.t0 t0Var, t tVar, d1 d1Var) {
        sb.k kVar = new sb.k();
        this.f30663c = kVar;
        this.b = context.getPackageName();
        this.f30662a = t0Var;
        this.f30664d = tVar;
        this.f30665e = d1Var;
        de.f fVar = new de.f(context, t0Var, "ExpressIntegrityService", o0.f30670a, new de.a1() { // from class: sd.e0
            @Override // de.a1
            public final Object a(IBinder iBinder) {
                return de.k0.s2(iBinder);
            }
        }, null);
        this.f30666f = fVar;
        fVar.c().post(new f0(this, kVar, context));
    }

    public static /* bridge */ /* synthetic */ Bundle a(n0 n0Var, c.d dVar, long j10, long j11, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", n0Var.b);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", dVar.b());
        bundle.putLong("warm.up.sid", j11);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(dVar.c()));
        ArrayList arrayList = new ArrayList();
        de.g0.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(de.g0.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle b(n0 n0Var, long j10, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", n0Var.b);
        bundle.putLong("cloud.prj", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 4);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        de.g0.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(de.g0.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean i(n0 n0Var, int i10) {
        return n0Var.f30663c.a().isSuccessful() && ((Integer) n0Var.f30663c.a().getResult()).intValue() < 83420000;
    }

    public static /* bridge */ /* synthetic */ boolean j(n0 n0Var) {
        return n0Var.f30663c.a().isSuccessful() && ((Integer) n0Var.f30663c.a().getResult()).intValue() == 0;
    }

    public final Task c(c.d dVar, long j10, long j11, int i10) {
        this.f30662a.c("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        sb.k kVar = new sb.k();
        this.f30666f.t(new h0(this, kVar, 0, dVar, j10, j11, kVar), kVar);
        return kVar.a();
    }

    public final Task d(long j10, int i10) {
        this.f30662a.c("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        sb.k kVar = new sb.k();
        this.f30666f.t(new g0(this, kVar, 0, j10, kVar), kVar);
        return kVar.a();
    }
}
