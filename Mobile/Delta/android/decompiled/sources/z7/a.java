package z7;

import androidx.annotation.NonNull;
import b8.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f37329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f37330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f37331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<y7.c> f37332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f37333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f37334h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f37335a;
    public final String b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f37329c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f37330d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f37331e = strA3;
        f37332f = Collections.unmodifiableSet(new HashSet(Arrays.asList(y7.c.b("proto"), y7.c.b("json"))));
        f37333g = new a(strA, null);
        f37334h = new a(strA2, strA3);
    }

    public a(@NonNull String str, String str2) {
        this.f37335a = str;
        this.b = str2;
    }

    @NonNull
    public static a c(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // b8.g
    public Set<y7.c> a() {
        return f37332f;
    }

    public byte[] b() {
        String str = this.b;
        if (str == null && this.f37335a == null) {
            return null;
        }
        String str2 = this.f37335a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.b;
    }

    @NonNull
    public String e() {
        return this.f37335a;
    }

    @Override // b8.f
    public byte[] getExtras() {
        return b();
    }

    @Override // b8.f
    @NonNull
    public String getName() {
        return "cct";
    }
}
