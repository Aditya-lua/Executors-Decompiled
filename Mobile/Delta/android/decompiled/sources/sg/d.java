package sg;

import android.content.Context;
import com.roblox.client.RobloxApplication;
import com.roblox.client.ads.GmaSdkBackgroundInstallWorker;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x5.p0;
import x5.z;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "b", "()V", "NativeShell_googleProdRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final void b() {
        p0.Companion companion = p0.INSTANCE;
        Context contextF = RobloxApplication.f();
        Intrinsics.checkNotNullExpressionValue(contextF, "getAppContext(...)");
        companion.a(contextF).g("gmasdk-background-install", x5.j.REPLACE, new z.a(GmaSdkBackgroundInstallWorker.class).n(kotlin.ranges.d.d(rh.h.a().Z(), 0L), TimeUnit.MILLISECONDS).b());
    }
}
