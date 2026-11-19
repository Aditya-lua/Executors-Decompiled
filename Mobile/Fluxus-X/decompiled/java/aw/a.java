package aw;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import com.github.luben.zstd.BuildConfig;
import ew.l0;
import ew.v;
import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Law/a;", "Law/b;", BuildConfig.FLAVOR, "path", "<init>", "(Ljava/lang/String;)V", "Lew/l0;", "e", "()Lew/l0;", "g", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "h", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f3498i = "PublicSuffixDatabase.list";

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String path;

    public a(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
    }

    @Override // aw.b
    @NotNull
    public l0 e() throws IOException {
        Context contextB = okhttp3.internal.platform.d.f28269a.b();
        AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets == null) {
            if (Build.FINGERPRINT == null) {
                throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        InputStream inputStreamOpen = assets.open(d());
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
        return v.j(inputStreamOpen);
    }

    @Override // aw.b
    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter and merged with bridge method [inline-methods] */
    public String d() {
        return this.path;
    }

    public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? f3498i : str);
    }
}
