package gp;

import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements ft.d<Set<JsonAdapterBinding<?>>> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f18350a = new k();
    }

    public static k a() {
        return a.f18350a;
    }

    public static Set<JsonAdapterBinding<?>> c() {
        return (Set) ft.h.e(com.withpersona.sdk2.inquiry.internal.network.f.g());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Set<JsonAdapterBinding<?>> get() {
        return c();
    }
}
