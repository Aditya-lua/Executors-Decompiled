package hr;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;
import zt.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/c;", BuildConfig.FLAVOR, "a", "(Lhr/c;)Ljava/lang/String;", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18535a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.ROUGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.PRECISE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18535a = iArr;
        }
    }

    @NotNull
    public static final String a(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i10 = a.f18535a[cVar.ordinal()];
        if (i10 == 1) {
            return "rough";
        }
        if (i10 == 2) {
            return "precise";
        }
        throw new l();
    }
}
