package backtraceio.library.models.metrics;

import backtraceio.library.common.BacktraceStringHelper;
import backtraceio.library.common.BacktraceTimeHelper;
import backtraceio.library.logger.BacktraceLogger;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class UniqueEvent extends Event {
    private static final transient String LOG_TAG = "UniqueEvent";

    @SerializedName("unique")
    private final List<String> name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public UniqueEvent(String str) {
        this(str, null);
    }

    @Override // backtraceio.library.models.metrics.Event
    public String getName() {
        List<String> list = this.name;
        if (list != null && list.size() > 0 && !BacktraceStringHelper.isNullOrEmpty(this.name.get(0))) {
            return this.name.get(0);
        }
        BacktraceLogger.m7081e(LOG_TAG, "Unique Event name must not be null or empty");
        return "";
    }

    public void update(long j10, Map<String, String> map) {
        this.timestamp = j10;
        addAttributesImpl(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public UniqueEvent(String str, Map<String, String> map) {
        this(str, BacktraceTimeHelper.getTimestampSeconds(), map);
    }

    public UniqueEvent(String str, long j10, Map<String, String> map) {
        super(j10);
        this.name = new ArrayList<String>(str) { // from class: backtraceio.library.models.metrics.UniqueEvent.1
            final /* synthetic */ String val$name;

            {
                this.val$name = str;
                add(str);
            }
        };
        addAttributesImpl(map);
    }
}
