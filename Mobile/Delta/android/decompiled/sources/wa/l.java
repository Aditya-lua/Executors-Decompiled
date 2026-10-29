package wa;

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

/* JADX INFO: loaded from: classes.dex */
public final class l implements x8.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static x8.b f34146e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34147a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f34148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f34149d;

    public l(Context context) {
        this.b = false;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f34148c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f34149d = Executors.newSingleThreadExecutor();
        this.f34147a = context;
        if (this.b) {
            return;
        }
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new j(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.b = true;
    }

    @NonNull
    public static synchronized x8.b c(@NonNull Context context) {
        try {
            n9.m.m(context, "Context must not be null");
            if (f34146e == null) {
                f34146e = new l(context.getApplicationContext());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f34146e;
    }

    public static final void e(Context context) {
        if (!f(context).edit().remove("app_set_id").commit()) {
            String strValueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (f(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String strValueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
    }

    public static final SharedPreferences f(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void g(Context context) throws k {
        if (f(context).edit().putLong("app_set_id_last_used_time", u9.h.c().a()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new k("Failed to store the app set ID last used time.");
    }

    public final long a() {
        long j10 = f(this.f34147a).getLong("app_set_id_last_used_time", -1L);
        if (j10 != -1) {
            return j10 + 33696000000L;
        }
        return -1L;
    }

    public final /* synthetic */ void d(sb.k kVar) {
        String string = f(this.f34147a).getString("app_set_id", null);
        long jA = a();
        if (string == null || u9.h.c().a() > jA) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f34147a;
                if (!f(context).edit().putString("app_set_id", string).commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                    throw new k("Failed to store the app set ID.");
                }
                g(context);
                Context context2 = this.f34147a;
                if (!f(context2).edit().putLong("app_set_id_creation_time", u9.h.c().a()).commit()) {
                    String strValueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new k("Failed to store the app set ID creation time.");
                }
            } catch (k e10) {
                kVar.b(e10);
                return;
            }
        } else {
            try {
                g(this.f34147a);
            } catch (k e11) {
                kVar.b(e11);
                return;
            }
        }
        kVar.c(new x8.c(string, 1));
    }

    @Override // x8.b
    public final Task<x8.c> j() {
        final sb.k kVar = new sb.k();
        this.f34149d.execute(new Runnable() { // from class: wa.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f34144a.d(kVar);
            }
        });
        return kVar.a();
    }
}
