package p266l7;

import android.graphics.PointF;

/* JADX INFO: renamed from: l7.b */
/* JADX INFO: loaded from: classes3.dex */
public class C8003b {

    /* JADX INFO: renamed from: a */
    public String f29929a;

    /* JADX INFO: renamed from: b */
    public String f29930b;

    /* JADX INFO: renamed from: c */
    public float f29931c;

    /* JADX INFO: renamed from: d */
    public a f29932d;

    /* JADX INFO: renamed from: e */
    public int f29933e;

    /* JADX INFO: renamed from: f */
    public float f29934f;

    /* JADX INFO: renamed from: g */
    public float f29935g;

    /* JADX INFO: renamed from: h */
    public int f29936h;

    /* JADX INFO: renamed from: i */
    public int f29937i;

    /* JADX INFO: renamed from: j */
    public float f29938j;

    /* JADX INFO: renamed from: k */
    public boolean f29939k;

    /* JADX INFO: renamed from: l */
    public PointF f29940l;

    /* JADX INFO: renamed from: m */
    public PointF f29941m;

    /* JADX INFO: renamed from: l7.b$a */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8003b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        m33066a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    /* JADX INFO: renamed from: a */
    public void m33066a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f29929a = str;
        this.f29930b = str2;
        this.f29931c = f10;
        this.f29932d = aVar;
        this.f29933e = i10;
        this.f29934f = f11;
        this.f29935g = f12;
        this.f29936h = i11;
        this.f29937i = i12;
        this.f29938j = f13;
        this.f29939k = z10;
        this.f29940l = pointF;
        this.f29941m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f29929a.hashCode() * 31) + this.f29930b.hashCode()) * 31) + this.f29931c)) * 31) + this.f29932d.ordinal()) * 31) + this.f29933e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f29934f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f29936h;
    }

    public C8003b() {
    }
}
