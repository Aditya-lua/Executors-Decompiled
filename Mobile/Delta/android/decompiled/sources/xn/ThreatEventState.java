package xn;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xn.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u000eJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lxn/a;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Lxn/a$b;", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "eventsSeen", "appdome-threatevents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThreatEventState {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final List<String> f35261c = p.n("RootedDevice", "DebuggerThreatDetected", "AppIsDebuggable", "AppIntegrityError", "EmulatorFound", "GoogleEmulatorDetected", "MagiskManagerDetected", "FridaDetected", "FridaCustomDetected", "DetectUnlockedBootloader", "KernelSUDetected", "HookFrameworkDetected", "OsRemountDetected", "FridaAttachDetected", "FridaSpawnDetected", "ZygiskDetected", "DetectCustomRom");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Map<String, EventMetadata> eventsSeen;

    /* JADX INFO: renamed from: xn.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxn/a$a;", "", "<init>", "()V", "", "", "knownThreatEventNames", "Ljava/util/List;", "a", "()Ljava/util/List;", "appdome-threatevents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<String> a() {
            return ThreatEventState.f35261c;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: xn.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0011"}, d2 = {"Lxn/a$b;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "reasonData", "b", "timestamp", "appdome-threatevents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EventMetadata {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String reasonData;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        public final String timestamp;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getReasonData() {
            return this.reasonData;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTimestamp() {
            return this.timestamp;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventMetadata)) {
                return false;
            }
            EventMetadata eventMetadata = (EventMetadata) other;
            return Intrinsics.c(this.reasonData, eventMetadata.reasonData) && Intrinsics.c(this.timestamp, eventMetadata.timestamp);
        }

        public int hashCode() {
            String str = this.reasonData;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.timestamp;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "EventMetadata(reasonData=" + this.reasonData + ", timestamp=" + this.timestamp + ")";
        }
    }

    @NotNull
    public final Map<String, EventMetadata> b() {
        return this.eventsSeen;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ThreatEventState) && Intrinsics.c(this.eventsSeen, ((ThreatEventState) other).eventsSeen);
    }

    public int hashCode() {
        return this.eventsSeen.hashCode();
    }

    @NotNull
    public String toString() {
        return "ThreatEventState(eventsSeen=" + this.eventsSeen + ")";
    }
}
