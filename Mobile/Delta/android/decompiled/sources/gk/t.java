package gk;

import android.app.Activity;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgk/t;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "a", "(Landroid/app/Activity;)Z", "utils_googleRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t f18244a = new t();

    public static final boolean a(@Nullable Activity activity) {
        boolean z10 = false;
        if (activity == null) {
            p.b("PasskeyCreationCheck", "Passkey unavailable: activity is null.");
            return false;
        }
        boolean zA = o.a(activity);
        boolean zA2 = k.a(activity);
        if (zA && zA2) {
            z10 = true;
        }
        p.b("PasskeyCreationCheck", "Passkey availability on device: deviceSecure=" + zA + ", googlePlayServicesAvailable=" + zA2 + ", available=" + z10);
        return z10;
    }
}
