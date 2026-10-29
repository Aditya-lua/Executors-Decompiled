package p151gk;

import android.app.KeyguardManager;
import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gk.p */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lgk/p;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Z", "utils_googleRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6123p {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C6123p f23459a = new C6123p();

    /* JADX INFO: renamed from: a */
    public static final boolean m27055a(@Nullable Context context) {
        Object systemService = context != null ? context.getSystemService("keyguard") : null;
        KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
        return keyguardManager != null && keyguardManager.isDeviceSecure();
    }
}
