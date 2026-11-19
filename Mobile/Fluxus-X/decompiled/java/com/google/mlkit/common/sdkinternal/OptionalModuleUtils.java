package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_common.zzah;
import com.google.android.gms.internal.mlkit_common.zzai;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import k9.d;
import k9.f;
import l9.j;
import o9.s;
import s9.b;
import s9.c;
import tb.m;

/* JADX INFO: loaded from: classes2.dex */
public class OptionalModuleUtils {

    @NonNull
    public static final String BARCODE = "barcode";

    @NonNull
    public static final String BARCODE_MODULE_ID = "com.google.android.gms.vision.barcode";

    @NonNull
    public static final String CUSTOM_ICA = "custom_ica";

    @NonNull
    public static final String CUSTOM_ICA_MODULE_ID = "com.google.android.gms.vision.custom.ica";

    @NonNull
    public static final String DEPRECATED_DYNAMITE_MODULE_ID = "com.google.android.gms.vision.dynamite";

    @NonNull
    public static final String DOCSCAN_CROP_MODULE_ID = "com.google.android.gms.mlkit_docscan_crop";

    @NonNull
    public static final String DOCSCAN_DETECT_MODULE_ID = "com.google.android.gms.mlkit_docscan_detect";

    @NonNull
    public static final String DOCSCAN_ENHANCE_MODULE_ID = "com.google.android.gms.mlkit_docscan_enhance";

    @NonNull
    public static final String DOCSCAN_SHADOW_REMOVAL_MODULE_ID = "com.google.android.gms.mlkit_docscan_shadow";

    @NonNull
    public static final String DOCSCAN_STAIN_REMOVAL_MODULE_ID = "com.google.android.gms.mlkit_docscan_stain";

    @NonNull
    public static final d[] EMPTY_FEATURES = new d[0];

    @NonNull
    public static final String FACE = "face";

    @NonNull
    public static final String FACE_MODULE_ID = "com.google.android.gms.vision.face";

    @NonNull
    public static final d FEATURE_BARCODE;

    @NonNull
    public static final d FEATURE_CUSTOM_ICA;

    @NonNull
    public static final d FEATURE_DOCSCAN_CROP;

    @NonNull
    public static final d FEATURE_DOCSCAN_DETECT;

    @NonNull
    public static final d FEATURE_DOCSCAN_ENHANCE;

    @NonNull
    public static final d FEATURE_DOCSCAN_SHADOW_REMOVAL;

    @NonNull
    public static final d FEATURE_DOCSCAN_STAIN_REMOVAL;

    @NonNull
    public static final d FEATURE_DOCSCAN_UI;

    @NonNull
    public static final d FEATURE_FACE;

    @NonNull
    public static final d FEATURE_ICA;

    @NonNull
    public static final d FEATURE_IMAGE_CAPTION;

    @NonNull
    public static final d FEATURE_IMAGE_QUALITY_AESTHETIC;

    @NonNull
    public static final d FEATURE_IMAGE_QUALITY_TECHNICAL;

    @NonNull
    public static final d FEATURE_LANGID;

    @NonNull
    public static final d FEATURE_MLKIT_BARCODE_UI;

    @NonNull
    public static final d FEATURE_NLCLASSIFIER;

    @NonNull
    public static final d FEATURE_OCR;

    @NonNull
    public static final d FEATURE_OCR_CHINESE;

    @NonNull
    public static final d FEATURE_OCR_COMMON;

    @NonNull
    public static final d FEATURE_OCR_DEVANAGARI;

    @NonNull
    public static final d FEATURE_OCR_JAPANESE;

    @NonNull
    public static final d FEATURE_OCR_KOREAN;

    @NonNull
    public static final d FEATURE_SMART_REPLY;

    @NonNull
    public static final d FEATURE_SUBJECT_SEGMENTATION;

    @NonNull
    public static final d FEATURE_TFLITE_DYNAMITE;

    @NonNull
    public static final String ICA = "ica";

    @NonNull
    public static final String ICA_MODULE_ID = "com.google.android.gms.vision.ica";

    @NonNull
    public static final String IMAGE_CAPTION_MODULE_ID = "com.google.android.gms.mlkit_image_caption";

    @NonNull
    public static final String IMAGE_QUALITY_AESTHETIC_MODULE_ID = "com.google.android.gms.mlkit_quality_aesthetic";

