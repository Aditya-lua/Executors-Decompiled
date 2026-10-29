package p179hs;

import bs.InterfaceC1489b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254ks.InterfaceC7823d;
import p451ts.C11744a;

/* JADX INFO: renamed from: hs.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lhs/a;", "Lbs/b;", "Lks/d;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6559a implements InterfaceC1489b, InterfaceC7823d {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C6559a f24933a = new C6559a();

    @Override // p254ks.InterfaceC7823d
    /* JADX INFO: renamed from: b */
    public boolean mo22977b(@Nullable Object obj) {
        return super.mo22977b(obj);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046 A[RETURN] */
    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        List<Object> listM43971c = C11744a.m43971c(expression);
        List<Object> list = listM43971c;
        boolean z10 = list instanceof Collection;
        if (!z10 || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof Boolean)) {
                    for (Object obj : list) {
                        if (!f24933a.mo22977b(obj)) {
                            if (obj == null) {
                                return CollectionsKt.m31717o0(listM43971c);
                            }
                            return obj;
                        }
                    }
                    obj = null;
                    if (obj == null) {
                        return CollectionsKt.m31717o0(listM43971c);
                    }
                    return obj;
                }
            }
        }
        boolean z11 = true;
        if (!z10 || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!f24933a.mo22977b(it2.next())) {
                    z11 = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z11);
    }
}
