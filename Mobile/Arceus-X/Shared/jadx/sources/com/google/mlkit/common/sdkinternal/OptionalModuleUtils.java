package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_common.zzah;
import com.google.android.gms.internal.mlkit_common.zzai;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p213j9.C7091d;
import p242k9.InterfaceC7498h;
import p305n9.C8953m;
import p405r9.C10798b;
import p405r9.C10800d;
import sb.C11268m;
import sb.InterfaceC11254f;

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
    public static final Feature[] EMPTY_FEATURES = new Feature[0];

    @NonNull
    public static final String FACE = "face";

    @NonNull
    public static final String FACE_MODULE_ID = "com.google.android.gms.vision.face";

    @NonNull
    public static final Feature FEATURE_BARCODE;

    @NonNull
    public static final Feature FEATURE_CUSTOM_ICA;

    @NonNull
    public static final Feature FEATURE_DOCSCAN_CROP;

    @NonNull
    public static final Feature FEATURE_DOCSCAN_DETECT;

    @NonNull
    public static final Feature FEATURE_DOCSCAN_ENHANCE;

    @NonNull
    public static final Feature FEATURE_DOCSCAN_SHADOW_REMOVAL;

    @NonNull
    public static final Feature FEATURE_DOCSCAN_STAIN_REMOVAL;

    @NonNull
    public static final Feature FEATURE_DOCSCAN_UI;

    @NonNull
    public static final Feature FEATURE_FACE;

    @NonNull
    public static final Feature FEATURE_ICA;

    @NonNull
    public static final Feature FEATURE_IMAGE_CAPTION;

    @NonNull
    public static final Feature FEATURE_IMAGE_QUALITY_AESTHETIC;

    @NonNull
    public static final Feature FEATURE_IMAGE_QUALITY_TECHNICAL;

    @NonNull
    public static final Feature FEATURE_LANGID;

    @NonNull
    public static final Feature FEATURE_MLKIT_BARCODE_UI;

    @NonNull
    public static final Feature FEATURE_NLCLASSIFIER;

    @NonNull
    public static final Feature FEATURE_OCR;

    @NonNull
    public static final Feature FEATURE_OCR_CHINESE;

    @NonNull
    public static final Feature FEATURE_OCR_COMMON;

    @NonNull
    public static final Feature FEATURE_OCR_DEVANAGARI;

    @NonNull
    public static final Feature FEATURE_OCR_JAPANESE;

    @NonNull
    public static final Feature FEATURE_OCR_KOREAN;

    @NonNull
    public static final Feature FEATURE_SMART_REPLY;

    @NonNull
    public static final Feature FEATURE_SUBJECT_SEGMENTATION;

    @NonNull
    public static final Feature FEATURE_TFLITE_DYNAMITE;

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
        Feature feature = new Feature("vision.barcode", 1L);
        FEATURE_BARCODE = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        FEATURE_CUSTOM_ICA = feature2;
        Feature feature3 = new Feature("vision.face", 1L);
        FEATURE_FACE = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        FEATURE_ICA = feature4;
        Feature feature5 = new Feature("vision.ocr", 1L);
        FEATURE_OCR = feature5;
        FEATURE_OCR_CHINESE = new Feature("mlkit.ocr.chinese", 1L);
        FEATURE_OCR_COMMON = new Feature("mlkit.ocr.common", 1L);
        FEATURE_OCR_DEVANAGARI = new Feature("mlkit.ocr.devanagari", 1L);
        FEATURE_OCR_JAPANESE = new Feature("mlkit.ocr.japanese", 1L);
        FEATURE_OCR_KOREAN = new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        FEATURE_LANGID = feature6;
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        FEATURE_NLCLASSIFIER = feature7;
        Feature feature8 = new Feature(TFLITE_DYNAMITE, 1L);
        FEATURE_TFLITE_DYNAMITE = feature8;
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        FEATURE_MLKIT_BARCODE_UI = feature9;
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        FEATURE_SMART_REPLY = feature10;
        FEATURE_IMAGE_CAPTION = new Feature("mlkit.image.caption", 1L);
        FEATURE_DOCSCAN_DETECT = new Feature("mlkit.docscan.detect", 1L);
        FEATURE_DOCSCAN_CROP = new Feature("mlkit.docscan.crop", 1L);
        FEATURE_DOCSCAN_ENHANCE = new Feature("mlkit.docscan.enhance", 1L);
        FEATURE_DOCSCAN_UI = new Feature("mlkit.docscan.ui", 1L);
        FEATURE_DOCSCAN_STAIN_REMOVAL = new Feature("mlkit.docscan.stain", 1L);
        FEATURE_DOCSCAN_SHADOW_REMOVAL = new Feature("mlkit.docscan.shadow", 1L);
        FEATURE_IMAGE_QUALITY_AESTHETIC = new Feature("mlkit.quality.aesthetic", 1L);
        FEATURE_IMAGE_QUALITY_TECHNICAL = new Feature("mlkit.quality.technical", 1L);
        FEATURE_SUBJECT_SEGMENTATION = new Feature("mlkit.segmentation.subject", 1L);
        zzah zzahVar = new zzah();
        zzahVar.zza(BARCODE, feature);
        zzahVar.zza(CUSTOM_ICA, feature2);
        zzahVar.zza(FACE, feature3);
        zzahVar.zza(ICA, feature4);
        zzahVar.zza(OCR, feature5);
        zzahVar.zza(LANGID, feature6);
        zzahVar.zza(NLCLASSIFIER, feature7);
        zzahVar.zza(TFLITE_DYNAMITE, feature8);
        zzahVar.zza(MLKIT_BARCODE_UI, feature9);
        zzahVar.zza(SMART_REPLY, feature10);
        zza = zzahVar.zzb();
        zzah zzahVar2 = new zzah();
        zzahVar2.zza(BARCODE_MODULE_ID, feature);
        zzahVar2.zza(CUSTOM_ICA_MODULE_ID, feature2);
        zzahVar2.zza(FACE_MODULE_ID, feature3);
        zzahVar2.zza(ICA_MODULE_ID, feature4);
        zzahVar2.zza(OCR_MODULE_ID, feature5);
        zzahVar2.zza(LANGID_MODULE_ID, feature6);
        zzahVar2.zza(NLCLASSIFIER_MODULE_ID, feature7);
        zzahVar2.zza(TFLITE_DYNAMITE_MODULE_ID, feature8);
        zzahVar2.zza(SMART_REPLY_MODULE_ID, feature10);
        zzb = zzahVar2.zzb();
    }

    private OptionalModuleUtils() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static boolean areAllRequiredModulesAvailable(@NonNull Context context, @NonNull List<String> list) {
        if (C7091d.m29876f().m29877a(context) >= 221500000) {
            return areAllRequiredModulesAvailable(context, zza(zzb, list));
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                DynamiteModule.m9235e(context, DynamiteModule.f7553b, it.next());
            }
            return true;
        } catch (DynamiteModule.C1906a unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public static void requestDownload(@NonNull Context context, @NonNull String str) {
        requestDownload(context, zzaf.zzh(str));
    }

    private static Feature[] zza(Map map, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            featureArr[i10] = (Feature) C8953m.m36047l((Feature) map.get(list.get(i10)));
        }
        return featureArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public static void requestDownload(@NonNull Context context, @NonNull List<String> list) {
        if (C7091d.m29876f().m29877a(context) >= 221500000) {
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

    public static boolean areAllRequiredModulesAvailable(@NonNull Context context, @NonNull final Feature[] featureArr) {
        try {
            return ((ModuleAvailabilityResponse) C11268m.m42331a(C10798b.m41161a(context).mo41163n(new InterfaceC7498h() { // from class: com.google.mlkit.common.sdkinternal.zzq
                @Override // p242k9.InterfaceC7498h
                public final Feature[] getOptionalFeatures() {
                    Feature[] featureArr2 = OptionalModuleUtils.EMPTY_FEATURES;
                    return featureArr;
                }
            }).mo11891e(new InterfaceC11254f() { // from class: com.google.mlkit.common.sdkinternal.zzr
                @Override // sb.InterfaceC11254f
                public final void onFailure(Exception exc) {
                    Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            }))).m9222v3();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e10);
            return false;
        }
    }

    public static void requestDownload(@NonNull Context context, @NonNull final Feature[] featureArr) {
        C10798b.m41161a(context).mo41162a(C10800d.m41164d().m41168a(new InterfaceC7498h() { // from class: com.google.mlkit.common.sdkinternal.zzo
            @Override // p242k9.InterfaceC7498h
            public final Feature[] getOptionalFeatures() {
                Feature[] featureArr2 = OptionalModuleUtils.EMPTY_FEATURES;
                return featureArr;
            }
        }).m41169b()).mo11891e(new InterfaceC11254f() { // from class: com.google.mlkit.common.sdkinternal.zzp
            @Override // sb.InterfaceC11254f
            public final void onFailure(Exception exc) {
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }
}
