package kotlin.text;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0014\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0017\u001a\u00020\u0000*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u001b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u001d\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\u001f\u0010\u001c\u001a#\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b \u0010\u001e\u001a#\u0010!\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b!\u0010\u001c\u001a#\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010\u001e\u001a#\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b#\u0010\u001c\u001a#\u0010$\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u0000¢\u0006\u0004\b$\u0010\u001e\u001a)\u0010(\u001a\u00020\b*\u00020\b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020\b¢\u0006\u0004\b(\u0010)\u001a\u0019\u0010+\u001a\u00020\u0000*\u00020\u00002\u0006\u0010*\u001a\u00020\b¢\u0006\u0004\b+\u0010,\u001a\u0019\u0010.\u001a\u00020\u0000*\u00020\u00002\u0006\u0010-\u001a\u00020\b¢\u0006\u0004\b.\u0010,\u001a!\u0010/\u001a\u00020\u0000*\u00020\u00002\u0006\u0010*\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b¢\u0006\u0004\b/\u00100\u001a\u0019\u00101\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b1\u0010,\u001a;\u00106\u001a\u00020\u0012*\u00020\b2\u0006\u00102\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u0012H\u0000¢\u0006\u0004\b6\u00107\u001a#\u00109\u001a\u00020\u0012*\u00020\b2\u0006\u00108\u001a\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\b9\u0010:\u001a#\u0010;\u001a\u00020\u0012*\u00020\b2\u0006\u00108\u001a\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\b;\u0010:\u001a#\u0010<\u001a\u00020\u0012*\u00020\b2\u0006\u0010*\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\b<\u0010=\u001a#\u0010>\u001a\u00020\u0012*\u00020\b2\u0006\u0010-\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\b>\u0010=\u001a-\u0010?\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\b?\u0010@\u001a-\u0010A\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\bA\u0010@\u001a=\u0010C\u001a\u00020\u000b*\u00020\b2\u0006\u00103\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u00122\b\b\u0002\u0010B\u001a\u00020\u0012H\u0002¢\u0006\u0004\bC\u0010D\u001aG\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010G*\u00020\b2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00000E2\u0006\u0010%\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u00122\u0006\u0010B\u001a\u00020\u0012H\u0002¢\u0006\u0004\bH\u0010I\u001a-\u0010J\u001a\u00020\u000b*\u00020\b2\u0006\u00108\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\bJ\u0010K\u001a-\u0010M\u001a\u00020\u000b*\u00020\b2\u0006\u0010L\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\bM\u0010N\u001a-\u0010O\u001a\u00020\u000b*\u00020\b2\u0006\u00108\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\bO\u0010K\u001a-\u0010P\u001a\u00020\u000b*\u00020\b2\u0006\u0010L\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u0012¢\u0006\u0004\bP\u0010N\u001a&\u0010Q\u001a\u00020\u0012*\u00020\b2\u0006\u00103\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\bQ\u0010=\u001a&\u0010R\u001a\u00020\u0012*\u00020\b2\u0006\u00108\u001a\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\bR\u0010:\u001a?\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00150U*\u00020\b2\u0006\u0010S\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u0010T\u001a\u00020\u000bH\u0002¢\u0006\u0004\bV\u0010W\u001aG\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00150U*\u00020\b2\u000e\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000X2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u0010T\u001a\u00020\u000bH\u0002¢\u0006\u0004\bY\u0010Z\u001a\u0017\u0010\\\u001a\u00020[2\u0006\u0010T\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\\\u0010]\u001a?\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00000^*\u00020\b2\u0012\u0010S\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000X\"\u00020\u00002\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u0010T\u001a\u00020\u000b¢\u0006\u0004\b_\u0010`\u001a7\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00000U*\u00020\b2\n\u0010S\u001a\u00020\u0001\"\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u0010T\u001a\u00020\u000b¢\u0006\u0004\ba\u0010b\u001a7\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00000^*\u00020\b2\n\u0010S\u001a\u00020\u0001\"\u00020\u00022\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u0010T\u001a\u00020\u000b¢\u0006\u0004\bc\u0010d\u001a1\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00000^*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\u000bH\u0002¢\u0006\u0004\be\u0010f\u001a\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00000U*\u00020\b¢\u0006\u0004\bg\u0010h\u001a\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00000^*\u00020\b¢\u0006\u0004\bi\u0010j\u001a\u001f\u0010k\u001a\u00020\u0012*\u0004\u0018\u00010\b2\b\u00103\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\bk\u0010l\u001a\u0015\u0010m\u001a\u0004\u0018\u00010\u0012*\u00020\u0000H\u0007¢\u0006\u0004\bm\u0010n\"\u0015\u0010q\u001a\u00020\u000b*\u00020\b8F¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006r"}, d2 = {"", "", "", "chars", "q1", "(Ljava/lang/String;[C)Ljava/lang/String;", "s1", "r1", "", "p1", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "length", "padChar", "x0", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", "y0", "(Ljava/lang/String;IC)Ljava/lang/String;", "", "p0", "(Ljava/lang/CharSequence;)Z", "Lkotlin/ranges/IntRange;", "range", "X0", "(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;", "delimiter", "missingDelimiterValue", "g1", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "h1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Y0", "Z0", "k1", "l1", "c1", "d1", "startIndex", "endIndex", "replacement", "K0", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "prefix", "G0", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "suffix", "H0", "J0", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "I0", "thisOffset", "other", "otherOffset", "ignoreCase", "F0", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "char", "T0", "(Ljava/lang/CharSequence;CZ)Z", "c0", "U0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "d0", "o0", "(Ljava/lang/CharSequence;[CIZ)I", "u0", "last", "k0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Lkotlin/Pair;", "g0", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/Pair;", "i0", "(Ljava/lang/CharSequence;CIZ)I", InquiryField.StringField.TYPE, "j0", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "q0", "r0", "Y", "X", "delimiters", "limit", "Lkotlin/sequences/Sequence;", "z0", "(Ljava/lang/CharSequence;[CIZI)Lkotlin/sequences/Sequence;", "", "A0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "", "L0", "(I)V", "", "N0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "Q0", "(Ljava/lang/CharSequence;[CZI)Lkotlin/sequences/Sequence;", "M0", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "O0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "v0", "(Ljava/lang/CharSequence;)Lkotlin/sequences/Sequence;", "w0", "(Ljava/lang/CharSequence;)Ljava/util/List;", "b0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z", "o1", "(Ljava/lang/String;)Ljava/lang/Boolean;", "h0", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class StringsKt__StringsKt extends x {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/text/StringsKt__StringsKt$a", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Sequence<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f22594a;

        public a(CharSequence charSequence) {
            this.f22594a = charSequence;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<String> iterator() {
            return new h(this.f22594a);
        }
    }

    public static final Sequence<IntRange> A0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        L0(i11);
        final List listE = kotlin.collections.l.e(strArr);
        return new c(charSequence, i10, i11, new Function2() { // from class: kotlin.text.z
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringsKt__StringsKt.E0(listE, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    public static /* synthetic */ Sequence B0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return z0(charSequence, cArr, i10, z10, i11);
    }

    public static /* synthetic */ Sequence C0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return A0(charSequence, strArr, i10, z10, i11);
    }

    public static final Pair D0(char[] cArr, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iO0 = o0(DelimitedRangesSequence, cArr, i10, z10);
        if (iO0 < 0) {
            return null;
        }
        return jt.s.a(Integer.valueOf(iO0), 1);
    }

    public static final Pair E0(List list, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair<Integer, String> pairG0 = g0(DelimitedRangesSequence, list, i10, z10, false);
        if (pairG0 != null) {
            return jt.s.a(pairG0.c(), Integer.valueOf(pairG0.d().length()));
        }
        return null;
    }

    public static final boolean F0(@NotNull CharSequence charSequence, int i10, @NotNull CharSequence other, int i11, int i12, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!b.d(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static String G0(@NotNull String str, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!W0(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public static String H0(@NotNull String str, @NotNull CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!f0(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public static String I0(@NotNull String str, @NotNull CharSequence delimiter) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        return J0(str, delimiter, delimiter);
    }

    @NotNull
    public static final String J0(@NotNull String str, @NotNull CharSequence prefix, @NotNull CharSequence suffix) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !W0(str, prefix, false, 2, null) || !f0(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public static final CharSequence K0(@NotNull CharSequence charSequence, int i10, int i11, @NotNull CharSequence replacement) {
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

    public static final void L0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    @NotNull
    public static final List<String> M0(@NotNull CharSequence charSequence, @NotNull char[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return O0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableN = iu.p.n(B0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(iterableN, 10));
        Iterator it = iterableN.iterator();
        while (it.hasNext()) {
            arrayList.add(X0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final List<String> N0(@NotNull CharSequence charSequence, @NotNull String[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return O0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableN = iu.p.n(C0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(iterableN, 10));
        Iterator it = iterableN.iterator();
        while (it.hasNext()) {
            arrayList.add(X0(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static final List<String> O0(CharSequence charSequence, String str, boolean z10, int i10) {
        L0(i10);
        int length = 0;
        int iJ0 = j0(charSequence, str, 0, z10);
        if (iJ0 == -1 || i10 == 1) {
            return kotlin.collections.o.d(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? kotlin.ranges.d.f(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iJ0).toString());
            length = str.length() + iJ0;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iJ0 = j0(charSequence, str, length, z10);
        } while (iJ0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List P0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return M0(charSequence, cArr, z10, i10);
    }

    @NotNull
    public static final Sequence<String> Q0(@NotNull final CharSequence charSequence, @NotNull char[] delimiters, boolean z10, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        return iu.p.x(B0(charSequence, delimiters, 0, z10, i10, 2, null), new Function1() { // from class: kotlin.text.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StringsKt__StringsKt.S0(charSequence, (IntRange) obj);
            }
        });
    }

    public static /* synthetic */ Sequence R0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return Q0(charSequence, cArr, z10, i10);
    }

    public static final String S0(CharSequence charSequence, IntRange it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return X0(charSequence, it);
    }

    public static final boolean T0(@NotNull CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && b.d(charSequence.charAt(0), c10, z10);
    }

    public static final boolean U0(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? x.T((String) charSequence, (String) prefix, false, 2, null) : F0(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean V0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return T0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean W0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return U0(charSequence, charSequence2, z10);
    }

    public static final boolean X(@NotNull CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return m0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    @NotNull
    public static final String X0(@NotNull CharSequence charSequence, @NotNull IntRange range) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        return charSequence.subSequence(range.b().intValue(), range.c().intValue() + 1).toString();
    }

    public static boolean Y(@NotNull CharSequence charSequence, @NotNull CharSequence other, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof String) {
            return n0(charSequence, (String) other, 0, z10, 2, null) >= 0;
        }
        return l0(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0;
    }

    @NotNull
    public static final String Y0(@NotNull String str, char c10, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iM0 = m0(str, c10, 0, false, 6, null);
        if (iM0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iM0 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean Z(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return X(charSequence, c10, z10);
    }

    @NotNull
    public static String Z0(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iN0 = n0(str, delimiter, 0, false, 6, null);
        if (iN0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iN0 + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean a0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Y(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String a1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return Y0(str, c10, str2);
    }

    public static final boolean b0(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return Intrinsics.c(charSequence, charSequence2);
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

    public static /* synthetic */ String b1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return Z0(str, str2, str3);
    }

    public static final boolean c0(@NotNull CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() > 0 && b.d(charSequence.charAt(h0(charSequence)), c10, z10);
    }

    @NotNull
    public static String c1(@NotNull String str, char c10, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iS0 = s0(str, c10, 0, false, 6, null);
        if (iS0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iS0 + 1, str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean d0(@NotNull CharSequence charSequence, @NotNull CharSequence suffix, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? x.D((String) charSequence, (String) suffix, false, 2, null) : F0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    @NotNull
    public static final String d1(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iT0 = t0(str, delimiter, 0, false, 6, null);
        if (iT0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iT0 + delimiter.length(), str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean e0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c0(charSequence, c10, z10);
    }

    public static /* synthetic */ String e1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return c1(str, c10, str2);
    }

    public static /* synthetic */ boolean f0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return d0(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String f1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return d1(str, str2, str3);
    }

    public static final Pair<Integer, String> g0(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        CharSequence charSequence2;
        Object next;
        boolean z12;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) CollectionsKt.z0(collection);
            int iN0 = !z11 ? n0(charSequence, str, i10, false, 4, null) : t0(charSequence, str, i10, false, 4, null);
            if (iN0 < 0) {
                return null;
            }
            return jt.s.a(Integer.valueOf(iN0), str);
        }
        CharSequence charSequence3 = charSequence;
        kotlin.ranges.a intRange = !z11 ? new IntRange(kotlin.ranges.d.c(i10, 0), charSequence3.length()) : kotlin.ranges.d.n(kotlin.ranges.d.f(i10, h0(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iD = intRange.getFirst();
            int iE = intRange.getLast();
            int iF = intRange.getStep();
            if ((iF > 0 && iD <= iE) || (iF < 0 && iE <= iD)) {
                int i11 = iD;
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
                        if (x.H(str2, 0, (String) charSequence3, i11, str2.length(), z12)) {
                            break;
                        }
                        z10 = z12;
                    }
                    String str3 = (String) next2;
                    if (str3 != null) {
                        return jt.s.a(Integer.valueOf(i11), str3);
                    }
                    if (i11 != iE) {
                        i11 += iF;
                        z10 = z12;
                    }
                }
            }
        } else {
            boolean z13 = z10;
            int iD2 = intRange.getFirst();
            int iE2 = intRange.getLast();
            int iF2 = intRange.getStep();
            if ((iF2 > 0 && iD2 <= iE2) || (iF2 < 0 && iE2 <= iD2)) {
                int i12 = iD2;
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
                        if (F0(str4, 0, charSequence2, i12, str4.length(), z14)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 != null) {
                        return jt.s.a(Integer.valueOf(i12), str5);
                    }
                    if (i12 != iE2) {
                        i12 += iF2;
                        charSequence3 = charSequence2;
                    }
                }
            }
        }
        return null;
    }

    @NotNull
    public static final String g1(@NotNull String str, char c10, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iM0 = m0(str, c10, 0, false, 6, null);
        if (iM0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iM0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int h0(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    @NotNull
    public static final String h1(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iN0 = n0(str, delimiter, 0, false, 6, null);
        if (iN0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iN0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int i0(@NotNull CharSequence charSequence, char c10, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? o0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static /* synthetic */ String i1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return g1(str, c10, str2);
    }

    public static final int j0(@NotNull CharSequence charSequence, @NotNull String string, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z10 || !(charSequence instanceof String)) ? l0(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    public static /* synthetic */ String j1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return h1(str, str2, str3);
    }

    public static final int k0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        kotlin.ranges.a intRange = !z11 ? new IntRange(kotlin.ranges.d.c(i10, 0), kotlin.ranges.d.f(i11, charSequence.length())) : kotlin.ranges.d.n(kotlin.ranges.d.f(i10, h0(charSequence)), kotlin.ranges.d.c(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iD = intRange.getFirst();
            int iE = intRange.getLast();
            int iF = intRange.getStep();
            if ((iF <= 0 || iD > iE) && (iF >= 0 || iE > iD)) {
                return -1;
            }
            int i12 = iD;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z10;
                if (x.H(str, 0, (String) charSequence, i12, str.length(), z12)) {
                    return i12;
                }
                if (i12 == iE) {
                    return -1;
                }
                i12 += iF;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int iD2 = intRange.getFirst();
            int iE2 = intRange.getLast();
            int iF2 = intRange.getStep();
            if ((iF2 <= 0 || iD2 > iE2) && (iF2 >= 0 || iE2 > iD2)) {
                return -1;
            }
            int i13 = iD2;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (F0(charSequence4, 0, charSequence3, i13, charSequence2.length(), z14)) {
                    return i13;
                }
                if (i13 == iE2) {
                    return -1;
                }
                i13 += iF2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    @NotNull
    public static final String k1(@NotNull String str, char c10, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iS0 = s0(str, c10, 0, false, 6, null);
        if (iS0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iS0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int l0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return k0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    @NotNull
    public static final String l1(@NotNull String str, @NotNull String delimiter, @NotNull String missingDelimiterValue) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iT0 = t0(str, delimiter, 0, false, 6, null);
        if (iT0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iT0);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int m0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return i0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ String m1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return k1(str, c10, str2);
    }

    public static /* synthetic */ int n0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return j0(charSequence, str, i10, z10);
    }

    public static /* synthetic */ String n1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return l1(str, str2, str3);
    }

    public static final int o0(@NotNull CharSequence charSequence, @NotNull char[] chars, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(kotlin.collections.m.b0(chars), i10);
        }
        int iC = kotlin.ranges.d.c(i10, 0);
        int iH0 = h0(charSequence);
        if (iC > iH0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iC);
            for (char c10 : chars) {
                if (b.d(c10, cCharAt, z10)) {
                    return iC;
                }
            }
            if (iC == iH0) {
                return -1;
            }
            iC++;
        }
    }

    @Nullable
    public static Boolean o1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (Intrinsics.c(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.c(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static boolean p0(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!CharsKt__CharJVMKt.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static CharSequence p1(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zC = CharsKt__CharJVMKt.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final int q0(@NotNull CharSequence charSequence, char c10, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? u0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    @NotNull
    public static String q1(@NotNull String str, @NotNull char... chars) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zD = kotlin.collections.m.D(chars, str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zD) {
                    break;
                }
                length--;
            } else if (zD) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static final int r0(@NotNull CharSequence charSequence, @NotNull String string, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        return (z10 || !(charSequence instanceof String)) ? k0(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    @NotNull
    public static String r1(@NotNull String str, @NotNull char... chars) {
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
            if (!kotlin.collections.m.D(chars, str.charAt(length))) {
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

    public static /* synthetic */ int s0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = h0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return q0(charSequence, c10, i10, z10);
    }

    @NotNull
    public static String s1(@NotNull String str, @NotNull char... chars) {
        CharSequence charSequenceSubSequence;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!kotlin.collections.m.D(chars, str.charAt(i10))) {
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
        return N0(charSequence, strArr, z10, i10);
    }

    public static /* synthetic */ int t0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = h0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return r0(charSequence, str, i10, z10);
    }

    public static final int u0(@NotNull CharSequence charSequence, @NotNull char[] chars, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(kotlin.collections.m.b0(chars), i10);
        }
        for (int iF = kotlin.ranges.d.f(i10, h0(charSequence)); -1 < iF; iF--) {
            char cCharAt = charSequence.charAt(iF);
            for (char c10 : chars) {
                if (b.d(c10, cCharAt, z10)) {
                    return iF;
                }
            }
        }
        return -1;
    }

    @NotNull
    public static final Sequence<String> v0(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new a(charSequence);
    }

    @NotNull
    public static List<String> w0(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return iu.p.z(v0(charSequence));
    }

    @NotNull
    public static final CharSequence x0(@NotNull CharSequence charSequence, int i10, char c10) {
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
    public static String y0(@NotNull String str, int i10, char c10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return x0(str, i10, c10).toString();
    }

    public static final Sequence<IntRange> z0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        L0(i11);
        return new c(charSequence, i10, i11, new Function2() { // from class: kotlin.text.y
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringsKt__StringsKt.D0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }
}
