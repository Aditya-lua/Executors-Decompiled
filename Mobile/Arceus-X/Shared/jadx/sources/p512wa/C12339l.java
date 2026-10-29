package p512wa;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p305n9.C8953m;
import p462u9.C11817h;
import p539x8.C12769c;
import p539x8.InterfaceC12768b;
import sb.C11264k;

/* JADX INFO: renamed from: wa.l */
/* JADX INFO: loaded from: classes.dex */
public final class C12339l implements InterfaceC12768b {

    /* JADX INFO: renamed from: e */
    public static InterfaceC12768b f44191e;

    /* JADX INFO: renamed from: a */
    public final Context f44192a;

    /* JADX INFO: renamed from: b */
    public boolean f44193b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f44194c;

    /* JADX INFO: renamed from: d */
    public final ExecutorService f44195d;

    public C12339l(Context context) {
        this.f44193b = false;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f44194c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f44195d = Executors.newSingleThreadExecutor();
        this.f44192a = context;
        if (this.f44193b) {
            return;
        }
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new RunnableC12337j(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.f44193b = true;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static synchronized InterfaceC12768b m46192c(@NonNull Context context) {
        try {
            C8953m.m36048m(context, "Context must not be null");
            if (f44191e == null) {
                f44191e = new C12339l(context.getApplicationContext());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f44191e;
    }

    /* JADX INFO: renamed from: e */
    public static final void m46193e(Context context) {
        if (!m46194f(context).edit().remove("app_set_id").commit()) {
            String strValueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (m46194f(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String strValueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
    }

    /* JADX INFO: renamed from: f */
    public static final SharedPreferences m46194f(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    /* JADX INFO: renamed from: g */
    public static final void m46195g(Context context) throws C12338k {
        if (m46194f(context).edit().putLong("app_set_id_last_used_time", C11817h.m44180c().mo44175a()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new C12338k("Failed to store the app set ID last used time.");
    }

    /* JADX INFO: renamed from: a */
    public final long m46196a() {
        long j10 = m46194f(this.f44192a).getLong("app_set_id_last_used_time", -1L);
        if (j10 != -1) {
            return j10 + 33696000000L;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m46197d(C11264k c11264k) {
        String string = m46194f(this.f44192a).getString("app_set_id", null);
        long jM46196a = m46196a();
        if (string == null || C11817h.m44180c().mo44175a() > jM46196a) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f44192a;
                if (!m46194f(context).edit().putString("app_set_id", string).commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                    throw new C12338k("Failed to store the app set ID.");
                }
                m46195g(context);
                Context context2 = this.f44192a;
                if (!m46194f(context2).edit().putLong("app_set_id_creation_time", C11817h.m44180c().mo44175a()).commit()) {
                    String strValueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new C12338k("Failed to store the app set ID creation time.");
                }
            } catch (C12338k e10) {
                c11264k.m42327b(e10);
                return;
            }
        } else {
            try {
                m46195g(this.f44192a);
            } catch (C12338k e11) {
                c11264k.m42327b(e11);
                return;
            }
        }
        c11264k.m42328c(new C12769c(string, 1));
    }

    @Override // p539x8.InterfaceC12768b
    /* JADX INFO: renamed from: j */
    public final Task<C12769c> mo46198j() {
        final C11264k c11264k = new C11264k();
        this.f44195d.execute(new Runnable() { // from class: wa.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f44188a.m46197d(c11264k);
            }
        });
        return c11264k.m42326a();
    }
}
