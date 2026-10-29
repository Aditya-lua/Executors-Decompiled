package com.google.gson.internal.bind;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.GsonTypes;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import kg.AbstractC7584a0;
import kg.C7590f;
import kg.InterfaceC7586b0;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements InterfaceC7586b0 {
    private final ConstructorConstructor constructorConstructor;

    public static final class Adapter<E> extends AbstractC7584a0<Collection<E>> {
        private final ObjectConstructor<? extends Collection<E>> constructor;
        private final AbstractC7584a0<E> elementTypeAdapter;

        public Adapter(AbstractC7584a0<E> abstractC7584a0, ObjectConstructor<? extends Collection<E>> objectConstructor) {
            this.elementTypeAdapter = abstractC7584a0;
            this.constructor = objectConstructor;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object; */
        @Override // kg.AbstractC7584a0
        public Collection<E> read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> collectionConstruct = this.constructor.construct();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collectionConstruct.add(this.elementTypeAdapter.read(jsonReader));
            }
            jsonReader.endArray();
            return collectionConstruct;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V */
        @Override // kg.AbstractC7584a0
        public void write(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.elementTypeAdapter.write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor) {
        this.constructorConstructor = constructorConstructor;
    }

    @Override // kg.InterfaceC7586b0
    public <T> AbstractC7584a0<T> create(C7590f c7590f, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type collectionElementType = GsonTypes.getCollectionElementType(type, rawType);
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(c7590f, c7590f.m31414n(TypeToken.get(collectionElementType)), collectionElementType), this.constructorConstructor.get(typeToken, false));
    }
}
