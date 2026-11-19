package mt;

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
    public static final float[] f24394x = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24395a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f24398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24401h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24402i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f24403j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f24404k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f24405l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f24406m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Typeface f24407n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Typeface f24408o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f24409p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f24410q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f24411r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f24412s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Typeface f24413t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float[] f24414u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f24415v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f24416w;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24417a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24420e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f24421f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f24422g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f24423h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f24424i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f24425j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f24426k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f24427l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f24428m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Typeface f24429n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Typeface f24430o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f24431p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f24432q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f24434s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Typeface f24435t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float[] f24436u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f24437v;
        public boolean b = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f24433r = -1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f24438w = -1;

        @NonNull
        public a A(int i10) {
            this.f24422g = i10;
            return this;
        }

        @NonNull
        public a B(int i10) {
            this.f24428m = i10;
            return this;
        }

        @NonNull
        public a C(int i10) {
            this.f24433r = i10;
            return this;
        }

        @NonNull
        public a D(int i10) {
            this.f24438w = i10;
            return this;
        }

        @NonNull
        public a x(int i10) {
            this.f24418c = i10;
            return this;
        }

        @NonNull
        public a y(int i10) {
            this.f24419d = i10;
            return this;
        }

        @NonNull
        public c z() {
            return new c(this);
        }
    }

    public c(@NonNull a aVar) {
        this.f24395a = aVar.f24417a;
        this.b = aVar.b;
        this.f24396c = aVar.f24418c;
        this.f24397d = aVar.f24419d;
        this.f24398e = aVar.f24420e;
        this.f24399f = aVar.f24421f;
        this.f24400g = aVar.f24422g;
        this.f24401h = aVar.f24423h;
        this.f24402i = aVar.f24424i;
        this.f24403j = aVar.f24425j;
        this.f24404k = aVar.f24426k;
        this.f24405l = aVar.f24427l;
        this.f24406m = aVar.f24428m;
        this.f24407n = aVar.f24429n;
        this.f24408o = aVar.f24430o;
        this.f24409p = aVar.f24431p;
        this.f24410q = aVar.f24432q;
        this.f24411r = aVar.f24433r;
        this.f24412s = aVar.f24434s;
        this.f24413t = aVar.f24435t;
        this.f24414u = aVar.f24436u;
        this.f24415v = aVar.f24437v;
        this.f24416w = aVar.f24438w;
    }

    @NonNull
    public static a i(@NonNull Context context) {
        st.b bVarA = st.b.a(context);
        return new a().B(bVarA.b(8)).x(bVarA.b(24)).y(bVarA.b(4)).A(bVarA.b(1)).C(bVarA.b(1)).D(bVarA.b(4));
    }

    public void a(@NonNull Paint paint) {
        int iA = this.f24398e;
        if (iA == 0) {
            iA = st.a.a(paint.getColor(), 25);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iA);
    }

    public void b(@NonNull Paint paint) {
        int i10 = this.f24403j;
        if (i10 == 0) {
            i10 = this.f24402i;
        }
        if (i10 != 0) {
            paint.setColor(i10);
        }
        Typeface typeface = this.f24408o;
        if (typeface == null) {
            typeface = this.f24407n;
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i11 = this.f24410q;
            if (i11 <= 0) {
                i11 = this.f24409p;
            }
            if (i11 > 0) {
                paint.setTextSize(i11);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i12 = this.f24410q;
        if (i12 <= 0) {
            i12 = this.f24409p;
        }
        if (i12 > 0) {
            paint.setTextSize(i12);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void c(@NonNull Paint paint) {
        int i10 = this.f24402i;
        if (i10 != 0) {
            paint.setColor(i10);
        }
        Typeface typeface = this.f24407n;
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i11 = this.f24409p;
            if (i11 > 0) {
                paint.setTextSize(i11);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i12 = this.f24409p;
        if (i12 > 0) {
            paint.setTextSize(i12);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    public void d(@NonNull Paint paint) {
        int iA = this.f24412s;
        if (iA == 0) {
            iA = st.a.a(paint.getColor(), 75);
        }
        paint.setColor(iA);
        paint.setStyle(Paint.Style.FILL);
        int i10 = this.f24411r;
        if (i10 >= 0) {
            paint.setStrokeWidth(i10);
        }
    }

    public void e(@NonNull Paint paint, int i10) {
        Typeface typeface = this.f24413t;
        if (typeface == null) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(typeface);
        }
        float[] fArr = this.f24414u;
        if (fArr == null) {
            fArr = f24394x;
        }
        if (fArr == null || fArr.length < i10) {
            throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", Integer.valueOf(i10), Arrays.toString(fArr)));
        }
        paint.setTextSize(paint.getTextSize() * fArr[i10 - 1]);
    }

    public void f(@NonNull TextPaint textPaint) {
        textPaint.setUnderlineText(this.b);
        int i10 = this.f24395a;
        if (i10 != 0) {
            textPaint.setColor(i10);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    public void g(@NonNull Paint paint) {
        int color = this.f24399f;
        if (color == 0) {
            color = paint.getColor();
        }
        paint.setColor(color);
        int i10 = this.f24400g;
        if (i10 != 0) {
            paint.setStrokeWidth(i10);
        }
    }

    public void h(@NonNull Paint paint) {
        int iA = this.f24415v;
        if (iA == 0) {
            iA = st.a.a(paint.getColor(), 25);
        }
        paint.setColor(iA);
        paint.setStyle(Paint.Style.FILL);
        int i10 = this.f24416w;
        if (i10 >= 0) {
            paint.setStrokeWidth(i10);
        }
    }

    public int j() {
        return this.f24396c;
    }

    public int k() {
        int i10 = this.f24397d;
        return i10 == 0 ? (int) ((this.f24396c * 0.25f) + 0.5f) : i10;
    }

    public int l(int i10) {
        int iMin = Math.min(this.f24396c, i10) / 2;
        int i11 = this.f24401h;
        return (i11 == 0 || i11 > iMin) ? iMin : i11;
    }

    public int m(@NonNull Paint paint) {
        int i10 = this.f24404k;
        return i10 != 0 ? i10 : st.a.a(paint.getColor(), 25);
    }

    public int n(@NonNull Paint paint) {
        int i10 = this.f24405l;
        if (i10 == 0) {
            i10 = this.f24404k;
        }
        return i10 != 0 ? i10 : st.a.a(paint.getColor(), 25);
    }

    public int o() {
        return this.f24406m;
    }
}
