package p203j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Calendar;
import okhttp3.internal.p336ws.RealWebSocket;
import p261l2.C7980g;

/* JADX INFO: renamed from: j.s */
/* JADX INFO: loaded from: classes.dex */
public class C7009s {

    /* JADX INFO: renamed from: d */
    public static C7009s f27408d;

    /* JADX INFO: renamed from: a */
    public final Context f27409a;

    /* JADX INFO: renamed from: b */
    public final LocationManager f27410b;

    /* JADX INFO: renamed from: c */
    public final a f27411c = new a();

    /* JADX INFO: renamed from: j.s$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public boolean f27412a;

        /* JADX INFO: renamed from: b */
        public long f27413b;
    }

    public C7009s(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f27409a = context;
        this.f27410b = locationManager;
    }

    /* JADX INFO: renamed from: a */
    public static C7009s m29634a(@NonNull Context context) {
        if (f27408d == null) {
            Context applicationContext = context.getApplicationContext();
            f27408d = new C7009s(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f27408d;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: b */
    public final Location m29635b() {
        Location locationM29636c = C7980g.m33039b(this.f27409a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m29636c("network") : null;
        Location locationM29636c2 = C7980g.m33039b(this.f27409a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m29636c("gps") : null;
        if (locationM29636c2 == null || locationM29636c == null) {
            return locationM29636c2 != null ? locationM29636c2 : locationM29636c;
        }
        return locationM29636c2.getTime() > locationM29636c.getTime() ? locationM29636c2 : locationM29636c;
    }

    /* JADX INFO: renamed from: c */
    public final Location m29636c(String str) {
        try {
            if (this.f27410b.isProviderEnabled(str)) {
                return this.f27410b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m29637d() {
        a aVar = this.f27411c;
        if (m29638e()) {
            return aVar.f27412a;
        }
        Location locationM29635b = m29635b();
        if (locationM29635b != null) {
            m29639f(locationM29635b);
            return aVar.f27412a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m29638e() {
        return this.f27411c.f27413b > System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: f */
    public final void m29639f(@NonNull Location location) {
        long j10;
        a aVar = this.f27411c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C7008r c7008rM29632b = C7008r.m29632b();
        c7008rM29632b.m29633a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        c7008rM29632b.m29633a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = c7008rM29632b.f27407c == 1;
        long j11 = c7008rM29632b.f27406b;
        long j12 = c7008rM29632b.f27405a;
        c7008rM29632b.m29633a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = c7008rM29632b.f27406b;
        if (j11 == -1 || j12 == -1) {
            j10 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j12) {
                j11 = j13;
            } else if (jCurrentTimeMillis > j11) {
                j11 = j12;
            }
            j10 = j11 + RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
        }
        aVar.f27412a = z10;
        aVar.f27413b = j10;
    }
}
