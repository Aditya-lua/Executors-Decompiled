package ut;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"", "", "a", "(Ljava/lang/String;)I", "Ljava/io/File;", "", "b", "(Ljava/io/File;)Z", "isRooted", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/io/FilesKt")
public class h {
    public static final int a(String str) {
        int iM0;
        char c10 = File.separatorChar;
        int iM1 = StringsKt.m0(str, c10, 0, false, 4, null);
        if (iM1 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c10 || (iM0 = StringsKt.m0(str, c10, 2, false, 4, null)) < 0) {
                return 1;
            }
            int iM2 = StringsKt.m0(str, c10, iM0 + 1, false, 4, null);
            return iM2 >= 0 ? iM2 + 1 : str.length();
        }
        if (iM1 > 0 && str.charAt(iM1 - 1) == ':') {
            return iM1 + 1;
        }
        if (iM1 == -1 && StringsKt.e0(str, ':', false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    public static final boolean b(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return a(path) > 0;
    }
}
