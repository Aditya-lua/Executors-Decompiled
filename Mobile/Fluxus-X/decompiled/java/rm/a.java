package rm;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f30782a;
    public final long b;

    public a(JSONObject jSONObject, long j10) {
        this.f30782a = -1L;
        this.b = j10;
        if (jSONObject == null) {
            Log.e("BackgroundExperiment", "Background experiment constructed with null JSON payload.");
            return;
        }
        try {
            this.f30782a = jSONObject.getLong("background_delay");
        } catch (JSONException e10) {
            Log.e("BackgroundExperiment", "Failed to get background delay from JSON payload. Error: " + e10.getMessage());
        }
    }

    public long a() {
        long j10 = this.f30782a;
        return j10 == -1 ? this.b : j10;
    }
}
