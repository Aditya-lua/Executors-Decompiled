package p069d6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p026b6.NetworkState;
import p161h6.InterfaceC6292b;
import p439t2.C11471a;
import p536x5.AbstractC12732w;

/* JADX INFO: renamed from: d6.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f\"\u0018\u0010\u0013\u001a\u00020\n*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Landroid/content/Context;", "context", "Lh6/b;", "taskExecutor", "Ld6/h;", "Lb6/h;", "a", "(Landroid/content/Context;Lh6/b;)Ld6/h;", "Landroid/net/ConnectivityManager;", "connectivityManager", "", "isBlocked", "c", "(Landroid/net/ConnectivityManager;Z)Lb6/h;", "", "Ljava/lang/String;", "TAG", "d", "(Landroid/net/ConnectivityManager;)Z", "isActiveNetworkValidated", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C4459j {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f18470a;

    static {
        String strM47443i = AbstractC12732w.m47443i("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(strM47443i, "tagWithPrefix(...)");
        f18470a = strM47443i;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final AbstractC4457h<NetworkState> m22393a(@NotNull Context context, @NotNull InterfaceC6292b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        return new C4460k(context, taskExecutor);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final NetworkState m22395c(@NotNull ConnectivityManager connectivityManager, boolean z10) {
        boolean z11;
        SecurityException securityException;
        boolean z12;
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z13 = false;
            if (activeNetworkInfo == null) {
                z12 = true;
                boolean zM22396d = m22396d(connectivityManager);
                boolean zM42952a = C11471a.m42952a(connectivityManager);
                if (activeNetworkInfo != null) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                z11 = z10;
                return new NetworkState(z13, zM22396d, zM42952a, z12, z11);
            }
            try {
                if (activeNetworkInfo.isConnected()) {
                    z13 = true;
                    z12 = true;
                } else {
                    z12 = true;
                }
                boolean zM22396d2 = m22396d(connectivityManager);
                boolean zM42952a2 = C11471a.m42952a(connectivityManager);
                if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                    z12 = false;
                }
                z11 = z10;
                try {
                    return new NetworkState(z13, zM22396d2, zM42952a2, z12, z11);
                } catch (SecurityException e10) {
                    e = e10;
                    securityException = e;
                    AbstractC12732w.m47441e().mo47447d(f18470a, "Unable to get active network state", securityException);
                    return new NetworkState(false, false, false, true, z11);
                }
            } catch (SecurityException e11) {
                securityException = e11;
                z11 = z10;
            }
        } catch (SecurityException e12) {
            e = e12;
            z11 = z10;
        }
        AbstractC12732w.m47441e().mo47447d(f18470a, "Unable to get active network state", securityException);
        return new NetworkState(false, false, false, true, z11);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m22396d(@NotNull ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e10) {
            AbstractC12732w.m47441e().mo47447d(f18470a, "Unable to validate active network", e10);
            return false;
        }
    }
}
