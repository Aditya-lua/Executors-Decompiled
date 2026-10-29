package com.google.mlkit.vision.common.internal;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import com.google.mlkit.vision.common.InputImage;
import java.util.List;
import p328od.C9724a;

/* JADX INFO: loaded from: classes2.dex */
public class CommonConvertUtils {
    public static InputImage convertMlImagetoInputImage(@NonNull C9724a c9724a) {
        throw null;
    }

    public static int convertToAndroidImageFormat(@InputImage.ImageFormat int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 35;
            if (i10 != 35) {
                i11 = InputImage.IMAGE_FORMAT_YV12;
                if (i10 != 842094169) {
                    return 0;
                }
            }
        }
        return i11;
    }

    public static int convertToMVRotation(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 90) {
            return 1;
        }
        if (i10 == 180) {
            return 2;
        }
        if (i10 == 270) {
            return 3;
        }
        throw new IllegalArgumentException("Invalid rotation: " + i10);
    }

    public static void transformPointArray(@NonNull Point[] pointArr, @NonNull Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i10 = 0; i10 < pointArr.length; i10++) {
            Point point = pointArr[i10];
            int i11 = i10 + i10;
            fArr[i11] = point.x;
            fArr[i11 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i12 = 0; i12 < pointArr.length; i12++) {
            int i13 = i12 + i12;
            pointArr[i12].set((int) fArr[i13], (int) fArr[i13 + 1]);
        }
    }

    public static void transformPointF(@NonNull PointF pointF, @NonNull Matrix matrix) {
        float[] fArr = {pointF.x, pointF.y};
        matrix.mapPoints(fArr);
        pointF.set(fArr[0], fArr[1]);
    }

    public static void transformPointList(@NonNull List<PointF> list, @NonNull Matrix matrix) {
        int size = list.size();
        float[] fArr = new float[size + size];
        for (int i10 = 0; i10 < list.size(); i10++) {
            int i11 = i10 + i10;
            fArr[i11] = list.get(i10).x;
            fArr[i11 + 1] = list.get(i10).y;
        }
        matrix.mapPoints(fArr);
        for (int i12 = 0; i12 < list.size(); i12++) {
            int i13 = i12 + i12;
            list.get(i12).set(fArr[i13], fArr[i13 + 1]);
        }
    }

    public static void transformRect(@NonNull Rect rect, @NonNull Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    private static void zza(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        zzmu.zzb(zzms.zzb("vision-common"), i10, i11, j10, i12, i13, i14, i15);
    }
}
