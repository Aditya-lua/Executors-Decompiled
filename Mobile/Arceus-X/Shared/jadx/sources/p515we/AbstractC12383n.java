package p515we;

import p515we.InterfaceC12388p0;
import pe.AbstractC10231l;
import pe.C10218d0;

/* JADX INFO: renamed from: we.n */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC12383n<KeyT extends AbstractC10231l, SerializationT extends InterfaceC12388p0> {

    /* JADX INFO: renamed from: a */
    public final Class<KeyT> f44316a;

    /* JADX INFO: renamed from: b */
    public final Class<SerializationT> f44317b;

    /* JADX INFO: renamed from: we.n$a */
    public class a extends AbstractC12383n<KeyT, SerializationT> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ b f44318c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f44318c = bVar;
        }

        @Override // p515we.AbstractC12383n
        /* JADX INFO: renamed from: d */
        public SerializationT mo46408d(KeyT keyt, C10218d0 c10218d0) {
            return (SerializationT) this.f44318c.mo8228a(keyt, c10218d0);
        }
    }

    /* JADX INFO: renamed from: we.n$b */
    public interface b<KeyT extends AbstractC10231l, SerializationT extends InterfaceC12388p0> {
        /* JADX INFO: renamed from: a */
        SerializationT mo8228a(KeyT keyt, C10218d0 c10218d0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.Class), (r2v0 java.lang.Class) A[MD:(java.lang.Class<KeyT extends pe.l>, java.lang.Class<SerializationT extends we.p0>):void (m)] (LINE:1) call: we.n.<init>(java.lang.Class, java.lang.Class):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC12383n(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    /* JADX INFO: renamed from: a */
    public static <KeyT extends AbstractC10231l, SerializationT extends InterfaceC12388p0> AbstractC12383n<KeyT, SerializationT> m46405a(b<KeyT, SerializationT> bVar, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new a(cls, cls2, bVar);
    }

    /* JADX INFO: renamed from: b */
    public Class<KeyT> m46406b() {
        return this.f44316a;
    }

    /* JADX INFO: renamed from: c */
    public Class<SerializationT> m46407c() {
        return this.f44317b;
    }

    /* JADX INFO: renamed from: d */
    public abstract SerializationT mo46408d(KeyT keyt, C10218d0 c10218d0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC12383n(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.f44316a = cls;
        this.f44317b = cls2;
    }
}
