package p515we;

import p102ef.C5109a;
import p515we.InterfaceC12388p0;
import pe.AbstractC10243x;

/* JADX INFO: renamed from: we.f0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC12368f0<SerializationT extends InterfaceC12388p0> {

    /* JADX INFO: renamed from: a */
    public final C5109a f44247a;

    /* JADX INFO: renamed from: b */
    public final Class<SerializationT> f44248b;

    /* JADX INFO: renamed from: we.f0$a */
    public class a extends AbstractC12368f0<SerializationT> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ b f44249c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5109a c5109a, Class cls, b bVar) {
            super(c5109a, cls, null);
            this.f44249c = bVar;
        }

        @Override // p515we.AbstractC12368f0
        /* JADX INFO: renamed from: d */
        public AbstractC10243x mo46300d(SerializationT serializationt) {
            return this.f44249c.mo8229a(serializationt);
        }
    }

    /* JADX INFO: renamed from: we.f0$b */
    public interface b<SerializationT extends InterfaceC12388p0> {
        /* JADX INFO: renamed from: a */
        AbstractC10243x mo8229a(SerializationT serializationt);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 ef.a), (r2v0 java.lang.Class) A[MD:(ef.a, java.lang.Class<SerializationT extends we.p0>):void (m)] (LINE:1) call: we.f0.<init>(ef.a, java.lang.Class):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC12368f0(C5109a c5109a, Class cls, a aVar) {
        this(c5109a, cls);
    }

    /* JADX INFO: renamed from: a */
    public static <SerializationT extends InterfaceC12388p0> AbstractC12368f0<SerializationT> m46297a(b<SerializationT> bVar, C5109a c5109a, Class<SerializationT> cls) {
        return new a(c5109a, cls, bVar);
    }

    /* JADX INFO: renamed from: b */
    public final C5109a m46298b() {
        return this.f44247a;
    }

    /* JADX INFO: renamed from: c */
    public final Class<SerializationT> m46299c() {
        return this.f44248b;
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC10243x mo46300d(SerializationT serializationt);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC12368f0(C5109a c5109a, Class<SerializationT> cls) {
        this.f44247a = c5109a;
        this.f44248b = cls;
    }
}
