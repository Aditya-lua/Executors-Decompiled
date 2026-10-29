package com.google.mlkit.vision.text;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvj;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Text {
    private final List zza;
    private final String zzb;

    public static class Symbol extends TextBase {
        private final float zza;
        private final float zzb;

        public Symbol(@NonNull zzvj zzvjVar, Matrix matrix) {
            super(zzvjVar.zzd(), zzvjVar.zzc(), zzvjVar.zze(), "", matrix);
            this.zza = zzvjVar.zzb();
            this.zzb = zzvjVar.zza();
        }

        public float getAngle() {
            return this.zzb;
        }

        public float getConfidence() {
            return this.zza;
        }

        @NonNull
        public String getText() {
            return zza();
        }
    }

    public static class TextBase {
        private final String zza;
        private final Rect zzb;
        private final Point[] zzc;
        private final String zzd;

        public TextBase(String str, Rect rect, List list, String str2, Matrix matrix) {
            this.zza = str;
            Rect rect2 = new Rect(rect);
            if (matrix != null) {
                CommonConvertUtils.transformRect(rect2, matrix);
            }
            this.zzb = rect2;
            Point[] pointArr = new Point[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                pointArr[i10] = new Point((Point) list.get(i10));
            }
            if (matrix != null) {
                CommonConvertUtils.transformPointArray(pointArr, matrix);
            }
            this.zzc = pointArr;
            this.zzd = str2;
        }

        public Rect getBoundingBox() {
            return this.zzb;
        }

        public Point[] getCornerPoints() {
            return this.zzc;
        }

        @NonNull
        public String getRecognizedLanguage() {
            return this.zzd;
        }

        @NonNull
        public final String zza() {
            String str = this.zza;
            return str == null ? "" : str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Text(@NonNull zzvf zzvfVar, final Matrix matrix) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        this.zzb = zzvfVar.zza();
        arrayList.addAll(zzbu.zza(zzvfVar.zzb(), new zzu() { // from class: com.google.mlkit.vision.text.zza
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
            public final Object zza(Object obj) {
                return new Text.TextBlock((zzuz) obj, matrix);
            }
        }));
    }

    @NonNull
    public String getText() {
        return this.zzb;
    }

    @NonNull
    public List<TextBlock> getTextBlocks() {
        return Collections.unmodifiableList(this.zza);
    }

    public Text(@NonNull String str, @NonNull List list) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        arrayList.addAll(list);
        this.zzb = str;
    }

    public static class Line extends TextBase {
        private final List zza;
        private final float zzb;
        private final float zzc;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Line(@NonNull zzvd zzvdVar, final Matrix matrix, float f10, float f11) {
            super(zzvdVar.zze(), zzvdVar.zzc(), zzvdVar.zzf(), zzvdVar.zzd(), matrix);
            this.zza = zzbu.zza(zzvdVar.zzg(), new zzu() { // from class: com.google.mlkit.vision.text.zzc
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return new Text.Element((zzvb) obj, matrix);
                }
            });
            this.zzb = f10;
            this.zzc = f11;
        }

        public float getAngle() {
            return this.zzc;
        }

        public float getConfidence() {
            return this.zzb;
        }

        @NonNull
        public synchronized List<Element> getElements() {
            return this.zza;
        }

        @NonNull
        public String getText() {
            return zza();
        }

        public Line(@NonNull String str, @NonNull Rect rect, @NonNull List list, @NonNull String str2, Matrix matrix, @NonNull List list2, float f10, float f11) {
            super(str, rect, list, str2, matrix);
            this.zza = list2;
            this.zzb = f10;
            this.zzc = f11;
        }
    }

    public static class TextBlock extends TextBase {
        private final List zza;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public TextBlock(@NonNull zzuz zzuzVar, final Matrix matrix) {
            super(zzuzVar.zzc(), zzuzVar.zza(), zzuzVar.zzd(), zzuzVar.zzb(), matrix);
            this.zza = zzbu.zza(zzuzVar.zze(), new zzu() { // from class: com.google.mlkit.vision.text.zzd
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    zzvd zzvdVar = (zzvd) obj;
                    return new Text.Line(zzvdVar, matrix, zzvdVar.zzb(), zzvdVar.zza());
                }
            });
        }

        @NonNull
        public synchronized List<Line> getLines() {
            return this.zza;
        }

        @NonNull
        public String getText() {
            return zza();
        }

        public TextBlock(@NonNull String str, @NonNull Rect rect, @NonNull List list, @NonNull String str2, Matrix matrix, @NonNull List list2) {
            super(str, rect, list, str2, matrix);
            this.zza = list2;
        }
    }

    public static class Element extends TextBase {
        private final List zza;
        private final float zzb;
        private final float zzc;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Element(@NonNull zzvb zzvbVar, final Matrix matrix) {
            super(zzvbVar.zze(), zzvbVar.zzc(), zzvbVar.zzf(), zzvbVar.zzd(), matrix);
            this.zzb = zzvbVar.zzb();
            this.zzc = zzvbVar.zza();
            List listZzg = zzvbVar.zzg();
            this.zza = zzbu.zza(listZzg == null ? new ArrayList() : listZzg, new zzu() { // from class: com.google.mlkit.vision.text.zzb
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return new Text.Symbol((zzvj) obj, matrix);
                }
            });
        }

        public float getAngle() {
            return this.zzc;
        }

        public float getConfidence() {
            return this.zzb;
        }

        @NonNull
        public synchronized List<Symbol> getSymbols() {
            return this.zza;
        }

        @NonNull
        public String getText() {
            return zza();
        }

        public Element(@NonNull String str, @NonNull Rect rect, @NonNull List list, @NonNull String str2, Matrix matrix, float f10, float f11, @NonNull List list2) {
            super(str, rect, list, str2, matrix);
            this.zzb = f10;
            this.zzc = f11;
            this.zza = list2;
        }
    }
}
