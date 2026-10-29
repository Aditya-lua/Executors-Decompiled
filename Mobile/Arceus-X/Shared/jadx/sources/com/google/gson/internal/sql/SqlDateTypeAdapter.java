package com.google.gson.internal.sql;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import kg.AbstractC7584a0;
import kg.C7590f;
import kg.C7605u;
import kg.InterfaceC7586b0;

/* JADX INFO: loaded from: classes2.dex */
final class SqlDateTypeAdapter extends AbstractC7584a0<Date> {
    static final InterfaceC7586b0 FACTORY = new InterfaceC7586b0() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // kg.InterfaceC7586b0
        public <T> AbstractC7584a0<T> create(C7590f c7590f, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat format;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private SqlDateTypeAdapter() {
        this.format = new SimpleDateFormat("MMM d, yyyy");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
    @Override // kg.AbstractC7584a0
    public Date read(JsonReader jsonReader) throws IOException {
        Date date;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        synchronized (this) {
            TimeZone timeZone = this.format.getTimeZone();
            try {
                try {
                    date = new Date(this.format.parse(strNextString).getTime());
                    this.format.setTimeZone(timeZone);
                } catch (ParseException e10) {
                    throw new C7605u("Failed parsing '" + strNextString + "' as SQL Date; at path " + jsonReader.getPreviousPath(), e10);
                }
            } catch (Throwable th2) {
                this.format.setTimeZone(timeZone);
                throw th2;
            }
        }
        return date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
    @Override // kg.AbstractC7584a0
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        String str;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            str = this.format.format((java.util.Date) date);
        }
        jsonWriter.value(str);
    }
}
