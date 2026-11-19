package up;

import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements wt.d<Set<JsonAdapterBinding<?>>> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f33819a = new k();
    }

    public static k a() {
        return a.f33819a;
    }

    public static Set<JsonAdapterBinding<?>> c() {
        return (Set) wt.h.e(com.withpersona.sdk2.inquiry.internal.network.f.g());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<JsonAdapterBinding<?>> get() {
        return c();
    }
}
