package p306nb;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: nb.kd */
/* JADX INFO: loaded from: classes.dex */
public final class C9164kd {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9180ld f33155a;

    public C9164kd(C9180ld c9180ld) {
        Objects.requireNonNull(c9180ld);
        this.f33155a = c9180ld;
    }

    /* JADX INFO: renamed from: a */
    public final void m36458a() {
        C9180ld c9180ld = this.f33155a;
        c9180ld.mo36088h();
        C9094g7 c9094g7 = c9180ld.f33067a;
        if (c9094g7.m36339x().m36440A(c9094g7.mo36325e().mo44175a())) {
            c9094g7.m36339x().f33125m.m36296b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                c9094g7.mo36321a().m37011w().m36911a("Detected application was in foreground");
                m36460c(c9094g7.mo36325e().mo44175a(), false);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m36459b(long j10, boolean z10) {
        C9180ld c9180ld = this.f33155a;
        c9180ld.mo36088h();
        c9180ld.m36469q();
        C9094g7 c9094g7 = c9180ld.f33067a;
        if (c9094g7.m36339x().m36440A(j10)) {
            c9094g7.m36339x().f33125m.m36296b(true);
            c9180ld.f33067a.m36317L().m36431p();
        }
        c9094g7.m36339x().f33129q.m36346b(j10);
        if (c9094g7.m36339x().f33125m.m36295a()) {
            m36460c(j10, z10);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m36460c(long j10, boolean z10) {
        C9180ld c9180ld = this.f33155a;
        c9180ld.mo36088h();
        if (c9180ld.f33067a.m36327g()) {
            C9094g7 c9094g7 = c9180ld.f33067a;
            c9094g7.m36339x().f33129q.m36346b(j10);
            c9094g7.mo36321a().m37011w().m36912b("Session started, time", Long.valueOf(c9094g7.mo36325e().mo44176b()));
            long j11 = j10 / 1000;
            C9094g7 c9094g8 = c9180ld.f33067a;
            c9094g8.m36307B().m36663B("auto", "_sid", Long.valueOf(j11), j10);
            c9094g7.m36339x().f33130r.m36346b(j11);
            c9094g7.m36339x().f33125m.m36296b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            c9094g8.m36307B().m36714u("auto", "_s", j10, bundle);
            String strM36369a = c9094g7.m36339x().f33135w.m36369a();
            if (TextUtils.isEmpty(strM36369a)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strM36369a);
            c9094g8.m36307B().m36714u("auto", "_ssr", j10, bundle2);
        }
    }
}
