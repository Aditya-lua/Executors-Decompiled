package s9;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o9.s;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31251a;
    public final s9.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f31252c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f31253a = new ArrayList();
        public s9.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Executor f31254c;

        @NonNull
        public a a(@NonNull l9.j jVar) {
            this.f31253a.add(jVar);
            return this;
        }

        @NonNull
        public f b() {
            return new f(this.f31253a, this.b, this.f31254c, true, null);
        }
    }

    public /* synthetic */ f(List list, s9.a aVar, Executor executor, boolean z10, k kVar) {
        s.m(list, "APIs must not be null.");
        s.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            s.m(aVar, "Listener must not be null when listener executor is set.");
        }
        this.f31251a = list;
        this.b = aVar;
        this.f31252c = executor;
    }

    @NonNull
    public static a d() {
        return new a();
    }

    @NonNull
    public List<l9.j> a() {
        return this.f31251a;
    }

    public s9.a b() {
        return this.b;
    }

    public Executor c() {
        return this.f31252c;
    }
}
