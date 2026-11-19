package eq;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Leq/h;", BuildConfig.FLAVOR, "Lg/d;", "Leq/f;", "passportNfcReaderLauncher", "<init>", "(Lg/d;)V", "a", "()Lg/d;", "Lg/d;", "nfc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g.d<PassportNfcReaderConfig> passportNfcReaderLauncher;

    public h(@NotNull g.d<PassportNfcReaderConfig> passportNfcReaderLauncher) {
        Intrinsics.checkNotNullParameter(passportNfcReaderLauncher, "passportNfcReaderLauncher");
        this.passportNfcReaderLauncher = passportNfcReaderLauncher;
    }

    @NotNull
    public final g.d<PassportNfcReaderConfig> a() {
        return this.passportNfcReaderLauncher;
    }
}
