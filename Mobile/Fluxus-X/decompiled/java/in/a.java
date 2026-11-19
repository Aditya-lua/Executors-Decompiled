package in;

import hn.h;
import hn.j;
import hn.m;
import hn.t;
import java.lang.Enum;
import java.util.Arrays;
import jn.c;

/* JADX INFO: loaded from: classes2.dex */
public final class a<T extends Enum<T>> extends h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<T> f19631a;
    public final String[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T[] f19632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m.b f19633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final T f19635f;

    public a(Class<T> cls, T t8, boolean z10) {
        this.f19631a = cls;
        this.f19635f = t8;
        this.f19634e = z10;
        try {
            T[] enumConstants = cls.getEnumConstants();
            this.f19632c = enumConstants;
            this.b = new String[enumConstants.length];
            int i10 = 0;
            while (true) {
                T[] tArr = this.f19632c;
                if (i10 >= tArr.length) {
                    this.f19633d = m.b.a(this.b);
                    return;
                } else {
                    String strName = tArr[i10].name();
                    this.b[i10] = c.n(strName, cls.getField(strName));
                    i10++;
                }
            }
        } catch (NoSuchFieldException e10) {
            throw new AssertionError("Missing field in " + cls.getName(), e10);
        }
    }

    public static <T extends Enum<T>> a<T> a(Class<T> cls) {
        return new a<>(cls, null, false);
    }

    @Override // hn.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T fromJson(m mVar) {
        int iK = mVar.K(this.f19633d);
        if (iK != -1) {
            return this.f19632c[iK];
        }
        String strX = mVar.x();
        if (this.f19634e) {
            if (mVar.w() == m.c.STRING) {
                mVar.Q();
                return this.f19635f;
            }
            throw new j("Expected a string but was " + mVar.w() + " at path " + strX);
        }
        throw new j("Expected one of " + Arrays.asList(this.b) + " but was " + mVar.s() + " at path " + strX);
    }

    @Override // hn.h
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void toJson(t tVar, T t8) {
        if (t8 == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        tVar.Q(this.b[t8.ordinal()]);
    }

    public a<T> d(T t8) {
        return new a<>(this.f19631a, t8, true);
    }

    public String toString() {
        return "EnumJsonAdapter(" + this.f19631a.getName() + ")";
    }
}
