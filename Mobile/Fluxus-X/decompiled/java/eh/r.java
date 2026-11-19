package eh;

import android.net.Uri;
import com.github.luben.zstd.BuildConfig;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import vh.AnalyticEvent;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u0001:\u0003/\u0015\u0017B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000fH\u0002¢\u0006\u0004\b\"\u0010#J-\u0010'\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000f2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b'\u0010(J&\u0010)\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000fH\u0082@¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000fH\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010-R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020!038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, d2 = {"Leh/r;", "Leh/l;", "Lav/p0;", "eventUploadScope", "Luh/a;", "analyticEventDao", "Leh/r$c;", "eventUploader", "Leh/r$b;", "config", "<init>", "(Lav/p0;Luh/a;Leh/r$c;Leh/r$b;)V", BuildConfig.FLAVOR, "evt", "ctx", BuildConfig.FLAVOR, "Lcom/roblox/client/datastructures/NameValuePair;", "params", BuildConfig.FLAVOR, "waitForFullBatch", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "b", "(Z)V", "q", "(Ljava/lang/String;)Ljava/lang/String;", "serializedEvent", "serializedParams", "i", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "k", "(Luh/a;ZLeu/b;)Ljava/lang/Object;", "Lvh/a;", "l", "()Ljava/util/List;", "events", BuildConfig.FLAVOR, "batchSize", "p", "(Ljava/util/List;IZ)Z", "o", "(Luh/a;Ljava/util/List;Leu/b;)Ljava/lang/Object;", "m", "(Ljava/util/List;)Ljava/lang/String;", "Lav/p0;", "Luh/a;", "c", "Leh/r$c;", "d", "Leh/r$b;", "Ljava/util/concurrent/LinkedBlockingQueue;", "e", "Ljava/util/concurrent/LinkedBlockingQueue;", "eventsQueue", "Ljava/text/SimpleDateFormat;", "f", "Ljava/text/SimpleDateFormat;", "localTimeFormat", "Lkv/a;", "g", "Lkv/a;", "uploadMutex", "h", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r implements l {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final av.p0 eventUploadScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final uh.a analyticEventDao;

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
    public final kv.a uploadMutex;

    /* JADX INFO: renamed from: eh.r$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Leh/r$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lvh/a;", BuildConfig.FLAVOR, "a", "(Lvh/a;)Ljava/lang/String;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* JADX INFO: renamed from: eh.r$b, reason: from toString */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b#\u0010\"R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u001e\u0010\"R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\"R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b%\u0010\"¨\u0006&"}, d2 = {"Leh/r$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "batchUrl", BuildConfig.FLAVOR, "batchSize", "jsonContentType", "deviceId", "advertisingId", BuildConfig.FLAVOR, "enableExperimentMonitoring", "useGsonForEventUpload", "deleteRoomDBEventsOnClientError", "updateRetryAttemptCountBeforeUpload", "useUrlEncodedStringForEventUpload", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", "g", "d", "e", "f", "Z", "()Z", "i", "h", "j", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Leh/r$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "url", "body", "contentType", "Lmi/j;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;", "counterName", BuildConfig.FLAVOR, "a", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "value", "b", "(Ljava/lang/String;J)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        void a(@NotNull String counterName);

        void b(@NotNull String counterName, long value);

        @Nullable
        Object c(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull eu.b<? super mi.j> bVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.analytics.EventUploadWorker$addEvent$1$1", f = "EventUploadWorker.kt", l = {116}, m = "invokeSuspend", v = 1)
    public static final class d extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {
        public final /* synthetic */ r A;
        public final /* synthetic */ boolean B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f13595t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f13596u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f13597v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f13598w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f13599x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ String f13600y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ uh.a f13601z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3, String str4, uh.a aVar, r rVar, boolean z10, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f13597v = str;
            this.f13598w = str2;
            this.f13599x = str3;
            this.f13600y = str4;
            this.f13601z = aVar;
            this.A = rVar;
            this.B = z10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new d(this.f13597v, this.f13598w, this.f13599x, this.f13600y, this.f13601z, this.A, this.B, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            AnalyticEvent analyticEvent;
            Object objE = fu.c.e();
            int i10 = this.f13596u;
            if (i10 == 0) {
                zt.o.b(obj);
                AnalyticEvent analyticEvent2 = new AnalyticEvent(0, this.f13597v, this.f13598w, this.f13599x, this.f13600y, null, 32, null);
                this.f13595t = analyticEvent2;
                this.f13596u = 1;
                obj = this.f13601z.d(new AnalyticEvent[]{analyticEvent2}, this);
                if (obj == objE) {
                    return objE;
                }
                analyticEvent = analyticEvent2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                analyticEvent = (AnalyticEvent) this.f13595t;
                zt.o.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                gu.b.c(ok.q.h("EventUploadJob", "Added event " + this.f13597v + " to database."));
            } else {
                ok.q.h("EventUploadJob", "Failed to add event " + this.f13597v + " to database. Adding it to in-memory queue.");
                gu.b.a(this.A.eventsQueue.add(analyticEvent));
            }
            this.A.b(this.B);
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.analytics.EventUploadWorker", f = "EventUploadWorker.kt", l = {ModuleDescriptor.MODULE_VERSION, 160, 161, 168}, m = "doUpload", v = 1)
    public static final class e extends gu.d {
        public int B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f13602t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f13603u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f13604v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f13605w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f13606x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f13607y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public /* synthetic */ Object f13608z;

        public e(eu.b<? super e> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f13608z = obj;
            this.B |= Integer.MIN_VALUE;
            return r.this.k(null, false, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    @gu.f(c = "com.roblox.client.analytics.EventUploadWorker", f = "EventUploadWorker.kt", l = {210, 217, 225, 230, 237, 244, 251}, m = "sendUploadRequest", v = 1)
    public static final class f extends gu.d {
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
        public Object f13609t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f13610u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f13611v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Object f13612w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public Object f13613x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Object f13614y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public Object f13615z;

        public f(eu.b<? super f> bVar) {
            super(bVar);
        }

        @Override // gu.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.H = obj;
            this.J |= Integer.MIN_VALUE;
            return r.this.o(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.analytics.EventUploadWorker$uploadEvents$1$1", f = "EventUploadWorker.kt", l = {144}, m = "invokeSuspend", v = 1)
    public static final class g extends gu.m implements Function2<av.p0, eu.b<? super Unit>, Object> {
        public final /* synthetic */ boolean A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f13616t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f13617u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f13618v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f13619w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f13620x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ uh.a f13622z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(uh.a aVar, boolean z10, eu.b<? super g> bVar) {
            super(2, bVar);
            this.f13622z = aVar;
            this.A = z10;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return r.this.new g(this.f13622z, this.A, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(av.p0 p0Var, eu.b<? super Unit> bVar) {
            return ((g) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kv.a aVar;
            Object objE = fu.c.e();
            int i10 = this.f13620x;
            if (i10 == 0) {
                zt.o.b(obj);
                r rVar = r.this;
                kv.a aVar2 = rVar.uploadMutex;
                r rVar2 = r.this;
                uh.a aVar3 = this.f13622z;
                boolean z10 = this.A;
                if (kv.a.C0416a.b(aVar2, null, 1, null)) {
                    try {
                        this.f13616t = gu.l.a(rVar);
                        this.f13617u = aVar2;
                        this.f13618v = 0;
                        this.f13619w = 0;
                        this.f13620x = 1;
                        if (rVar2.k(aVar3, z10, this) == objE) {
                            return objE;
                        }
                        aVar = aVar2;
                        kv.a.C0416a.c(aVar, null, 1, null);
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = aVar2;
                        kv.a.C0416a.c(aVar, null, 1, null);
                        throw th;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (kv.a) this.f13617u;
                try {
                    zt.o.b(obj);
                    kv.a.C0416a.c(aVar, null, 1, null);
                } catch (Throwable th3) {
                    th = th3;
                    kv.a.C0416a.c(aVar, null, 1, null);
                    throw th;
                }
            }
            return Unit.f21506a;
        }
    }

    public r(@NotNull av.p0 eventUploadScope, @Nullable uh.a aVar, @NotNull c eventUploader, @NotNull Config config) {
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
        this.uploadMutex = kv.g.b(false, 1, null);
    }

    public static final CharSequence j(r rVar, NameValuePair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!rVar.config.getUseUrlEncodedStringForEventUpload()) {
            return it.getName() + "=" + it.getValue();
        }
        String name = it.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String strQ = rVar.q(name);
        String value = it.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return strQ + "=" + rVar.q(value);
    }

    public static final CharSequence n(AnalyticEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "\"" + INSTANCE.a(it) + "\"";
    }

    @Override // eh.l
    public void a(@NotNull String evt, @NotNull String ctx, @NotNull List<? extends NameValuePair> params, boolean waitForFullBatch) {
        Intrinsics.checkNotNullParameter(evt, "evt");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(params, "params");
        String str = this.localTimeFormat.format(new Date());
        String deviceId = this.config.getDeviceId();
        String str2 = ("lt=" + str + "&mdid=" + deviceId + "&idfv=" + deviceId + "&idfa=" + this.config.getAdvertisingId()) + "&" + CollectionsKt.m0(params, "&", null, null, 0, null, new Function1() { // from class: eh.p
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.j(this.f13578a, (NameValuePair) obj);
            }
        }, 30, null);
        i("evt=" + evt + "&ctx=" + ctx + "&" + str2, evt, ctx, str2, waitForFullBatch);
    }

    @Override // eh.l
    public void b(boolean waitForFullBatch) {
        uh.a aVar = this.analyticEventDao;
        if (aVar == null || av.k.d(this.eventUploadScope, null, null, new g(aVar, waitForFullBatch, null), 3, null) == null) {
            ok.q.e("EventUploadJob", "Failed to upload events. Database is not available");
        }
    }

    public final void i(String serializedEvent, String evt, String ctx, String serializedParams, boolean waitForFullBatch) {
        uh.a aVar = this.analyticEventDao;
        if (aVar == null || av.k.d(this.eventUploadScope, null, null, new d(serializedEvent, evt, ctx, serializedParams, aVar, this, waitForFullBatch, null), 3, null) == null) {
            ok.q.e("EventUploadJob", "Failed to add " + serializedEvent + ". Database is not available");
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00cd A[PHI: r2 r6 r12 r13 r14
      0x00cd: PHI (r2v8 uh.a) = (r2v3 uh.a), (r2v10 uh.a) binds: [B:27:0x00ac, B:39:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r6v10 ??) = (r6v7 ??), (r6v21 ??) binds: [B:27:0x00ac, B:39:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r12v6 int) = (r12v2 int), (r12v8 int) binds: [B:27:0x00ac, B:39:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r13v5 boolean) = (r13v1 boolean), (r13v7 boolean) binds: [B:27:0x00ac, B:39:0x0123] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r14v15 java.util.List) = (r14v7 java.util.List), (r14v19 java.util.List) binds: [B:27:0x00ac, B:39:0x0123] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:35:0x0109  */
    /* JADX WARN: Code duplicated, block: B:38:0x011f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [eh.r] */
    /* JADX WARN: Type inference failed for: r6v10, types: [int] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0109 -> B:18:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object k(uh.a r12, boolean r13, eu.b<? super p001kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eh.r.k(uh.a, boolean, eu.b):java.lang.Object");
    }

    public final List<AnalyticEvent> l() {
        if (this.eventsQueue.isEmpty()) {
            return p001kotlin.collections.p.k();
        }
        ArrayList arrayList = new ArrayList();
        this.eventsQueue.drainTo(arrayList);
        return arrayList;
    }

    public final String m(List<AnalyticEvent> events) {
        if (!this.config.getUseGsonForEventUpload()) {
            return CollectionsKt.m0(events, ",", "[", "]", 0, null, new Function1() { // from class: eh.q
                @Override // p001kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return r.n((AnalyticEvent) obj);
                }
            }, 24, null);
        }
        List<AnalyticEvent> list = events;
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.a((AnalyticEvent) it.next()));
        }
        return ok.n.c(arrayList);
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
    public final java.lang.Object o(uh.a r28, java.util.List<vh.AnalyticEvent> r29, eu.b<? super java.lang.Boolean> r30) {
        /*
            Method dump skipped, instruction units count: 1336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eh.r.o(uh.a, java.util.List, eu.b):java.lang.Object");
    }

    public final boolean p(List<AnalyticEvent> events, int batchSize, boolean waitForFullBatch) {
        boolean z10 = events.size() >= batchSize || !(waitForFullBatch || events.isEmpty());
        ok.q.h("EventUploadJob", "Should upload events " + z10 + ", events count " + events.size() + ", batch size " + batchSize + ", waitForFullBatch " + waitForFullBatch);
        return z10;
    }

    public final String q(String str) {
        String strEncode = Uri.encode(str);
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
        return strEncode;
    }
}
