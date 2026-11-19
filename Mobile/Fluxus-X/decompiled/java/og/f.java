package og;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
import lg.a0;
import lg.r;

/* JADX INFO: loaded from: classes2.dex */
public class f extends a0<lg.l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f28135a = new f();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28136a;

        static {
            int[] iArr = new int[tg.b.values().length];
            f28136a = iArr;
            try {
                iArr[tg.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28136a[tg.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28136a[tg.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28136a[tg.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28136a[tg.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28136a[tg.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private f() {
    }

    private lg.l b(tg.a aVar, tg.b bVar) throws IOException {
        int i10 = a.f28136a[bVar.ordinal()];
        if (i10 == 3) {
            return new r(aVar.N());
        }
        if (i10 == 4) {
            return new r(new ng.a0(aVar.N()));
        }
        if (i10 == 5) {
            return new r(Boolean.valueOf(aVar.w()));
        }
        if (i10 == 6) {
            aVar.K();
            return lg.n.f22140a;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    private lg.l c(tg.a aVar, tg.b bVar) throws IOException {
        int i10 = a.f28136a[bVar.ordinal()];
        if (i10 == 1) {
            aVar.b();
            return new lg.i();
        }
        if (i10 != 2) {
            return null;
        }
        aVar.c();
        return new lg.o();
    }

    @Override // lg.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public lg.l read(tg.a aVar) throws IOException {
        if (aVar instanceof g) {
            return ((g) aVar).z0();
        }
        tg.b bVarQ = aVar.Q();
        lg.l lVarC = c(aVar, bVarQ);
        if (lVarC == null) {
            return b(aVar, bVarQ);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.p()) {
                String strE = lVarC instanceof lg.o ? aVar.E() : null;
                tg.b bVarQ2 = aVar.Q();
                lg.l lVarC2 = c(aVar, bVarQ2);
                boolean z10 = lVarC2 != null;
                if (lVarC2 == null) {
                    lVarC2 = b(aVar, bVarQ2);
                }
                if (lVarC instanceof lg.i) {
                    ((lg.i) lVarC).w(lVarC2);
                } else {
                    ((lg.o) lVarC).v(strE, lVarC2);
                }
                if (z10) {
                    arrayDeque.addLast(lVarC);
                    lVarC = lVarC2;
                }
            } else {
                if (lVarC instanceof lg.i) {
                    aVar.g();
                } else {
                    aVar.h();
                }
                if (arrayDeque.isEmpty()) {
                    return lVarC;
                }
                lVarC = (lg.l) arrayDeque.removeLast();
            }
        }
    }

    @Override // lg.a0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void write(tg.c cVar, lg.l lVar) throws IOException {
        if (lVar == null || lVar.n()) {
            cVar.s();
            return;
        }
        if (lVar.t()) {
            r rVarH = lVar.h();
            if (rVarH.C()) {
                cVar.T(rVarH.j());
                return;
            } else if (rVarH.A()) {
                cVar.b0(rVarH.b());
                return;
            } else {
                cVar.Y(rVarH.l());
                return;
            }
        }
        if (lVar.m()) {
            cVar.d();
            Iterator<lg.l> it = lVar.f().iterator();
            while (it.hasNext()) {
                write(cVar, it.next());
            }
            cVar.g();
            return;
        }
        if (!lVar.q()) {
            throw new IllegalArgumentException("Couldn't write " + lVar.getClass());
        }
        cVar.e();
        for (Map.Entry<String, lg.l> entry : lVar.g().D()) {
            cVar.p(entry.getKey());
            write(cVar, entry.getValue());
        }
        cVar.h();
    }
}
