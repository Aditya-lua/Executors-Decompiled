package og;

import java.io.IOException;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lg.a0;
import lg.b0;

/* JADX INFO: loaded from: classes2.dex */
public class d<T extends Enum<T>> extends a0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f28129d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, T> f28130a;
    public final Map<String, T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<T, String> f28131c;

    public class a implements b0 {
        @Override // lg.b0
        public <T> a0<T> create(lg.f fVar, sg.a<T> aVar) {
            Class<? super T> clsC = aVar.c();
            a aVar2 = null;
            if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
                return null;
            }
            if (!clsC.isEnum()) {
                clsC = clsC.getSuperclass();
            }
            return new d(clsC, aVar2);
        }
    }

    public /* synthetic */ d(Class cls, a aVar) {
        this(cls);
    }

    @Override // lg.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T read(tg.a aVar) throws IOException {
        if (aVar.Q() == tg.b.NULL) {
            aVar.K();
            return null;
        }
        String strN = aVar.N();
        T t8 = this.f28130a.get(strN);
        return t8 == null ? this.b.get(strN) : t8;
    }

    @Override // lg.a0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(tg.c cVar, T t8) throws IOException {
        cVar.Y(t8 == null ? null : this.f28131c.get(t8));
    }

    public d(Class<T> cls) {
        this.f28130a = new HashMap();
        this.b = new HashMap();
        this.f28131c = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i10 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i10] = field;
                    i10++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i10);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r10 = (Enum) field2.get(null);
                String strName = r10.name();
                String string = r10.toString();
                mg.c cVar = (mg.c) field2.getAnnotation(mg.c.class);
                if (cVar != null) {
                    strName = cVar.value();
                    for (String str : cVar.alternate()) {
                        this.f28130a.put(str, (T) r10);
                    }
                }
                this.f28130a.put(strName, (T) r10);
                this.b.put(string, (T) r10);
                this.f28131c.put((T) r10, strName);
            }
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        }
    }
}
