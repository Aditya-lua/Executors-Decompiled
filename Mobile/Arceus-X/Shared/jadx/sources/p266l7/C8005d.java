package p266l7;

import java.util.List;
import p303n7.C8911q;

/* JADX INFO: renamed from: l7.d */
/* JADX INFO: loaded from: classes3.dex */
public class C8005d {

    /* JADX INFO: renamed from: a */
    public final List<C8911q> f29951a;

    /* JADX INFO: renamed from: b */
    public final char f29952b;

    /* JADX INFO: renamed from: c */
    public final double f29953c;

    /* JADX INFO: renamed from: d */
    public final double f29954d;

    /* JADX INFO: renamed from: e */
    public final String f29955e;

    /* JADX INFO: renamed from: f */
    public final String f29956f;

    public C8005d(List<C8911q> list, char c10, double d10, double d11, String str, String str2) {
        this.f29951a = list;
        this.f29952b = c10;
        this.f29953c = d10;
        this.f29954d = d11;
        this.f29955e = str;
        this.f29956f = str2;
    }

    /* JADX INFO: renamed from: c */
    public static int m33073c(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* JADX INFO: renamed from: a */
    public List<C8911q> m33074a() {
        return this.f29951a;
    }

    /* JADX INFO: renamed from: b */
    public double m33075b() {
        return this.f29954d;
    }

    public int hashCode() {
        return m33073c(this.f29952b, this.f29956f, this.f29955e);
    }
}
