package j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Calendar;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static s f20976d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20977a;
    public final LocationManager b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f20978c = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f20979a;
        public long b;
    }

    public s(@NonNull Context context, @NonNull LocationManager locationManager) {
        this.f20977a = context;
        this.b = locationManager;
    }

    public static s a(@NonNull Context context) {
        if (f20976d == null) {
            Context applicationContext = context.getApplicationContext();
            f20976d = new s(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f20976d;
    }

    @SuppressLint({"MissingPermission"})
    public final Location b() {
        Location locationC = l2.g.b(this.f20977a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = l2.g.b(this.f20977a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    public final Location c(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    public boolean d() {
        a aVar = this.f20978c;
        if (e()) {
            return aVar.f20979a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f20979a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }

    public final boolean e() {
        return this.f20978c.b > System.currentTimeMillis();
    }

    public final void f(@NonNull Location location) {
        long j10;
        a aVar = this.f20978c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        r rVarB = r.b();
        rVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        rVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = rVarB.f20975c == 1;
        long j11 = rVarB.b;
        long j12 = rVarB.f20974a;
        rVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = rVarB.b;
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
        aVar.f20979a = z10;
        aVar.b = j10;
    }
}
