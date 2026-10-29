package kg;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: renamed from: kg.l */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7596l {
    @Deprecated
    public AbstractC7596l() {
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC7596l mo31444a();

    /* JADX INFO: renamed from: b */
    public boolean mo31445b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: c */
    public double mo31446c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: d */
    public float mo31447d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: e */
    public int mo31448e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: f */
    public C7593i m31456f() {
        if (m31459m()) {
            return (C7593i) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* JADX INFO: renamed from: g */
    public C7599o m31457g() {
        if (m31461t()) {
            return (C7599o) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* JADX INFO: renamed from: h */
    public C7602r m31458h() {
        if (m31462u()) {
            return (C7602r) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* JADX INFO: renamed from: i */
    public long mo31449i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: k */
    public Number mo31450k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: l */
    public String mo31451l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: m */
    public boolean m31459m() {
        return this instanceof C7593i;
    }

    /* JADX INFO: renamed from: p */
    public boolean m31460p() {
        return this instanceof C7598n;
    }

    /* JADX INFO: renamed from: t */
    public boolean m31461t() {
        return this instanceof C7599o;
    }

    public String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            JsonWriter jsonWriter = new JsonWriter(Streams.writerForAppendable(sb2));
            jsonWriter.setStrictness(EnumC7608x.LENIENT);
            Streams.write(this, jsonWriter);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m31462u() {
        return this instanceof C7602r;
    }
}
