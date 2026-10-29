package p171hg;

import android.content.Context;
import p292mf.C8492c;
import p292mf.C8511r;
import p292mf.InterfaceC8494d;
import p292mf.InterfaceC8500g;

/* JADX INFO: renamed from: hg.h */
/* JADX INFO: loaded from: classes2.dex */
public class C6403h {

    /* JADX INFO: renamed from: hg.h$a */
    public interface a<T> {
        /* JADX INFO: renamed from: a */
        String mo25282a(T t8);
    }

    /* JADX INFO: renamed from: b */
    public static C8492c<?> m27986b(String str, String str2) {
        return C8492c.m34278l(AbstractC6401f.m27984a(str, str2), AbstractC6401f.class);
    }

    /* JADX INFO: renamed from: c */
    public static C8492c<?> m27987c(final String str, final a<Context> aVar) {
        return C8492c.m34279m(AbstractC6401f.class).m34291b(C8511r.m34359j(Context.class)).m34295f(new InterfaceC8500g() { // from class: hg.g
            @Override // p292mf.InterfaceC8500g
            public final Object create(InterfaceC8494d interfaceC8494d) {
                return AbstractC6401f.m27984a(str, aVar.mo25282a((Context) interfaceC8494d.mo34304a(Context.class)));
            }
        }).m34293d();
    }
}
