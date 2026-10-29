package be;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: be.f0 */
/* JADX INFO: loaded from: classes2.dex */
public class C1321f0 {

    /* JADX INFO: renamed from: a */
    public final Object f5352a;

    /* JADX INFO: renamed from: b */
    public final Field f5353b;

    /* JADX INFO: renamed from: c */
    public final Class f5354c;

    public C1321f0(Object obj, Field field, Class cls) {
        this.f5352a = obj;
        this.f5353b = field;
        this.f5354c = cls;
    }

    /* JADX INFO: renamed from: a */
    public final Object m7124a() {
        try {
            return this.f5354c.cast(this.f5353b.get(this.f5352a));
        } catch (Exception e10) {
            throw new C1327h0(String.format("Failed to get value of field %s of type %s on object of type %s", this.f5353b.getName(), this.f5352a.getClass().getName(), this.f5354c.getName()), e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public final Field m7125b() {
        return this.f5353b;
    }

    /* JADX INFO: renamed from: c */
    public final void m7126c(Object obj) {
        try {
            this.f5353b.set(this.f5352a, obj);
        } catch (Exception e10) {
            throw new C1327h0(String.format("Failed to set value of field %s of type %s on object of type %s", this.f5353b.getName(), this.f5352a.getClass().getName(), this.f5354c.getName()), e10);
        }
    }
}
