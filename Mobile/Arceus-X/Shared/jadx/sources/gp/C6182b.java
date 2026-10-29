package gp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;
import p610zo.EnumC13962h;

/* JADX INFO: renamed from: gp.b */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Lzo/h;", "", "a", "(Lzo/h;)Ljava/lang/String;", "inquiry-internal_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6182b {

    /* JADX INFO: renamed from: gp.b$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23570a;

        static {
            int[] iArr = new int[EnumC13962h.values().length];
            try {
                iArr[EnumC13962h.PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC13962h.SANDBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f23570a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m27245a(@NotNull EnumC13962h enumC13962h) {
        Intrinsics.checkNotNullParameter(enumC13962h, "<this>");
        int i10 = a.f23570a[enumC13962h.ordinal()];
        if (i10 == 1) {
            return "production";
        }
        if (i10 == 2) {
            return "sandbox";
        }
        throw new C7345l();
    }
}
