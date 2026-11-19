package a8;

import androidx.annotation.NonNull;
import c8.g;
import com.github.luben.zstd.BuildConfig;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set<z7.c> f303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f305h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f306a;
    public final String b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f300c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f301d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f302e = strA3;
        f303f = Collections.unmodifiableSet(new HashSet(Arrays.asList(z7.c.b("proto"), z7.c.b("json"))));
        f304g = new a(strA, null);
        f305h = new a(strA2, strA3);
    }

    public a(@NonNull String str, String str2) {
        this.f306a = str;
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

    @Override // c8.g
    public Set<z7.c> a() {
        return f303f;
    }

    public byte[] b() {
        String str = this.b;
        if (str == null && this.f306a == null) {
            return null;
        }
        String str2 = this.f306a;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.b;
    }

    @NonNull
    public String e() {
        return this.f306a;
    }

    @Override // c8.f
    public byte[] getExtras() {
        return b();
    }

    @Override // c8.f
    @NonNull
    public String getName() {
        return "cct";
    }
}
