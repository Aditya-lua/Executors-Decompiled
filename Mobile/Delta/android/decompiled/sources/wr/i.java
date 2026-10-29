package wr;

import java.util.Map;
import jt.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zr.LogicOperations;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J/\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lwr/i;", "", "", "", "expression", "data", "Lwr/k;", "a", "(Ljava/util/Map;Ljava/lang/Object;)Lwr/k;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u001b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006 "}, d2 = {"Lwr/i$a;", "", "<init>", "()V", "", "operationName", "Lbs/b;", "operation", "c", "(Ljava/lang/String;Lbs/b;)Lwr/i$a;", "", "operations", "d", "(Ljava/util/Map;)Lwr/i$a;", "Lbs/a;", "a", "(Ljava/lang/String;Lbs/a;)Lwr/i$a;", "b", "Lwr/i;", "e", "()Lwr/i;", "", "f", "(Ljava/lang/String;)Z", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "logger", "", "Ljava/util/Map;", "standardOperations", "functionalOperations", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Function1<Object, Unit> logger;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Map<String, bs.b> standardOperations = k0.n(s.a("var", fs.c.f17223a), s.a("missing_some", fs.b.f17222a), s.a("missing", fs.a.f17221a), s.a(">", ms.b.f24499a), s.a(">=", ms.d.f24500a), s.a("<", ms.f.f24501a), s.a("<=", ms.h.f24502a), s.a("min", ls.h.f23543a), s.a("max", ls.f.f23542a), s.a("+", ls.b.f23540a), s.a("-", ls.l.f23546a), s.a("*", ls.k.f23545a), s.a("/", ls.c.f23541a), s.a("%", ls.i.f23544a), s.a("==", is.b.f20849a), s.a("!=", is.f.f20851a), s.a("===", js.d.f21779a), s.a("!==", js.b.f21778a), s.a("!", hs.d.f19803a), s.a("!!", hs.b.f19801a), s.a("and", hs.a.f19800a), s.a("or", hs.e.f19804a), s.a("if", hs.c.f19802a), s.a("cat", os.a.f27926a), s.a("substr", os.c.f27927a), s.a("merge", ds.e.f14879a), s.a("in", cs.d.f14241a));

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, bs.a> functionalOperations = k0.n(s.a("map", ds.d.f14878a), s.a("filter", ds.c.f14877a), s.a("reduce", ds.g.f14880a), s.a("all", es.a.f15774a), s.a("none", es.b.f15775a), s.a("some", es.f.f15779a));

        @NotNull
        public final a a(@NotNull String operationName, @NotNull bs.a operation) {
            Intrinsics.checkNotNullParameter(operationName, "operationName");
            Intrinsics.checkNotNullParameter(operation, "operation");
            if (f(operationName)) {
                this.functionalOperations.put(operationName, operation);
            }
            return this;
        }

        @NotNull
        public final a b(@NotNull Map<String, ? extends bs.a> operations) {
            Intrinsics.checkNotNullParameter(operations, "operations");
            for (Map.Entry<String, ? extends bs.a> entry : operations.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @NotNull
        public final a c(@NotNull String operationName, @NotNull bs.b operation) {
            Intrinsics.checkNotNullParameter(operationName, "operationName");
            Intrinsics.checkNotNullParameter(operation, "operation");
            if (f(operationName)) {
                this.standardOperations.put(operationName, operation);
            }
            return this;
        }

        @NotNull
        public final a d(@NotNull Map<String, ? extends bs.b> operations) {
            Intrinsics.checkNotNullParameter(operations, "operations");
            for (Map.Entry<String, ? extends bs.b> entry : operations.entrySet()) {
                c(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @NotNull
        public final i e() {
            this.standardOperations.put("log", new cs.e(this.logger));
            return new wr.a(new zr.a(new LogicOperations(this.standardOperations, this.functionalOperations)));
        }

        public final boolean f(String operationName) {
            return (this.functionalOperations.containsKey(operationName) || this.standardOperations.containsKey(operationName)) ? false : true;
        }
    }

    @NotNull
    k a(@NotNull Map<String, ? extends Object> expression, @Nullable Object data);
}
