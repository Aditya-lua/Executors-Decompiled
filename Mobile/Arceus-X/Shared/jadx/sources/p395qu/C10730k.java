package p395qu;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qu.k */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002¨\u0006\t"}, m31665d2 = {"Lqu/k;", "E", "", "holder", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "element", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C10730k<E> {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static <E> Object m40871a(@Nullable Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m40872b(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return m40871a(obj);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final Object m40873c(Object obj, E e10) {
        if (obj == null) {
            return m40871a(e10);
        }
        if (obj instanceof ArrayList) {
            Intrinsics.m31981d(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ((ArrayList) obj).add(e10);
            return m40871a(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e10);
        return m40871a(arrayList);
    }
}
