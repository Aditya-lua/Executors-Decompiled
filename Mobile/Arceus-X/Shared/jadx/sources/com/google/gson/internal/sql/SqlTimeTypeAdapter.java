package com.google.gson.internal.sql;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import kg.AbstractC7584a0;
import kg.C7590f;
import kg.C7605u;
import kg.InterfaceC7586b0;

/* JADX INFO: loaded from: classes2.dex */
final class SqlTimeTypeAdapter extends AbstractC7584a0<Time> {
    static final InterfaceC7586b0 FACTORY = new InterfaceC7586b0() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // kg.InterfaceC7586b0
        public <T> AbstractC7584a0<T> create(C7590f c7590f, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat format;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private SqlTimeTypeAdapter() {
        this.format = new SimpleDateFormat("hh:mm:ss a");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
    @Override // kg.AbstractC7584a0
    public Time read(JsonReader jsonReader) throws IOException {
        Time time;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String strNextString = jsonReader.nextString();
        synchronized (this) {
            TimeZone timeZone = this.format.getTimeZone();
            try {
                try {
                    time = new Time(this.format.parse(strNextString).getTime());
                    this.format.setTimeZone(timeZone);
                } catch (ParseException e10) {
                    throw new C7605u("Failed parsing '" + strNextString + "' as SQL Time; at path " + jsonReader.getPreviousPath(), e10);
                }
            } catch (Throwable th2) {
                this.format.setTimeZone(timeZone);
                throw th2;
            }
        }
        return time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
    @Override // kg.AbstractC7584a0
    public void write(JsonWriter jsonWriter, Time time) throws IOException {
        String str;
        if (time == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this) {
            str = this.format.format((Date) time);
        }
        jsonWriter.value(str);
    }
}
