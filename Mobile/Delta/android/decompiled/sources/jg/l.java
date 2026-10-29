package jg;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
        if (t()) {
            return (o) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public r h() {
        if (u()) {
            return (r) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean m() {
        return this instanceof i;
    }

    public boolean p() {
        return this instanceof n;
    }

    public boolean t() {
        return this instanceof o;
    }

    public String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            JsonWriter jsonWriter = new JsonWriter(Streams.writerForAppendable(sb2));
            jsonWriter.setStrictness(x.LENIENT);
            Streams.write(this, jsonWriter);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean u() {
        return this instanceof r;
    }
}
