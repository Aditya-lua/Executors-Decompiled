package pt;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lpt/a;", "Ljava/lang/StackTraceElement;", "c", "(Lpt/a;)Ljava/lang/StackTraceElement;", "Lpt/f;", "a", "(Lpt/a;)Lpt/f;", "", "b", "(Lpt/a;)I", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {
    public static final f a(a aVar) {
        return (f) aVar.getClass().getAnnotation(f.class);
    }

    public static final int b(a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Nullable
    public static final StackTraceElement c(@NotNull a aVar) {
        String strC;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        f fVarA = a(aVar);
        if (fVarA == null || fVarA.v() < 1) {
            return null;
        }
        int iB = b(aVar);
        int i10 = iB < 0 ? -1 : fVarA.l()[iB];
        String strB = i.f28887a.b(aVar);
        if (strB == null) {
            strC = fVarA.c();
        } else {
            strC = strB + '/' + fVarA.c();
        }
        return new StackTraceElement(strC, fVarA.m(), fVarA.f(), i10);
    }
}
