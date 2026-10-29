package p151gk;

import android.app.Activity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gk.u */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lgk/u;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "a", "(Landroid/app/Activity;)Z", "utils_googleRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6128u {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C6128u f23463a = new C6128u();

    /* JADX INFO: renamed from: a */
    public static final boolean m27096a(@Nullable Activity activity) {
        boolean z10 = false;
        if (activity == null) {
            C6124q.m27057b("PasskeyCreationCheck", "Passkey unavailable: activity is null.");
            return false;
        }
        boolean zM27055a = C6123p.m27055a(activity);
        boolean zM27042a = C6119l.m27042a(activity);
        if (zM27055a && zM27042a) {
            z10 = true;
        }
        C6124q.m27057b("PasskeyCreationCheck", "Passkey availability on device: deviceSecure=" + zM27055a + ", googlePlayServicesAvailable=" + zM27042a + ", available=" + z10);
        return z10;
    }
}
