package backtraceio.library.common.serialization;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import kg.AbstractC7584a0;

/* JADX INFO: loaded from: classes.dex */
public class StackTraceElementTypeAdapter extends AbstractC7584a0<StackTraceElement> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
    @Override // kg.AbstractC7584a0
    public StackTraceElement read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        jsonReader.beginObject();
        int iNextInt = -1;
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "file-name":
                    if (jsonReader.peek() != JsonToken.NULL) {
                        strNextString3 = jsonReader.nextString();
                        break;
                    } else {
                        jsonReader.nextNull();
                        strNextString3 = null;
                        break;
                    }
                    break;
                case "line-number":
                    iNextInt = jsonReader.nextInt();
                    break;
                case "method-name":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "declaring-class":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new StackTraceElement(strNextString, strNextString2, strNextString3, iNextInt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
    @Override // kg.AbstractC7584a0
    public void write(JsonWriter jsonWriter, StackTraceElement stackTraceElement) throws IOException {
        if (stackTraceElement == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("declaring-class").value(stackTraceElement.getClassName());
        jsonWriter.name("method-name").value(stackTraceElement.getMethodName());
        jsonWriter.name("file-name").value(stackTraceElement.getFileName());
        jsonWriter.name("line-number").value(stackTraceElement.getLineNumber());
        jsonWriter.endObject();
    }
}
