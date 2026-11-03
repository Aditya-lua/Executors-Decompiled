package r9;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import n9.m;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30225a;
    public final r9.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f30226c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f30227a = new ArrayList();
        public r9.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Executor f30228c;

        @NonNull
        public a a(@NonNull k9.h hVar) {
            this.f30227a.add(hVar);
            return this;
        }

        @NonNull
        public d b() {
            return new d(this.f30227a, this.b, this.f30228c, true, null);
        }
    }

    public /* synthetic */ d(List list, r9.a aVar, Executor executor, boolean z10, g gVar) {
        m.m(list, "APIs must not be null.");
        m.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            m.m(aVar, "Listener must not be null when listener executor is set.");
        }
        this.f30225a = list;
        this.b = aVar;
        this.f30226c = executor;
    }

    @NonNull
    public static a d() {
        return new a();
    }

    @NonNull
    public List<k9.h> a() {
        return this.f30225a;
    }

    public r9.a b() {
        return this.b;
    }

    public Executor c() {
        return this.f30226c;
    }
}
