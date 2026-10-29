package com.withpersona.sdk2.inquiry.tracking.model;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.g;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "component", "", "state", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getComponent", "()Ljava/lang/String;", "getState", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final /* data */ class PermissionTrackingEventData implements TrackingEventData {

    @NotNull
    private final String component;

    @Nullable
    private final TrackingMetadata metadata;

    @NotNull
    private final String state;

    public PermissionTrackingEventData(@g(name = Payload.TYPE) @NotNull String str, @g(name = "state") @NotNull String str2, @Nullable TrackingMetadata trackingMetadata) {
        str.getClass();
        str2.getClass();
        this.component = str;
        this.state = str2;
        this.metadata = trackingMetadata;
    }

    public static /* synthetic */ PermissionTrackingEventData copy$default(PermissionTrackingEventData permissionTrackingEventData, String str, String str2, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = permissionTrackingEventData.component;
        }
        if ((i10 & 2) != 0) {
            str2 = permissionTrackingEventData.state;
        }
        if ((i10 & 4) != 0) {
            trackingMetadata = permissionTrackingEventData.metadata;
        }
        return permissionTrackingEventData.copy(str, str2, trackingMetadata);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getComponent() {
        return this.component;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final PermissionTrackingEventData copy(@g(name = Payload.TYPE) @NotNull String component, @g(name = "state") @NotNull String state, @Nullable TrackingMetadata metadata) {
        component.getClass();
        state.getClass();
        return new PermissionTrackingEventData(component, state, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionTrackingEventData)) {
            return false;
        }
        PermissionTrackingEventData permissionTrackingEventData = (PermissionTrackingEventData) other;
        return Intrinsics.c(this.component, permissionTrackingEventData.component) && Intrinsics.c(this.state, permissionTrackingEventData.state) && Intrinsics.c(this.metadata, permissionTrackingEventData.metadata);
    }

    @NotNull
    public final String getComponent() {
        return this.component;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    @Nullable
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = (this.state.hashCode() + (this.component.hashCode() * 31)) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode + (trackingMetadata == null ? 0 : trackingMetadata.hashCode());
    }

    @NotNull
    public String toString() {
        return "PermissionTrackingEventData(component=" + this.component + ", state=" + this.state + ", metadata=" + this.metadata + ")";
    }

    public /* synthetic */ PermissionTrackingEventData(String str, String str2, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : trackingMetadata);
    }
}
