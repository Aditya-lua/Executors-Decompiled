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
    public UUID f3447a;
    public b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<String> f3448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f3449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f3451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CoroutineContext f3452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h6.b f3453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u0 f3454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h0 f3455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f3456k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3457l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<String> f3458a;
        public List<Uri> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Network f3459c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f3458a = list;
            this.b = list;
        }
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i10, int i11, Executor executor, CoroutineContext coroutineContext, h6.b bVar2, u0 u0Var, h0 h0Var, l lVar) {
        this.f3447a = uuid;
        this.b = bVar;
        this.f3448c = new HashSet(collection);
        this.f3449d = aVar;
        this.f3450e = i10;
        this.f3457l = i11;
        this.f3451f = executor;
        this.f3452g = coroutineContext;
        this.f3453h = bVar2;
        this.f3454i = u0Var;
        this.f3455j = h0Var;
        this.f3456k = lVar;
    }

    public Executor a() {
        return this.f3451f;
    }

    public l b() {
        return this.f3456k;
    }

    public UUID c() {
        return this.f3447a;
    }

    public b d() {
        return this.b;
    }

    public Network e() {
        return this.f3449d.f3459c;
    }

    public h0 f() {
        return this.f3455j;
    }

    public int g() {
        return this.f3450e;
    }

    public Set<String> h() {
        return this.f3448c;
    }

    public h6.b i() {
        return this.f3453h;
    }

    public List<String> j() {
        return this.f3449d.f3458a;
    }

    public List<Uri> k() {
        return this.f3449d.b;
    }

    public CoroutineContext l() {
        return this.f3452g;
    }

    public u0 m() {
        return this.f3454i;
    }
}
