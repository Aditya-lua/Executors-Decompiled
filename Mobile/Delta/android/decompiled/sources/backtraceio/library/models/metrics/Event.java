package backtraceio.library.models.metrics;

import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class Event {

    @SerializedName("attributes")
    protected Map<String, String> attributes = new HashMap();

    @SerializedName("timestamp")
    protected long timestamp;

    public Event(long j10) {
        this.timestamp = j10;
    }

    public void addAttributesImpl(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        this.attributes.putAll(map);
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public abstract String getName();

    public long getTimestamp() {
        return this.timestamp;
    }
}
