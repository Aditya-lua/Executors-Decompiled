package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0007*\u00020\u0007H\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\r\u001a\u00020\u00118\u0017X\u0097D¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0013\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0015\u001a\u00020\u00178\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\r\u0010\u001a"}, d2 = {"Lcom/appsflyer/internal/AFd1vSDK;", "Lcom/appsflyer/internal/AFc1cSDK;", "Lcom/appsflyer/internal/AFc1iSDK;", "p0", "", "p1", "", "", "p2", "", "p3", "<init>", "(Lcom/appsflyer/internal/AFc1iSDK;[BLjava/util/Map;I)V", "d", "(Ljava/lang/String;)Ljava/lang/String;", "AFLogger", "Lcom/appsflyer/internal/AFc1iSDK;", "", "Z", "AFKeystoreWrapper", "()Z", "registerClient", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFd1tSDK;", "i", "Lcom/appsflyer/internal/AFd1tSDK;", "()Lcom/appsflyer/internal/AFd1tSDK;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AFd1vSDK extends AFc1cSDK {

    @NotNull
    public AFc1iSDK AFLogger;
    private final boolean d;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final AFd1tSDK registerClient;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFd1vSDK(@NotNull AFc1iSDK aFc1iSDK, @NotNull byte[] bArr) {
        this(aFc1iSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from getter */
    public final boolean getI() {
        return this.d;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final AFd1tSDK getRegisterClient() {
        return this.registerClient;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    @NotNull
    public final String registerClient() {
        AFj1mSDK aFj1mSDK = new AFj1mSDK(this.AFLogger);
        String str = String.format(Locale.US, AFj1mSDK.f5442i, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.d().getHostName());
        Intrinsics.checkNotNull(str);
        return aFj1mSDK.unregisterClient(str);
    }

    public /* synthetic */ AFd1vSDK(AFc1iSDK aFc1iSDK, byte[] bArr, Map map, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1iSDK, bArr, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? 2000 : i10);
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    @NotNull
    public final String d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: " + str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFd1vSDK(@NotNull AFc1iSDK aFc1iSDK, @NotNull byte[] bArr, @Nullable Map<String, String> map, int i10) {
        super(bArr, map, i10);
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFLogger = aFc1iSDK;
        this.registerClient = AFd1tSDK.OCTET_STREAM;
    }
}
