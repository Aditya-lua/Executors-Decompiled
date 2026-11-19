package lg;

import java.io.IOException;
import ng.h0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {
    @Deprecated
    public l() {
    }

    public abstract l a();

    public boolean b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public i f() {
        if (m()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public o g() {
        if (q()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public r h() {
        if (t()) {
            return (r) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number j() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean m() {
        return this instanceof i;
    }

    public boolean n() {
        return this instanceof n;
    }

    public boolean q() {
        return this instanceof o;
    }

    public boolean t() {
        return this instanceof r;
    }

    public String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            tg.c cVar = new tg.c(h0.c(sb2));
            cVar.K(x.LENIENT);
            h0.b(this, cVar);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
