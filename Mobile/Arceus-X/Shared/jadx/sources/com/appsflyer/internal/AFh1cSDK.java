package com.appsflyer.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001cR\u0014\u0010\u0014\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0011\u0010!\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001a\u0010 "}, m31665d2 = {"Lcom/appsflyer/internal/AFh1cSDK;", "", "", "p0", "", "p1", "", "", "p2", "", "p3", "p4", "p5", "<init>", "(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "d", "J", "AFLogger", "unregisterClient", "F", "AFKeystoreWrapper", "registerClient", "Ljava/util/List;", "I", "Ljava/lang/String;", "force", "i", "()J", "e"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class AFh1cSDK {

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public final int unregisterClient;

    /* JADX INFO: renamed from: AFLogger, reason: from kotlin metadata */
    @NotNull
    public final String d;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long AFLogger;

    /* JADX INFO: renamed from: force, reason: from kotlin metadata */
    @NotNull
    public final String i;

    @NotNull
    public List<String> registerClient;

    /* JADX INFO: renamed from: unregisterClient, reason: from kotlin metadata */
    public final float AFKeystoreWrapper;

    public AFh1cSDK(long j10, float f10, @NotNull List<String> list, int i10, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AFLogger = j10;
        this.AFKeystoreWrapper = f10;
        this.registerClient = list;
        this.unregisterClient = i10;
        this.d = str;
        this.i = str2;
    }

    public static long registerClient() {
        return AFa1tSDK.m8724d().AFKeystoreWrapper.force().unregisterClient();
    }

    public final boolean equals(@Nullable Object p8) {
        if (this == p8) {
            return true;
        }
        if (!Intrinsics.m31980c(AFh1cSDK.class, p8 != null ? p8.getClass() : null)) {
            return false;
        }
        Intrinsics.m31981d(p8, "");
        AFh1cSDK aFh1cSDK = (AFh1cSDK) p8;
        return this.AFLogger == aFh1cSDK.AFLogger && this.AFKeystoreWrapper == aFh1cSDK.AFKeystoreWrapper && Intrinsics.m31980c(this.registerClient, aFh1cSDK.registerClient) && this.unregisterClient == aFh1cSDK.unregisterClient && Intrinsics.m31980c(this.d, aFh1cSDK.d) && Intrinsics.m31980c(this.i, aFh1cSDK.i);
    }

    public final int hashCode() {
        return (((((((((Long.hashCode(this.AFLogger) * 31) + Float.hashCode(this.AFKeystoreWrapper)) * 31) + this.registerClient.hashCode()) * 31) + this.unregisterClient) * 31) + this.d.hashCode()) * 31) + this.i.hashCode();
    }
}
