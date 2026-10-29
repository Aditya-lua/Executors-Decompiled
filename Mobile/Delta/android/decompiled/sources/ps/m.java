package ps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t*\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lps/m;", "Lbs/b;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lps/n;", "b", "(Ljava/util/List;)Lps/n;", "", "a", "(Lps/n;)Ljava/util/List;", "operations-stdlib_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements bs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m f28876a = new m();

    public final List<String> a(SplitArguments splitArguments) {
        List<Object> listA = splitArguments.a();
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(listA, 10));
        for (Object obj : listA) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) obj);
        }
        String[] strArr = (String[]) CollectionsKt.Q0(arrayList).toArray(new String[0]);
        return StringsKt.split$default(splitArguments.getText(), (String[]) Arrays.copyOf(strArr, strArr.length), false, 0, 6, null);
    }

    public final SplitArguments b(List<? extends Object> list) {
        Object objB;
        try {
            jt.n.Companion companion = jt.n.INSTANCE;
            Object obj = list.get(0);
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = list.get(1);
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            objB = jt.n.b(new SplitArguments((String) obj, (List) obj2));
        } catch (Throwable th2) {
            jt.n.Companion companion2 = jt.n.INSTANCE;
            objB = jt.n.b(jt.o.a(th2));
        }
        if (jt.n.e(objB) == null) {
            return (SplitArguments) objB;
        }
        return null;
    }

    @Override // bs.b
    @Nullable
    public Object l(@Nullable Object expression, @Nullable Object data) {
        SplitArguments splitArgumentsB = b(ts.a.c(expression));
        if (splitArgumentsB != null) {
            return a(splitArgumentsB);
        }
        return null;
    }
}
