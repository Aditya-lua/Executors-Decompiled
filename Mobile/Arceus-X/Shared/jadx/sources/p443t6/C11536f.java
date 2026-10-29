package p443t6;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p261l2.C7975b;
import p460u6.C11808f;

/* JADX INFO: renamed from: t6.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "Lt6/d;", "a", "(Landroid/content/Context;)Lt6/d;", "coil-network-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11536f {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final InterfaceC11534d m43114a(@NotNull Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) C7975b.m33013k(applicationContext, ConnectivityManager.class);
        if (connectivityManager == null || !C11808f.m44166b(applicationContext, "android.permission.ACCESS_NETWORK_STATE")) {
            return InterfaceC11534d.f40818b;
        }
        try {
            return new C11535e(connectivityManager);
        } catch (Exception unused) {
            return InterfaceC11534d.f40818b;
        }
    }
}
