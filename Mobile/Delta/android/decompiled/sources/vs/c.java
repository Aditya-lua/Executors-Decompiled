package vs;

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
    public static final float[] f33476x = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33477a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f33480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f33481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f33482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f33483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f33484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f33485j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f33486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f33487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f33488m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Typeface f33489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Typeface f33490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f33491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f33492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f33493r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f33494s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Typeface f33495t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float[] f33496u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f33497v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f33498w;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33499a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f33501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f33502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f33503f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f33504g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f33505h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f33506i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f33507j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f33508k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f33509l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f33510m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Typeface f33511n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Typeface f33512o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f33513p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f33514q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f33516s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Typeface f33517t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float[] f33518u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f33519v;
        public boolean b = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f33515r = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f33520w = -1;

        @NonNull
        public a A(int i10) {
            this.f33504g = i10;
            return this;
        }

        @NonNull
        public a B(int i10) {
            this.f33510m = i10;
            return this;
        }

        @NonNull
        public a C(int i10) {
            this.f33515r = i10;
            return this;
        }

        @NonNull
        public a D(int i10) {
            this.f33520w = i10;
            return this;
        }

        @NonNull
        public a x(int i10) {
            this.f33500c = i10;
            return this;
        }

        @NonNull
        public a y(int i10) {
            this.f33501d = i10;
            return this;
        }

        @NonNull
        public c z() {
            return new c(this);
        }
    }

    public c(@NonNull a aVar) {
        this.f33477a = aVar.f33499a;
        this.b = aVar.b;
        this.f33478c = aVar.f33500c;
        this.f33479d = aVar.f33501d;
        this.f33480e = aVar.f33502e;
        this.f33481f = aVar.f33503f;
        this.f33482g = aVar.f33504g;
        this.f33483h = aVar.f33505h;
        this.f33484i = aVar.f33506i;
        this.f33485j = aVar.f33507j;
        this.f33486k = aVar.f33508k;
        this.f33487l = aVar.f33509l;
        this.f33488m = aVar.f33510m;
        this.f33489n = aVar.f33511n;
        this.f33490o = aVar.f33512o;
        this.f33491p = aVar.f33513p;
        this.f33492q = aVar.f33514q;
        this.f33493r = aVar.f33515r;
        this.f33494s = aVar.f33516s;
        this.f33495t = aVar.f33517t;
        this.f33496u = aVar.f33518u;
        this.f33497v = aVar.f33519v;
        this.f33498w = aVar.f33520w;
    }

    @NonNull
    public static a i(@NonNull Context context) {
        bt.b bVarA = bt.b.a(context);
        return new a().B(bVarA.b(8)).x(bVarA.b(24)).y(bVarA.b(4)).A(bVarA.b(1)).C(bVarA.b(1)).D(bVarA.b(4));
    }

    public void a(@NonNull Paint paint) {
        int iA = this.f33480e;
        if (iA == 0) {
            iA = bt.a.a(paint.getColor(), 25);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iA);
    }

    public void b(@NonNull Paint paint) {
        int i10 = this.f33485j;
        if (i10 == 0) {
            i10 = this.f33484i;
        }
        if (i10 != 0) {
            paint.setColor(i10);
        }
        Typeface typeface = this.f33490o;
        if (typeface == null) {
            typeface = this.f33489n;
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i11 = this.f33492q;
            if (i11 <= 0) {
                i11 = this.f33491p;
            }
            if (i11 > 0) {
                paint.setTextSize(i11);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i12 = this.f33492q;
        if (i12 <= 0) {
            i12 = this.f33491p;
        }
        if (i12 > 0) {
            paint.setTextSize(i12);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void c(@NonNull Paint paint) {
        int i10 = this.f33484i;
        if (i10 != 0) {
            paint.setColor(i10);
        }
        Typeface typeface = this.f33489n;
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i11 = this.f33491p;
            if (i11 > 0) {
                paint.setTextSize(i11);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i12 = this.f33491p;
        if (i12 > 0) {
            paint.setTextSize(i12);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void d(@NonNull Paint paint) {
        int iA = this.f33494s;
        if (iA == 0) {
            iA = bt.a.a(paint.getColor(), 75);
        }
        paint.setColor(iA);
        paint.setStyle(Paint.Style.FILL);
        int i10 = this.f33493r;
        if (i10 >= 0) {
            paint.setStrokeWidth(i10);
        }
    }

    public void e(@NonNull Paint paint, int i10) {
        Typeface typeface = this.f33495t;
        if (typeface == null) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(typeface);
        }
        float[] fArr = this.f33496u;
        if (fArr == null) {
            fArr = f33476x;
        }
        if (fArr == null || fArr.length < i10) {
            throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", Integer.valueOf(i10), Arrays.toString(fArr)));
        }
        paint.setTextSize(paint.getTextSize() * fArr[i10 - 1]);
    }

    public void f(@NonNull TextPaint textPaint) {
        textPaint.setUnderlineText(this.b);
        int i10 = this.f33477a;
        if (i10 != 0) {
            textPaint.setColor(i10);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    public void g(@NonNull Paint paint) {
        int color = this.f33481f;
        if (color == 0) {
            color = paint.getColor();
        }
        paint.setColor(color);
        int i10 = this.f33482g;
        if (i10 != 0) {
            paint.setStrokeWidth(i10);
        }
    }

    public void h(@NonNull Paint paint) {
        int iA = this.f33497v;
        if (iA == 0) {
            iA = bt.a.a(paint.getColor(), 25);
        }
        paint.setColor(iA);
        paint.setStyle(Paint.Style.FILL);
        int i10 = this.f33498w;
        if (i10 >= 0) {
            paint.setStrokeWidth(i10);
        }
    }

    public int j() {
        return this.f33478c;
    }

    public int k() {
        int i10 = this.f33479d;
        return i10 == 0 ? (int) ((this.f33478c * 0.25f) + 0.5f) : i10;
    }

    public int l(int i10) {
        int iMin = Math.min(this.f33478c, i10) / 2;
        int i11 = this.f33483h;
        return (i11 == 0 || i11 > iMin) ? iMin : i11;
    }

    public int m(@NonNull Paint paint) {
        int i10 = this.f33486k;
        return i10 != 0 ? i10 : bt.a.a(paint.getColor(), 25);
    }

    public int n(@NonNull Paint paint) {
        int i10 = this.f33487l;
        if (i10 == 0) {
            i10 = this.f33486k;
        }
        return i10 != 0 ? i10 : bt.a.a(paint.getColor(), 25);
    }

    public int o() {
        return this.f33488m;
    }
}
