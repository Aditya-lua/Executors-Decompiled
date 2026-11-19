package og;

import java.io.IOException;
import lg.a0;
import lg.b0;
import lg.u;
import lg.y;
import lg.z;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends a0<Number> {
    public static final b0 b = b(y.b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f28153a;

    public class a implements b0 {
        public a() {
        }

        @Override // lg.b0
        public <T> a0<T> create(lg.f fVar, sg.a<T> aVar) {
            if (aVar.c() == Number.class) {
                return j.this;
            }
            return null;
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28155a;

        static {
            int[] iArr = new int[tg.b.values().length];
            f28155a = iArr;
            try {
                iArr[tg.b.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28155a[tg.b.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28155a[tg.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(z zVar) {
        this.f28153a = zVar;
    }

    public static b0 a(z zVar) {
        return zVar == y.b ? b : b(zVar);
    }

    public static b0 b(z zVar) {
        return new j(zVar).new a();
    }

    @Override // lg.a0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Number read(tg.a aVar) throws IOException {
        tg.b bVarQ = aVar.Q();
        int i10 = b.f28155a[bVarQ.ordinal()];
        if (i10 == 1) {
            aVar.K();
            return null;
        }
        if (i10 == 2 || i10 == 3) {
            return this.f28153a.a(aVar);
        }
        throw new u("Expecting number, got: " + bVarQ + "; at path " + aVar.x());
    }

    @Override // lg.a0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void write(tg.c cVar, Number number) throws IOException {
        cVar.T(number);
    }
}
