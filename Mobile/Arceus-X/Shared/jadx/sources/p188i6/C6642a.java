package p188i6;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p120f6.C5390j0;
import p120f6.C5406o1;
import p120f6.InterfaceC5407p;
import p120f6.InterfaceC5412q1;
import p120f6.InterfaceC5432y;
import p120f6.SystemIdInfo;
import p536x5.AbstractC12732w;

/* JADX INFO: renamed from: i6.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0011\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m31665d2 = {"Lf6/y;", "workNameDao", "Lf6/q1;", "workTagDao", "Lf6/p;", "systemIdInfoDao", "", "Lf6/j0;", "workSpecs", "", "d", "(Lf6/y;Lf6/q1;Lf6/p;Ljava/util/List;)Ljava/lang/String;", "workSpec", "name", "", "systemId", "tags", "c", "(Lf6/j0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C6642a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f25622a;

    static {
        String strM47443i = AbstractC12732w.m47443i("DiagnosticsWrkr");
        Intrinsics.checkNotNullExpressionValue(strM47443i, "tagWithPrefix(...)");
        f25622a = strM47443i;
    }

    /* JADX INFO: renamed from: c */
    public static final String m28658c(C5390j0 c5390j0, String str, Integer num, String str2) {
        return '\n' + c5390j0.id + "\t " + c5390j0.workerClassName + "\t " + num + "\t " + c5390j0.state.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: renamed from: d */
    public static final String m28659d(InterfaceC5432y interfaceC5432y, InterfaceC5412q1 interfaceC5412q1, InterfaceC5407p interfaceC5407p, List<C5390j0> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        for (C5390j0 c5390j0 : list) {
            SystemIdInfo systemIdInfoM24876d = interfaceC5407p.m24876d(C5406o1.m24872a(c5390j0));
            sb2.append(m28658c(c5390j0, CollectionsKt.m31715m0(interfaceC5432y.mo24718b(c5390j0.id), ",", null, null, 0, null, null, 62, null), systemIdInfoM24876d != null ? Integer.valueOf(systemIdInfoM24876d.systemId) : null, CollectionsKt.m31715m0(interfaceC5412q1.mo24880a(c5390j0.id), ",", null, null, 0, null, null, 62, null)));
        }
        return sb2.toString();
    }
}
