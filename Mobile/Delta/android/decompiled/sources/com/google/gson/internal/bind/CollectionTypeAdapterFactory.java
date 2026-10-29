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
import jg.a0;
import jg.b0;
import jg.f;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements b0 {
    private final ConstructorConstructor constructorConstructor;

    public static final class Adapter<E> extends a0<Collection<E>> {
        private final ObjectConstructor<? extends Collection<E>> constructor;
        private final a0<E> elementTypeAdapter;

        public Adapter(a0<E> a0Var, ObjectConstructor<? extends Collection<E>> objectConstructor) {
            this.elementTypeAdapter = a0Var;
            this.constructor = objectConstructor;
        }

        @Override // jg.a0
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

        @Override // jg.a0
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

    @Override // jg.b0
    public <T> a0<T> create(f fVar, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type collectionElementType = GsonTypes.getCollectionElementType(type, rawType);
        return new Adapter(new TypeAdapterRuntimeTypeWrapper(fVar, fVar.n(TypeToken.get(collectionElementType)), collectionElementType), this.constructorConstructor.get(typeToken, false));
    }
}
