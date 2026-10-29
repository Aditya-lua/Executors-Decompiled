package p226jq;

import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C7693m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jq.m */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m31665d2 = {"", "b", "(Ljava/lang/String;)Ljava/lang/String;", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C7271m {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m30296b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNull(bArrDigest);
        return C7693m.m31857Z(bArrDigest, "", null, null, 0, null, new Function1() { // from class: jq.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7271m.m30297c(((Byte) obj).byteValue());
            }
        }, 30, null);
    }

    /* JADX INFO: renamed from: c */
    public static final CharSequence m30297c(byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
