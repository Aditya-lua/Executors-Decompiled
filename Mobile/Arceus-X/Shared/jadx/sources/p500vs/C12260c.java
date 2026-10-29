package p500vs;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import bt.AbstractC1490a;
import bt.C1491b;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: vs.c */
/* JADX INFO: loaded from: classes3.dex */
public class C12260c {

    /* JADX INFO: renamed from: x */
    public static final float[] f43351x = {2.0f, 1.5f, 1.17f, 1.0f, 0.83f, 0.67f};

    /* JADX INFO: renamed from: a */
    public final int f43352a;

    /* JADX INFO: renamed from: b */
    public final boolean f43353b;

    /* JADX INFO: renamed from: c */
    public final int f43354c;

    /* JADX INFO: renamed from: d */
    public final int f43355d;

    /* JADX INFO: renamed from: e */
    public final int f43356e;

    /* JADX INFO: renamed from: f */
    public final int f43357f;

    /* JADX INFO: renamed from: g */
    public final int f43358g;

    /* JADX INFO: renamed from: h */
    public final int f43359h;

    /* JADX INFO: renamed from: i */
    public final int f43360i;

    /* JADX INFO: renamed from: j */
    public final int f43361j;

    /* JADX INFO: renamed from: k */
    public final int f43362k;

    /* JADX INFO: renamed from: l */
    public final int f43363l;

    /* JADX INFO: renamed from: m */
    public final int f43364m;

    /* JADX INFO: renamed from: n */
    public final Typeface f43365n;

    /* JADX INFO: renamed from: o */
    public final Typeface f43366o;

    /* JADX INFO: renamed from: p */
    public final int f43367p;

    /* JADX INFO: renamed from: q */
    public final int f43368q;

    /* JADX INFO: renamed from: r */
    public final int f43369r;

    /* JADX INFO: renamed from: s */
    public final int f43370s;

    /* JADX INFO: renamed from: t */
    public final Typeface f43371t;

    /* JADX INFO: renamed from: u */
    public final float[] f43372u;

    /* JADX INFO: renamed from: v */
    public final int f43373v;

    /* JADX INFO: renamed from: w */
    public final int f43374w;

    /* JADX INFO: renamed from: vs.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f43375a;

        /* JADX INFO: renamed from: c */
        public int f43377c;

        /* JADX INFO: renamed from: d */
        public int f43378d;

        /* JADX INFO: renamed from: e */
        public int f43379e;

        /* JADX INFO: renamed from: f */
        public int f43380f;

        /* JADX INFO: renamed from: g */
        public int f43381g;

        /* JADX INFO: renamed from: h */
        public int f43382h;

        /* JADX INFO: renamed from: i */
        public int f43383i;

        /* JADX INFO: renamed from: j */
        public int f43384j;

        /* JADX INFO: renamed from: k */
        public int f43385k;

        /* JADX INFO: renamed from: l */
        public int f43386l;

        /* JADX INFO: renamed from: m */
        public int f43387m;

        /* JADX INFO: renamed from: n */
        public Typeface f43388n;

        /* JADX INFO: renamed from: o */
        public Typeface f43389o;

        /* JADX INFO: renamed from: p */
        public int f43390p;

        /* JADX INFO: renamed from: q */
        public int f43391q;

        /* JADX INFO: renamed from: s */
        public int f43393s;

        /* JADX INFO: renamed from: t */
        public Typeface f43394t;

        /* JADX INFO: renamed from: u */
        public float[] f43395u;

        /* JADX INFO: renamed from: v */
        public int f43396v;

        /* JADX INFO: renamed from: b */
        public boolean f43376b = true;

        /* JADX INFO: renamed from: r */
        public int f43392r = -1;

        /* JADX INFO: renamed from: w */
        public int f43397w = -1;

