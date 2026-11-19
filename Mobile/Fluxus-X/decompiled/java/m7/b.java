package m7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22938a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f22939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f22940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f22942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f22943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f22946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f22948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f22949m;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f22938a = str;
        this.b = str2;
        this.f22939c = f10;
        this.f22940d = aVar;
        this.f22941e = i10;
        this.f22942f = f11;
        this.f22943g = f12;
        this.f22944h = i11;
        this.f22945i = i12;
        this.f22946j = f13;
        this.f22947k = z10;
        this.f22948l = pointF;
        this.f22949m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f22938a.hashCode() * 31) + this.b.hashCode()) * 31) + this.f22939c)) * 31) + this.f22940d.ordinal()) * 31) + this.f22941e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f22942f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f22944h;
    }

    public b() {
    }
}
