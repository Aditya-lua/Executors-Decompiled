package p016an;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: an.g */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m31665d2 = {"Lan/g;", "", "", "c", "()Ljava/lang/String;", "compatibilityKey", "a", "wf1-core-common"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public interface InterfaceC0375g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f916a;

    /* JADX INFO: renamed from: an.g$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Lan/g$a;", "", "<init>", "()V", "value", "", "name", "a", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "wf1-core-common"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f916a = new Companion();

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ String m1418b(Companion companion, Object obj, String str, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                str = "";
            }
            return companion.m1419a(obj, str);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m1419a(@NotNull Object value, @NotNull String name) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(name, "name");
            InterfaceC0375g interfaceC0375g = value instanceof InterfaceC0375g ? (InterfaceC0375g) value : null;
            String strMo1417c = interfaceC0375g != null ? interfaceC0375g.mo1417c() : null;
            if (strMo1417c == null) {
                strMo1417c = value.getClass().getName();
            }
            return Intrinsics.m31989l(strMo1417c, name.length() == 0 ? "" : Intrinsics.m31989l("+", name));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    String mo1417c();
}
