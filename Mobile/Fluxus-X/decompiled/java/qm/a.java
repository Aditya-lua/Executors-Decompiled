package qm;

import android.util.Log;
import com.roblox.universalapp.experience.JNIExperienceProtocol;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageBus f30033a;
    public Connection b;

    /* JADX INFO: renamed from: qm.a$a, reason: collision with other inner class name */
    public class C0590a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f30034a;

        public C0590a(b bVar) {
            this.f30034a = bVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void run(JSONObject jSONObject) {
            this.f30034a.a(jSONObject);
        }
    }

    public interface b {
        void a(JSONObject jSONObject);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30035a = new a();
    }

    public static a a() {
        return c.f30035a;
    }

    public void b(b bVar) {
        if (this.b != null) {
            Log.w("ExperienceProtocol", "Attempted to set ExperienceProtocol java callback, but one is already set.");
        } else {
            this.b = this.f30033a.subscribe(JNIExperienceProtocol.getLaunchId(), new C0590a(bVar));
        }
    }

    public void c() {
        Connection connection = this.b;
        if (connection == null) {
            Log.w("ExperienceProtocol", "Attempted to disconnect ExperienceProtocol java callback, but one is not connected.");
        } else {
            connection.disconnect();
            this.b = null;
        }
    }

    public a() {
        this.f30033a = MessageBus.getInstance();
        this.b = null;
    }
}
