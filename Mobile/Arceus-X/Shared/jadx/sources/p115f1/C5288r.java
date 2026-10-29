package p115f1;

import java.io.File;
import p533x2.C12637g;

/* JADX INFO: renamed from: f1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C5288r extends AbstractC5297u {

    /* JADX INFO: renamed from: b */
    public final b f20466b;

    /* JADX INFO: renamed from: f1.r$a */
    public static final class a extends AbstractC5297u.a<C5288r, a> {

        /* JADX INFO: renamed from: b */
        public final b.a f20467b;

        public a(File file) {
            super(new C5252f.b());
            C12637g.m47076h(file, "File can't be null.");
            b.a aVar = (b.a) this.f20612a;
            this.f20467b = aVar;
            aVar.mo24297d(file);
        }

        /* JADX INFO: renamed from: a */
        public C5288r m24434a() {
            return new C5288r(this.f20467b.mo24296c());
        }
    }

    /* JADX INFO: renamed from: f1.r$b */
    public static abstract class b extends AbstractC5297u.b {

        /* JADX INFO: renamed from: f1.r$b$a */
        public static abstract class a extends AbstractC5297u.b.a<a> {
            /* JADX INFO: renamed from: c */
            public abstract b mo24296c();

            /* JADX INFO: renamed from: d */
            public abstract a mo24297d(File file);
        }

        /* JADX INFO: renamed from: d */
        public abstract File mo24293d();
    }

    public C5288r(b bVar) {
        super(bVar);
        this.f20466b = bVar;
    }

    /* JADX INFO: renamed from: d */
    public File m24433d() {
        return this.f20466b.mo24293d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5288r) {
            return this.f20466b.equals(((C5288r) obj).f20466b);
        }
        return false;
    }

    public int hashCode() {
        return this.f20466b.hashCode();
    }

    public String toString() {
        return this.f20466b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
