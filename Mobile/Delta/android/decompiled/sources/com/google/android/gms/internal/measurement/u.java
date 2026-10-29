package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Iterable, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6818a;

    public u(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f6818a = str;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q a() {
        return new u(this.f6818a);
    }

    public final /* synthetic */ String b() {
        return this.f6818a;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02d8 A[PHI: r10
      0x02d8: PHI (r10v6 boolean) = (r10v12 boolean), (r10v13 boolean), (r10v16 boolean) binds: [B:100:0x02c4, B:101:0x02c6, B:103:0x02d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.q
    public final q e(String str, u4 u4Var, List list) {
        String str2;
        int i10;
        u uVar;
        int i11;
        int i12;
        boolean zIsEmpty;
        u4 u4Var2;
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
                    v5.a("hasOwnProperty", 1, list);
                    String str3 = this.f6818a;
                    q qVarA = u4Var.a((q) list.get(0));
                    if ("length".equals(qVarA.zzc())) {
                        return q.Eo;
                    }
                    double dDoubleValue = qVarA.zzd().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i10 = (int) dDoubleValue) < 0 || i10 >= str3.length()) ? q.Fo : q.Eo;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1776922004:
                if (str.equals("toString")) {
                    v5.a("toString", 0, list);
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    v5.a("toLocaleLowerCase", 0, list);
                    return new u(this.f6818a.toLowerCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -1361633751:
                if (str.equals("charAt")) {
                    v5.c("charAt", 1, list);
                    int i13 = list.isEmpty() ? 0 : (int) v5.i(u4Var.a((q) list.get(0)).zzd().doubleValue());
                    String str4 = this.f6818a;
                    return (i13 < 0 || i13 >= str4.length()) ? q.Go : new u(String.valueOf(str4.charAt(i13)));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                uVar = this;
                if (str.equals("concat")) {
                    if (!list.isEmpty()) {
                        StringBuilder sb2 = new StringBuilder(uVar.f6818a);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            sb2.append(u4Var.a((q) list.get(i14)).zzc());
                        }
                        return new u(sb2.toString());
                    }
                    return uVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    v5.a("toLowerCase", 0, list);
                    return new u(this.f6818a.toLowerCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case -906336856:
                if (str.equals("search")) {
                    v5.c("search", 1, list);
                    Matcher matcher = Pattern.compile(list.isEmpty() ? "undefined" : u4Var.a((q) list.get(0)).zzc()).matcher(this.f6818a);
                    return matcher.find() ? new j(Double.valueOf(matcher.start())) : new j(Double.valueOf(-1.0d));
                }
                throw new IllegalArgumentException("Command not supported");
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    v5.a("toLocaleUpperCase", 0, list);
                    return new u(this.f6818a.toUpperCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    v5.c("lastIndexOf", 2, list);
                    String str5 = this.f6818a;
                    String strZzc2 = list.size() > 0 ? u4Var.a((q) list.get(0)).zzc() : "undefined";
                    double dDoubleValue2 = list.size() < 2 ? Double.NaN : u4Var.a((q) list.get(1)).zzd().doubleValue();
                    return new j(Double.valueOf(str5.lastIndexOf(strZzc2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : v5.i(dDoubleValue2)))));
                }
                throw new IllegalArgumentException("Command not supported");
            case -399551817:
                if (str.equals("toUpperCase")) {
                    v5.a("toUpperCase", 0, list);
                    return new u(this.f6818a.toUpperCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3568674:
                if (str.equals(str2)) {
                    v5.a("toUpperCase", 0, list);
                    return new u(this.f6818a.trim());
                }
                throw new IllegalArgumentException("Command not supported");
            case 103668165:
                if (str.equals("match")) {
                    v5.c("match", 1, list);
                    Matcher matcher2 = Pattern.compile(list.size() <= 0 ? "" : u4Var.a((q) list.get(0)).zzc()).matcher(this.f6818a);
                    return matcher2.find() ? new f(Arrays.asList(new u(matcher2.group()))) : q.Ao;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    v5.c("slice", 2, list);
                    String str6 = this.f6818a;
                    double dI = v5.i(!list.isEmpty() ? u4Var.a((q) list.get(0)).zzd().doubleValue() : 0.0d);
                    double dMax = dI < 0.0d ? Math.max(((double) str6.length()) + dI, 0.0d) : Math.min(dI, str6.length());
                    double dI2 = v5.i(list.size() > 1 ? u4Var.a((q) list.get(1)).zzd().doubleValue() : str6.length());
                    int i15 = (int) dMax;
                    return new u(str6.substring(i15, Math.max(0, ((int) (dI2 < 0.0d ? Math.max(((double) str6.length()) + dI2, 0.0d) : Math.min(dI2, str6.length()))) - i15) + i15));
                }
                throw new IllegalArgumentException("Command not supported");
            case 109648666:
                if (str.equals("split")) {
                    v5.c("split", 2, list);
                    String str7 = this.f6818a;
                    if (str7.length() == 0) {
                        return new f(Arrays.asList(this));
                    }
                    ArrayList arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        String strZzc3 = u4Var.a((q) list.get(0)).zzc();
                        long jH = list.size() > 1 ? v5.h(u4Var.a((q) list.get(1)).zzd().doubleValue()) : 2147483647L;
                        if (jH == 0) {
                            return new f();
                        }
                        String[] strArrSplit = str7.split(Pattern.quote(strZzc3), ((int) jH) + 1);
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
                        if (length > jH) {
                            i11--;
                        }
                        while (i12 < i11) {
                            arrayList.add(new u(strArrSplit[i12]));
                            i12++;
                        }
                    }
                    return new f(arrayList);
                }
                throw new IllegalArgumentException("Command not supported");
            case 530542161:
                if (str.equals("substring")) {
                    v5.c("substring", 2, list);
                    String str8 = this.f6818a;
                    int i16 = !list.isEmpty() ? (int) v5.i(u4Var.a((q) list.get(0)).zzd().doubleValue()) : 0;
                    int i17 = list.size() > 1 ? (int) v5.i(u4Var.a((q) list.get(1)).zzd().doubleValue()) : str8.length();
                    int iMin = Math.min(Math.max(i16, 0), str8.length());
                    int iMin2 = Math.min(Math.max(i17, 0), str8.length());
                    return new u(str8.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                throw new IllegalArgumentException("Command not supported");
            case 1094496948:
                uVar = this;
                if (str.equals("replace")) {
                    v5.c("replace", 2, list);
                    q qVarH = q.f6743zo;
                    if (!list.isEmpty()) {
                        strZzc = u4Var.a((q) list.get(0)).zzc();
                        if (list.size() > 1) {
                            qVarH = u4Var.a((q) list.get(1));
                        }
                    }
                    String str9 = strZzc;
                    String str10 = uVar.f6818a;
                    int iIndexOf = str10.indexOf(str9);
                    if (iIndexOf >= 0) {
                        if (qVarH instanceof k) {
                            qVarH = ((k) qVarH).h(u4Var, Arrays.asList(new u(str9), new j(Double.valueOf(iIndexOf)), uVar));
                        }
                        String strSubstring = str10.substring(0, iIndexOf);
                        String strZzc4 = qVarH.zzc();
                        String strSubstring2 = str10.substring(iIndexOf + str9.length());
                        StringBuilder sb3 = new StringBuilder(String.valueOf(strSubstring).length() + String.valueOf(strZzc4).length() + String.valueOf(strSubstring2).length());
                        sb3.append(strSubstring);
                        sb3.append(strZzc4);
                        sb3.append(strSubstring2);
                        return new u(sb3.toString());
                    }
                    return uVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    v5.c("indexOf", 2, list);
                    String str11 = this.f6818a;
                    if (list.size() <= 0) {
                        u4Var2 = u4Var;
                    } else {
                        u4Var2 = u4Var;
                        strZzc = u4Var2.a((q) list.get(0)).zzc();
                    }
                    return new j(Double.valueOf(str11.indexOf(strZzc, (int) v5.i(list.size() < 2 ? 0.0d : u4Var2.a((q) list.get(1)).zzd().doubleValue()))));
                }
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.f6818a.equals(((u) obj).f6818a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6818a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t(this);
    }

    public final String toString() {
        String str = this.f6818a;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append("\"");
        sb2.append(str);
        sb2.append("\"");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String zzc() {
        return this.f6818a;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double zzd() {
        String str = this.f6818a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Boolean zze() {
        return Boolean.valueOf(!this.f6818a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator zzf() {
        return new s(this);
    }
}
