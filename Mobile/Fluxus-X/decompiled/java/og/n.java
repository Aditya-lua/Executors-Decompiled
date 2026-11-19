package og;

import java.io.IOException;
import java.util.Objects;
import lg.a0;
import lg.b0;
import lg.s;
import lg.t;
import ng.h0;

/* JADX INFO: loaded from: classes2.dex */
public final class n<T> extends m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t<T> f28180a;
    public final lg.k<T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lg.f f28181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sg.a<T> f28182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f28183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n<T>.b f28184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f28185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile a0<T> f28186h;

    public final class b implements s, lg.j {
        public b() {
        }
    }

    public static final class c implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final sg.a<?> f28188a;
        public final boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Class<?> f28189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t<?> f28190d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final lg.k<?> f28191e;

        public c(Object obj, sg.a<?> aVar, boolean z10, Class<?> cls) {
            t<?> tVar = obj instanceof t ? (t) obj : null;
            this.f28190d = tVar;
            lg.k<?> kVar = obj instanceof lg.k ? (lg.k) obj : null;
            this.f28191e = kVar;
            if (tVar != null || kVar != null) {
                this.f28188a = aVar;
                this.b = z10;
                this.f28189c = cls;
            } else {
                Objects.requireNonNull(obj);
                throw new IllegalArgumentException("Type adapter " + obj.getClass().getName() + " must implement JsonSerializer or JsonDeserializer");
            }
        }

        @Override // lg.b0
        public <T> a0<T> create(lg.f fVar, sg.a<T> aVar) {
            boolean zIsAssignableFrom;
            sg.a<?> aVar2 = this.f28188a;
            if (aVar2 != null) {
                zIsAssignableFrom = aVar2.equals(aVar) || (this.b && this.f28188a.d() == aVar.c());
            } else {
                zIsAssignableFrom = this.f28189c.isAssignableFrom(aVar.c());
            }
            if (zIsAssignableFrom) {
                return new n(this.f28190d, this.f28191e, fVar, aVar, this);
            }
            return null;
        }
    }

    public n(t<T> tVar, lg.k<T> kVar, lg.f fVar, sg.a<T> aVar, b0 b0Var, boolean z10) {
        this.f28184f = new b();
        this.f28180a = tVar;
        this.b = kVar;
        this.f28181c = fVar;
        this.f28182d = aVar;
        this.f28183e = b0Var;
        this.f28185g = z10;
    }

    private a0<T> b() {
        a0<T> a0Var = this.f28186h;
        if (a0Var != null) {
            return a0Var;
        }
        a0<T> a0VarN = this.f28181c.n(this.f28183e, this.f28182d);
        this.f28186h = a0VarN;
        return a0VarN;
    }

    public static b0 c(sg.a<?> aVar, Object obj) {
        return new c(obj, aVar, aVar.d() == aVar.c(), null);
    }

    @Override // og.m
    public a0<T> a() {
        return this.f28180a != null ? this : b();
    }

    @Override // lg.a0
    public T read(tg.a aVar) {
        if (this.b == null) {
            return b().read(aVar);
        }
        lg.l lVarA = h0.a(aVar);
        if (this.f28185g && lVarA.n()) {
            return null;
        }
        return this.b.a(lVarA, this.f28182d.d(), this.f28184f);
    }

    @Override // lg.a0
    public void write(tg.c cVar, T t8) throws IOException {
        t<T> tVar = this.f28180a;
        if (tVar == null) {
            b().write(cVar, t8);
        } else if (this.f28185g && t8 == null) {
            cVar.s();
        } else {
            h0.b(tVar.a(t8, this.f28182d.d(), this.f28184f), cVar);
        }
    }

    public n(t<T> tVar, lg.k<T> kVar, lg.f fVar, sg.a<T> aVar, b0 b0Var) {
        this(tVar, kVar, fVar, aVar, b0Var, true);
    }
}
