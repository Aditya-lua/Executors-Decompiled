package og;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lg.a0;
import lg.b0;
import lg.y;
import lg.z;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends a0<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f28156c = b(y.f22152a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg.f f28157a;
    public final z b;

    public class a implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z f28158a;

        public a(z zVar) {
            this.f28158a = zVar;
        }

        @Override // lg.b0
        public <T> a0<T> create(lg.f fVar, sg.a<T> aVar) {
            a aVar2 = null;
            if (aVar.c() == Object.class) {
                return new k(fVar, this.f28158a, aVar2);
            }
            return null;
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28159a;

        static {
            int[] iArr = new int[tg.b.values().length];
            f28159a = iArr;
            try {
                iArr[tg.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28159a[tg.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28159a[tg.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28159a[tg.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28159a[tg.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28159a[tg.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public /* synthetic */ k(lg.f fVar, z zVar, a aVar) {
        this(fVar, zVar);
    }

    public static b0 a(z zVar) {
        return zVar == y.f22152a ? f28156c : b(zVar);
    }

    private static b0 b(z zVar) {
        return new a(zVar);
    }

    public final Object c(tg.a aVar, tg.b bVar) throws IOException {
        int i10 = b.f28159a[bVar.ordinal()];
        if (i10 == 3) {
            return aVar.N();
        }
        if (i10 == 4) {
            return this.b.a(aVar);
        }
        if (i10 == 5) {
            return Boolean.valueOf(aVar.w());
        }
        if (i10 == 6) {
            aVar.K();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    public final Object d(tg.a aVar, tg.b bVar) throws IOException {
        int i10 = b.f28159a[bVar.ordinal()];
        if (i10 == 1) {
            aVar.b();
            return new ArrayList();
        }
        if (i10 != 2) {
            return null;
        }
        aVar.c();
        return new ng.b0();
    }

    @Override // lg.a0
    public Object read(tg.a aVar) throws IOException {
        tg.b bVarQ = aVar.Q();
        Object objD = d(aVar, bVarQ);
        if (objD == null) {
            return c(aVar, bVarQ);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.p()) {
                String strE = objD instanceof Map ? aVar.E() : null;
                tg.b bVarQ2 = aVar.Q();
                Object objD2 = d(aVar, bVarQ2);
                boolean z10 = objD2 != null;
                if (objD2 == null) {
                    objD2 = c(aVar, bVarQ2);
                }
                if (objD instanceof List) {
                    ((List) objD).add(objD2);
                } else {
                    ((Map) objD).put(strE, objD2);
                }
                if (z10) {
                    arrayDeque.addLast(objD);
                    objD = objD2;
                }
            } else {
                if (objD instanceof List) {
                    aVar.g();
                } else {
                    aVar.h();
                }
                if (arrayDeque.isEmpty()) {
                    return objD;
                }
                objD = arrayDeque.removeLast();
            }
        }
    }

    @Override // lg.a0
    public void write(tg.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.s();
            return;
        }
        a0 a0VarL = this.f28157a.l(obj.getClass());
        if (!(a0VarL instanceof k)) {
            a0VarL.write(cVar, obj);
        } else {
            cVar.e();
            cVar.h();
        }
    }

    public k(lg.f fVar, z zVar) {
        this.f28157a = fVar;
        this.b = zVar;
    }
}
