package com.google.gson.internal.bind;

import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Objects;
import kg.AbstractC7584a0;
import kg.AbstractC7596l;
import kg.C7590f;
import kg.InterfaceC7586b0;
import kg.InterfaceC7594j;
import kg.InterfaceC7595k;
import kg.InterfaceC7603s;
import kg.InterfaceC7604t;

/* JADX INFO: loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {
    private final TreeTypeAdapter<T>.GsonContextImpl context;
    private volatile AbstractC7584a0<T> delegate;
    private final InterfaceC7595k<T> deserializer;
    final C7590f gson;
    private final boolean nullSafe;
    private final InterfaceC7604t<T> serializer;
    private final InterfaceC7586b0 skipPastForGetDelegateAdapter;
    private final TypeToken<T> typeToken;

    public final class GsonContextImpl implements InterfaceC7603s, InterfaceC7594j {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private GsonContextImpl() {
        }

        public <R> R deserialize(AbstractC7596l abstractC7596l, Type type) {
            return (R) TreeTypeAdapter.this.gson.m31413m(abstractC7596l, type);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AbstractC7596l serialize(Object obj) {
            return TreeTypeAdapter.this.gson.m31403A(obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public AbstractC7596l serialize(Object obj, Type type) {
            return TreeTypeAdapter.this.gson.m31404B(obj, type);
        }
    }

    public static final class SingleTypeFactory implements InterfaceC7586b0 {
        private final InterfaceC7595k<?> deserializer;
        private final TypeToken<?> exactType;
        private final Class<?> hierarchyType;
        private final boolean matchRawType;
        private final InterfaceC7604t<?> serializer;

        public SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z10, Class<?> cls) {
            InterfaceC7604t<?> interfaceC7604t = obj instanceof InterfaceC7604t ? (InterfaceC7604t) obj : null;
            this.serializer = interfaceC7604t;
            InterfaceC7595k<?> interfaceC7595k = obj instanceof InterfaceC7595k ? (InterfaceC7595k) obj : null;
            this.deserializer = interfaceC7595k;
            if (interfaceC7604t != null || interfaceC7595k != null) {
                this.exactType = typeToken;
                this.matchRawType = z10;
                this.hierarchyType = cls;
            } else {
                Objects.requireNonNull(obj);
                throw new IllegalArgumentException("Type adapter " + obj.getClass().getName() + " must implement JsonSerializer or JsonDeserializer");
            }
        }

        @Override // kg.InterfaceC7586b0
        public <T> AbstractC7584a0<T> create(C7590f c7590f, TypeToken<T> typeToken) {
            boolean zIsAssignableFrom;
            TypeToken<?> typeToken2 = this.exactType;
            if (typeToken2 != null) {
                zIsAssignableFrom = typeToken2.equals(typeToken) || (this.matchRawType && this.exactType.getType() == typeToken.getRawType());
            } else {
                zIsAssignableFrom = this.hierarchyType.isAssignableFrom(typeToken.getRawType());
            }
            if (zIsAssignableFrom) {
                return new TreeTypeAdapter(this.serializer, this.deserializer, c7590f, typeToken, this);
            }
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TreeTypeAdapter(InterfaceC7604t<T> interfaceC7604t, InterfaceC7595k<T> interfaceC7595k, C7590f c7590f, TypeToken<T> typeToken, InterfaceC7586b0 interfaceC7586b0, boolean z10) {
        this.context = new GsonContextImpl();
        this.serializer = interfaceC7604t;
        this.deserializer = interfaceC7595k;
        this.gson = c7590f;
        this.typeToken = typeToken;
        this.skipPastForGetDelegateAdapter = interfaceC7586b0;
        this.nullSafe = z10;
    }

    private AbstractC7584a0<T> delegate() {
        AbstractC7584a0<T> abstractC7584a0 = this.delegate;
        if (abstractC7584a0 != null) {
            return abstractC7584a0;
        }
        AbstractC7584a0<T> abstractC7584a0M31416p = this.gson.m31416p(this.skipPastForGetDelegateAdapter, this.typeToken);
        this.delegate = abstractC7584a0M31416p;
        return abstractC7584a0M31416p;
    }

    public static InterfaceC7586b0 newFactory(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, false, null);
    }

    public static InterfaceC7586b0 newFactoryWithMatchRawType(TypeToken<?> typeToken, Object obj) {
        return new SingleTypeFactory(obj, typeToken, typeToken.getType() == typeToken.getRawType(), null);
    }

    public static InterfaceC7586b0 newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public AbstractC7584a0<T> getSerializationDelegate() {
        return this.serializer != null ? this : delegate();
    }

    @Override // kg.AbstractC7584a0
    public T read(JsonReader jsonReader) {
        if (this.deserializer == null) {
            return delegate().read(jsonReader);
        }
        AbstractC7596l abstractC7596l = Streams.parse(jsonReader);
        if (this.nullSafe && abstractC7596l.m31460p()) {
            return null;
        }
        return this.deserializer.m31455a(abstractC7596l, this.typeToken.getType(), this.context);
    }

    @Override // kg.AbstractC7584a0
    public void write(JsonWriter jsonWriter, T t8) throws IOException {
        InterfaceC7604t<T> interfaceC7604t = this.serializer;
        if (interfaceC7604t == null) {
            delegate().write(jsonWriter, t8);
        } else if (this.nullSafe && t8 == null) {
            jsonWriter.nullValue();
        } else {
            Streams.write(interfaceC7604t.m31487a(t8, this.typeToken.getType(), this.context), jsonWriter);
        }
    }

    public TreeTypeAdapter(InterfaceC7604t<T> interfaceC7604t, InterfaceC7595k<T> interfaceC7595k, C7590f c7590f, TypeToken<T> typeToken, InterfaceC7586b0 interfaceC7586b0) {
        this(interfaceC7604t, interfaceC7595k, c7590f, typeToken, interfaceC7586b0, true);
    }
}
