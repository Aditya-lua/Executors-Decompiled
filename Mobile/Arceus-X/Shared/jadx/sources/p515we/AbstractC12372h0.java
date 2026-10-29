package p515we;

import pe.AbstractC10231l;

/* JADX INFO: renamed from: we.h0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC12372h0<KeyT extends AbstractC10231l, PrimitiveT> {

    /* JADX INFO: renamed from: a */
    public final Class<KeyT> f44268a;

    /* JADX INFO: renamed from: b */
    public final Class<PrimitiveT> f44269b;

    /* JADX INFO: renamed from: we.h0$a */
    public class a extends AbstractC12372h0<KeyT, PrimitiveT> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ b f44270c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f44270c = bVar;
        }

        @Override // p515we.AbstractC12372h0
        /* JADX INFO: renamed from: a */
        public PrimitiveT mo46325a(KeyT keyt) {
            return (PrimitiveT) this.f44270c.mo7261a(keyt);
        }
    }

    /* JADX INFO: renamed from: we.h0$b */
    public interface b<KeyT extends AbstractC10231l, PrimitiveT> {
        /* JADX INFO: renamed from: a */
        PrimitiveT mo7261a(KeyT keyt);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.Class), (r2v0 java.lang.Class) A[MD:(java.lang.Class<KeyT extends pe.l>, java.lang.Class<PrimitiveT>):void (m)] (LINE:1) call: we.h0.<init>(java.lang.Class, java.lang.Class):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC12372h0(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    /* JADX INFO: renamed from: b */
    public static <KeyT extends AbstractC10231l, PrimitiveT> AbstractC12372h0<KeyT, PrimitiveT> m46324b(b<KeyT, PrimitiveT> bVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new a(cls, cls2, bVar);
    }

    /* JADX INFO: renamed from: a */
    public abstract PrimitiveT mo46325a(KeyT keyt);

    /* JADX INFO: renamed from: c */
    public Class<KeyT> m46326c() {
        return this.f44268a;
    }

    /* JADX INFO: renamed from: d */
    public Class<PrimitiveT> m46327d() {
        return this.f44269b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC12372h0(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.f44268a = cls;
        this.f44269b = cls2;
    }
}
