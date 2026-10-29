package p024b4;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.emoji2.text.C0900c;
import p533x2.C12637g;

/* JADX INFO: renamed from: b4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1220f {

    /* JADX INFO: renamed from: a */
    public final b f5097a;

    /* JADX INFO: renamed from: b4.f$a */
    public static class a extends b {

        /* JADX INFO: renamed from: a */
        public final TextView f5098a;

        /* JADX INFO: renamed from: b */
        public final C1218d f5099b;

        /* JADX INFO: renamed from: c */
        public boolean f5100c = true;

        public a(TextView textView) {
            this.f5098a = textView;
            this.f5099b = new C1218d(textView);
        }

        @Override // p024b4.C1220f.b
        @NonNull
        /* JADX INFO: renamed from: a */
        public InputFilter[] mo6849a(@NonNull InputFilter[] inputFilterArr) {
            return !this.f5100c ? m6856h(inputFilterArr) : m6854f(inputFilterArr);
        }

        @Override // p024b4.C1220f.b
        /* JADX INFO: renamed from: b */
        public boolean mo6850b() {
            return this.f5100c;
        }

        @Override // p024b4.C1220f.b
        /* JADX INFO: renamed from: c */
        public void mo6851c(boolean z10) {
            if (z10) {
                m6860l();
            }
        }

        @Override // p024b4.C1220f.b
        /* JADX INFO: renamed from: d */
        public void mo6852d(boolean z10) {
            this.f5100c = z10;
            m6860l();
            m6859k();
        }

        @Override // p024b4.C1220f.b
        /* JADX INFO: renamed from: e */
        public TransformationMethod mo6853e(TransformationMethod transformationMethod) {
            return this.f5100c ? m6861m(transformationMethod) : m6858j(transformationMethod);
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        public final InputFilter[] m6854f(@NonNull InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f5099b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f5099b;
            return inputFilterArr2;
        }

        /* JADX INFO: renamed from: g */
        public final SparseArray<InputFilter> m6855g(@NonNull InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof C1218d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        @NonNull
        /* JADX INFO: renamed from: h */
        public final InputFilter[] m6856h(@NonNull InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayM6855g = m6855g(inputFilterArr);
            if (sparseArrayM6855g.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayM6855g.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayM6855g.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        /* JADX INFO: renamed from: i */
        public void m6857i(boolean z10) {
            this.f5100c = z10;
        }

        /* JADX INFO: renamed from: j */
        public final TransformationMethod m6858j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof C1222h ? ((C1222h) transformationMethod).m6867a() : transformationMethod;
        }

        /* JADX INFO: renamed from: k */
        public final void m6859k() {
            this.f5098a.setFilters(mo6849a(this.f5098a.getFilters()));
        }

        /* JADX INFO: renamed from: l */
        public void m6860l() {
            this.f5098a.setTransformationMethod(mo6853e(this.f5098a.getTransformationMethod()));
        }

        @NonNull
        /* JADX INFO: renamed from: m */
        public final TransformationMethod m6861m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof C1222h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C1222h(transformationMethod);
        }
    }

    /* JADX INFO: renamed from: b4.f$b */
    public static class b {
        @NonNull
        /* JADX INFO: renamed from: a */
        public InputFilter[] mo6849a(@NonNull InputFilter[] inputFilterArr) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo6850b() {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void mo6851c(boolean z10) {
            throw null;
        }

        /* JADX INFO: renamed from: d */
        public void mo6852d(boolean z10) {
            throw null;
        }

        /* JADX INFO: renamed from: e */
        public TransformationMethod mo6853e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: b4.f$c */
    public static class c extends b {

        /* JADX INFO: renamed from: a */
        public final a f5101a;

        public c(TextView textView) {
            this.f5101a = new a(textView);
        }

        @Override // p024b4.C1220f.b
        @NonNull
        /* JADX INFO: renamed from: a */
        public InputFilter[] mo6849a(@NonNull InputFilter[] inputFilterArr) {
            return m6862f() ? inputFilterArr : this.f5101a.mo6849a(inputFilterArr);
        }

        @Override // p024b4.C1220f.b
        /* JADX INFO: renamed from: b */
        public boolean mo6850b() {
            return this.f5101a.mo6850b();
        }

        @Override // p024b4.C1220f.b
        /* JADX INFO: renamed from: c */
        public void mo6851c(boolean z10) {
            if (m6862f()) {
                return;
            }
            this.f5101a.mo6851c(z10);
        }

        @Override // p024b4.C1220f.b
        /* JADX INFO: renamed from: d */
        public void mo6852d(boolean z10) {
            if (m6862f()) {
                this.f5101a.m6857i(z10);
            } else {
                this.f5101a.mo6852d(z10);
            }
        }

        @Override // p024b4.C1220f.b
        /* JADX INFO: renamed from: e */
        public TransformationMethod mo6853e(TransformationMethod transformationMethod) {
            return m6862f() ? transformationMethod : this.f5101a.mo6853e(transformationMethod);
        }

        /* JADX INFO: renamed from: f */
        public final boolean m6862f() {
            return !C0900c.m4274i();
        }
    }

    public C1220f(@NonNull TextView textView, boolean z10) {
        C12637g.m47076h(textView, "textView cannot be null");
        if (z10) {
            this.f5097a = new a(textView);
        } else {
            this.f5097a = new c(textView);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public InputFilter[] m6844a(@NonNull InputFilter[] inputFilterArr) {
        return this.f5097a.mo6849a(inputFilterArr);
    }

    /* JADX INFO: renamed from: b */
    public boolean m6845b() {
        return this.f5097a.mo6850b();
    }

    /* JADX INFO: renamed from: c */
    public void m6846c(boolean z10) {
        this.f5097a.mo6851c(z10);
    }

    /* JADX INFO: renamed from: d */
    public void m6847d(boolean z10) {
        this.f5097a.mo6852d(z10);
    }

    /* JADX INFO: renamed from: e */
    public TransformationMethod m6848e(TransformationMethod transformationMethod) {
        return this.f5097a.mo6853e(transformationMethod);
    }
}
