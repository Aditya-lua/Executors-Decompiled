package b4;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f3896a;

    public static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f3897a;
        public final d b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3898c = true;

        public a(TextView textView) {
            this.f3897a = textView;
            this.b = new d(textView);
        }

        @Override // b4.f.b
        @NonNull
        public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            return !this.f3898c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // b4.f.b
        public boolean b() {
            return this.f3898c;
        }

        @Override // b4.f.b
        public void c(boolean z10) {
            if (z10) {
                l();
            }
        }

        @Override // b4.f.b
        public void d(boolean z10) {
            this.f3898c = z10;
            l();
            k();
        }

        @Override // b4.f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f3898c ? m(transformationMethod) : j(transformationMethod);
        }

        @NonNull
        public final InputFilter[] f(@NonNull InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.b;
            return inputFilterArr2;
        }

        public final SparseArray<InputFilter> g(@NonNull InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            return sparseArray;
        }

        @NonNull
        public final InputFilter[] h(@NonNull InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayG = g(inputFilterArr);
            if (sparseArrayG.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayG.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                if (sparseArrayG.indexOfKey(i11) < 0) {
                    inputFilterArr2[i10] = inputFilterArr[i11];
                    i10++;
                }
            }
            return inputFilterArr2;
        }

        public void i(boolean z10) {
            this.f3898c = z10;
        }

        public final TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        public final void k() {
            this.f3897a.setFilters(a(this.f3897a.getFilters()));
        }

        public void l() {
            this.f3897a.setTransformationMethod(e(this.f3897a.getTransformationMethod()));
        }

        @NonNull
        public final TransformationMethod m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof h) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new h(transformationMethod);
        }
    }

    public static class b {
        @NonNull
        public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            throw null;
        }

        public boolean b() {
            throw null;
        }

        public void c(boolean z10) {
            throw null;
        }

        public void d(boolean z10) {
            throw null;
        }

        public TransformationMethod e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    public static class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f3899a;

        public c(TextView textView) {
            this.f3899a = new a(textView);
        }

        @Override // b4.f.b
        @NonNull
        public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f3899a.a(inputFilterArr);
        }

        @Override // b4.f.b
        public boolean b() {
            return this.f3899a.b();
        }

        @Override // b4.f.b
        public void c(boolean z10) {
            if (f()) {
                return;
            }
            this.f3899a.c(z10);
        }

        @Override // b4.f.b
        public void d(boolean z10) {
            if (f()) {
                this.f3899a.i(z10);
            } else {
                this.f3899a.d(z10);
            }
        }

        @Override // b4.f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f3899a.e(transformationMethod);
        }

        public final boolean f() {
            return !androidx.emoji2.text.c.i();
        }
    }

    public f(@NonNull TextView textView, boolean z10) {
        x2.g.h(textView, "textView cannot be null");
        if (z10) {
            this.f3896a = new a(textView);
        } else {
            this.f3896a = new c(textView);
        }
    }

    @NonNull
    public InputFilter[] a(@NonNull InputFilter[] inputFilterArr) {
        return this.f3896a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f3896a.b();
    }

    public void c(boolean z10) {
        this.f3896a.c(z10);
    }

    public void d(boolean z10) {
        this.f3896a.d(z10);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f3896a.e(transformationMethod);
    }
}
