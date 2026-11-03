package e8;

import b8.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15833e = new C0295a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f15834a;
    public final List<d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f15835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15836d;

    /* JADX INFO: renamed from: e8.a$a, reason: collision with other inner class name */
    public static final class C0295a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f15837a = null;
        public List<d> b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f15838c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f15839d = "";

        public C0295a a(d dVar) {
            this.b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f15837a, Collections.unmodifiableList(this.b), this.f15838c, this.f15839d);
        }

        public C0295a c(String str) {
            this.f15839d = str;
            return this;
        }

        public C0295a d(b bVar) {
            this.f15838c = bVar;
            return this;
        }

        public C0295a e(f fVar) {
            this.f15837a = fVar;
            return this;
        }
    }

    public a(f fVar, List<d> list, b bVar, String str) {
        this.f15834a = fVar;
        this.b = list;
        this.f15835c = bVar;
        this.f15836d = str;
    }

    public static C0295a e() {
        return new C0295a();
    }

    @uf.d(tag = 4)
    public String a() {
        return this.f15836d;
    }

    @uf.d(tag = 3)
    public b b() {
        return this.f15835c;
    }

    @uf.d(tag = 2)
    public List<d> c() {
        return this.b;
    }

    @uf.d(tag = 1)
    public f d() {
        return this.f15834a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
