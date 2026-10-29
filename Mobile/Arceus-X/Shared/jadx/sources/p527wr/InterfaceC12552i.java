package p527wr;

import bs.InterfaceC1488a;
import bs.InterfaceC1489b;
import es.C5208a;
import es.C5209b;
import es.C5213f;
import is.C6968b;
import is.C6972f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7690k0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ls.C8246b;
import ls.C8247c;
import ls.C8250f;
import ls.C8252h;
import ls.C8253i;
import ls.C8255k;
import ls.C8256l;
import ms.C8654b;
import ms.C8656d;
import ms.C8658f;
import ms.C8660h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p060cs.C4362d;
import p060cs.C4363e;
import p085ds.C4682c;
import p085ds.C4683d;
import p085ds.C4684e;
import p085ds.C4686g;
import p135fs.C5824a;
import p135fs.C5825b;
import p135fs.C5826c;
import p179hs.C6559a;
import p179hs.C6560b;
import p179hs.C6561c;
import p179hs.C6562d;
import p179hs.C6563e;
import p228js.C7324b;
import p228js.C7326d;
import p229jt.C7352s;
import p343os.C10042a;
import p343os.C10044c;
import p613zr.C14040a;
import p613zr.LogicOperations;

/* JADX INFO: renamed from: wr.i */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J/\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m31665d2 = {"Lwr/i;", "", "", "", "expression", "data", "Lwr/k;", "a", "(Ljava/util/Map;Ljava/lang/Object;)Lwr/k;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC12552i {

    /* JADX INFO: renamed from: wr.i$a */
    @Metadata(m31664d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\n¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u001b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001d¨\u0006 "}, m31665d2 = {"Lwr/i$a;", "", "<init>", "()V", "", "operationName", "Lbs/b;", "operation", "c", "(Ljava/lang/String;Lbs/b;)Lwr/i$a;", "", "operations", "d", "(Ljava/util/Map;)Lwr/i$a;", "Lbs/a;", "a", "(Ljava/lang/String;Lbs/a;)Lwr/i$a;", "b", "Lwr/i;", "e", "()Lwr/i;", "", "f", "(Ljava/lang/String;)Z", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "logger", "", "Ljava/util/Map;", "standardOperations", "functionalOperations", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Function1<Object, Unit> logger;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final Map<String, InterfaceC1489b> standardOperations = C7690k0.m31799n(C7352s.m30477a("var", C5826c.f22225a), C7352s.m30477a("missing_some", C5825b.f22224a), C7352s.m30477a("missing", C5824a.f22223a), C7352s.m30477a(">", C8654b.f31642a), C7352s.m30477a(">=", C8656d.f31643a), C7352s.m30477a("<", C8658f.f31644a), C7352s.m30477a("<=", C8660h.f31645a), C7352s.m30477a("min", C8252h.f30552a), C7352s.m30477a("max", C8250f.f30551a), C7352s.m30477a("+", C8246b.f30549a), C7352s.m30477a("-", C8256l.f30555a), C7352s.m30477a("*", C8255k.f30554a), C7352s.m30477a("/", C8247c.f30550a), C7352s.m30477a("%", C8253i.f30553a), C7352s.m30477a("==", C6968b.f27233a), C7352s.m30477a("!=", C6972f.f27236a), C7352s.m30477a("===", C7326d.f28214a), C7352s.m30477a("!==", C7324b.f28213a), C7352s.m30477a("!", C6562d.f24936a), C7352s.m30477a("!!", C6560b.f24934a), C7352s.m30477a("and", C6559a.f24933a), C7352s.m30477a("or", C6563e.f24937a), C7352s.m30477a("if", C6561c.f24935a), C7352s.m30477a("cat", C10042a.f36172a), C7352s.m30477a("substr", C10044c.f36173a), C7352s.m30477a("merge", C4684e.f19170a), C7352s.m30477a("in", C4362d.f18218a));

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final Map<String, InterfaceC1488a> functionalOperations = C7690k0.m31799n(C7352s.m30477a("map", C4683d.f19169a), C7352s.m30477a("filter", C4682c.f19168a), C7352s.m30477a("reduce", C4686g.f19171a), C7352s.m30477a("all", C5208a.f20251a), C7352s.m30477a("none", C5209b.f20252a), C7352s.m30477a("some", C5213f.f20257a));

        @NotNull
        /* JADX INFO: renamed from: a */
        public final a m46910a(@NotNull String operationName, @NotNull InterfaceC1488a operation) {
            Intrinsics.checkNotNullParameter(operationName, "operationName");
            Intrinsics.checkNotNullParameter(operation, "operation");
            if (m46915f(operationName)) {
                this.functionalOperations.put(operationName, operation);
            }
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a m46911b(@NotNull Map<String, ? extends InterfaceC1488a> operations) {
            Intrinsics.checkNotNullParameter(operations, "operations");
            for (Map.Entry<String, ? extends InterfaceC1488a> entry : operations.entrySet()) {
                m46910a(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m46912c(@NotNull String operationName, @NotNull InterfaceC1489b operation) {
            Intrinsics.checkNotNullParameter(operationName, "operationName");
            Intrinsics.checkNotNullParameter(operation, "operation");
            if (m46915f(operationName)) {
                this.standardOperations.put(operationName, operation);
            }
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a m46913d(@NotNull Map<String, ? extends InterfaceC1489b> operations) {
            Intrinsics.checkNotNullParameter(operations, "operations");
            for (Map.Entry<String, ? extends InterfaceC1489b> entry : operations.entrySet()) {
                m46912c(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final InterfaceC12552i m46914e() {
            this.standardOperations.put("log", new C4363e(this.logger));
            return new C12544a(new C14040a(new LogicOperations(this.standardOperations, this.functionalOperations)));
        }

        /* JADX INFO: renamed from: f */
        public final boolean m46915f(String operationName) {
            return (this.functionalOperations.containsKey(operationName) || this.standardOperations.containsKey(operationName)) ? false : true;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    AbstractC12554k mo46895a(@NotNull Map<String, ? extends Object> expression, @Nullable Object data);
}
