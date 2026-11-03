package rg;

import android.net.Uri;
import com.roblox.protocols.webview.DomainAllowListChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lrg/f2;", "", "<init>", "()V", "", "url", "", "hasGesture", "a", "(Ljava/lang/String;Z)Ljava/lang/String;", "b", "(Ljava/lang/String;Z)Z", "isForMainFrame", "c", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f2 f30365a = new f2();

    @Nullable
    public static final String a(@NotNull String url, boolean hasGesture) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (rh.h.a().g1() && b(url, hasGesture)) {
            return im.f.F().i(url, "android_webview");
        }
        return null;
    }

    public static final boolean b(@NotNull String url, boolean hasGesture) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!hasGesture) {
            return false;
        }
        String scheme = Uri.parse(url).getScheme();
        return (kotlin.text.x.E(scheme, "https", true) || kotlin.text.x.E(scheme, "http", true)) && DomainAllowListChecker.f9808a.isKnownTrustedDomain(url, url);
    }

    public static final boolean c(@NotNull String url, boolean isForMainFrame) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!isForMainFrame) {
            return false;
        }
        String scheme = Uri.parse(url).getScheme();
        return (kotlin.text.x.E(scheme, "https", true) || kotlin.text.x.E(scheme, "http", true)) && DomainAllowListChecker.f9808a.isKnownTrustedDomain(url, url);
    }
}
