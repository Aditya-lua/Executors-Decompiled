package p068d5;

import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: d5.j */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0015"}, m31665d2 = {"Ld5/j;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", Payload.SOURCE, "a", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", "key", "", "value", "", "d", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "c", "(Landroid/os/Bundle;Ljava/lang/String;Landroid/os/Bundle;)V", "from", "b", "(Landroid/os/Bundle;Landroid/os/Bundle;)V", "e", "(Landroid/os/Bundle;Ljava/lang/String;)V", "savedstate"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C4446j {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static Bundle m22365a(@NotNull Bundle source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source;
    }

    /* JADX INFO: renamed from: b */
    public static final void m22366b(Bundle bundle, @NotNull Bundle from) {
        Intrinsics.checkNotNullParameter(from, "from");
        bundle.putAll(from);
    }

    /* JADX INFO: renamed from: c */
    public static final void m22367c(Bundle bundle, @NotNull String key, @NotNull Bundle value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putBundle(key, value);
    }

    /* JADX INFO: renamed from: d */
    public static final void m22368d(Bundle bundle, @NotNull String key, @NotNull List<String> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putStringArrayList(key, C4447k.m22370a(value));
    }

    /* JADX INFO: renamed from: e */
    public static final void m22369e(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.remove(key);
    }
}
