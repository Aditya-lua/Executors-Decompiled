package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
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
    public final String f6863a;

    public u(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f6863a = str;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final q a() {
        return new u(this.f6863a);
    }

    public final /* synthetic */ String b() {
        return this.f6863a;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02d8 A[PHI: r10
      0x02d8: PHI (r10v6 boolean) = (r10v12 boolean), (r10v13 boolean), (r10v16 boolean) binds: [B:100:0x02c4, B:101:0x02c6, B:103:0x02d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.q
    public final q e(String str, y4 y4Var, List list) {
        String str2;
        int i10;
        u uVar;
        int i11;
        int i12;
        y4 y4Var2;
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
                    z5.a("hasOwnProperty", 1, list);
                    String str3 = this.f6863a;
                    q qVarA = y4Var.a((q) list.get(0));
                    if ("length".equals(qVarA.zzc())) {
                        return q.Ho;
                    }
                    double dDoubleValue = qVarA.zzd().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i10 = (int) dDoubleValue) < 0 || i10 >= str3.length()) ? q.Jo : q.Ho;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1776922004:
                if (str.equals("toString")) {
                    z5.a("toString", 0, list);
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    z5.a("toLocaleLowerCase", 0, list);
                    return new u(this.f6863a.toLowerCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -1361633751:
                if (str.equals("charAt")) {
                    z5.c("charAt", 1, list);
                    int i13 = list.isEmpty() ? 0 : (int) z5.i(y4Var.a((q) list.get(0)).zzd().doubleValue());
                    String str4 = this.f6863a;
                    return (i13 < 0 || i13 >= str4.length()) ? q.Ko : new u(String.valueOf(str4.charAt(i13)));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                uVar = this;
                if (str.equals("concat")) {
                    if (!list.isEmpty()) {
                        StringBuilder sb2 = new StringBuilder(uVar.f6863a);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            sb2.append(y4Var.a((q) list.get(i14)).zzc());
                        }
                        return new u(sb2.toString());
                    }
                    return uVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    z5.a("toLowerCase", 0, list);
                    return new u(this.f6863a.toLowerCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case -906336856:
                if (str.equals("search")) {
                    z5.c("search", 1, list);
                    Matcher matcher = Pattern.compile(list.isEmpty() ? "undefined" : y4Var.a((q) list.get(0)).zzc()).matcher(this.f6863a);
                    return matcher.find() ? new j(Double.valueOf(matcher.start())) : new j(Double.valueOf(-1.0d));
                }
                throw new IllegalArgumentException("Command not supported");
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    z5.a("toLocaleUpperCase", 0, list);
                    return new u(this.f6863a.toUpperCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    z5.c("lastIndexOf", 2, list);
                    String str5 = this.f6863a;
                    String strZzc2 = list.size() > 0 ? y4Var.a((q) list.get(0)).zzc() : "undefined";
                    double dDoubleValue2 = list.size() < 2 ? Double.NaN : y4Var.a((q) list.get(1)).zzd().doubleValue();
                    return new j(Double.valueOf(str5.lastIndexOf(strZzc2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : z5.i(dDoubleValue2)))));
                }
                throw new IllegalArgumentException("Command not supported");
            case -399551817:
                if (str.equals("toUpperCase")) {
                    z5.a("toUpperCase", 0, list);
                    return new u(this.f6863a.toUpperCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3568674:
                if (str.equals(str2)) {
                    z5.a("toUpperCase", 0, list);
                    return new u(this.f6863a.trim());
                }
                throw new IllegalArgumentException("Command not supported");
            case 103668165:
                if (str.equals("match")) {
                    z5.c("match", 1, list);
                    Matcher matcher2 = Pattern.compile(list.size() <= 0 ? BuildConfig.FLAVOR : y4Var.a((q) list.get(0)).zzc()).matcher(this.f6863a);
                    return matcher2.find() ? new f(Arrays.asList(new u(matcher2.group()))) : q.Do;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    z5.c("slice", 2, list);
                    String str6 = this.f6863a;
                    double dI = z5.i(!list.isEmpty() ? y4Var.a((q) list.get(0)).zzd().doubleValue() : 0.0d);
                    double dMax = dI < 0.0d ? Math.max(((double) str6.length()) + dI, 0.0d) : Math.min(dI, str6.length());
                    double dI2 = z5.i(list.size() > 1 ? y4Var.a((q) list.get(1)).zzd().doubleValue() : str6.length());
                    int i15 = (int) dMax;
                    return new u(str6.substring(i15, Math.max(0, ((int) (dI2 < 0.0d ? Math.max(((double) str6.length()) + dI2, 0.0d) : Math.min(dI2, str6.length()))) - i15) + i15));
                }
                throw new IllegalArgumentException("Command not supported");
            case 109648666:
                if (str.equals("split")) {
                    z5.c("split", 2, list);
                    String str7 = this.f6863a;
                    if (str7.length() == 0) {
                        return new f(Arrays.asList(this));
                    }
                    ArrayList arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        String strZzc3 = y4Var.a((q) list.get(0)).zzc();
                        long jH = list.size() > 1 ? z5.h(y4Var.a((q) list.get(1)).zzd().doubleValue()) : 2147483647L;
                        if (jH == 0) {
                            return new f();
                        }
                        String[] strArrSplit = str7.split(Pattern.quote(strZzc3), ((int) jH) + 1);
                        int length = strArrSplit.length;
                        if (!strZzc3.isEmpty() || length <= 0) {
                            i11 = length;
                            i12 = z10;
                        } else {
                            boolean zIsEmpty = strArrSplit[0].isEmpty();
                            i11 = length - 1;
                            i12 = zIsEmpty;
                            z10 = zIsEmpty;
                            if (!strArrSplit[i11].isEmpty()) {
                                i11 = length;
                                i12 = z10;
                            }
                        }
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
                    z5.c("substring", 2, list);
                    String str8 = this.f6863a;
                    int i16 = !list.isEmpty() ? (int) z5.i(y4Var.a((q) list.get(0)).zzd().doubleValue()) : 0;
                    int i17 = list.size() > 1 ? (int) z5.i(y4Var.a((q) list.get(1)).zzd().doubleValue()) : str8.length();
                    int iMin = Math.min(Math.max(i16, 0), str8.length());
                    int iMin2 = Math.min(Math.max(i17, 0), str8.length());
                    return new u(str8.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                throw new IllegalArgumentException("Command not supported");
            case 1094496948:
                uVar = this;
                if (str.equals("replace")) {
                    z5.c("replace", 2, list);
                    q qVarH = q.Co;
                    if (!list.isEmpty()) {
                        strZzc = y4Var.a((q) list.get(0)).zzc();
                        if (list.size() > 1) {
                            qVarH = y4Var.a((q) list.get(1));
                        }
                    }
                    String str9 = strZzc;
                    String str10 = uVar.f6863a;
                    int iIndexOf = str10.indexOf(str9);
                    if (iIndexOf >= 0) {
                        if (qVarH instanceof k) {
                            qVarH = ((k) qVarH).h(y4Var, Arrays.asList(new u(str9), new j(Double.valueOf(iIndexOf)), uVar));
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
                    z5.c("indexOf", 2, list);
                    String str11 = this.f6863a;
                    if (list.size() <= 0) {
                        y4Var2 = y4Var;
                    } else {
                        y4Var2 = y4Var;
                        strZzc = y4Var2.a((q) list.get(0)).zzc();
                    }
                    return new j(Double.valueOf(str11.indexOf(strZzc, (int) z5.i(list.size() < 2 ? 0.0d : y4Var2.a((q) list.get(1)).zzd().doubleValue()))));
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
            return this.f6863a.equals(((u) obj).f6863a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6863a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t(this);
    }

    public final String toString() {
        String str = this.f6863a;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append("\"");
        sb2.append(str);
        sb2.append("\"");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final String zzc() {
        return this.f6863a;
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Double zzd() {
        String str = this.f6863a;
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
        return Boolean.valueOf(!this.f6863a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.q
    public final Iterator zzf() {
        return new s(this);
    }
}
