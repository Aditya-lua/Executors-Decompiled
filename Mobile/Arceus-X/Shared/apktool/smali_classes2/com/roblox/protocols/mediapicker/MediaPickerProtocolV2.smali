.class public final Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001EB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00062\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0008J\'\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008\"\u0010!J\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008#\u0010!R\u0014\u0010$\u001a\u00020\u00178\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010&\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u001c\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u0017078\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u001c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020:078\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008;\u00109R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010@R\u001a\u0010B\u001a\u0002018FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008D\u0010\u0003\u001a\u0004\u0008B\u0010C\u00a8\u0006F"
    }
    d2 = {
        "Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;",
        "Landroidx/lifecycle/f;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "",
        "launchCaptureImage",
        "(Landroid/content/Context;)V",
        "Landroidx/activity/result/ActivityResult;",
        "result",
        "onCaptureImageIntentResult",
        "(Landroid/content/Context;Landroidx/activity/result/ActivityResult;)V",
        "Landroid/graphics/BitmapFactory$Options;",
        "options",
        "",
        "calculateInSampleSize",
        "(Landroid/graphics/BitmapFactory$Options;)I",
        "",
        "byteArray",
        "onResponse",
        "([B)V",
        "onRequestCameraImage",
        "",
        "assetType",
        "sourceType",
        "",
        "nativeListenerPtr",
        "onMediaRequest",
        "(Ljava/lang/String;Ljava/lang/String;J)V",
        "Landroidx/lifecycle/s;",
        "owner",
        "onCreate",
        "(Landroidx/lifecycle/s;)V",
        "onResume",
        "onDestroy",
        "TAG",
        "Ljava/lang/String;",
        "IMAGE_SAMPLE_SIZE",
        "I",
        "Ljava/lang/ref/WeakReference;",
        "contextRef",
        "Ljava/lang/ref/WeakReference;",
        "Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$a;",
        "mediaRequest",
        "Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$a;",
        "Landroid/net/Uri;",
        "photoUri",
        "Landroid/net/Uri;",
        "",
        "initialized",
        "Z",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "_isCapturingMedia",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "Lg/c;",
        "requestPermissionLauncher",
        "Lg/c;",
        "Landroid/content/Intent;",
        "captureImageLauncher",
        "Ljava/text/SimpleDateFormat;",
        "dateFormater$delegate",
        "Ljt/h;",
        "getDateFormater",
        "()Ljava/text/SimpleDateFormat;",
        "dateFormater",
        "isCapturingMedia",
        "()Z",
        "isCapturingMedia$annotations",
        "a",
        "robloxengine_commonDefaultProtectionRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final IMAGE_SAMPLE_SIZE:I = 0x280

.field public static final INSTANCE:Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "MediaPickerProtocolV2"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static _isCapturingMedia:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static captureImageLauncher:Lg/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/c<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field private static contextRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static final dateFormater$delegate:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static initialized:Z

.field private static mediaRequest:Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static photoUri:Landroid/net/Uri;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static requestPermissionLauncher:Lg/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;

    invoke-direct {v0}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;-><init>()V

    sput-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->INSTANCE:Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->_isCapturingMedia:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Lll/e;

    invoke-direct {v0}, Lll/e;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->dateFormater$delegate:Ljt/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lj/b;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->onCreate$lambda$0(Lj/b;Z)V

    return-void
.end method

.method public static final synthetic access$onCaptureImageIntentResult(Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;Landroid/content/Context;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->onCaptureImageIntentResult(Landroid/content/Context;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static synthetic b()Ljava/text/SimpleDateFormat;
    .locals 1

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->dateFormater_delegate$lambda$0()Ljava/text/SimpleDateFormat;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lj/b;Landroidx/activity/result/ActivityResult;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->onCreate$lambda$1(Lj/b;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method private final calculateInSampleSize(Landroid/graphics/BitmapFactory$Options;)I
    .locals 4

    iget v0, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget p1, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1}, Ljt/s;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    const/4 v1, 0x1

    const/16 v2, 0x280

    if-gt v0, v2, :cond_1

    if-le p1, v2, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    div-int/lit8 v0, v0, 0x2

    div-int/lit8 p1, p1, 0x2

    :goto_1
    div-int v3, v0, v1

    if-lt v3, v2, :cond_2

    div-int v3, p1, v1

    if-lt v3, v2, :cond_2

    mul-int/lit8 v1, v1, 0x2

    goto :goto_1

    :cond_2
    return v1
.end method

.method private static final dateFormater_delegate$lambda$0()Ljava/text/SimpleDateFormat;
    .locals 3

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMdd_HHmmss"

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    return-object v0
.end method

.method private final getDateFormater()Ljava/text/SimpleDateFormat;
    .locals 1

    sget-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->dateFormater$delegate:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/SimpleDateFormat;

    return-object v0
.end method

.method public static final isCapturingMedia()Z
    .locals 1

    sget-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->_isCapturingMedia:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public static synthetic isCapturingMedia$annotations()V
    .locals 0

    return-void
.end method

.method private final launchCaptureImage(Landroid/content/Context;)V
    .locals 5

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.google.assistant.extra.USE_FRONT_CAMERA"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v1, "android.intent.extras.CAMERA_FACING"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "android.intent.extras.LENS_FACING_FRONT"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "android.intent.extra.USE_FRONT_CAMERA"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v1, "camerafacing"

    const-string v3, "front"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "previous_mode"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "default_camera"

    const-string v3, "1"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "default_mode"

    const-string v3, "com.huawei.camera2.mode.photo.PhotoMode"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-direct {p0}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->getDateFormater()Ljava/text/SimpleDateFormat;

    move-result-object v1

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "captured_image_"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, ".jpg"

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v4

    invoke-static {v1, v3, v4}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".fileprovider"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3, v1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    sput-object v1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->photoUri:Landroid/net/Uri;

    const-string v3, "output"

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    sget-object p1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->_isCapturingMedia:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    sget-object p1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->captureImageLauncher:Lg/c;

    if-nez p1, :cond_0

    const-string p1, "captureImageLauncher"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    invoke-virtual {v1, v0}, Lg/c;->b(Ljava/lang/Object;)V

    return-void

    :cond_1
    const-string p1, "MediaPickerProtocolV2"

    const-string v0, "No camera app found to handle the intent."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0, v1}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->onResponse([B)V

    return-void
.end method

.method private final onCaptureImageIntentResult(Landroid/content/Context;Landroidx/activity/result/ActivityResult;)V
    .locals 13

    const-string v0, "Cleaning up temporary file "

    invoke-virtual {p2}, Landroidx/activity/result/ActivityResult;->f()I

    move-result p2

    const/4 v1, -0x1

    const-string v2, "MediaPickerProtocolV2"

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-ne p2, v1, :cond_3

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    if-eqz p1, :cond_3

    sget-object p2, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->photoUri:Landroid/net/Uri;

    if-eqz p2, :cond_3

    :try_start_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v5, 0x1

    iput-boolean v5, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v7, "x"

    if-eqz v6, :cond_0

    :try_start_1
    invoke-static {v6, v3, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget v8, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v9, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Captured image dimensions: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v2, v8}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-static {v6, v3}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_6

    :catch_0
    move-exception v1

    goto/16 :goto_5

    :catchall_1
    move-exception v1

    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v5

    :try_start_4
    invoke-static {v6, v1}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v5

    :cond_0
    :goto_0
    sget-object v6, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->INSTANCE:Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;

    invoke-direct {v6, v1}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->calculateInSampleSize(Landroid/graphics/BitmapFactory$Options;)I

    move-result v8

    iput v8, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    iput-boolean v4, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v8
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v8, :cond_2

    :try_start_5
    invoke-static {v8, v3, v1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "Loaded bitmap with dimensions: "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v7, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v7}, Ljava/io/ByteArrayOutputStream;-><init>()V

    sget-object v9, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v10, 0x64

    invoke-virtual {v1, v9, v10, v7}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-direct {v6, v1}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->onResponse([B)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :try_start_6
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move v4, v5

    goto :goto_1

    :catchall_3
    move-exception v1

    move v4, v5

    goto :goto_2

    :catchall_4
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_1
    :try_start_7
    invoke-static {v8, v3}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_3

    :goto_2
    :try_start_8
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    :catchall_5
    move-exception v5

    :try_start_9
    invoke-static {v8, v1}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v5
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :cond_2
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    :goto_4
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1, p2, v3, v3}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    sput-object v3, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->photoUri:Landroid/net/Uri;

    goto :goto_7

    :goto_5
    :try_start_a
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Error processing captured image: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_4

    :goto_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1, p2, v3, v3}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    sput-object v3, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->photoUri:Landroid/net/Uri;

    throw v1

    :cond_3
    :goto_7
    if-nez v4, :cond_4

    const-string p1, "Failed to process captured image."

    invoke-static {v2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0, v3}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->onResponse([B)V

    :cond_4
    return-void
.end method

.method private static final onCreate$lambda$0(Lj/b;Z)V
    .locals 1

    const-string v0, "MediaPickerProtocolV2"

    if-eqz p1, :cond_0

    const-string p1, "Camera permission granted. Launching camera."

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->INSTANCE:Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;

    invoke-direct {p1, p0}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->launchCaptureImage(Landroid/content/Context;)V

    return-void

    :cond_0
    const-string p0, "Camera permission denied. Cannot capture image."

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->INSTANCE:Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->onResponse([B)V

    return-void
.end method

.method private static final onCreate$lambda$1(Lj/b;Landroidx/activity/result/ActivityResult;)V
    .locals 8

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->_isCapturingMedia:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-static {p0}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/s;)Landroidx/lifecycle/m;

    move-result-object v2

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v3

    new-instance v5, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;

    const/4 v0, 0x0

    invoke-direct {v5, p0, p1, v0}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$b;-><init>(Lj/b;Landroidx/activity/result/ActivityResult;Lnt/b;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method private final onRequestCameraImage(Landroid/content/Context;)V
    .locals 2

    const-string v0, "android.permission.CAMERA"

    invoke-static {p1, v0}, Ll2/b;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0, p1}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->launchCaptureImage(Landroid/content/Context;)V

    return-void

    :cond_0
    sget-object p1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->requestPermissionLauncher:Lg/c;

    if-nez p1, :cond_1

    const-string p1, "requestPermissionLauncher"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_1
    invoke-virtual {p1, v0}, Lg/c;->b(Ljava/lang/Object;)V

    return-void
.end method

.method private final onResponse([B)V
    .locals 3

    sget-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->mediaRequest:Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$a;->b()J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, p1, v0}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->onMediaPickerResponse(J[BLjava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onCreate(Landroidx/lifecycle/s;)V
    .locals 2
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj/b;

    if-eqz v0, :cond_0

    check-cast p1, Lj/b;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->contextRef:Ljava/lang/ref/WeakReference;

    new-instance v0, Lh/h;

    invoke-direct {v0}, Lh/h;-><init>()V

    new-instance v1, Lll/c;

    invoke-direct {v1, p1}, Lll/c;-><init>(Lj/b;)V

    invoke-virtual {p1, v0, v1}, Le/p;->h(Lh/a;Lg/a;)Lg/c;

    move-result-object v0

    sput-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->requestPermissionLauncher:Lg/c;

    new-instance v0, Lh/i;

    invoke-direct {v0}, Lh/i;-><init>()V

    new-instance v1, Lll/d;

    invoke-direct {v1, p1}, Lll/d;-><init>(Lj/b;)V

    invoke-virtual {p1, v0, v1}, Le/p;->h(Lh/a;Lg/a;)Lg/c;

    move-result-object p1

    sput-object p1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->captureImageLauncher:Lg/c;

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/s;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->contextRef:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->clear()V

    :cond_0
    const/4 p1, 0x0

    sput-object p1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->contextRef:Ljava/lang/ref/WeakReference;

    sput-object p1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->mediaRequest:Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$a;

    sget-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->requestPermissionLauncher:Lg/c;

    if-nez v0, :cond_1

    const-string v0, "requestPermissionLauncher"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    move-object v0, p1

    :cond_1
    invoke-virtual {v0}, Lg/c;->d()V

    sget-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->captureImageLauncher:Lg/c;

    if-nez v0, :cond_2

    const-string v0, "captureImageLauncher"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object p1, v0

    :goto_0
    invoke-virtual {p1}, Lg/c;->d()V

    return-void
.end method

.method public final onMediaRequest(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "assetType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->contextRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$a;

    invoke-direct {v1, p1, p2, p3, p4}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$a;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    sput-object v1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->mediaRequest:Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2$a;

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getAssetTypeImages()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->getSourceTypeCamera()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0, v0}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->onRequestCameraImage(Landroid/content/Context;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onPause(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public onResume(Landroidx/lifecycle/s;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean p1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->initialized:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    sput-boolean p1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->initialized:Z

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->initializeMediaPickerProtocol()V

    :cond_0
    sget-object p1, Lcom/roblox/protocols/mediapicker/MediaPickerProtocolV2;->_isCapturingMedia:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStart(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStop(Landroidx/lifecycle/s;)V

    return-void
.end method
