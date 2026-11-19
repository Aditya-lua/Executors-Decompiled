package f8;

import c8.l;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15673e = new C0293a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f15674a;
    public final List<d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f15675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15676d;

    /* JADX INFO: renamed from: f8.a$a, reason: collision with other inner class name */
    public static final class C0293a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f15677a = null;
        public List<d> b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f15678c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f15679d = BuildConfig.FLAVOR;

        public C0293a a(d dVar) {
            this.b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f15677a, Collections.unmodifiableList(this.b), this.f15678c, this.f15679d);
        }

        public C0293a c(String str) {
            this.f15679d = str;
            return this;
        }

        public C0293a d(b bVar) {
            this.f15678c = bVar;
            return this;
        }

        public C0293a e(f fVar) {
            this.f15677a = fVar;
            return this;
        }
    }

    public a(f fVar, List<d> list, b bVar, String str) {
        this.f15674a = fVar;
        this.b = list;
        this.f15675c = bVar;
        this.f15676d = str;
    }

    public static C0293a e() {
        return new C0293a();
    }

    @wf.d(tag = 4)
    public String a() {
        return this.f15676d;
    }

    @wf.d(tag = 3)
    public b b() {
        return this.f15675c;
    }

    @wf.d(tag = 2)
    public List<d> c() {
        return this.b;
    }

    @wf.d(tag = 1)
    public f d() {
        return this.f15674a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
