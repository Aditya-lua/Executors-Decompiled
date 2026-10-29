package kg;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: renamed from: kg.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C7601q {
    /* JADX INFO: renamed from: a */
    public static AbstractC7596l m31477a(JsonReader jsonReader) {
        EnumC7608x strictness = jsonReader.getStrictness();
        if (strictness == EnumC7608x.LEGACY_STRICT) {
            jsonReader.setStrictness(EnumC7608x.LENIENT);
        }
        try {
            try {
                AbstractC7596l abstractC7596l = Streams.parse(jsonReader);
                jsonReader.setStrictness(strictness);
                return abstractC7596l;
            } catch (Throwable th2) {
                jsonReader.setStrictness(strictness);
                throw th2;
            }
        } catch (OutOfMemoryError | StackOverflowError e10) {
            throw new C7600p("Failed parsing JSON source: " + jsonReader + " to Json", e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC7596l m31478b(Reader reader) {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            AbstractC7596l abstractC7596lM31477a = m31477a(jsonReader);
            if (!abstractC7596lM31477a.m31460p() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new C7605u("Did not consume the entire document.");
            }
            return abstractC7596lM31477a;
        } catch (MalformedJsonException | NumberFormatException e10) {
            throw new C7605u(e10);
        } catch (IOException e11) {
            throw new C7597m(e11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC7596l m31479c(String str) {
        return m31478b(new StringReader(str));
    }
}
