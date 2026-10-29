package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzut;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzux;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuy;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvh;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.google.mlkit.vision.common.internal.ImageUtils;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;
import p305n9.C8953m;
import p571y9.BinderC13134b;

/* JADX INFO: loaded from: classes2.dex */
final class zzd implements zzm {
    private final Context zza;
    private final TextRecognizerOptionsInterface zzb;
    private boolean zzc;
    private boolean zzd;
    private final zzuc zze;
    private zzuv zzf;

    public zzd(Context context, TextRecognizerOptionsInterface textRecognizerOptionsInterface, zzuc zzucVar) {
        this.zza = context;
        this.zzb = textRecognizerOptionsInterface;
        this.zze = zzucVar;
    }

    private static zzvh zzd(TextRecognizerOptionsInterface textRecognizerOptionsInterface, String str) {
        int i10 = 1;
        boolean z10 = (textRecognizerOptionsInterface instanceof zzc) && ((zzc) textRecognizerOptionsInterface).zza();
        String configLabel = textRecognizerOptionsInterface.getConfigLabel();
        String loggingLibraryNameForOptionalModule = textRecognizerOptionsInterface.getLoggingLibraryNameForOptionalModule();
        switch (textRecognizerOptionsInterface.getLoggingLanguageOption()) {
            case 1:
                i10 = 2;
                break;
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 5;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 9;
                break;
        }
        return new zzvh(configLabel, loggingLibraryNameForOptionalModule, str, true, i10 - 1, textRecognizerOptionsInterface.getLanguageHint(), z10);
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final Text zza(InputImage inputImage) throws MlKitException {
        if (this.zzf == null) {
            zzb();
        }
        zzuv zzuvVar = (zzuv) C8953m.m36047l(this.zzf);
        if (!this.zzc) {
            try {
                zzuvVar.zze();
                this.zzc = true;
            } catch (RemoteException e10) {
                throw new MlKitException("Failed to init text recognizer ".concat(String.valueOf(this.zzb.getLoggingLibraryName())), 13, e10);
            }
        }
        try {
            return new Text(zzuvVar.zzd(ImageUtils.getInstance().getImageDataWrapper(inputImage), new zzuq(inputImage.getFormat(), inputImage.getWidth(), inputImage.getHeight(), CommonConvertUtils.convertToMVRotation(inputImage.getRotationDegrees()), SystemClock.elapsedRealtime())), inputImage.getCoordinatesMatrix());
        } catch (RemoteException e11) {
            throw new MlKitException("Failed to run text recognizer ".concat(String.valueOf(this.zzb.getLoggingLibraryName())), 13, e11);
        }
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final void zzb() throws MlKitException {
        zzuv zzuvVarZzd;
        if (this.zzf != null) {
            return;
        }
        try {
            TextRecognizerOptionsInterface textRecognizerOptionsInterface = this.zzb;
            boolean z10 = textRecognizerOptionsInterface instanceof zzb;
            String strZza = z10 ? ((zzb) textRecognizerOptionsInterface).zza() : null;
            if (this.zzb.getIsThickClient()) {
                Log.d("DecoupledTextDelegate", "Start loading thick OCR module.");
                zzuvVarZzd = zzux.zza(DynamiteModule.m9235e(this.zza, DynamiteModule.f7554c, this.zzb.getModuleId()).m9244d("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator")).zze(BinderC13134b.m48743u2(this.zza), zzd(this.zzb, strZza));
            } else if (z10) {
                Log.d("DecoupledTextDelegate", "Start loading custom OCR module.");
                zzuvVarZzd = zzut.zza(DynamiteModule.m9235e(this.zza, DynamiteModule.f7553b, this.zzb.getModuleId()).m9244d("com.google.android.gms.vision.text.mlkit.CommonTextRecognizerCreator")).zzd(BinderC13134b.m48743u2(this.zza), null, zzd(this.zzb, strZza));
            } else {
                Log.d("DecoupledTextDelegate", "Start loading thin OCR module.");
                zzuy zzuyVarZza = zzux.zza(DynamiteModule.m9235e(this.zza, DynamiteModule.f7553b, this.zzb.getModuleId()).m9244d("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator"));
                zzuvVarZzd = this.zzb.getLoggingLanguageOption() == 1 ? zzuyVarZza.zzd(BinderC13134b.m48743u2(this.zza)) : zzuyVarZza.zze(BinderC13134b.m48743u2(this.zza), zzd(this.zzb, strZza));
            }
            this.zzf = zzuvVarZzd;
            LoggingUtils.zzb(this.zze, this.zzb.getIsThickClient(), zzou.NO_ERROR);
        } catch (RemoteException e10) {
            LoggingUtils.zzb(this.zze, this.zzb.getIsThickClient(), zzou.OPTIONAL_MODULE_INIT_ERROR);
            throw new MlKitException("Failed to create text recognizer ".concat(String.valueOf(this.zzb.getLoggingLibraryName())), 13, e10);
        } catch (DynamiteModule.C1906a e11) {
            LoggingUtils.zzb(this.zze, this.zzb.getIsThickClient(), zzou.OPTIONAL_MODULE_NOT_AVAILABLE);
            if (this.zzb.getIsThickClient()) {
                throw new MlKitException(String.format("Failed to load text module %s. %s", this.zzb.getLoggingLibraryName(), e11.getMessage()), 13, e11);
            }
            if (!this.zzd) {
                OptionalModuleUtils.requestDownload(this.zza, TextOptionalModuleUtils.zza(this.zzb));
                this.zzd = true;
            }
            throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override // com.google.mlkit.vision.text.internal.zzm
    public final void zzc() {
        zzuv zzuvVar = this.zzf;
        if (zzuvVar != null) {
            try {
                zzuvVar.zzf();
            } catch (RemoteException e10) {
                Log.e("DecoupledTextDelegate", "Failed to release text recognizer ".concat(String.valueOf(this.zzb.getLoggingLibraryName())), e10);
            }
            this.zzf = null;
        }
        this.zzc = false;
    }
}
