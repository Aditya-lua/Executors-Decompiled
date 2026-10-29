package o5;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Matrix f27119a = new a();

    public class a extends Matrix {
        public void a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix matrix) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f10, float f11, float f12) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f10, float f11, float f12, float f13) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f10, float f11, float f12, float f13) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float f10, float f11) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix matrix) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f10, float f11, float f12) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f10, float f11, float f12, float f13) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f10, float f11, float f12, float f13) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float f10, float f11) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            a();
        }

        @Override // android.graphics.Matrix
        public void set(Matrix matrix) {
            a();
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] fArr, int i10, float[] fArr2, int i11, int i12) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f10, float f11, float f12) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f10, float f11, float f12, float f13) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f10, float f11, float f12, float f13) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f10, float f11, float f12, float f13) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float f10, float f11) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] fArr) {
            a();
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f10) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f10, float f11) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f10, float f11) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f10) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f10, float f11) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f10, float f11) {
            a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f10) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f10, float f11) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f10, float f11) {
            a();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f10, float f11) {
            a();
        }
    }
}
