package i6;

import f6.SystemIdInfo;
import f6.j0;
import f6.o1;
import f6.p;
import f6.q1;
import f6.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x5.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lf6/y;", "workNameDao", "Lf6/q1;", "workTagDao", "Lf6/p;", "systemIdInfoDao", "", "Lf6/j0;", "workSpecs", "", "d", "(Lf6/y;Lf6/q1;Lf6/p;Ljava/util/List;)Ljava/lang/String;", "workSpec", "name", "", "systemId", "tags", "c", "(Lf6/j0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f20284a;

    static {
        String strI = w.i("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(...)");
        f20284a = strI;
    }

    public static final String c(j0 j0Var, String str, Integer num, String str2) {
        return '\n' + j0Var.id + "\t " + j0Var.workerClassName + "\t " + num + "\t " + j0Var.state.name() + "\t " + str + "\t " + str2 + '\t';
    }

    public static final String d(y yVar, q1 q1Var, p pVar, List<j0> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (j0 j0Var : list) {
            SystemIdInfo systemIdInfoD = pVar.d(o1.a(j0Var));
            sb2.append(c(j0Var, CollectionsKt.m0(yVar.b(j0Var.id), ",", null, null, 0, null, null, 62, null), systemIdInfoD != null ? Integer.valueOf(systemIdInfoD.systemId) : null, CollectionsKt.m0(q1Var.a(j0Var.id), ",", null, null, 0, null, null, 62, null)));
        }
        return sb2.toString();
    }
}
