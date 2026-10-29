package p395qu;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p201iu.C6985m;
import p201iu.C6988p;
import p256ku.AbstractC7900n2;

/* JADX INFO: renamed from: qu.t */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m31665d2 = {"Lqu/t;", "", "<init>", "()V", "Lku/n2;", "a", "()Lku/n2;", "b", "Lku/n2;", "dispatcher", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10748t {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10748t f38323a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AbstractC7900n2 dispatcher;

    static {
        C10748t c10748t = new C10748t();
        f38323a = c10748t;
        C10721f0.m40845f("kotlinx.coroutines.fast.service.loader", true);
        dispatcher = c10748t.m40949a();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC7900n2 m40949a() {
        Object next;
        AbstractC7900n2 abstractC7900n2M40954e;
        try {
            List listM29398z = C6988p.m29398z(C6985m.m29376e(ServiceLoader.load(InterfaceC10746s.class, InterfaceC10746s.class.getClassLoader()).iterator()));
            Iterator it = listM29398z.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iMo33644c = ((InterfaceC10746s) next).mo33644c();
                    do {
                        Object next2 = it.next();
                        int iMo33644c2 = ((InterfaceC10746s) next2).mo33644c();
                        if (iMo33644c < iMo33644c2) {
                            next = next2;
                            iMo33644c = iMo33644c2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC10746s interfaceC10746s = (InterfaceC10746s) next;
            if (interfaceC10746s != null && (abstractC7900n2M40954e = C10749u.m40954e(interfaceC10746s, listM29398z)) != null) {
                return abstractC7900n2M40954e;
            }
            return C10749u.m40951b(null, null, 3, null);
        } catch (Throwable th2) {
            return C10749u.m40951b(th2, null, 2, null);
        }
    }
}
