package p146g6;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p120f6.Preference;
import p145g5.InterfaceC6008c;

/* JADX INFO: renamed from: g6.w */
/* JADX INFO: loaded from: classes.dex */
public class C6043w {

    /* JADX INFO: renamed from: a */
    public final WorkDatabase f23323a;

    public C6043w(WorkDatabase workDatabase) {
        this.f23323a = workDatabase;
    }

    /* JADX INFO: renamed from: c */
    public static void m26860c(Context context, InterfaceC6008c interfaceC6008c) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j10 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j11 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            interfaceC6008c.mo6895G();
            try {
                interfaceC6008c.mo6907s0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j10)});
                interfaceC6008c.mo6907s0("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                interfaceC6008c.mo6905q0();
            } finally {
                interfaceC6008c.mo6896G0();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public long m26861a() {
        Long lMo24747b = this.f23323a.mo6346Y().mo24747b("last_force_stop_ms");
        if (lMo24747b != null) {
            return lMo24747b.longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: b */
    public boolean m26862b() {
        Long lMo24747b = this.f23323a.mo6346Y().mo24747b("reschedule_needed");
        return lMo24747b != null && lMo24747b.longValue() == 1;
    }

    /* JADX INFO: renamed from: d */
    public void m26863d(long j10) {
        this.f23323a.mo6346Y().mo24746a(new Preference("last_force_stop_ms", Long.valueOf(j10)));
    }

    /* JADX INFO: renamed from: e */
    public void m26864e(boolean z10) {
        this.f23323a.mo6346Y().mo24746a(new Preference("reschedule_needed", z10));
    }
}
