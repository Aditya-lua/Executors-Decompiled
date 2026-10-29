package p254ks;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ks.d */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, m31665d2 = {"Lks/d;", "", "wrappedValue", "", "b", "(Ljava/lang/Object;)Z", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC7823d {
    /* JADX INFO: renamed from: b */
    default boolean mo22977b(@Nullable Object wrappedValue) {
        if (wrappedValue == null) {
            return false;
        }
        if (wrappedValue instanceof Boolean) {
            return ((Boolean) wrappedValue).booleanValue();
        }
        if (wrappedValue instanceof Number) {
            return ((Number) wrappedValue).doubleValue() != 0.0d;
        }
        if (wrappedValue instanceof String) {
            return (((CharSequence) wrappedValue).length() <= 0 || Intrinsics.m31980c(wrappedValue, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI) || Intrinsics.m31980c(wrappedValue, "null")) ? false : true;
        }
        if (wrappedValue instanceof Collection) {
            return !((Collection) wrappedValue).isEmpty();
        }
        return ((wrappedValue instanceof Object[]) && ((Object[]) wrappedValue).length == 0) ? false : true;
    }
}
