package com.withpersona.sdk2.inquiry.tracking.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import um.h;
import um.m;
import um.t;
import um.w;
import wm.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSizeJsonAdapter;", "Lum/h;", "Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;", "Lum/w;", "moshi", "<init>", "(Lum/w;)V", "", "toString", "()Ljava/lang/String;", "Lum/m;", "reader", "fromJson", "(Lum/m;)Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;", "Lum/t;", "writer", "value_", "", "toJson", "(Lum/t;Lcom/withpersona/sdk2/inquiry/tracking/model/CameraSize;)V", "Lum/m$b;", "options", "Lum/m$b;", "", "nullableIntAdapter", "Lum/h;", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CameraSizeJsonAdapter extends h<CameraSize> {

    @Nullable
    private volatile Constructor<CameraSize> constructorRef;

    @NotNull
    private final h<Integer> nullableIntAdapter;

    @NotNull
    private final m.b options;

    public CameraSizeJsonAdapter(@NotNull w wVar) {
        wVar.getClass();
        m.b bVarA = m.b.a("width", "height");
        bVarA.getClass();
        this.options = bVarA;
        this.nullableIntAdapter = b.a(wVar, Integer.class, "width");
    }

    @NotNull
    public String toString() {
        return a.a("GeneratedJsonAdapter(CameraSize)", 32);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // um.h
    @NotNull
    public CameraSize fromJson(@NotNull m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        reader.getClass();
        reader.b();
        Integer numFromJson = null;
        Integer numFromJson2 = null;
        int i10 = -1;
        while (reader.f()) {
            int iF = reader.F(this.options);
            if (iF == -1) {
                reader.M();
                reader.P();
            } else if (iF == 0) {
                numFromJson = this.nullableIntAdapter.fromJson(reader);
                i10 &= -2;
            } else if (iF == 1) {
                numFromJson2 = this.nullableIntAdapter.fromJson(reader);
                i10 &= -3;
            }
        }
        reader.d();
        if (i10 == -4) {
            return new CameraSize(numFromJson, numFromJson2);
        }
        Constructor<CameraSize> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = CameraSize.class.getDeclaredConstructor(Integer.class, Integer.class, Integer.TYPE, c.f34445c);
            this.constructorRef = declaredConstructor;
            declaredConstructor.getClass();
        }
        CameraSize cameraSizeNewInstance = declaredConstructor.newInstance(numFromJson, numFromJson2, Integer.valueOf(i10), null);
        cameraSizeNewInstance.getClass();
        return cameraSizeNewInstance;
    }

    @Override // um.h
    public void toJson(@NotNull t writer, @Nullable CameraSize value_) {
        writer.getClass();
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.n("width");
        this.nullableIntAdapter.toJson(writer, value_.getWidth());
        writer.n("height");
        this.nullableIntAdapter.toJson(writer, value_.getHeight());
        writer.g();
    }
}
