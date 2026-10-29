package sm;

import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBridge;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryConfig;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryData;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryFieldValue;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryStandardizedField;
import gk.p;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0019\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ)\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017¨\u0006\u001a"}, d2 = {"Lsm/c;", "", "<init>", "()V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "config", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;", "data", "", "h", "(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;)Z", "i", "", "value", "e", "(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;D)Z", "c", "(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;D)Z", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "b", "Ljava/time/format/DateTimeFormatter;", "dateTimeFormatter", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;", "EMPTY_DATA", "a", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f31236a = new c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final TelemetryData EMPTY_DATA = new b().l();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b&\u0010*R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b+\u0010\u001e\"\u0004\b\u001b\u0010 R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010-¨\u0006/"}, d2 = {"Lsm/c$a;", "Lsm/a;", "", "eventName", "", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryBackend;", "backends", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "", "year", "month", "day", "", "b", "(III)V", "throttlingPercentage", "k", "(I)Lsm/c$a;", "description", "i", "(Ljava/lang/String;)Lsm/c$a;", "j", "(III)Lsm/c$a;", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "d", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryConfig;", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "Ljava/util/Set;", "e", "()Ljava/util/Set;", "setBackends", "(Ljava/util/Set;)V", "c", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V", "f", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "lastUpdatedDate", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements sm.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String eventName;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public Set<? extends TelemetryBackend> backends;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Integer throttlingPercentage;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String description;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public LocalDate lastUpdatedDate;

        public a(@NotNull String eventName, @NotNull Set<? extends TelemetryBackend> backends) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(backends, "backends");
            this.eventName = eventName;
            this.backends = backends;
        }

        @Override // sm.a
        public void a(@Nullable String str) {
            this.description = str;
        }

        @Override // sm.a
        public void b(int year, int month, int day) {
            this.lastUpdatedDate = LocalDate.of(year, month, day);
        }

        @Override // sm.a
        public void c(@Nullable Integer num) {
            this.throttlingPercentage = num;
        }

        @NotNull
        public final TelemetryConfig d() {
            String eventName = getEventName();
            HashSet hashSetK0 = CollectionsKt.K0(e());
            Integer throttlingPercentage = getThrottlingPercentage();
            LocalDate localDate = this.lastUpdatedDate;
            TelemetryConfig telemetryConfig = TelemetryBridge.telemetryConfig(eventName, hashSetK0, throttlingPercentage, localDate != null ? localDate.format(c.dateTimeFormatter) : null, getDescription());
            Intrinsics.checkNotNullExpressionValue(telemetryConfig, "telemetryConfig(...)");
            return telemetryConfig;
        }

        @NotNull
        public Set<TelemetryBackend> e() {
            return this.backends;
        }

        @Nullable
        /* JADX INFO: renamed from: f, reason: from getter */
        public String getDescription() {
            return this.description;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public String getEventName() {
            return this.eventName;
        }

        @Nullable
        /* JADX INFO: renamed from: h, reason: from getter */
        public Integer getThrottlingPercentage() {
            return this.throttlingPercentage;
        }

        @NotNull
        public final a i(@NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            a(description);
            return this;
        }

        @NotNull
        public final a j(int year, int month, int day) {
            b(year, month, day);
            return this;
        }

        @NotNull
        public final a k(int throttlingPercentage) {
            c(Integer.valueOf(throttlingPercentage));
            return this;
        }
    }

    @Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0004¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\nH\u0096\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u000e\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\rH\u0096\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0010H\u0096\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0014\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0013H\u0096\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0096\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&R0\u0010,\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020(0'j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020(`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u00180-j\b\u0012\u0004\u0012\u00020\u0018`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u00107\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010:\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b5\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106¨\u0006;"}, d2 = {"Lsm/c$b;", "Lsm/b;", "<init>", "()V", "", "", "value", "", "e", "(Ljava/lang/String;Z)V", "", "f", "(Ljava/lang/String;I)V", "", "g", "(Ljava/lang/String;J)V", "", "p", "(Ljava/lang/String;F)V", "", "o", "(Ljava/lang/String;D)V", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;", "field", "j", "(Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryStandardizedField;)Lsm/c$b;", "", "fields", "k", "(Ljava/lang/Iterable;)Lsm/c$b;", "key", "", "i", "(Ljava/lang/String;Ljava/lang/Object;)Lsm/c$b;", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;", "l", "()Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryData;", "Ljava/util/HashMap;", "Lcom/roblox/protocols/telemetrybindingsplatforminterface/generated/TelemetryFieldValue;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "customFields", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "b", "Ljava/util/HashSet;", "standardizedFields", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "eventContext", "n", "setLegacyOverrideTargetForEventIngest", "legacyOverrideTargetForEventIngest", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements sm.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final HashMap<String, TelemetryFieldValue> customFields = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final HashSet<TelemetryStandardizedField> standardizedFields = new HashSet<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String eventContext;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String legacyOverrideTargetForEventIngest;

        @Override // sm.b
        public void c(@NotNull String str, @NotNull String value) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this.customFields.put(str, TelemetryBridge.stringFieldValue(value));
        }

        @Override // sm.b
        public void d(@Nullable String str) {
            this.eventContext = str;
        }

        @Override // sm.b
        public void e(@NotNull String str, boolean z10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            this.customFields.put(str, TelemetryBridge.boolFieldValue(z10));
        }

        @Override // sm.b
        public void f(@NotNull String str, int i10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            g(str, i10);
        }

        @Override // sm.b
        public void g(@NotNull String str, long j10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            this.customFields.put(str, TelemetryBridge.intFieldValue(j10));
        }

        @Override // sm.b
        @NotNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b b(@NotNull String key, @NotNull Object value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            if (value instanceof Boolean) {
                e(key, ((Boolean) value).booleanValue());
                return this;
            }
            if (value instanceof Integer) {
                f(key, ((Number) value).intValue());
                return this;
            }
            if (value instanceof Long) {
                g(key, ((Number) value).longValue());
                return this;
            }
            if (value instanceof Float) {
                p(key, ((Number) value).floatValue());
                return this;
            }
            if (value instanceof Double) {
                o(key, ((Number) value).doubleValue());
                return this;
            }
            if (value instanceof String) {
                c(key, (String) value);
                return this;
            }
            p.d("Unsupported field value type: " + value.getClass().getName());
            return this;
        }

        @Override // sm.b
        @NotNull
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b h(@NotNull TelemetryStandardizedField field) {
            Intrinsics.checkNotNullParameter(field, "field");
            this.standardizedFields.add(field);
            return this;
        }

        @Override // sm.b
        @NotNull
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b a(@NotNull Iterable<? extends TelemetryStandardizedField> fields) {
            Intrinsics.checkNotNullParameter(fields, "fields");
            u.z(this.standardizedFields, fields);
            return this;
        }

        @NotNull
        public final TelemetryData l() {
            TelemetryData telemetryData = TelemetryBridge.telemetryData(this.customFields, this.standardizedFields, getEventContext(), getLegacyOverrideTargetForEventIngest());
            Intrinsics.checkNotNullExpressionValue(telemetryData, "telemetryData(...)");
            return telemetryData;
        }

        @Nullable
        /* JADX INFO: renamed from: m, reason: from getter */
        public String getEventContext() {
            return this.eventContext;
        }

        @Nullable
        /* JADX INFO: renamed from: n, reason: from getter */
        public String getLegacyOverrideTargetForEventIngest() {
            return this.legacyOverrideTargetForEventIngest;
        }

        public void o(@NotNull String str, double d10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            this.customFields.put(str, TelemetryBridge.doubleFieldValue(d10));
        }

        public void p(@NotNull String str, float f10) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            o(str, f10);
        }
    }

    public static final boolean b(@NotNull TelemetryConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return f(config, 0.0d, 2, null);
    }

    public static final boolean c(@NotNull TelemetryConfig config, double value) {
        Intrinsics.checkNotNullParameter(config, "config");
        return TelemetryBridge.logCounter(config, EMPTY_DATA, value);
    }

    public static final boolean d(@NotNull TelemetryConfig config, @NotNull TelemetryData data) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        return g(config, data, 0.0d, 4, null);
    }

    public static final boolean e(@NotNull TelemetryConfig config, @NotNull TelemetryData data, double value) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        return TelemetryBridge.logCounter(config, data, value);
    }

    public static /* synthetic */ boolean f(TelemetryConfig telemetryConfig, double d10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            d10 = 1.0d;
        }
        return c(telemetryConfig, d10);
    }

    public static /* synthetic */ boolean g(TelemetryConfig telemetryConfig, TelemetryData telemetryData, double d10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            d10 = 1.0d;
        }
        return e(telemetryConfig, telemetryData, d10);
    }

    public static final boolean h(@NotNull TelemetryConfig config, @NotNull TelemetryData data) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        return TelemetryBridge.logEvent(config, data);
    }

    public static final boolean i(@NotNull TelemetryConfig config, @NotNull TelemetryData data) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(data, "data");
        boolean zLogEvent = TelemetryBridge.logEvent(config, data);
        NativeReportingInterface.flushEngineTelemetryV2Events();
        return zLogEvent;
    }
}
