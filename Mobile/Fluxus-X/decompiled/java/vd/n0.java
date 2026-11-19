package vd;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ge.t0 f34305a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tb.k f34306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f34307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1 f34308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ge.f f34309f;

    public n0(Context context, ge.t0 t0Var, t tVar, d1 d1Var) {
        tb.k kVar = new tb.k();
        this.f34306c = kVar;
        this.b = context.getPackageName();
        this.f34305a = t0Var;
        this.f34307d = tVar;
        this.f34308e = d1Var;
        ge.f fVar = new ge.f(context, t0Var, "ExpressIntegrityService", o0.f34313a, new ge.a1() { // from class: vd.e0
            @Override // ge.a1
            public final Object a(IBinder iBinder) {
                return ge.k0.s2(iBinder);
            }
        }, null);
        this.f34309f = fVar;
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
        ge.g0.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(ge.g0.a(arrayList)));
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
        ge.g0.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(ge.g0.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean i(n0 n0Var, int i10) {
        return n0Var.f34306c.a().isSuccessful() && ((Integer) n0Var.f34306c.a().getResult()).intValue() < 83420000;
    }

    public static /* bridge */ /* synthetic */ boolean j(n0 n0Var) {
        return n0Var.f34306c.a().isSuccessful() && ((Integer) n0Var.f34306c.a().getResult()).intValue() == 0;
    }

    public final Task c(c.d dVar, long j10, long j11, int i10) {
        this.f34305a.c("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        tb.k kVar = new tb.k();
        this.f34309f.t(new h0(this, kVar, 0, dVar, j10, j11, kVar), kVar);
        return kVar.a();
    }

    public final Task d(long j10, int i10) {
        this.f34305a.c("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        tb.k kVar = new tb.k();
        this.f34309f.t(new g0(this, kVar, 0, j10, kVar), kVar);
        return kVar.a();
    }
}
