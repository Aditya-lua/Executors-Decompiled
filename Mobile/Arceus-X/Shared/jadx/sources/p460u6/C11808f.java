package p460u6;

import android.content.Context;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p261l2.C7975b;

/* JADX INFO: renamed from: u6.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"", "a", "()V", "Landroid/content/Context;", "", "permission", "", "b", "(Landroid/content/Context;Ljava/lang/String;)Z", "coil-network-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11808f {
    /* JADX INFO: renamed from: a */
    public static final void m44165a() {
        if (Intrinsics.m31980c(Looper.myLooper(), Looper.getMainLooper())) {
            throw new NetworkOnMainThreadException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m44166b(@NotNull Context context, @NotNull String str) {
        return C7975b.m33003a(context, str) == 0;
    }
}
