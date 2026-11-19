package cn;

import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final MessageBus f5524a;

    /* JADX INFO: renamed from: cn.a$a, reason: collision with other inner class name */
    public static class C0111a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5525a = new a(null);
    }

    public a(MessageBus messageBus) {
        this.f5524a = messageBus == null ? MessageBus.getInstance() : messageBus;
    }

    public static a c() {
        return C0111a.f5525a;
    }

    public void a() {
        Log.v("RealtimeProtocol", "App Resumed");
        this.f5524a.publish(b.APP_RESUME_ID, new JSONObject());
    }

    public void b() {
        Log.v("RealtimeProtocol", "App Stopped");
        this.f5524a.publish(b.APP_STOP_ID, new JSONObject());
    }
}
