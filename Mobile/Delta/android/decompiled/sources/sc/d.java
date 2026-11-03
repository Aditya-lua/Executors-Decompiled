package sc;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface d {

    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> b = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f31166a = new e();

        @Override // android.animation.TypeEvaluator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f10, @NonNull e eVar, @NonNull e eVar2) {
            this.f31166a.a(bd.a.c(eVar.f31169a, eVar2.f31169a, f10), bd.a.c(eVar.b, eVar2.b, f10), bd.a.c(eVar.f31170c, eVar2.f31170c, f10));
            return this.f31166a;
        }
    }

    public static class c extends Property<d, e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<d, e> f31167a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(@NonNull d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* JADX INFO: renamed from: sc.d$d, reason: collision with other inner class name */
    public static class C0548d extends Property<d, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<d, Integer> f31168a = new C0548d("circularRevealScrimColor");

        public C0548d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(@NonNull d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull d dVar, @NonNull Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f31169a;
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f31170c;

        public void a(float f10, float f11, float f12) {
            this.f31169a = f10;
            this.b = f11;
            this.f31170c = f12;
        }

        public e() {
        }

        public e(float f10, float f11, float f12) {
            this.f31169a = f10;
            this.b = f11;
            this.f31170c = f12;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}
