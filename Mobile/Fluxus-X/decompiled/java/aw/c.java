package aw;

import com.github.luben.zstd.BuildConfig;
import ew.h;
import java.net.IDN;
import java.util.List;
import nv.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.o;
import p001kotlin.collections.p;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.text.Charsets;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0010B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Law/c;", BuildConfig.FLAVOR, "Law/d;", "publicSuffixList", "<init>", "(Law/d;)V", BuildConfig.FLAVOR, "domain", "c", "(Ljava/lang/String;)Ljava/lang/String;", BuildConfig.FLAVOR, "d", "(Ljava/lang/String;)Ljava/util/List;", "domainLabels", "b", "(Ljava/util/List;)Ljava/util/List;", "a", "Law/d;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final h f3504c = h.INSTANCE.e(42);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final List<String> f3505d = o.d("*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static c f3506e = new c(e.a(d.INSTANCE));

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d publicSuffixList;

    /* JADX INFO: renamed from: aw.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Law/c$a;", BuildConfig.FLAVOR, "<init>", "()V", "Law/c;", "c", "()Law/c;", "Lew/h;", BuildConfig.FLAVOR, "labels", BuildConfig.FLAVOR, "labelIndex", BuildConfig.FLAVOR, "b", "(Lew/h;[Lew/h;I)Ljava/lang/String;", "WILDCARD_LABEL", "Lew/h;", BuildConfig.FLAVOR, "PREVAILING_RULE", "Ljava/util/List;", BuildConfig.FLAVOR, "EXCEPTION_MARKER", "C", "instance", "Law/c;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(h hVar, h[] hVarArr, int i10) {
            int i11;
            int iB;
            boolean z10;
            int iB2;
            int I = hVar.I();
            int i12 = 0;
            while (i12 < I) {
                int i13 = (i12 + I) / 2;
                while (i13 > -1 && hVar.k(i13) != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (hVar.k(i11) == 10) {
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
                        iB = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        iB = n.b(hVarArr[i17].k(i18), 255);
                        z10 = z12;
                    }
                    iB2 = iB - n.b(hVar.k(i14 + i19), 255);
                    if (iB2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (hVarArr[i17].I() != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == hVarArr.length - 1) {
                            break;
                        }
                        i17++;
                        z11 = true;
                        i18 = -1;
                    }
                }
                if (iB2 >= 0) {
                    if (iB2 <= 0) {
                        int i20 = i16 - i19;
                        int I2 = hVarArr[i17].I() - i18;
                        int length = hVarArr.length;
                        for (int i21 = i17 + 1; i21 < length; i21++) {
                            I2 += hVarArr[i21].I();
                        }
                        if (I2 >= i20) {
                            if (I2 <= i20) {
                                return hVar.L(i14, i16 + i14).K(Charsets.UTF_8);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                I = i13;
            }
            return null;
        }

        @NotNull
        public final c c() {
            return c.f3506e;
        }

        public Companion() {
        }
    }

    public c(@NotNull d publicSuffixList) {
        Intrinsics.checkNotNullParameter(publicSuffixList, "publicSuffixList");
        this.publicSuffixList = publicSuffixList;
    }

    public final List<String> b(List<String> domainLabels) {
        String str;
        String strB;
        String str2;
        List<String> listK;
        List<String> listK2;
        this.publicSuffixList.b();
        int size = domainLabels.size();
        h[] hVarArr = new h[size];
        for (int i10 = 0; i10 < size; i10++) {
            hVarArr[i10] = h.INSTANCE.d(domainLabels.get(i10));
        }
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 >= size) {
                strB = null;
                break;
            }
            strB = INSTANCE.b(this.publicSuffixList.a(), hVarArr, i11);
            if (strB != null) {
                break;
            }
            i11++;
        }
        if (size <= 1) {
            str2 = null;
            break;
        }
        h[] hVarArr2 = (h[]) hVarArr.clone();
        int length = hVarArr2.length - 1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                str2 = null;
                break;
            }
            hVarArr2[i12] = f3504c;
            String strB2 = INSTANCE.b(this.publicSuffixList.a(), hVarArr2, i12);
            if (strB2 != null) {
                str2 = strB2;
                break;
            }
            i12++;
        }
        if (str2 != null) {
            int i13 = size - 1;
            for (int i14 = 0; i14 < i13; i14++) {
                String strB3 = INSTANCE.b(this.publicSuffixList.c(), hVarArr, i14);
                if (strB3 != null) {
                    str = strB3;
                    break;
                }
            }
        }
        if (str != null) {
            return StringsKt.N0('!' + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (strB == null && str2 == null) {
            return f3505d;
        }
        if (strB == null || (listK = StringsKt.N0(strB, new char[]{'.'}, false, 0, 6, null)) == null) {
            listK = p.k();
        }
        if (str2 == null || (listK2 = StringsKt.N0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            listK2 = p.k();
        }
        return listK.size() > listK2.size() ? listK : listK2;
    }

    @Nullable
    public final String c(@NotNull String domain) {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        Intrinsics.checkNotNull(unicode);
        List<String> listD = d(unicode);
        List<String> listB = b(listD);
        if (listD.size() == listB.size() && listB.get(0).charAt(0) != '!') {
            return null;
        }
        if (listB.get(0).charAt(0) == '!') {
            size = listD.size();
            size2 = listB.size();
        } else {
            size = listD.size();
            size2 = listB.size() + 1;
        }
        return yu.p.w(yu.p.o(CollectionsKt.U(d(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    public final List<String> d(String domain) {
        List<String> listN0 = StringsKt.N0(domain, new char[]{'.'}, false, 0, 6, null);
        return Intrinsics.c(CollectionsKt.o0(listN0), BuildConfig.FLAVOR) ? CollectionsKt.Z(listN0, 1) : listN0;
    }
}
