package com.google.gson.internal.bind;

import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Objects;
import jg.a0;
import jg.b0;
import jg.f;
import jg.j;
import jg.k;
import jg.l;
import jg.s;
import jg.t;

/* JADX INFO: loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {
    private final TreeTypeAdapter<T>.GsonContextImpl context;
    private volatile a0<T> delegate;
    private final k<T> deserializer;
    final f gson;
    private final boolean nullSafe;
    private final t<T> serializer;
    private final b0 skipPastForGetDelegateAdapter;
    private final TypeToken<T> typeToken;

    public final class GsonContextImpl implements s, j {
        private GsonContextImpl() {
        }

        public <R> R deserialize(l lVar, Type type) {
            return (R) TreeTypeAdapter.this.gson.m(lVar, type);
        }

        public l serialize(Object obj) {
            return TreeTypeAdapter.this.gson.A(obj);
        }

        public l serialize(Object obj, Type type) {
            return TreeTypeAdapter.this.gson.B(obj, type);
        }
    }

    public static final class SingleTypeFactory implements b0 {
        private final k<?> deserializer;
        private final TypeToken<?> exactType;
        private final Class<?> hierarchyType;
        private final boolean matchRawType;
        private final t<?> serializer;

        public SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z10, Class<?> cls) {
            t<?> tVar = obj instanceof t ? (t) obj : null;
            this.serializer = tVar;
            k<?> kVar = obj instanceof k ? (k) obj : null;
            this.deserializer = kVar;
            if (tVar != null || kVar != null) {
                this.exactType = typeToken;
                this.matchRawType = z10;
                this.hierarchyType = cls;
            } else {
                Objects.requireNonNull(obj);
                throw new IllegalArgumentException("Type adapter " + obj.getClass().getName() + " must implement JsonSerializer or JsonDeserializer");
            }
        }

        @Override // jg.b0
        public <T> a0<T> create(f fVar, TypeToken<T> typeToken) {
            boolean zIsAssignableFrom;
            TypeToken<?> typeToken2 = this.exactType;
            if (typeToken2 != null) {
                zIsAssignableFrom = typeToken2.equals(typeToken) || (this.matchRawType && this.exactType.getType() == typeToken.getRawType());
            } else {
                zIsAssignableFrom = this.hierarchyType.isAssignableFrom(typeToken.getRawType());
            }
            if (zIsAssignableFrom) {
                return new TreeTypeAdapter(this.serializer, this.deserializer, fVar, typeToken, this);
            }
            return null;
        }
    }

    public TreeTypeAdapter(t<T> tVar, k<T> kVar, f fVar, TypeToken<T> typeToken, b0 b0Var, boolean z10) {
        this.context = new GsonContextImpl();
        this.serializer = tVar;
        this.deserializer = kVar;
        this.gson = fVar;
        this.typeToken = typeToken;
        this.skipPastForGetDelegateAdapter = b0Var;
        this.nullSafe = z10;
    }

    private a0<T> delegate() {
        a0<T> a0Var = this.delegate;
        if (a0Var != null) {
            return a0Var;
        }
        a0<T> a0VarP = this.gson.p(this.skipPastForGetDelegateAdapter, this.typeToken);
        this.delegate = a0VarP;
        return a0VarP;
    }

    public static b0 newFactory(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, false, null);
    }

    public static b0 newFactoryWithMatchRawType(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType(), null);
    }

    public static b0 newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public a0<T> getSerializationDelegate() {
        return this.serializer != null ? this : delegate();
    }

    @Override // jg.a0
    public T read(JsonReader jsonReader) {
        if (this.deserializer == null) {
            return delegate().read(jsonReader);
        }
        l lVar = Streams.parse(jsonReader);
        if (this.nullSafe && lVar.p()) {
            return null;
        }
        return this.deserializer.a(lVar, this.typeToken.getType(), this.context);
    }

    @Override // jg.a0
    public void write(JsonWriter jsonWriter, T t8) throws IOException {
        t<T> tVar = this.serializer;
        if (tVar == null) {
            delegate().write(jsonWriter, t8);
        } else if (this.nullSafe && t8 == null) {
            jsonWriter.nullValue();
        } else {
            Streams.write(tVar.a(t8, this.typeToken.getType(), this.context), jsonWriter);
        }
    }

    public TreeTypeAdapter(t<T> tVar, k<T> kVar, f fVar, TypeToken<T> typeToken, b0 b0Var) {
        this(tVar, kVar, fVar, typeToken, b0Var, true);
    }
}
