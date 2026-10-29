package kg;

import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;

/* JADX INFO: renamed from: kg.a0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7584a0<T> {

    /* JADX INFO: renamed from: kg.a0$b */
    public final class b extends AbstractC7584a0<T> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
        }

        @Override // kg.AbstractC7584a0
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (T) AbstractC7584a0.this.read(jsonReader);
            }
            jsonReader.nextNull();
            return null;
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + AbstractC7584a0.this + "]";
        }

        @Override // kg.AbstractC7584a0
        public void write(JsonWriter jsonWriter, T t8) throws IOException {
            if (t8 == null) {
                jsonWriter.nullValue();
            } else {
                AbstractC7584a0.this.write(jsonWriter, t8);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final T fromJson(Reader reader) {
        return read(new JsonReader(reader));
    }

    public final T fromJsonTree(AbstractC7596l abstractC7596l) {
        try {
            return read(new JsonTreeReader(abstractC7596l));
        } catch (IOException e10) {
            throw new C7597m(e10);
        }
    }

    public final AbstractC7584a0<T> nullSafe() {
        return !(this instanceof b) ? new b() : this;
    }

    public abstract T read(JsonReader jsonReader);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void toJson(Writer writer, T t8) {
        write(new JsonWriter(writer), t8);
    }

    public final AbstractC7596l toJsonTree(T t8) {
        try {
            JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
            write(jsonTreeWriter, t8);
            return jsonTreeWriter.get();
        } catch (IOException e10) {
            throw new C7597m(e10);
        }
    }

    public abstract void write(JsonWriter jsonWriter, T t8);

    public final T fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final String toJson(T t8) {
        StringBuilder sb2 = new StringBuilder();
        try {
            toJson(Streams.writerForAppendable(sb2), t8);
            return sb2.toString();
        } catch (IOException e10) {
            throw new C7597m(e10);
        }
    }
}
