package m7;

import java.util.List;
import o7.q;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<q> f22957a;
    public final char b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f22958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f22959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22961f;

    public d(List<q> list, char c10, double d10, double d11, String str, String str2) {
        this.f22957a = list;
        this.b = c10;
        this.f22958c = d10;
        this.f22959d = d11;
        this.f22960e = str;
        this.f22961f = str2;
    }

    public static int c(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<q> a() {
        return this.f22957a;
    }

    public double b() {
        return this.f22959d;
    }

    public int hashCode() {
        return c(this.b, this.f22961f, this.f22960e);
    }
}
