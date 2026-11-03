package com.roblox.client.pushnotification.v2.model;

import androidx.annotation.Keep;
import com.google.mlkit.vision.barcode.common.Barcode;
import ek.q;
import gt.n;
import gt.o;
import gt.s;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b-\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00018B{\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0088\u0001\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0014J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b/\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b0\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b1\u0010\u0014R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b4\u0010\u001eR\u0013\u00106\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b5\u0010\u0017¨\u00069"}, d2 = {"Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;", "", "", "id", "name", "", "version", "description", "groupId", "groupName", "importance", "sound", "", "vibration", "badge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "isValid", "()Z", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Boolean;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "Ljava/lang/Integer;", "getVersion", "getDescription", "getGroupId", "getGroupName", "getImportance", "getSound", "Ljava/lang/Boolean;", "getVibration", "getBadge", "getAndroidImportance", "androidImportance", "Companion", "a", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayloadNotificationChannel {
    public static final int MIN_NUMBERED_VERSION = 1;

    @NotNull
    private static final String TAG = "PayloadNotificationChannel";
    public static final int UNVERSIONED = 0;

    @Nullable
    private final Boolean badge;

    @Nullable
    private final String description;

    @Nullable
    private final String groupId;

    @Nullable
    private final String groupName;

    @Nullable
    private final String id;

    @Nullable
    private final String importance;

    @Nullable
    private final String name;

    @Nullable
    private final String sound;

    @Nullable
    private final Integer version;

    @Nullable
    private final Boolean vibration;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String SOUND_NONE = "none";

    @NotNull
    private static final Map<String, Integer> IMPORTANCE_BY_NAME = k0.m(s.a(SOUND_NONE, 0), s.a("min", 1), s.a("low", 2), s.a("default", 3), s.a("high", 4), s.a("max", 5));

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel$a;", "", "<init>", "()V", "", "logicalId", "", "version", "a", "(Ljava/lang/String;I)Ljava/lang/String;", "registeredId", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;", "json", "Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;", "b", "(Ljava/lang/String;)Lcom/roblox/client/pushnotification/v2/model/PayloadNotificationChannel;", "TAG", "Ljava/lang/String;", "", "IMPORTANCE_BY_NAME", "Ljava/util/Map;", "SOUND_NONE", "UNVERSIONED", "I", "MIN_NUMBERED_VERSION", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a(@NotNull String logicalId, int version) {
            Intrinsics.checkNotNullParameter(logicalId, "logicalId");
            return logicalId + "_" + version;
        }

        @Nullable
        public final PayloadNotificationChannel b(@Nullable String json) {
            Object objB;
            PayloadNotificationChannel payloadNotificationChannel = null;
            if (json != null && !StringsKt.p0(json)) {
                try {
                    n.Companion aVar = n.INSTANCE;
                    objB = n.b((PayloadNotificationChannel) ek.n.b().j(json, PayloadNotificationChannel.class));
                } catch (Throwable th2) {
                    n.Companion aVar2 = n.INSTANCE;
                    objB = n.b(o.a(th2));
                }
                Throwable thE = n.e(objB);
                if (thE == null) {
                    PayloadNotificationChannel payloadNotificationChannel2 = (PayloadNotificationChannel) objB;
                    if (payloadNotificationChannel2 != null && payloadNotificationChannel2.isValid()) {
                        payloadNotificationChannel = payloadNotificationChannel2;
                    }
                    if (payloadNotificationChannel == null) {
                        q.h(PayloadNotificationChannel.TAG, "Ignoring malformed payload notification channel: " + json);
                    }
                    return payloadNotificationChannel;
                }
                q.f(PayloadNotificationChannel.TAG, "Failed to parse payload notification channel: " + json, thE);
            }
            return null;
        }

        @Nullable
        public final Integer c(@NotNull String logicalId, @NotNull String registeredId) {
            Integer intOrNull;
            Intrinsics.checkNotNullParameter(logicalId, "logicalId");
            Intrinsics.checkNotNullParameter(registeredId, "registeredId");
            if (Intrinsics.c(registeredId, logicalId)) {
                return 0;
            }
            String str = logicalId + "_";
            if (x.T(registeredId, str, false, 2, null) && (intOrNull = StringsKt.toIntOrNull(StringsKt.G0(registeredId, str))) != null && intOrNull.intValue() >= 1) {
                return intOrNull;
            }
            return null;
        }

        public Companion() {
        }
    }

    public PayloadNotificationChannel(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.id = str;
        this.name = str2;
        this.version = num;
        this.description = str3;
        this.groupId = str4;
        this.groupName = str5;
        this.importance = str6;
        this.sound = str7;
        this.vibration = bool;
        this.badge = bool2;
    }

    @NotNull
    public static final String androidChannelId(@NotNull String str, int i10) {
        return INSTANCE.a(str, i10);
    }

    public static /* synthetic */ PayloadNotificationChannel copy$default(PayloadNotificationChannel payloadNotificationChannel, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = payloadNotificationChannel.id;
        }
        if ((i10 & 2) != 0) {
            str2 = payloadNotificationChannel.name;
        }
        if ((i10 & 4) != 0) {
            num = payloadNotificationChannel.version;
        }
        if ((i10 & 8) != 0) {
            str3 = payloadNotificationChannel.description;
        }
        if ((i10 & 16) != 0) {
            str4 = payloadNotificationChannel.groupId;
        }
        if ((i10 & 32) != 0) {
            str5 = payloadNotificationChannel.groupName;
        }
        if ((i10 & 64) != 0) {
            str6 = payloadNotificationChannel.importance;
        }
        if ((i10 & 128) != 0) {
            str7 = payloadNotificationChannel.sound;
        }
        if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
            bool = payloadNotificationChannel.vibration;
        }
        if ((i10 & Barcode.FORMAT_UPC_A) != 0) {
            bool2 = payloadNotificationChannel.badge;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return payloadNotificationChannel.copy(str, str2, num, str3, str10, str11, str8, str9, bool3, bool4);
    }

    @Nullable
    public static final PayloadNotificationChannel fromJson(@Nullable String str) {
        return INSTANCE.b(str);
    }

    @Nullable
    public static final Integer versionOfRegisteredChannel(@NotNull String str, @NotNull String str2) {
        return INSTANCE.c(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getBadge() {
        return this.badge;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getImportance() {
        return this.importance;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSound() {
        return this.sound;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getVibration() {
        return this.vibration;
    }

    @NotNull
    public final PayloadNotificationChannel copy(@Nullable String id2, @Nullable String name, @Nullable Integer version, @Nullable String description, @Nullable String groupId, @Nullable String groupName, @Nullable String importance, @Nullable String sound, @Nullable Boolean vibration, @Nullable Boolean badge) {
        return new PayloadNotificationChannel(id2, name, version, description, groupId, groupName, importance, sound, vibration, badge);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayloadNotificationChannel)) {
            return false;
        }
        PayloadNotificationChannel payloadNotificationChannel = (PayloadNotificationChannel) other;
        return Intrinsics.c(this.id, payloadNotificationChannel.id) && Intrinsics.c(this.name, payloadNotificationChannel.name) && Intrinsics.c(this.version, payloadNotificationChannel.version) && Intrinsics.c(this.description, payloadNotificationChannel.description) && Intrinsics.c(this.groupId, payloadNotificationChannel.groupId) && Intrinsics.c(this.groupName, payloadNotificationChannel.groupName) && Intrinsics.c(this.importance, payloadNotificationChannel.importance) && Intrinsics.c(this.sound, payloadNotificationChannel.sound) && Intrinsics.c(this.vibration, payloadNotificationChannel.vibration) && Intrinsics.c(this.badge, payloadNotificationChannel.badge);
    }

    @Nullable
    public final Integer getAndroidImportance() {
        String lowerCase;
        Map<String, Integer> map = IMPORTANCE_BY_NAME;
        String str = this.importance;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        return map.get(lowerCase);
    }

    @Nullable
    public final Boolean getBadge() {
        return this.badge;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final String getGroupName() {
        return this.groupName;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImportance() {
        return this.importance;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSound() {
        return this.sound;
    }

    @Nullable
    public final Integer getVersion() {
        return this.version;
    }

    @Nullable
    public final Boolean getVibration() {
        return this.vibration;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.version;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.groupId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.groupName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.importance;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sound;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.vibration;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.badge;
        return iHashCode9 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final boolean isValid() {
        String str;
        Integer num;
        String str2 = this.id;
        return (str2 == null || StringsKt.p0(str2) || (str = this.name) == null || StringsKt.p0(str) || (num = this.version) == null || num.intValue() < 1 || getAndroidImportance() == null) ? false : true;
    }

    @NotNull
    public String toString() {
        return "PayloadNotificationChannel(id=" + this.id + ", name=" + this.name + ", version=" + this.version + ", description=" + this.description + ", groupId=" + this.groupId + ", groupName=" + this.groupName + ", importance=" + this.importance + ", sound=" + this.sound + ", vibration=" + this.vibration + ", badge=" + this.badge + ")";
    }

    public /* synthetic */ PayloadNotificationChannel(String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, Boolean bool, Boolean bool2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : str7, (i10 & Barcode.FORMAT_QR_CODE) != 0 ? null : bool, (i10 & Barcode.FORMAT_UPC_A) != 0 ? null : bool2);
    }
}
