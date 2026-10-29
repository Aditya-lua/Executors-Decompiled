package ym;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"!\u0010\b\u001a\u00020\u0002*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lhu/m;", Payload.TYPE, "Lym/s;", "b", "(Lhu/m;)Lym/s;", "Lym/q;", "a", "(Lym/q;)Lym/s;", "identifier", "wf1-workflow-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
public final /* synthetic */ class c0 {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.k implements Function0<String> {
        public a(Object obj) {
            super(0, obj, c.class, "describeRealIdentifier", "describeRealIdentifier()Ljava/lang/String;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return ((c) this.receiver).a();
        }
    }

    @NotNull
    public static final s a(@NotNull q<?, ?, ?> qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        c cVar = qVar instanceof c ? (c) qVar : null;
        return new s(d0.b(qVar.getClass()), cVar == null ? null : cVar.getRealIdentifier(), cVar != null ? new a(cVar) : null);
    }

    @NotNull
    public static final s b(@NotNull hu.m type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new s(type, null, null, 6, null);
    }
}
