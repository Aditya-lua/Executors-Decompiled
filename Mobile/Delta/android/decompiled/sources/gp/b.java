package gp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzo/h;", "", "a", "(Lzo/h;)Ljava/lang/String;", "inquiry-internal_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18326a;

        static {
            int[] iArr = new int[zo.h.values().length];
            try {
                iArr[zo.h.PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zo.h.SANDBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18326a = iArr;
        }
    }

    @NotNull
    public static final String a(@NotNull zo.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        int i10 = a.f18326a[hVar.ordinal()];
        if (i10 == 1) {
            return "production";
        }
        if (i10 == 2) {
            return "sandbox";
        }
        throw new jt.l();
    }
}
