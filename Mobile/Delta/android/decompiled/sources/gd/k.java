package gd;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final gd.c f18076m = new i(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f18077a;
    public d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f18078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f18079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public gd.c f18080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public gd.c f18081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public gd.c f18082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public gd.c f18083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f18084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f18085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f18086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f18087l;

    public interface c {
        @NonNull
        gd.c a(@NonNull gd.c cVar);
    }

    @NonNull
    public static b a() {
        return new b();
    }

    @NonNull
    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    @NonNull
    public static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new gd.a(i12));
    }

    @NonNull
    public static b d(Context context, int i10, int i11, @NonNull gd.c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(hc.k.f19036i5);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(hc.k.f19045j5, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(hc.k.f19072m5, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(hc.k.f19081n5, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(hc.k.f19063l5, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(hc.k.f19054k5, i12);
            gd.c cVarM = m(typedArrayObtainStyledAttributes, hc.k.f19090o5, cVar);
            gd.c cVarM2 = m(typedArrayObtainStyledAttributes, hc.k.f19117r5, cVarM);
            gd.c cVarM3 = m(typedArrayObtainStyledAttributes, hc.k.f19126s5, cVarM);
            gd.c cVarM4 = m(typedArrayObtainStyledAttributes, hc.k.f19108q5, cVarM);
            return new b().y(i13, cVarM2).C(i14, cVarM3).u(i15, cVarM4).q(i16, m(typedArrayObtainStyledAttributes, hc.k.f19099p5, cVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static b e(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    @NonNull
    public static b f(@NonNull Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new gd.a(i12));
    }

    @NonNull
    public static b g(@NonNull Context context, AttributeSet attributeSet, int i10, int i11, @NonNull gd.c cVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hc.k.f19008f4, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(hc.k.f19017g4, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(hc.k.f19026h4, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    @NonNull
    public static gd.c m(TypedArray typedArray, int i10, @NonNull gd.c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new gd.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new i(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    @NonNull
    public f h() {
        return this.f18086k;
    }

    @NonNull
    public d i() {
        return this.f18079d;
    }

    @NonNull
    public gd.c j() {
        return this.f18083h;
    }

    @NonNull
    public d k() {
        return this.f18078c;
    }

    @NonNull
    public gd.c l() {
        return this.f18082g;
    }

    @NonNull
    public f n() {
        return this.f18087l;
    }

    @NonNull
    public f o() {
        return this.f18085j;
    }

    @NonNull
    public f p() {
        return this.f18084i;
    }

    @NonNull
    public d q() {
        return this.f18077a;
    }

    @NonNull
    public gd.c r() {
        return this.f18080e;
    }

    @NonNull
    public d s() {
        return this.b;
    }

    @NonNull
    public gd.c t() {
        return this.f18081f;
    }

    public boolean u(@NonNull RectF rectF) {
        boolean z10 = this.f18087l.getClass().equals(f.class) && this.f18085j.getClass().equals(f.class) && this.f18084i.getClass().equals(f.class) && this.f18086k.getClass().equals(f.class);
        float fA = this.f18080e.a(rectF);
        return z10 && ((this.f18081f.a(rectF) > fA ? 1 : (this.f18081f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f18083h.a(rectF) > fA ? 1 : (this.f18083h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f18082g.a(rectF) > fA ? 1 : (this.f18082g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.b instanceof j) && (this.f18077a instanceof j) && (this.f18078c instanceof j) && (this.f18079d instanceof j));
    }

    @NonNull
    public b v() {
        return new b(this);
    }

    @NonNull
    public k w(float f10) {
        return v().o(f10).m();
    }

    @NonNull
    public k x(@NonNull gd.c cVar) {
        return v().p(cVar).m();
    }

    @NonNull
    public k y(@NonNull c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    public k(@NonNull b bVar) {
        this.f18077a = bVar.f18088a;
        this.b = bVar.b;
        this.f18078c = bVar.f18089c;
        this.f18079d = bVar.f18090d;
        this.f18080e = bVar.f18091e;
        this.f18081f = bVar.f18092f;
        this.f18082g = bVar.f18093g;
        this.f18083h = bVar.f18094h;
        this.f18084i = bVar.f18095i;
        this.f18085j = bVar.f18096j;
        this.f18086k = bVar.f18097k;
        this.f18087l = bVar.f18098l;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public d f18088a;

        @NonNull
        public d b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public d f18089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public d f18090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public gd.c f18091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public gd.c f18092f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        public gd.c f18093g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NonNull
        public gd.c f18094h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        public f f18095i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public f f18096j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NonNull
        public f f18097k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NonNull
        public f f18098l;

        public b() {
            this.f18088a = h.b();
            this.b = h.b();
            this.f18089c = h.b();
            this.f18090d = h.b();
            this.f18091e = new gd.a(0.0f);
            this.f18092f = new gd.a(0.0f);
            this.f18093g = new gd.a(0.0f);
            this.f18094h = new gd.a(0.0f);
            this.f18095i = h.c();
            this.f18096j = h.c();
            this.f18097k = h.c();
            this.f18098l = h.c();
        }

        public static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f18075a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f18026a;
            }
            return -1.0f;
        }

        @NonNull
        public b A(float f10) {
            this.f18091e = new gd.a(f10);
            return this;
        }

        @NonNull
        public b B(@NonNull gd.c cVar) {
            this.f18091e = cVar;
            return this;
        }

        @NonNull
        public b C(int i10, @NonNull gd.c cVar) {
            return D(h.a(i10)).F(cVar);
        }

        @NonNull
        public b D(@NonNull d dVar) {
            this.b = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        @NonNull
        public b E(float f10) {
            this.f18092f = new gd.a(f10);
            return this;
        }

        @NonNull
        public b F(@NonNull gd.c cVar) {
            this.f18092f = cVar;
            return this;
        }

        @NonNull
        public k m() {
            return new k(this);
        }

        @NonNull
        public b o(float f10) {
            return A(f10).E(f10).w(f10).s(f10);
        }

        @NonNull
        public b p(@NonNull gd.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        @NonNull
        public b q(int i10, @NonNull gd.c cVar) {
            return r(h.a(i10)).t(cVar);
        }

        @NonNull
        public b r(@NonNull d dVar) {
            this.f18090d = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        @NonNull
        public b s(float f10) {
            this.f18094h = new gd.a(f10);
            return this;
        }

        @NonNull
        public b t(@NonNull gd.c cVar) {
            this.f18094h = cVar;
            return this;
        }

        @NonNull
        public b u(int i10, @NonNull gd.c cVar) {
            return v(h.a(i10)).x(cVar);
        }

        @NonNull
        public b v(@NonNull d dVar) {
            this.f18089c = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        @NonNull
        public b w(float f10) {
            this.f18093g = new gd.a(f10);
            return this;
        }

        @NonNull
        public b x(@NonNull gd.c cVar) {
            this.f18093g = cVar;
            return this;
        }

        @NonNull
        public b y(int i10, @NonNull gd.c cVar) {
            return z(h.a(i10)).B(cVar);
        }

        @NonNull
        public b z(@NonNull d dVar) {
            this.f18088a = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }

        public b(@NonNull k kVar) {
            this.f18088a = h.b();
            this.b = h.b();
            this.f18089c = h.b();
            this.f18090d = h.b();
            this.f18091e = new gd.a(0.0f);
            this.f18092f = new gd.a(0.0f);
            this.f18093g = new gd.a(0.0f);
            this.f18094h = new gd.a(0.0f);
            this.f18095i = h.c();
            this.f18096j = h.c();
            this.f18097k = h.c();
            this.f18098l = h.c();
            this.f18088a = kVar.f18077a;
            this.b = kVar.b;
            this.f18089c = kVar.f18078c;
            this.f18090d = kVar.f18079d;
            this.f18091e = kVar.f18080e;
            this.f18092f = kVar.f18081f;
            this.f18093g = kVar.f18082g;
            this.f18094h = kVar.f18083h;
            this.f18095i = kVar.f18084i;
            this.f18096j = kVar.f18085j;
            this.f18097k = kVar.f18086k;
            this.f18098l = kVar.f18087l;
        }
    }

    public k() {
        this.f18077a = h.b();
        this.b = h.b();
        this.f18078c = h.b();
        this.f18079d = h.b();
        this.f18080e = new gd.a(0.0f);
        this.f18081f = new gd.a(0.0f);
        this.f18082g = new gd.a(0.0f);
        this.f18083h = new gd.a(0.0f);
        this.f18084i = h.c();
        this.f18085j = h.c();
        this.f18086k = h.c();
        this.f18087l = h.c();
    }
}
