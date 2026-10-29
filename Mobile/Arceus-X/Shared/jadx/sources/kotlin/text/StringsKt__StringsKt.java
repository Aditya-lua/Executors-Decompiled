package kotlin.text;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7691l;
import kotlin.collections.C7693m;
import kotlin.collections.C7697o;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7761a;
import kotlin.ranges.C7764d;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p201iu.C6988p;
import p229jt.C7352s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000^\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0014\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0017\u001a\u00020\u0000*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010\u001c\u001a#\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b \u0010\u001e\u001a#\u0010!\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b!\u0010\u001c\u001a#\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010\u001e\u001a#\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b#\u0010\u001c\u001a#\u0010$\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b$\u0010\u001e\u001a)\u0010(\u001a\u00020\b*\u00020\b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\b¢\u0006\u0004\b(\u0010)\u001a\u0019\u0010+\u001a\u00020\u0000*\u00020\u00002\u0006\u0010*\u001a\u00020\b¢\u0006\u0004\b+\u0010,\u001a\u0019\u0010.\u001a\u00020\u0000*\u00020\u00002\u0006\u0010-\u001a\u00020\b¢\u0006\u0004\b.\u0010,\u001a!\u0010/\u001a\u00020\u0000*\u00020\u00002\u0006\u0010*\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b¢\u0006\u0004\b/\u00100\u001a\u0019\u00101\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b1\u0010,\u001a;\u00106\u001a\u00020\u0012*\u00020\b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u0012H\u0000¢\u0006\u0004\b6\u00107\u001a#\u00109\u001a\u00020\u0012*\u00020\b2\u0006\u00108\u001a\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\b9\u0010:\u001a#\u0010;\u001a\u00020\u0012*\u00020\b2\u0006\u00108\u001a\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\b;\u0010:\u001a#\u0010<\u001a\u00020\u0012*\u00020\b2\u0006\u0010*\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\b<\u0010=\u001a#\u0010>\u001a\u00020\u0012*\u00020\b2\u0006\u0010-\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\b>\u0010=\u001a-\u0010?\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\b?\u0010@\u001a-\u0010A\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\bA\u0010@\u001a=\u0010C\u001a\u00020\u000b*\u00020\b2\u0006\u00103\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u00122\b\b\u0002\u0010B\u001a\u00020\u0012H\u0002¢\u0006\u0004\bC\u0010D\u001aG\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010G*\u00020\b2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00000E2\u0006\u0010%\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u0012H\u0002¢\u0006\u0004\bH\u0010I\u001a-\u0010J\u001a\u00020\u000b*\u00020\b2\u0006\u00108\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\bJ\u0010K\u001a-\u0010M\u001a\u00020\u000b*\u00020\b2\u0006\u0010L\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\bM\u0010N\u001a-\u0010O\u001a\u00020\u000b*\u00020\b2\u0006\u00108\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\bO\u0010K\u001a-\u0010P\u001a\u00020\u000b*\u00020\b2\u0006\u0010L\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\bP\u0010N\u001a&\u0010Q\u001a\u00020\u0012*\u00020\b2\u0006\u00103\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\bQ\u0010=\u001a&\u0010R\u001a\u00020\u0012*\u00020\b2\u0006\u00108\u001a\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\bR\u0010:\u001a?\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00150U*\u00020\b2\u0006\u0010S\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u0010T\u001a\u00020\u000bH\u0002¢\u0006\u0004\bV\u0010W\u001aG\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00150U*\u00020\b2\u000e\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000X2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u0010T\u001a\u00020\u000bH\u0002¢\u0006\u0004\bY\u0010Z\u001a\u0017\u0010\\\u001a\u00020[2\u0006\u0010T\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\\\u0010]\u001a?\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00000^*\u00020\b2\u0012\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000X\"\u00020\u00002\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u0010T\u001a\u00020\u000b¢\u0006\u0004\b_\u0010`\u001a7\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00000U*\u00020\b2\n\u0010S\u001a\u00020\u0001\"\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u0010T\u001a\u00020\u000b¢\u0006\u0004\ba\u0010b\u001a7\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00000^*\u00020\b2\n\u0010S\u001a\u00020\u0001\"\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u0010T\u001a\u00020\u000b¢\u0006\u0004\bc\u0010d\u001a1\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00000^*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\u000bH\u0002¢\u0006\u0004\be\u0010f\u001a\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00000U*\u00020\b¢\u0006\u0004\bg\u0010h\u001a\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00000^*\u00020\b¢\u0006\u0004\bi\u0010j\u001a\u001f\u0010k\u001a\u00020\u0012*\u0004\u0018\u00010\b2\b\u00103\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\bk\u0010l\u001a\u0015\u0010m\u001a\u0004\u0018\u00010\u0012*\u00020\u0000H\u0007¢\u0006\u0004\bm\u0010n\"\u0015\u0010q\u001a\u00020\u000b*\u00020\b8F¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006r"}, m31665d2 = {"", "", "", "chars", "q1", "(Ljava/lang/String;[C)Ljava/lang/String;", "s1", "r1", "", "p1", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "length", "padChar", "x0", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", "y0", "(Ljava/lang/String;IC)Ljava/lang/String;", "", "p0", "(Ljava/lang/CharSequence;)Z", "Lkotlin/ranges/IntRange;", "range", "X0", "(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;", "delimiter", "missingDelimiterValue", "g1", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "h1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Y0", "Z0", "k1", "l1", "c1", "d1", "startIndex", "endIndex", "replacement", "K0", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "prefix", "G0", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "suffix", "H0", "J0", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "I0", "thisOffset", "other", "otherOffset", "ignoreCase", "F0", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "char", "T0", "(Ljava/lang/CharSequence;CZ)Z", "c0", "U0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "d0", "o0", "(Ljava/lang/CharSequence;[CIZ)I", "u0", "last", "k0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Lkotlin/Pair;", "g0", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/Pair;", "i0", "(Ljava/lang/CharSequence;CIZ)I", InquiryField.StringField.TYPE, "j0", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "q0", "r0", "Y", "X", "delimiters", "limit", "Lkotlin/sequences/Sequence;", "z0", "(Ljava/lang/CharSequence;[CIZI)Lkotlin/sequences/Sequence;", "", "A0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "", "L0", "(I)V", "", "N0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "Q0", "(Ljava/lang/CharSequence;[CZI)Lkotlin/sequences/Sequence;", "M0", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "O0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "v0", "(Ljava/lang/CharSequence;)Lkotlin/sequences/Sequence;", "w0", "(Ljava/lang/CharSequence;)Ljava/util/List;", "b0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "o1", "(Ljava/lang/String;)Ljava/lang/Boolean;", "h0", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, m31666k = 5, m31667mv = {2, 2, 0}, m31669xi = 49, m31670xs = "kotlin/text/StringsKt")
public class StringsKt__StringsKt extends C7797x {

