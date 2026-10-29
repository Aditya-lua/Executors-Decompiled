package cm;

import android.util.Log;
import com.roblox.universalapp.experience.JNIExperienceProtocol;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageBus f4947a;
    public Connection b;

    /* JADX INFO: renamed from: cm.a$a, reason: collision with other inner class name */
    public class C0106a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f4948a;

        public C0106a(b bVar) {
            this.f4948a = bVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            this.f4948a.a(jSONObject);
        }
    }

    public interface b {
        void a(JSONObject jSONObject);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4949a = new a();
    }

    public static a a() {
        return c.f4949a;
    }

    public void b(b bVar) {
        if (this.b != null) {
            Log.w("ExperienceProtocol", "Attempted to set ExperienceProtocol java callback, but one is already set.");
        } else {
            this.b = this.f4947a.t(JNIExperienceProtocol.getLaunchId(), new C0106a(bVar));
        }
    }

    public void c() {
        Connection connection = this.b;
        if (connection == null) {
            Log.w("ExperienceProtocol", "Attempted to disconnect ExperienceProtocol java callback, but one is not connected.");
        } else {
            connection.a();
            this.b = null;
        }
    }

    public a() {
        this.f4947a = MessageBus.f();
        this.b = null;
    }
}
