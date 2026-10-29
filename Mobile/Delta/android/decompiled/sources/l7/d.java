package l7;

import java.util.List;
import n7.q;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<q> f22972a;
    public final char b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f22973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f22974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22976f;

    public d(List<q> list, char c10, double d10, double d11, String str, String str2) {
        this.f22972a = list;
        this.b = c10;
        this.f22973c = d10;
        this.f22974d = d11;
        this.f22975e = str;
        this.f22976f = str2;
    }

    public static int c(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<q> a() {
        return this.f22972a;
    }

    public double b() {
        return this.f22974d;
    }

    public int hashCode() {
        return c(this.b, this.f22976f, this.f22975e);
    }
}
