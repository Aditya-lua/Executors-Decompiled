package de;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12191a;
    public final Field b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f12192c;

    public f0(Object obj, Field field, Class cls) {
        this.f12191a = obj;
        this.b = field;
        this.f12192c = cls;
    }

    public final Object a() {
        try {
            return this.f12192c.cast(this.b.get(this.f12191a));
        } catch (Exception e10) {
            throw new h0(String.format("Failed to get value of field %s of type %s on object of type %s", this.b.getName(), this.f12191a.getClass().getName(), this.f12192c.getName()), e10);
        }
    }

    public final Field b() {
        return this.b;
    }

    public final void c(Object obj) {
        try {
            this.b.set(this.f12191a, obj);
        } catch (Exception e10) {
            throw new h0(String.format("Failed to set value of field %s of type %s on object of type %s", this.b.getName(), this.f12191a.getClass().getName(), this.f12192c.getName()), e10);
        }
    }
}
