package p135fs;

import bs.InterfaceC1489b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p451ts.C11744a;

/* JADX INFO: renamed from: fs.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Lfs/a;", "Lbs/b;", "<init>", "()V", "", "expression", "data", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/List;", "", "b", "(Ljava/lang/Object;)Z", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C5824a implements InterfaceC1489b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C5824a f22223a = new C5824a();

    /* JADX DEBUG: Method merged with bridge method: l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // bs.InterfaceC1489b
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<Object> mo6534l(@Nullable Object expression, @Nullable Object data) {
        List<Object> listM43971c = C11744a.m43971c(expression);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM43971c) {
            if (!f22223a.m26166b(C5826c.f22225a.mo6534l(obj, data))) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m26166b(Object obj) {
        if (obj != null) {
            return (obj instanceof String) && ((CharSequence) obj).length() == 0;
        }
        return true;
    }
}
