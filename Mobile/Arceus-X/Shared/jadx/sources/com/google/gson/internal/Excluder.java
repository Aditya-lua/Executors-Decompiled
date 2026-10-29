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
import kg.AbstractC7584a0;
import kg.C7585b;
import kg.C7590f;
import kg.InterfaceC7583a;
import kg.InterfaceC7586b0;

/* JADX INFO: loaded from: classes2.dex */
public final class Excluder implements InterfaceC7586b0, Cloneable {
    public static final Excluder DEFAULT = new Excluder();
    private static final double IGNORE_VERSIONS = -1.0d;
    private List<InterfaceC7583a> deserializationStrategies;
    private boolean requireExpose;
    private List<InterfaceC7583a> serializationStrategies;
    private double version = IGNORE_VERSIONS;
    private int modifiers = 136;
    private boolean serializeInnerClasses = true;

    public Excluder() {
        List<InterfaceC7583a> list = Collections.EMPTY_LIST;
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

    @Override // kg.InterfaceC7586b0
    public <T> AbstractC7584a0<T> create(final C7590f c7590f, final TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        final boolean zExcludeClass = excludeClass(rawType, true);
        final boolean zExcludeClass2 = excludeClass(rawType, false);
        if (zExcludeClass || zExcludeClass2) {
            return new AbstractC7584a0<T>() { // from class: com.google.gson.internal.Excluder.1
                private volatile AbstractC7584a0<T> delegate;

                private AbstractC7584a0<T> delegate() {
                    AbstractC7584a0<T> abstractC7584a0 = this.delegate;
                    if (abstractC7584a0 != null) {
                        return abstractC7584a0;
                    }
                    AbstractC7584a0<T> abstractC7584a0M31416p = c7590f.m31416p(Excluder.this, typeToken);
                    this.delegate = abstractC7584a0M31416p;
                    return abstractC7584a0M31416p;
                }

                @Override // kg.AbstractC7584a0
                public T read(JsonReader jsonReader) throws IOException {
                    if (!zExcludeClass2) {
                        return delegate().read(jsonReader);
                    }
                    jsonReader.skipValue();
                    return null;
                }

                @Override // kg.AbstractC7584a0
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
        Excluder excluderM50801clone = m50801clone();
        excluderM50801clone.serializeInnerClasses = false;
        return excluderM50801clone;
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
        Iterator<InterfaceC7583a> it = (z10 ? this.serializationStrategies : this.deserializationStrategies).iterator();
        while (it.hasNext()) {
            if (it.next().m31388b(cls)) {
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
        List<InterfaceC7583a> list = z10 ? this.serializationStrategies : this.deserializationStrategies;
        if (list.isEmpty()) {
            return false;
        }
        C7585b c7585b = new C7585b(field);
        Iterator<InterfaceC7583a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().m31387a(c7585b)) {
                return true;
            }
        }
        return false;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder excluderM50801clone = m50801clone();
        excluderM50801clone.requireExpose = true;
        return excluderM50801clone;
    }

    public Excluder withExclusionStrategy(InterfaceC7583a interfaceC7583a, boolean z10, boolean z11) {
        Excluder excluderM50801clone = m50801clone();
        if (z10) {
            ArrayList arrayList = new ArrayList(this.serializationStrategies);
            excluderM50801clone.serializationStrategies = arrayList;
            arrayList.add(interfaceC7583a);
        }
        if (z11) {
            ArrayList arrayList2 = new ArrayList(this.deserializationStrategies);
            excluderM50801clone.deserializationStrategies = arrayList2;
            arrayList2.add(interfaceC7583a);
        }
        return excluderM50801clone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder excluderM50801clone = m50801clone();
        excluderM50801clone.modifiers = 0;
        for (int i10 : iArr) {
            excluderM50801clone.modifiers = i10 | excluderM50801clone.modifiers;
        }
        return excluderM50801clone;
    }

    public Excluder withVersion(double d10) {
        Excluder excluderM50801clone = m50801clone();
        excluderM50801clone.version = d10;
        return excluderM50801clone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Excluder m50801clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }
}
