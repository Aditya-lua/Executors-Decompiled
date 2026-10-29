package com.google.mlkit.vision.text.internal;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcp;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzy;
import com.google.mlkit.vision.text.Text;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class zzk {
    public static final /* synthetic */ int zzb = 0;
    static final zzv zza = zzv.zza("\n");
    private static final Comparator zzc = new Comparator() { // from class: com.google.mlkit.vision.text.internal.zzf
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i10 = zzk.zzb;
            return ((Integer) ((Map.Entry) obj).getValue()).compareTo((Integer) ((Map.Entry) obj2).getValue());
        }
    };

    /* JADX DEBUG: Multi-variable search result rejected for r10v4, resolved type: E */
    /* JADX WARN: Multi-variable type inference failed */
    public static Text zza(com.google.android.gms.internal.mlkit_vision_text_common.zzl[] zzlVarArr, final Matrix matrix) {
        SparseArray sparseArray = new SparseArray();
        int i10 = 0;
        for (com.google.android.gms.internal.mlkit_vision_text_common.zzl zzlVar : zzlVarArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(zzlVar.zzj);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(zzlVar.zzj, sparseArray2);
            }
            sparseArray2.append(zzlVar.zzk, zzlVar);
        }
        zzbh zzbhVar = new zzbh();
        int i11 = 0;
        while (i11 < sparseArray.size()) {
            SparseArray sparseArray3 = (SparseArray) sparseArray.valueAt(i11);
            zzbh zzbhVar2 = new zzbh();
            for (int i12 = i10; i12 < sparseArray3.size(); i12++) {
                zzbhVar2.zza((com.google.android.gms.internal.mlkit_vision_text_common.zzl) sparseArray3.valueAt(i12));
            }
            zzbk zzbkVarZzb = zzbhVar2.zzb();
            List listZza = zzbu.zza(zzbkVarZzb, new zzu() { // from class: com.google.mlkit.vision.text.internal.zzh
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    com.google.android.gms.internal.mlkit_vision_text_common.zzl zzlVar2 = (com.google.android.gms.internal.mlkit_vision_text_common.zzl) obj;
                    int i13 = zzk.zzb;
                    List listZzb = zza.zzb(zzlVar2.zzb);
                    String str = zzy.zzb(zzlVar2.zze) ? "" : zzlVar2.zze;
                    Rect rectZza = zza.zza(listZzb);
                    String str2 = zzy.zzb(zzlVar2.zzg) ? "und" : zzlVar2.zzg;
                    final Matrix matrix2 = matrix;
                    return new Text.Line(str, rectZza, listZzb, str2, matrix2, zzbu.zza(Arrays.asList(zzlVar2.zza), new zzu() { // from class: com.google.mlkit.vision.text.internal.zzj
                        @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                        public final Object zza(Object obj2) {
                            com.google.android.gms.internal.mlkit_vision_text_common.zzr zzrVar = (com.google.android.gms.internal.mlkit_vision_text_common.zzr) obj2;
                            int i14 = zzk.zzb;
                            List listZzb2 = zza.zzb(zzrVar.zzb);
                            return new Text.Element(zzy.zzb(zzrVar.zzd) ? "" : zzrVar.zzd, zza.zza(listZzb2), listZzb2, zzy.zzb(zzrVar.zzf) ? "und" : zzrVar.zzf, matrix2, zzrVar.zze, zzrVar.zzb.zze, zzbk.zzh());
                        }
                    }), zzlVar2.zzf, zzlVar2.zzb.zze);
                }
            });
            com.google.android.gms.internal.mlkit_vision_text_common.zzf zzfVar = ((com.google.android.gms.internal.mlkit_vision_text_common.zzl) zzbkVarZzb.get(i10)).zzb;
            zzcp zzcpVarListIterator = zzbkVarZzb.listIterator(i10);
            int iMax = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            int iMin = Integer.MAX_VALUE;
            int iMin2 = Integer.MAX_VALUE;
            int iMax2 = Integer.MIN_VALUE;
            while (zzcpVarListIterator.hasNext()) {
                com.google.android.gms.internal.mlkit_vision_text_common.zzf zzfVar2 = ((com.google.android.gms.internal.mlkit_vision_text_common.zzl) zzcpVarListIterator.next()).zzb;
                int i13 = -zzfVar.zza;
                int i14 = -zzfVar.zzb;
                int i15 = i10;
                double dSin = Math.sin(Math.toRadians(zzfVar.zze));
                SparseArray sparseArray4 = sparseArray;
                int i16 = i11;
                double dCos = Math.cos(Math.toRadians(zzfVar.zze));
                Point[] pointArr = new Point[4];
                Point point = new Point(zzfVar2.zza, zzfVar2.zzb);
                pointArr[i15] = point;
                point.offset(i13, i14);
                Point point2 = pointArr[i15];
                int i17 = point2.x;
                zzcp zzcpVar = zzcpVarListIterator;
                int i18 = point2.y;
                int i19 = (int) ((((double) i17) * dCos) + (((double) i18) * dSin));
                point2.x = i19;
                int i20 = (int) ((((double) (-i17)) * dSin) + (((double) i18) * dCos));
                point2.y = i20;
                pointArr[1] = new Point(zzfVar2.zzc + i19, i20);
                pointArr[2] = new Point(zzfVar2.zzc + i19, zzfVar2.zzd + i20);
                pointArr[3] = new Point(i19, i20 + zzfVar2.zzd);
                for (int i21 = i15; i21 < 4; i21++) {
                    Point point3 = pointArr[i21];
                    iMin = Math.min(iMin, point3.x);
                    iMax = Math.max(iMax, point3.x);
                    iMin2 = Math.min(iMin2, point3.y);
                    iMax2 = Math.max(iMax2, point3.y);
                }
                zzcpVarListIterator = zzcpVar;
                i10 = i15;
                sparseArray = sparseArray4;
                i11 = i16;
            }
            SparseArray sparseArray5 = sparseArray;
            int i22 = i11;
            int i23 = i10;
            int i24 = zzfVar.zza;
            int i25 = zzfVar.zzb;
            double dSin2 = Math.sin(Math.toRadians(zzfVar.zze));
            double dCos2 = Math.cos(Math.toRadians(zzfVar.zze));
            Point[] pointArr2 = {new Point(iMin, iMin2), new Point(iMax, iMin2), new Point(iMax, iMax2), new Point(iMin, iMax2)};
            int i26 = i23;
            while (i26 < 4) {
                Point point4 = pointArr2[i26];
                int i27 = point4.x;
                double d10 = dSin2;
                int i28 = point4.y;
                point4.x = (int) ((((double) i27) * dCos2) - (((double) i28) * d10));
                point4.y = (int) ((((double) i27) * d10) + (((double) i28) * dCos2));
                point4.offset(i24, i25);
                i26++;
                dSin2 = d10;
            }
            List listAsList = Arrays.asList(pointArr2);
            zzbhVar.zza(new Text.TextBlock(zza.zzb(zzbu.zza(listZza, new zzu() { // from class: com.google.mlkit.vision.text.internal.zzi
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return ((Text.Line) obj).getText();
                }
            })), zza.zza(listAsList), listAsList, zzb(listZza), matrix, listZza));
            i11 = i22 + 1;
            i10 = i23;
            sparseArray = sparseArray5;
        }
        zzbk zzbkVarZzb2 = zzbhVar.zzb();
        return new Text(zza.zzb(zzbu.zza(zzbkVarZzb2, new zzu() { // from class: com.google.mlkit.vision.text.internal.zzg
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
            public final Object zza(Object obj) {
                return ((Text.TextBlock) obj).getText();
            }
        })), zzbkVarZzb2);
    }

    private static String zzb(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String recognizedLanguage = ((Text.Line) it.next()).getRecognizedLanguage();
            map.put(recognizedLanguage, Integer.valueOf((map.containsKey(recognizedLanguage) ? ((Integer) map.get(recognizedLanguage)).intValue() : 0) + 1));
        }
        Set setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return "und";
        }
        String str = (String) ((Map.Entry) Collections.max(setEntrySet, zzc)).getKey();
        return !zzy.zzb(str) ? str : "und";
    }
}
