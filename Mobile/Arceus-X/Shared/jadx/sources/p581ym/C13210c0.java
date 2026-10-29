package p581ym;

import com.appsflyer.sdk_base.referrer.Payload;
import hu.InterfaceC6577m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ym.c0 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"!\u0010\b\u001a\u00020\u0002*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m31665d2 = {"Lhu/m;", Payload.TYPE, "Lym/s;", "b", "(Lhu/m;)Lym/s;", "Lym/q;", "a", "(Lym/q;)Lym/s;", "identifier", "wf1-workflow-core"}, m31666k = 5, m31667mv = {1, 6, 0}, m31669xi = 48, m31670xs = "com/squareup/workflow1/Workflows")
public final /* synthetic */ class C13210c0 {

    /* JADX INFO: renamed from: ym.c0$a */
    @Metadata(m31666k = 3, m31667mv = {1, 6, 0}, m31669xi = 48)
    public /* synthetic */ class a extends C7744k implements Function0<String> {
        public a(Object obj) {
            super(0, obj, InterfaceC13209c.class, "describeRealIdentifier", "describeRealIdentifier()Ljava/lang/String;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ((InterfaceC13209c) this.receiver).mo48850a();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final C13226s m48852a(@NotNull InterfaceC13224q<?, ?, ?> interfaceC13224q) {
        Intrinsics.checkNotNullParameter(interfaceC13224q, "<this>");
        InterfaceC13209c interfaceC13209c = interfaceC13224q instanceof InterfaceC13209c ? (InterfaceC13209c) interfaceC13224q : null;
        return new C13226s(C7731d0.m32002b(interfaceC13224q.getClass()), interfaceC13209c == null ? null : interfaceC13209c.getRealIdentifier(), interfaceC13209c != null ? new a(interfaceC13209c) : null);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final C13226s m48853b(@NotNull InterfaceC6577m type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new C13226s(type, null, null, 6, null);
    }
}
