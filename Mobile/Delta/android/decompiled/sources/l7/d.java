package l7;

import java.util.List;
import n7.q;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<q> f23366a;
    public final char b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f23367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f23368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f23369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f23370f;

    public d(List<q> list, char c10, double d10, double d11, String str, String str2) {
        this.f23366a = list;
        this.b = c10;
        this.f23367c = d10;
        this.f23368d = d11;
        this.f23369e = str;
        this.f23370f = str2;
    }

    public static int c(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<q> a() {
        return this.f23366a;
    }

    public double b() {
        return this.f23368d;
    }

    public int hashCode() {
        return c(this.b, this.f23370f, this.f23369e);
    }
}
