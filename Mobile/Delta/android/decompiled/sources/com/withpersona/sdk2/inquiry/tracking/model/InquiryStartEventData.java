package com.withpersona.sdk2.inquiry.tracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.g;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryStartEventData;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEventData;", "config", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "metadata", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;)V", "getConfig", "()Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryConfigData;", "getMetadata", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final /* data */ class InquiryStartEventData implements TrackingEventData {

    @Nullable
    private final InquiryConfigData config;

    @Nullable
    private final TrackingMetadata metadata;

    /* JADX WARN: Multi-variable type inference failed */
    public InquiryStartEventData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InquiryStartEventData copy$default(InquiryStartEventData inquiryStartEventData, InquiryConfigData inquiryConfigData, TrackingMetadata trackingMetadata, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inquiryConfigData = inquiryStartEventData.config;
        }
        if ((i10 & 2) != 0) {
            trackingMetadata = inquiryStartEventData.metadata;
        }
        return inquiryStartEventData.copy(inquiryConfigData, trackingMetadata);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final InquiryConfigData getConfig() {
        return this.config;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TrackingMetadata getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final InquiryStartEventData copy(@g(name = "inquiry_config") @Nullable InquiryConfigData config, @Nullable TrackingMetadata metadata) {
        return new InquiryStartEventData(config, metadata);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InquiryStartEventData)) {
            return false;
        }
        InquiryStartEventData inquiryStartEventData = (InquiryStartEventData) other;
        return Intrinsics.c(this.config, inquiryStartEventData.config) && Intrinsics.c(this.metadata, inquiryStartEventData.metadata);
    }

    @Nullable
    public final InquiryConfigData getConfig() {
        return this.config;
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.model.TrackingEventData
    @Nullable
    public TrackingMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        InquiryConfigData inquiryConfigData = this.config;
        int iHashCode = (inquiryConfigData == null ? 0 : inquiryConfigData.hashCode()) * 31;
        TrackingMetadata trackingMetadata = this.metadata;
        return iHashCode + (trackingMetadata != null ? trackingMetadata.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InquiryStartEventData(config=" + this.config + ", metadata=" + this.metadata + ")";
    }

    public InquiryStartEventData(@g(name = "inquiry_config") @Nullable InquiryConfigData inquiryConfigData, @Nullable TrackingMetadata trackingMetadata) {
        this.config = inquiryConfigData;
        this.metadata = trackingMetadata;
    }

    public /* synthetic */ InquiryStartEventData(InquiryConfigData inquiryConfigData, TrackingMetadata trackingMetadata, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : inquiryConfigData, (i10 & 2) != 0 ? null : trackingMetadata);
    }
}
