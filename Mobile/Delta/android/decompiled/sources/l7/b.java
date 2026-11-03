package l7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23347a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f23348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f23349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f23351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f23352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f23355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f23356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f23357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f23358m;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f23347a = str;
        this.b = str2;
        this.f23348c = f10;
        this.f23349d = aVar;
        this.f23350e = i10;
        this.f23351f = f11;
        this.f23352g = f12;
        this.f23353h = i11;
        this.f23354i = i12;
        this.f23355j = f13;
        this.f23356k = z10;
        this.f23357l = pointF;
        this.f23358m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f23347a.hashCode() * 31) + this.b.hashCode()) * 31) + this.f23348c)) * 31) + this.f23349d.ordinal()) * 31) + this.f23350e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f23351f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f23353h;
    }

    public b() {
    }
}
