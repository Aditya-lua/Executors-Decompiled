package ob;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class pd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qd f27719a;

    public pd(qd qdVar) {
        Objects.requireNonNull(qdVar);
        this.f27719a = qdVar;
    }

    public final void a() {
        qd qdVar = this.f27719a;
        qdVar.h();
        l7 l7Var = qdVar.f27641a;
        if (l7Var.x().A(l7Var.e().a())) {
            l7Var.x().f27693m.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                l7Var.a().w().a("Detected application was in foreground");
                c(l7Var.e().a(), false);
            }
        }
    }

    public final void b(long j10, boolean z10) {
        qd qdVar = this.f27719a;
        qdVar.h();
        qdVar.q();
        l7 l7Var = qdVar.f27641a;
        if (l7Var.x().A(j10)) {
            l7Var.x().f27693m.b(true);
            qdVar.f27641a.L().p();
        }
        l7Var.x().f27697q.b(j10);
        if (l7Var.x().f27693m.a()) {
            c(j10, z10);
        }
    }

    public final void c(long j10, boolean z10) {
        qd qdVar = this.f27719a;
        qdVar.h();
        if (qdVar.f27641a.g()) {
            l7 l7Var = qdVar.f27641a;
            l7Var.x().f27697q.b(j10);
            l7Var.a().w().b("Session started, time", Long.valueOf(l7Var.e().b()));
            long j11 = j10 / 1000;
            l7 l7Var2 = qdVar.f27641a;
            l7Var2.B().B("auto", "_sid", Long.valueOf(j11), j10);
            l7Var.x().f27698r.b(j11);
            l7Var.x().f27693m.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            l7Var2.B().u("auto", "_s", j10, bundle);
            String strA = l7Var.x().f27703w.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strA);
            l7Var2.B().u("auto", "_ssr", j10, bundle2);
        }
    }
}
