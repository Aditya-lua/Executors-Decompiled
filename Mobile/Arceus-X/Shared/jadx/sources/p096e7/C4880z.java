package p096e7;

import android.webkit.MimeTypeMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e7.z */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"", "extension", "a", "(Ljava/lang/String;)Ljava/lang/String;", "coil-core_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4880z {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m23503a(@NotNull String str) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
    }
}
