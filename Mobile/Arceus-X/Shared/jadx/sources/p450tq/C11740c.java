package p450tq;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p229jt.C7345l;

/* JADX INFO: renamed from: tq.c */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Ltq/b;", "", "a", "(Ltq/b;)Ljava/lang/String;", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C11740c {

    /* JADX INFO: renamed from: tq.c$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41403a;

        static {
            int[] iArr = new int[EnumC11739b.values().length];
            try {
                iArr[EnumC11739b.ROUGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11739b.PRECISE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f41403a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m43957a(@NotNull EnumC11739b enumC11739b) {
        Intrinsics.checkNotNullParameter(enumC11739b, "<this>");
        int i10 = a.f41403a[enumC11739b.ordinal()];
        if (i10 == 1) {
            return "rough";
        }
        if (i10 == 2) {
            return "precise";
        }
        throw new C7345l();
    }
}
