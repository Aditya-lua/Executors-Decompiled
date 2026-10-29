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
import jg.a0;
import jg.b0;
import jg.f;
import jg.u;

/* JADX INFO: loaded from: classes2.dex */
final class SqlTimeTypeAdapter extends a0<Time> {
    static final b0 FACTORY = new b0() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // jg.b0
        public <T> a0<T> create(f fVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat format;

    private SqlTimeTypeAdapter() {
        this.format = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // jg.a0
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
                    throw new u("Failed parsing '" + strNextString + "' as SQL Time; at path " + jsonReader.getPreviousPath(), e10);
                }
            } catch (Throwable th2) {
                this.format.setTimeZone(timeZone);
                throw th2;
            }
        }
        return time;
    }

    @Override // jg.a0
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
