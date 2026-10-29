package pm;

import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONObject;

/* JADX INFO: renamed from: pm.a */
/* JADX INFO: loaded from: classes2.dex */
public class C10293a {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MessageBus f37000a;

    /* JADX INFO: renamed from: pm.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C10293a f37001a = new C10293a(null);
    }

    public C10293a(MessageBus messageBus) {
        this.f37000a = messageBus == null ? MessageBus.m16016f() : messageBus;
    }

    /* JADX INFO: renamed from: c */
    public static C10293a m39556c() {
        return a.f37001a;
    }

    /* JADX INFO: renamed from: a */
    public void m39557a() {
        Log.v("RealtimeProtocol", "App Resumed");
        this.f37000a.m16024l(C10294b.APP_RESUME_ID, new JSONObject());
    }

    /* JADX INFO: renamed from: b */
    public void m39558b() {
        Log.v("RealtimeProtocol", "App Stopped");
        this.f37000a.m16024l(C10294b.APP_STOP_ID, new JSONObject());
    }
}
