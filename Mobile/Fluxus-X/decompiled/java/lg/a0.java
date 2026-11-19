package lg;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import ng.h0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a0<T> {

    public final class b extends a0<T> {
        public b() {
        }

        @Override // lg.a0
        public T read(tg.a aVar) throws IOException {
            if (aVar.Q() != tg.b.NULL) {
                return (T) a0.this.read(aVar);
            }
            aVar.K();
            return null;
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + a0.this + "]";
        }

        @Override // lg.a0
        public void write(tg.c cVar, T t8) throws IOException {
            if (t8 == null) {
                cVar.s();
            } else {
                a0.this.write(cVar, t8);
            }
        }
    }

    public final T fromJson(Reader reader) {
        return read(new tg.a(reader));
    }

    public final T fromJsonTree(l lVar) {
        try {
            return read(new og.g(lVar));
        } catch (IOException e10) {
            throw new m(e10);
        }
    }

    public final a0<T> nullSafe() {
        return !(this instanceof b) ? new b() : this;
    }

    public abstract T read(tg.a aVar);

    public final void toJson(Writer writer, T t8) {
        write(new tg.c(writer), t8);
    }

    public final l toJsonTree(T t8) {
        try {
            og.h hVar = new og.h();
            write(hVar, t8);
            return hVar.d0();
        } catch (IOException e10) {
            throw new m(e10);
        }
    }

    public abstract void write(tg.c cVar, T t8);

    public final T fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t8) {
        StringBuilder sb2 = new StringBuilder();
        try {
            toJson(h0.c(sb2), t8);
            return sb2.toString();
        } catch (IOException e10) {
            throw new m(e10);
        }
    }
}
