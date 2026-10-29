package p041c5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7690k0;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a5.AbstractC0072b;
import p535x4.AbstractC12682u;
import p535x4.C12654c;

/* JADX INFO: renamed from: c5.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aA\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e*\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Lx4/c;", "", "fromVersion", "toVersion", "", "d", "(Lx4/c;II)Z", "Lx4/u$e;", "startVersion", "endVersion", "a", "(Lx4/u$e;II)Z", "start", "end", "", "La5/b;", "b", "(Lx4/u$e;II)Ljava/util/List;", "", "result", "upgrade", "c", "(Lx4/u$e;Ljava/util/List;ZII)Ljava/util/List;", "room-runtime"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C1532h {
    /* JADX INFO: renamed from: a */
    public static final boolean m8091a(@NotNull AbstractC12682u.e eVar, int i10, int i11) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Map<Integer, Map<Integer, AbstractC0072b>> mapM47302e = eVar.m47302e();
        if (!mapM47302e.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        Map<Integer, AbstractC0072b> mapM31795j = mapM47302e.get(Integer.valueOf(i10));
        if (mapM31795j == null) {
            mapM31795j = C7690k0.m31795j();
        }
        return mapM31795j.containsKey(Integer.valueOf(i11));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final List<AbstractC0072b> m8092b(@NotNull AbstractC12682u.e eVar, int i10, int i11) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (i10 == i11) {
            return C7699p.m31892k();
        }
        return m8093c(eVar, new ArrayList(), i11 > i10, i10, i11);
    }

    /* JADX INFO: renamed from: c */
    public static final List<AbstractC0072b> m8093c(AbstractC12682u.e eVar, List<AbstractC0072b> list, boolean z10, int i10, int i11) {
        int iIntValue;
        boolean z11;
        while (true) {
            if (z10) {
                if (i10 >= i11) {
                    return list;
                }
            } else if (i10 <= i11) {
                return list;
            }
            Pair<Map<Integer, AbstractC0072b>, Iterable<Integer>> pairM47303f = z10 ? eVar.m47303f(i10) : eVar.m47304g(i10);
            if (pairM47303f == null) {
                return null;
            }
            Map<Integer, AbstractC0072b> mapM31671a = pairM47303f.m31671a();
            Iterator<Integer> it = pairM47303f.m31672b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    iIntValue = i10;
                    z11 = false;
                    break;
                }
                iIntValue = it.next().intValue();
                if (!z10) {
                    if (i11 <= iIntValue && iIntValue < i10) {
                        AbstractC0072b abstractC0072b = mapM31671a.get(Integer.valueOf(iIntValue));
                        Intrinsics.checkNotNull(abstractC0072b);
                        list.add(abstractC0072b);
                        z11 = true;
                        break;
                    }
                } else if (i10 + 1 <= iIntValue && iIntValue <= i11) {
                    AbstractC0072b abstractC0072b2 = mapM31671a.get(Integer.valueOf(iIntValue));
                    Intrinsics.checkNotNull(abstractC0072b2);
                    list.add(abstractC0072b2);
                    z11 = true;
                    break;
                }
            }
            if (!z11) {
                return null;
            }
            i10 = iIntValue;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m8094d(@NotNull C12654c c12654c, int i10, int i11) {
        Intrinsics.checkNotNullParameter(c12654c, "<this>");
        if (i10 > i11 && c12654c.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        Set<Integer> setM47159c = c12654c.m47159c();
        return c12654c.requireMigration && (setM47159c == null || !setM47159c.contains(Integer.valueOf(i10)));
    }
}
