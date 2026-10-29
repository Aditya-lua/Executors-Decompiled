package ps;

import bs.InterfaceC1489b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7347n;
import p229jt.C7348o;
import p451ts.C11744a;

/* JADX INFO: renamed from: ps.m */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t*\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lps/m;", "Lbs/b;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lps/n;", "b", "(Ljava/util/List;)Lps/n;", "", "a", "(Lps/n;)Ljava/util/List;", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10331m implements InterfaceC1489b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10331m f37183a = new C10331m();

    /* JADX INFO: renamed from: a */
    public final List<String> m39648a(SplitArguments splitArguments) {
        List<Object> listM39650a = splitArguments.m39650a();
        ArrayList arrayList = new ArrayList(C7701q.m31905u(listM39650a, 10));
        for (Object obj : listM39650a) {
            Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) obj);
        }
        String[] strArr = (String[]) CollectionsKt.m31691Q0(arrayList).toArray(new String[0]);
        return StringsKt.split$default(splitArguments.getText(), (String[]) Arrays.copyOf(strArr, strArr.length), false, 0, 6, null);
    }

    /* JADX INFO: renamed from: b */
    public final SplitArguments m39649b(List<? extends Object> list) {
        Object objM30460b;
        try {
            C7347n.Companion companion = C7347n.INSTANCE;
            Object obj = list.get(0);
            Intrinsics.m31981d(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            Intrinsics.m31981d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            objM30460b = C7347n.m30460b(new SplitArguments((String) obj, (List) obj2));
        } catch (Throwable th2) {
            C7347n.Companion companion2 = C7347n.INSTANCE;
            objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
        }
        if (C7347n.m30463e(objM30460b) == null) {
            return (SplitArguments) objM30460b;
        }
        return null;
    }

    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        SplitArguments splitArgumentsM39649b = m39649b(C11744a.m43971c(expression));
        if (splitArgumentsM39649b != null) {
            return m39648a(splitArgumentsM39649b);
        }
        return null;
    }
}
