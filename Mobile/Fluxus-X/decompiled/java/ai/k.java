package ai;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lai/k;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "a", "()Z", "b", "isDynamicBuild", "c", "(Z)Z", "Z", "isSplitBuild", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f490a = new k();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final boolean isSplitBuild = false;

    public static final boolean a() {
        return isSplitBuild;
    }

    public static final boolean b() {
        return f490a.c(isSplitBuild);
    }

    public final boolean c(boolean isDynamicBuild) {
        return isDynamicBuild || bi.h.a().n5();
    }
}
