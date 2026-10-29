package p294mj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: mj.k0, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001\u0014B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006\""}, m31665d2 = {"Lmj/k0;", "", "", "statusMessage", "platform", "name", "notificationToken", "application", "", "userPushNotificationDestinationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStatusMessage", "b", "c", "getName", "d", "getNotificationToken", "e", "getApplication", "f", "I", "getUserPushNotificationDestinationId", "g", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class RegisterDeviceResponse {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String statusMessage;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String platform;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final String notificationToken;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    public final String application;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final int userPushNotificationDestinationId;

    /* JADX INFO: renamed from: mj.k0$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lmj/k0$a;", "", "<init>", "()V", "Lorg/json/JSONObject;", "json", "Lmj/k0;", "a", "(Lorg/json/JSONObject;)Lmj/k0;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: mj.k0.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final RegisterDeviceResponse m34442a(@NotNull JSONObject json) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObject = json.getJSONObject("registration");
            String string = json.getString("statusMessage");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = jSONObject.getString("platform");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = jSONObject.getString("name");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = jSONObject.getString("notificationToken");
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            String string5 = jSONObject.getString("application");
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            return new RegisterDeviceResponse(string, string2, string3, string4, string5, jSONObject.getInt("userPushNotificationDestinationId"));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public RegisterDeviceResponse(@NotNull String statusMessage, @NotNull String platform, @NotNull String name, @NotNull String notificationToken, @NotNull String application, int i10) {
        Intrinsics.checkNotNullParameter(statusMessage, "statusMessage");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(notificationToken, "notificationToken");
        Intrinsics.checkNotNullParameter(application, "application");
        this.statusMessage = statusMessage;
        this.platform = platform;
        this.name = name;
        this.notificationToken = notificationToken;
        this.application = application;
        this.userPushNotificationDestinationId = i10;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterDeviceResponse)) {
            return false;
        }
        RegisterDeviceResponse registerDeviceResponse = (RegisterDeviceResponse) other;
        return Intrinsics.m31980c(this.statusMessage, registerDeviceResponse.statusMessage) && Intrinsics.m31980c(this.platform, registerDeviceResponse.platform) && Intrinsics.m31980c(this.name, registerDeviceResponse.name) && Intrinsics.m31980c(this.notificationToken, registerDeviceResponse.notificationToken) && Intrinsics.m31980c(this.application, registerDeviceResponse.application) && this.userPushNotificationDestinationId == registerDeviceResponse.userPushNotificationDestinationId;
    }

    public int hashCode() {
        return (((((((((this.statusMessage.hashCode() * 31) + this.platform.hashCode()) * 31) + this.name.hashCode()) * 31) + this.notificationToken.hashCode()) * 31) + this.application.hashCode()) * 31) + Integer.hashCode(this.userPushNotificationDestinationId);
    }

    @NotNull
    public String toString() {
        return "RegisterDeviceResponse(statusMessage=" + this.statusMessage + ", platform=" + this.platform + ", name=" + this.name + ", notificationToken=" + this.notificationToken + ", application=" + this.application + ", userPushNotificationDestinationId=" + this.userPushNotificationDestinationId + ")";
    }
}
