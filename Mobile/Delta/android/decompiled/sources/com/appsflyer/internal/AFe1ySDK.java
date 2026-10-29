package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u0004B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H%¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH ¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H!¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0015H\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0011¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001d\u0010\u000eJ\u001c\u0010\u001f\u001a\u00020\u001e2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010!H\u0086\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u001e¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\tH\u0017¢\u0006\u0004\b&\u0010'R\u0014\u0010\u001f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050)8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u0014\u0010\r\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001e\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f8\u0006@BX\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010.R(\u0010\u001d\u001a\u0004\u0018\u00010\u00152\b\u0010\u0006\u001a\u0004\u0018\u00010\u00158\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001c\u0010/\u001a\u0004\b\u0017\u00100R\u0018\u0010,\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u00101R\u0016\u0010\u001b\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u00102R$\u0010\u0019\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u001e8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b\u001f\u0010%"}, d2 = {"Lcom/appsflyer/internal/AFe1ySDK;", "Result", "Ljava/util/concurrent/Callable;", "Lcom/appsflyer/internal/AFd1cSDK;", "", "Lcom/appsflyer/internal/AFe1zSDK;", "p0", "", "p1", "", "p2", "<init>", "(Lcom/appsflyer/internal/AFe1zSDK;[Lcom/appsflyer/internal/AFe1zSDK;Ljava/lang/String;)V", "registerClient", "()Lcom/appsflyer/internal/AFd1cSDK;", "", "d", "()J", "", "AFLogger", "()Z", "", "", "AFKeystoreWrapper", "(Ljava/lang/Throwable;)V", "force", "()V", "w", "i", "v", "", "unregisterClient", "(Lcom/appsflyer/internal/AFe1ySDK;)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1zSDK;", "", "Ljava/util/Set;", "I", "e", "Ljava/lang/String;", "J", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "Lcom/appsflyer/internal/AFd1cSDK;", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AFe1ySDK<Result> implements Comparable<AFe1ySDK<?>>, Callable<AFd1cSDK> {

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public long i;

    @NotNull
    public final Set<AFe1zSDK> AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Set<AFe1zSDK> AFKeystoreWrapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String d;

    /* JADX INFO: renamed from: force, reason: from kotlin metadata */
    private boolean w;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    private Throwable v;
    public int registerClient;

    @NotNull
    public final AFe1zSDK unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private volatile int force;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public AFd1cSDK e;

    public AFe1ySDK(@NotNull AFe1zSDK aFe1zSDK, @NotNull AFe1zSDK[] aFe1zSDKArr, @Nullable String str) {
        Intrinsics.checkNotNullParameter(aFe1zSDK, "");
        Intrinsics.checkNotNullParameter(aFe1zSDKArr, "");
        this.unregisterClient = aFe1zSDK;
        HashSet hashSet = new HashSet();
        kotlin.collections.u.A(hashSet, aFe1zSDKArr);
        this.AFLogger = hashSet;
        this.AFKeystoreWrapper = new HashSet();
        int iIncrementAndGet = AFe1xSDK.AFKeystoreWrapper.incrementAndGet();
        this.registerClient = iIncrementAndGet;
        this.d = str == null ? String.valueOf(iIncrementAndGet) : str;
    }

    public void AFKeystoreWrapper(@NotNull Throwable p8) {
        Intrinsics.checkNotNullParameter(p8, "");
    }

    public abstract boolean AFLogger();

    public abstract long d();

    public final boolean equals(@Nullable Object p8) {
        if (this == p8) {
            return true;
        }
        if (p8 == null || !Intrinsics.c(getClass(), p8.getClass())) {
            return false;
        }
        AFe1ySDK aFe1ySDK = (AFe1ySDK) p8;
        if (Intrinsics.c(this.unregisterClient, aFe1ySDK.unregisterClient)) {
            return Intrinsics.c(this.d, aFe1ySDK.d);
        }
        return false;
    }

    public void force() {
    }

    public final int hashCode() {
        return (this.unregisterClient.hashCode() * 31) + this.d.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getW() {
        return this.w;
    }

    @NotNull
    public abstract AFd1cSDK registerClient();

    @NotNull
    public String toString() {
        String str = this.unregisterClient + "-" + this.d;
        if (Intrinsics.c(String.valueOf(this.registerClient), this.d)) {
            return str;
        }
        return str + "-" + this.registerClient;
    }

    /* JADX INFO: renamed from: unregisterClient, reason: from getter */
    public final int getForce() {
        return this.force;
    }

    @Override // java.util.concurrent.Callable
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final AFd1cSDK call() {
        TrafficStats.setThreadStatsTag(AFe1xSDK.AFLogger);
        this.e = null;
        this.v = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.force++;
        try {
            AFd1cSDK aFd1cSDKRegisterClient = registerClient();
            this.e = aFd1cSDKRegisterClient;
            this.i = System.currentTimeMillis() - jCurrentTimeMillis;
            force();
            return aFd1cSDKRegisterClient;
        } catch (Throwable th2) {
            try {
                this.v = th2;
                this.e = AFd1cSDK.FAILURE;
                AFKeystoreWrapper(th2);
                throw th2;
            } catch (Throwable th3) {
                this.i = System.currentTimeMillis() - jCurrentTimeMillis;
                force();
                throw th3;
            }
        }
    }

    public void w() {
        this.w = true;
    }

    @Nullable
    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from getter */
    public final Throwable getV() {
        return this.v;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: unregisterClient, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NotNull AFe1ySDK<?> p8) {
        Intrinsics.checkNotNullParameter(p8, "");
        int unregisterClient = this.unregisterClient.getUnregisterClient() - p8.unregisterClient.getUnregisterClient();
        if (unregisterClient != 0) {
            return unregisterClient;
        }
        if (Intrinsics.c(this.d, p8.d)) {
            return 0;
        }
        return this.registerClient - p8.registerClient;
    }
}
