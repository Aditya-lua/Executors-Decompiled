package k6;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0007\u001a\u00020\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006¨\u0006\b"}, d2 = {"Lk6/l$c;", "", "a", "Lk6/l$c;", "serviceLoaderEnabledKey", "Lk6/w$a;", "(Lk6/w$a;)Z", "serviceLoaderEnabled", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Extras.c<Boolean> f22219a = new Extras.c<>(Boolean.TRUE);

    public static final boolean a(@NotNull w.Options options) {
        return ((Boolean) m.c(options.getDefaults().getExtras(), f22219a)).booleanValue();
    }
}
