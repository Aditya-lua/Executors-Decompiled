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
import jg.a0;
import jg.b0;
import jg.f;
import jg.u;

/* JADX INFO: loaded from: classes2.dex */
final class SqlDateTypeAdapter extends a0<Date> {
    static final b0 FACTORY = new b0() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // jg.b0
        public <T> a0<T> create(f fVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat format;

    private SqlDateTypeAdapter() {
        this.format = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // jg.a0
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
                    throw new u("Failed parsing '" + strNextString + "' as SQL Date; at path " + jsonReader.getPreviousPath(), e10);
                }
            } catch (Throwable th2) {
                this.format.setTimeZone(timeZone);
                throw th2;
            }
        }
        return date;
    }

    @Override // jg.a0
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
