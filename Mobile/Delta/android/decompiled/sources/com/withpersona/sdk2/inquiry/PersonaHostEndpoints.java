package com.withpersona.sdk2.inquiry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/PersonaHostEndpoints;", "", "serverEndpoint", "", "webRtcServerEndpoint", "fallbackModeServerEndpoint", "trackingEventsServerEndpoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getServerEndpoint", "()Ljava/lang/String;", "getWebRtcServerEndpoint", "getFallbackModeServerEndpoint", "getTrackingEventsServerEndpoint", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonaHostEndpoints {

    @NotNull
    private final String fallbackModeServerEndpoint;

    @NotNull
    private final String serverEndpoint;

    @NotNull
    private final String trackingEventsServerEndpoint;

    @NotNull
    private final String webRtcServerEndpoint;

    public PersonaHostEndpoints(@NotNull String serverEndpoint, @NotNull String webRtcServerEndpoint, @NotNull String fallbackModeServerEndpoint, @NotNull String trackingEventsServerEndpoint) {
        Intrinsics.checkNotNullParameter(serverEndpoint, "serverEndpoint");
        Intrinsics.checkNotNullParameter(webRtcServerEndpoint, "webRtcServerEndpoint");
        Intrinsics.checkNotNullParameter(fallbackModeServerEndpoint, "fallbackModeServerEndpoint");
        Intrinsics.checkNotNullParameter(trackingEventsServerEndpoint, "trackingEventsServerEndpoint");
        this.serverEndpoint = serverEndpoint;
        this.webRtcServerEndpoint = webRtcServerEndpoint;
        this.fallbackModeServerEndpoint = fallbackModeServerEndpoint;
        this.trackingEventsServerEndpoint = trackingEventsServerEndpoint;
    }

    public static /* synthetic */ PersonaHostEndpoints copy$default(PersonaHostEndpoints personaHostEndpoints, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = personaHostEndpoints.serverEndpoint;
        }
        if ((i10 & 2) != 0) {
            str2 = personaHostEndpoints.webRtcServerEndpoint;
        }
        if ((i10 & 4) != 0) {
            str3 = personaHostEndpoints.fallbackModeServerEndpoint;
        }
        if ((i10 & 8) != 0) {
            str4 = personaHostEndpoints.trackingEventsServerEndpoint;
        }
        return personaHostEndpoints.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServerEndpoint() {
        return this.serverEndpoint;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWebRtcServerEndpoint() {
        return this.webRtcServerEndpoint;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFallbackModeServerEndpoint() {
        return this.fallbackModeServerEndpoint;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTrackingEventsServerEndpoint() {
        return this.trackingEventsServerEndpoint;
    }

    @NotNull
    public final PersonaHostEndpoints copy(@NotNull String serverEndpoint, @NotNull String webRtcServerEndpoint, @NotNull String fallbackModeServerEndpoint, @NotNull String trackingEventsServerEndpoint) {
        Intrinsics.checkNotNullParameter(serverEndpoint, "serverEndpoint");
        Intrinsics.checkNotNullParameter(webRtcServerEndpoint, "webRtcServerEndpoint");
        Intrinsics.checkNotNullParameter(fallbackModeServerEndpoint, "fallbackModeServerEndpoint");
        Intrinsics.checkNotNullParameter(trackingEventsServerEndpoint, "trackingEventsServerEndpoint");
        return new PersonaHostEndpoints(serverEndpoint, webRtcServerEndpoint, fallbackModeServerEndpoint, trackingEventsServerEndpoint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonaHostEndpoints)) {
            return false;
        }
        PersonaHostEndpoints personaHostEndpoints = (PersonaHostEndpoints) other;
        return Intrinsics.c(this.serverEndpoint, personaHostEndpoints.serverEndpoint) && Intrinsics.c(this.webRtcServerEndpoint, personaHostEndpoints.webRtcServerEndpoint) && Intrinsics.c(this.fallbackModeServerEndpoint, personaHostEndpoints.fallbackModeServerEndpoint) && Intrinsics.c(this.trackingEventsServerEndpoint, personaHostEndpoints.trackingEventsServerEndpoint);
    }

    @NotNull
    public final String getFallbackModeServerEndpoint() {
        return this.fallbackModeServerEndpoint;
    }

    @NotNull
    public final String getServerEndpoint() {
        return this.serverEndpoint;
    }

    @NotNull
    public final String getTrackingEventsServerEndpoint() {
        return this.trackingEventsServerEndpoint;
    }

    @NotNull
    public final String getWebRtcServerEndpoint() {
        return this.webRtcServerEndpoint;
    }

    public int hashCode() {
        return (((((this.serverEndpoint.hashCode() * 31) + this.webRtcServerEndpoint.hashCode()) * 31) + this.fallbackModeServerEndpoint.hashCode()) * 31) + this.trackingEventsServerEndpoint.hashCode();
    }

    @NotNull
    public String toString() {
        return "PersonaHostEndpoints(serverEndpoint=" + this.serverEndpoint + ", webRtcServerEndpoint=" + this.webRtcServerEndpoint + ", fallbackModeServerEndpoint=" + this.fallbackModeServerEndpoint + ", trackingEventsServerEndpoint=" + this.trackingEventsServerEndpoint + ")";
    }
}
