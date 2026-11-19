package kq;

import com.github.luben.zstd.BuildConfig;
import java.util.Iterator;
import java.util.Set;
import mv.a0;
import mv.c0;
import mv.f0;
import mv.g0;
import mv.h0;
import nn.b0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.p0;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkq/f;", BuildConfig.FLAVOR, "<init>", "()V", "Lkq/c;", "flags", "Lmv/a0;", "b", "(Lkq/c;)Lmv/a0;", "a", "sandbox_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kq.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkq/f$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "Lnn/b0;", "a", "()Ljava/util/Set;", "sandbox_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<b0<?>> a() {
            return p0.c(p.INSTANCE);
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final h0 c(c cVar, a0.a chain) throws JSONException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        f0 f0VarH = chain.h();
        g0 body = f0VarH.getBody();
        if ((!Intrinsics.c(CollectionsKt.o0(f0VarH.getUrl().l()), "transition") && !Intrinsics.c(CollectionsKt.o0(f0VarH.getUrl().l()), "government-id-classification")) || body == null || !cVar.getIsSandboxModeEnabled()) {
            return chain.a(f0VarH);
        }
        String strA = c.INSTANCE.a(cVar.getDebugForcedStatus());
        mv.b0 contentType = body.getContentType();
        String str = null;
        Object[] objArr = 0;
        String subtype = contentType != null ? contentType.getSubtype() : null;
        if (Intrinsics.c(subtype, "form-data")) {
            c0 c0Var = (c0) body;
            c0.a aVarE = new c0.a(str, 1, objArr == true ? 1 : 0).e(c0Var.getType());
            Iterator<T> it = c0Var.j().iterator();
            while (it.hasNext()) {
                aVarE.c((c0.c) it.next());
            }
            return chain.a(f0VarH.j().o(f0VarH.getMethod(), aVarE.a("meta[workflowInitialVariables][debugForcedStatus]", strA).d()).b());
        }
        if (!Intrinsics.c(subtype, "json")) {
            return chain.a(f0VarH);
        }
        ew.e eVar = new ew.e();
        body.h(eVar);
        JSONObject jSONObject = new JSONObject(eVar.V2());
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("meta");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        jSONObjectOptJSONObject.put("workflowInitialVariables", new JSONObject().put("debugForcedStatus", strA));
        jSONObject.put("meta", jSONObjectOptJSONObject);
        g0.Companion companion = g0.INSTANCE;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return chain.a(f0VarH.j().o(f0VarH.getMethod(), companion.c(string, body.getContentType())).b());
    }

    @NotNull
    public static final Set<b0<?>> d() {
        return INSTANCE.a();
    }

    @NotNull
    public final a0 b(@NotNull final c flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        return new a0() { // from class: kq.e
            @Override // mv.a0
            public final h0 intercept(a0.a aVar) {
                return f.c(flags, aVar);
            }
        };
    }
}
