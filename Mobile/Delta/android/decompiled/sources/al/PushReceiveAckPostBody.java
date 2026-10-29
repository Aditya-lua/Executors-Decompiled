package al;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: al.c, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lal/c;", "", "", "notificationId", "metadata", "", "receiveTimestamp", "deviceId", "platformType", "recipientUserId", "notificationType", "", "priority", "originalPriority", "", "notificationChannels", "", "changedChannels", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getNotificationId", "b", "getMetadata", "c", "Ljava/lang/Long;", "getReceiveTimestamp", "()Ljava/lang/Long;", "d", "getDeviceId", "e", "getPlatformType", "f", "J", "getRecipientUserId", "()J", "g", "getNotificationType", "h", "Ljava/lang/Integer;", "getPriority", "()Ljava/lang/Integer;", "i", "getOriginalPriority", "j", "Ljava/util/Map;", "getNotificationChannels", "()Ljava/util/Map;", "k", "Ljava/util/List;", "getChangedChannels", "()Ljava/util/List;", "robloxplatform_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushReceiveAckPostBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("notification_id")
    @Nullable
    private final String notificationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("metadata")
    @Nullable
    private final String metadata;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("receive_timestamp")
    @Nullable
    private final Long receiveTimestamp;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("device_id")
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("platform_type")
    @NotNull
    private final String platformType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("recipient_user_id")
    private final long recipientUserId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("notification_type")
    @Nullable
    private final String notificationType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("android_priority")
    @Nullable
    private final Integer priority;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("android_original_priority")
    @Nullable
    private final Integer originalPriority;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("notification_channels")
    @Nullable
    private final Map<String, String> notificationChannels;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("changed_fields")
    @Nullable
    private final List<String> changedChannels;

    public PushReceiveAckPostBody(@Nullable String str, @Nullable String str2, @Nullable Long l10, @NotNull String deviceId, @NotNull String platformType, long j10, @Nullable String str3, @Nullable Integer num, @Nullable Integer num2, @Nullable Map<String, String> map, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(platformType, "platformType");
        this.notificationId = str;
        this.metadata = str2;
        this.receiveTimestamp = l10;
        this.deviceId = deviceId;
        this.platformType = platformType;
        this.recipientUserId = j10;
        this.notificationType = str3;
        this.priority = num;
        this.originalPriority = num2;
        this.notificationChannels = map;
        this.changedChannels = list;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushReceiveAckPostBody)) {
            return false;
        }
        PushReceiveAckPostBody pushReceiveAckPostBody = (PushReceiveAckPostBody) other;
        return Intrinsics.c(this.notificationId, pushReceiveAckPostBody.notificationId) && Intrinsics.c(this.metadata, pushReceiveAckPostBody.metadata) && Intrinsics.c(this.receiveTimestamp, pushReceiveAckPostBody.receiveTimestamp) && Intrinsics.c(this.deviceId, pushReceiveAckPostBody.deviceId) && Intrinsics.c(this.platformType, pushReceiveAckPostBody.platformType) && this.recipientUserId == pushReceiveAckPostBody.recipientUserId && Intrinsics.c(this.notificationType, pushReceiveAckPostBody.notificationType) && Intrinsics.c(this.priority, pushReceiveAckPostBody.priority) && Intrinsics.c(this.originalPriority, pushReceiveAckPostBody.originalPriority) && Intrinsics.c(this.notificationChannels, pushReceiveAckPostBody.notificationChannels) && Intrinsics.c(this.changedChannels, pushReceiveAckPostBody.changedChannels);
    }

    public int hashCode() {
        String str = this.notificationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.metadata;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.receiveTimestamp;
        int iHashCode3 = (((((((iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31) + this.deviceId.hashCode()) * 31) + this.platformType.hashCode()) * 31) + Long.hashCode(this.recipientUserId)) * 31;
        String str3 = this.notificationType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.priority;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.originalPriority;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Map<String, String> map = this.notificationChannels;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        List<String> list = this.changedChannels;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PushReceiveAckPostBody(notificationId=" + this.notificationId + ", metadata=" + this.metadata + ", receiveTimestamp=" + this.receiveTimestamp + ", deviceId=" + this.deviceId + ", platformType=" + this.platformType + ", recipientUserId=" + this.recipientUserId + ", notificationType=" + this.notificationType + ", priority=" + this.priority + ", originalPriority=" + this.originalPriority + ", notificationChannels=" + this.notificationChannels + ", changedChannels=" + this.changedChannels + ")";
    }
}