    @NonNull
    public static final String IMAGE_QUALITY_TECHNICAL_MODULE_ID = "com.google.android.gms.mlkit_quality_technical";

    @NonNull
    public static final String LANGID = "langid";

    @NonNull
    public static final String LANGID_MODULE_ID = "com.google.android.gms.mlkit.langid";

    @NonNull
    public static final String MLKIT_BARCODE_UI = "barcode_ui";

    @NonNull
    public static final String NLCLASSIFIER = "nlclassifier";

    @NonNull
    public static final String NLCLASSIFIER_MODULE_ID = "com.google.android.gms.mlkit.nlclassifier";

    @NonNull
    public static final String OCR = "ocr";

    @NonNull
    public static final String OCR_CHINESE_MODULE_ID = "com.google.android.gms.mlkit_ocr_chinese";

    @NonNull
    public static final String OCR_COMMON_MODULE_ID = "com.google.android.gms.mlkit_ocr_common";

    @NonNull
    public static final String OCR_DEVANAGARI_MODULE_ID = "com.google.android.gms.mlkit_ocr_devanagari";

    @NonNull
    public static final String OCR_JAPANESE_MODULE_ID = "com.google.android.gms.mlkit_ocr_japanese";

    @NonNull
    public static final String OCR_KOREAN_MODULE_ID = "com.google.android.gms.mlkit_ocr_korean";

    @NonNull
    public static final String OCR_MODULE_ID = "com.google.android.gms.vision.ocr";

    @NonNull
    public static final String SMART_REPLY = "smart_reply";

    @NonNull
    public static final String SMART_REPLY_MODULE_ID = "com.google.android.gms.mlkit_smartreply";

    @NonNull
    public static final String SUBJECT_SEGMENTATION_MODULE_ID = "com.google.android.gms.mlkit_subject_segmentation";

    @NonNull
    public static final String TFLITE_DYNAMITE = "tflite_dynamite";

    @NonNull
    public static final String TFLITE_DYNAMITE_MODULE_ID = "com.google.android.gms.tflite_dynamite";
    private static final zzai zza;
    private static final zzai zzb;

    static {
        d dVar = new d("vision.barcode", 1L);
        FEATURE_BARCODE = dVar;
        d dVar2 = new d("vision.custom.ica", 1L);
        FEATURE_CUSTOM_ICA = dVar2;
        d dVar3 = new d("vision.face", 1L);
        FEATURE_FACE = dVar3;
        d dVar4 = new d("vision.ica", 1L);
        FEATURE_ICA = dVar4;
        d dVar5 = new d("vision.ocr", 1L);
        FEATURE_OCR = dVar5;
        FEATURE_OCR_CHINESE = new d("mlkit.ocr.chinese", 1L);
        FEATURE_OCR_COMMON = new d("mlkit.ocr.common", 1L);
        FEATURE_OCR_DEVANAGARI = new d("mlkit.ocr.devanagari", 1L);
        FEATURE_OCR_JAPANESE = new d("mlkit.ocr.japanese", 1L);
        FEATURE_OCR_KOREAN = new d("mlkit.ocr.korean", 1L);
        d dVar6 = new d("mlkit.langid", 1L);
        FEATURE_LANGID = dVar6;
        d dVar7 = new d("mlkit.nlclassifier", 1L);
        FEATURE_NLCLASSIFIER = dVar7;
        d dVar8 = new d(TFLITE_DYNAMITE, 1L);
        FEATURE_TFLITE_DYNAMITE = dVar8;
        d dVar9 = new d("mlkit.barcode.ui", 1L);
        FEATURE_MLKIT_BARCODE_UI = dVar9;
        d dVar10 = new d("mlkit.smartreply", 1L);
        FEATURE_SMART_REPLY = dVar10;
        FEATURE_IMAGE_CAPTION = new d("mlkit.image.caption", 1L);
        FEATURE_DOCSCAN_DETECT = new d("mlkit.docscan.detect", 1L);
        FEATURE_DOCSCAN_CROP = new d("mlkit.docscan.crop", 1L);
        FEATURE_DOCSCAN_ENHANCE = new d("mlkit.docscan.enhance", 1L);
        FEATURE_DOCSCAN_UI = new d("mlkit.docscan.ui", 1L);
        FEATURE_DOCSCAN_STAIN_REMOVAL = new d("mlkit.docscan.stain", 1L);
        FEATURE_DOCSCAN_SHADOW_REMOVAL = new d("mlkit.docscan.shadow", 1L);
        FEATURE_IMAGE_QUALITY_AESTHETIC = new d("mlkit.quality.aesthetic", 1L);
        FEATURE_IMAGE_QUALITY_TECHNICAL = new d("mlkit.quality.technical", 1L);
        FEATURE_SUBJECT_SEGMENTATION = new d("mlkit.segmentation.subject", 1L);
        zzah zzahVar = new zzah();
        zzahVar.zza(BARCODE, dVar);
        zzahVar.zza(CUSTOM_ICA, dVar2);
        zzahVar.zza(FACE, dVar3);
        zzahVar.zza(ICA, dVar4);
        zzahVar.zza(OCR, dVar5);
        zzahVar.zza(LANGID, dVar6);
        zzahVar.zza(NLCLASSIFIER, dVar7);
        zzahVar.zza(TFLITE_DYNAMITE, dVar8);
        zzahVar.zza(MLKIT_BARCODE_UI, dVar9);
        zzahVar.zza(SMART_REPLY, dVar10);
        zza = zzahVar.zzb();
        zzah zzahVar2 = new zzah();
        zzahVar2.zza(BARCODE_MODULE_ID, dVar);
        zzahVar2.zza(CUSTOM_ICA_MODULE_ID, dVar2);
        zzahVar2.zza(FACE_MODULE_ID, dVar3);
        zzahVar2.zza(ICA_MODULE_ID, dVar4);
        zzahVar2.zza(OCR_MODULE_ID, dVar5);
        zzahVar2.zza(LANGID_MODULE_ID, dVar6);
        zzahVar2.zza(NLCLASSIFIER_MODULE_ID, dVar7);
        zzahVar2.zza(TFLITE_DYNAMITE_MODULE_ID, dVar8);
        zzahVar2.zza(SMART_REPLY_MODULE_ID, dVar10);
        zzb = zzahVar2.zzb();
    }

