package og;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import lg.r;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends tg.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Writer f28144r = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final r f28145s = new r("closed");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<lg.l> f28146o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f28147p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public lg.l f28148q;

    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public h() {
        super(f28144r);
        this.f28146o = new ArrayList();
        this.f28148q = lg.n.f22140a;
    }

    @Override // tg.c
    public tg.c N(double d10) {
        if (o() || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            f0(new r(Double.valueOf(d10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    @Override // tg.c
    public tg.c O(long j10) {
        f0(new r(Long.valueOf(j10)));
        return this;
    }

    @Override // tg.c
    public tg.c Q(Boolean bool) {
        if (bool == null) {
            return s();
        }
        f0(new r(bool));
        return this;
    }

    @Override // tg.c
    public tg.c T(Number number) {
        if (number == null) {
            return s();
        }
        if (!o()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        f0(new r(number));
        return this;
    }

    @Override // tg.c
    public tg.c Y(String str) {
        if (str == null) {
            return s();
        }
        f0(new r(str));
        return this;
    }

    @Override // tg.c
    public tg.c b0(boolean z10) {
        f0(new r(Boolean.valueOf(z10)));
        return this;
    }

    @Override // tg.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f28146o.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f28146o.add(f28145s);
    }

    @Override // tg.c
    public tg.c d() {
        lg.i iVar = new lg.i();
        f0(iVar);
        this.f28146o.add(iVar);
        return this;
    }

    public lg.l d0() {
        if (this.f28146o.isEmpty()) {
            return this.f28148q;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f28146o);
    }

    @Override // tg.c
    public tg.c e() {
        lg.o oVar = new lg.o();
        f0(oVar);
        this.f28146o.add(oVar);
        return this;
    }

    public final lg.l e0() {
        List<lg.l> list = this.f28146o;
        return list.get(list.size() - 1);
    }

    public final void f0(lg.l lVar) {
        if (this.f28147p != null) {
            if (!lVar.n() || k()) {
                ((lg.o) e0()).v(this.f28147p, lVar);
            }
            this.f28147p = null;
            return;
        }
        if (this.f28146o.isEmpty()) {
            this.f28148q = lVar;
            return;
        }
        lg.l lVarE0 = e0();
        if (!(lVarE0 instanceof lg.i)) {
            throw new IllegalStateException();
        }
        ((lg.i) lVarE0).w(lVar);
    }

    @Override // tg.c, java.io.Flushable
    public void flush() {
    }

    @Override // tg.c
    public tg.c g() {
        if (this.f28146o.isEmpty() || this.f28147p != null) {
            throw new IllegalStateException();
        }
        if (!(e0() instanceof lg.i)) {
            throw new IllegalStateException();
        }
        List<lg.l> list = this.f28146o;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // tg.c
    public tg.c h() {
        if (this.f28146o.isEmpty() || this.f28147p != null) {
            throw new IllegalStateException();
        }
        if (!(e0() instanceof lg.o)) {
            throw new IllegalStateException();
        }
        List<lg.l> list = this.f28146o;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // tg.c
    public tg.c p(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f28146o.isEmpty() || this.f28147p != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(e0() instanceof lg.o)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f28147p = str;
        return this;
    }

    @Override // tg.c
    public tg.c s() {
        f0(lg.n.f22140a);
        return this;
    }
}
