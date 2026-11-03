package nm;

import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final MessageBus f27322a;

    /* JADX INFO: renamed from: nm.a$a, reason: collision with other inner class name */
    public static class C0466a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27323a = new a(null);
    }

    public a(MessageBus messageBus) {
        this.f27322a = messageBus == null ? MessageBus.f() : messageBus;
    }

    public static a c() {
        return C0466a.f27323a;
    }

    public void a() {
        Log.v("RealtimeProtocol", "App Resumed");
        this.f27322a.l(b.APP_RESUME_ID, new JSONObject());
    }

    public void b() {
        Log.v("RealtimeProtocol", "App Stopped");
        this.f27322a.l(b.APP_STOP_ID, new JSONObject());
    }
}
