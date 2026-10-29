package vg;

import android.net.Uri;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.roblox.client.datastructures.NameValuePair;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mh.AnalyticEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p104ei.C5132j;
import p151gk.C6121n;
import p151gk.C6124q;
import p229jt.C7348o;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p272lh.InterfaceC8137a;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p478uu.C11976g;
import p478uu.InterfaceC11970a;
import pt.AbstractC10342d;
import pt.AbstractC10351m;
import pt.C10340b;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: vg.p */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u00031-/B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\f*\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000fH\u0002¢\u0006\u0004\b\"\u0010#J-\u0010'\u001a\u00020\u00122\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000f2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b'\u0010(J&\u0010)\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000fH\u0082@¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u000fH\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020!058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010>¨\u0006@"}, m31665d2 = {"Lvg/p;", "", "Lku/p0;", "eventUploadScope", "Llh/a;", "analyticEventDao", "Lvg/p$c;", "eventUploader", "Lvg/p$b;", "config", "<init>", "(Lku/p0;Llh/a;Lvg/p$c;Lvg/p$b;)V", "", "evt", "ctx", "", "Lcom/roblox/client/datastructures/NameValuePair;", "params", "", "waitForFullBatch", "", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "q", "(Z)V", "p", "(Ljava/lang/String;)Ljava/lang/String;", "serializedEvent", "serializedParams", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "j", "(Llh/a;ZLnt/b;)Ljava/lang/Object;", "Lmh/a;", "k", "()Ljava/util/List;", "events", "", "batchSize", "o", "(Ljava/util/List;IZ)Z", "n", "(Llh/a;Ljava/util/List;Lnt/b;)Ljava/lang/Object;", "l", "(Ljava/util/List;)Ljava/lang/String;", "a", "Lku/p0;", "b", "Llh/a;", "c", "Lvg/p$c;", "d", "Lvg/p$b;", "Ljava/util/concurrent/LinkedBlockingQueue;", "e", "Ljava/util/concurrent/LinkedBlockingQueue;", "eventsQueue", "Ljava/text/SimpleDateFormat;", "f", "Ljava/text/SimpleDateFormat;", "localTimeFormat", "Luu/a;", "Luu/a;", "uploadMutex", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12186p {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7906p0 eventUploadScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final InterfaceC8137a analyticEventDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final c eventUploader;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Config config;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final LinkedBlockingQueue<AnalyticEvent> eventsQueue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final SimpleDateFormat localTimeFormat;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11970a uploadMutex;

    /* JADX INFO: renamed from: vg.p$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m31665d2 = {"Lvg/p$a;", "", "<init>", "()V", "Lmh/a;", "", "a", "(Lmh/a;)Ljava/lang/String;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: vg.p.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m45135a(@NotNull AnalyticEvent analyticEvent) {
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: vg.p$b, reason: from toString */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b#\u0010\"R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b\u001e\u0010\"R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\"R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b%\u0010\"¨\u0006&"}, m31665d2 = {"Lvg/p$b;", "", "", "batchUrl", "", "batchSize", "jsonContentType", "deviceId", "advertisingId", "", "enableExperimentMonitoring", "useGsonForEventUpload", "deleteRoomDBEventsOnClientError", "updateRetryAttemptCountBeforeUpload", "useUrlEncodedStringForEventUpload", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", "g", "d", "e", "f", "Z", "()Z", "i", "h", "j", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class Config {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String batchUrl;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final int batchSize;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        @NotNull
        public final String jsonContentType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        @NotNull
        public final String deviceId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
        @Nullable
        public final String advertisingId;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
        public final boolean enableExperimentMonitoring;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        public final boolean useGsonForEventUpload;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
        public final boolean deleteRoomDBEventsOnClientError;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
        public final boolean updateRetryAttemptCountBeforeUpload;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
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
            return Intrinsics.m31980c(this.batchUrl, config.batchUrl) && this.batchSize == config.batchSize && Intrinsics.m31980c(this.jsonContentType, config.jsonContentType) && Intrinsics.m31980c(this.deviceId, config.deviceId) && Intrinsics.m31980c(this.advertisingId, config.advertisingId) && this.enableExperimentMonitoring == config.enableExperimentMonitoring && this.useGsonForEventUpload == config.useGsonForEventUpload && this.deleteRoomDBEventsOnClientError == config.deleteRoomDBEventsOnClientError && this.updateRetryAttemptCountBeforeUpload == config.updateRetryAttemptCountBeforeUpload && this.useUrlEncodedStringForEventUpload == config.useUrlEncodedStringForEventUpload;
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

    /* JADX INFO: renamed from: vg.p$c */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, m31665d2 = {"Lvg/p$c;", "", "", "url", "body", "contentType", "Lei/j;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "counterName", "", "a", "(Ljava/lang/String;)V", "", "value", "b", "(Ljava/lang/String;J)V", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo45115a(@NotNull String counterName);

        /* JADX INFO: renamed from: b */
        void mo45116b(@NotNull String counterName, long value);

        @Nullable
        /* JADX INFO: renamed from: c */
        Object mo45117c(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull InterfaceC9557b<? super C5132j> interfaceC9557b);
    }

    /* JADX INFO: renamed from: vg.p$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.analytics.EventUploadWorker$addEvent$1$1", m39664f = "EventUploadWorker.kt", m39665l = {116}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ C12186p f42909A;

        /* JADX INFO: renamed from: B */
        public final /* synthetic */ boolean f42910B;

        /* JADX INFO: renamed from: t */
        public Object f42911t;

        /* JADX INFO: renamed from: u */
        public int f42912u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ String f42913v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ String f42914w;

        /* JADX INFO: renamed from: x */
        public final /* synthetic */ String f42915x;

        /* JADX INFO: renamed from: y */
        public final /* synthetic */ String f42916y;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ InterfaceC8137a f42917z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3, String str4, InterfaceC8137a interfaceC8137a, C12186p c12186p, boolean z10, InterfaceC9557b<? super d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f42913v = str;
            this.f42914w = str2;
            this.f42915x = str3;
            this.f42916y = str4;
            this.f42917z = interfaceC8137a;
            this.f42909A = c12186p;
            this.f42910B = z10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new d(this.f42913v, this.f42914w, this.f42915x, this.f42916y, this.f42917z, this.f42909A, this.f42910B, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            AnalyticEvent analyticEvent;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f42912u;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                AnalyticEvent analyticEvent2 = new AnalyticEvent(0, this.f42913v, this.f42914w, this.f42915x, this.f42916y, null, 32, null);
                this.f42911t = analyticEvent2;
                this.f42912u = 1;
                obj = this.f42917z.mo33362i(new AnalyticEvent[]{analyticEvent2}, this);
                if (obj == objM38805e) {
                    return objM38805e;
                }
                analyticEvent = analyticEvent2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                analyticEvent = (AnalyticEvent) this.f42911t;
                C7348o.m30470b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                C10340b.m39661d(C6124q.m27063h("EventUploadJob", "Added event " + this.f42913v + " to database."));
            } else {
                C6124q.m27063h("EventUploadJob", "Failed to add event " + this.f42913v + " to database. Adding it to in-memory queue.");
                C10340b.m39658a(this.f42909A.eventsQueue.add(analyticEvent));
            }
            this.f42909A.m45134q(this.f42910B);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: vg.p$e */
    @InterfaceC10344f(m39663c = "com.roblox.client.analytics.EventUploadWorker", m39664f = "EventUploadWorker.kt", m39665l = {ModuleDescriptor.MODULE_VERSION, 160, 161, 168}, m39666m = "doUpload", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class e extends AbstractC10342d {

        /* JADX INFO: renamed from: B */
        public int f42919B;

        /* JADX INFO: renamed from: t */
        public Object f42920t;

        /* JADX INFO: renamed from: u */
        public Object f42921u;

        /* JADX INFO: renamed from: v */
        public boolean f42922v;

        /* JADX INFO: renamed from: w */
        public boolean f42923w;

        /* JADX INFO: renamed from: x */
        public int f42924x;

        /* JADX INFO: renamed from: y */
        public int f42925y;

        /* JADX INFO: renamed from: z */
        public /* synthetic */ Object f42926z;

        public e(InterfaceC9557b<? super e> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42926z = obj;
            this.f42919B |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C12186p.this.m45128j(null, false, this);
        }
    }

    /* JADX INFO: renamed from: vg.p$f */
    @InterfaceC10344f(m39663c = "com.roblox.client.analytics.EventUploadWorker", m39664f = "EventUploadWorker.kt", m39665l = {210, 217, 225, 230, 237, 244, 251}, m39666m = "sendUploadRequest", m39667v = 1)
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class f extends AbstractC10342d {

        /* JADX INFO: renamed from: A */
        public Object f42927A;

        /* JADX INFO: renamed from: B */
        public Object f42928B;

        /* JADX INFO: renamed from: C */
        public Object f42929C;

        /* JADX INFO: renamed from: D */
        public boolean f42930D;

        /* JADX INFO: renamed from: E */
        public int f42931E;

        /* JADX INFO: renamed from: F */
        public int f42932F;

        /* JADX INFO: renamed from: G */
        public int f42933G;

        /* JADX INFO: renamed from: H */
        public /* synthetic */ Object f42934H;

        /* JADX INFO: renamed from: J */
        public int f42936J;

        /* JADX INFO: renamed from: t */
        public Object f42937t;

        /* JADX INFO: renamed from: u */
        public Object f42938u;

        /* JADX INFO: renamed from: v */
        public Object f42939v;

        /* JADX INFO: renamed from: w */
        public Object f42940w;

        /* JADX INFO: renamed from: x */
        public Object f42941x;

        /* JADX INFO: renamed from: y */
        public Object f42942y;

        /* JADX INFO: renamed from: z */
        public Object f42943z;

        public f(InterfaceC9557b<? super f> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42934H = obj;
            this.f42936J |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C12186p.this.m45131n(null, null, this);
        }
    }

    /* JADX INFO: renamed from: vg.p$g */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.analytics.EventUploadWorker$uploadEvents$1$1", m39664f = "EventUploadWorker.kt", m39665l = {144}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class g extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ boolean f42944A;

        /* JADX INFO: renamed from: t */
        public Object f42945t;

        /* JADX INFO: renamed from: u */
        public Object f42946u;

        /* JADX INFO: renamed from: v */
        public int f42947v;

        /* JADX INFO: renamed from: w */
        public int f42948w;

        /* JADX INFO: renamed from: x */
        public int f42949x;

        /* JADX INFO: renamed from: z */
        public final /* synthetic */ InterfaceC8137a f42951z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC8137a interfaceC8137a, boolean z10, InterfaceC9557b<? super g> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f42951z = interfaceC8137a;
            this.f42944A = z10;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return C12186p.this.new g(this.f42951z, this.f42944A, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC11970a interfaceC11970a;
            Object objM38805e = C10047c.m38805e();
            int i10 = this.f42949x;
            if (i10 == 0) {
                C7348o.m30470b(obj);
                C12186p c12186p = C12186p.this;
                InterfaceC11970a interfaceC11970a2 = c12186p.uploadMutex;
                C12186p c12186p2 = C12186p.this;
                InterfaceC8137a interfaceC8137a = this.f42951z;
                boolean z10 = this.f42944A;
                if (InterfaceC11970a.a.m44676b(interfaceC11970a2, null, 1, null)) {
                    try {
                        this.f42945t = C10350l.m39676a(c12186p);
                        this.f42946u = interfaceC11970a2;
                        this.f42947v = 0;
                        this.f42948w = 0;
                        this.f42949x = 1;
                        if (c12186p2.m45128j(interfaceC8137a, z10, this) == objM38805e) {
                            return objM38805e;
                        }
                        interfaceC11970a = interfaceC11970a2;
                        InterfaceC11970a.a.m44677c(interfaceC11970a, null, 1, null);
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC11970a = interfaceC11970a2;
                        InterfaceC11970a.a.m44677c(interfaceC11970a, null, 1, null);
                        throw th;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC11970a = (InterfaceC11970a) this.f42946u;
                try {
                    C7348o.m30470b(obj);
                    InterfaceC11970a.a.m44677c(interfaceC11970a, null, 1, null);
                } catch (Throwable th3) {
                    th = th3;
                    InterfaceC11970a.a.m44677c(interfaceC11970a, null, 1, null);
                    throw th;
                }
            }
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((g) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    public C12186p(@NotNull InterfaceC7906p0 eventUploadScope, @Nullable InterfaceC8137a interfaceC8137a, @NotNull c eventUploader, @NotNull Config config) {
        Intrinsics.checkNotNullParameter(eventUploadScope, "eventUploadScope");
        Intrinsics.checkNotNullParameter(eventUploader, "eventUploader");
        Intrinsics.checkNotNullParameter(config, "config");
        this.eventUploadScope = eventUploadScope;
        this.analyticEventDao = interfaceC8137a;
        this.eventUploader = eventUploader;
        this.config = config;
        this.eventsQueue = new LinkedBlockingQueue<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.ROOT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Z"));
        this.localTimeFormat = simpleDateFormat;
        this.uploadMutex = C11976g.m44697b(false, 1, null);
    }

    /* JADX INFO: renamed from: i */
    public static final CharSequence m45124i(C12186p c12186p, NameValuePair it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!c12186p.config.getUseUrlEncodedStringForEventUpload()) {
            return it.getName() + "=" + it.getValue();
        }
        String name = it.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String strM45133p = c12186p.m45133p(name);
        String value = it.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return strM45133p + "=" + c12186p.m45133p(value);
    }

    /* JADX INFO: renamed from: m */
    public static final CharSequence m45125m(AnalyticEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "\"" + INSTANCE.m45135a(it) + "\"";
    }

    /* JADX INFO: renamed from: g */
    public final void m45126g(String serializedEvent, String evt, String ctx, String serializedParams, boolean waitForFullBatch) {
        InterfaceC8137a interfaceC8137a = this.analyticEventDao;
        if (interfaceC8137a == null || C7882k.m32780d(this.eventUploadScope, null, null, new d(serializedEvent, evt, ctx, serializedParams, interfaceC8137a, this, waitForFullBatch, null), 3, null) == null) {
            C6124q.m27060e("EventUploadJob", "Failed to add " + serializedEvent + ". Database is not available");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m45127h(@NotNull String evt, @NotNull String ctx, @NotNull List<? extends NameValuePair> params, boolean waitForFullBatch) {
        Intrinsics.checkNotNullParameter(evt, "evt");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(params, "params");
        String str = this.localTimeFormat.format(new Date());
        String deviceId = this.config.getDeviceId();
        String str2 = ("lt=" + str + "&mdid=" + deviceId + "&idfv=" + deviceId + "&idfa=" + this.config.getAdvertisingId()) + "&" + CollectionsKt.m31715m0(params, "&", null, null, 0, null, new Function1() { // from class: vg.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C12186p.m45124i(this.f42890a, (NameValuePair) obj);
            }
        }, 30, null);
        m45126g("evt=" + evt + "&ctx=" + ctx + "&" + str2, evt, ctx, str2, waitForFullBatch);
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
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m45128j(InterfaceC8137a interfaceC8137a, boolean z10, InterfaceC9557b<? super Unit> interfaceC9557b) {
        e eVar;
        InterfaceC8137a interfaceC8137a2;
        int i10;
        List listW0;
        ?? r8;
        int i11;
        boolean z11;
        InterfaceC8137a interfaceC8137a3;
        List list;
        boolean zBooleanValue;
        Object objMo33357a;
        InterfaceC8137a interfaceC8137a4;
        boolean z12;
        Object objM45131n;
        if (interfaceC9557b instanceof e) {
            eVar = (e) interfaceC9557b;
            int i12 = eVar.f42919B;
            if ((i12 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                eVar.f42919B = i12 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                eVar = new e(interfaceC9557b);
            }
        } else {
            eVar = new e(interfaceC9557b);
        }
        Object objMo33359f = eVar.f42926z;
        Object objM38805e = C10047c.m38805e();
        int i13 = eVar.f42919B;
        if (i13 == 0) {
            C7348o.m30470b(objMo33359f);
            int batchSize = this.config.getBatchSize();
            eVar.f42920t = interfaceC8137a;
            eVar.f42922v = z10;
            eVar.f42924x = batchSize;
            eVar.f42919B = 1;
            Object objMo33357a2 = interfaceC8137a.mo33357a(batchSize, eVar);
            if (objMo33357a2 != objM38805e) {
                interfaceC8137a2 = interfaceC8137a;
                i10 = batchSize;
                objMo33359f = objMo33357a2;
            }
            return objM38805e;
        }
        if (i13 == 1) {
            i10 = eVar.f42924x;
            z10 = eVar.f42922v;
            interfaceC8137a2 = (InterfaceC8137a) eVar.f42920t;
            C7348o.m30470b(objMo33359f);
        } else {
            if (i13 == 2) {
                int i14 = eVar.f42924x;
                boolean z13 = eVar.f42922v;
                list = (List) eVar.f42921u;
                interfaceC8137a3 = (InterfaceC8137a) eVar.f42920t;
                C7348o.m30470b(objMo33359f);
                i11 = i14;
                z11 = z13;
                zBooleanValue = ((Boolean) objMo33359f).booleanValue();
                eVar.f42920t = interfaceC8137a3;
                eVar.f42921u = C10350l.m39676a(list);
                eVar.f42922v = z11;
                eVar.f42924x = i11;
                eVar.f42923w = zBooleanValue;
                eVar.f42919B = 3;
                objMo33357a = interfaceC8137a3.mo33357a(i11, eVar);
                if (objMo33357a != objM38805e) {
                    int i15 = i11;
                    z10 = z11;
                    i10 = i15;
                    interfaceC8137a4 = interfaceC8137a3;
                    z12 = zBooleanValue;
                    objMo33359f = objMo33357a;
                    interfaceC8137a2 = interfaceC8137a4;
                    listW0 = CollectionsKt.m31725w0((Collection) objMo33359f, m45129k());
                    if (z12) {
                    }
                    r8 = z12;
                    if (this.config.getEnableExperimentMonitoring()) {
                        eVar.f42920t = C10350l.m39676a(interfaceC8137a2);
                        eVar.f42921u = C10350l.m39676a(listW0);
                        eVar.f42922v = z10;
                        eVar.f42924x = i10;
                        eVar.f42919B = 4;
                        objMo33359f = interfaceC8137a2.mo33359f(eVar);
                    }
                    return Unit.f29331a;
                }
                return objM38805e;
            }
            if (i13 == 3) {
                boolean z14 = eVar.f42923w;
                int i16 = eVar.f42924x;
                boolean z15 = eVar.f42922v;
                InterfaceC8137a interfaceC8137a5 = (InterfaceC8137a) eVar.f42920t;
                C7348o.m30470b(objMo33359f);
                interfaceC8137a4 = interfaceC8137a5;
                z12 = z14;
                i10 = i16;
                z10 = z15;
                interfaceC8137a2 = interfaceC8137a4;
                listW0 = CollectionsKt.m31725w0((Collection) objMo33359f, m45129k());
                if (z12 || !m45132o(listW0, i10, z10)) {
                    r8 = z12;
                    if (this.config.getEnableExperimentMonitoring()) {
                        eVar.f42920t = C10350l.m39676a(interfaceC8137a2);
                        eVar.f42921u = C10350l.m39676a(listW0);
                        eVar.f42922v = z10;
                        eVar.f42924x = i10;
                        eVar.f42919B = 4;
                        objMo33359f = interfaceC8137a2.mo33359f(eVar);
                    }
                    return Unit.f29331a;
                }
                r8 = z12;
                eVar.f42920t = interfaceC8137a2;
                eVar.f42921u = C10350l.m39676a(listW0);
                eVar.f42922v = z10;
                eVar.f42924x = i10;
                eVar.f42925y = r8;
                eVar.f42919B = 2;
                objM45131n = m45131n(interfaceC8137a2, listW0, eVar);
                if (objM45131n != objM38805e) {
                    boolean z16 = z10;
                    i11 = i10;
                    z11 = z16;
                    InterfaceC8137a interfaceC8137a6 = interfaceC8137a2;
                    list = listW0;
                    objMo33359f = objM45131n;
                    interfaceC8137a3 = interfaceC8137a6;
                    zBooleanValue = ((Boolean) objMo33359f).booleanValue();
                    eVar.f42920t = interfaceC8137a3;
                    eVar.f42921u = C10350l.m39676a(list);
                    eVar.f42922v = z11;
                    eVar.f42924x = i11;
                    eVar.f42923w = zBooleanValue;
                    eVar.f42919B = 3;
                    objMo33357a = interfaceC8137a3.mo33357a(i11, eVar);
                    if (objMo33357a != objM38805e) {
                        int i17 = i11;
                        z10 = z11;
                        i10 = i17;
                        interfaceC8137a4 = interfaceC8137a3;
                        z12 = zBooleanValue;
                        objMo33359f = objMo33357a;
                        interfaceC8137a2 = interfaceC8137a4;
                        listW0 = CollectionsKt.m31725w0((Collection) objMo33359f, m45129k());
                        if (z12) {
                        }
                        r8 = z12;
                        if (this.config.getEnableExperimentMonitoring()) {
                            eVar.f42920t = C10350l.m39676a(interfaceC8137a2);
                            eVar.f42921u = C10350l.m39676a(listW0);
                            eVar.f42922v = z10;
                            eVar.f42924x = i10;
                            eVar.f42919B = 4;
                            objMo33359f = interfaceC8137a2.mo33359f(eVar);
                        }
                        return Unit.f29331a;
                    }
                }
                return objM38805e;
            }
            if (i13 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(objMo33359f);
        }
        this.eventUploader.mo45116b("Event-Upload-Pending-Events-Count", ((Number) objMo33359f).intValue());
        return Unit.f29331a;
        listW0 = CollectionsKt.m31725w0((Collection) objMo33359f, m45129k());
        if (m45132o(listW0, i10, z10)) {
            C6124q.m27063h("EventUploadJob", "Uploading " + listW0.size() + " to the server. Batch size " + i10);
            r8 = 0;
            r8 = z12;
            eVar.f42920t = interfaceC8137a2;
            eVar.f42921u = C10350l.m39676a(listW0);
            eVar.f42922v = z10;
            eVar.f42924x = i10;
            eVar.f42925y = r8;
            eVar.f42919B = 2;
            objM45131n = m45131n(interfaceC8137a2, listW0, eVar);
            if (objM45131n != objM38805e) {
                boolean z17 = z10;
                i11 = i10;
                z11 = z17;
                InterfaceC8137a interfaceC8137a7 = interfaceC8137a2;
                list = listW0;
                objMo33359f = objM45131n;
                interfaceC8137a3 = interfaceC8137a7;
                zBooleanValue = ((Boolean) objMo33359f).booleanValue();
                eVar.f42920t = interfaceC8137a3;
                eVar.f42921u = C10350l.m39676a(list);
                eVar.f42922v = z11;
                eVar.f42924x = i11;
                eVar.f42923w = zBooleanValue;
                eVar.f42919B = 3;
                objMo33357a = interfaceC8137a3.mo33357a(i11, eVar);
                if (objMo33357a != objM38805e) {
                    int i18 = i11;
                    z10 = z11;
                    i10 = i18;
                    interfaceC8137a4 = interfaceC8137a3;
                    z12 = zBooleanValue;
                    objMo33359f = objMo33357a;
                    interfaceC8137a2 = interfaceC8137a4;
                    listW0 = CollectionsKt.m31725w0((Collection) objMo33359f, m45129k());
                    if (z12) {
                    }
                }
            }
            return objM38805e;
        }
        C10340b.m39661d(C6124q.m27063h("EventUploadJob", "Not uploading events to the server. Batch size " + i10));
        r8 = z12;
        if (this.config.getEnableExperimentMonitoring()) {
            eVar.f42920t = C10350l.m39676a(interfaceC8137a2);
            eVar.f42921u = C10350l.m39676a(listW0);
            eVar.f42922v = z10;
            eVar.f42924x = i10;
            eVar.f42919B = 4;
            objMo33359f = interfaceC8137a2.mo33359f(eVar);
        }
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: k */
    public final List<AnalyticEvent> m45129k() {
        if (this.eventsQueue.isEmpty()) {
            return C7699p.m31892k();
        }
        ArrayList arrayList = new ArrayList();
        this.eventsQueue.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final String m45130l(List<AnalyticEvent> events) {
        if (!this.config.getUseGsonForEventUpload()) {
            return CollectionsKt.m31715m0(events, ",", "[", "]", 0, null, new Function1() { // from class: vg.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C12186p.m45125m((AnalyticEvent) obj);
                }
            }, 24, null);
        }
        List<AnalyticEvent> list = events;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.m45135a((AnalyticEvent) it.next()));
        }
        return C6121n.m27046c(arrayList);
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
    /* JADX INFO: renamed from: n */
    public final java.lang.Object m45131n(p272lh.InterfaceC8137a r28, java.util.List<mh.AnalyticEvent> r29, p315nt.InterfaceC9557b<? super java.lang.Boolean> r30) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            boolean r4 = r3 instanceof vg.C12186p.f
            if (r4 == 0) goto L1b
            r4 = r3
            vg.p$f r4 = (vg.C12186p.f) r4
            int r5 = r4.f42936J
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f42936J = r5
            goto L20
        L1b:
            vg.p$f r4 = new vg.p$f
            r4.<init>(r3)
        L20:
            java.lang.Object r3 = r4.f42934H
            java.lang.Object r5 = p344ot.C10047c.m38805e()
            int r6 = r4.f42936J
            java.lang.String r7 = "Remove event "
            r8 = 10
            java.lang.String r9 = "EventUploadJob"
            switch(r6) {
                case 0: goto L15a;
                case 1: goto L144;
                case 2: goto L127;
                case 3: goto Lf0;
                case 4: goto Lbf;
                case 5: goto L9a;
                case 6: goto L5f;
                case 7: goto L39;
                default: goto L31;
            }
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            int r1 = r4.f42931E
            java.lang.Object r2 = r4.f42943z
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r4.f42942y
            ei.j r2 = (p104ei.C5132j) r2
            java.lang.Object r2 = r4.f42941x
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r4.f42940w
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r4.f42939v
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r4.f42938u
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r4.f42937t
            lh.a r2 = (p272lh.InterfaceC8137a) r2
            p229jt.C7348o.m30470b(r3)
            r8 = 0
            r16 = 1
            goto L504
        L5f:
            int r1 = r4.f42932F
            int r2 = r4.f42931E
            boolean r6 = r4.f42930D
            java.lang.Object r8 = r4.f42929C
            mh.a r8 = (mh.AnalyticEvent) r8
            java.lang.Object r8 = r4.f42927A
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r12 = r4.f42943z
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r13 = r4.f42942y
            ei.j r13 = (p104ei.C5132j) r13
            java.lang.Object r14 = r4.f42941x
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r4.f42940w
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r11 = r4.f42939v
            java.lang.String r11 = (java.lang.String) r11
            r16 = 1
            java.lang.Object r10 = r4.f42938u
            java.util.List r10 = (java.util.List) r10
            r28 = r1
            java.lang.Object r1 = r4.f42937t
            lh.a r1 = (p272lh.InterfaceC8137a) r1
            p229jt.C7348o.m30470b(r3)
            r18 = r11
            r3 = r13
            r13 = r2
            r11 = r10
            r10 = 0
            r2 = r28
            goto L477
        L9a:
            r16 = 1
            int r1 = r4.f42931E
            java.lang.Object r2 = r4.f42943z
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r4.f42942y
            ei.j r2 = (p104ei.C5132j) r2
            java.lang.Object r2 = r4.f42941x
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r4.f42940w
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r4.f42939v
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r4.f42938u
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r4.f42937t
            lh.a r2 = (p272lh.InterfaceC8137a) r2
            p229jt.C7348o.m30470b(r3)
            goto L2ca
        Lbf:
            r16 = 1
            int r1 = r4.f42932F
            int r2 = r4.f42931E
            boolean r6 = r4.f42930D
            java.lang.Object r7 = r4.f42929C
            mh.a r7 = (mh.AnalyticEvent) r7
            java.lang.Object r7 = r4.f42927A
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r4.f42943z
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r10 = r4.f42942y
            ei.j r10 = (p104ei.C5132j) r10
            java.lang.Object r11 = r4.f42941x
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r4.f42940w
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r4.f42939v
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.f42938u
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r15 = r4.f42937t
            lh.a r15 = (p272lh.InterfaceC8137a) r15
            p229jt.C7348o.m30470b(r3)
            goto L2e3
        Lf0:
            r16 = 1
            int r1 = r4.f42932F
            int r2 = r4.f42931E
            boolean r6 = r4.f42930D
            java.lang.Object r8 = r4.f42929C
            mh.a r8 = (mh.AnalyticEvent) r8
            java.lang.Object r8 = r4.f42927A
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r10 = r4.f42943z
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r11 = r4.f42942y
            ei.j r11 = (p104ei.C5132j) r11
            java.lang.Object r12 = r4.f42941x
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r4.f42940w
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r4.f42939v
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r4.f42938u
            java.util.List r15 = (java.util.List) r15
            r28 = r1
            java.lang.Object r1 = r4.f42937t
            lh.a r1 = (p272lh.InterfaceC8137a) r1
            p229jt.C7348o.m30470b(r3)
            r3 = r13
            r13 = r2
            r2 = r28
            goto L375
        L127:
            r16 = 1
            boolean r1 = r4.f42930D
            java.lang.Object r2 = r4.f42941x
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r4.f42940w
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r10 = r4.f42939v
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r4.f42938u
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r12 = r4.f42937t
            lh.a r12 = (p272lh.InterfaceC8137a) r12
            p229jt.C7348o.m30470b(r3)
            goto L219
        L144:
            r16 = 1
            boolean r1 = r4.f42930D
            java.lang.Object r2 = r4.f42939v
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r4.f42938u
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r6 = r4.f42937t
            lh.a r6 = (p272lh.InterfaceC8137a) r6
            p229jt.C7348o.m30470b(r3)
            r3 = r1
            r1 = r6
            goto L1c5
        L15a:
            r16 = 1
            p229jt.C7348o.m30470b(r3)
            vg.p$b r3 = r0.config
            boolean r3 = r3.getUpdateRetryAttemptCountBeforeUpload()
            if (r3 == 0) goto L1c5
            r6 = r2
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = kotlin.collections.C7701q.m31905u(r6, r8)
            r10.<init>(r11)
            java.util.Iterator r6 = r6.iterator()
        L177:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L1ad
            java.lang.Object r11 = r6.next()
            r17 = r11
            mh.a r17 = (mh.AnalyticEvent) r17
            java.lang.Integer r11 = r17.getRetryAttemptCount()
            if (r11 == 0) goto L190
            int r11 = r11.intValue()
            goto L191
        L190:
            r11 = 0
        L191:
            int r11 = r11 + 1
            java.lang.Integer r23 = pt.C10340b.m39661d(r11)
            r24 = 31
            r25 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            mh.a r11 = mh.AnalyticEvent.m34379b(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r10.add(r11)
            goto L177
        L1ad:
            r4.f42937t = r1
            r4.f42938u = r2
            java.lang.Object r6 = pt.C10350l.m39676a(r10)
            r4.f42939v = r6
            r4.f42930D = r3
            r6 = r16
            r4.f42936J = r6
            java.lang.Object r6 = r1.mo33361h(r10, r4)
            if (r6 != r5) goto L1c5
            goto L502
        L1c5:
            vg.p$b r6 = r0.config
            java.lang.String r10 = r6.getBatchUrl()
            java.lang.String r6 = r0.m45130l(r2)
            vg.p$b r11 = r0.config
            java.lang.String r11 = r11.getJsonContentType()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Making upload request "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r12 = r12.toString()
            p151gk.C6124q.m27063h(r9, r12)
            vg.p$c r12 = r0.eventUploader
            r4.f42937t = r1
            r4.f42938u = r2
            java.lang.Object r13 = pt.C10350l.m39676a(r10)
            r4.f42939v = r13
            java.lang.Object r13 = pt.C10350l.m39676a(r6)
            r4.f42940w = r13
            java.lang.Object r13 = pt.C10350l.m39676a(r11)
            r4.f42941x = r13
            r4.f42930D = r3
            r13 = 2
            r4.f42936J = r13
            java.lang.Object r12 = r12.mo45117c(r10, r6, r11, r4)
            if (r12 != r5) goto L20e
            goto L502
        L20e:
            r26 = r12
            r12 = r1
            r1 = r3
            r3 = r26
            r26 = r11
            r11 = r2
            r2 = r26
        L219:
            ei.j r3 = (p104ei.C5132j) r3
            int r13 = r3.m23933b()
            r14 = 202(0xca, float:2.83E-43)
            r15 = 200(0xc8, float:2.8E-43)
            if (r13 == r15) goto L22e
            int r13 = r3.m23933b()
            if (r13 != r14) goto L22c
            goto L22e
        L22c:
            r13 = 0
            goto L22f
        L22e:
            r13 = 1
        L22f:
            vg.p$b r8 = r0.config
            boolean r8 = r8.getDeleteRoomDBEventsOnClientError()
            if (r8 == 0) goto L3ee
            int r8 = r3.m23933b()
            if (r8 == r15) goto L363
            if (r8 == r14) goto L363
            r7 = 400(0x190, float:5.6E-43)
            if (r8 == r7) goto L2d0
            if (r1 != 0) goto L2cb
            r7 = r11
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.C7701q.m31905u(r7, r9)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L257:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L290
            java.lang.Object r9 = r7.next()
            r17 = r9
            mh.a r17 = (mh.AnalyticEvent) r17
            java.lang.Integer r9 = r17.getRetryAttemptCount()
            if (r9 == 0) goto L272
            int r9 = r9.intValue()
        L26f:
            r16 = 1
            goto L274
        L272:
            r9 = 0
            goto L26f
        L274:
            int r9 = r9 + 1
            java.lang.Integer r23 = pt.C10340b.m39661d(r9)
            r24 = 31
            r25 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            mh.a r9 = mh.AnalyticEvent.m34379b(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r8.add(r9)
            goto L257
        L290:
            java.lang.Object r7 = pt.C10350l.m39676a(r12)
            r4.f42937t = r7
            java.lang.Object r7 = pt.C10350l.m39676a(r11)
            r4.f42938u = r7
            java.lang.Object r7 = pt.C10350l.m39676a(r10)
            r4.f42939v = r7
            java.lang.Object r6 = pt.C10350l.m39676a(r6)
            r4.f42940w = r6
            java.lang.Object r2 = pt.C10350l.m39676a(r2)
            r4.f42941x = r2
            java.lang.Object r2 = pt.C10350l.m39676a(r3)
            r4.f42942y = r2
            java.lang.Object r2 = pt.C10350l.m39676a(r8)
            r4.f42943z = r2
            r4.f42930D = r1
            r4.f42931E = r13
            r1 = 5
            r4.f42936J = r1
            java.lang.Object r1 = r12.mo33361h(r8, r4)
            if (r1 != r5) goto L2c9
            goto L502
        L2c9:
            r1 = r13
        L2ca:
            r13 = r1
        L2cb:
            r8 = 0
        L2cc:
            r16 = 1
            goto L505
        L2d0:
            r7 = r11
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r8 = r7.iterator()
            r14 = r8
            r8 = r7
            r7 = r14
            r14 = r11
            r15 = r12
            r11 = r2
            r12 = r6
            r2 = r13
            r6 = r1
            r13 = r10
            r1 = 0
            r10 = r3
        L2e3:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L360
            java.lang.Object r3 = r7.next()
            r28 = r3
            r3 = r28
            mh.a r3 = (mh.AnalyticEvent) r3
            r29 = r8
            java.lang.String r8 = r3.getSerializedEvent()
            r17 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r18 = r11
            java.lang.String r11 = "Removing event due to client error: "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            p151gk.C6124q.m27063h(r9, r8)
            r4.f42937t = r15
            java.lang.Object r8 = pt.C10350l.m39676a(r14)
            r4.f42938u = r8
            java.lang.Object r8 = pt.C10350l.m39676a(r13)
            r4.f42939v = r8
            java.lang.Object r8 = pt.C10350l.m39676a(r12)
            r4.f42940w = r8
            java.lang.Object r8 = pt.C10350l.m39676a(r18)
            r4.f42941x = r8
            java.lang.Object r8 = pt.C10350l.m39676a(r17)
            r4.f42942y = r8
            java.lang.Object r8 = pt.C10350l.m39676a(r29)
            r4.f42943z = r8
            r4.f42927A = r7
            java.lang.Object r8 = pt.C10350l.m39676a(r28)
            r4.f42928B = r8
            java.lang.Object r8 = pt.C10350l.m39676a(r3)
            r4.f42929C = r8
            r4.f42930D = r6
            r4.f42931E = r2
            r4.f42932F = r1
            r8 = 0
            r4.f42933G = r8
            r8 = 4
            r4.f42936J = r8
            java.lang.Object r3 = r15.mo33358d(r3, r4)
            if (r3 != r5) goto L359
            goto L502
        L359:
            r8 = r29
            r10 = r17
            r11 = r18
            goto L2e3
        L360:
            r13 = r2
            goto L2cb
        L363:
            r8 = r11
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r14 = r8.iterator()
            r15 = r10
            r10 = r8
            r8 = r14
            r14 = r15
            r15 = r11
            r11 = r3
            r3 = r6
            r6 = r1
            r1 = r12
            r12 = r2
            r2 = 0
        L375:
            boolean r17 = r8.hasNext()
            if (r17 == 0) goto L2cb
            java.lang.Object r17 = r8.next()
            r28 = r3
            r3 = r17
            mh.a r3 = (mh.AnalyticEvent) r3
            r29 = r10
            java.lang.String r10 = r3.getSerializedEvent()
            r18 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r7)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            p151gk.C6124q.m27063h(r9, r10)
            r4.f42937t = r1
            java.lang.Object r10 = pt.C10350l.m39676a(r15)
            r4.f42938u = r10
            java.lang.Object r10 = pt.C10350l.m39676a(r14)
            r4.f42939v = r10
            java.lang.Object r10 = pt.C10350l.m39676a(r28)
            r4.f42940w = r10
            java.lang.Object r10 = pt.C10350l.m39676a(r12)
            r4.f42941x = r10
            java.lang.Object r10 = pt.C10350l.m39676a(r18)
            r4.f42942y = r10
            java.lang.Object r10 = pt.C10350l.m39676a(r29)
            r4.f42943z = r10
            r4.f42927A = r8
            java.lang.Object r10 = pt.C10350l.m39676a(r17)
            r4.f42928B = r10
            java.lang.Object r10 = pt.C10350l.m39676a(r3)
            r4.f42929C = r10
            r4.f42930D = r6
            r4.f42931E = r13
            r4.f42932F = r2
            r10 = 0
            r4.f42933G = r10
            r10 = 3
            r4.f42936J = r10
            java.lang.Object r3 = r1.mo33358d(r3, r4)
            if (r3 != r5) goto L3e7
            goto L502
        L3e7:
            r3 = r28
            r10 = r29
            r11 = r18
            goto L375
        L3ee:
            if (r13 == 0) goto L47b
            r8 = r11
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r14 = r8.iterator()
            r15 = r11
            r11 = r10
            r10 = r15
            r15 = r6
            r6 = r1
            r1 = r12
            r12 = r8
            r8 = r14
            r14 = r2
            r2 = 0
        L401:
            boolean r17 = r8.hasNext()
            if (r17 == 0) goto L2cb
            java.lang.Object r17 = r8.next()
            r28 = r3
            r3 = r17
            mh.a r3 = (mh.AnalyticEvent) r3
            r29 = r10
            java.lang.String r10 = r3.getSerializedEvent()
            r18 = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r7)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            p151gk.C6124q.m27063h(r9, r10)
            r4.f42937t = r1
            java.lang.Object r10 = pt.C10350l.m39676a(r29)
            r4.f42938u = r10
            java.lang.Object r10 = pt.C10350l.m39676a(r18)
            r4.f42939v = r10
            java.lang.Object r10 = pt.C10350l.m39676a(r15)
            r4.f42940w = r10
            java.lang.Object r10 = pt.C10350l.m39676a(r14)
            r4.f42941x = r10
            java.lang.Object r10 = pt.C10350l.m39676a(r28)
            r4.f42942y = r10
            java.lang.Object r10 = pt.C10350l.m39676a(r12)
            r4.f42943z = r10
            r4.f42927A = r8
            java.lang.Object r10 = pt.C10350l.m39676a(r17)
            r4.f42928B = r10
            java.lang.Object r10 = pt.C10350l.m39676a(r3)
            r4.f42929C = r10
            r4.f42930D = r6
            r4.f42931E = r13
            r4.f42932F = r2
            r10 = 0
            r4.f42933G = r10
            r11 = 6
            r4.f42936J = r11
            java.lang.Object r3 = r1.mo33358d(r3, r4)
            if (r3 != r5) goto L473
            goto L502
        L473:
            r3 = r28
            r11 = r29
        L477:
            r10 = r11
            r11 = r18
            goto L401
        L47b:
            r8 = 0
            if (r1 != 0) goto L2cc
            r7 = r11
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r9 = new java.util.ArrayList
            r14 = 10
            int r14 = kotlin.collections.C7701q.m31905u(r7, r14)
            r9.<init>(r14)
            java.util.Iterator r7 = r7.iterator()
        L490:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L4c9
            java.lang.Object r14 = r7.next()
            r17 = r14
            mh.a r17 = (mh.AnalyticEvent) r17
            java.lang.Integer r14 = r17.getRetryAttemptCount()
            if (r14 == 0) goto L4ab
            int r14 = r14.intValue()
        L4a8:
            r16 = 1
            goto L4ad
        L4ab:
            r14 = r8
            goto L4a8
        L4ad:
            int r14 = r14 + 1
            java.lang.Integer r23 = pt.C10340b.m39661d(r14)
            r24 = 31
            r25 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            mh.a r14 = mh.AnalyticEvent.m34379b(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r9.add(r14)
            goto L490
        L4c9:
            r16 = 1
            java.lang.Object r7 = pt.C10350l.m39676a(r12)
            r4.f42937t = r7
            java.lang.Object r7 = pt.C10350l.m39676a(r11)
            r4.f42938u = r7
            java.lang.Object r7 = pt.C10350l.m39676a(r10)
            r4.f42939v = r7
            java.lang.Object r6 = pt.C10350l.m39676a(r6)
            r4.f42940w = r6
            java.lang.Object r2 = pt.C10350l.m39676a(r2)
            r4.f42941x = r2
            java.lang.Object r2 = pt.C10350l.m39676a(r3)
            r4.f42942y = r2
            java.lang.Object r2 = pt.C10350l.m39676a(r9)
            r4.f42943z = r2
            r4.f42930D = r1
            r4.f42931E = r13
            r1 = 7
            r4.f42936J = r1
            java.lang.Object r1 = r12.mo33361h(r9, r4)
            if (r1 != r5) goto L503
        L502:
            return r5
        L503:
            r1 = r13
        L504:
            r13 = r1
        L505:
            vg.p$b r1 = r0.config
            boolean r1 = r1.getEnableExperimentMonitoring()
            if (r1 == 0) goto L519
            if (r13 == 0) goto L512
            java.lang.String r1 = "Event-Upload-Upload-Succeed"
            goto L514
        L512:
            java.lang.String r1 = "Event-Upload-Upload-Fail"
        L514:
            vg.p$c r2 = r0.eventUploader
            r2.mo45115a(r1)
        L519:
            if (r13 == 0) goto L51e
            r10 = r16
            goto L51f
        L51e:
            r10 = r8
        L51f:
            java.lang.Boolean r1 = pt.C10340b.m39658a(r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.C12186p.m45131n(lh.a, java.util.List, nt.b):java.lang.Object");
    }

    /* JADX INFO: renamed from: o */
    public final boolean m45132o(List<AnalyticEvent> events, int batchSize, boolean waitForFullBatch) {
        boolean z10 = events.size() >= batchSize || !(waitForFullBatch || events.isEmpty());
        C6124q.m27063h("EventUploadJob", "Should upload events " + z10 + ", events count " + events.size() + ", batch size " + batchSize + ", waitForFullBatch " + waitForFullBatch);
        return z10;
    }

    /* JADX INFO: renamed from: p */
    public final String m45133p(String str) {
        String strEncode = Uri.encode(str);
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
        return strEncode;
    }

    /* JADX INFO: renamed from: q */
    public final void m45134q(boolean waitForFullBatch) {
        InterfaceC8137a interfaceC8137a = this.analyticEventDao;
        if (interfaceC8137a == null || C7882k.m32780d(this.eventUploadScope, null, null, new g(interfaceC8137a, waitForFullBatch, null), 3, null) == null) {
            C6124q.m27060e("EventUploadJob", "Failed to upload events. Database is not available");
        }
    }
}
