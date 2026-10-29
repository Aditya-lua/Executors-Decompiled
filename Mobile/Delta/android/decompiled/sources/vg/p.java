package vg;

import android.net.Uri;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.roblox.client.datastructures.NameValuePair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.p0;
import mh.AnalyticEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u00031-/B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000fH\u0002¢\u0006\u0004\b\"\u0010#J-\u0010'\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000f2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b'\u0010(J&\u0010)\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000fH\u0082@¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000fH\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020!058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010>¨\u0006@"}, d2 = {"Lvg/p;", "", "Lku/p0;", "eventUploadScope", "Llh/a;", "analyticEventDao", "Lvg/p$c;", "eventUploader", "Lvg/p$b;", "config", "<init>", "(Lku/p0;Llh/a;Lvg/p$c;Lvg/p$b;)V", "", "evt", "ctx", "", "Lcom/roblox/client/datastructures/NameValuePair;", "params", "", "waitForFullBatch", "", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "q", "(Z)V", "p", "(Ljava/lang/String;)Ljava/lang/String;", "serializedEvent", "serializedParams", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "j", "(Llh/a;ZLnt/b;)Ljava/lang/Object;", "Lmh/a;", "k", "()Ljava/util/List;", "events", "", "batchSize", "o", "(Ljava/util/List;IZ)Z", "n", "(Llh/a;Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "l", "(Ljava/util/List;)Ljava/lang/String;", "a", "Lku/p0;", "b", "Llh/a;", "c", "Lvg/p$c;", "d", "Lvg/p$b;", "Ljava/util/concurrent/LinkedBlockingQueue;", "e", "Ljava/util/concurrent/LinkedBlockingQueue;", "eventsQueue", "Ljava/text/SimpleDateFormat;", "f", "Ljava/text/SimpleDateFormat;", "localTimeFormat", "Luu/a;", "Luu/a;", "uploadMutex", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p0 eventUploadScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final lh.a analyticEventDao;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c eventUploader;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Config config;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LinkedBlockingQueue<AnalyticEvent> eventsQueue;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SimpleDateFormat localTimeFormat;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uu.a uploadMutex;

    /* JADX INFO: renamed from: vg.p$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvg/p$a;", "", "<init>", "()V", "Lmh/a;", "", "a", "(Lmh/a;)Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(@NotNull AnalyticEvent analyticEvent) {
            Intrinsics.checkNotNullParameter(analyticEvent, "<this>");
            Integer retryAttemptCount = analyticEvent.getRetryAttemptCount();
            if (retryAttemptCount != null) {
                int iIntValue = retryAttemptCount.intValue();
                StringBuilder sb2 = new StringBuilder();
                String eventName = analyticEvent.getEventName();
                if (eventName != null) {
                    sb2.append("evt=" + eventName + "Retry");
                }
                String eventContext = analyticEvent.getEventContext();
                if (eventContext != null) {
                    sb2.append("&ctx=" + eventContext);
                }
                String serializedParams = analyticEvent.getSerializedParams();
                if (serializedParams != null) {
                    sb2.append("&" + serializedParams);
                }
                sb2.append("&retryAttemptCount=" + iIntValue);
                String string = sb2.toString();
                if (string != null) {
                    return string;
                }
            }
            return analyticEvent.getSerializedEvent();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: vg.p$b, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b#\u0010\"R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u001e\u0010\"R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\"R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b%\u0010\"¨\u0006&"}, d2 = {"Lvg/p$b;", "", "", "batchUrl", "", "batchSize", "jsonContentType", "deviceId", "advertisingId", "", "enableExperimentMonitoring", "useGsonForEventUpload", "deleteRoomDBEventsOnClientError", "updateRetryAttemptCountBeforeUpload", "useUrlEncodedStringForEventUpload", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", "g", "d", "e", "f", "Z", "()Z", "i", "h", "j", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Config {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String batchUrl;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int batchSize;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String jsonContentType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @NotNull
        public final String deviceId;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @Nullable
        public final String advertisingId;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean enableExperimentMonitoring;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean useGsonForEventUpload;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean deleteRoomDBEventsOnClientError;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean updateRetryAttemptCountBeforeUpload;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        public final boolean useUrlEncodedStringForEventUpload;

        public Config(@NotNull String batchUrl, int i10, @NotNull String jsonContentType, @NotNull String deviceId, @Nullable String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
            Intrinsics.checkNotNullParameter(batchUrl, "batchUrl");
            Intrinsics.checkNotNullParameter(jsonContentType, "jsonContentType");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            this.batchUrl = batchUrl;
            this.batchSize = i10;
            this.jsonContentType = jsonContentType;
            this.deviceId = deviceId;
            this.advertisingId = str;
            this.enableExperimentMonitoring = z10;
            this.useGsonForEventUpload = z11;
            this.deleteRoomDBEventsOnClientError = z12;
            this.updateRetryAttemptCountBeforeUpload = z13;
            this.useUrlEncodedStringForEventUpload = z14;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getBatchSize() {
            return this.batchSize;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getBatchUrl() {
            return this.batchUrl;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getDeleteRoomDBEventsOnClientError() {
            return this.deleteRoomDBEventsOnClientError;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return Intrinsics.c(this.batchUrl, config.batchUrl) && this.batchSize == config.batchSize && Intrinsics.c(this.jsonContentType, config.jsonContentType) && Intrinsics.c(this.deviceId, config.deviceId) && Intrinsics.c(this.advertisingId, config.advertisingId) && this.enableExperimentMonitoring == config.enableExperimentMonitoring && this.useGsonForEventUpload == config.useGsonForEventUpload && this.deleteRoomDBEventsOnClientError == config.deleteRoomDBEventsOnClientError && this.updateRetryAttemptCountBeforeUpload == config.updateRetryAttemptCountBeforeUpload && this.useUrlEncodedStringForEventUpload == config.useUrlEncodedStringForEventUpload;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getEnableExperimentMonitoring() {
            return this.enableExperimentMonitoring;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getJsonContentType() {
            return this.jsonContentType;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getUpdateRetryAttemptCountBeforeUpload() {
            return this.updateRetryAttemptCountBeforeUpload;
        }

        public int hashCode() {
            int iHashCode = ((((((this.batchUrl.hashCode() * 31) + Integer.hashCode(this.batchSize)) * 31) + this.jsonContentType.hashCode()) * 31) + this.deviceId.hashCode()) * 31;
            String str = this.advertisingId;
            return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.enableExperimentMonitoring)) * 31) + Boolean.hashCode(this.useGsonForEventUpload)) * 31) + Boolean.hashCode(this.deleteRoomDBEventsOnClientError)) * 31) + Boolean.hashCode(this.updateRetryAttemptCountBeforeUpload)) * 31) + Boolean.hashCode(this.useUrlEncodedStringForEventUpload);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getUseGsonForEventUpload() {
            return this.useGsonForEventUpload;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getUseUrlEncodedStringForEventUpload() {
            return this.useUrlEncodedStringForEventUpload;
        }

        @NotNull
        public String toString() {
            return "Config(batchUrl=" + this.batchUrl + ", batchSize=" + this.batchSize + ", jsonContentType=" + this.jsonContentType + ", deviceId=" + this.deviceId + ", advertisingId=" + this.advertisingId + ", enableExperimentMonitoring=" + this.enableExperimentMonitoring + ", useGsonForEventUpload=" + this.useGsonForEventUpload + ", deleteRoomDBEventsOnClientError=" + this.deleteRoomDBEventsOnClientError + ", updateRetryAttemptCountBeforeUpload=" + this.updateRetryAttemptCountBeforeUpload + ", useUrlEncodedStringForEventUpload=" + this.useUrlEncodedStringForEventUpload + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lvg/p$c;", "", "", "url", "body", "contentType", "Lei/j;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "counterName", "", "a", "(Ljava/lang/String;)V", "", "value", "b", "(Ljava/lang/String;J)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        void a(@NotNull String counterName);

        void b(@NotNull String counterName, long value);

        @Nullable
        Object c(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull nt.b<? super ei.j> bVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.analytics.EventUploadWorker$addEvent$1$1", f = "EventUploadWorker.kt", l = {116}, m = "invokeSuspend", v = 1)
    public static final class d extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {
        public final /* synthetic */ p A;
        public final /* synthetic */ boolean B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33147t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f33148u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f33149v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f33150w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f33151x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f33152y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ lh.a f33153z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3, String str4, lh.a aVar, p pVar, boolean z10, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f33149v = str;
            this.f33150w = str2;
            this.f33151x = str3;
            this.f33152y = str4;
            this.f33153z = aVar;
            this.A = pVar;
            this.B = z10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new d(this.f33149v, this.f33150w, this.f33151x, this.f33152y, this.f33153z, this.A, this.B, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            AnalyticEvent analyticEvent;
            Object objE = ot.c.e();
            int i10 = this.f33148u;
            if (i10 == 0) {
                jt.o.b(obj);
                AnalyticEvent analyticEvent2 = new AnalyticEvent(0, this.f33149v, this.f33150w, this.f33151x, this.f33152y, null, 32, null);
                this.f33147t = analyticEvent2;
                this.f33148u = 1;
                obj = this.f33153z.i(new AnalyticEvent[]{analyticEvent2}, this);
                if (obj == objE) {
                    return objE;
                }
                analyticEvent = analyticEvent2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                analyticEvent = (AnalyticEvent) this.f33147t;
                jt.o.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                pt.b.d(gk.p.h("EventUploadJob", "Added event " + this.f33149v + " to database."));
            } else {
                gk.p.h("EventUploadJob", "Failed to add event " + this.f33149v + " to database. Adding it to in-memory queue.");
                pt.b.a(this.A.eventsQueue.add(analyticEvent));
            }
            this.A.q(this.B);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @pt.f(c = "com.roblox.client.analytics.EventUploadWorker", f = "EventUploadWorker.kt", l = {ModuleDescriptor.MODULE_VERSION, 160, 161, 168}, m = "doUpload", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class e extends pt.d {
        public int B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33154t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33155u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f33156v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f33157w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f33158x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f33159y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f33160z;

        public e(nt.b<? super e> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f33160z = obj;
            this.B |= Integer.MIN_VALUE;
            return p.this.j(null, false, this);
        }
    }

    @pt.f(c = "com.roblox.client.analytics.EventUploadWorker", f = "EventUploadWorker.kt", l = {210, 217, 225, 230, 237, 244, 251}, m = "sendUploadRequest", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class f extends pt.d {
        public Object A;
        public Object B;
        public Object C;
        public boolean D;
        public int E;
        public int F;
        public int G;
        public /* synthetic */ Object H;
        public int J;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33161t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33162u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f33163v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f33164w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f33165x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f33166y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f33167z;

        public f(nt.b<? super f> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.H = obj;
            this.J |= Integer.MIN_VALUE;
            return p.this.n(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.analytics.EventUploadWorker$uploadEvents$1$1", f = "EventUploadWorker.kt", l = {144}, m = "invokeSuspend", v = 1)
    public static final class g extends pt.m implements Function2<p0, nt.b<? super Unit>, Object> {
        public final /* synthetic */ boolean A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f33168t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f33169u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f33170v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f33171w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f33172x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ lh.a f33174z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(lh.a aVar, boolean z10, nt.b<? super g> bVar) {
            super(2, bVar);
            this.f33174z = aVar;
            this.A = z10;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return p.this.new g(this.f33174z, this.A, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            uu.a aVar;
            Object objE = ot.c.e();
            int i10 = this.f33172x;
            if (i10 == 0) {
                jt.o.b(obj);
                p pVar = p.this;
                uu.a aVar2 = pVar.uploadMutex;
                p pVar2 = p.this;
                lh.a aVar3 = this.f33174z;
                boolean z10 = this.A;
                if (uu.a.C0590a.b(aVar2, null, 1, null)) {
                    try {
                        this.f33168t = pt.l.a(pVar);
                        this.f33169u = aVar2;
                        this.f33170v = 0;
                        this.f33171w = 0;
                        this.f33172x = 1;
                        if (pVar2.j(aVar3, z10, this) == objE) {
                            return objE;
                        }
                        aVar = aVar2;
                        uu.a.C0590a.c(aVar, null, 1, null);
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = aVar2;
                        uu.a.C0590a.c(aVar, null, 1, null);
                        throw th;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (uu.a) this.f33169u;
                try {
                    jt.o.b(obj);
                    uu.a.C0590a.c(aVar, null, 1, null);
                } catch (Throwable th3) {
                    th = th3;
                    uu.a.C0590a.c(aVar, null, 1, null);
                    throw th;
                }
            }
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    public p(@NotNull p0 eventUploadScope, @Nullable lh.a aVar, @NotNull c eventUploader, @NotNull Config config) {
        Intrinsics.checkNotNullParameter(eventUploadScope, "eventUploadScope");
        Intrinsics.checkNotNullParameter(eventUploader, "eventUploader");
        Intrinsics.checkNotNullParameter(config, "config");
        this.eventUploadScope = eventUploadScope;
        this.analyticEventDao = aVar;
        this.eventUploader = eventUploader;
        this.config = config;
        this.eventsQueue = new LinkedBlockingQueue<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Z"));
        this.localTimeFormat = simpleDateFormat;
        this.uploadMutex = uu.g.b(false, 1, null);
    }

    public static final CharSequence i(p pVar, NameValuePair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!pVar.config.getUseUrlEncodedStringForEventUpload()) {
            return it.getName() + "=" + it.getValue();
        }
        String name = it.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String strP = pVar.p(name);
        String value = it.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return strP + "=" + pVar.p(value);
    }

    public static final CharSequence m(AnalyticEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "\"" + INSTANCE.a(it) + "\"";
    }

    public final void g(String serializedEvent, String evt, String ctx, String serializedParams, boolean waitForFullBatch) {
        lh.a aVar = this.analyticEventDao;
        if (aVar == null || ku.k.d(this.eventUploadScope, null, null, new d(serializedEvent, evt, ctx, serializedParams, aVar, this, waitForFullBatch, null), 3, null) == null) {
            gk.p.e("EventUploadJob", "Failed to add " + serializedEvent + ". Database is not available");
        }
    }

    public final void h(@NotNull String evt, @NotNull String ctx, @NotNull List<? extends NameValuePair> params, boolean waitForFullBatch) {
        Intrinsics.checkNotNullParameter(evt, "evt");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(params, "params");
        String str = this.localTimeFormat.format(new Date());
        String deviceId = this.config.getDeviceId();
        String str2 = ("lt=" + str + "&mdid=" + deviceId + "&idfv=" + deviceId + "&idfa=" + this.config.getAdvertisingId()) + "&" + CollectionsKt.m0(params, "&", null, null, 0, null, new Function1() { // from class: vg.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.i(this.f33130a, (NameValuePair) obj);
            }
        }, 30, null);
        g("evt=" + evt + "&ctx=" + ctx + "&" + str2, evt, ctx, str2, waitForFullBatch);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:35:0x0109  */
    /* JADX WARN: Code duplicated, block: B:38:0x011f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0146  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015c, code lost:
    
        if (r14 == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [vg.p] */
    /* JADX WARN: Type inference failed for: r6v10, types: [int] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0109 -> B:18:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(lh.a r12, boolean r13, nt.b<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.p.j(lh.a, boolean, nt.b):java.lang.Object");
    }

    public final List<AnalyticEvent> k() {
        if (this.eventsQueue.isEmpty()) {
            return kotlin.collections.p.k();
        }
        ArrayList arrayList = new ArrayList();
        this.eventsQueue.drainTo(arrayList);
        return arrayList;
    }

    public final String l(List<AnalyticEvent> events) {
        if (!this.config.getUseGsonForEventUpload()) {
            return CollectionsKt.m0(events, ",", "[", "]", 0, null, new Function1() { // from class: vg.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return p.m((AnalyticEvent) obj);
                }
            }, 24, null);
        }
        List<AnalyticEvent> list = events;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.a((AnalyticEvent) it.next()));
        }
        return gk.m.c(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x050d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x050f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0512  */
    /* JADX WARN: Code duplicated, block: B:114:0x051b  */
    /* JADX WARN: Code duplicated, block: B:115:0x051e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0407  */
    /* JADX WARN: Code duplicated, block: B:89:0x0473  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0473 -> B:90:0x0477). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object n(lh.a r28, java.util.List<mh.AnalyticEvent> r29, nt.b<? super java.lang.Boolean> r30) {
        /*
            Method dump skipped, instruction units count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.p.n(lh.a, java.util.List, nt.b):java.lang.Object");
    }

    public final boolean o(List<AnalyticEvent> events, int batchSize, boolean waitForFullBatch) {
        boolean z10 = events.size() >= batchSize || !(waitForFullBatch || events.isEmpty());
        gk.p.h("EventUploadJob", "Should upload events " + z10 + ", events count " + events.size() + ", batch size " + batchSize + ", waitForFullBatch " + waitForFullBatch);
        return z10;
    }

    public final String p(String str) {
        String strEncode = Uri.encode(str);
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
        return strEncode;
    }

    public final void q(boolean waitForFullBatch) {
        lh.a aVar = this.analyticEventDao;
        if (aVar == null || ku.k.d(this.eventUploadScope, null, null, new g(aVar, waitForFullBatch, null), 3, null) == null) {
            gk.p.e("EventUploadJob", "Failed to upload events. Database is not available");
        }
    }
}
