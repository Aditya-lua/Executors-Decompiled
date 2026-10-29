package p009a8;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: renamed from: a8.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0096n {
    /* JADX INFO: renamed from: a */
    public static AbstractC0096n m290a(long j10) {
        return new C0090h(j10);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static AbstractC0096n m291b(@NonNull Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        AbstractC0096n abstractC0096nM290a = m290a(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return abstractC0096nM290a;
                    }
                    AbstractC0096n abstractC0096nM290a2 = m290a(jsonReader.nextLong());
                    jsonReader.close();
                    return abstractC0096nM290a2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th2) {
            jsonReader.close();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract long mo275c();
}
