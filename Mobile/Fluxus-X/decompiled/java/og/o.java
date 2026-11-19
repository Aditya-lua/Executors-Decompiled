package og;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import lg.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class o<T> extends a0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg.f f28192a;
    public final a0<T> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f28193c;

    public o(lg.f fVar, a0<T> a0Var, Type type) {
        this.f28192a = fVar;
        this.b = a0Var;
        this.f28193c = type;
    }

    public static Type a(Type type, Object obj) {
        if (obj != null) {
            return ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type;
        }
        return type;
    }

    public static boolean b(a0<?> a0Var) {
        a0<?> a0VarA;
        while ((a0Var instanceof m) && (a0VarA = ((m) a0Var).a()) != a0Var) {
            a0Var = a0VarA;
        }
        return a0Var instanceof l.c;
    }

    @Override // lg.a0
    public T read(tg.a aVar) {
        return this.b.read(aVar);
    }

    @Override // lg.a0
    public void write(tg.c cVar, T t8) {
        a0<T> a0VarM = this.b;
        Type typeA = a(this.f28193c, t8);
        if (typeA != this.f28193c) {
            a0VarM = this.f28192a.m(sg.a.b(typeA));
            if ((a0VarM instanceof l.c) && !b(this.b)) {
                a0VarM = this.b;
            }
        }
        a0VarM.write(cVar, t8);
    }
}
