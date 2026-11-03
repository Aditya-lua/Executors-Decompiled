package ou;

import iu.n2;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lou/t;", "", "<init>", "()V", "Liu/n2;", "a", "()Liu/n2;", "b", "Liu/n2;", "dispatcher", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t f28233a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final n2 dispatcher;

    static {
        t tVar = new t();
        f28233a = tVar;
        f0.f("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = tVar.a();
    }

    public final n2 a() {
        Object next;
        n2 n2VarE;
        try {
            List listZ = gu.p.z(gu.m.e(ServiceLoader.load(s.class, s.class.getClassLoader()).iterator()));
            Iterator it = listZ.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((s) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((s) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            s sVar = (s) next;
            if (sVar != null && (n2VarE = u.e(sVar, listZ)) != null) {
                return n2VarE;
            }
            return u.b(null, null, 3, null);
        } catch (Throwable th2) {
            return u.b(th2, null, 2, null);
        }
    }
}
