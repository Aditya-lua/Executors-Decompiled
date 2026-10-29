package com.google.gson.internal.sql;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;
import jg.a0;
import jg.b0;
import jg.f;

/* JADX INFO: loaded from: classes2.dex */
class SqlTimestampTypeAdapter extends a0<Timestamp> {
    static final b0 FACTORY = new b0() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // jg.b0
        public <T> a0<T> create(f fVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(fVar.o(Date.class));
            }
            return null;
        }
    };
    private final a0<Date> dateTypeAdapter;

    private SqlTimestampTypeAdapter(a0<Date> a0Var) {
        this.dateTypeAdapter = a0Var;
    }

    @Override // jg.a0
    public Timestamp read(JsonReader jsonReader) {
        Date date = this.dateTypeAdapter.read(jsonReader);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // jg.a0
    public void write(JsonWriter jsonWriter, Timestamp timestamp) {
        this.dateTypeAdapter.write(jsonWriter, timestamp);
    }
}
