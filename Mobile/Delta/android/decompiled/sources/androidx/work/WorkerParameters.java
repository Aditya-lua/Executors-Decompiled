package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import x5.h0;
import x5.l;
import x5.u0;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UUID f3292a;
    public b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<String> f3293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f3294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f3296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CoroutineContext f3297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h6.b f3298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u0 f3299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h0 f3300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f3301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3302l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<String> f3303a;
        public List<Uri> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Network f3304c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f3303a = list;
            this.b = list;
        }
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i10, int i11, Executor executor, CoroutineContext coroutineContext, h6.b bVar2, u0 u0Var, h0 h0Var, l lVar) {
        this.f3292a = uuid;
        this.b = bVar;
        this.f3293c = new HashSet(collection);
        this.f3294d = aVar;
        this.f3295e = i10;
        this.f3302l = i11;
        this.f3296f = executor;
        this.f3297g = coroutineContext;
        this.f3298h = bVar2;
        this.f3299i = u0Var;
        this.f3300j = h0Var;
        this.f3301k = lVar;
    }

    public Executor a() {
        return this.f3296f;
    }

    public l b() {
        return this.f3301k;
    }

    public UUID c() {
        return this.f3292a;
    }

    public b d() {
        return this.b;
    }

    public Network e() {
        return this.f3294d.f3304c;
    }

    public h0 f() {
        return this.f3300j;
    }

    public int g() {
        return this.f3295e;
    }

    public Set<String> h() {
        return this.f3293c;
    }

    public h6.b i() {
        return this.f3298h;
    }

    public List<String> j() {
        return this.f3294d.f3303a;
    }

    public List<Uri> k() {
        return this.f3294d.b;
    }

    public CoroutineContext l() {
        return this.f3297g;
    }

    public u0 m() {
        return this.f3299i;
    }
}
