package p008a7;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: a7.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\"\u001c\u0010\u0005\u001a\u00020\u0002*\u00060\u0000j\u0002`\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m31665d2 = {"Landroid/content/Context;", "Lcoil3/PlatformContext;", "", "a", "(Landroid/content/Context;)F", "density", "coil-svg_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C0082d {
    /* JADX INFO: renamed from: a */
    public static final float m206a(@NotNull Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
}
