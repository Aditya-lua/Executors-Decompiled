package ms;

import com.github.luben.zstd.BuildConfig;
import com.roblox.client.pushnotification.v2.model.PayloadNotificationChannel;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.k0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;
import ps.LogicOperations;
import zt.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J/\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lms/i;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "expression", "data", "Lms/k;", "a", "(Ljava/util/Map;Ljava/lang/Object;)Lms/k;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u001b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006 "}, d2 = {"Lms/i$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "operationName", "Lrs/b;", "operation", "c", "(Ljava/lang/String;Lrs/b;)Lms/i$a;", BuildConfig.FLAVOR, "operations", "d", "(Ljava/util/Map;)Lms/i$a;", "Lrs/a;", "a", "(Ljava/lang/String;Lrs/a;)Lms/i$a;", "b", "Lms/i;", "e", "()Lms/i;", BuildConfig.FLAVOR, "f", "(Ljava/lang/String;)Z", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lkotlin/jvm/functions/Function1;", "logger", BuildConfig.FLAVOR, "Ljava/util/Map;", "standardOperations", "functionalOperations", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Function1<Object, Unit> logger;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Map<String, rs.b> standardOperations = k0.o(s.a("var", vs.c.f35419a), s.a("missing_some", vs.b.f35418a), s.a("missing", vs.a.f35417a), s.a(">", ct.b.f11527a), s.a(">=", ct.d.f11528a), s.a("<", ct.f.f11529a), s.a("<=", ct.h.f11530a), s.a("min", bt.h.f4587a), s.a("max", bt.f.f4586a), s.a("+", bt.b.f4584a), s.a("-", bt.l.f4590a), s.a("*", bt.k.f4589a), s.a("/", bt.c.f4585a), s.a("%", bt.i.f4588a), s.a("==", ys.b.f38177a), s.a("!=", ys.f.f38179a), s.a("===", zs.d.f39473a), s.a("!==", zs.b.f39472a), s.a("!", xs.d.f37096a), s.a("!!", xs.b.f37094a), s.a("and", xs.a.f37093a), s.a("or", xs.e.f37097a), s.a("if", xs.c.f37095a), s.a("cat", et.a.f14678a), s.a("substr", et.c.f14679a), s.a("merge", ts.e.f32842a), s.a("in", ss.d.f31906a));

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, rs.a> functionalOperations = k0.o(s.a("map", ts.d.f32841a), s.a("filter", ts.c.f32840a), s.a("reduce", ts.g.f32843a), s.a("all", us.a.f33943a), s.a(PayloadNotificationChannel.SOUND_NONE, us.b.f33944a), s.a("some", us.f.f33948a));

        @NotNull
        public final a a(@NotNull String operationName, @NotNull rs.a operation) {
            Intrinsics.checkNotNullParameter(operationName, "operationName");
            Intrinsics.checkNotNullParameter(operation, "operation");
            if (f(operationName)) {
                this.functionalOperations.put(operationName, operation);
            }
            return this;
        }

        @NotNull
        public final a b(@NotNull Map<String, ? extends rs.a> operations) {
            Intrinsics.checkNotNullParameter(operations, "operations");
            for (Map.Entry<String, ? extends rs.a> entry : operations.entrySet()) {
                a(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @NotNull
        public final a c(@NotNull String operationName, @NotNull rs.b operation) {
            Intrinsics.checkNotNullParameter(operationName, "operationName");
            Intrinsics.checkNotNullParameter(operation, "operation");
            if (f(operationName)) {
                this.standardOperations.put(operationName, operation);
            }
            return this;
        }

        @NotNull
        public final a d(@NotNull Map<String, ? extends rs.b> operations) {
            Intrinsics.checkNotNullParameter(operations, "operations");
            for (Map.Entry<String, ? extends rs.b> entry : operations.entrySet()) {
                c(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @NotNull
        public final i e() {
            this.standardOperations.put("log", new ss.e(this.logger));
            return new ms.a(new ps.a(new LogicOperations(this.standardOperations, this.functionalOperations)));
        }

        public final boolean f(String operationName) {
            return (this.functionalOperations.containsKey(operationName) || this.standardOperations.containsKey(operationName)) ? false : true;
        }
    }

    @NotNull
    k a(@NotNull Map<String, ? extends Object> expression, @Nullable Object data);
}