        @NonNull
        /* JADX INFO: renamed from: A */
        public a m45503A(int i10) {
            this.f43381g = i10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: B */
        public a m45504B(int i10) {
            this.f43387m = i10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: C */
        public a m45505C(int i10) {
            this.f43392r = i10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: D */
        public a m45506D(int i10) {
            this.f43397w = i10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: x */
        public a m45507x(int i10) {
            this.f43377c = i10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: y */
        public a m45508y(int i10) {
            this.f43378d = i10;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: z */
        public C12260c m45509z() {
            return new C12260c(this);
        }
    }

    public C12260c(@NonNull a aVar) {
        this.f43352a = aVar.f43375a;
        this.f43353b = aVar.f43376b;
        this.f43354c = aVar.f43377c;
        this.f43355d = aVar.f43378d;
        this.f43356e = aVar.f43379e;
        this.f43357f = aVar.f43380f;
        this.f43358g = aVar.f43381g;
        this.f43359h = aVar.f43382h;
        this.f43360i = aVar.f43383i;
        this.f43361j = aVar.f43384j;
        this.f43362k = aVar.f43385k;
        this.f43363l = aVar.f43386l;
        this.f43364m = aVar.f43387m;
        this.f43365n = aVar.f43388n;
        this.f43366o = aVar.f43389o;
        this.f43367p = aVar.f43390p;
        this.f43368q = aVar.f43391q;
        this.f43369r = aVar.f43392r;
        this.f43370s = aVar.f43393s;
        this.f43371t = aVar.f43394t;
        this.f43372u = aVar.f43395u;
        this.f43373v = aVar.f43396v;
        this.f43374w = aVar.f43397w;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static a m45465i(@NonNull Context context) {
        C1491b c1491bM7616a = C1491b.m7616a(context);
        return new a().m45504B(c1491bM7616a.m7617b(8)).m45507x(c1491bM7616a.m7617b(24)).m45508y(c1491bM7616a.m7617b(4)).m45503A(c1491bM7616a.m7617b(1)).m45505C(c1491bM7616a.m7617b(1)).m45506D(c1491bM7616a.m7617b(4));
    }

    /* JADX INFO: renamed from: a */
    public void m45466a(@NonNull Paint paint) {
        int iM7615a = this.f43356e;
        if (iM7615a == 0) {
            iM7615a = AbstractC1490a.m7615a(paint.getColor(), 25);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iM7615a);
    }

    /* JADX INFO: renamed from: b */
    public void m45467b(@NonNull Paint paint) {
        int i10 = this.f43361j;
        if (i10 == 0) {
            i10 = this.f43360i;
        }
        if (i10 != 0) {
            paint.setColor(i10);
        }
        Typeface typeface = this.f43366o;
        if (typeface == null) {
            typeface = this.f43365n;
        }
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i11 = this.f43368q;
            if (i11 <= 0) {
                i11 = this.f43367p;
            }
            if (i11 > 0) {
                paint.setTextSize(i11);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i12 = this.f43368q;
        if (i12 <= 0) {
            i12 = this.f43367p;
        }
        if (i12 > 0) {
            paint.setTextSize(i12);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m45468c(@NonNull Paint paint) {
        int i10 = this.f43360i;
        if (i10 != 0) {
            paint.setColor(i10);
        }
        Typeface typeface = this.f43365n;
        if (typeface != null) {
            paint.setTypeface(typeface);
            int i11 = this.f43367p;
            if (i11 > 0) {
                paint.setTextSize(i11);
                return;
            }
            return;
        }
        paint.setTypeface(Typeface.MONOSPACE);
        int i12 = this.f43367p;
        if (i12 > 0) {
            paint.setTextSize(i12);
        } else {
            paint.setTextSize(paint.getTextSize() * 0.87f);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m45469d(@NonNull Paint paint) {
        int iM7615a = this.f43370s;
        if (iM7615a == 0) {
            iM7615a = AbstractC1490a.m7615a(paint.getColor(), 75);
        }
        paint.setColor(iM7615a);
        paint.setStyle(Paint.Style.FILL);
        int i10 = this.f43369r;
        if (i10 >= 0) {
            paint.setStrokeWidth(i10);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m45470e(@NonNull Paint paint, int i10) {
        Typeface typeface = this.f43371t;
        if (typeface == null) {
            paint.setFakeBoldText(true);
        } else {
            paint.setTypeface(typeface);
        }
        float[] fArr = this.f43372u;
        if (fArr == null) {
            fArr = f43351x;
        }
        if (fArr == null || fArr.length < i10) {
            throw new IllegalStateException(String.format(Locale.US, "Supplied heading level: %d is invalid, where configured heading sizes are: `%s`", Integer.valueOf(i10), Arrays.toString(fArr)));
        }
        paint.setTextSize(paint.getTextSize() * fArr[i10 - 1]);
    }

    /* JADX INFO: renamed from: f */
    public void m45471f(@NonNull TextPaint textPaint) {
        textPaint.setUnderlineText(this.f43353b);
        int i10 = this.f43352a;
        if (i10 != 0) {
            textPaint.setColor(i10);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m45472g(@NonNull Paint paint) {
        int color = this.f43357f;
        if (color == 0) {
            color = paint.getColor();
        }
        paint.setColor(color);
        int i10 = this.f43358g;
        if (i10 != 0) {
            paint.setStrokeWidth(i10);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m45473h(@NonNull Paint paint) {
        int iM7615a = this.f43373v;
        if (iM7615a == 0) {
            iM7615a = AbstractC1490a.m7615a(paint.getColor(), 25);
        }
        paint.setColor(iM7615a);
        paint.setStyle(Paint.Style.FILL);
        int i10 = this.f43374w;
        if (i10 >= 0) {
            paint.setStrokeWidth(i10);
        }
    }

    /* JADX INFO: renamed from: j */
    public int m45474j() {
        return this.f43354c;
    }

    /* JADX INFO: renamed from: k */
    public int m45475k() {
        int i10 = this.f43355d;
        return i10 == 0 ? (int) ((this.f43354c * 0.25f) + 0.5f) : i10;
    }

    /* JADX INFO: renamed from: l */
    public int m45476l(int i10) {
        int iMin = Math.min(this.f43354c, i10) / 2;
        int i11 = this.f43359h;
        return (i11 == 0 || i11 > iMin) ? iMin : i11;
    }

    /* JADX INFO: renamed from: m */
    public int m45477m(@NonNull Paint paint) {
        int i10 = this.f43362k;
        return i10 != 0 ? i10 : AbstractC1490a.m7615a(paint.getColor(), 25);
    }

    /* JADX INFO: renamed from: n */
    public int m45478n(@NonNull Paint paint) {
        int i10 = this.f43363l;
        if (i10 == 0) {
            i10 = this.f43362k;
        }
        return i10 != 0 ? i10 : AbstractC1490a.m7615a(paint.getColor(), 25);
    }

    /* JADX INFO: renamed from: o */
    public int m45479o() {
        return this.f43364m;
    }
}
