package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.internal._UtilCommonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p201iu.C6988p;
import p560xu.C12930h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m31665d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "publicSuffixList", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "<init>", "(Lokhttp3/internal/publicsuffix/PublicSuffixList;)V", "getEffectiveTldPlusOne", "", "domain", "splitDomain", "", "findMatchingRule", "domainLabels", "Companion", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';

    @NotNull
    private final PublicSuffixList publicSuffixList;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final C12930h WILDCARD_LABEL = C12930h.INSTANCE.m48118e(42);

    @NotNull
    private static final List<String> PREVAILING_RULE = C7697o.m31878d("*");

    @NotNull
    private static PublicSuffixDatabase instance = new PublicSuffixDatabase(PublicSuffixList_androidKt.getDefault(PublicSuffixList.INSTANCE));

    @Metadata(m31664d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m31665d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "<init>", "()V", "Lxu/h;", "", "labels", "", "labelIndex", "", "binarySearch", "(Lxu/h;[Lxu/h;I)Ljava/lang/String;", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "()Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "resetForTests$okhttp", "resetForTests", "WILDCARD_LABEL", "Lxu/h;", "", "PREVAILING_RULE", "Ljava/util/List;", "", "EXCEPTION_MARKER", "C", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "okhttp"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.publicsuffix.PublicSuffixDatabase.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(C12930h c12930h, C12930h[] c12930hArr, int i10) {
            int i11;
            int iAnd;
            boolean z10;
            int iAnd2;
            int iM48089I = c12930h.m48089I();
            int i12 = 0;
            while (i12 < iM48089I) {
                int i13 = (i12 + iM48089I) / 2;
                while (i13 > -1 && c12930h.m48101j(i13) != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (c12930h.m48101j(i11) == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        iAnd = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        iAnd = _UtilCommonKt.and(c12930hArr[i17].m48101j(i18), 255);
                        z10 = z12;
                    }
                    iAnd2 = iAnd - _UtilCommonKt.and(c12930h.m48101j(i14 + i19), 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (c12930hArr[i17].m48089I() != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == c12930hArr.length - 1) {
                            break;
                        }
                        i17++;
                        z11 = true;
                        i18 = -1;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i20 = i16 - i19;
                        int iM48089I2 = c12930hArr[i17].m48089I() - i18;
                        int length = c12930hArr.length;
                        for (int i21 = i17 + 1; i21 < length; i21++) {
                            iM48089I2 += c12930hArr[i21].m48089I();
                        }
                        if (iM48089I2 >= i20) {
                            if (iM48089I2 <= i20) {
                                return c12930h.mo48092L(i14, i16 + i14).mo48091K(Charsets.UTF_8);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                iM48089I = i13;
            }
            return null;
        }

        @NotNull
        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        public final void resetForTests$okhttp() {
            PublicSuffixDatabase.instance = new PublicSuffixDatabase(PublicSuffixList_androidKt.getDefault(PublicSuffixList.INSTANCE));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public PublicSuffixDatabase(@NotNull PublicSuffixList publicSuffixList) {
        Intrinsics.checkNotNullParameter(publicSuffixList, "publicSuffixList");
        this.publicSuffixList = publicSuffixList;
    }

    private final List<String> findMatchingRule(List<String> domainLabels) {
        String str;
        String strBinarySearch;
        String str2;
        List<String> listM31892k;
        List<String> listM31892k2;
        this.publicSuffixList.ensureLoaded();
        int size = domainLabels.size();
        C12930h[] c12930hArr = new C12930h[size];
        for (int i10 = 0; i10 < size; i10++) {
            c12930hArr[i10] = C12930h.INSTANCE.m48117d(domainLabels.get(i10));
        }
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 >= size) {
                strBinarySearch = null;
                break;
            }
            strBinarySearch = INSTANCE.binarySearch(this.publicSuffixList.getBytes(), c12930hArr, i11);
            if (strBinarySearch != null) {
                break;
            }
            i11++;
        }
        if (size <= 1) {
            str2 = null;
            break;
        }
        C12930h[] c12930hArr2 = (C12930h[]) c12930hArr.clone();
        int length = c12930hArr2.length - 1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                str2 = null;
                break;
            }
            c12930hArr2[i12] = WILDCARD_LABEL;
            String strBinarySearch2 = INSTANCE.binarySearch(this.publicSuffixList.getBytes(), c12930hArr2, i12);
            if (strBinarySearch2 != null) {
                str2 = strBinarySearch2;
                break;
            }
            i12++;
        }
        if (str2 != null) {
            int i13 = size - 1;
            for (int i14 = 0; i14 < i13; i14++) {
                String strBinarySearch3 = INSTANCE.binarySearch(this.publicSuffixList.getExceptionBytes(), c12930hArr, i14);
                if (strBinarySearch3 != null) {
                    str = strBinarySearch3;
                    break;
                }
            }
        }
        if (str != null) {
            return StringsKt.m32135P0(EXCEPTION_MARKER + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strBinarySearch == null && str2 == null) {
            return PREVAILING_RULE;
        }
        if (strBinarySearch == null || (listM31892k = StringsKt.m32135P0(strBinarySearch, new char[]{'.'}, false, 0, 6, null)) == null) {
            listM31892k = C7699p.m31892k();
        }
        if (str2 == null || (listM31892k2 = StringsKt.m32135P0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listM31892k2 = C7699p.m31892k();
        }
        return listM31892k.size() > listM31892k2.size() ? listM31892k : listM31892k2;
    }

    private final List<String> splitDomain(String domain) {
        List<String> listP0 = StringsKt.m32135P0(domain, new char[]{'.'}, false, 0, 6, null);
        return Intrinsics.m31980c(CollectionsKt.m31717o0(listP0), "") ? CollectionsKt.m31702Z(listP0, 1) : listP0;
    }

    @Nullable
    public final String getEffectiveTldPlusOne(@NotNull String domain) {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        Intrinsics.checkNotNull(unicode);
        List<String> listSplitDomain = splitDomain(unicode);
        List<String> listFindMatchingRule = findMatchingRule(listSplitDomain);
        if (listSplitDomain.size() == listFindMatchingRule.size() && listFindMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (listFindMatchingRule.get(0).charAt(0) == '!') {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size();
        } else {
            size = listSplitDomain.size();
            size2 = listFindMatchingRule.size() + 1;
        }
        return C6988p.m29395w(C6988p.m29387o(CollectionsKt.m31696U(splitDomain(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }
}
