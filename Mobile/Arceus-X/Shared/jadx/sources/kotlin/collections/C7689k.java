package kotlin.collections;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lt.C8258b;
import org.jetbrains.annotations.Nullable;
import p229jt.C7333c0;
import p229jt.C7355v;
import p229jt.C7357x;
import p229jt.C7359z;

/* JADX INFO: renamed from: kotlin.collections.k */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a5\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m31665d2 = {"T", "", "other", "", "d", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/collections/ArraysKt")
public class C7689k extends C7687j {
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static <T> boolean m31794d(@Nullable T[] tArr, @Nullable T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object[] objArr = tArr[i10];
            Object[] objArr2 = tArr2[i10];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof Object[]) && (objArr2 instanceof Object[])) {
                    if (!m31794d(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof C7355v) && (objArr2 instanceof C7355v)) {
                    if (!C8258b.m33640c(((C7355v) objArr).getStorage(), ((C7355v) objArr2).getStorage())) {
                        return false;
                    }
                } else if ((objArr instanceof C7333c0) && (objArr2 instanceof C7333c0)) {
                    if (!C8258b.m33638a(((C7333c0) objArr).getStorage(), ((C7333c0) objArr2).getStorage())) {
                        return false;
                    }
                } else if ((objArr instanceof C7357x) && (objArr2 instanceof C7357x)) {
                    if (!C8258b.m33639b(((C7357x) objArr).getStorage(), ((C7357x) objArr2).getStorage())) {
                        return false;
                    }
                } else if ((objArr instanceof C7359z) && (objArr2 instanceof C7359z)) {
                    if (!C8258b.m33641d(((C7359z) objArr).getStorage(), ((C7359z) objArr2).getStorage())) {
                        return false;
                    }
                } else if (!Intrinsics.m31980c(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
