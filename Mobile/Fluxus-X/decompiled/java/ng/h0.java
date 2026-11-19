package ng;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {
    public static lg.l a(tg.a aVar) {
        boolean z10;
        try {
            try {
                aVar.Q();
                z10 = false;
                try {
                    return og.p.V.read(aVar);
                } catch (EOFException e10) {
                    e = e10;
                    if (z10) {
                        return lg.n.f22140a;
                    }
                    throw new lg.u(e);
                }
            } catch (EOFException e11) {
                e = e11;
                z10 = true;
            }
        } catch (NumberFormatException e12) {
            throw new lg.u(e12);
        } catch (tg.d e13) {
            throw new lg.u(e13);
        } catch (IOException e14) {
            throw new lg.m(e14);
        }
    }

    public static void b(lg.l lVar, tg.c cVar) {
        og.p.V.write(cVar, lVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new b(appendable);
    }

    public static final class b extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Appendable f25552a;
        public final a b = new a();

        public static class a implements CharSequence {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public char[] f25553a;
            public String b;

            public a() {
            }

            public void a(char[] cArr) {
                this.f25553a = cArr;
                this.b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f25553a[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f25553a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f25553a, i10, i11 - i10);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.b == null) {
                    this.b = new String(this.f25553a);
                }
                return this.b;
            }
        }

        public b(Appendable appendable) {
            this.f25552a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            this.b.a(cArr);
            this.f25552a.append(this.b, i10, i11 + i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) throws IOException {
            this.f25552a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f25552a.append((char) i10);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
            this.f25552a.append(charSequence, i10, i11);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i10, int i11) throws IOException {
            Objects.requireNonNull(str);
            this.f25552a.append(str, i10, i11 + i10);
        }
    }
}
