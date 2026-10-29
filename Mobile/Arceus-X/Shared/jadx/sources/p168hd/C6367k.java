package p168hd;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import p194ic.C6747k;

/* JADX INFO: renamed from: hd.k */
/* JADX INFO: loaded from: classes2.dex */
public class C6367k {

    /* JADX INFO: renamed from: m */
    public static final InterfaceC6359c f24173m = new C6365i(0.5f);

    /* JADX INFO: renamed from: a */
    public C6360d f24174a;

    /* JADX INFO: renamed from: b */
    public C6360d f24175b;

    /* JADX INFO: renamed from: c */
    public C6360d f24176c;

    /* JADX INFO: renamed from: d */
    public C6360d f24177d;

    /* JADX INFO: renamed from: e */
    public InterfaceC6359c f24178e;

    /* JADX INFO: renamed from: f */
    public InterfaceC6359c f24179f;

    /* JADX INFO: renamed from: g */
    public InterfaceC6359c f24180g;

    /* JADX INFO: renamed from: h */
    public InterfaceC6359c f24181h;

    /* JADX INFO: renamed from: i */
    public C6362f f24182i;

    /* JADX INFO: renamed from: j */
    public C6362f f24183j;

    /* JADX INFO: renamed from: k */
    public C6362f f24184k;

    /* JADX INFO: renamed from: l */
    public C6362f f24185l;

