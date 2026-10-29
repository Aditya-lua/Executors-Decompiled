package com.google.gson.internal.sql;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;
import kg.AbstractC7584a0;
import kg.C7590f;
import kg.InterfaceC7586b0;

/* JADX INFO: loaded from: classes2.dex */
class SqlTimestampTypeAdapter extends AbstractC7584a0<Timestamp> {
    static final InterfaceC7586b0 FACTORY = new InterfaceC7586b0() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // kg.InterfaceC7586b0
        public <T> AbstractC7584a0<T> create(C7590f c7590f, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(c7590f.m31415o(Date.class));
            }
            return null;
        }
    };
    private final AbstractC7584a0<Date> dateTypeAdapter;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private SqlTimestampTypeAdapter(AbstractC7584a0<Date> abstractC7584a0) {
        this.dateTypeAdapter = abstractC7584a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
    @Override // kg.AbstractC7584a0
    public Timestamp read(JsonReader jsonReader) {
        Date date = this.dateTypeAdapter.read(jsonReader);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
    @Override // kg.AbstractC7584a0
    public void write(JsonWriter jsonWriter, Timestamp timestamp) {
        this.dateTypeAdapter.write(jsonWriter, timestamp);
    }
}
