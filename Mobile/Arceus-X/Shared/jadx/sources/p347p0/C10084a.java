package p347p0;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.Comparator;
import p503w0.C12274d;
import p533x2.C12637g;

/* JADX INFO: renamed from: p0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10084a {

    /* JADX INFO: renamed from: a */
    public static final Rational f36314a = new Rational(4, 3);

    /* JADX INFO: renamed from: b */
    public static final Rational f36315b = new Rational(3, 4);

    /* JADX INFO: renamed from: c */
    public static final Rational f36316c = new Rational(16, 9);

    /* JADX INFO: renamed from: d */
    public static final Rational f36317d = new Rational(9, 16);

    /* JADX INFO: renamed from: p0.a$a */
    public static final class a implements Comparator<Rational> {

        /* JADX INFO: renamed from: a */
        public final Rational f36318a;

        /* JADX INFO: renamed from: b */
        public final RectF f36319b;

        /* JADX INFO: renamed from: c */
        public final Rational f36320c;

        public a(Rational rational, Rational rational2) {
            this.f36318a = rational;
            this.f36320c = rational2 == null ? new Rational(4, 3) : rational2;
            this.f36319b = m38871d(rational);
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            if (rational.equals(rational2)) {
                return 0;
            }
            RectF rectFM38871d = m38871d(rational);
            RectF rectFM38871d2 = m38871d(rational2);
            boolean zM38872e = m38872e(rectFM38871d, this.f36319b);
            boolean zM38872e2 = m38872e(rectFM38871d2, this.f36319b);
            if (zM38872e && zM38872e2) {
                return (int) Math.signum(m38869b(rectFM38871d) - m38869b(rectFM38871d2));
            }
            if (zM38872e) {
                return -1;
            }
            if (zM38872e2) {
                return 1;
            }
            return -((int) Math.signum(m38870c(rectFM38871d, this.f36319b) - m38870c(rectFM38871d2, this.f36319b)));
        }

        /* JADX INFO: renamed from: b */
        public final float m38869b(RectF rectF) {
            return rectF.width() * rectF.height();
        }

        /* JADX INFO: renamed from: c */
        public final float m38870c(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        /* JADX INFO: renamed from: d */
        public final RectF m38871d(Rational rational) {
            if (rational.floatValue() == this.f36320c.floatValue()) {
                return new RectF(0.0f, 0.0f, this.f36320c.getNumerator(), this.f36320c.getDenominator());
            }
            return rational.floatValue() > this.f36320c.floatValue() ? new RectF(0.0f, 0.0f, this.f36320c.getNumerator(), (rational.getDenominator() * this.f36320c.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * this.f36320c.getDenominator()) / rational.getDenominator(), this.f36320c.getDenominator());
        }

        /* JADX INFO: renamed from: e */
        public final boolean m38872e(RectF rectF, RectF rectF2) {
            return rectF.width() >= rectF2.width() && rectF.height() >= rectF2.height();
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m38864a(Size size, Rational rational) {
        return m38865b(size, rational, C12274d.f43482c);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m38865b(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        if (C12274d.m45571c(size) >= C12274d.m45571c(size2)) {
            return m38866c(size, rational);
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m38866c(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
        int i10 = width % 16;
        if (i10 == 0 && height % 16 == 0) {
            return m38867d(Math.max(0, height + (-16)), width, rational) || m38867d(Math.max(0, width + (-16)), height, rational2);
        }
        if (i10 == 0) {
            return m38867d(height, width, rational);
        }
        if (height % 16 == 0) {
            return m38867d(width, height, rational2);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m38867d(int i10, int i11, Rational rational) {
        C12637g.m47069a(i11 % 16 == 0);
        double numerator = ((double) (i10 * rational.getNumerator())) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i11 + (-16))) && numerator < ((double) (i11 + 16));
    }
}
