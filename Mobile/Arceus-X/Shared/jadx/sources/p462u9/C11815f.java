package p462u9;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: u9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C11815f {
    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static <T> List<T> m44177a(@NonNull T t8) {
        return Collections.singletonList(t8);
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: b */
    public static <T> List<T> m44178b(@NonNull T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : Collections.singletonList(tArr[0]);
        }
        return Collections.EMPTY_LIST;
    }
}
