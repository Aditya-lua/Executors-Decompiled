package dm;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: dm.a */
/* JADX INFO: loaded from: classes2.dex */
public class C4642a {

    /* JADX INFO: renamed from: a */
    public long f19018a;

    /* JADX INFO: renamed from: b */
    public final long f19019b;

    public C4642a(JSONObject jSONObject, long j10) {
        this.f19018a = -1L;
        this.f19019b = j10;
        if (jSONObject == null) {
            Log.e("BackgroundExperiment", "Background experiment constructed with null JSON payload.");
            return;
        }
        try {
            this.f19018a = jSONObject.getLong("background_delay");
        } catch (JSONException e10) {
            Log.e("BackgroundExperiment", "Failed to get background delay from JSON payload. Error: " + e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public long m22863a() {
        long j10 = this.f19018a;
        return j10 == -1 ? this.f19019b : j10;
    }
}
