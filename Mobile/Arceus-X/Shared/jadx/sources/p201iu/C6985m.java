package p201iu;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iu.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\t2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0004\b\f\u0010\r\u001a?\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m31665d2 = {"T", "", "Lkotlin/sequences/Sequence;", "e", "(Ljava/util/Iterator;)Lkotlin/sequences/Sequence;", "g", "()Lkotlin/sequences/Sequence;", "f", "(Lkotlin/sequences/Sequence;)Lkotlin/sequences/Sequence;", "", "Lkotlin/Function0;", "nextFunction", "i", "(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;", "seed", "Lkotlin/Function1;", "h", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/sequences/SequencesKt")
public class C6985m extends C6982j {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: iu.m$a */
    @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"iu/m$a", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a<T> implements Sequence<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Iterator f27262a;

        public a(Iterator it) {
            this.f27262a = it;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return this.f27262a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static <T> Sequence<T> m29376e(@NotNull Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "<this>");
        return m29377f(new a(it));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.sequences.Sequence<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: f */
    public static <T> Sequence<T> m29377f(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        return sequence instanceof C6973a ? sequence : new C6973a(sequence);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static <T> Sequence<T> m29378g() {
        return C6976d.f27242a;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static <T> Sequence<T> m29379h(@Nullable final T t8, @NotNull Function1<? super T, ? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return t8 == null ? C6976d.f27242a : new C6978f(new Function0() { // from class: iu.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C6985m.m29382k(t8);
            }
        }, nextFunction);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static <T> Sequence<T> m29380i(@NotNull final Function0<? extends T> nextFunction) {
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        return m29377f(new C6978f(nextFunction, new Function1() { // from class: iu.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C6985m.m29381j(nextFunction, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public static final Object m29381j(Function0 function0, Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return function0.invoke();
    }

    /* JADX INFO: renamed from: k */
    public static final Object m29382k(Object obj) {
        return obj;
    }
}
