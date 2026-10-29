package jg;

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

/* JADX INFO: loaded from: classes2.dex */
public abstract class a0<T> {

    public final class b extends a0<T> {
        public b() {
        }

        @Override // jg.a0
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return (T) a0.this.read(jsonReader);
            }
            jsonReader.nextNull();
            return null;
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + a0.this + "]";
        }

        @Override // jg.a0
        public void write(JsonWriter jsonWriter, T t8) throws IOException {
            if (t8 == null) {
                jsonWriter.nullValue();
            } else {
                a0.this.write(jsonWriter, t8);
            }
        }
    }

    public final T fromJson(Reader reader) {
        return read(new JsonReader(reader));
    }

    public final T fromJsonTree(l lVar) {
        try {
            return read(new JsonTreeReader(lVar));
        } catch (IOException e10) {
            throw new m(e10);
        }
    }

    public final a0<T> nullSafe() {
        return !(this instanceof b) ? new b() : this;
    }

    public abstract T read(JsonReader jsonReader);

    public final void toJson(Writer writer, T t8) {
        write(new JsonWriter(writer), t8);
    }

    public final l toJsonTree(T t8) {
        try {
            JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
            write(jsonTreeWriter, t8);
            return jsonTreeWriter.get();
        } catch (IOException e10) {
            throw new m(e10);
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
            throw new m(e10);
        }
    }
}
