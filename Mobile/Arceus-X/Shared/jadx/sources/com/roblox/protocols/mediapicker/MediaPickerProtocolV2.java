package com.roblox.protocols.mediapicker;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.annotation.Keep;
import androidx.core.content.FileProvider;
import androidx.p616lifecycle.C0982t;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.roblox.protocols.mediapicker.MediaPickerProtocolV2;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p139g.AbstractC5854c;
import p139g.InterfaceC5852a;
import p154h.C6255h;
import p154h.C6256i;
import p203j.ActivityC6992b;
import p229jt.C7342i;
import p229jt.C7348o;
import p229jt.C7352s;
import p229jt.InterfaceC7341h;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.InterfaceC7906p0;
import p261l2.C7975b;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p477ut.C11958c;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m31664d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001EB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\bJ'\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b#\u0010!R\u0014\u0010$\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u0017078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020:078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u00109R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010B\u001a\u0002018FX\u0087\u0004¢\u0006\f\u0012\u0004\bD\u0010\u0003\u001a\u0004\bB\u0010C¨\u0006F"}, m31665d2 = {"Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;", "Landroidx/lifecycle/f;", "<init>", "()V", "Landroid/content/Context;", "context", "", "launchCaptureImage", "(Landroid/content/Context;)V", "Landroidx/activity/result/ActivityResult;", "result", "onCaptureImageIntentResult", "(Landroid/content/Context;Landroidx/activity/result/ActivityResult;)V", "Landroid/graphics/BitmapFactory$Options;", "options", "", "calculateInSampleSize", "(Landroid/graphics/BitmapFactory$Options;)I", "", "byteArray", "onResponse", "([B)V", "onRequestCameraImage", "", "assetType", "sourceType", "", "nativeListenerPtr", "onMediaRequest", "(Ljava/lang/String;Ljava/lang/String;J)V", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "onResume", "onDestroy", "TAG", "Ljava/lang/String;", "IMAGE_SAMPLE_SIZE", "I", "Ljava/lang/ref/WeakReference;", "contextRef", "Ljava/lang/ref/WeakReference;", "Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$a;", "mediaRequest", "Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$a;", "Landroid/net/Uri;", "photoUri", "Landroid/net/Uri;", "", "initialized", "Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isCapturingMedia", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lg/c;", "requestPermissionLauncher", "Lg/c;", "Landroid/content/Intent;", "captureImageLauncher", "Ljava/text/SimpleDateFormat;", "dateFormater$delegate", "Ljt/h;", "getDateFormater", "()Ljava/text/SimpleDateFormat;", "dateFormater", "isCapturingMedia", "()Z", "isCapturingMedia$annotations", "a", "robloxengine_commonDefaultProtectionRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class MediaPickerProtocolV2 implements InterfaceC0954f {
    private static final int IMAGE_SAMPLE_SIZE = 640;

    @NotNull
    private static final String TAG = "MediaPickerProtocolV2";
    private static AbstractC5854c<Intent> captureImageLauncher;

    @Nullable
    private static WeakReference<Context> contextRef;
    private static boolean initialized;

    @Nullable
    private static MediaRequest mediaRequest;

    @Nullable
    private static Uri photoUri;
    private static AbstractC5854c<String> requestPermissionLauncher;

    @NotNull
    public static final MediaPickerProtocolV2 INSTANCE = new MediaPickerProtocolV2();

    @NotNull
    private static AtomicBoolean _isCapturingMedia = new AtomicBoolean(false);

    /* JADX INFO: renamed from: dateFormater$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InterfaceC7341h dateFormater = C7342i.m30456b(new Function0() { // from class: ll.e
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MediaPickerProtocolV2.dateFormater_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.roblox.protocols.mediapicker.MediaPickerProtocolV2$a, reason: from toString */
    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, m31665d2 = {"Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$a;", "", "", "assetType", "sourceType", "", "nativeListenerPtr", "<init>", "(Ljava/lang/String;Ljava/lang/String;J)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getSourceType", "c", "J", "()J", "robloxengine_commonDefaultProtectionRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class MediaRequest {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String assetType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final String sourceType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        public final long nativeListenerPtr;

        public MediaRequest(@NotNull String assetType, @NotNull String sourceType, long j10) {
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            this.assetType = assetType;
            this.sourceType = sourceType;
            this.nativeListenerPtr = j10;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAssetType() {
            return this.assetType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getNativeListenerPtr() {
            return this.nativeListenerPtr;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MediaRequest)) {
                return false;
            }
            MediaRequest mediaRequest = (MediaRequest) other;
            return Intrinsics.m31980c(this.assetType, mediaRequest.assetType) && Intrinsics.m31980c(this.sourceType, mediaRequest.sourceType) && this.nativeListenerPtr == mediaRequest.nativeListenerPtr;
        }

        public int hashCode() {
            return (((this.assetType.hashCode() * 31) + this.sourceType.hashCode()) * 31) + Long.hashCode(this.nativeListenerPtr);
        }

        @NotNull
        public String toString() {
            return "MediaRequest(assetType=" + this.assetType + ", sourceType=" + this.sourceType + ", nativeListenerPtr=" + this.nativeListenerPtr + ")";
        }
    }

    /* JADX INFO: renamed from: com.roblox.protocols.mediapicker.MediaPickerProtocolV2$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.protocols.mediapicker.MediaPickerProtocolV2$onCreate$2$1", m39664f = "MediaPickerProtocolV2.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3331b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12659t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ ActivityC6992b f12660u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ ActivityResult f12661v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3331b(ActivityC6992b activityC6992b, ActivityResult activityResult, InterfaceC9557b<? super C3331b> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12660u = activityC6992b;
            this.f12661v = activityResult;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3331b(this.f12660u, this.f12661v, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f12659t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            MediaPickerProtocolV2.INSTANCE.onCaptureImageIntentResult(this.f12660u, this.f12661v);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3331b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    private MediaPickerProtocolV2() {
    }

    private final int calculateInSampleSize(BitmapFactory.Options options) {
        Pair pairM30477a = C7352s.m30477a(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int iIntValue = ((Number) pairM30477a.m31671a()).intValue();
        int iIntValue2 = ((Number) pairM30477a.m31672b()).intValue();
        int i10 = 1;
        if (iIntValue <= IMAGE_SAMPLE_SIZE && iIntValue2 <= IMAGE_SAMPLE_SIZE) {
            return 1;
        }
        int i11 = iIntValue / 2;
        int i12 = iIntValue2 / 2;
        while (i11 / i10 >= IMAGE_SAMPLE_SIZE && i12 / i10 >= IMAGE_SAMPLE_SIZE) {
            i10 *= 2;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat dateFormater_delegate$lambda$0() {
        return new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ROOT);
    }

    private final SimpleDateFormat getDateFormater() {
        return (SimpleDateFormat) dateFormater.getValue();
    }

    public static final boolean isCapturingMedia() {
        return _isCapturingMedia.get();
    }

    public static /* synthetic */ void isCapturingMedia$annotations() {
    }

    private final void launchCaptureImage(Context context) throws IOException {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        intent.putExtra("com.google.assistant.extra.USE_FRONT_CAMERA", true);
        intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
        intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
        intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        intent.putExtra("camerafacing", "front");
        intent.putExtra("previous_mode", "front");
        intent.putExtra("default_camera", "1");
        intent.putExtra("default_mode", "com.huawei.camera2.mode.photo.PhotoMode");
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", File.createTempFile("captured_image_" + getDateFormater().format(new Date()), ".jpg", context.getCacheDir()));
        photoUri = uriForFile;
        intent.putExtra("output", uriForFile);
        AbstractC5854c<Intent> abstractC5854c = null;
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            Log.e(TAG, "No camera app found to handle the intent.");
            onResponse(null);
            return;
        }
        _isCapturingMedia.set(true);
        AbstractC5854c<Intent> abstractC5854c2 = captureImageLauncher;
        if (abstractC5854c2 == null) {
            Intrinsics.m31998u("captureImageLauncher");
        } else {
            abstractC5854c = abstractC5854c2;
        }
        abstractC5854c.m26240b(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCaptureImageIntentResult(Context context, ActivityResult result) {
        ContentResolver contentResolver;
        StringBuilder sb2;
        boolean z10 = false;
        if (result.getResultCode() == -1 && (contentResolver = context.getContentResolver()) != null) {
            Uri uri = photoUri;
            try {
                if (uri != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                        if (inputStreamOpenInputStream != null) {
                            try {
                                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                                Log.d(TAG, "Captured image dimensions: " + options.outWidth + "x" + options.outHeight);
                                C11958c.m44629a(inputStreamOpenInputStream, null);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    C11958c.m44629a(inputStreamOpenInputStream, th2);
                                    throw th3;
                                }
                            }
                        }
                        MediaPickerProtocolV2 mediaPickerProtocolV2 = INSTANCE;
                        options.inSampleSize = mediaPickerProtocolV2.calculateInSampleSize(options);
                        options.inJustDecodeBounds = false;
                        InputStream inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                        if (inputStreamOpenInputStream2 != null) {
                            try {
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                                if (bitmapDecodeStream != null) {
                                    Log.d(TAG, "Loaded bitmap with dimensions: " + bitmapDecodeStream.getWidth() + "x" + bitmapDecodeStream.getHeight());
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                    bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                                    mediaPickerProtocolV2.onResponse(byteArrayOutputStream.toByteArray());
                                    try {
                                        Unit unit = Unit.f29331a;
                                        z10 = true;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        try {
                                            throw th;
                                        } catch (Throwable th5) {
                                            C11958c.m44629a(inputStreamOpenInputStream2, th);
                                            throw th5;
                                        }
                                    }
                                }
                                C11958c.m44629a(inputStreamOpenInputStream2, null);
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        }
                        sb2 = new StringBuilder();
                    } catch (IOException e10) {
                        Log.e(TAG, "Error processing captured image: " + e10.getMessage(), e10);
                        sb2 = new StringBuilder();
                    }
                    sb2.append("Cleaning up temporary file ");
                    sb2.append(uri);
                    Log.d(TAG, sb2.toString());
                    contentResolver.delete(uri, null, null);
                    photoUri = null;
                }
            } catch (Throwable th7) {
                Log.d(TAG, "Cleaning up temporary file " + uri);
                contentResolver.delete(uri, null, null);
                photoUri = null;
                throw th7;
            }
        }
        if (z10) {
            return;
        }
        Log.e(TAG, "Failed to process captured image.");
        onResponse(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(ActivityC6992b activityC6992b, boolean z10) throws IOException {
        if (z10) {
            Log.d(TAG, "Camera permission granted. Launching camera.");
            INSTANCE.launchCaptureImage(activityC6992b);
        } else {
            Log.d(TAG, "Camera permission denied. Cannot capture image.");
            INSTANCE.onResponse(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(ActivityC6992b activityC6992b, ActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        _isCapturingMedia.set(false);
        C7882k.m32780d(C0982t.m4979a(activityC6992b), C7864g1.m32644b(), null, new C3331b(activityC6992b, result, null), 2, null);
    }

    private final void onRequestCameraImage(Context context) throws IOException {
        if (C7975b.m33003a(context, "android.permission.CAMERA") == 0) {
            launchCaptureImage(context);
            return;
        }
        AbstractC5854c<String> abstractC5854c = requestPermissionLauncher;
        if (abstractC5854c == null) {
            Intrinsics.m31998u("requestPermissionLauncher");
            abstractC5854c = null;
        }
        abstractC5854c.m26240b("android.permission.CAMERA");
    }

    private final void onResponse(byte[] byteArray) {
        MediaRequest mediaRequest2 = mediaRequest;
        if (mediaRequest2 != null) {
            MediaPickerProtocol.onMediaPickerResponse(mediaRequest2.getNativeListenerPtr(), byteArray, mediaRequest2.getAssetType());
        }
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onCreate(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        final ActivityC6992b activityC6992b = owner instanceof ActivityC6992b ? (ActivityC6992b) owner : null;
        if (activityC6992b == null) {
            return;
        }
        contextRef = new WeakReference<>(activityC6992b);
        requestPermissionLauncher = activityC6992b.mo4671h(new C6255h(), new InterfaceC5852a() { // from class: ll.c
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) throws IOException {
                MediaPickerProtocolV2.onCreate$lambda$0(activityC6992b, ((Boolean) obj).booleanValue());
            }
        });
        captureImageLauncher = activityC6992b.mo4671h(new C6256i(), new InterfaceC5852a() { // from class: ll.d
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                MediaPickerProtocolV2.onCreate$lambda$1(activityC6992b, (ActivityResult) obj);
            }
        });
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onDestroy(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        WeakReference<Context> weakReference = contextRef;
        if (weakReference != null) {
            weakReference.clear();
        }
        AbstractC5854c<Intent> abstractC5854c = null;
        contextRef = null;
        mediaRequest = null;
        AbstractC5854c<String> abstractC5854c2 = requestPermissionLauncher;
        if (abstractC5854c2 == null) {
            Intrinsics.m31998u("requestPermissionLauncher");
            abstractC5854c2 = null;
        }
        abstractC5854c2.mo4726d();
        AbstractC5854c<Intent> abstractC5854c3 = captureImageLauncher;
        if (abstractC5854c3 == null) {
            Intrinsics.m31998u("captureImageLauncher");
        } else {
            abstractC5854c = abstractC5854c3;
        }
        abstractC5854c.mo4726d();
    }

    @Keep
    public final void onMediaRequest(@NotNull String assetType, @NotNull String sourceType, long nativeListenerPtr) throws IOException {
        Context context;
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        WeakReference<Context> weakReference = contextRef;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return;
        }
        mediaRequest = new MediaRequest(assetType, sourceType, nativeListenerPtr);
        if (Intrinsics.m31980c(assetType, MediaPickerProtocol.getAssetTypeImages()) && Intrinsics.m31980c(sourceType, MediaPickerProtocol.getSourceTypeCamera())) {
            onRequestCameraImage(context);
        }
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onPause(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onPause(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public void onResume(@NotNull InterfaceC0980s owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (!initialized) {
            initialized = true;
            MediaPickerProtocol.initializeMediaPickerProtocol();
        }
        _isCapturingMedia.set(false);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onStart(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStart(interfaceC0980s);
    }

    @Override // androidx.p616lifecycle.InterfaceC0954f
    public /* bridge */ void onStop(@NotNull InterfaceC0980s interfaceC0980s) {
        super.onStop(interfaceC0980s);
    }
}
