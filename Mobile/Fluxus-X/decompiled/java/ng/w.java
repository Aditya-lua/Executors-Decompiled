package ng;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements lg.b0, Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w f25567g = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f25568a = -1.0d;
    public int b = 136;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25569c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<lg.a> f25571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<lg.a> f25572f;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends lg.a0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile lg.a0<T> f25573a;
        public final /* synthetic */ boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f25574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ lg.f f25575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ sg.a f25576e;

        public a(boolean z10, boolean z11, lg.f fVar, sg.a aVar) {
            this.b = z10;
            this.f25574c = z11;
            this.f25575d = fVar;
            this.f25576e = aVar;
        }

        public final lg.a0<T> a() {
            lg.a0<T> a0Var = this.f25573a;
            if (a0Var != null) {
                return a0Var;
            }
            lg.a0<T> a0VarN = this.f25575d.n(w.this, this.f25576e);
            this.f25573a = a0VarN;
            return a0VarN;
        }

        @Override // lg.a0
        public T read(tg.a aVar) throws IOException {
            if (!this.b) {
                return a().read(aVar);
            }
            aVar.n0();
            return null;
        }

        @Override // lg.a0
        public void write(tg.c cVar, T t8) throws IOException {
            if (this.f25574c) {
                cVar.s();
            } else {
                a().write(cVar, t8);
            }
        }
    }

    public w() {
        List<lg.a> list = Collections.EMPTY_LIST;
        this.f25571e = list;
        this.f25572f = list;
    }

    public static boolean e(Class<?> cls) {
        return cls.isMemberClass() && !qg.a.n(cls);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public w clone() {
        try {
            return (w) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean b(Class<?> cls, boolean z10) {
        if (this.f25568a != -1.0d && !k((mg.d) cls.getAnnotation(mg.d.class), (mg.e) cls.getAnnotation(mg.e.class))) {
            return true;
        }
        if (!this.f25569c && e(cls)) {
            return true;
        }
        if (!z10 && !Enum.class.isAssignableFrom(cls) && qg.a.l(cls)) {
            return true;
        }
        Iterator<lg.a> it = (z10 ? this.f25571e : this.f25572f).iterator();
        while (it.hasNext()) {
            if (it.next().a(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean c(Field field, boolean z10) {
        mg.a aVar;
        if ((this.b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f25568a != -1.0d && !k((mg.d) field.getAnnotation(mg.d.class), (mg.e) field.getAnnotation(mg.e.class))) || field.isSynthetic()) {
            return true;
        }
        if ((this.f25570d && ((aVar = (mg.a) field.getAnnotation(mg.a.class)) == null || (!z10 ? aVar.deserialize() : aVar.serialize()))) || b(field.getType(), z10)) {
            return true;
        }
        List<lg.a> list = z10 ? this.f25571e : this.f25572f;
        if (list.isEmpty()) {
            return false;
        }
        lg.b bVar = new lg.b(field);
        Iterator<lg.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b(bVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // lg.b0
    public <T> lg.a0<T> create(lg.f fVar, sg.a<T> aVar) {
        Class<? super T> clsC = aVar.c();
        boolean zB = b(clsC, true);
        boolean zB2 = b(clsC, false);
        if (zB || zB2) {
            return new a(zB2, zB, fVar, aVar);
        }
        return null;
    }

    public final boolean f(mg.d dVar) {
        if (dVar != null) {
            return this.f25568a >= dVar.value();
        }
        return true;
    }

    public final boolean i(mg.e eVar) {
        if (eVar != null) {
            return this.f25568a < eVar.value();
        }
        return true;
    }

    public final boolean k(mg.d dVar, mg.e eVar) {
        return f(dVar) && i(eVar);
    }
}
