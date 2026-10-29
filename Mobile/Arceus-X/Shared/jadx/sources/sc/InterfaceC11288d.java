package sc;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import bd.C1304a;

/* JADX INFO: renamed from: sc.d */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC11288d {

    /* JADX INFO: renamed from: sc.d$b */
    public static class b implements TypeEvaluator<e> {

        /* JADX INFO: renamed from: b */
        public static final TypeEvaluator<e> f39621b = new b();

        /* JADX INFO: renamed from: a */
        public final e f39622a = new e();

        /* JADX DEBUG: Method merged with bridge method: evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.animation.TypeEvaluator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f10, @NonNull e eVar, @NonNull e eVar2) {
            this.f39622a.m42371a(C1304a.m7098c(eVar.f39625a, eVar2.f39625a, f10), C1304a.m7098c(eVar.f39626b, eVar2.f39626b, f10), C1304a.m7098c(eVar.f39627c, eVar2.f39627c, f10));
            return this.f39622a;
        }
    }

    /* JADX INFO: renamed from: sc.d$c */
    public static class c extends Property<InterfaceC11288d, e> {

        /* JADX INFO: renamed from: a */
        public static final Property<InterfaceC11288d, e> f39623a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(@NonNull InterfaceC11288d interfaceC11288d) {
            return interfaceC11288d.getRevealInfo();
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull InterfaceC11288d interfaceC11288d, e eVar) {
            interfaceC11288d.setRevealInfo(eVar);
        }
    }

    /* JADX INFO: renamed from: sc.d$d */
    public static class d extends Property<InterfaceC11288d, Integer> {

        /* JADX INFO: renamed from: a */
        public static final Property<InterfaceC11288d, Integer> f39624a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(@NonNull InterfaceC11288d interfaceC11288d) {
            return Integer.valueOf(interfaceC11288d.getCircularRevealScrimColor());
        }

        /* JADX DEBUG: Method merged with bridge method: set(Ljava/lang/Object;Ljava/lang/Object;)V */
        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull InterfaceC11288d interfaceC11288d, @NonNull Integer num) {
            interfaceC11288d.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* JADX INFO: renamed from: sc.d$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public float f39625a;

        /* JADX INFO: renamed from: b */
        public float f39626b;

        /* JADX INFO: renamed from: c */
        public float f39627c;

        /* JADX INFO: renamed from: a */
        public void m42371a(float f10, float f11, float f12) {
            this.f39625a = f10;
            this.f39626b = f11;
            this.f39627c = f12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public e() {
        }

        public e(float f10, float f11, float f12) {
            this.f39625a = f10;
            this.f39626b = f11;
            this.f39627c = f12;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo42364a();

    /* JADX INFO: renamed from: b */
    void mo42365b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i10);

    void setRevealInfo(e eVar);
}
