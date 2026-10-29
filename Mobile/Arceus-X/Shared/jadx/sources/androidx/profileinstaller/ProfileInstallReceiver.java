package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.annotation.NonNull;
import p092e3.ExecutorC4775n;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    public class C0996a implements C1001c.c {
        public C0996a() {
        }

        @Override // androidx.profileinstaller.C1001c.c
        /* JADX INFO: renamed from: a */
        public void mo5024a(int i10, Object obj) {
            C1001c.f3773b.mo5024a(i10, obj);
            ProfileInstallReceiver.this.setResultCode(i10);
        }

        @Override // androidx.profileinstaller.C1001c.c
        /* JADX INFO: renamed from: b */
        public void mo5025b(int i10, Object obj) {
            C1001c.f3773b.mo5025b(i10, obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5022a(int i10, @NonNull C1001c.c cVar) {
        Process.sendSignal(i10, 10);
        cVar.mo5024a(12, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m5023b(@NonNull C1001c.c cVar) {
        m5022a(Process.myPid(), cVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            C1001c.m5059j(context, new ExecutorC4775n(), new C0996a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    C1001c.m5060k(context, new ExecutorC4775n(), new C0996a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        C1001c.m5052c(context, new ExecutorC4775n(), new C0996a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            m5023b(new C0996a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        C0996a c0996a = new C0996a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            C0999a.m5034b(context, c0996a);
        } else if ("SAVE_PROFILE".equals(string2)) {
            m5022a(extras.getInt("EXTRA_PID", Process.myPid()), c0996a);
        } else {
            c0996a.mo5024a(16, null);
        }
    }
}
