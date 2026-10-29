package p068d5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: d5.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"", "key", "", "a", "(Ljava/lang/String;)Ljava/lang/Void;", "savedstate"}, m31666k = 5, m31667mv = {2, 0, 0}, m31669xi = 48, m31670xs = "androidx/savedstate/SavedStateReaderKt")
public final /* synthetic */ class C4441e {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Void m22351a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        throw new IllegalArgumentException("No valid saved state was found for the key '" + key + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }
}
