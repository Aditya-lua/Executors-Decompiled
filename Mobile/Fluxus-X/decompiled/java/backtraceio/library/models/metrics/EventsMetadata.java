package backtraceio.library.models.metrics;

import mg.c;

/* JADX INFO: loaded from: classes.dex */
public class EventsMetadata {

    @c("dropped_events")
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
