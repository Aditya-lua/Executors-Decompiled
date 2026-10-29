package cm;

import android.util.Log;
import com.roblox.universalapp.experience.JNIExperienceProtocol;
import com.roblox.universalapp.messagebus.Callback;
import com.roblox.universalapp.messagebus.Connection;
import com.roblox.universalapp.messagebus.MessageBus;
import org.json.JSONObject;

/* JADX INFO: renamed from: cm.a */
/* JADX INFO: loaded from: classes2.dex */
public class C1678a {

    /* JADX INFO: renamed from: a */
    public MessageBus f6458a;

    /* JADX INFO: renamed from: b */
    public Connection f6459b;

    /* JADX INFO: renamed from: cm.a$a */
    public class a implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f6460a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(b bVar) {
            this.f6460a = bVar;
        }

        @Override // com.roblox.universalapp.messagebus.Callback
        /* JADX INFO: renamed from: a */
        public void mo7492a(JSONObject jSONObject) {
            this.f6460a.mo1255a(jSONObject);
        }
    }

    /* JADX INFO: renamed from: cm.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo1255a(JSONObject jSONObject);
    }

    /* JADX INFO: renamed from: cm.a$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public static final C1678a f6462a = new C1678a();
    }

    /* JADX INFO: renamed from: a */
    public static C1678a m8388a() {
        return c.f6462a;
    }

    /* JADX INFO: renamed from: b */
    public void m8389b(b bVar) {
        if (this.f6459b != null) {
            Log.w("ExperienceProtocol", "Attempted to set ExperienceProtocol java callback, but one is already set.");
        } else {
            this.f6459b = this.f6458a.m16030t(JNIExperienceProtocol.getLaunchId(), new a(bVar));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m8390c() {
        Connection connection = this.f6459b;
        if (connection == null) {
            Log.w("ExperienceProtocol", "Attempted to disconnect ExperienceProtocol java callback, but one is not connected.");
        } else {
            connection.m16010a();
            this.f6459b = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1678a() {
        this.f6458a = MessageBus.m16016f();
        this.f6459b = null;
    }
}
