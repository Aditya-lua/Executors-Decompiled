package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u */
/* JADX INFO: loaded from: classes.dex */
public final class C2327u implements Iterable, InterfaceC2255q {

    /* JADX INFO: renamed from: a */
    public final String f8678a;

    public C2327u(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f8678a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q mo9950a() {
        return new C2327u(this.f8678a);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String m10775b() {
        return this.f8678a;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:239:? */
    /* JADX DEBUG: Multi-variable search result rejected for r10v14, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r10v15, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r10v8, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r10v9, resolved type: int */
    /* JADX WARN: Code duplicated, block: B:104:0x02d8 A[PHI: r10
      0x02d8: PHI (r10v6 boolean) = (r10v12 boolean), (r10v13 boolean), (r10v16 boolean) binds: [B:100:0x02c4, B:101:0x02c6, B:103:0x02d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: e */
    public final InterfaceC2255q mo9953e(String str, C2332u4 c2332u4, List list) {
        String str2;
        int i10;
        C2327u c2327u;
        int i11;
        int i12;
        boolean zIsEmpty;
        C2332u4 c2332u5;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        String strZzc = "undefined";
        z = false;
        boolean z10 = false;
        switch (str.hashCode()) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    C2351v5.m10828a("hasOwnProperty", 1, list);
                    String str3 = this.f8678a;
                    InterfaceC2255q interfaceC2255qM10776a = c2332u4.m10776a((InterfaceC2255q) list.get(0));
                    if ("length".equals(interfaceC2255qM10776a.zzc())) {
                        return InterfaceC2255q.f8584Eo;
                    }
                    double dDoubleValue = interfaceC2255qM10776a.zzd().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i10 = (int) dDoubleValue) < 0 || i10 >= str3.length()) ? InterfaceC2255q.f8585Fo : InterfaceC2255q.f8584Eo;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1776922004:
                if (str.equals("toString")) {
                    C2351v5.m10828a("toString", 0, list);
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    C2351v5.m10828a("toLocaleLowerCase", 0, list);
                    return new C2327u(this.f8678a.toLowerCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -1361633751:
                if (str.equals("charAt")) {
                    C2351v5.m10830c("charAt", 1, list);
                    int iM10836i = list.isEmpty() ? 0 : (int) C2351v5.m10836i(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue());
                    String str4 = this.f8678a;
                    return (iM10836i < 0 || iM10836i >= str4.length()) ? InterfaceC2255q.f8586Go : new C2327u(String.valueOf(str4.charAt(iM10836i)));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                c2327u = this;
                if (str.equals("concat")) {
                    if (!list.isEmpty()) {
                        StringBuilder sb2 = new StringBuilder(c2327u.f8678a);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            sb2.append(c2332u4.m10776a((InterfaceC2255q) list.get(i13)).zzc());
                        }
                        return new C2327u(sb2.toString());
                    }
                    return c2327u;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    C2351v5.m10828a("toLowerCase", 0, list);
                    return new C2327u(this.f8678a.toLowerCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case -906336856:
                if (str.equals("search")) {
                    C2351v5.m10830c("search", 1, list);
                    Matcher matcher = Pattern.compile(list.isEmpty() ? "undefined" : c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzc()).matcher(this.f8678a);
                    return matcher.find() ? new C2129j(Double.valueOf(matcher.start())) : new C2129j(Double.valueOf(-1.0d));
                }
                throw new IllegalArgumentException("Command not supported");
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    C2351v5.m10828a("toLocaleUpperCase", 0, list);
                    return new C2327u(this.f8678a.toUpperCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    C2351v5.m10830c("lastIndexOf", 2, list);
                    String str5 = this.f8678a;
                    String strZzc2 = list.size() > 0 ? c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzc() : "undefined";
                    double dDoubleValue2 = list.size() < 2 ? Double.NaN : c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue();
                    return new C2129j(Double.valueOf(str5.lastIndexOf(strZzc2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : C2351v5.m10836i(dDoubleValue2)))));
                }
                throw new IllegalArgumentException("Command not supported");
            case -399551817:
                if (str.equals("toUpperCase")) {
                    C2351v5.m10828a("toUpperCase", 0, list);
                    return new C2327u(this.f8678a.toUpperCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3568674:
                if (str.equals(str2)) {
                    C2351v5.m10828a("toUpperCase", 0, list);
                    return new C2327u(this.f8678a.trim());
                }
                throw new IllegalArgumentException("Command not supported");
            case 103668165:
                if (str.equals("match")) {
                    C2351v5.m10830c("match", 1, list);
                    Matcher matcher2 = Pattern.compile(list.size() <= 0 ? "" : c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzc()).matcher(this.f8678a);
                    return matcher2.find() ? new C2055f(Arrays.asList(new C2327u(matcher2.group()))) : InterfaceC2255q.f8580Ao;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    C2351v5.m10830c("slice", 2, list);
                    String str6 = this.f8678a;
                    double dM10836i = C2351v5.m10836i(!list.isEmpty() ? c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue() : 0.0d);
                    double dMax = dM10836i < 0.0d ? Math.max(((double) str6.length()) + dM10836i, 0.0d) : Math.min(dM10836i, str6.length());
                    double dM10836i2 = C2351v5.m10836i(list.size() > 1 ? c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue() : str6.length());
                    int i14 = (int) dMax;
                    return new C2327u(str6.substring(i14, Math.max(0, ((int) (dM10836i2 < 0.0d ? Math.max(((double) str6.length()) + dM10836i2, 0.0d) : Math.min(dM10836i2, str6.length()))) - i14) + i14));
                }
                throw new IllegalArgumentException("Command not supported");
            case 109648666:
                if (str.equals("split")) {
                    C2351v5.m10830c("split", 2, list);
                    String str7 = this.f8678a;
                    if (str7.length() == 0) {
                        return new C2055f(Arrays.asList(this));
                    }
                    ArrayList arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        String strZzc3 = c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzc();
                        long jM10835h = list.size() > 1 ? C2351v5.m10835h(c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue()) : 2147483647L;
                        if (jM10835h == 0) {
                            return new C2055f();
                        }
                        String[] strArrSplit = str7.split(Pattern.quote(strZzc3), ((int) jM10835h) + 1);
                        int length = strArrSplit.length;
                        if (!strZzc3.isEmpty() || length <= 0) {
                            i12 = zIsEmpty;
                            z10 = zIsEmpty;
                            i11 = length;
                            i12 = z10;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i11 = length - 1;
                            if (!strArrSplit[i11].isEmpty()) {
                                i12 = zIsEmpty;
                                z10 = zIsEmpty;
                                i11 = length;
                                i12 = z10;
                            }
                        }
                        i12 = zIsEmpty;
                        z10 = zIsEmpty;
                        if (length > jM10835h) {
                            i11--;
                        }
                        while (i12 < i11) {
                            arrayList.add(new C2327u(strArrSplit[i12]));
                            i12++;
                        }
                    }
                    return new C2055f(arrayList);
                }
                throw new IllegalArgumentException("Command not supported");
            case 530542161:
                if (str.equals("substring")) {
                    C2351v5.m10830c("substring", 2, list);
                    String str8 = this.f8678a;
                    int iM10836i2 = !list.isEmpty() ? (int) C2351v5.m10836i(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzd().doubleValue()) : 0;
                    int iM10836i3 = list.size() > 1 ? (int) C2351v5.m10836i(c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue()) : str8.length();
                    int iMin = Math.min(Math.max(iM10836i2, 0), str8.length());
                    int iMin2 = Math.min(Math.max(iM10836i3, 0), str8.length());
                    return new C2327u(str8.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                throw new IllegalArgumentException("Command not supported");
            case 1094496948:
                c2327u = this;
                if (str.equals("replace")) {
                    C2351v5.m10830c("replace", 2, list);
                    InterfaceC2255q interfaceC2255qMo9763h = InterfaceC2255q.f8587zo;
                    if (!list.isEmpty()) {
                        strZzc = c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzc();
                        if (list.size() > 1) {
                            interfaceC2255qMo9763h = c2332u4.m10776a((InterfaceC2255q) list.get(1));
                        }
                    }
                    String str9 = strZzc;
                    String str10 = c2327u.f8678a;
                    int iIndexOf = str10.indexOf(str9);
                    if (iIndexOf >= 0) {
                        if (interfaceC2255qMo9763h instanceof AbstractC2147k) {
                            interfaceC2255qMo9763h = ((AbstractC2147k) interfaceC2255qMo9763h).mo9763h(c2332u4, Arrays.asList(new C2327u(str9), new C2129j(Double.valueOf(iIndexOf)), c2327u));
                        }
                        String strSubstring = str10.substring(0, iIndexOf);
                        String strZzc4 = interfaceC2255qMo9763h.zzc();
                        String strSubstring2 = str10.substring(iIndexOf + str9.length());
                        StringBuilder sb3 = new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strZzc4).length() + String.valueOf(strSubstring2).length());
                        sb3.append(strSubstring);
                        sb3.append(strZzc4);
                        sb3.append(strSubstring2);
                        return new C2327u(sb3.toString());
                    }
                    return c2327u;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    C2351v5.m10830c("indexOf", 2, list);
                    String str11 = this.f8678a;
                    if (list.size() <= 0) {
                        c2332u5 = c2332u4;
                    } else {
                        c2332u5 = c2332u4;
                        strZzc = c2332u5.m10776a((InterfaceC2255q) list.get(0)).zzc();
                    }
                    return new C2129j(Double.valueOf(str11.indexOf(strZzc, (int) C2351v5.m10836i(list.size() < 2 ? 0.0d : c2332u5.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue()))));
                }
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2327u) {
            return this.f8678a.equals(((C2327u) obj).f8678a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8678a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2309t(this);
    }

    public final String toString() {
        String str = this.f8678a;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append("\"");
        sb2.append(str);
        sb2.append("\"");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final String zzc() {
        return this.f8678a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Double zzd() {
        String str = this.f8678a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Boolean zze() {
        return Boolean.valueOf(!this.f8678a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2255q
    public final Iterator zzf() {
        return new C2291s(this);
    }
}
