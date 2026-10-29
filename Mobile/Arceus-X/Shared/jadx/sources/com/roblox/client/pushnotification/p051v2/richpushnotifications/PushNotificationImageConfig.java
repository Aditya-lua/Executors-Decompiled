package com.roblox.client.pushnotification.p051v2.richpushnotifications;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384qj.EnumC10592c;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006\""}, m31665d2 = {"Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;", "", "", "url", "format", "", "addBackgroundColor", "Lqj/c;", "shape", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLqj/c;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lqj/c;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLqj/c;)Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "getFormat", "Z", "getAddBackgroundColor", "Lqj/c;", "getShape", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class PushNotificationImageConfig {
    private final boolean addBackgroundColor;

    @NotNull
    private final String format;

    @NotNull
    private final EnumC10592c shape;

    @NotNull
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PushNotificationImageConfig(@NotNull String url, @NotNull String format, boolean z10, @NotNull EnumC10592c shape) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.url = url;
        this.format = format;
        this.addBackgroundColor = z10;
        this.shape = shape;
    }

    public static /* synthetic */ PushNotificationImageConfig copy$default(PushNotificationImageConfig pushNotificationImageConfig, String str, String str2, boolean z10, EnumC10592c enumC10592c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pushNotificationImageConfig.url;
        }
        if ((i10 & 2) != 0) {
            str2 = pushNotificationImageConfig.format;
        }
        if ((i10 & 4) != 0) {
            z10 = pushNotificationImageConfig.addBackgroundColor;
        }
        if ((i10 & 8) != 0) {
            enumC10592c = pushNotificationImageConfig.shape;
        }
        return pushNotificationImageConfig.copy(str, str2, z10, enumC10592c);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAddBackgroundColor() {
        return this.addBackgroundColor;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EnumC10592c getShape() {
        return this.shape;
    }

    @NotNull
    public final PushNotificationImageConfig copy(@NotNull String url, @NotNull String format, boolean addBackgroundColor, @NotNull EnumC10592c shape) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return new PushNotificationImageConfig(url, format, addBackgroundColor, shape);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushNotificationImageConfig)) {
            return false;
        }
        PushNotificationImageConfig pushNotificationImageConfig = (PushNotificationImageConfig) other;
        return Intrinsics.m31980c(this.url, pushNotificationImageConfig.url) && Intrinsics.m31980c(this.format, pushNotificationImageConfig.format) && this.addBackgroundColor == pushNotificationImageConfig.addBackgroundColor && this.shape == pushNotificationImageConfig.shape;
    }

    public final boolean getAddBackgroundColor() {
        return this.addBackgroundColor;
    }

    @NotNull
    public final String getFormat() {
        return this.format;
    }

    @NotNull
    public final EnumC10592c getShape() {
        return this.shape;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((this.url.hashCode() * 31) + this.format.hashCode()) * 31) + Boolean.hashCode(this.addBackgroundColor)) * 31) + this.shape.hashCode();
    }

    @NotNull
    public String toString() {
        return "PushNotificationImageConfig(url=" + this.url + ", format=" + this.format + ", addBackgroundColor=" + this.addBackgroundColor + ", shape=" + this.shape + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
      (r1v0 java.lang.String)
      (r2v0 java.lang.String)
      (r3v0 boolean)
      (wrap qj.c:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap qj.c:0x0004: SGET  A[WRAPPED] (LINE:6) qj.c.d qj.c) : (r4v0 qj.c))
     A[MD:(java.lang.String, java.lang.String, boolean, qj.c):void (m)] (LINE:7) call: com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageConfig.<init>(java.lang.String, java.lang.String, boolean, qj.c):void type: THIS */
    public /* synthetic */ PushNotificationImageConfig(String str, String str2, boolean z10, EnumC10592c enumC10592c, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z10, (i10 & 8) != 0 ? EnumC10592c.NONE : enumC10592c);
    }
}
