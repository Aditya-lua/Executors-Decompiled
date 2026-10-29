package l7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f22953a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f22954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f22955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f22957f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f22958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f22959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f22961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f22963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f22964m;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f22953a = str;
        this.b = str2;
        this.f22954c = f10;
        this.f22955d = aVar;
        this.f22956e = i10;
        this.f22957f = f11;
        this.f22958g = f12;
        this.f22959h = i11;
        this.f22960i = i12;
        this.f22961j = f13;
        this.f22962k = z10;
        this.f22963l = pointF;
        this.f22964m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f22953a.hashCode() * 31) + this.b.hashCode()) * 31) + this.f22954c)) * 31) + this.f22955d.ordinal()) * 31) + this.f22956e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f22957f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f22959h;
    }

    public b() {
    }
}
