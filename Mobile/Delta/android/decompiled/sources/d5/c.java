package d5;

import android.os.Bundle;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.j0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u0017"}, d2 = {"Ld5/c;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", Payload.SOURCE, "a", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", "key", "", "e", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "c", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;", "d", "", "f", "(Landroid/os/Bundle;)Z", "b", "(Landroid/os/Bundle;Ljava/lang/String;)Z", "", "g", "(Landroid/os/Bundle;)Ljava/util/Map;", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {
    @NotNull
    public static Bundle a(@NotNull Bundle source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source;
    }

    public static final boolean b(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.containsKey(key);
    }

    @NotNull
    public static final Bundle c(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        d.a(key);
        throw new jt.d();
    }

    @Nullable
    public static final Bundle d(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getBundle(key);
    }

    @Nullable
    public static final List<String> e(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.getStringArrayList(key);
    }

    public static final boolean f(Bundle bundle) {
        return bundle.isEmpty();
    }

    @NotNull
    public static final Map<String, Object> g(Bundle bundle) {
        Map mapE = j0.e(bundle.size());
        for (String str : bundle.keySet()) {
            Intrinsics.checkNotNull(str);
            mapE.put(str, bundle.get(str));
        }
        return j0.c(mapE);
    }
}
