package p495vm;

import java.lang.Enum;
import java.util.Arrays;
import p471um.AbstractC11873h;
import p471um.AbstractC11878m;
import p471um.AbstractC11885t;
import p471um.C11875j;
import p522wm.C12494c;

/* JADX INFO: renamed from: vm.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C12231a<T extends Enum<T>> extends AbstractC11873h<T> {

    /* JADX INFO: renamed from: a */
    public final Class<T> f43145a;

    /* JADX INFO: renamed from: b */
    public final String[] f43146b;

    /* JADX INFO: renamed from: c */
    public final T[] f43147c;

    /* JADX INFO: renamed from: d */
    public final AbstractC11878m.b f43148d;

    /* JADX INFO: renamed from: e */
    public final boolean f43149e;

    /* JADX INFO: renamed from: f */
    public final T f43150f;

    public C12231a(Class<T> cls, T t8, boolean z10) {
        this.f43145a = cls;
        this.f43150f = t8;
        this.f43149e = z10;
        try {
            T[] enumConstants = cls.getEnumConstants();
            this.f43147c = enumConstants;
            this.f43146b = new String[enumConstants.length];
            int i10 = 0;
            while (true) {
                T[] tArr = this.f43147c;
                if (i10 >= tArr.length) {
                    this.f43148d = AbstractC11878m.b.m44343a(this.f43146b);
                    return;
                } else {
                    String strName = tArr[i10].name();
                    this.f43146b[i10] = C12494c.m46800m(strName, cls.getField(strName));
                    i10++;
                }
            }
        } catch (NoSuchFieldException e10) {
            throw new AssertionError("Missing field in " + cls.getName(), e10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Enum<T>> C12231a<T> m45360a(Class<T> cls) {
        return new C12231a<>(cls, null, false);
    }

    /* JADX DEBUG: Method merged with bridge method: fromJson(Lum/m;)Ljava/lang/Object; */
    @Override // p471um.AbstractC11873h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T fromJson(AbstractC11878m abstractC11878m) {
        int iMo44317H = abstractC11878m.mo44317H(this.f43148d);
        if (iMo44317H != -1) {
            return this.f43147c[iMo44317H];
        }
        String path = abstractC11878m.getPath();
        if (this.f43149e) {
            if (abstractC11878m.mo44339u() == AbstractC11878m.c.STRING) {
                abstractC11878m.mo44321P();
                return this.f43150f;
            }
            throw new C11875j("Expected a string but was " + abstractC11878m.mo44339u() + " at path " + path);
        }
        throw new C11875j("Expected one of " + Arrays.asList(this.f43146b) + " but was " + abstractC11878m.mo44338r() + " at path " + path);
    }

    /* JADX DEBUG: Method merged with bridge method: toJson(Lum/t;Ljava/lang/Object;)V */
    @Override // p471um.AbstractC11873h
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void toJson(AbstractC11885t abstractC11885t, T t8) {
        if (t8 == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        abstractC11885t.mo44367M(this.f43146b[t8.ordinal()]);
    }

    /* JADX INFO: renamed from: d */
    public C12231a<T> m45363d(T t8) {
        return new C12231a<>(this.f43145a, t8, true);
    }

    public String toString() {
        return "EnumJsonAdapter(" + this.f43145a.getName() + ")";
    }
}
