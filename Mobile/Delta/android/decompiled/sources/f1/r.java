package f1;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class r extends u {
    public final b b;

    public static final class a extends u.a<r, a> {
        public final b.a b;

        public a(File file) {
            super(new f.b());
            x2.g.h(file, "File can't be null.");
            b.a aVar = (b.a) this.f16036a;
            this.b = aVar;
            aVar.d(file);
        }

        public r a() {
            return new r(this.b.c());
        }
    }

    public static abstract class b extends u.b {

        public static abstract class a extends u.b.a<a> {
            public abstract b c();

            public abstract a d(File file);
        }

        public abstract File d();
    }

    public r(b bVar) {
        super(bVar);
        this.b = bVar;
    }

    public File d() {
        return this.b.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.b.equals(((r) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
