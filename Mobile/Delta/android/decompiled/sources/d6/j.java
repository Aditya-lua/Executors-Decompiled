package d6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import b6.NetworkState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x5.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f\"\u0018\u0010\u0013\u001a\u00020\n*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroid/content/Context;", "context", "Lh6/b;", "taskExecutor", "Ld6/h;", "Lb6/h;", "a", "(Landroid/content/Context;Lh6/b;)Ld6/h;", "Landroid/net/ConnectivityManager;", "connectivityManager", "", "isBlocked", "c", "(Landroid/net/ConnectivityManager;Z)Lb6/h;", "", "Ljava/lang/String;", "TAG", "d", "(Landroid/net/ConnectivityManager;)Z", "isActiveNetworkValidated", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f14454a;

    static {
        String strI = w.i("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(...)");
        f14454a = strI;
    }

    @NotNull
    public static final h<NetworkState> a(@NotNull Context context, @NotNull h6.b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        return new k(context, taskExecutor);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    @NotNull
    public static final NetworkState c(@NotNull ConnectivityManager connectivityManager, boolean z10) {
        boolean z11;
        SecurityException securityException;
        boolean z12;
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z13 = false;
            if (activeNetworkInfo == null) {
                z12 = true;
                boolean zD = d(connectivityManager);
                boolean zA = t2.a.a(connectivityManager);
                if (activeNetworkInfo != null) {
                    z12 = false;
                } else {
                    z12 = false;
                }
                z11 = z10;
                return new NetworkState(z13, zD, zA, z12, z11);
            }
            try {
                if (activeNetworkInfo.isConnected()) {
                    z13 = true;
                    z12 = true;
                } else {
                    z12 = true;
                }
                boolean zD2 = d(connectivityManager);
                boolean zA2 = t2.a.a(connectivityManager);
                if (activeNetworkInfo != null || activeNetworkInfo.isRoaming()) {
                    z12 = false;
                }
                z11 = z10;
                try {
                    return new NetworkState(z13, zD2, zA2, z12, z11);
                } catch (SecurityException e10) {
                    e = e10;
                    securityException = e;
                    w.e().d(f14454a, "Unable to get active network state", securityException);
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
        w.e().d(f14454a, "Unable to get active network state", securityException);
        return new NetworkState(false, false, false, true, z11);
    }

    public static final boolean d(@NotNull ConnectivityManager connectivityManager) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e10) {
            w.e().d(f14454a, "Unable to validate active network", e10);
            return false;
        }
    }
}
