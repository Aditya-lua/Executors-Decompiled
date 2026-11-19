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
import p001kotlin.coroutines.CoroutineContext;
import y5.h0;
import y5.l;
import y5.u0;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public UUID f2959a;
    public b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set<String> f2960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f2961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f2963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CoroutineContext f2964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i6.b f2965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u0 f2966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h0 f2967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f2968k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2969l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<String> f2970a;
        public List<Uri> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Network f2971c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.f2970a = list;
            this.b = list;
        }
    }

    public WorkerParameters(UUID uuid, b bVar, Collection<String> collection, a aVar, int i10, int i11, Executor executor, CoroutineContext coroutineContext, i6.b bVar2, u0 u0Var, h0 h0Var, l lVar) {
        this.f2959a = uuid;
        this.b = bVar;
        this.f2960c = new HashSet(collection);
        this.f2961d = aVar;
        this.f2962e = i10;
        this.f2969l = i11;
        this.f2963f = executor;
        this.f2964g = coroutineContext;
        this.f2965h = bVar2;
        this.f2966i = u0Var;
        this.f2967j = h0Var;
        this.f2968k = lVar;
    }

    public Executor a() {
        return this.f2963f;
    }

    public l b() {
        return this.f2968k;
    }

    public UUID c() {
        return this.f2959a;
    }

    public b d() {
        return this.b;
    }

    public Network e() {
        return this.f2961d.f2971c;
    }

    public h0 f() {
        return this.f2967j;
    }

    public int g() {
        return this.f2962e;
    }

    public Set<String> h() {
        return this.f2960c;
    }

    public i6.b i() {
        return this.f2965h;
    }

    public List<String> j() {
        return this.f2961d.f2970a;
    }

    public List<Uri> k() {
        return this.f2961d.b;
    }

    public CoroutineContext l() {
        return this.f2964g;
    }

    public u0 m() {
        return this.f2966i;
    }
}
