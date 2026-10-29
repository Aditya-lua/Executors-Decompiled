package com.google.gson.internal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jg.a0;
import jg.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class Excluder implements b0, Cloneable {
    public static final Excluder DEFAULT = new Excluder();
    private static final double IGNORE_VERSIONS = -1.0d;
    private List<jg.a> deserializationStrategies;
    private boolean requireExpose;
    private List<jg.a> serializationStrategies;
    private double version = IGNORE_VERSIONS;
    private int modifiers = 136;
    private boolean serializeInnerClasses = true;

    public Excluder() {
        List<jg.a> list = Collections.EMPTY_LIST;
        this.serializationStrategies = list;
        this.deserializationStrategies = list;
    }

    private static boolean isInnerClass(Class<?> cls) {
        return cls.isMemberClass() && !ReflectionHelper.isStatic(cls);
    }

    private boolean isValidSince(Since since) {
        if (since != null) {
            return this.version >= since.value();
        }
        return true;
    }

    private boolean isValidUntil(Until until) {
        if (until != null) {
            return this.version < until.value();
        }
        return true;
    }

    private boolean isValidVersion(Since since, Until until) {
        return isValidSince(since) && isValidUntil(until);
    }

    @Override // jg.b0
    public <T> a0<T> create(final jg.f fVar, final TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        final boolean zExcludeClass = excludeClass(rawType, true);
        final boolean zExcludeClass2 = excludeClass(rawType, false);
        if (zExcludeClass || zExcludeClass2) {
            return new a0<T>() { // from class: com.google.gson.internal.Excluder.1
                private volatile a0<T> delegate;

                private a0<T> delegate() {
                    a0<T> a0Var = this.delegate;
                    if (a0Var != null) {
                        return a0Var;
                    }
                    a0<T> a0VarP = fVar.p(Excluder.this, typeToken);
                    this.delegate = a0VarP;
                    return a0VarP;
                }

                @Override // jg.a0
                public T read(JsonReader jsonReader) throws IOException {
                    if (!zExcludeClass2) {
                        return delegate().read(jsonReader);
                    }
                    jsonReader.skipValue();
                    return null;
                }

                @Override // jg.a0
                public void write(JsonWriter jsonWriter, T t8) throws IOException {
                    if (zExcludeClass) {
                        jsonWriter.nullValue();
                    } else {
                        delegate().write(jsonWriter, t8);
                    }
                }
            };
        }
        return null;
    }

    public Excluder disableInnerClassSerialization() {
        Excluder excluderM64clone = m64clone();
        excluderM64clone.serializeInnerClasses = false;
        return excluderM64clone;
    }

    public boolean excludeClass(Class<?> cls, boolean z10) {
        if (this.version != IGNORE_VERSIONS && !isValidVersion((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return true;
        }
        if (!this.serializeInnerClasses && isInnerClass(cls)) {
            return true;
        }
        if (!z10 && !Enum.class.isAssignableFrom(cls) && ReflectionHelper.isAnonymousOrNonStaticLocal(cls)) {
            return true;
        }
        Iterator<jg.a> it = (z10 ? this.serializationStrategies : this.deserializationStrategies).iterator();
        while (it.hasNext()) {
            if (it.next().a(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean excludeField(Field field, boolean z10) {
        Expose expose;
        if ((this.modifiers & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.version != IGNORE_VERSIONS && !isValidVersion((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.requireExpose && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z10 ? expose.deserialize() : expose.serialize()))) || excludeClass(field.getType(), z10)) {
            return true;
        }
        List<jg.a> list = z10 ? this.serializationStrategies : this.deserializationStrategies;
        if (list.isEmpty()) {
            return false;
        }
        jg.b bVar = new jg.b(field);
        Iterator<jg.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b(bVar)) {
                return true;
            }
        }
        return false;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder excluderM64clone = m64clone();
        excluderM64clone.requireExpose = true;
        return excluderM64clone;
    }

    public Excluder withExclusionStrategy(jg.a aVar, boolean z10, boolean z11) {
        Excluder excluderM64clone = m64clone();
        if (z10) {
            ArrayList arrayList = new ArrayList(this.serializationStrategies);
            excluderM64clone.serializationStrategies = arrayList;
            arrayList.add(aVar);
        }
        if (z11) {
            ArrayList arrayList2 = new ArrayList(this.deserializationStrategies);
            excluderM64clone.deserializationStrategies = arrayList2;
            arrayList2.add(aVar);
        }
        return excluderM64clone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder excluderM64clone = m64clone();
        excluderM64clone.modifiers = 0;
        for (int i10 : iArr) {
            excluderM64clone.modifiers = i10 | excluderM64clone.modifiers;
        }
        return excluderM64clone;
    }

    public Excluder withVersion(double d10) {
        Excluder excluderM64clone = m64clone();
        excluderM64clone.version = d10;
        return excluderM64clone;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Excluder m64clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }
}
