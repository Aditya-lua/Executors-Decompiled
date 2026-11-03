package ur;

import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import gt.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xr.LogicOperations;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J/\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lur/i;", "", "", "", "expression", "data", "Lur/k;", "a", "(Ljava/util/Map;Ljava/lang/Object;)Lur/k;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u001b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006 "}, d2 = {"Lur/i$a;", "", "<init>", "()V", "", "operationName", "Lzr/b;", "operation", "c", "(Ljava/lang/String;Lzr/b;)Lur/i$a;", "", "operations", "d", "(Ljava/util/Map;)Lur/i$a;", "Lzr/a;", "a", "(Ljava/lang/String;Lzr/a;)Lur/i$a;", "b", "Lur/i;", "e", "()Lur/i;", "", "f", "(Ljava/lang/String;)Z", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "logger", "", "Ljava/util/Map;", "standardOperations", "functionalOperations", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Function1<Object, Unit> logger;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Map<String, zr.b> standardOperations = k0.n(s.a("var", ds.c.f15419a), s.a("missing_some", ds.b.f15418a), s.a("missing", ds.a.f15417a), s.a(">", ks.b.f23195a), s.a(">=", ks.d.f23196a), s.a("<", ks.f.f23197a), s.a("<=", ks.h.f23198a), s.a("min", js.h.f22196a), s.a("max", js.f.f22195a), s.a("+", js.b.f22193a), s.a("-", js.l.f22199a), s.a("*", js.k.f22198a), s.a("/", js.c.f22194a), s.a("%", js.i.f22197a), s.a("==", gs.b.f18906a), s.a("!=", gs.f.f18908a), s.a("===", hs.d.f19787a), s.a("!==", hs.b.f19786a), s.a("!", fs.d.f17778a), s.a("!!", fs.b.f17776a), s.a("and", fs.a.f17775a), s.a("or", fs.e.f17779a), s.a("if", fs.c.f17777a), s.a("cat", ms.a.f25307a), s.a("substr", ms.c.f25308a), s.a("merge", bs.e.f4473a), s.a("in", as.d.f3655a));

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, zr.a> functionalOperations = k0.n(s.a("map", bs.d.f4472a), s.a("filter", bs.c.f4471a), s.a("reduce", bs.g.f4474a), s.a("all", cs.a.f14215a), s.a(PayloadNotificationChannel.SOUND_NONE, cs.b.f14216a), s.a("some", cs.f.f14220a));

        @NotNull
        public final a a(@NotNull String operationName, @NotNull zr.a operation) {
            Intrinsics.checkNotNullParameter(operationName, "operationName");
            Intrinsics.checkNotNullParameter(operation, "operation");
            if (f(operationName)) {
                this.functionalOperations.put(operationName, operation);
            }
            return this;
        }

        @NotNull
        public final a b(@NotNull Map<String, ? extends zr.a> operations) {
            Intrinsics.checkNotNullParameter(operations, "operations");
            for (Map.Entry<String, ? extends zr.a> entry : operations.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @NotNull
        public final a c(@NotNull String operationName, @NotNull zr.b operation) {
            Intrinsics.checkNotNullParameter(operationName, "operationName");
            Intrinsics.checkNotNullParameter(operation, "operation");
            if (f(operationName)) {
                this.standardOperations.put(operationName, operation);
            }
            return this;
        }

        @NotNull
        public final a d(@NotNull Map<String, ? extends zr.b> operations) {
            Intrinsics.checkNotNullParameter(operations, "operations");
            for (Map.Entry<String, ? extends zr.b> entry : operations.entrySet()) {
                c(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @NotNull
        public final i e() {
            this.standardOperations.put("log", new as.e(this.logger));
            return new ur.a(new xr.a(new LogicOperations(this.standardOperations, this.functionalOperations)));
        }

        public final boolean f(String operationName) {
            return (this.functionalOperations.containsKey(operationName) || this.standardOperations.containsKey(operationName)) ? false : true;
        }
    }

    @NotNull
    k a(@NotNull Map<String, ? extends Object> expression, @Nullable Object data);
}
