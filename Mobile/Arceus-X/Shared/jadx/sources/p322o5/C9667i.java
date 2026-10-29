package p322o5;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: renamed from: o5.i */
/* JADX INFO: loaded from: classes.dex */
public class C9667i {

    /* JADX INFO: renamed from: a */
    public static final Matrix f35085a = new a();

    /* JADX INFO: renamed from: o5.i$a */
    public class a extends Matrix {
        /* JADX INFO: renamed from: a */
        public void m38188a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix matrix) {
            m38188a();
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.Matrix
        public boolean postRotate(float f10, float f11, float f12) {
            m38188a();
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.Matrix
        public boolean postScale(float f10, float f11, float f12, float f13) {
            m38188a();
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.Matrix
        public boolean postSkew(float f10, float f11, float f12, float f13) {
            m38188a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float f10, float f11) {
            m38188a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix matrix) {
            m38188a();
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.Matrix
        public boolean preRotate(float f10, float f11, float f12) {
            m38188a();
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.Matrix
        public boolean preScale(float f10, float f11, float f12, float f13) {
            m38188a();
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.Matrix
        public boolean preSkew(float f10, float f11, float f12, float f13) {
            m38188a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float f10, float f11) {
            m38188a();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            m38188a();
        }

        @Override // android.graphics.Matrix
        public void set(Matrix matrix) {
            m38188a();
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            m38188a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] fArr, int i10, float[] fArr2, int i11, int i12) {
            m38188a();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            m38188a();
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.Matrix
        public void setRotate(float f10, float f11, float f12) {
            m38188a();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.Matrix
        public void setScale(float f10, float f11, float f12, float f13) {
            m38188a();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.Matrix
        public void setSinCos(float f10, float f11, float f12, float f13) {
            m38188a();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.graphics.Matrix
        public void setSkew(float f10, float f11, float f12, float f13) {
            m38188a();
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float f10, float f11) {
            m38188a();
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] fArr) {
            m38188a();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.Matrix
        public boolean postRotate(float f10) {
            m38188a();
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.Matrix
        public boolean postScale(float f10, float f11) {
            m38188a();
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.Matrix
        public boolean postSkew(float f10, float f11) {
            m38188a();
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.Matrix
        public boolean preRotate(float f10) {
            m38188a();
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.Matrix
        public boolean preScale(float f10, float f11) {
            m38188a();
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.Matrix
        public boolean preSkew(float f10, float f11) {
            m38188a();
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.Matrix
        public void setRotate(float f10) {
            m38188a();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.Matrix
        public void setScale(float f10, float f11) {
            m38188a();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.Matrix
        public void setSinCos(float f10, float f11) {
            m38188a();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // android.graphics.Matrix
        public void setSkew(float f10, float f11) {
            m38188a();
        }
    }
}
