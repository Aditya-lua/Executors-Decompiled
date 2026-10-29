package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zza {
    public static Rect zza(List list) {
        Iterator it = list.iterator();
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    public static List zzb(com.google.android.gms.internal.mlkit_vision_text_common.zzf zzfVar) {
        double dSin = Math.sin(Math.toRadians(zzfVar.zze));
        double dCos = Math.cos(Math.toRadians(zzfVar.zze));
        double d10 = zzfVar.zza;
        double d11 = zzfVar.zzc;
        Point point = new Point((int) (d10 + (d11 * dCos)), (int) (((double) zzfVar.zzb) + (d11 * dSin)));
        double d12 = point.x;
        int i10 = zzfVar.zzd;
        double d13 = ((double) i10) * dSin;
        double d14 = ((double) pointArr[1].y) + (((double) i10) * dCos);
        Point point2 = pointArr[0];
        int i11 = point2.x;
        Point point3 = pointArr[2];
        int i12 = point3.x;
        Point point4 = pointArr[1];
        Point[] pointArr = {new Point(zzfVar.zza, zzfVar.zzb), point, new Point((int) (d12 - d13), (int) d14), new Point(i11 + (i12 - point4.x), point2.y + (point3.y - point4.y))};
        return Arrays.asList(pointArr);
    }
}
