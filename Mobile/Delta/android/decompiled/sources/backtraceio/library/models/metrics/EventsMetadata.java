package backtraceio.library.models.metrics;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class EventsMetadata {

    @SerializedName("dropped_events")
    private int droppedEvents;

    public EventsMetadata(int i10) {
        this.droppedEvents = i10;
    }

    public int getDroppedEvents() {
        return this.droppedEvents;
    }

    public void setDroppedEvents(int i10) {
        this.droppedEvents = i10;
    }
}
