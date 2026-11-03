package am;

import android.util.Log;
import com.roblox.universalapp.experience.JNIExperienceProtocol;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MessageBus f592a;
    public Connection b;

    /* JADX INFO: renamed from: am.a$a, reason: collision with other inner class name */
    public class C0006a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f593a;

        public C0006a(b bVar) {
            this.f593a = bVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        public void a(JSONObject jSONObject) {
            this.f593a.a(jSONObject);
        }
    }

    public interface b {
        void a(JSONObject jSONObject);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f594a = new a();
    }

    public static a a() {
        return c.f594a;
    }

    public void b(b bVar) {
        if (this.b != null) {
            Log.w("ExperienceProtocol", "Attempted to set ExperienceProtocol java callback, but one is already set.");
        } else {
            this.b = this.f592a.t(JNIExperienceProtocol.getLaunchId(), new C0006a(bVar));
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
        this.f592a = MessageBus.f();
        this.b = null;
    }
}