    /* JADX INFO: renamed from: hd.k$c */
    public interface c {
        @NonNull
        /* JADX INFO: renamed from: a */
        InterfaceC6359c mo27754a(@NonNull InterfaceC6359c interfaceC6359c);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static b m27762a() {
        return new b();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static b m27763b(Context context, int i10, int i11) {
        return m27764c(context, i10, i11, 0);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static b m27764c(Context context, int i10, int i11, int i12) {
        return m27765d(context, i10, i11, new C6357a(i12));
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static b m27765d(Context context, int i10, int i11, @NonNull InterfaceC6359c interfaceC6359c) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C6747k.f26450i5);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(C6747k.f26459j5, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(C6747k.f26486m5, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(C6747k.f26495n5, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(C6747k.f26477l5, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(C6747k.f26468k5, i12);
            InterfaceC6359c interfaceC6359cM27769m = m27769m(typedArrayObtainStyledAttributes, C6747k.f26504o5, interfaceC6359c);
            InterfaceC6359c interfaceC6359cM27769m2 = m27769m(typedArrayObtainStyledAttributes, C6747k.f26531r5, interfaceC6359cM27769m);
            InterfaceC6359c interfaceC6359cM27769m3 = m27769m(typedArrayObtainStyledAttributes, C6747k.f26540s5, interfaceC6359cM27769m);
            InterfaceC6359c interfaceC6359cM27769m4 = m27769m(typedArrayObtainStyledAttributes, C6747k.f26522q5, interfaceC6359cM27769m);
            return new b().m27817y(i13, interfaceC6359cM27769m2).m27802C(i14, interfaceC6359cM27769m3).m27813u(i15, interfaceC6359cM27769m4).m27809q(i16, m27769m(typedArrayObtainStyledAttributes, C6747k.f26513p5, interfaceC6359cM27769m));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static b m27766e(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        return m27767f(context, attributeSet, i10, i11, 0);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static b m27767f(@NonNull Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return m27768g(context, attributeSet, i10, i11, new C6357a(i12));
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    public static b m27768g(@NonNull Context context, AttributeSet attributeSet, int i10, int i11, @NonNull InterfaceC6359c interfaceC6359c) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6747k.f26422f4, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C6747k.f26431g4, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C6747k.f26440h4, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m27765d(context, resourceId, resourceId2, interfaceC6359c);
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public static InterfaceC6359c m27769m(TypedArray typedArray, int i10, @NonNull InterfaceC6359c interfaceC6359c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new C6357a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new C6365i(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC6359c;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public C6362f m27770h() {
        return this.f24184k;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public C6360d m27771i() {
        return this.f24177d;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public InterfaceC6359c m27772j() {
        return this.f24181h;
    }

    @NonNull
    /* JADX INFO: renamed from: k */
    public C6360d m27773k() {
        return this.f24176c;
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public InterfaceC6359c m27774l() {
        return this.f24180g;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public C6362f m27775n() {
        return this.f24185l;
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public C6362f m27776o() {
        return this.f24183j;
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public C6362f m27777p() {
        return this.f24182i;
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public C6360d m27778q() {
        return this.f24174a;
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public InterfaceC6359c m27779r() {
        return this.f24178e;
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public C6360d m27780s() {
        return this.f24175b;
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public InterfaceC6359c m27781t() {
        return this.f24179f;
    }

    /* JADX INFO: renamed from: u */
    public boolean m27782u(@NonNull RectF rectF) {
        boolean z10 = this.f24185l.getClass().equals(C6362f.class) && this.f24183j.getClass().equals(C6362f.class) && this.f24182i.getClass().equals(C6362f.class) && this.f24184k.getClass().equals(C6362f.class);
        float fMo27683a = this.f24178e.mo27683a(rectF);
        return z10 && ((this.f24179f.mo27683a(rectF) > fMo27683a ? 1 : (this.f24179f.mo27683a(rectF) == fMo27683a ? 0 : -1)) == 0 && (this.f24181h.mo27683a(rectF) > fMo27683a ? 1 : (this.f24181h.mo27683a(rectF) == fMo27683a ? 0 : -1)) == 0 && (this.f24180g.mo27683a(rectF) > fMo27683a ? 1 : (this.f24180g.mo27683a(rectF) == fMo27683a ? 0 : -1)) == 0) && ((this.f24175b instanceof C6366j) && (this.f24174a instanceof C6366j) && (this.f24176c instanceof C6366j) && (this.f24177d instanceof C6366j));
    }

    @NonNull
    /* JADX INFO: renamed from: v */
    public b m27783v() {
        return new b(this);
    }

    @NonNull
    /* JADX INFO: renamed from: w */
    public C6367k m27784w(float f10) {
        return m27783v().m27807o(f10).m27806m();
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public C6367k m27785x(@NonNull InterfaceC6359c interfaceC6359c) {
        return m27783v().m27808p(interfaceC6359c).m27806m();
    }

    @NonNull
    /* JADX INFO: renamed from: y */
    public C6367k m27786y(@NonNull c cVar) {
        return m27783v().m27801B(cVar.mo27754a(m27779r())).m27805F(cVar.mo27754a(m27781t())).m27812t(cVar.mo27754a(m27772j())).m27816x(cVar.mo27754a(m27774l())).m27806m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C6367k(@NonNull b bVar) {
        this.f24174a = bVar.f24186a;
        this.f24175b = bVar.f24187b;
        this.f24176c = bVar.f24188c;
        this.f24177d = bVar.f24189d;
        this.f24178e = bVar.f24190e;
        this.f24179f = bVar.f24191f;
        this.f24180g = bVar.f24192g;
        this.f24181h = bVar.f24193h;
        this.f24182i = bVar.f24194i;
        this.f24183j = bVar.f24195j;
        this.f24184k = bVar.f24196k;
        this.f24185l = bVar.f24197l;
    }

    /* JADX INFO: renamed from: hd.k$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        @NonNull
        public C6360d f24186a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public C6360d f24187b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public C6360d f24188c;

        /* JADX INFO: renamed from: d */
        @NonNull
        public C6360d f24189d;

        /* JADX INFO: renamed from: e */
        @NonNull
        public InterfaceC6359c f24190e;

        /* JADX INFO: renamed from: f */
        @NonNull
        public InterfaceC6359c f24191f;

        /* JADX INFO: renamed from: g */
        @NonNull
        public InterfaceC6359c f24192g;

        /* JADX INFO: renamed from: h */
        @NonNull
        public InterfaceC6359c f24193h;

        /* JADX INFO: renamed from: i */
        @NonNull
        public C6362f f24194i;

        /* JADX INFO: renamed from: j */
        @NonNull
        public C6362f f24195j;

        /* JADX INFO: renamed from: k */
        @NonNull
        public C6362f f24196k;

        /* JADX INFO: renamed from: l */
        @NonNull
        public C6362f f24197l;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
            this.f24186a = C6364h.m27756b();
            this.f24187b = C6364h.m27756b();
            this.f24188c = C6364h.m27756b();
            this.f24189d = C6364h.m27756b();
            this.f24190e = new C6357a(0.0f);
            this.f24191f = new C6357a(0.0f);
            this.f24192g = new C6357a(0.0f);
            this.f24193h = new C6357a(0.0f);
            this.f24194i = C6364h.m27757c();
            this.f24195j = C6364h.m27757c();
            this.f24196k = C6364h.m27757c();
            this.f24197l = C6364h.m27757c();
        }

        /* JADX INFO: renamed from: n */
        public static float m27799n(C6360d c6360d) {
            if (c6360d instanceof C6366j) {
                return ((C6366j) c6360d).f24172a;
            }
            if (c6360d instanceof C6361e) {
                return ((C6361e) c6360d).f24120a;
            }
            return -1.0f;
        }

        @NonNull
        /* JADX INFO: renamed from: A */
        public b m27800A(float f10) {
            this.f24190e = new C6357a(f10);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: B */
        public b m27801B(@NonNull InterfaceC6359c interfaceC6359c) {
            this.f24190e = interfaceC6359c;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: C */
        public b m27802C(int i10, @NonNull InterfaceC6359c interfaceC6359c) {
            return m27803D(C6364h.m27755a(i10)).m27805F(interfaceC6359c);
        }

        @NonNull
        /* JADX INFO: renamed from: D */
        public b m27803D(@NonNull C6360d c6360d) {
            this.f24187b = c6360d;
            float fM27799n = m27799n(c6360d);
            if (fM27799n != -1.0f) {
                m27804E(fM27799n);
            }
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: E */
        public b m27804E(float f10) {
            this.f24191f = new C6357a(f10);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: F */
        public b m27805F(@NonNull InterfaceC6359c interfaceC6359c) {
            this.f24191f = interfaceC6359c;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: m */
        public C6367k m27806m() {
            return new C6367k(this);
        }

        @NonNull
        /* JADX INFO: renamed from: o */
        public b m27807o(float f10) {
            return m27800A(f10).m27804E(f10).m27815w(f10).m27811s(f10);
        }

        @NonNull
        /* JADX INFO: renamed from: p */
        public b m27808p(@NonNull InterfaceC6359c interfaceC6359c) {
            return m27801B(interfaceC6359c).m27805F(interfaceC6359c).m27816x(interfaceC6359c).m27812t(interfaceC6359c);
        }

        @NonNull
        /* JADX INFO: renamed from: q */
        public b m27809q(int i10, @NonNull InterfaceC6359c interfaceC6359c) {
            return m27810r(C6364h.m27755a(i10)).m27812t(interfaceC6359c);
        }

        @NonNull
        /* JADX INFO: renamed from: r */
        public b m27810r(@NonNull C6360d c6360d) {
            this.f24189d = c6360d;
            float fM27799n = m27799n(c6360d);
            if (fM27799n != -1.0f) {
                m27811s(fM27799n);
            }
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: s */
        public b m27811s(float f10) {
            this.f24193h = new C6357a(f10);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: t */
        public b m27812t(@NonNull InterfaceC6359c interfaceC6359c) {
            this.f24193h = interfaceC6359c;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: u */
        public b m27813u(int i10, @NonNull InterfaceC6359c interfaceC6359c) {
            return m27814v(C6364h.m27755a(i10)).m27816x(interfaceC6359c);
        }

        @NonNull
        /* JADX INFO: renamed from: v */
        public b m27814v(@NonNull C6360d c6360d) {
            this.f24188c = c6360d;
            float fM27799n = m27799n(c6360d);
            if (fM27799n != -1.0f) {
                m27815w(fM27799n);
            }
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: w */
        public b m27815w(float f10) {
            this.f24192g = new C6357a(f10);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: x */
        public b m27816x(@NonNull InterfaceC6359c interfaceC6359c) {
            this.f24192g = interfaceC6359c;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: y */
        public b m27817y(int i10, @NonNull InterfaceC6359c interfaceC6359c) {
            return m27818z(C6364h.m27755a(i10)).m27801B(interfaceC6359c);
        }

        @NonNull
        /* JADX INFO: renamed from: z */
        public b m27818z(@NonNull C6360d c6360d) {
            this.f24186a = c6360d;
            float fM27799n = m27799n(c6360d);
            if (fM27799n != -1.0f) {
                m27800A(fM27799n);
            }
            return this;
        }

        public b(@NonNull C6367k c6367k) {
            this.f24186a = C6364h.m27756b();
            this.f24187b = C6364h.m27756b();
            this.f24188c = C6364h.m27756b();
            this.f24189d = C6364h.m27756b();
            this.f24190e = new C6357a(0.0f);
            this.f24191f = new C6357a(0.0f);
            this.f24192g = new C6357a(0.0f);
            this.f24193h = new C6357a(0.0f);
            this.f24194i = C6364h.m27757c();
            this.f24195j = C6364h.m27757c();
            this.f24196k = C6364h.m27757c();
            this.f24197l = C6364h.m27757c();
            this.f24186a = c6367k.f24174a;
            this.f24187b = c6367k.f24175b;
            this.f24188c = c6367k.f24176c;
            this.f24189d = c6367k.f24177d;
            this.f24190e = c6367k.f24178e;
            this.f24191f = c6367k.f24179f;
            this.f24192g = c6367k.f24180g;
            this.f24193h = c6367k.f24181h;
            this.f24194i = c6367k.f24182i;
            this.f24195j = c6367k.f24183j;
            this.f24196k = c6367k.f24184k;
            this.f24197l = c6367k.f24185l;
        }
    }

    public C6367k() {
        this.f24174a = C6364h.m27756b();
        this.f24175b = C6364h.m27756b();
        this.f24176c = C6364h.m27756b();
        this.f24177d = C6364h.m27756b();
        this.f24178e = new C6357a(0.0f);
        this.f24179f = new C6357a(0.0f);
        this.f24180g = new C6357a(0.0f);
        this.f24181h = new C6357a(0.0f);
        this.f24182i = C6364h.m27757c();
        this.f24183j = C6364h.m27757c();
        this.f24184k = C6364h.m27757c();
        this.f24185l = C6364h.m27757c();
    }
}