    private OptionalModuleUtils() {
    }

    @Deprecated
    public static boolean areAllRequiredModulesAvailable(@NonNull Context context, @NonNull List<String> list) {
        if (f.f().a(context) >= 221500000) {
            return areAllRequiredModulesAvailable(context, zza(zzb, list));
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                DynamiteModule.e(context, DynamiteModule.b, it.next());
            }
            return true;
        } catch (DynamiteModule.a unused) {
            return false;
        }
    }

    @Deprecated
    public static void requestDownload(@NonNull Context context, @NonNull String str) {
        requestDownload(context, zzaf.zzh(str));
    }

    private static d[] zza(Map map, List list) {
        d[] dVarArr = new d[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            dVarArr[i10] = (d) s.l((d) map.get(list.get(i10)));
        }
        return dVarArr;
    }

    @Deprecated
    public static void requestDownload(@NonNull Context context, @NonNull List<String> list) {
        if (f.f().a(context) >= 221500000) {
            requestDownload(context, zza(zza, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static boolean areAllRequiredModulesAvailable(@NonNull Context context, @NonNull final d[] dVarArr) {
        try {
            return ((b) m.a(c.a(context).o(new j() { // from class: com.google.mlkit.common.sdkinternal.zzq
                @Override // l9.j
                public final d[] getOptionalFeatures() {
                    d[] dVarArr2 = OptionalModuleUtils.EMPTY_FEATURES;
                    return dVarArr;
                }
            }).e(new tb.f() { // from class: com.google.mlkit.common.sdkinternal.zzr
                @Override // tb.f
                public final void onFailure(Exception exc) {
                    Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            }))).A3();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e10);
            return false;
        }
    }

    public static void requestDownload(@NonNull Context context, @NonNull final d[] dVarArr) {
        c.a(context).h(s9.f.d().a(new j() { // from class: com.google.mlkit.common.sdkinternal.zzo
            @Override // l9.j
            public final d[] getOptionalFeatures() {
                d[] dVarArr2 = OptionalModuleUtils.EMPTY_FEATURES;
                return dVarArr;
            }
        }).b()).e(new tb.f() { // from class: com.google.mlkit.common.sdkinternal.zzp
            @Override // tb.f
            public final void onFailure(Exception exc) {
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }
}
