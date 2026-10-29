package com.google.gson.internal.bind;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.GsonTypes;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import kg.AbstractC7584a0;
import kg.AbstractC7596l;
import kg.C7590f;
import kg.C7602r;
import kg.C7605u;
import kg.InterfaceC7586b0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements InterfaceC7586b0 {
    final boolean complexMapKeySerialization;
    private final ConstructorConstructor constructorConstructor;

    public final class Adapter<K, V> extends AbstractC7584a0<Map<K, V>> {
        private final ObjectConstructor<? extends Map<K, V>> constructor;
        private final AbstractC7584a0<K> keyTypeAdapter;
        private final AbstractC7584a0<V> valueTypeAdapter;

        public Adapter(AbstractC7584a0<K> abstractC7584a0, AbstractC7584a0<V> abstractC7584a1, ObjectConstructor<? extends Map<K, V>> objectConstructor) {
            this.keyTypeAdapter = abstractC7584a0;
            this.valueTypeAdapter = abstractC7584a1;
            this.constructor = objectConstructor;
        }

        private String keyToString(AbstractC7596l abstractC7596l) {
            if (!abstractC7596l.m31462u()) {
                if (abstractC7596l.m31460p()) {
                    return "null";
                }
                throw new AssertionError();
            }
            C7602r c7602rM31458h = abstractC7596l.m31458h();
            if (c7602rM31458h.m31482C()) {
                return String.valueOf(c7602rM31458h.mo31450k());
            }
            if (c7602rM31458h.m31481A()) {
                return Boolean.toString(c7602rM31458h.mo31445b());
            }
            if (c7602rM31458h.m31483D()) {
                return c7602rM31458h.mo31451l();
            }
            throw new AssertionError();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
        @Override // kg.AbstractC7584a0
        public Map<K, V> read(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> mapConstruct = this.constructor.construct();
            if (jsonTokenPeek != JsonToken.BEGIN_ARRAY) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(jsonReader);
                    K k10 = this.keyTypeAdapter.read(jsonReader);
                    if (mapConstruct.put(k10, this.valueTypeAdapter.read(jsonReader)) != null) {
                        throw new C7605u("duplicate key: " + k10);
                    }
                }
                jsonReader.endObject();
                return mapConstruct;
            }
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                jsonReader.beginArray();
                K k11 = this.keyTypeAdapter.read(jsonReader);
                if (mapConstruct.put(k11, this.valueTypeAdapter.read(jsonReader)) != null) {
                    throw new C7605u("duplicate key: " + k11);
                }
                jsonReader.endArray();
            }
            jsonReader.endArray();
            return mapConstruct;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
        @Override // kg.AbstractC7584a0
        public void write(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.this.complexMapKeySerialization) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.valueTypeAdapter.write(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                AbstractC7596l jsonTree = this.keyTypeAdapter.toJsonTree(entry2.getKey());
                arrayList.add(jsonTree);
                arrayList2.add(entry2.getValue());
                z10 |= jsonTree.m31459m() || jsonTree.m31461t();
            }
            if (!z10) {
                jsonWriter.beginObject();
                int size = arrayList.size();
                while (i10 < size) {
                    jsonWriter.name(keyToString((AbstractC7596l) arrayList.get(i10)));
                    this.valueTypeAdapter.write(jsonWriter, (V) arrayList2.get(i10));
                    i10++;
                }
                jsonWriter.endObject();
                return;
            }
            jsonWriter.beginArray();
            int size2 = arrayList.size();
            while (i10 < size2) {
                jsonWriter.beginArray();
                Streams.write((AbstractC7596l) arrayList.get(i10), jsonWriter);
                this.valueTypeAdapter.write(jsonWriter, (V) arrayList2.get(i10));
                jsonWriter.endArray();
                i10++;
            }
            jsonWriter.endArray();
        }
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor, boolean z10) {
        this.constructorConstructor = constructorConstructor;
        this.complexMapKeySerialization = z10;
    }

    private AbstractC7584a0<?> getKeyAdapter(C7590f c7590f, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.BOOLEAN_AS_STRING : c7590f.m31414n(TypeToken.get(type));
    }

    @Override // kg.InterfaceC7586b0
    public <T> AbstractC7584a0<T> create(C7590f c7590f, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] mapKeyAndValueTypes = GsonTypes.getMapKeyAndValueTypes(type, rawType);
        Type type2 = mapKeyAndValueTypes[0];
        Type type3 = mapKeyAndValueTypes[1];
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(c7590f, getKeyAdapter(c7590f, type2), type2), new TypeAdapterRuntimeTypeWrapper(c7590f, c7590f.m31414n(TypeToken.get(type3)), type3), this.constructorConstructor.get(typeToken, false));
    }
}
