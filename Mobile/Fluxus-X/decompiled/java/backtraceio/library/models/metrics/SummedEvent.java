package backtraceio.library.models.metrics;

import backtraceio.library.common.BacktraceTimeHelper;
import java.util.Map;
import mg.c;

/* JADX INFO: loaded from: classes.dex */
public final class SummedEvent extends Event {

    @c("metric_group")
    private final String name;

    public SummedEvent(String str) {
        this(str, null);
    }

    public void addAttributes(Map<String, String> map) {
        addAttributesImpl(map);
    }

    @Override // backtraceio.library.models.metrics.Event
    public String getName() {
        return this.name;
    }

    public SummedEvent(String str, Map<String, String> map) {
        this(str, BacktraceTimeHelper.getTimestampSeconds(), map);
    }

    public SummedEvent(String str, long j10, Map<String, String> map) {
        super(j10);
        this.name = str;
        addAttributesImpl(map);
    }

    public SummedEvent(SummedEvent summedEvent) {
        this(summedEvent.name, summedEvent.timestamp, summedEvent.attributes);
    }
}
