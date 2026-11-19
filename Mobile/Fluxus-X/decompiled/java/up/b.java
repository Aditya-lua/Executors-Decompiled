package up;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnp/h;", BuildConfig.FLAVOR, "a", "(Lnp/h;)Ljava/lang/String;", "inquiry-internal_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33795a;

        static {
            int[] iArr = new int[np.h.values().length];
            try {
                iArr[np.h.PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[np.h.SANDBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f33795a = iArr;
        }
    }

    @NotNull
    public static final String a(@NotNull np.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        int i10 = a.f33795a[hVar.ordinal()];
        if (i10 == 1) {
            return "production";
        }
        if (i10 == 2) {
            return "sandbox";
        }
        throw new zt.l();
    }
}
