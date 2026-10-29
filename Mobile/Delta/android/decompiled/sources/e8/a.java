package e8;

import b8.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f15219e = new C0281a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f15220a;
    public final List<d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f15221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15222d;

    /* JADX INFO: renamed from: e8.a$a, reason: collision with other inner class name */
    public static final class C0281a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f15223a = null;
        public List<d> b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f15224c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f15225d = "";

        public C0281a a(d dVar) {
            this.b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f15223a, Collections.unmodifiableList(this.b), this.f15224c, this.f15225d);
        }

        public C0281a c(String str) {
            this.f15225d = str;
            return this;
        }

        public C0281a d(b bVar) {
            this.f15224c = bVar;
            return this;
        }

        public C0281a e(f fVar) {
            this.f15223a = fVar;
            return this;
        }
    }

    public a(f fVar, List<d> list, b bVar, String str) {
        this.f15220a = fVar;
        this.b = list;
        this.f15221c = bVar;
        this.f15222d = str;
    }

    public static C0281a e() {
        return new C0281a();
    }

    @tf.d(tag = 4)
    public String a() {
        return this.f15222d;
    }

    @tf.d(tag = 3)
    public b b() {
        return this.f15221c;
    }

    @tf.d(tag = 2)
    public List<d> c() {
        return this.b;
    }

    @tf.d(tag = 1)
    public f d() {
        return this.f15220a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
