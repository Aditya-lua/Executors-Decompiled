package es;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p085ds.ArrayOperationInputData;
import p085ds.InterfaceC4685f;
import p254ks.InterfaceC7823d;
import p527wr.InterfaceC12555l;

/* JADX INFO: renamed from: es.e */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u00012\u00020\u0002J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0003*\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, m31665d2 = {"Les/e;", "Lds/f;", "Lks/d;", "Les/c;", "data", "Lwr/l;", "evaluator", "", "e", "(Les/c;Lwr/l;)Ljava/lang/Object;", "expression", "f", "(Ljava/lang/Object;Ljava/lang/Object;Lwr/l;)Ljava/lang/Object;", "", "", "mappingOperation", "", "expressionValues", "", "a", "(Ljava/util/Map;Ljava/util/List;)Ljava/lang/Boolean;", "Lds/b;", "operationInput", "Lkotlin/Function2;", "arrayOperation", "k", "(Lds/b;Lwr/l;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "i", "(Lds/b;)Les/c;", "core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC5212e extends InterfaceC4685f, InterfaceC7823d {

    /* JADX INFO: renamed from: es.e$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class a extends C7744k implements Function2<OccurrenceCheckInputData, InterfaceC12555l, Object> {
        public a(Object obj) {
            super(2, obj, InterfaceC5212e.class, "check", "check(Lcom/withpersona/sdk2/jsonlogic/operations/array/occurence/OccurrenceCheckInputData;Lcom/withpersona/sdk2/jsonlogic/LogicEvaluator;)Ljava/lang/Object;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(OccurrenceCheckInputData p8, InterfaceC12555l p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            return ((InterfaceC5212e) this.receiver).mo24157e(p8, p10);
        }
    }

    /* JADX INFO: renamed from: j */
    static Object m24163j(InterfaceC5212e interfaceC5212e, ArrayOperationInputData input, InterfaceC12555l logicEvaluator) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(logicEvaluator, "logicEvaluator");
        return interfaceC5212e.m24165k(input, logicEvaluator, new a(interfaceC5212e));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085ds.InterfaceC4680a
    /* JADX INFO: renamed from: a */
    /* bridge */ /* synthetic */ default Object mo22971a(Map map, List list) {
        return mo22971a((Map<String, ? extends Object>) map, (List<? extends Object>) list);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    Object mo24157e(@NotNull OccurrenceCheckInputData data, @NotNull InterfaceC12555l evaluator);

    @Nullable
    /* JADX INFO: renamed from: f */
    default Object mo24158f(@Nullable Object expression, @Nullable Object data, @NotNull InterfaceC12555l evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        return mo22978h(expression, data, evaluator, new Function2() { // from class: es.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return InterfaceC5212e.m24163j(this.f20256a, (ArrayOperationInputData) obj, (InterfaceC12555l) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    default OccurrenceCheckInputData m24164i(ArrayOperationInputData arrayOperationInputData) {
        if (arrayOperationInputData.m22973a() == null || arrayOperationInputData.m22974b() == null || arrayOperationInputData.m22974b().isEmpty()) {
            return null;
        }
        return new OccurrenceCheckInputData(arrayOperationInputData.m22974b(), arrayOperationInputData.m22973a(), arrayOperationInputData.getOperationDefault());
    }

    /* JADX INFO: renamed from: k */
    default Object m24165k(ArrayOperationInputData operationInput, InterfaceC12555l evaluator, Function2<? super OccurrenceCheckInputData, ? super InterfaceC12555l, ? extends Object> arrayOperation) {
        Object objInvoke;
        OccurrenceCheckInputData occurrenceCheckInputDataM24164i = m24164i(operationInput);
        return (occurrenceCheckInputDataM24164i == null || (objInvoke = arrayOperation.invoke(occurrenceCheckInputDataM24164i, evaluator)) == null) ? operationInput.getOperationDefault() : objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // p085ds.InterfaceC4680a
    @NotNull
    /* JADX INFO: renamed from: a */
    default Boolean mo22971a(@Nullable Map<String, ? extends Object> mappingOperation, @NotNull List<? extends Object> expressionValues) {
        Intrinsics.checkNotNullParameter(expressionValues, "expressionValues");
        return Boolean.FALSE;
    }
}
