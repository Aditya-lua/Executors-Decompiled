package an;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lan/g;", "", "", "c", "()Ljava/lang/String;", "compatibilityKey", "a", "wf1-core-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f705a;

    /* JADX INFO: renamed from: an.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lan/g$a;", "", "<init>", "()V", "value", "", "name", "a", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "wf1-core-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f705a = new Companion();

        public static /* synthetic */ String b(Companion companion, Object obj, String str, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                str = "";
            }
            return companion.a(obj, str);
        }

        @NotNull
        public final String a(@NotNull Object value, @NotNull String name) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(name, "name");
            g gVar = value instanceof g ? (g) value : null;
            String strC = gVar != null ? gVar.c() : null;
            if (strC == null) {
                strC = value.getClass().getName();
            }
            return Intrinsics.l(strC, name.length() == 0 ? "" : Intrinsics.l("+", name));
        }
    }

    @NotNull
    String c();
}
