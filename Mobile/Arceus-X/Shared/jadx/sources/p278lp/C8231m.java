package p278lp;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7776c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lp.m */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m31665d2 = {"Llp/m;", "", "<init>", "()V", "", "password", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "a", "(Ljava/lang/String;)Z", "jp-my-number_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C8231m {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C8231m f30517a = new C8231m();

    /* JADX INFO: renamed from: a */
    public final boolean m33579a(@Nullable String password) {
        return password != null && Intrinsics.m31980c(m33580b(password), "9010");
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m33580b(@NotNull String password) throws IOException {
        Intrinsics.checkNotNullParameter(password, "password");
        StringBuilder sb2 = new StringBuilder();
        int length = password.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = password.charAt(i10);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        if (string.length() < 4) {
            return null;
        }
        return C7776c0.m32210C1(string, 4);
    }
}
