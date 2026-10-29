package p536x5;

import android.annotation.SuppressLint;
import androidx.work.AbstractC1117c;
import androidx.work.C1116b;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C7702q0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7776c0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p120f6.C5390j0;
import p146g6.C6029i;

/* JADX INFO: renamed from: x5.q0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0010\b&\u0018\u0000 \u00102\u00020\u0001:\u0002\u000b\u000eB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048G¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068G¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"Lx5/q0;", "", "Ljava/util/UUID;", "id", "Lf6/j0;", "workSpec", "", "", "tags", "<init>", "(Ljava/util/UUID;Lf6/j0;Ljava/util/Set;)V", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "b", "Lf6/j0;", "d", "()Lf6/j0;", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "()Ljava/lang/String;", "stringId", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public abstract class AbstractC12721q0 {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final UUID id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final C5390j0 workSpec;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Set<String> tags;

    /* JADX INFO: renamed from: x5.q0$a */
    @Metadata(m31664d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\b\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\"¢\u0006\u0004\b'\u0010%J\u001f\u0010(\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00028\u00002\u0006\u0010+\u001a\u00020*H\u0017¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00028\u0001¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00028\u0001H ¢\u0006\u0004\b0\u0010/R\"\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\b2\u00103R\"\u0010:\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010F\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER \u0010K\u001a\b\u0012\u0004\u0012\u00020\"0G8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u00028\u00008 X \u0004¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, m31665d2 = {"Lx5/q0$a;", "B", "Lx5/q0;", "W", "", "Ljava/lang/Class;", "Landroidx/work/c;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Ljava/util/UUID;", "id", "m", "(Ljava/util/UUID;)Lx5/q0$a;", "Lx5/a;", "backoffPolicy", "", "backoffDelay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "i", "(Lx5/a;JLjava/util/concurrent/TimeUnit;)Lx5/q0$a;", "Ljava/time/Duration;", "duration", "j", "(Lx5/a;Ljava/time/Duration;)Lx5/q0$a;", "Lx5/d;", "constraints", "k", "(Lx5/d;)Lx5/q0$a;", "Landroidx/work/b;", "inputData", "o", "(Landroidx/work/b;)Lx5/q0$a;", "", "tag", "a", "(Ljava/lang/String;)Lx5/q0$a;", "traceTag", "p", "n", "(JLjava/util/concurrent/TimeUnit;)Lx5/q0$a;", "Lx5/f0;", "policy", "l", "(Lx5/f0;)Lx5/q0$a;", "b", "()Lx5/q0;", "c", "Ljava/lang/Class;", "getWorkerClass$work_runtime_release", "()Ljava/lang/Class;", "", "Z", "d", "()Z", "setBackoffCriteriaSet$work_runtime_release", "(Z)V", "backoffCriteriaSet", "Ljava/util/UUID;", "e", "()Ljava/util/UUID;", "setId$work_runtime_release", "(Ljava/util/UUID;)V", "Lf6/j0;", "Lf6/j0;", "h", "()Lf6/j0;", "setWorkSpec$work_runtime_release", "(Lf6/j0;)V", "workSpec", "", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "tags", "g", "()Lx5/q0$a;", "thisObject", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static abstract class a<B extends a<B, ?>, W extends AbstractC12721q0> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Class<? extends AbstractC1117c> workerClass;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean backoffCriteriaSet;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public UUID id;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public C5390j0 workSpec;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final Set<String> tags;

        public a(@NotNull Class<? extends AbstractC1117c> workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            this.workerClass = workerClass;
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            this.id = uuidRandomUUID;
            String string = this.id.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            String name = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            this.workSpec = new C5390j0(string, name);
            String name2 = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            this.tags = C7702q0.m31909e(name2);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final B m47408a(@NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.tags.add(tag);
            return (B) mo47375g();
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final W m47409b() {
            W w5 = (W) mo47374c();
            C12694d c12694d = this.workSpec.constraints;
            boolean z10 = c12694d.m47340g() || c12694d.getRequiresBatteryNotLow() || c12694d.getRequiresCharging() || c12694d.getRequiresDeviceIdle();
            C5390j0 c5390j0 = this.workSpec;
            if (c5390j0.expedited) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (c5390j0.initialDelay > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            String traceTag = c5390j0.getTraceTag();
            if (traceTag == null) {
                C5390j0 c5390j1 = this.workSpec;
                c5390j1.m24768u(AbstractC12721q0.INSTANCE.m47423b(c5390j1.workerClassName));
            } else if (traceTag.length() > 127) {
                this.workSpec.m24768u(C7776c0.m32209B1(traceTag, 127));
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            m47418m(uuidRandomUUID);
            return w5;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public abstract W mo47374c();

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getBackoffCriteriaSet() {
            return this.backoffCriteriaSet;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final Set<String> m47412f() {
            return this.tags;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public abstract B mo47375g();

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final C5390j0 getWorkSpec() {
            return this.workSpec;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final B m47414i(@NotNull EnumC12688a backoffPolicy, long backoffDelay, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.backoffCriteriaSet = true;
            C5390j0 c5390j0 = this.workSpec;
            c5390j0.backoffPolicy = backoffPolicy;
            c5390j0.m24763p(timeUnit.toMillis(backoffDelay));
            return (B) mo47375g();
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final B m47415j(@NotNull EnumC12688a backoffPolicy, @NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.backoffCriteriaSet = true;
            C5390j0 c5390j0 = this.workSpec;
            c5390j0.backoffPolicy = backoffPolicy;
            c5390j0.m24763p(C6029i.m26824a(duration));
            return (B) mo47375g();
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final B m47416k(@NotNull C12694d constraints) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.workSpec.constraints = constraints;
            return (B) mo47375g();
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @NotNull
        /* JADX INFO: renamed from: l */
        public B m47417l(@NotNull EnumC12699f0 policy) {
            Intrinsics.checkNotNullParameter(policy, "policy");
            C5390j0 c5390j0 = this.workSpec;
            c5390j0.expedited = true;
            c5390j0.outOfQuotaPolicy = policy;
            return (B) mo47375g();
        }

        @NotNull
        /* JADX INFO: renamed from: m */
        public final B m47418m(@NotNull UUID id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.id = id2;
            String string = id2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            this.workSpec = new C5390j0(string, this.workSpec);
            return (B) mo47375g();
        }

        @NotNull
        /* JADX INFO: renamed from: n */
        public B m47419n(long duration, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.initialDelay = timeUnit.toMillis(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.initialDelay) {
                return (B) mo47375g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        @NotNull
        /* JADX INFO: renamed from: o */
        public final B m47420o(@NotNull C1116b inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.workSpec.input = inputData;
            return (B) mo47375g();
        }

        @NotNull
        /* JADX INFO: renamed from: p */
        public final B m47421p(@NotNull String traceTag) {
            Intrinsics.checkNotNullParameter(traceTag, "traceTag");
            this.workSpec.m24768u(traceTag);
            return (B) mo47375g();
        }
    }

    /* JADX INFO: renamed from: x5.q0$b, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m31665d2 = {"Lx5/q0$b;", "", "<init>", "()V", "", "workerClassName", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "DEFAULT_BACKOFF_DELAY_MILLIS", "J", "MAX_BACKOFF_MILLIS", "MIN_BACKOFF_MILLIS", "", "MAX_TRACE_SPAN_LENGTH", "I", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: x5.q0.b.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final String m47423b(String workerClassName) {
            List listSplit$default = StringsKt.split$default(workerClassName, new String[]{"."}, false, 0, 6, null);
            String str = listSplit$default.size() == 1 ? (String) listSplit$default.get(0) : (String) CollectionsKt.m31717o0(listSplit$default);
            return str.length() <= 127 ? str : C7776c0.m32209B1(str, 127);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    public AbstractC12721q0(@NotNull UUID id2, @NotNull C5390j0 workSpec, @NotNull Set<String> tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.id = id2;
        this.workSpec = workSpec;
        this.tags = tags;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public UUID getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m47405b() {
        String string = getId().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<String> m47406c() {
        return this.tags;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final C5390j0 getWorkSpec() {
        return this.workSpec;
    }
}
