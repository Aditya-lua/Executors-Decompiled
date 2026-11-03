package ep;

import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements dt.d<Set<JsonAdapterBinding<?>>> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f16248a = new k();
    }

    public static k a() {
        return a.f16248a;
    }

    public static Set<JsonAdapterBinding<?>> c() {
        return (Set) dt.h.e(com.withpersona.sdk2.inquiry.internal.network.f.g());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<JsonAdapterBinding<?>> get() {
        return c();
    }
}
