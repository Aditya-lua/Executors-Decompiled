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
import p161h6.InterfaceC6292b;
import p536x5.AbstractC12729u0;
import p536x5.InterfaceC12703h0;
import p536x5.InterfaceC12710l;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a */
    public UUID f4523a;

    /* JADX INFO: renamed from: b */
    public C1116b f4524b;

    /* JADX INFO: renamed from: c */
    public Set<String> f4525c;

    /* JADX INFO: renamed from: d */
    public C1114a f4526d;

    /* JADX INFO: renamed from: e */
    public int f4527e;

    /* JADX INFO: renamed from: f */
    public Executor f4528f;

    /* JADX INFO: renamed from: g */
    public CoroutineContext f4529g;

    /* JADX INFO: renamed from: h */
    public InterfaceC6292b f4530h;

    /* JADX INFO: renamed from: i */
    public AbstractC12729u0 f4531i;

    /* JADX INFO: renamed from: j */
    public InterfaceC12703h0 f4532j;

    /* JADX INFO: renamed from: k */
    public InterfaceC12710l f4533k;

    /* JADX INFO: renamed from: l */
    public int f4534l;

    /* JADX INFO: renamed from: androidx.work.WorkerParameters$a */
    public static class C1114a {

        /* JADX INFO: renamed from: a */
        public List<String> f4535a;

        /* JADX INFO: renamed from: b */
        public List<Uri> f4536b;

        /* JADX INFO: renamed from: c */
        public Network f4537c;

        public C1114a() {
            List list = Collections.EMPTY_LIST;
            this.f4535a = list;
            this.f4536b = list;
        }
    }

    public WorkerParameters(UUID uuid, C1116b c1116b, Collection<String> collection, C1114a c1114a, int i10, int i11, Executor executor, CoroutineContext coroutineContext, InterfaceC6292b interfaceC6292b, AbstractC12729u0 abstractC12729u0, InterfaceC12703h0 interfaceC12703h0, InterfaceC12710l interfaceC12710l) {
        this.f4523a = uuid;
        this.f4524b = c1116b;
        this.f4525c = new HashSet(collection);
        this.f4526d = c1114a;
        this.f4527e = i10;
        this.f4534l = i11;
        this.f4528f = executor;
        this.f4529g = coroutineContext;
        this.f4530h = interfaceC6292b;
        this.f4531i = abstractC12729u0;
        this.f4532j = interfaceC12703h0;
        this.f4533k = interfaceC12710l;
    }

    /* JADX INFO: renamed from: a */
    public Executor m6255a() {
        return this.f4528f;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC12710l m6256b() {
        return this.f4533k;
    }

    /* JADX INFO: renamed from: c */
    public UUID m6257c() {
        return this.f4523a;
    }

    /* JADX INFO: renamed from: d */
    public C1116b m6258d() {
        return this.f4524b;
    }

    /* JADX INFO: renamed from: e */
    public Network m6259e() {
        return this.f4526d.f4537c;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC12703h0 m6260f() {
        return this.f4532j;
    }

    /* JADX INFO: renamed from: g */
    public int m6261g() {
        return this.f4527e;
    }

    /* JADX INFO: renamed from: h */
    public Set<String> m6262h() {
        return this.f4525c;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC6292b m6263i() {
        return this.f4530h;
    }

    /* JADX INFO: renamed from: j */
    public List<String> m6264j() {
        return this.f4526d.f4535a;
    }

    /* JADX INFO: renamed from: k */
    public List<Uri> m6265k() {
        return this.f4526d.f4536b;
    }

    /* JADX INFO: renamed from: l */
    public CoroutineContext m6266l() {
        return this.f4529g;
    }

    /* JADX INFO: renamed from: m */
    public AbstractC12729u0 m6267m() {
        return this.f4531i;
    }
}
