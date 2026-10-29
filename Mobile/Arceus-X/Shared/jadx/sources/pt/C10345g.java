package pt;

import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pt.g */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lpt/a;", "Ljava/lang/StackTraceElement;", "c", "(Lpt/a;)Ljava/lang/StackTraceElement;", "Lpt/f;", "a", "(Lpt/a;)Lpt/f;", "", "b", "(Lpt/a;)I", "kotlin-stdlib"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C10345g {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC10344f m39668a(AbstractC10339a abstractC10339a) {
        return (InterfaceC10344f) abstractC10339a.getClass().getAnnotation(InterfaceC10344f.class);
    }

    /* JADX INFO: renamed from: b */
    public static final int m39669b(AbstractC10339a abstractC10339a) {
        try {
            Field declaredField = abstractC10339a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC10339a);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final StackTraceElement m39670c(@NotNull AbstractC10339a abstractC10339a) {
        String strM39663c;
        Intrinsics.checkNotNullParameter(abstractC10339a, "<this>");
        InterfaceC10344f interfaceC10344fM39668a = m39668a(abstractC10339a);
        if (interfaceC10344fM39668a == null || interfaceC10344fM39668a.m39667v() < 1) {
            return null;
        }
        int iM39669b = m39669b(abstractC10339a);
        int i10 = iM39669b < 0 ? -1 : interfaceC10344fM39668a.m39665l()[iM39669b];
        String strM39675b = C10347i.f37196a.m39675b(abstractC10339a);
        if (strM39675b == null) {
            strM39663c = interfaceC10344fM39668a.m39663c();
        } else {
            strM39663c = strM39675b + '/' + interfaceC10344fM39668a.m39663c();
        }
        return new StackTraceElement(strM39663c, interfaceC10344fM39668a.m39666m(), interfaceC10344fM39668a.m39664f(), i10);
    }
}
