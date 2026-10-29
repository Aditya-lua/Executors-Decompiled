package p515we;

import p102ef.C5109a;
import p515we.InterfaceC12388p0;
import pe.AbstractC10231l;
import pe.C10218d0;

/* JADX INFO: renamed from: we.m */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC12381m<SerializationT extends InterfaceC12388p0> {

    /* JADX INFO: renamed from: a */
    public final C5109a f44311a;

    /* JADX INFO: renamed from: b */
    public final Class<SerializationT> f44312b;

    /* JADX INFO: renamed from: we.m$a */
    public class a extends AbstractC12381m<SerializationT> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ b f44313c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C5109a c5109a, Class cls, b bVar) {
            super(c5109a, cls, null);
            this.f44313c = bVar;
        }

        @Override // p515we.AbstractC12381m
        /* JADX INFO: renamed from: d */
        public AbstractC10231l mo46401d(SerializationT serializationt, C10218d0 c10218d0) {
            return this.f44313c.mo8230a(serializationt, c10218d0);
        }
    }

    /* JADX INFO: renamed from: we.m$b */
    public interface b<SerializationT extends InterfaceC12388p0> {
        /* JADX INFO: renamed from: a */
        AbstractC10231l mo8230a(SerializationT serializationt, C10218d0 c10218d0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 ef.a), (r2v0 java.lang.Class) A[MD:(ef.a, java.lang.Class<SerializationT extends we.p0>):void (m)] (LINE:1) call: we.m.<init>(ef.a, java.lang.Class):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ AbstractC12381m(C5109a c5109a, Class cls, a aVar) {
        this(c5109a, cls);
    }

    /* JADX INFO: renamed from: a */
    public static <SerializationT extends InterfaceC12388p0> AbstractC12381m<SerializationT> m46398a(b<SerializationT> bVar, C5109a c5109a, Class<SerializationT> cls) {
        return new a(c5109a, cls, bVar);
    }

    /* JADX INFO: renamed from: b */
    public final C5109a m46399b() {
        return this.f44311a;
    }

    /* JADX INFO: renamed from: c */
    public final Class<SerializationT> m46400c() {
        return this.f44312b;
    }

    /* JADX INFO: renamed from: d */
    public abstract AbstractC10231l mo46401d(SerializationT serializationt, C10218d0 c10218d0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC12381m(C5109a c5109a, Class<SerializationT> cls) {
        this.f44311a = c5109a;
        this.f44312b = cls;
    }
}
