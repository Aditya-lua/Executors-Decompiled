package ts;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final float[] f32612x = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32613a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f32614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f32616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f32617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f32618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f32619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f32620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f32621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f32622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f32623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f32624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Typeface f32625n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Typeface f32626o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f32627p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f32628q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f32629r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f32630s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Typeface f32631t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float[] f32632u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f32633v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f32634w;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32635a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f32636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f32637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f32638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f32639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f32640g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f32641h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f32642i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f32643j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f32644k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f32645l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f32646m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Typeface f32647n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Typeface f32648o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f32649p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f32650q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f32652s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Typeface f32653t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float[] f32654u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f32655v;
        public boolean b = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f32651r = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f32656w = -1;

        @NonNull
        public a A(int i10) {
            this.f32640g = i10;
            return this;
        }

        @NonNull
        public a B(int i10) {
            this.f32646m = i10;
            return this;
        }

        @NonNull
        public a C(int i10) {
            this.f32651r = i10;
            return this;
        }

        @NonNull
        public a D(int i10) {
            this.f32656w = i10;
            return this;
        }

        @NonNull
        public a x(int i10) {
            this.f32636c = i10;
            return this;
        }

        @NonNull
        public a y(int i10) {
            this.f32637d = i10;
            return this;
        }

        @NonNull
        public c z() {
            return new c(this);
        }
    }

    public c(@NonNull a aVar) {
        this.f32613a = aVar.f32635a;
        this.b = aVar.b;
        this.f32614c = aVar.f32636c;
        this.f32615d = aVar.f32637d;
        this.f32616e = aVar.f32638e;
        this.f32617f = aVar.f32639f;
        this.f32618g = aVar.f32640g;
        this.f32619h = aVar.f32641h;
        this.f32620i = aVar.f32642i;
        this.f32621j = aVar.f32643j;
        this.f32622k = aVar.f32644k;
        this.f32623l = aVar.f32645l;
        this.f32624m = aVar.f32646m;
        this.f32625n = aVar.f32647n;
        this.f32626o = aVar.f32648o;
        this.f32627p = aVar.f32649p;
        this.f32628q = aVar.f32650q;
        this.f32629r = aVar.f32651r;
        this.f32630s = aVar.f32652s;
        this.f32631t = aVar.f32653t;
        this.f32632u = aVar.f32654u;
        this.f32633v = aVar.f32655v;
        this.f32634w = aVar.f32656w;
    }

    @NonNull
    public static a i(@NonNull Context context) {
        zs.b bVarA = zs.b.a(context);
        return new a().B(bVarA.b(8)).x(bVarA.b(24)).y(bVarA.b(4)).A(bVarA.b(1)).C(bVarA.b(1)).D(bVarA.b(4));
    }

    public void a(@NonNull Paint paint) {
        int iA = this.f32616e;
        if (iA == 0) {
            iA = zs.a.a(paint.getColor(), 25);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iA);
    }

    public void b(@NonNull Paint paint) {
        int i10 = this.f32621j;
        if (i10 == 0) {
            i10 = this.f32620i;
        }
        if (i10 != 0) {
            paint.setColor(i10);
        }
        Typeface typeface = this.f32626o;
        if (typeface == null) {
            typeface = this.f32625n;
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i11 = this.f32628q;
            if (i11 <= 0) {
                i11 = this.f32627p;
            }
            if (i11 > 0) {
                paint.setTextSize(i11);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i12 = this.f32628q;
        if (i12 <= 0) {
            i12 = this.f32627p;
        }
        if (i12 > 0) {
            paint.setTextSize(i12);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void c(@NonNull Paint paint) {
        int i10 = this.f32620i;
        if (i10 != 0) {
            paint.setColor(i10);
        }
        Typeface typeface = this.f32625n;
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i11 = this.f32627p;
            if (i11 > 0) {
                paint.setTextSize(i11);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i12 = this.f32627p;
        if (i12 > 0) {
            paint.setTextSize(i12);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void d(@NonNull Paint paint) {
        int iA = this.f32630s;
        if (iA == 0) {
            iA = zs.a.a(paint.getColor(), 75);
        }
        paint.setColor(iA);
        paint.setStyle(Paint.Style.FILL);
        int i10 = this.f32629r;
        if (i10 >= 0) {
            paint.setStrokeWidth(i10);
        }
    }

    public void e(@NonNull Paint paint, int i10) {
        Typeface typeface = this.f32631t;
        if (typeface == null) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(typeface);
        }
        float[] fArr = this.f32632u;
        if (fArr == null) {
            fArr = f32612x;
        }
        if (fArr == null || fArr.length < i10) {
            throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", Integer.valueOf(i10), Arrays.toString(fArr)));
        }
        paint.setTextSize(paint.getTextSize() * fArr[i10 - 1]);
    }

    public void f(@NonNull TextPaint textPaint) {
        textPaint.setUnderlineText(this.b);
        int i10 = this.f32613a;
        if (i10 != 0) {
            textPaint.setColor(i10);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    public void g(@NonNull Paint paint) {
        int color = this.f32617f;
        if (color == 0) {
            color = paint.getColor();
        }
        paint.setColor(color);
        int i10 = this.f32618g;
        if (i10 != 0) {
            paint.setStrokeWidth(i10);
        }
    }

    public void h(@NonNull Paint paint) {
        int iA = this.f32633v;
        if (iA == 0) {
            iA = zs.a.a(paint.getColor(), 25);
        }
        paint.setColor(iA);
        paint.setStyle(Paint.Style.FILL);
        int i10 = this.f32634w;
        if (i10 >= 0) {
            paint.setStrokeWidth(i10);
        }
    }

    public int j() {
        return this.f32614c;
    }

    public int k() {
        int i10 = this.f32615d;
        return i10 == 0 ? (int) ((this.f32614c * 0.25f) + 0.5f) : i10;
    }

    public int l(int i10) {
        int iMin = Math.min(this.f32614c, i10) / 2;
        int i11 = this.f32619h;
        return (i11 == 0 || i11 > iMin) ? iMin : i11;
    }

    public int m(@NonNull Paint paint) {
        int i10 = this.f32622k;
        return i10 != 0 ? i10 : zs.a.a(paint.getColor(), 25);
    }

    public int n(@NonNull Paint paint) {
        int i10 = this.f32623l;
        if (i10 == 0) {
            i10 = this.f32622k;
        }
        return i10 != 0 ? i10 : zs.a.a(paint.getColor(), 25);
    }

    public int o() {
        return this.f32624m;
    }
}
