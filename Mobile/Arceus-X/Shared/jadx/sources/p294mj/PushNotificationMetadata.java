package p294mj;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p222jj.C7183h;
import p222jj.C7198w;

/* JADX INFO: renamed from: mj.f0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Lmj/f0;", "", "", "notificationId", "notificationType", "Lorg/json/JSONObject;", "detail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class PushNotificationMetadata {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String notificationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String notificationType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final JSONObject detail;

    /* JADX INFO: renamed from: mj.f0$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lmj/f0$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", "metadata", "Lmj/f0;", "a", "(Lorg/json/JSONObject;)Lmj/f0;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: mj.f0.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final PushNotificationMetadata m34435a(@NotNull JSONObject metadata) throws C7183h {
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            String strOptString = metadata.optString("notificationId");
            if (!C7198w.m30119b(strOptString)) {
                strOptString = null;
            }
            if (strOptString == null) {
                throw new C7183h("PushNotificationMetadata notificationId is invalid");
            }
            String strOptString2 = metadata.optString(Payload.TYPE);
            Intrinsics.checkNotNull(strOptString2);
            String str = strOptString2.length() > 0 ? strOptString2 : null;
            if (str == null) {
                throw new C7183h("PushNotificationMetadata notificationType is null or empty");
            }
            JSONObject jSONObjectOptJSONObject = metadata.optJSONObject("detail");
            if (jSONObjectOptJSONObject != null) {
                return new PushNotificationMetadata(strOptString, str, jSONObjectOptJSONObject);
            }
            throw new C7183h("PushNotificationMetadata details object is null");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public PushNotificationMetadata(@NotNull String notificationId, @NotNull String notificationType, @NotNull JSONObject detail) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Intrinsics.checkNotNullParameter(notificationType, "notificationType");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.notificationId = notificationId;
        this.notificationType = notificationType;
        this.detail = detail;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final PushNotificationMetadata m34431a(@NotNull JSONObject jSONObject) {
        return INSTANCE.m34435a(jSONObject);
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final JSONObject getDetail() {
        return this.detail;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getNotificationId() {
        return this.notificationId;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNotificationType() {
        return this.notificationType;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushNotificationMetadata)) {
            return false;
        }
        PushNotificationMetadata pushNotificationMetadata = (PushNotificationMetadata) other;
        return Intrinsics.m31980c(this.notificationId, pushNotificationMetadata.notificationId) && Intrinsics.m31980c(this.notificationType, pushNotificationMetadata.notificationType) && Intrinsics.m31980c(this.detail, pushNotificationMetadata.detail);
    }

    public int hashCode() {
        return (((this.notificationId.hashCode() * 31) + this.notificationType.hashCode()) * 31) + this.detail.hashCode();
    }

    @NotNull
    public String toString() {
        return "PushNotificationMetadata(notificationId=" + this.notificationId + ", notificationType=" + this.notificationType + ", detail=" + this.detail + ")";
    }
}
