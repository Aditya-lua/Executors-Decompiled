package p597z7;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p028b8.InterfaceC1259g;
import p569y7.C13116c;

/* JADX INFO: renamed from: z7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C13732a implements InterfaceC1259g {

    /* JADX INFO: renamed from: c */
    public static final String f48301c;

    /* JADX INFO: renamed from: d */
    public static final String f48302d;

    /* JADX INFO: renamed from: e */
    public static final String f48303e;

    /* JADX INFO: renamed from: f */
    public static final Set<C13116c> f48304f;

    /* JADX INFO: renamed from: g */
    public static final C13732a f48305g;

    /* JADX INFO: renamed from: h */
    public static final C13732a f48306h;

    /* JADX INFO: renamed from: a */
    @NonNull
    public final String f48307a;

    /* JADX INFO: renamed from: b */
    public final String f48308b;

    static {
        String strM50155a = C13736e.m50155a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f48301c = strM50155a;
        String strM50155a2 = C13736e.m50155a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f48302d = strM50155a2;
        String strM50155a3 = C13736e.m50155a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f48303e = strM50155a3;
        f48304f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C13116c.m48729b("proto"), C13116c.m48729b("json"))));
        f48305g = new C13732a(strM50155a, null);
        f48306h = new C13732a(strM50155a2, strM50155a3);
    }

    public C13732a(@NonNull String str, String str2) {
        this.f48307a = str;
        this.f48308b = str2;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C13732a m50139c(@NonNull byte[] bArr) {
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
        return new C13732a(str2, str3);
    }

    @Override // p028b8.InterfaceC1259g
    /* JADX INFO: renamed from: a */
    public Set<C13116c> mo7019a() {
        return f48304f;
    }

    /* JADX INFO: renamed from: b */
    public byte[] m50140b() {
        String str = this.f48308b;
        if (str == null && this.f48307a == null) {
            return null;
        }
        String str2 = this.f48307a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    /* JADX INFO: renamed from: d */
    public String m50141d() {
        return this.f48308b;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public String m50142e() {
        return this.f48307a;
    }

    @Override // p028b8.InterfaceC1258f
    public byte[] getExtras() {
        return m50140b();
    }

    @Override // p028b8.InterfaceC1258f
    @NonNull
    public String getName() {
        return "cct";
    }
}
