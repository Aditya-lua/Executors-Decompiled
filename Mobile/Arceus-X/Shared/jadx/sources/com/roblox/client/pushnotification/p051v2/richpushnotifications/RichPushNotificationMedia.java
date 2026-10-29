package com.roblox.client.pushnotification.p051v2.richpushnotifications;

import androidx.annotation.Keep;
import kg.C7590f;
import kg.C7591g;
import kg.EnumC7587c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151gk.C6124q;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001%B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\u001dR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010\u001dR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010#¨\u0006&"}, m31665d2 = {"Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;", "", "Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;", "primaryImage", "secondaryImage", "Lcom/roblox/client/pushnotification/v2/richpushnotifications/Options;", "options", "<init>", "(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Lcom/roblox/client/pushnotification/v2/richpushnotifications/Options;)V", "component1", "()Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;", "component2", "component3", "()Lcom/roblox/client/pushnotification/v2/richpushnotifications/Options;", "copy", "(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Lcom/roblox/client/pushnotification/v2/richpushnotifications/Options;)Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;", "getPrimaryImage", "setPrimaryImage", "(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;)V", "getSecondaryImage", "setSecondaryImage", "Lcom/roblox/client/pushnotification/v2/richpushnotifications/Options;", "getOptions", "setOptions", "(Lcom/roblox/client/pushnotification/v2/richpushnotifications/Options;)V", "Companion", "a", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class RichPushNotificationMedia {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @NotNull
    private static final RichPushNotificationMedia f49074default = new RichPushNotificationMedia(null, null, new Options(false));
    private static final C7590f gson = new C7591g().m31439g(EnumC7587c.f29042a).m31438f().m31435b();

    @Nullable
    private Options options;

    @Nullable
    private PushNotificationImageConfig primaryImage;

    @Nullable
    private PushNotificationImageConfig secondaryImage;

    /* JADX INFO: renamed from: com.roblox.client.pushnotification.v2.richpushnotifications.RichPushNotificationMedia$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia$a;", "", "<init>", "()V", "", "jsonString", "Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;", "a", "(Ljava/lang/String;)Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;", "b", "()Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;", "default", "Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;", "Lkg/f;", "kotlin.jvm.PlatformType", "gson", "Lkg/f;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.pushnotification.v2.richpushnotifications.RichPushNotificationMedia.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final RichPushNotificationMedia m15473a(@Nullable String jsonString) {
            C6124q.m27057b("RichPushNotificationMedia", "Parsing string for push notification media: " + jsonString);
            if (jsonString == null || jsonString.length() == 0) {
                return m15474b();
            }
            Object objM31410j = RichPushNotificationMedia.gson.m31410j(jsonString, RichPushNotificationMedia.class);
            Intrinsics.checkNotNullExpressionValue(objM31410j, "fromJson(...)");
            return (RichPushNotificationMedia) objM31410j;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final RichPushNotificationMedia m15474b() {
            return RichPushNotificationMedia.f49074default;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public RichPushNotificationMedia(@Nullable PushNotificationImageConfig pushNotificationImageConfig, @Nullable PushNotificationImageConfig pushNotificationImageConfig2, @Nullable Options options) {
        this.primaryImage = pushNotificationImageConfig;
        this.secondaryImage = pushNotificationImageConfig2;
        this.options = options;
    }

    public static /* synthetic */ RichPushNotificationMedia copy$default(RichPushNotificationMedia richPushNotificationMedia, PushNotificationImageConfig pushNotificationImageConfig, PushNotificationImageConfig pushNotificationImageConfig2, Options options, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pushNotificationImageConfig = richPushNotificationMedia.primaryImage;
        }
        if ((i10 & 2) != 0) {
            pushNotificationImageConfig2 = richPushNotificationMedia.secondaryImage;
        }
        if ((i10 & 4) != 0) {
            options = richPushNotificationMedia.options;
        }
        return richPushNotificationMedia.copy(pushNotificationImageConfig, pushNotificationImageConfig2, options);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PushNotificationImageConfig getPrimaryImage() {
        return this.primaryImage;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PushNotificationImageConfig getSecondaryImage() {
        return this.secondaryImage;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    @NotNull
    public final RichPushNotificationMedia copy(@Nullable PushNotificationImageConfig primaryImage, @Nullable PushNotificationImageConfig secondaryImage, @Nullable Options options) {
        return new RichPushNotificationMedia(primaryImage, secondaryImage, options);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichPushNotificationMedia)) {
            return false;
        }
        RichPushNotificationMedia richPushNotificationMedia = (RichPushNotificationMedia) other;
        return Intrinsics.m31980c(this.primaryImage, richPushNotificationMedia.primaryImage) && Intrinsics.m31980c(this.secondaryImage, richPushNotificationMedia.secondaryImage) && Intrinsics.m31980c(this.options, richPushNotificationMedia.options);
    }

    @Nullable
    public final Options getOptions() {
        return this.options;
    }

    @Nullable
    public final PushNotificationImageConfig getPrimaryImage() {
        return this.primaryImage;
    }

    @Nullable
    public final PushNotificationImageConfig getSecondaryImage() {
        return this.secondaryImage;
    }

    public int hashCode() {
        PushNotificationImageConfig pushNotificationImageConfig = this.primaryImage;
        int iHashCode = (pushNotificationImageConfig == null ? 0 : pushNotificationImageConfig.hashCode()) * 31;
        PushNotificationImageConfig pushNotificationImageConfig2 = this.secondaryImage;
        int iHashCode2 = (iHashCode + (pushNotificationImageConfig2 == null ? 0 : pushNotificationImageConfig2.hashCode())) * 31;
        Options options = this.options;
        return iHashCode2 + (options != null ? options.hashCode() : 0);
    }

    public final void setOptions(@Nullable Options options) {
        this.options = options;
    }

    public final void setPrimaryImage(@Nullable PushNotificationImageConfig pushNotificationImageConfig) {
        this.primaryImage = pushNotificationImageConfig;
    }

    public final void setSecondaryImage(@Nullable PushNotificationImageConfig pushNotificationImageConfig) {
        this.secondaryImage = pushNotificationImageConfig;
    }

    @NotNull
    public String toString() {
        return "RichPushNotificationMedia(primaryImage=" + this.primaryImage + ", secondaryImage=" + this.secondaryImage + ", options=" + this.options + ")";
    }
}
