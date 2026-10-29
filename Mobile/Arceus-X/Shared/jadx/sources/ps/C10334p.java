package ps;

import bs.InterfaceC1489b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p451ts.C11744a;

/* JADX INFO: renamed from: ps.p */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lps/p;", "Lbs/b;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10334p implements InterfaceC1489b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10334p f37186a = new C10334p();

    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        List listSplit$default;
        List listY;
        Object objFirstOrNull = CollectionsKt.firstOrNull(C11744a.m43971c(expression));
        String str = objFirstOrNull instanceof String ? (String) objFirstOrNull : null;
        if (str == null || (listSplit$default = StringsKt.split$default(str, new String[]{""}, false, 0, 6, null)) == null || (listY = CollectionsKt.m31701Y(listSplit$default, 1)) == null) {
            return null;
        }
        return CollectionsKt.m31702Z(listY, 1);
    }
}
