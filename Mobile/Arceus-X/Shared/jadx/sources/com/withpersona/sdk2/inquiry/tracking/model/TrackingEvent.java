package com.withpersona.sdk2.inquiry.tracking.model;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p471um.AbstractC11873h;
import p471um.InterfaceC11872g;
import p471um.InterfaceC11874i;
import p495vm.C12232b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0019\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u0082\u0001\u0018\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012¨\u00063À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "", "Companion", "PageViewTrackingEvent", "InquiryForegroundEvent", "InquiryBackgroundEvent", "InquiryVideoStartEvent", "InquiryVideoStopRequestEvent", "InquiryVideoStopEvent", "InquiryVideoIceCompleteEvent", "InquiryVideoErrorEvent", "InquiryPermissionEvent", "InquirySelfieClickEvent", "InquirySelfiePoseEvent", "InquirySelfiePoseDetectEvent", "InquiryGovernmentIdButtonEvent", "InquiryGovernmentIdStateEvent", "InquirySelfieCaptureStateEvent", "InquiryStartEvent", "InquiryEndEvent", "InquiryIntegrationEvent", "InquiryUiStepButtonEvent", "InquiryCameraInfoEvent", "InquiryDebugLogEvent", "InquiryNfcScanEvent", "InquiryNfcErrorEvent", "Unknown", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryBackgroundEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryCameraInfoEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryDebugLogEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryEndEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryForegroundEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryGovernmentIdButtonEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryGovernmentIdStateEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryIntegrationEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryNfcErrorEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryNfcScanEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryPermissionEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfieCaptureStateEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfieClickEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfiePoseDetectEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfiePoseEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryStartEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryUiStepButtonEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoErrorEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoIceCompleteEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoStartEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoStopEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoStopRequestEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$PageViewTrackingEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$Unknown;", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface TrackingEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$Companion;", "", "<init>", "()V", "Lum/h$e;", "createAdapter", "()Lum/h$e;", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final AbstractC11873h.e createAdapter() {
            C12232b c12232bM45368e = C12232b.m45364b(TrackingEvent.class, Payload.TYPE).m45366c(Unknown.INSTANCE).m45368e(PageViewTrackingEvent.class, "inquiry.page.view").m45368e(InquiryForegroundEvent.class, "inquiry.ui.foreground").m45368e(InquiryBackgroundEvent.class, "inquiry.ui.background").m45368e(InquiryVideoStartEvent.class, "inquiry.video.start").m45368e(InquiryVideoStopRequestEvent.class, "inquiry.video.stop_request").m45368e(InquiryVideoStopEvent.class, "inquiry.video.stop").m45368e(InquiryVideoIceCompleteEvent.class, "inquiry.video.ice_complete").m45368e(InquiryVideoErrorEvent.class, "inquiry.video.error").m45368e(InquiryPermissionEvent.class, "inquiry.permissions").m45368e(InquirySelfieClickEvent.class, "inquiry.selfie_capture.button").m45368e(InquirySelfieCaptureStateEvent.class, "inquiry.selfie_capture.state").m45368e(InquirySelfiePoseEvent.class, "inquiry.selfie.pose.capture").m45368e(InquirySelfiePoseDetectEvent.class, "inquiry.selfie.pose.detect").m45368e(InquiryGovernmentIdButtonEvent.class, "inquiry.gov_id_capture.button").m45368e(InquiryGovernmentIdStateEvent.class, "inquiry.gov_id_capture.state").m45368e(InquiryStartEvent.class, "inquiry.start").m45368e(InquiryEndEvent.class, "inquiry.end").m45368e(InquiryIntegrationEvent.class, "inquiry.integration").m45368e(InquiryUiStepButtonEvent.class, "inquiry.ui_step.button").m45368e(InquiryCameraInfoEvent.class, "inquiry.camera.info").m45368e(InquiryDebugLogEvent.class, "inquiry.debug_log").m45368e(InquiryNfcScanEvent.class, "inquiry.nfc.scan").m45368e(InquiryNfcErrorEvent.class, "inquiry.nfc.error");
            c12232bM45368e.getClass();
            return c12232bM45368e;
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryBackgroundEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryBackgroundEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final TrackingUiEvent data;

        @NotNull
        private final String id;

        public InquiryBackgroundEvent(@NotNull String str, @Nullable TrackingUiEvent trackingUiEvent, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = trackingUiEvent;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryBackgroundEvent copy$default(InquiryBackgroundEvent inquiryBackgroundEvent, String str, TrackingUiEvent trackingUiEvent, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryBackgroundEvent.id;
            }
            if ((i10 & 2) != 0) {
                trackingUiEvent = inquiryBackgroundEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryBackgroundEvent.createdAt;
            }
            return inquiryBackgroundEvent.copy(str, trackingUiEvent, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TrackingUiEvent getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryBackgroundEvent copy(@NotNull String id2, @Nullable TrackingUiEvent data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryBackgroundEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryBackgroundEvent)) {
                return false;
            }
            InquiryBackgroundEvent inquiryBackgroundEvent = (InquiryBackgroundEvent) other;
            return Intrinsics.m31980c(this.id, inquiryBackgroundEvent.id) && Intrinsics.m31980c(this.data, inquiryBackgroundEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryBackgroundEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final TrackingUiEvent getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            TrackingUiEvent trackingUiEvent = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (trackingUiEvent == null ? 0 : trackingUiEvent.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryBackgroundEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryCameraInfoEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/CameraInfoEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryCameraInfoEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final CameraInfoEventData data;

        @NotNull
        private final String id;

        public InquiryCameraInfoEvent(@NotNull String str, @Nullable CameraInfoEventData cameraInfoEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = cameraInfoEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryCameraInfoEvent copy$default(InquiryCameraInfoEvent inquiryCameraInfoEvent, String str, CameraInfoEventData cameraInfoEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryCameraInfoEvent.id;
            }
            if ((i10 & 2) != 0) {
                cameraInfoEventData = inquiryCameraInfoEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryCameraInfoEvent.createdAt;
            }
            return inquiryCameraInfoEvent.copy(str, cameraInfoEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CameraInfoEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryCameraInfoEvent copy(@NotNull String id2, @Nullable CameraInfoEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryCameraInfoEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryCameraInfoEvent)) {
                return false;
            }
            InquiryCameraInfoEvent inquiryCameraInfoEvent = (InquiryCameraInfoEvent) other;
            return Intrinsics.m31980c(this.id, inquiryCameraInfoEvent.id) && Intrinsics.m31980c(this.data, inquiryCameraInfoEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryCameraInfoEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final CameraInfoEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            CameraInfoEventData cameraInfoEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (cameraInfoEventData == null ? 0 : cameraInfoEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryCameraInfoEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryDebugLogEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/DebugLogEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/DebugLogEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/DebugLogEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryDebugLogEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final DebugLogEventData data;

        @NotNull
        private final String id;

        public InquiryDebugLogEvent(@NotNull String str, @Nullable DebugLogEventData debugLogEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = debugLogEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryDebugLogEvent copy$default(InquiryDebugLogEvent inquiryDebugLogEvent, String str, DebugLogEventData debugLogEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryDebugLogEvent.id;
            }
            if ((i10 & 2) != 0) {
                debugLogEventData = inquiryDebugLogEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryDebugLogEvent.createdAt;
            }
            return inquiryDebugLogEvent.copy(str, debugLogEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final DebugLogEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryDebugLogEvent copy(@NotNull String id2, @Nullable DebugLogEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryDebugLogEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryDebugLogEvent)) {
                return false;
            }
            InquiryDebugLogEvent inquiryDebugLogEvent = (InquiryDebugLogEvent) other;
            return Intrinsics.m31980c(this.id, inquiryDebugLogEvent.id) && Intrinsics.m31980c(this.data, inquiryDebugLogEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryDebugLogEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final DebugLogEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            DebugLogEventData debugLogEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (debugLogEventData == null ? 0 : debugLogEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryDebugLogEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryEndEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryEndEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryEndEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final InquiryEndEventData data;

        @NotNull
        private final String id;

        public InquiryEndEvent(@NotNull String str, @Nullable InquiryEndEventData inquiryEndEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = inquiryEndEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryEndEvent copy$default(InquiryEndEvent inquiryEndEvent, String str, InquiryEndEventData inquiryEndEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryEndEvent.id;
            }
            if ((i10 & 2) != 0) {
                inquiryEndEventData = inquiryEndEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryEndEvent.createdAt;
            }
            return inquiryEndEvent.copy(str, inquiryEndEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final InquiryEndEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryEndEvent copy(@NotNull String id2, @Nullable InquiryEndEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryEndEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryEndEvent)) {
                return false;
            }
            InquiryEndEvent inquiryEndEvent = (InquiryEndEvent) other;
            return Intrinsics.m31980c(this.id, inquiryEndEvent.id) && Intrinsics.m31980c(this.data, inquiryEndEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryEndEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final InquiryEndEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            InquiryEndEventData inquiryEndEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (inquiryEndEventData == null ? 0 : inquiryEndEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryEndEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryForegroundEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryForegroundEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final TrackingUiEvent data;

        @NotNull
        private final String id;

        public InquiryForegroundEvent(@NotNull String str, @Nullable TrackingUiEvent trackingUiEvent, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = trackingUiEvent;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryForegroundEvent copy$default(InquiryForegroundEvent inquiryForegroundEvent, String str, TrackingUiEvent trackingUiEvent, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryForegroundEvent.id;
            }
            if ((i10 & 2) != 0) {
                trackingUiEvent = inquiryForegroundEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryForegroundEvent.createdAt;
            }
            return inquiryForegroundEvent.copy(str, trackingUiEvent, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TrackingUiEvent getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryForegroundEvent copy(@NotNull String id2, @Nullable TrackingUiEvent data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryForegroundEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryForegroundEvent)) {
                return false;
            }
            InquiryForegroundEvent inquiryForegroundEvent = (InquiryForegroundEvent) other;
            return Intrinsics.m31980c(this.id, inquiryForegroundEvent.id) && Intrinsics.m31980c(this.data, inquiryForegroundEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryForegroundEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final TrackingUiEvent getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            TrackingUiEvent trackingUiEvent = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (trackingUiEvent == null ? 0 : trackingUiEvent.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryForegroundEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryGovernmentIdButtonEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryGovernmentIdButtonEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final GovernmentIdButtonEventData data;

        @NotNull
        private final String id;

        public InquiryGovernmentIdButtonEvent(@NotNull String str, @Nullable GovernmentIdButtonEventData governmentIdButtonEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = governmentIdButtonEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryGovernmentIdButtonEvent copy$default(InquiryGovernmentIdButtonEvent inquiryGovernmentIdButtonEvent, String str, GovernmentIdButtonEventData governmentIdButtonEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryGovernmentIdButtonEvent.id;
            }
            if ((i10 & 2) != 0) {
                governmentIdButtonEventData = inquiryGovernmentIdButtonEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryGovernmentIdButtonEvent.createdAt;
            }
            return inquiryGovernmentIdButtonEvent.copy(str, governmentIdButtonEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final GovernmentIdButtonEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryGovernmentIdButtonEvent copy(@NotNull String id2, @Nullable GovernmentIdButtonEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryGovernmentIdButtonEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryGovernmentIdButtonEvent)) {
                return false;
            }
            InquiryGovernmentIdButtonEvent inquiryGovernmentIdButtonEvent = (InquiryGovernmentIdButtonEvent) other;
            return Intrinsics.m31980c(this.id, inquiryGovernmentIdButtonEvent.id) && Intrinsics.m31980c(this.data, inquiryGovernmentIdButtonEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryGovernmentIdButtonEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final GovernmentIdButtonEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            GovernmentIdButtonEventData governmentIdButtonEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (governmentIdButtonEventData == null ? 0 : governmentIdButtonEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryGovernmentIdButtonEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryGovernmentIdStateEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryGovernmentIdStateEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final GovernmentIdStateEventData data;

        @NotNull
        private final String id;

        public InquiryGovernmentIdStateEvent(@NotNull String str, @Nullable GovernmentIdStateEventData governmentIdStateEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = governmentIdStateEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryGovernmentIdStateEvent copy$default(InquiryGovernmentIdStateEvent inquiryGovernmentIdStateEvent, String str, GovernmentIdStateEventData governmentIdStateEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryGovernmentIdStateEvent.id;
            }
            if ((i10 & 2) != 0) {
                governmentIdStateEventData = inquiryGovernmentIdStateEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryGovernmentIdStateEvent.createdAt;
            }
            return inquiryGovernmentIdStateEvent.copy(str, governmentIdStateEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final GovernmentIdStateEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryGovernmentIdStateEvent copy(@NotNull String id2, @Nullable GovernmentIdStateEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryGovernmentIdStateEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryGovernmentIdStateEvent)) {
                return false;
            }
            InquiryGovernmentIdStateEvent inquiryGovernmentIdStateEvent = (InquiryGovernmentIdStateEvent) other;
            return Intrinsics.m31980c(this.id, inquiryGovernmentIdStateEvent.id) && Intrinsics.m31980c(this.data, inquiryGovernmentIdStateEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryGovernmentIdStateEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final GovernmentIdStateEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            GovernmentIdStateEventData governmentIdStateEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (governmentIdStateEventData == null ? 0 : governmentIdStateEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryGovernmentIdStateEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryIntegrationEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/IntegrationEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryIntegrationEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final IntegrationEventData data;

        @NotNull
        private final String id;

        public InquiryIntegrationEvent(@NotNull String str, @Nullable IntegrationEventData integrationEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = integrationEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryIntegrationEvent copy$default(InquiryIntegrationEvent inquiryIntegrationEvent, String str, IntegrationEventData integrationEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryIntegrationEvent.id;
            }
            if ((i10 & 2) != 0) {
                integrationEventData = inquiryIntegrationEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryIntegrationEvent.createdAt;
            }
            return inquiryIntegrationEvent.copy(str, integrationEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final IntegrationEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryIntegrationEvent copy(@NotNull String id2, @Nullable IntegrationEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryIntegrationEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryIntegrationEvent)) {
                return false;
            }
            InquiryIntegrationEvent inquiryIntegrationEvent = (InquiryIntegrationEvent) other;
            return Intrinsics.m31980c(this.id, inquiryIntegrationEvent.id) && Intrinsics.m31980c(this.data, inquiryIntegrationEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryIntegrationEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final IntegrationEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            IntegrationEventData integrationEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (integrationEventData == null ? 0 : integrationEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryIntegrationEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryNfcErrorEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryNfcErrorEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final NfcErrorEventData data;

        @NotNull
        private final String id;

        public InquiryNfcErrorEvent(@NotNull String str, @Nullable NfcErrorEventData nfcErrorEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = nfcErrorEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryNfcErrorEvent copy$default(InquiryNfcErrorEvent inquiryNfcErrorEvent, String str, NfcErrorEventData nfcErrorEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryNfcErrorEvent.id;
            }
            if ((i10 & 2) != 0) {
                nfcErrorEventData = inquiryNfcErrorEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryNfcErrorEvent.createdAt;
            }
            return inquiryNfcErrorEvent.copy(str, nfcErrorEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final NfcErrorEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryNfcErrorEvent copy(@NotNull String id2, @Nullable NfcErrorEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryNfcErrorEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryNfcErrorEvent)) {
                return false;
            }
            InquiryNfcErrorEvent inquiryNfcErrorEvent = (InquiryNfcErrorEvent) other;
            return Intrinsics.m31980c(this.id, inquiryNfcErrorEvent.id) && Intrinsics.m31980c(this.data, inquiryNfcErrorEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryNfcErrorEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final NfcErrorEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            NfcErrorEventData nfcErrorEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (nfcErrorEventData == null ? 0 : nfcErrorEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryNfcErrorEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryNfcScanEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryNfcScanEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final NfcScanEventData data;

        @NotNull
        private final String id;

        public InquiryNfcScanEvent(@NotNull String str, @Nullable NfcScanEventData nfcScanEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = nfcScanEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryNfcScanEvent copy$default(InquiryNfcScanEvent inquiryNfcScanEvent, String str, NfcScanEventData nfcScanEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryNfcScanEvent.id;
            }
            if ((i10 & 2) != 0) {
                nfcScanEventData = inquiryNfcScanEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryNfcScanEvent.createdAt;
            }
            return inquiryNfcScanEvent.copy(str, nfcScanEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final NfcScanEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryNfcScanEvent copy(@NotNull String id2, @Nullable NfcScanEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryNfcScanEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryNfcScanEvent)) {
                return false;
            }
            InquiryNfcScanEvent inquiryNfcScanEvent = (InquiryNfcScanEvent) other;
            return Intrinsics.m31980c(this.id, inquiryNfcScanEvent.id) && Intrinsics.m31980c(this.data, inquiryNfcScanEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryNfcScanEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final NfcScanEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            NfcScanEventData nfcScanEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (nfcScanEventData == null ? 0 : nfcScanEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryNfcScanEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryPermissionEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/PermissionTrackingEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryPermissionEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final PermissionTrackingEventData data;

        @NotNull
        private final String id;

        public InquiryPermissionEvent(@NotNull String str, @Nullable PermissionTrackingEventData permissionTrackingEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = permissionTrackingEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryPermissionEvent copy$default(InquiryPermissionEvent inquiryPermissionEvent, String str, PermissionTrackingEventData permissionTrackingEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryPermissionEvent.id;
            }
            if ((i10 & 2) != 0) {
                permissionTrackingEventData = inquiryPermissionEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryPermissionEvent.createdAt;
            }
            return inquiryPermissionEvent.copy(str, permissionTrackingEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final PermissionTrackingEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryPermissionEvent copy(@NotNull String id2, @Nullable PermissionTrackingEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryPermissionEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryPermissionEvent)) {
                return false;
            }
            InquiryPermissionEvent inquiryPermissionEvent = (InquiryPermissionEvent) other;
            return Intrinsics.m31980c(this.id, inquiryPermissionEvent.id) && Intrinsics.m31980c(this.data, inquiryPermissionEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryPermissionEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final PermissionTrackingEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            PermissionTrackingEventData permissionTrackingEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (permissionTrackingEventData == null ? 0 : permissionTrackingEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryPermissionEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfieCaptureStateEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquirySelfieCaptureStateEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final SelfieCaptureStateEventData data;

        @NotNull
        private final String id;

        public InquirySelfieCaptureStateEvent(@NotNull String str, @Nullable SelfieCaptureStateEventData selfieCaptureStateEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = selfieCaptureStateEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquirySelfieCaptureStateEvent copy$default(InquirySelfieCaptureStateEvent inquirySelfieCaptureStateEvent, String str, SelfieCaptureStateEventData selfieCaptureStateEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquirySelfieCaptureStateEvent.id;
            }
            if ((i10 & 2) != 0) {
                selfieCaptureStateEventData = inquirySelfieCaptureStateEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquirySelfieCaptureStateEvent.createdAt;
            }
            return inquirySelfieCaptureStateEvent.copy(str, selfieCaptureStateEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SelfieCaptureStateEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquirySelfieCaptureStateEvent copy(@NotNull String id2, @Nullable SelfieCaptureStateEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquirySelfieCaptureStateEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquirySelfieCaptureStateEvent)) {
                return false;
            }
            InquirySelfieCaptureStateEvent inquirySelfieCaptureStateEvent = (InquirySelfieCaptureStateEvent) other;
            return Intrinsics.m31980c(this.id, inquirySelfieCaptureStateEvent.id) && Intrinsics.m31980c(this.data, inquirySelfieCaptureStateEvent.data) && Intrinsics.m31980c(this.createdAt, inquirySelfieCaptureStateEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final SelfieCaptureStateEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            SelfieCaptureStateEventData selfieCaptureStateEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (selfieCaptureStateEventData == null ? 0 : selfieCaptureStateEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquirySelfieCaptureStateEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfieClickEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureButtonEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquirySelfieClickEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final SelfieCaptureButtonEventData data;

        @NotNull
        private final String id;

        public InquirySelfieClickEvent(@NotNull String str, @Nullable SelfieCaptureButtonEventData selfieCaptureButtonEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = selfieCaptureButtonEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquirySelfieClickEvent copy$default(InquirySelfieClickEvent inquirySelfieClickEvent, String str, SelfieCaptureButtonEventData selfieCaptureButtonEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquirySelfieClickEvent.id;
            }
            if ((i10 & 2) != 0) {
                selfieCaptureButtonEventData = inquirySelfieClickEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquirySelfieClickEvent.createdAt;
            }
            return inquirySelfieClickEvent.copy(str, selfieCaptureButtonEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SelfieCaptureButtonEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquirySelfieClickEvent copy(@NotNull String id2, @Nullable SelfieCaptureButtonEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquirySelfieClickEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquirySelfieClickEvent)) {
                return false;
            }
            InquirySelfieClickEvent inquirySelfieClickEvent = (InquirySelfieClickEvent) other;
            return Intrinsics.m31980c(this.id, inquirySelfieClickEvent.id) && Intrinsics.m31980c(this.data, inquirySelfieClickEvent.data) && Intrinsics.m31980c(this.createdAt, inquirySelfieClickEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final SelfieCaptureButtonEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            SelfieCaptureButtonEventData selfieCaptureButtonEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (selfieCaptureButtonEventData == null ? 0 : selfieCaptureButtonEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquirySelfieClickEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfiePoseDetectEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseDetectEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquirySelfiePoseDetectEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final SelfiePoseDetectEventData data;

        @NotNull
        private final String id;

        public InquirySelfiePoseDetectEvent(@NotNull String str, @Nullable SelfiePoseDetectEventData selfiePoseDetectEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = selfiePoseDetectEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquirySelfiePoseDetectEvent copy$default(InquirySelfiePoseDetectEvent inquirySelfiePoseDetectEvent, String str, SelfiePoseDetectEventData selfiePoseDetectEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquirySelfiePoseDetectEvent.id;
            }
            if ((i10 & 2) != 0) {
                selfiePoseDetectEventData = inquirySelfiePoseDetectEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquirySelfiePoseDetectEvent.createdAt;
            }
            return inquirySelfiePoseDetectEvent.copy(str, selfiePoseDetectEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SelfiePoseDetectEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquirySelfiePoseDetectEvent copy(@NotNull String id2, @Nullable SelfiePoseDetectEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquirySelfiePoseDetectEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquirySelfiePoseDetectEvent)) {
                return false;
            }
            InquirySelfiePoseDetectEvent inquirySelfiePoseDetectEvent = (InquirySelfiePoseDetectEvent) other;
            return Intrinsics.m31980c(this.id, inquirySelfiePoseDetectEvent.id) && Intrinsics.m31980c(this.data, inquirySelfiePoseDetectEvent.data) && Intrinsics.m31980c(this.createdAt, inquirySelfiePoseDetectEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final SelfiePoseDetectEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            SelfiePoseDetectEventData selfiePoseDetectEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (selfiePoseDetectEventData == null ? 0 : selfiePoseDetectEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquirySelfiePoseDetectEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfiePoseEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquirySelfiePoseEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final SelfiePoseEventData data;

        @NotNull
        private final String id;

        public InquirySelfiePoseEvent(@NotNull String str, @Nullable SelfiePoseEventData selfiePoseEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = selfiePoseEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquirySelfiePoseEvent copy$default(InquirySelfiePoseEvent inquirySelfiePoseEvent, String str, SelfiePoseEventData selfiePoseEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquirySelfiePoseEvent.id;
            }
            if ((i10 & 2) != 0) {
                selfiePoseEventData = inquirySelfiePoseEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquirySelfiePoseEvent.createdAt;
            }
            return inquirySelfiePoseEvent.copy(str, selfiePoseEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SelfiePoseEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquirySelfiePoseEvent copy(@NotNull String id2, @Nullable SelfiePoseEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquirySelfiePoseEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquirySelfiePoseEvent)) {
                return false;
            }
            InquirySelfiePoseEvent inquirySelfiePoseEvent = (InquirySelfiePoseEvent) other;
            return Intrinsics.m31980c(this.id, inquirySelfiePoseEvent.id) && Intrinsics.m31980c(this.data, inquirySelfiePoseEvent.data) && Intrinsics.m31980c(this.createdAt, inquirySelfiePoseEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final SelfiePoseEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            SelfiePoseEventData selfiePoseEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (selfiePoseEventData == null ? 0 : selfiePoseEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquirySelfiePoseEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryStartEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryStartEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryStartEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/InquiryStartEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryStartEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final InquiryStartEventData data;

        @NotNull
        private final String id;

        public InquiryStartEvent(@NotNull String str, @Nullable InquiryStartEventData inquiryStartEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = inquiryStartEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryStartEvent copy$default(InquiryStartEvent inquiryStartEvent, String str, InquiryStartEventData inquiryStartEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryStartEvent.id;
            }
            if ((i10 & 2) != 0) {
                inquiryStartEventData = inquiryStartEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryStartEvent.createdAt;
            }
            return inquiryStartEvent.copy(str, inquiryStartEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final InquiryStartEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryStartEvent copy(@NotNull String id2, @Nullable InquiryStartEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryStartEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryStartEvent)) {
                return false;
            }
            InquiryStartEvent inquiryStartEvent = (InquiryStartEvent) other;
            return Intrinsics.m31980c(this.id, inquiryStartEvent.id) && Intrinsics.m31980c(this.data, inquiryStartEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryStartEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final InquiryStartEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            InquiryStartEventData inquiryStartEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (inquiryStartEventData == null ? 0 : inquiryStartEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryStartEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryUiStepButtonEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryUiStepButtonEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final UiStepButtonEventData data;

        @NotNull
        private final String id;

        public InquiryUiStepButtonEvent(@NotNull String str, @Nullable UiStepButtonEventData uiStepButtonEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = uiStepButtonEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryUiStepButtonEvent copy$default(InquiryUiStepButtonEvent inquiryUiStepButtonEvent, String str, UiStepButtonEventData uiStepButtonEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryUiStepButtonEvent.id;
            }
            if ((i10 & 2) != 0) {
                uiStepButtonEventData = inquiryUiStepButtonEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryUiStepButtonEvent.createdAt;
            }
            return inquiryUiStepButtonEvent.copy(str, uiStepButtonEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final UiStepButtonEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryUiStepButtonEvent copy(@NotNull String id2, @Nullable UiStepButtonEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryUiStepButtonEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryUiStepButtonEvent)) {
                return false;
            }
            InquiryUiStepButtonEvent inquiryUiStepButtonEvent = (InquiryUiStepButtonEvent) other;
            return Intrinsics.m31980c(this.id, inquiryUiStepButtonEvent.id) && Intrinsics.m31980c(this.data, inquiryUiStepButtonEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryUiStepButtonEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final UiStepButtonEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            UiStepButtonEventData uiStepButtonEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (uiStepButtonEventData == null ? 0 : uiStepButtonEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryUiStepButtonEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoErrorEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/VideoErrorEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryVideoErrorEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final VideoErrorEventData data;

        @NotNull
        private final String id;

        public InquiryVideoErrorEvent(@NotNull String str, @Nullable VideoErrorEventData videoErrorEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = videoErrorEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryVideoErrorEvent copy$default(InquiryVideoErrorEvent inquiryVideoErrorEvent, String str, VideoErrorEventData videoErrorEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryVideoErrorEvent.id;
            }
            if ((i10 & 2) != 0) {
                videoErrorEventData = inquiryVideoErrorEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryVideoErrorEvent.createdAt;
            }
            return inquiryVideoErrorEvent.copy(str, videoErrorEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final VideoErrorEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryVideoErrorEvent copy(@NotNull String id2, @Nullable VideoErrorEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryVideoErrorEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryVideoErrorEvent)) {
                return false;
            }
            InquiryVideoErrorEvent inquiryVideoErrorEvent = (InquiryVideoErrorEvent) other;
            return Intrinsics.m31980c(this.id, inquiryVideoErrorEvent.id) && Intrinsics.m31980c(this.data, inquiryVideoErrorEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryVideoErrorEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final VideoErrorEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            VideoErrorEventData videoErrorEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (videoErrorEventData == null ? 0 : videoErrorEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryVideoErrorEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoIceCompleteEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/VideoIceCompleteEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoIceCompleteEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/VideoIceCompleteEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryVideoIceCompleteEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final VideoIceCompleteEventData data;

        @NotNull
        private final String id;

        public InquiryVideoIceCompleteEvent(@NotNull String str, @Nullable VideoIceCompleteEventData videoIceCompleteEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = videoIceCompleteEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryVideoIceCompleteEvent copy$default(InquiryVideoIceCompleteEvent inquiryVideoIceCompleteEvent, String str, VideoIceCompleteEventData videoIceCompleteEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryVideoIceCompleteEvent.id;
            }
            if ((i10 & 2) != 0) {
                videoIceCompleteEventData = inquiryVideoIceCompleteEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryVideoIceCompleteEvent.createdAt;
            }
            return inquiryVideoIceCompleteEvent.copy(str, videoIceCompleteEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final VideoIceCompleteEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryVideoIceCompleteEvent copy(@NotNull String id2, @Nullable VideoIceCompleteEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryVideoIceCompleteEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryVideoIceCompleteEvent)) {
                return false;
            }
            InquiryVideoIceCompleteEvent inquiryVideoIceCompleteEvent = (InquiryVideoIceCompleteEvent) other;
            return Intrinsics.m31980c(this.id, inquiryVideoIceCompleteEvent.id) && Intrinsics.m31980c(this.data, inquiryVideoIceCompleteEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryVideoIceCompleteEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final VideoIceCompleteEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            VideoIceCompleteEventData videoIceCompleteEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (videoIceCompleteEventData == null ? 0 : videoIceCompleteEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryVideoIceCompleteEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoStartEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStartEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStartEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStartEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryVideoStartEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final VideoStartEventData data;

        @NotNull
        private final String id;

        public InquiryVideoStartEvent(@NotNull String str, @Nullable VideoStartEventData videoStartEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = videoStartEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryVideoStartEvent copy$default(InquiryVideoStartEvent inquiryVideoStartEvent, String str, VideoStartEventData videoStartEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryVideoStartEvent.id;
            }
            if ((i10 & 2) != 0) {
                videoStartEventData = inquiryVideoStartEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryVideoStartEvent.createdAt;
            }
            return inquiryVideoStartEvent.copy(str, videoStartEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final VideoStartEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryVideoStartEvent copy(@NotNull String id2, @Nullable VideoStartEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryVideoStartEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryVideoStartEvent)) {
                return false;
            }
            InquiryVideoStartEvent inquiryVideoStartEvent = (InquiryVideoStartEvent) other;
            return Intrinsics.m31980c(this.id, inquiryVideoStartEvent.id) && Intrinsics.m31980c(this.data, inquiryVideoStartEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryVideoStartEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final VideoStartEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            VideoStartEventData videoStartEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (videoStartEventData == null ? 0 : videoStartEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryVideoStartEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoStopEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryVideoStopEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final VideoStopEventData data;

        @NotNull
        private final String id;

        public InquiryVideoStopEvent(@NotNull String str, @Nullable VideoStopEventData videoStopEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = videoStopEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryVideoStopEvent copy$default(InquiryVideoStopEvent inquiryVideoStopEvent, String str, VideoStopEventData videoStopEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryVideoStopEvent.id;
            }
            if ((i10 & 2) != 0) {
                videoStopEventData = inquiryVideoStopEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryVideoStopEvent.createdAt;
            }
            return inquiryVideoStopEvent.copy(str, videoStopEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final VideoStopEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryVideoStopEvent copy(@NotNull String id2, @Nullable VideoStopEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryVideoStopEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryVideoStopEvent)) {
                return false;
            }
            InquiryVideoStopEvent inquiryVideoStopEvent = (InquiryVideoStopEvent) other;
            return Intrinsics.m31980c(this.id, inquiryVideoStopEvent.id) && Intrinsics.m31980c(this.data, inquiryVideoStopEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryVideoStopEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final VideoStopEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            VideoStopEventData videoStopEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (videoStopEventData == null ? 0 : videoStopEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryVideoStopEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoStopRequestEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopRequestEventData;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopRequestEventData;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/VideoStopRequestEventData;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class InquiryVideoStopRequestEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final VideoStopRequestEventData data;

        @NotNull
        private final String id;

        public InquiryVideoStopRequestEvent(@NotNull String str, @Nullable VideoStopRequestEventData videoStopRequestEventData, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = videoStopRequestEventData;
            this.createdAt = str2;
        }

        public static /* synthetic */ InquiryVideoStopRequestEvent copy$default(InquiryVideoStopRequestEvent inquiryVideoStopRequestEvent, String str, VideoStopRequestEventData videoStopRequestEventData, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inquiryVideoStopRequestEvent.id;
            }
            if ((i10 & 2) != 0) {
                videoStopRequestEventData = inquiryVideoStopRequestEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = inquiryVideoStopRequestEvent.createdAt;
            }
            return inquiryVideoStopRequestEvent.copy(str, videoStopRequestEventData, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final VideoStopRequestEventData getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final InquiryVideoStopRequestEvent copy(@NotNull String id2, @Nullable VideoStopRequestEventData data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new InquiryVideoStopRequestEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InquiryVideoStopRequestEvent)) {
                return false;
            }
            InquiryVideoStopRequestEvent inquiryVideoStopRequestEvent = (InquiryVideoStopRequestEvent) other;
            return Intrinsics.m31980c(this.id, inquiryVideoStopRequestEvent.id) && Intrinsics.m31980c(this.data, inquiryVideoStopRequestEvent.data) && Intrinsics.m31980c(this.createdAt, inquiryVideoStopRequestEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final VideoStopRequestEventData getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            VideoStopRequestEventData videoStopRequestEventData = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (videoStopRequestEventData == null ? 0 : videoStopRequestEventData.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "InquiryVideoStopRequestEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$PageViewTrackingEvent;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "id", "", "data", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;", "createdAt", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getData", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingUiEvent;", "getCreatedAt", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    @InterfaceC11874i(generateAdapter = true)
    public static final /* data */ class PageViewTrackingEvent implements TrackingEvent {

        @NotNull
        private final String createdAt;

        @Nullable
        private final TrackingUiEvent data;

        @NotNull
        private final String id;

        public PageViewTrackingEvent(@NotNull String str, @Nullable TrackingUiEvent trackingUiEvent, @InterfaceC11872g(name = "created_at") @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.id = str;
            this.data = trackingUiEvent;
            this.createdAt = str2;
        }

        public static /* synthetic */ PageViewTrackingEvent copy$default(PageViewTrackingEvent pageViewTrackingEvent, String str, TrackingUiEvent trackingUiEvent, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = pageViewTrackingEvent.id;
            }
            if ((i10 & 2) != 0) {
                trackingUiEvent = pageViewTrackingEvent.data;
            }
            if ((i10 & 4) != 0) {
                str2 = pageViewTrackingEvent.createdAt;
            }
            return pageViewTrackingEvent.copy(str, trackingUiEvent, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TrackingUiEvent getData() {
            return this.data;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @NotNull
        public final PageViewTrackingEvent copy(@NotNull String id2, @Nullable TrackingUiEvent data, @InterfaceC11872g(name = "created_at") @NotNull String createdAt) {
            id2.getClass();
            createdAt.getClass();
            return new PageViewTrackingEvent(id2, data, createdAt);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageViewTrackingEvent)) {
                return false;
            }
            PageViewTrackingEvent pageViewTrackingEvent = (PageViewTrackingEvent) other;
            return Intrinsics.m31980c(this.id, pageViewTrackingEvent.id) && Intrinsics.m31980c(this.data, pageViewTrackingEvent.data) && Intrinsics.m31980c(this.createdAt, pageViewTrackingEvent.createdAt);
        }

        @NotNull
        public final String getCreatedAt() {
            return this.createdAt;
        }

        @Nullable
        public final TrackingUiEvent getData() {
            return this.data;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            TrackingUiEvent trackingUiEvent = this.data;
            return this.createdAt.hashCode() + ((iHashCode + (trackingUiEvent == null ? 0 : trackingUiEvent.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "PageViewTrackingEvent(id=" + this.id + ", data=" + this.data + ", createdAt=" + this.createdAt + ")";
        }
    }

    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$Unknown;", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Unknown implements TrackingEvent {

        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Unknown);
        }

        public int hashCode() {
            return -873345333;
        }

        @NotNull
        public String toString() {
            return "Unknown";
        }
    }
}
