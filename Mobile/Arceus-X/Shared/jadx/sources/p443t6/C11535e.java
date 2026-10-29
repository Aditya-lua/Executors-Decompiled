package p443t6;

import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: t6.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, m31665d2 = {"Lt6/e;", "Lt6/d;", "Landroid/net/ConnectivityManager;", "connectivityManager", "<init>", "(Landroid/net/ConnectivityManager;)V", "", "c", "()Z", "Landroid/net/ConnectivityManager;", "coil-network-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
@SuppressLint({"MissingPermission"})
public final class C11535e implements InterfaceC11534d {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final ConnectivityManager connectivityManager;

    public C11535e(@NotNull ConnectivityManager connectivityManager) {
        this.connectivityManager = connectivityManager;
    }

    @Override // p443t6.InterfaceC11534d
    /* JADX INFO: renamed from: c */
    public boolean mo43111c() {
        NetworkCapabilities networkCapabilities = this.connectivityManager.getNetworkCapabilities(this.connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
