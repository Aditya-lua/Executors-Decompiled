package es;

import ds.ArrayOperationInputData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wr.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u00012\u00020\u0002J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u0004\u0018\u00010\u0003*\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Les/e;", "Lds/f;", "Lks/d;", "Les/c;", "data", "Lwr/l;", "evaluator", "", "e", "(Les/c;Lwr/l;)Ljava/lang/Object;", "expression", "f", "(Ljava/lang/Object;Ljava/lang/Object;Lwr/l;)Ljava/lang/Object;", "", "", "mappingOperation", "", "expressionValues", "", "a", "(Ljava/util/Map;Ljava/util/List;)Ljava/lang/Boolean;", "Lds/b;", "operationInput", "Lkotlin/Function2;", "arrayOperation", "k", "(Lds/b;Lwr/l;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "i", "(Lds/b;)Les/c;", "core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends ds.f, ks.d {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a extends k implements Function2<OccurrenceCheckInputData, l, Object> {
        public a(Object obj) {
            super(2, obj, e.class, "check", "check(Lcom/withpersona/sdk2/jsonlogic/operations/array/occurence/OccurrenceCheckInputData;Lcom/withpersona/sdk2/jsonlogic/LogicEvaluator;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(OccurrenceCheckInputData p8, l p10) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            Intrinsics.checkNotNullParameter(p10, "p1");
            return ((e) this.receiver).e(p8, p10);
        }
    }

    static Object j(e eVar, ArrayOperationInputData input, l logicEvaluator) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(logicEvaluator, "logicEvaluator");
        return eVar.k(input, logicEvaluator, new a(eVar));
    }

    @Override // ds.a
    /* bridge */ /* synthetic */ default Object a(Map map, List list) {
        return a((Map<String, ? extends Object>) map, (List<? extends Object>) list);
    }

    @Nullable
    Object e(@NotNull OccurrenceCheckInputData data, @NotNull l evaluator);

    @Nullable
    default Object f(@Nullable Object expression, @Nullable Object data, @NotNull l evaluator) {
        Intrinsics.checkNotNullParameter(evaluator, "evaluator");
        return h(expression, data, evaluator, new Function2() { // from class: es.d
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return e.j(this.f15778a, (ArrayOperationInputData) obj, (l) obj2);
            }
        });
    }

    default OccurrenceCheckInputData i(ArrayOperationInputData arrayOperationInputData) {
        if (arrayOperationInputData.a() == null || arrayOperationInputData.b() == null || arrayOperationInputData.b().isEmpty()) {
            return null;
        }
        return new OccurrenceCheckInputData(arrayOperationInputData.b(), arrayOperationInputData.a(), arrayOperationInputData.getOperationDefault());
    }

    default Object k(ArrayOperationInputData operationInput, l evaluator, Function2<? super OccurrenceCheckInputData, ? super l, ? extends Object> arrayOperation) {
        Object objInvoke;
        OccurrenceCheckInputData occurrenceCheckInputDataI = i(operationInput);
        return (occurrenceCheckInputDataI == null || (objInvoke = arrayOperation.invoke(occurrenceCheckInputDataI, evaluator)) == null) ? operationInput.getOperationDefault() : objInvoke;
    }

    @Override // ds.a
    @NotNull
    default Boolean a(@Nullable Map<String, ? extends Object> mappingOperation, @NotNull List<? extends Object> expressionValues) {
        Intrinsics.checkNotNullParameter(expressionValues, "expressionValues");
        return Boolean.FALSE;
    }
}