    /* JADX INFO: renamed from: kotlin.text.StringsKt__StringsKt$a */
    @Metadata(m31664d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31665d2 = {"kotlin/text/StringsKt__StringsKt$a", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C7770a implements Sequence<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CharSequence f29477a;

        public C7770a(CharSequence charSequence) {
            this.f29477a = charSequence;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<String> iterator() {
            return new C7781h(this.f29477a);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static final Sequence<IntRange> m32120A0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        m32131L0(i11);
        final List listM31810e = C7691l.m31810e(strArr);
        return new C7775c(charSequence, i10, i11, new Function2() { // from class: kotlin.text.z
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringsKt__StringsKt.m32124E0(listM31810e, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: B0 */
    public static /* synthetic */ Sequence m32121B0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m32196z0(charSequence, cArr, i10, z10, i11);
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ Sequence m32122C0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return m32120A0(charSequence, strArr, i10, z10, i11);
    }

    /* JADX INFO: renamed from: D0 */
    public static final Pair m32123D0(char[] cArr, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iM32180o0 = m32180o0(DelimitedRangesSequence, cArr, i10, z10);
        if (iM32180o0 < 0) {
            return null;
        }
        return C7352s.m30477a(Integer.valueOf(iM32180o0), 1);
    }

    /* JADX INFO: renamed from: E0 */
    public static final Pair m32124E0(List list, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair<Integer, String> pairM32164g0 = m32164g0(DelimitedRangesSequence, list, i10, z10, false);
        if (pairM32164g0 != null) {
            return C7352s.m30477a(pairM32164g0.m31673c(), Integer.valueOf(pairM32164g0.m31674d().length()));
        }
        return null;
    }

    /* JADX INFO: renamed from: F0 */
    public static final boolean m32125F0(@NotNull CharSequence charSequence, int i10, @NotNull CharSequence other, int i11, int i12, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!C7773b.m32200d(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: G0 */
    public static String m32126G0(@NotNull String str, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!m32145W0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    /* JADX INFO: renamed from: H0 */
    public static String m32127H0(@NotNull String str, @NotNull CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!m32162f0(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    /* JADX INFO: renamed from: I0 */
    public static String m32128I0(@NotNull String str, @NotNull CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return m32129J0(str, delimiter, delimiter);
    }

    @NotNull
    /* JADX INFO: renamed from: J0 */
    public static final String m32129J0(@NotNull String str, @NotNull CharSequence prefix, @NotNull CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !m32145W0(str, prefix, false, 2, null) || !m32162f0(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    /* JADX INFO: renamed from: K0 */
    public static final CharSequence m32130K0(@NotNull CharSequence charSequence, int i10, int i11, @NotNull CharSequence replacement) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        if (i11 >= i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i10);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(replacement);
            sb2.append(charSequence, i11, charSequence.length());
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    /* JADX INFO: renamed from: L0 */
    public static final void m32131L0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    @NotNull
    /* JADX INFO: renamed from: M0 */
    public static final List<String> m32132M0(@NotNull CharSequence charSequence, @NotNull char[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return m32134O0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableM29386n = C6988p.m29386n(m32121B0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(C7701q.m31905u(iterableM29386n, 10));
        Iterator it = iterableM29386n.iterator();
        while (it.hasNext()) {
            arrayList.add(m32147X0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    @NotNull
    /* JADX INFO: renamed from: N0 */
    public static final List<String> m32133N0(@NotNull CharSequence charSequence, @NotNull String[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return m32134O0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableM29386n = C6988p.m29386n(m32122C0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(C7701q.m31905u(iterableM29386n, 10));
        Iterator it = iterableM29386n.iterator();
        while (it.hasNext()) {
            arrayList.add(m32147X0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O0 */
    public static final List<String> m32134O0(CharSequence charSequence, String str, boolean z10, int i10) {
        m32131L0(i10);
        int length = 0;
        int iM32170j0 = m32170j0(charSequence, str, 0, z10);
        if (iM32170j0 == -1 || i10 == 1) {
            return C7697o.m31878d(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? C7764d.m32081f(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iM32170j0).toString());
            length = str.length() + iM32170j0;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iM32170j0 = m32170j0(charSequence, str, length, z10);
        } while (iM32170j0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ List m32135P0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m32132M0(charSequence, cArr, z10, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: Q0 */
    public static final Sequence<String> m32136Q0(@NotNull final CharSequence charSequence, @NotNull char[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return C6988p.m29396x(m32121B0(charSequence, delimiters, 0, z10, i10, 2, null), new Function1() { // from class: kotlin.text.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StringsKt__StringsKt.m32138S0(charSequence, (IntRange) obj);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ Sequence m32137R0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m32136Q0(charSequence, cArr, z10, i10);
    }

    /* JADX INFO: renamed from: S0 */
    public static final String m32138S0(CharSequence charSequence, IntRange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return m32147X0(charSequence, it);
    }

    /* JADX INFO: renamed from: T0 */
    public static final boolean m32139T0(@NotNull CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && C7773b.m32200d(charSequence.charAt(0), c10, z10);
    }

    /* JADX INFO: renamed from: U0 */
    public static final boolean m32141U0(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? C7797x.m32309T((String) charSequence, (String) prefix, false, 2, null) : m32125F0(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ boolean m32143V0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m32139T0(charSequence, c10, z10);
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ boolean m32145W0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m32141U0(charSequence, charSequence2, z10);
    }

    /* JADX INFO: renamed from: X */
    public static final boolean m32146X(@NotNull CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return m32176m0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    @NotNull
    /* JADX INFO: renamed from: X0 */
    public static final String m32147X0(@NotNull CharSequence charSequence, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.mo27446b().intValue(), range.mo27447c().intValue() + 1).toString();
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m32148Y(@NotNull CharSequence charSequence, @NotNull CharSequence other, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            return m32178n0(charSequence, (String) other, 0, z10, 2, null) >= 0;
        }
        return m32174l0(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0;
    }

    @NotNull
    /* JADX INFO: renamed from: Y0 */
    public static final String m32149Y0(@NotNull String str, char c10, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iM32176m0 = m32176m0(str, c10, 0, false, 6, null);
        if (iM32176m0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM32176m0 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ boolean m32150Z(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m32146X(charSequence, c10, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: Z0 */
    public static String m32151Z0(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iM32178n0 = m32178n0(str, delimiter, 0, false, 6, null);
        if (iM32178n0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM32178n0 + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ boolean m32152a0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m32148Y(charSequence, charSequence2, z10);
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ String m32153a1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m32149Y0(str, c10, str2);
    }

    /* JADX INFO: renamed from: b0 */
    public static final boolean m32154b0(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return Intrinsics.m31980c(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ String m32155b1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m32151Z0(str, str2, str3);
    }

    /* JADX INFO: renamed from: c0 */
    public static final boolean m32156c0(@NotNull CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && C7773b.m32200d(charSequence.charAt(m32166h0(charSequence)), c10, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: c1 */
    public static String m32157c1(@NotNull String str, char c10, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iM32188s0 = m32188s0(str, c10, 0, false, 6, null);
        if (iM32188s0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM32188s0 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: d0 */
    public static final boolean m32158d0(@NotNull CharSequence charSequence, @NotNull CharSequence suffix, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? C7797x.m32293D((String) charSequence, (String) suffix, false, 2, null) : m32125F0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    @NotNull
    /* JADX INFO: renamed from: d1 */
    public static final String m32159d1(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iM32190t0 = m32190t0(str, delimiter, 0, false, 6, null);
        if (iM32190t0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM32190t0 + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ boolean m32160e0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m32156c0(charSequence, c10, z10);
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ String m32161e1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m32157c1(str, c10, str2);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ boolean m32162f0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return m32158d0(charSequence, charSequence2, z10);
    }

    /* JADX INFO: renamed from: f1 */
    public static /* synthetic */ String m32163f1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m32159d1(str, str2, str3);
    }

    /* JADX INFO: renamed from: g0 */
    public static final Pair<Integer, String> m32164g0(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        CharSequence charSequence2;
        Object next;
        boolean z12;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) CollectionsKt.m31728z0(collection);
            int iM32178n0 = !z11 ? m32178n0(charSequence, str, i10, false, 4, null) : m32190t0(charSequence, str, i10, false, 4, null);
            if (iM32178n0 < 0) {
                return null;
            }
            return C7352s.m30477a(Integer.valueOf(iM32178n0), str);
        }
        CharSequence charSequence3 = charSequence;
        C7761a intRange = !z11 ? new IntRange(C7764d.m32078c(i10, 0), charSequence3.length()) : C7764d.m32089n(C7764d.m32081f(i10, m32166h0(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iM32067d = intRange.getFirst();
            int iM32068e = intRange.getLast();
            int iM32069f = intRange.getStep();
            if ((iM32069f > 0 && iM32067d <= iM32068e) || (iM32069f < 0 && iM32068e <= iM32067d)) {
                int i11 = iM32067d;
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z12 = z10;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z12 = z10;
                        if (C7797x.m32297H(str2, 0, (String) charSequence3, i11, str2.length(), z12)) {
                            break;
                        }
                        z10 = z12;
                    }
                    String str3 = (String) next2;
                    if (str3 != null) {
                        return C7352s.m30477a(Integer.valueOf(i11), str3);
                    }
                    if (i11 != iM32068e) {
                        i11 += iM32069f;
                        z10 = z12;
                    }
                }
            }
        } else {
            boolean z13 = z10;
            int iM32067d2 = intRange.getFirst();
            int iM32068e2 = intRange.getLast();
            int iM32069f2 = intRange.getStep();
            if ((iM32069f2 > 0 && iM32067d2 <= iM32068e2) || (iM32069f2 < 0 && iM32068e2 <= iM32067d2)) {
                int i12 = iM32067d2;
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z14 = z13;
                        charSequence2 = charSequence3;
                        z13 = z14;
                        if (m32125F0(str4, 0, charSequence2, i12, str4.length(), z14)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 != null) {
                        return C7352s.m30477a(Integer.valueOf(i12), str5);
                    }
                    if (i12 != iM32068e2) {
                        i12 += iM32069f2;
                        charSequence3 = charSequence2;
                    }
                }
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: g1 */
    public static final String m32165g1(@NotNull String str, char c10, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iM32176m0 = m32176m0(str, c10, 0, false, 6, null);
        if (iM32176m0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM32176m0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: h0 */
    public static final int m32166h0(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    @NotNull
    /* JADX INFO: renamed from: h1 */
    public static final String m32167h1(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iM32178n0 = m32178n0(str, delimiter, 0, false, 6, null);
        if (iM32178n0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM32178n0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: i0 */
    public static final int m32168i0(@NotNull CharSequence charSequence, char c10, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? m32180o0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    /* JADX INFO: renamed from: i1 */
    public static /* synthetic */ String m32169i1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m32165g1(str, c10, str2);
    }

    /* JADX INFO: renamed from: j0 */
    public static final int m32170j0(@NotNull CharSequence charSequence, @NotNull String string, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z10 || !(charSequence instanceof String)) ? m32174l0(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    /* JADX INFO: renamed from: j1 */
    public static /* synthetic */ String m32171j1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m32167h1(str, str2, str3);
    }

    /* JADX INFO: renamed from: k0 */
    public static final int m32172k0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        C7761a intRange = !z11 ? new IntRange(C7764d.m32078c(i10, 0), C7764d.m32081f(i11, charSequence.length())) : C7764d.m32089n(C7764d.m32081f(i10, m32166h0(charSequence)), C7764d.m32078c(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iM32067d = intRange.getFirst();
            int iM32068e = intRange.getLast();
            int iM32069f = intRange.getStep();
            if ((iM32069f <= 0 || iM32067d > iM32068e) && (iM32069f >= 0 || iM32068e > iM32067d)) {
                return -1;
            }
            int i12 = iM32067d;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z10;
                if (C7797x.m32297H(str, 0, (String) charSequence, i12, str.length(), z12)) {
                    return i12;
                }
                if (i12 == iM32068e) {
                    return -1;
                }
                i12 += iM32069f;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int iM32067d2 = intRange.getFirst();
            int iM32068e2 = intRange.getLast();
            int iM32069f2 = intRange.getStep();
            if ((iM32069f2 <= 0 || iM32067d2 > iM32068e2) && (iM32069f2 >= 0 || iM32068e2 > iM32067d2)) {
                return -1;
            }
            int i13 = iM32067d2;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (m32125F0(charSequence4, 0, charSequence3, i13, charSequence2.length(), z14)) {
                    return i13;
                }
                if (i13 == iM32068e2) {
                    return -1;
                }
                i13 += iM32069f2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: k1 */
    public static final String m32173k1(@NotNull String str, char c10, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iM32188s0 = m32188s0(str, c10, 0, false, 6, null);
        if (iM32188s0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM32188s0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ int m32174l0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return m32172k0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: l1 */
    public static final String m32175l1(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iM32190t0 = m32190t0(str, delimiter, 0, false, 6, null);
        if (iM32190t0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM32190t0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ int m32176m0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m32168i0(charSequence, c10, i10, z10);
    }

    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ String m32177m1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return m32173k1(str, c10, str2);
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ int m32178n0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m32170j0(charSequence, str, i10, z10);
    }

    /* JADX INFO: renamed from: n1 */
    public static /* synthetic */ String m32179n1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m32175l1(str, str2, str3);
    }

    /* JADX INFO: renamed from: o0 */
    public static final int m32180o0(@NotNull CharSequence charSequence, @NotNull char[] chars, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C7693m.m31859b0(chars), i10);
        }
        int iM32078c = C7764d.m32078c(i10, 0);
        int iM32166h0 = m32166h0(charSequence);
        if (iM32078c > iM32166h0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iM32078c);
            for (char c10 : chars) {
                if (C7773b.m32200d(c10, cCharAt, z10)) {
                    return iM32078c;
                }
            }
            if (iM32078c == iM32166h0) {
                return -1;
            }
            iM32078c++;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: o1 */
    public static Boolean m32181o1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.m31980c(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.m31980c(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX INFO: renamed from: p0 */
    public static boolean m32182p0(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!CharsKt__CharJVMKt.m32098c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: p1 */
    public static CharSequence m32183p1(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zM32098c = CharsKt__CharJVMKt.m32098c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zM32098c) {
                    break;
                }
                length--;
            } else if (zM32098c) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    /* JADX INFO: renamed from: q0 */
    public static final int m32184q0(@NotNull CharSequence charSequence, char c10, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? m32191u0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: q1 */
    public static String m32185q1(@NotNull String str, @NotNull char... chars) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zM31835D = C7693m.m31835D(chars, str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zM31835D) {
                    break;
                }
                length--;
            } else if (zM31835D) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    /* JADX INFO: renamed from: r0 */
    public static final int m32186r0(@NotNull CharSequence charSequence, @NotNull String string, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z10 || !(charSequence instanceof String)) ? m32172k0(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    @NotNull
    /* JADX INFO: renamed from: r1 */
    public static String m32187r1(@NotNull String str, @NotNull char... chars) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i10 = length - 1;
            if (!C7693m.m31835D(chars, str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i10 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i10;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ int m32188s0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m32166h0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m32184q0(charSequence, c10, i10, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: s1 */
    public static String m32189s1(@NotNull String str, @NotNull char... chars) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!C7693m.m31835D(chars, str.charAt(i10))) {
                charSequenceSubSequence = str.subSequence(i10, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    public static /* synthetic */ List split$default(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m32133N0(charSequence, strArr, z10, i10);
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ int m32190t0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = m32166h0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m32186r0(charSequence, str, i10, z10);
    }

    /* JADX INFO: renamed from: u0 */
    public static final int m32191u0(@NotNull CharSequence charSequence, @NotNull char[] chars, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(C7693m.m31859b0(chars), i10);
        }
        for (int iM32081f = C7764d.m32081f(i10, m32166h0(charSequence)); -1 < iM32081f; iM32081f--) {
            char cCharAt = charSequence.charAt(iM32081f);
            for (char c10 : chars) {
                if (C7773b.m32200d(c10, cCharAt, z10)) {
                    return iM32081f;
                }
            }
        }
        return -1;
    }

    @NotNull
    /* JADX INFO: renamed from: v0 */
    public static final Sequence<String> m32192v0(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new C7770a(charSequence);
    }

    @NotNull
    /* JADX INFO: renamed from: w0 */
    public static List<String> m32193w0(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return C6988p.m29398z(m32192v0(charSequence));
    }

    @NotNull
    /* JADX INFO: renamed from: x0 */
    public static final CharSequence m32194x0(@NotNull CharSequence charSequence, int i10, char c10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    @NotNull
    /* JADX INFO: renamed from: y0 */
    public static String m32195y0(@NotNull String str, int i10, char c10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return m32194x0(str, i10, c10).toString();
    }

    /* JADX INFO: renamed from: z0 */
    public static final Sequence<IntRange> m32196z0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        m32131L0(i11);
        return new C7775c(charSequence, i10, i11, new Function2() { // from class: kotlin.text.y
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringsKt__StringsKt.m32123D0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }
}
