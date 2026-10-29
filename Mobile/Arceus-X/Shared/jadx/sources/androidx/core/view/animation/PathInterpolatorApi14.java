package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes4.dex */
class PathInterpolatorApi14 implements Interpolator {
    private static final float PRECISION = 0.002f;

    /* JADX INFO: renamed from: mX */
    private final float[] f2353mX;

    /* JADX INFO: renamed from: mY */
    private final float[] f2354mY;

    PathInterpolatorApi14(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float pathLength = pathMeasure.getLength();
        int numPoints = ((int) (pathLength / PRECISION)) + 1;
        this.f2353mX = new float[numPoints];
        this.f2354mY = new float[numPoints];
        float[] position = new float[2];
        for (int i10 = 0; i10 < numPoints; i10++) {
            float distance = (i10 * pathLength) / (numPoints - 1);
            pathMeasure.getPosTan(distance, position, null);
            this.f2353mX[i10] = position[0];
            this.f2354mY[i10] = position[1];
        }
    }

    PathInterpolatorApi14(float controlX, float controlY) {
        this(createQuad(controlX, controlY));
    }

    PathInterpolatorApi14(float controlX1, float controlY1, float controlX2, float controlY2) {
        this(createCubic(controlX1, controlY1, controlX2, controlY2));
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float t8) {
        if (t8 <= 0.0f) {
            return 0.0f;
        }
        if (t8 >= 1.0f) {
            return 1.0f;
        }
        int startIndex = 0;
        int endIndex = this.f2353mX.length - 1;
        while (endIndex - startIndex > 1) {
            int midIndex = (startIndex + endIndex) / 2;
            if (t8 < this.f2353mX[midIndex]) {
                endIndex = midIndex;
            } else {
                startIndex = midIndex;
            }
        }
        float[] fArr = this.f2353mX;
        float xRange = fArr[endIndex] - fArr[startIndex];
        if (xRange == 0.0f) {
            return this.f2354mY[startIndex];
        }
        float tInRange = t8 - fArr[startIndex];
        float fraction = tInRange / xRange;
        float[] fArr2 = this.f2354mY;
        float startY = fArr2[startIndex];
        float endY = fArr2[endIndex];
        return ((endY - startY) * fraction) + startY;
    }

    private static Path createQuad(float controlX, float controlY) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(controlX, controlY, 1.0f, 1.0f);
        return path;
    }

    private static Path createCubic(float controlX1, float controlY1, float controlX2, float controlY2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(controlX1, controlY1, controlX2, controlY2, 1.0f, 1.0f);
        return path;
    }
}
