package g6;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import f6.Preference;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f17933a;

    public w(WorkDatabase workDatabase) {
        this.f17933a = workDatabase;
    }

    public static void c(Context context, g5.c cVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            cVar.G();
            try {
                cVar.s0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                cVar.s0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                cVar.q0();
            } finally {
                cVar.G0();
            }
        }
    }

    public long a() {
        Long lB = this.f17933a.Y().b("last_force_stop_ms");
        if (lB != null) {
            return lB.longValue();
        }
        return 0L;
    }

    public boolean b() {
        Long lB = this.f17933a.Y().b("reschedule_needed");
        return lB != null && lB.longValue() == 1;
    }

    public void d(long j10) {
        this.f17933a.Y().a(new Preference("last_force_stop_ms", Long.valueOf(j10)));
    }

    public void e(boolean z10) {
        this.f17933a.Y().a(new Preference("reschedule_needed", z10));
    }
}
