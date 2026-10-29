.class public final Lcom/roblox/client/startup/NativeHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/startup/NativeHelper$a;,
        Lcom/roblox/client/startup/NativeHelper$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u0006\n\u0002\u0008\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u008d\u00012\u00020\u0001:\u0001XB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u000eJ/\u0010\u001b\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008!\u0010\u000eJ\u000f\u0010\"\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008\"\u0010\u000eJ\u0017\u0010%\u001a\u00020\u000c2\u0006\u0010$\u001a\u00020#H\u0007\u00a2\u0006\u0004\u0008%\u0010&J\u001f\u0010*\u001a\u00020\u000c2\u0006\u0010\'\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0007\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010.\u001a\u00020\u000c2\u0006\u0010-\u001a\u00020,H\u0007\u00a2\u0006\u0004\u0008.\u0010/J\u0017\u00101\u001a\u00020\u000c2\u0006\u00100\u001a\u00020,H\u0007\u00a2\u0006\u0004\u00081\u0010/J\u000f\u00102\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u00082\u0010\u000eJ\u0017\u00103\u001a\u00020\u000c2\u0006\u0010-\u001a\u00020,H\u0007\u00a2\u0006\u0004\u00083\u0010/J\u0017\u00104\u001a\u00020\u000c2\u0006\u0010-\u001a\u00020,H\u0007\u00a2\u0006\u0004\u00084\u0010/J\u0017\u00105\u001a\u00020\u000c2\u0006\u0010-\u001a\u00020,H\u0007\u00a2\u0006\u0004\u00085\u0010/J\u000f\u00106\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u00086\u0010\u000eJ\u000f\u00107\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u00087\u0010\u000eJ\u000f\u00108\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u00088\u0010\u000eJ\u0017\u0010;\u001a\u00020\u000c2\u0006\u0010:\u001a\u000209H\u0007\u00a2\u0006\u0004\u0008;\u0010<J\u000f\u0010=\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008=\u0010\u000eJ\u000f\u0010>\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008>\u0010\u000eJ/\u0010E\u001a\u00020\u000c2\u0006\u0010?\u001a\u00020#2\u0006\u0010@\u001a\u00020(2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0007\u00a2\u0006\u0004\u0008E\u0010FJ\u000f\u0010G\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008G\u0010\u000eJ\u0017\u0010I\u001a\u00020\u000c2\u0006\u0010H\u001a\u00020,H\u0007\u00a2\u0006\u0004\u0008I\u0010/J\u000f\u0010J\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008J\u0010\u000eJ\u0017\u0010L\u001a\u00020\u000c2\u0006\u0010K\u001a\u00020,H\u0007\u00a2\u0006\u0004\u0008L\u0010/J/\u0010Q\u001a\u00020\u000c2\u0006\u0010M\u001a\u00020\u00132\u0006\u0010N\u001a\u00020\u00132\u0006\u0010O\u001a\u00020,2\u0006\u0010P\u001a\u00020,H\u0007\u00a2\u0006\u0004\u0008Q\u0010RJ\u0017\u0010U\u001a\u00020\u000c2\u0006\u0010T\u001a\u00020SH\u0007\u00a2\u0006\u0004\u0008U\u0010VJ\u000f\u0010W\u001a\u00020\u000cH\u0007\u00a2\u0006\u0004\u0008W\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Z\u0010[R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008a\u0010bR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008e\u0010fR\u0016\u0010j\u001a\u00020(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0016\u0010l\u001a\u00020(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008k\u0010iR\u0016\u0010n\u001a\u00020(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008m\u0010iR\u0016\u0010p\u001a\u00020(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008o\u0010iR\u0016\u0010r\u001a\u00020(8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008q\u0010iR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008t\u0010uR\u0018\u0010z\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008x\u0010yR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008{\u0010|R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008~\u0010\u007fR\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008a\u0001\u0010\u008b\u0001\u00a8\u0006\u008e\u0001"
    }
    d2 = {
        "Lcom/roblox/client/startup/NativeHelper;",
        "",
        "Lcom/roblox/client/startup/MainGameActivity;",
        "activity",
        "Lfh/i;",
        "upgradeDialog",
        "Ltg/a;",
        "adsHelper",
        "Lku/l0;",
        "ioDispatcher",
        "<init>",
        "(Lcom/roblox/client/startup/MainGameActivity;Lfh/i;Ltg/a;Lku/l0;)V",
        "",
        "o0",
        "()V",
        "m0",
        "h0",
        "G",
        "e0",
        "",
        "contentViewId",
        "Landroid/view/SurfaceView;",
        "surfaceView",
        "Lcom/roblox/client/RbxKeyboard;",
        "rbxEditText",
        "Lmk/f$f;",
        "inputAdapter",
        "n0",
        "(ILandroid/view/SurfaceView;Lcom/roblox/client/RbxKeyboard;Lmk/f$f;)V",
        "Ljava/nio/ByteBuffer;",
        "flagsBuffer",
        "gameActivity_onFlagsLoaded",
        "(Ljava/nio/ByteBuffer;)V",
        "gameActivity_onFlagsFailed",
        "gameActivity_onEngineInitialized",
        "",
        "placeId",
        "gameActivity_onGameLoaded",
        "(J)V",
        "orientation",
        "",
        "inExperience",
        "gameActivity_onScreenOrientationChanged",
        "(IZ)V",
        "",
        "data",
        "gameActivity_onGameStreamingStatusChanged",
        "(Ljava/lang/String;)V",
        "motionType",
        "gameActivity_onMotionEventListening",
        "gameActivity_onLuaAppDidReturn",
        "gameActivity_onDidLogInReceived",
        "gameActivity_onDidSignUp",
        "gameActivity_onAppReady",
        "gameActivity_onDidLogOutReceived",
        "gameActivity_onDidSwitchAccountReceived",
        "gameActivity_onExperienceStart",
        "",
        "timeInMs",
        "gameActivity_onExperienceStop",
        "(D)V",
        "gameActivity_onRestartLuaApp",
        "gameActivity_onScanQrCode",
        "textBox",
        "showNativeInput",
        "",
        "byteArrayFromTextBox",
        "Lcom/roblox/engine/jni/model/NativeTextBoxInfo;",
        "textBoxInfo",
        "gameActivity_showKeyboard",
        "(JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V",
        "gameActivity_hideKeyboard",
        "value",
        "gameActivity_onLuaTextBoxChanged",
        "gameActivity_onLuaTextBoxPropertyChanged",
        "path",
        "gameActivity_onScreenshotReady",
        "result",
        "upgradeStatusCode",
        "apkUrl",
        "apkCheckSum",
        "gameActivity_setAppUpgradeStatus",
        "(IILjava/lang/String;Ljava/lang/String;)V",
        "Lph/j;",
        "event",
        "onCodeParsedFromSMS",
        "(Lph/j;)V",
        "g0",
        "a",
        "Lcom/roblox/client/startup/MainGameActivity;",
        "b",
        "Lfh/i;",
        "c",
        "Ltg/a;",
        "d",
        "Lku/l0;",
        "Lmk/f;",
        "e",
        "Lmk/f;",
        "inputListener",
        "Lwh/w0;",
        "f",
        "Lwh/w0;",
        "overlayEditTextController",
        "g",
        "Z",
        "isVisible",
        "h",
        "isForeground",
        "i",
        "isEngineInitialized",
        "j",
        "isInExperience",
        "k",
        "enableConnectivityV2ForAndroid",
        "Lzg/a;",
        "l",
        "Lzg/a;",
        "rtcAudioManager",
        "Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;",
        "m",
        "Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;",
        "appHangMonitor",
        "n",
        "I",
        "Landroidx/lifecycle/p;",
        "o",
        "Landroidx/lifecycle/p;",
        "lifecycleEventObserver",
        "Lvi/e$e;",
        "p",
        "Lvi/e$e;",
        "notificationObserver",
        "Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;",
        "q",
        "Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;",
        "webViewUserAgentGetter",
        "Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;",
        "r",
        "Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;",
        "mobileAdvertisingIdGetter",
        "s",
        "NativeShell_googleProdRelease"
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
.field public static final s:Lcom/roblox/client/startup/NativeHelper$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final t:Lwk/h$d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/roblox/client/startup/MainGameActivity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lfh/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ltg/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lku/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Lmk/f;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public f:Lwh/w0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public volatile k:Z

.field public l:Lzg/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public m:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public n:I

.field public final o:Landroidx/lifecycle/p;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final p:Lvi/e$e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final q:Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final r:Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/client/startup/NativeHelper$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/client/startup/NativeHelper$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/roblox/client/startup/NativeHelper;->s:Lcom/roblox/client/startup/NativeHelper$a;

    new-instance v0, Lak/f2;

    invoke-direct {v0}, Lak/f2;-><init>()V

    sput-object v0, Lcom/roblox/client/startup/NativeHelper;->t:Lwk/h$d;

    return-void
.end method

.method public constructor <init>(Lcom/roblox/client/startup/MainGameActivity;Lfh/i;Ltg/a;Lku/l0;)V
    .locals 1
    .param p1    # Lcom/roblox/client/startup/MainGameActivity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lfh/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltg/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lku/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upgradeDialog"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioDispatcher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    .line 3
    iput-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->b:Lfh/i;

    .line 4
    iput-object p3, p0, Lcom/roblox/client/startup/NativeHelper;->c:Ltg/a;

    .line 5
    iput-object p4, p0, Lcom/roblox/client/startup/NativeHelper;->d:Lku/l0;

    .line 6
    new-instance p2, Lak/t1;

    invoke-direct {p2, p0}, Lak/t1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    iput-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->o:Landroidx/lifecycle/p;

    .line 7
    new-instance p3, Lak/u1;

    invoke-direct {p3}, Lak/u1;-><init>()V

    iput-object p3, p0, Lcom/roblox/client/startup/NativeHelper;->p:Lvi/e$e;

    .line 8
    new-instance p3, Lak/v1;

    invoke-direct {p3, p0}, Lak/v1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    iput-object p3, p0, Lcom/roblox/client/startup/NativeHelper;->q:Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;

    .line 9
    new-instance p3, Lak/w1;

    invoke-direct {p3}, Lak/w1;-><init>()V

    iput-object p3, p0, Lcom/roblox/client/startup/NativeHelper;->r:Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;

    .line 10
    invoke-virtual {p1}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/roblox/client/startup/MainGameActivity;Lfh/i;Ltg/a;Lku/l0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 11
    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object p4

    .line 12
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/roblox/client/startup/NativeHelper;-><init>(Lcom/roblox/client/startup/MainGameActivity;Lfh/i;Ltg/a;Lku/l0;)V

    return-void
.end method

.method public static synthetic A(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->T(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic B(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->M(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic C(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->R(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic D()V
    .locals 0

    invoke-static {}, Lcom/roblox/client/startup/NativeHelper;->p0()V

    return-void
.end method

.method public static final synthetic E(Lcom/roblox/client/startup/NativeHelper;)Lcom/roblox/client/startup/MainGameActivity;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    return-object p0
.end method

.method public static final synthetic F(Lcom/roblox/client/startup/NativeHelper;)Lfh/i;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->b:Lfh/i;

    return-object p0
.end method

.method public static final H(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->f:Lwh/w0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lwh/w0;->a()V

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->G()V

    return-void
.end method

.method public static final I(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->p2()V

    return-void
.end method

.method public static final J(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {v0}, Lak/k0;->s(Landroid/content/Context;)Lak/k0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lak/k0;->H(Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->O3()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object p1

    invoke-virtual {p1}, Lvi/b;->h()V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x2000

    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    :cond_0
    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->o0()V

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->m0()V

    return-void
.end method

.method public static final K(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 3

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->S1()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/h;->f()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object v0

    sget-object v1, Lvi/b$d;->b:Lvi/b$d;

    invoke-virtual {v0, v1}, Lvi/b;->p(Lvi/b$d;)V

    invoke-static {}, Lwk/j;->c()Lwk/j;

    move-result-object v0

    invoke-static {}, Lsg/a1;->O()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lsg/a1;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lwk/j;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/h;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object v0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    sget-object v1, Lvi/b$d;->b:Lvi/b$d;

    invoke-virtual {v0, p0, v1}, Lvi/b;->i(Landroid/app/Activity;Lvi/b$d;)V

    :cond_1
    return-void
.end method

.method public static final L(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p0}, Lak/k0;->s(Landroid/content/Context;)Lak/k0;

    move-result-object p0

    invoke-virtual {p0, p1}, Lak/k0;->I(Ljava/lang/String;)V

    return-void
.end method

.method public static final M(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    invoke-static {}, Lvi/b;->f()Lvi/b;

    move-result-object v0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, p0}, Lvi/b;->j(Landroid/app/Activity;)V

    return-void
.end method

.method public static final N(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->h0()V

    return-void
.end method

.method public static final O(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->G()V

    invoke-static {}, Lhm/b;->h()Lhm/b;

    move-result-object v0

    invoke-virtual {v0}, Lhm/b;->e()V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->d()Lvi/d;

    move-result-object v0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, p0}, Lvi/d;->c(Landroid/content/Context;)V

    invoke-static {}, Lgl/a;->b()Lgl/a;

    move-result-object p0

    invoke-virtual {p0}, Lgl/a;->e()V

    return-void
.end method

.method public static final P(Lcom/roblox/client/startup/NativeHelper;D)V
    .locals 2

    invoke-static {}, Lhm/b;->h()Lhm/b;

    move-result-object v0

    invoke-virtual {v0}, Lhm/b;->f()V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->d()Lvi/d;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    double-to-long p1, p1

    invoke-virtual {v0, v1, p1, p2}, Lvi/d;->e(Landroid/content/Context;J)V

    iget-boolean p1, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    if-eqz p1, :cond_0

    invoke-static {}, Lgl/a;->b()Lgl/a;

    move-result-object p1

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1, p0}, Lgl/a;->d(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public static final Q(Landroid/content/Context;Lcom/roblox/client/startup/NativeHelper;)V
    .locals 6

    invoke-static {p0}, Lak/m2;->a(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->nativeSetAppPreviousExitReasons(Ljava/util/List;)V

    invoke-static {}, Lvg/e;->h()Lvg/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvg/e;->i(Landroid/content/Context;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->E2()Z

    move-result v0

    const/4 v1, 0x2

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    const-string v5, "fmod_init_begin"

    invoke-static {v5, v2, v3, v1, v4}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    :cond_0
    iget-object v5, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {v5}, Lorg/fmod/FMOD;->init(Landroid/content/Context;)V

    if-eqz v0, :cond_1

    const-string v0, "fmod_init_end"

    invoke-static {v0, v2, v3, v1, v4}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    :cond_1
    invoke-static {}, Lsg/a1;->U0()V

    iget-object v0, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {v0}, Lgk/z;->e(Landroid/content/Context;)Lgk/z;

    move-result-object v0

    invoke-virtual {v0}, Lgk/z;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetPreferencesFile(Ljava/lang/String;)V

    invoke-static {}, Lqi/b;->f()Lqi/b;

    move-result-object v0

    iget-object v1, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, v1}, Lqi/b;->m(Landroid/content/Context;)V

    invoke-static {p0}, Lak/k0;->w(Landroid/content/Context;)V

    iget-object v0, p1, Lcom/roblox/client/startup/NativeHelper;->m:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    if-nez v0, :cond_3

    new-instance v0, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    invoke-direct {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;-><init>()V

    invoke-virtual {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->c()V

    iget-boolean v1, p1, Lcom/roblox/client/startup/NativeHelper;->g:Z

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->b()V

    :cond_2
    iput-object v0, p1, Lcom/roblox/client/startup/NativeHelper;->m:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    :cond_3
    iget-object v0, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Lcom/roblox/client/startup/MainGameActivity;->j2()V

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object v0

    invoke-virtual {v0}, Lkm/f;->t()V

    invoke-static {}, Lrl/j;->j()Lrl/j;

    move-result-object v0

    invoke-virtual {v0}, Lrl/j;->f()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0, p0}, Lrl/j;->i(Landroid/content/Context;)V

    :cond_4
    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->d()Lvi/d;

    move-result-object v0

    iget-object v1, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, v1}, Lvi/d;->a(Landroid/content/Context;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->p2()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object p1, p1, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1, v4}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    :cond_5
    invoke-static {v4}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetExternalDirectory(Ljava/lang/String;)V

    :cond_6
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->U5()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p0}, Ldi/i;->m(Landroid/content/Context;)V

    :cond_7
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->R4()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {p0}, Lnh/c;->c(Landroid/content/Context;)V

    :cond_8
    return-void
.end method

.method public static final R(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->G()V

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->p2()V

    :cond_0
    invoke-static {}, Lcom/roblox/client/startup/a;->n()V

    return-void
.end method

.method public static final S(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->f:Lwh/w0;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lwh/w0;->d(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static final T(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->f:Lwh/w0;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lwh/w0;->c()V

    :cond_0
    return-void
.end method

.method public static final U(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->e:Lmk/f;

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lmk/f;->H(Z)V

    :cond_0
    return-void
.end method

.method public static final V(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    return-void
.end method

.method public static final W(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    iget p0, p0, Lcom/roblox/client/startup/NativeHelper;->n:I

    invoke-static {v0, p0}, Lrj/f;->f(Le4/q;I)V

    return-void
.end method

.method public static final X(Lcom/roblox/client/startup/NativeHelper;I)V
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method

.method public static final Y(ILcom/roblox/client/startup/NativeHelper;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object p0

    const-string p2, "Android-AppLogin-BrowserTracker-Failed"

    invoke-virtual {p0, p2}, Lvi/g;->q(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roblox/client/startup/NativeHelper;->e0()V

    return-void

    :cond_0
    new-instance p0, Lcom/roblox/client/d$e;

    invoke-direct {p0}, Lcom/roblox/client/d$e;-><init>()V

    const/4 p1, 0x1

    if-eq p2, p1, :cond_2

    const/4 p1, 0x2

    if-eq p2, p1, :cond_1

    invoke-virtual {p0}, Lcom/roblox/client/d$e;->f()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/roblox/client/d$e;->e()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/roblox/client/d$e;->d()V

    :goto_0
    iput-object p3, p0, Lcom/roblox/client/d$e;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/client/d$e;->c:Ljava/lang/String;

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object p1

    const-string p2, "Android-AppLogin-BrowserTracker-Success"

    invoke-virtual {p1, p2}, Lvi/g;->q(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/roblox/client/d$e;->b()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p0}, Lcom/roblox/client/d$e;->c()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    return-void

    :cond_4
    :goto_1
    invoke-static {}, Lcom/roblox/client/d;->e()Lcom/roblox/client/d;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/roblox/client/d;->g(Lcom/roblox/client/d$e;)V

    return-void
.end method

.method public static final Z([BLcom/roblox/client/startup/NativeHelper;JZLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 2

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "UTF_8"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    move-wide p1, p2

    move p3, p4

    new-instance p4, Ljava/lang/String;

    invoke-direct {p4, p0, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iget-object p0, v1, Lcom/roblox/client/startup/NativeHelper;->f:Lwh/w0;

    if-eqz p0, :cond_0

    invoke-interface/range {p0 .. p5}, Lwh/w0;->b(JZLjava/lang/String;Lcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    :cond_0
    return-void
.end method

.method public static synthetic a()V
    .locals 0

    invoke-static {}, Lcom/roblox/client/startup/NativeHelper;->c0()V

    return-void
.end method

.method public static final a0(Lcom/roblox/client/startup/NativeHelper;Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 5

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onStateChanged: event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lcom/roblox/client/startup/NativeHelper$b;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :pswitch_0
    const-string p1, "Disposing RTC audio manager."

    invoke-static {v1, p1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->l:Lzg/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lzg/a;->a()V

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->l:Lzg/a;

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setWebviewUserAgentGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;)V

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setMobileAdvertisingIdGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;)V

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->c:Ltg/a;

    invoke-virtual {p0}, Ltg/a;->f()V

    return-void

    :pswitch_1
    iput-boolean v3, p0, Lcom/roblox/client/startup/NativeHelper;->g:Z

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lfv/c;->p(Ljava/lang/Object;)V

    invoke-static {}, Lpm/a;->c()Lpm/a;

    move-result-object p1

    invoke-virtual {p1}, Lpm/a;->b()V

    invoke-static {}, Lvi/e;->c()Lvi/e;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->p:Lvi/e$e;

    invoke-virtual {p1, v0}, Lvi/e;->g(Lvi/e$e;)V

    sget-object p1, Lcom/roblox/client/startup/NativeHelper;->s:Lcom/roblox/client/startup/NativeHelper$a;

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p1, v0, p2}, Lcom/roblox/client/startup/NativeHelper$a;->a(Lcom/roblox/client/startup/NativeHelper$a;Landroid/app/Activity;Landroidx/lifecycle/l$a;)V

    invoke-static {}, Lwk/h;->h()Lwk/h;

    move-result-object p1

    sget-object p2, Lcom/roblox/client/startup/NativeHelper;->t:Lwk/h$d;

    invoke-virtual {p1, p2}, Lwk/h;->j(Lwk/h$d;)V

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->m:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->a()V

    :cond_1
    invoke-static {}, Lhm/b;->h()Lhm/b;

    move-result-object p0

    invoke-virtual {p0}, Lhm/b;->f()V

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p0

    invoke-virtual {p0}, Lkm/f;->F()V

    return-void

    :pswitch_2
    iput-boolean v3, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->e:Lmk/f;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lmk/f;->I()V

    :cond_2
    invoke-static {}, Lgl/a;->b()Lgl/a;

    move-result-object p1

    invoke-virtual {p1}, Lgl/a;->e()V

    invoke-static {}, Lyl/c;->i()Lyl/c;

    move-result-object p1

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1, p0}, Lyl/c;->k(Landroid/content/Context;)V

    invoke-static {}, Lem/a;->k()Lem/a;

    move-result-object p0

    invoke-virtual {p0}, Lem/a;->m()V

    return-void

    :pswitch_3
    iput-boolean v2, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->G()V

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->m0()V

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->h0()V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->e:Lmk/f;

    if-eqz p1, :cond_3

    invoke-virtual {p1, v3}, Lmk/f;->H(Z)V

    :cond_3
    sget-object p1, Lcom/roblox/client/startup/NativeHelper;->s:Lcom/roblox/client/startup/NativeHelper$a;

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p1, v0, p2}, Lcom/roblox/client/startup/NativeHelper$a;->a(Lcom/roblox/client/startup/NativeHelper$a;Landroid/app/Activity;Landroidx/lifecycle/l$a;)V

    invoke-static {}, Lyl/c;->i()Lyl/c;

    move-result-object p1

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1, p2}, Lyl/c;->j(Landroid/content/Context;)V

    invoke-static {}, Lem/a;->k()Lem/a;

    move-result-object p1

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v0, Landroid/content/Intent;

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    const-class v1, Lcom/roblox/client/ShareAppChosenReceiver;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance p0, Lak/b2;

    invoke-direct {p0}, Lak/b2;-><init>()V

    const/16 v1, 0x4e9c

    invoke-virtual {p1, p2, v0, v1, p0}, Lem/a;->l(Lj/b;Landroid/content/Intent;ILem/a$g;)V

    return-void

    :pswitch_4
    iput-boolean v2, p0, Lcom/roblox/client/startup/NativeHelper;->g:Z

    invoke-static {}, Lpm/a;->c()Lpm/a;

    move-result-object p1

    invoke-virtual {p1}, Lpm/a;->a()V

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->o0()V

    invoke-static {}, Lwk/h;->h()Lwk/h;

    move-result-object p1

    sget-object p2, Lcom/roblox/client/startup/NativeHelper;->t:Lwk/h$d;

    invoke-virtual {p1, p2}, Lwk/h;->i(Lwk/h$d;)V

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object p1

    invoke-virtual {p1}, Lvi/g;->i0()V

    invoke-static {}, Lfv/c;->d()Lfv/c;

    move-result-object p1

    invoke-virtual {p1, p0}, Lfv/c;->n(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->m:Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;->b()V

    :cond_4
    invoke-static {}, Lhm/b;->h()Lhm/b;

    move-result-object p1

    invoke-virtual {p1}, Lhm/b;->e()V

    invoke-static {}, Lkm/f;->D()Lkm/f;

    move-result-object p1

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1, p0}, Lkm/f;->E(Landroid/content/Context;)V

    return-void

    :pswitch_5
    invoke-static {}, Lqi/b;->f()Lqi/b;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2, v0}, Lqi/b;->u(Landroid/content/Context;)V

    new-instance p2, Lni/a;

    invoke-direct {p2}, Lni/a;-><init>()V

    invoke-static {p2}, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->setImplementation(Lpk/a;)V

    invoke-static {}, Lvi/e;->c()Lvi/e;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2, v0}, Lvi/e;->d(Landroid/content/Context;)V

    const-string p2, "Initializing RTC audio manager."

    invoke-static {v1, p2}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p2, v0}, Lsg/y;->c(Landroid/content/Context;)Lzg/a;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-interface {p2, v0}, Lzg/a;->b(Lj/b;)V

    iput-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->l:Lzg/a;

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->O3()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-static {}, Lvi/b;->n()Z

    move-result p2

    if-nez p2, :cond_5

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p2

    const/16 v0, 0x2000

    invoke-virtual {p2, v0}, Landroid/view/Window;->addFlags(I)V

    :cond_5
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->U5()Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p2

    sget-object v0, Ldi/i;->a:Ldi/i;

    invoke-virtual {p2, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_6
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->w5()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->n2()Z

    move-result p2

    if-eqz p2, :cond_7

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p2

    sget-object v0, Lfl/g;->a:Lfl/g;

    invoke-virtual {p2, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    goto :goto_0

    :cond_7
    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p2

    sget-object v0, Lfl/d;->a:Lfl/d;

    invoke-virtual {p2, v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_8
    :goto_0
    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->o()Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2, v0}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->l(Le/p;)V

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object p2

    invoke-virtual {p2}, Lsg/y;->g()Lim/f;

    move-result-object p2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2, v0}, Lim/f;->n(Le/p;)V

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->q:Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;

    invoke-static {p2}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setWebviewUserAgentGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;)V

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->r:Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;

    invoke-static {p2}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setMobileAdvertisingIdGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;)V

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p2

    invoke-virtual {p2}, Lfk/c;->m()V

    iget-object p2, p0, Lcom/roblox/client/startup/NativeHelper;->c:Ltg/a;

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p2, v0}, Ltg/a;->e(Lj/b;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p2

    invoke-interface {p2}, Lth/i;->m4()Z

    move-result p2

    if-eqz p2, :cond_9

    new-instance p2, Lkotlin/Pair;

    new-instance v0, Lsh/a;

    const/4 v2, 0x3

    const-wide/16 v3, 0x7d0

    invoke-direct {v0, v2, v3, v4}, Lsh/a;-><init>(IJ)V

    const-string v2, "webrtcsdk"

    invoke-direct {p2, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p2}, Lkotlin/collections/j0;->g(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p2}, Lsh/g;->q(Ljava/util/Map;)V

    const-string p2, "Requesting WebRTC SDK module download immediately."

    invoke-static {v1, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v2}, Lsh/g;->l(Ljava/lang/String;)V

    :cond_9
    invoke-static {}, Lgk/v;->b()Z

    move-result p2

    if-eqz p2, :cond_a

    sget-object p2, Lsh/g;->a:Lsh/g;

    invoke-static {p2, v1}, Lgk/v;->a(Lsh/g;Ljava/lang/String;)V

    invoke-interface {p1}, Landroidx/lifecycle/s;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object p2, Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;->INSTANCE:Lcom/roblox/universalapp/facialageestimation/FacialAgeEstimationProtocol;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_a
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->T2()Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object p2, Lwh/u0;->a:Lwh/u0;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_b
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->Q()Z

    move-result p1

    if-nez p1, :cond_c

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->c5()Z

    move-result p1

    if-eqz p1, :cond_d

    :cond_c
    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p1

    sget-object p2, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->INSTANCE:Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;

    invoke-virtual {p1, p2}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_d
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->k1()Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object p0

    sget-object p1, Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;->INSTANCE:Lcom/roblox/protocols/externalidentity/ExternalIdentityHandler;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_e
    :pswitch_6
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_6
    .end packed-switch
.end method

.method public static synthetic b(ILcom/roblox/client/startup/NativeHelper;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/roblox/client/startup/NativeHelper;->Y(ILcom/roblox/client/startup/NativeHelper;ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final b0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lzj/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->L(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    return-void
.end method

.method public static final c0()V
    .locals 1

    invoke-static {}, Lgk/c;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->setMobileAdvertisingId(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->K(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static final d0(ILandroid/os/Bundle;)V
    .locals 1

    const/4 p1, 0x2

    const-string v0, "NativeHelper"

    if-eq p0, p1, :cond_1

    const/16 p1, 0x65

    if-eq p0, p1, :cond_0

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Unhandled notificationId"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    const-string p0, "handleNotification: Start PlaceID event..."

    invoke-static {v0, p0}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Error: Notification \'Start PlaceID\' still needs to be handled."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const-string p0, "handleNotification: Logout event. Do nothing."

    invoke-static {v0, p0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static synthetic e(Lcom/roblox/client/startup/NativeHelper;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->X(Lcom/roblox/client/startup/NativeHelper;I)V

    return-void
.end method

.method public static synthetic f(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->J(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    return-void
.end method

.method public static final f0(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 2

    invoke-static {}, Lvg/e;->h()Lvg/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvg/e;->i(Landroid/content/Context;)V

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p0}, Lcom/roblox/client/startup/MainGameActivity;->J()V

    return-void
.end method

.method public static synthetic g(Lcom/roblox/client/startup/NativeHelper;Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/roblox/client/startup/NativeHelper;->a0(Lcom/roblox/client/startup/NativeHelper;Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V

    return-void
.end method

.method public static synthetic h(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->U(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic i()V
    .locals 0

    invoke-static {}, Lcom/roblox/client/startup/NativeHelper;->i0()V

    return-void
.end method

.method public static final i0()V
    .locals 2

    const-string v0, "NativeHelper"

    const-string v1, "Requesting permissions for MediaPickerProtocol"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->k()Lom/k;

    move-result-object v0

    sget-object v1, Lom/n;->h:Lom/n;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lom/k;->Z([Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic j(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->S(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    return-void
.end method

.method public static final j0(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 1

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v0, Lak/a2;

    invoke-direct {v0, p1}, Lak/a2;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic k(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->I(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static final k0(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lol/a;->b:Lol/a$a;

    invoke-virtual {v0, p0}, Lol/a$a;->a(Ljava/lang/String;)Lol/a;

    move-result-object p0

    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lfk/c;->u(Lol/a;)V

    return-void
.end method

.method public static synthetic l(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->j0(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    return-void
.end method

.method public static final l0(Lcom/roblox/client/startup/NativeHelper;Z)V
    .locals 1

    sget-object v0, Lpi/c;->a:Lpi/c;

    invoke-virtual {v0, p1}, Lpi/c;->j(Z)V

    sget-object v0, Lpi/b;->a:Lpi/b;

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, p0, p1}, Lpi/b;->b(Landroid/app/Activity;Z)V

    return-void
.end method

.method public static synthetic m(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->f0(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic n(ILandroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->d0(ILandroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic o(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->H(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic p(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->k0(Ljava/lang/String;)V

    return-void
.end method

.method public static final p0()V
    .locals 2

    const-string v0, "NativeHelper"

    const-string v1, "(callback) onCookieChanged: Update cookies (from web) => engine."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lsg/a1;->S0()V

    return-void
.end method

.method public static synthetic q(Lcom/roblox/client/startup/NativeHelper;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->l0(Lcom/roblox/client/startup/NativeHelper;Z)V

    return-void
.end method

.method public static final q0(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 1

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->h2()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p0}, Lak/n2;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeGLInterface;->setWebviewUserAgent(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p0}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/roblox/engine/jni/NativeGLInterface;->setWebviewUserAgent(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic r([BLcom/roblox/client/startup/NativeHelper;JZLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/roblox/client/startup/NativeHelper;->Z([BLcom/roblox/client/startup/NativeHelper;JZLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    return-void
.end method

.method public static synthetic s(Lcom/roblox/client/startup/NativeHelper;D)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/roblox/client/startup/NativeHelper;->P(Lcom/roblox/client/startup/NativeHelper;D)V

    return-void
.end method

.method public static synthetic t(Landroid/content/Context;Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->Q(Landroid/content/Context;Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic u(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->V(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic v(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->N(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic w(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->q0(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic x(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->W(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic y(Lcom/roblox/client/startup/NativeHelper;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/client/startup/NativeHelper;->O(Lcom/roblox/client/startup/NativeHelper;)V

    return-void
.end method

.method public static synthetic z(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/client/startup/NativeHelper;->b0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final G()V
    .locals 6

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Lj/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {}, Lsg/a1;->l0()Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    move v2, v3

    :cond_1
    iget-boolean v1, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    iget-boolean v3, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "adjustWindowInsets: isForeground="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isInExperience="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isLandscape="

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", shouldHideInLandscape="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    const-string v1, "getWindow(...)"

    if-nez v0, :cond_3

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lsg/c2;->c(Landroid/view/Window;)V

    return-void

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lsg/c2;->b(Landroid/view/Window;)V

    return-void
.end method

.method public final e0()V
    .locals 5

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "init_failure"

    const-wide/16 v3, 0x0

    invoke-static {v2, v3, v4, v0, v1}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/d2;

    invoke-direct {v1, p0}, Lak/d2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final g0()V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->G()V

    return-void
.end method

.method public final gameActivity_hideKeyboard()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/s1;

    invoke-direct {v1, p0}, Lak/s1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onAppReady(Ljava/lang/String;)V
    .locals 6
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gameActivity_onAppReady: data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/k1;

    invoke-direct {v1, p0}, Lak/k1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    const-string v0, "Push"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object p1

    invoke-virtual {p1}, Lsg/y;->k()Lom/k;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lom/k;->b0(Landroid/content/Context;)V

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->h2()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->d:Lku/l0;

    invoke-static {p1}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v0

    new-instance v3, Lcom/roblox/client/startup/NativeHelper$c;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/roblox/client/startup/NativeHelper$c;-><init>(Lcom/roblox/client/startup/NativeHelper;Lnt/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    :cond_1
    return-void
.end method

.method public final gameActivity_onDidLogInReceived(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gameActivity_onDidLogInReceived: data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/o1;

    invoke-direct {v1, p0, p1}, Lak/o1;-><init>(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onDidLogOutReceived()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onDidLogOutReceived:"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/q1;

    invoke-direct {v1, p0}, Lak/q1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onDidSignUp(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gameActivity_onDidSignUp: data = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/l1;

    invoke-direct {v1, p0, p1}, Lak/l1;-><init>(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onDidSwitchAccountReceived()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onDidSwitchAccountReceived:"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/j2;

    invoke-direct {v1, p0}, Lak/j2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onEngineInitialized()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onEngineInitialized:"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->i:Z

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->k:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/roblox/protocols/connectivityv2/ConnectivityV2Monitor;->setup(Landroid/content/Context;)V

    :cond_0
    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/i2;

    invoke-direct {v1, p0}, Lak/i2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onExperienceStart()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onExperienceStart:"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    sget-object v1, Lyi/a;->a:Lyi/a;

    invoke-virtual {v1, v0}, Lyi/a;->b(Z)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/c2;

    invoke-direct {v1, p0}, Lak/c2;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onExperienceStop(D)V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onExperienceStop:"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/p1;

    invoke-direct {v1, p0, p1, p2}, Lak/p1;-><init>(Lcom/roblox/client/startup/NativeHelper;D)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onFlagsFailed()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onFlagsFailed:"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/roblox/client/startup/NativeHelper;->e0()V

    return-void
.end method

.method public final gameActivity_onFlagsLoaded(Ljava/nio/ByteBuffer;)V
    .locals 3
    .param p1    # Ljava/nio/ByteBuffer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "flagsBuffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "gameActivity_onFlagsLoaded: size = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/roblox/client/startup/a;->F(Ljava/lang/String;Landroid/content/Context;)V

    invoke-static {v0}, Lcom/roblox/client/startup/a;->B(Landroid/content/Context;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->j3()Z

    move-result p1

    iput-boolean p1, p0, Lcom/roblox/client/startup/NativeHelper;->k:Z

    iget-boolean p1, p0, Lcom/roblox/client/startup/NativeHelper;->k:Z

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeAppBridgeInterface;->setEnableConnectivityV2ForAndroid(Z)V

    invoke-static {v0}, Lcom/roblox/client/startup/a;->g(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/i1;

    invoke-direct {v1, v0, p0}, Lak/i1;-><init>(Landroid/content/Context;Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {p1, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onGameLoaded(J)V
    .locals 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "gameActivity_onGameLoaded: placeId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    sget-object p2, Lyi/a;->a:Lyi/a;

    invoke-virtual {p2, p1}, Lyi/a;->b(Z)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->k4()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/roblox/client/startup/NativeHelper;->j:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x2

    const/4 p2, 0x0

    const-string v2, "native_experience_start"

    invoke-static {v2, v0, v1, p1, p2}, Lcom/roblox/universalapp/logging/LoggingProtocol;->i(Ljava/lang/String;JILjava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance p2, Lak/g1;

    invoke-direct {p2, p0}, Lak/g1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onGameStreamingStatusChanged(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->T1()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "inGameStreaming"

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p1}, Lwh/p0;->f(Landroid/app/Activity;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-static {p1}, Lwh/p0;->i(Landroid/app/Activity;)V

    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to parse GAME_STREAMING_STATUS_CHANGED: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "NativeHelper"

    invoke-static {v0, p1}, Lgk/q;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method

.method public final gameActivity_onLuaAppDidReturn()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    const-string v1, "gameActivity_onLuaAppDidReturn:"

    invoke-static {v0, v1}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Lcom/roblox/client/startup/MainGameActivity;->requestOrientationAsDefault()V

    return-void
.end method

.method public final gameActivity_onLuaTextBoxChanged(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/g2;

    invoke-direct {v1, p0, p1}, Lak/g2;-><init>(Lcom/roblox/client/startup/NativeHelper;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onLuaTextBoxPropertyChanged()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/r1;

    invoke-direct {v1, p0}, Lak/r1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onMotionEventListening(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "motionType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v0, Lak/h1;

    invoke-direct {v0, p0}, Lak/h1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onRestartLuaApp()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/n1;

    invoke-direct {v1, p0}, Lak/n1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onScanQrCode()V
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/j1;

    invoke-direct {v1, p0}, Lak/j1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_onScreenOrientationChanged(IZ)V
    .locals 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "NativeHelper"

    if-nez p2, :cond_0

    const-string p1, "gameActivity_onScreenOrientationChanged: (In-App) request the default Orientation."

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {p1}, Lcom/roblox/client/startup/MainGameActivity;->requestOrientationAsDefault()V

    return-void

    :cond_0
    sget-object p2, Lcom/roblox/client/startup/NativeHelper;->s:Lcom/roblox/client/startup/NativeHelper$a;

    invoke-static {p2, p1}, Lcom/roblox/client/startup/NativeHelper$a;->b(Lcom/roblox/client/startup/NativeHelper$a;I)I

    move-result p2

    const/4 v1, -0x1

    if-eq p2, v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "gameActivity_onScreenOrientationChanged: orientation:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " => "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v0, Lak/e2;

    invoke-direct {v0, p0, p2}, Lak/e2;-><init>(Lcom/roblox/client/startup/NativeHelper;I)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final gameActivity_onScreenshotReady(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->d:Lku/l0;

    invoke-static {v0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v1

    new-instance v4, Lcom/roblox/client/startup/NativeHelper$d;

    const/4 v0, 0x0

    invoke-direct {v4, p1, v0}, Lcom/roblox/client/startup/NativeHelper$d;-><init>(Ljava/lang/String;Lnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public final gameActivity_setAppUpgradeStatus(IILjava/lang/String;Ljava/lang/String;)V
    .locals 7
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "apkUrl"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apkCheckSum"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/m1;

    move-object v3, p0

    move v2, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lak/m1;-><init>(ILcom/roblox/client/startup/NativeHelper;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final gameActivity_showKeyboard(JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 8
    .param p4    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/roblox/engine/jni/model/NativeTextBoxInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    const-string v0, "byteArrayFromTextBox"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textBoxInfo"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v1, Lak/h2;

    move-object v3, p0

    move-wide v4, p1

    move v6, p3

    move-object v2, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lak/h2;-><init>([BLcom/roblox/client/startup/NativeHelper;JZLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final h0()V
    .locals 4

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    iget-boolean v1, p0, Lcom/roblox/client/startup/NativeHelper;->i:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onForegroundOrEngineInitialized: isForeground = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isEngineInitialized = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->i:Z

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->o()Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    new-instance v2, Lak/x1;

    invoke-direct {v2}, Lak/x1;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/roblox/protocols/mediapicker/MediaPickerProtocol;->m(Le/p;Lll/f;)V

    invoke-static {}, Lgl/a;->b()Lgl/a;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0, v1}, Lgl/a;->d(Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v0

    sget-object v1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    new-instance v0, Lak/y1;

    invoke-direct {v0, p0}, Lak/y1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v1, v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->O(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->Y4()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lpi/m;->a:Lpi/m;

    new-instance v2, Lcom/roblox/client/startup/NativeHelper$e;

    invoke-direct {v2, v0}, Lcom/roblox/client/startup/NativeHelper$e;-><init>(Lpi/m;)V

    invoke-virtual {v1, v2}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->H(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->T0()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lak/z1;

    invoke-direct {v0, p0}, Lak/z1;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v1, v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->K(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;)V

    :cond_1
    :goto_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->g3()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v0

    sget-object v1, Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;->a:Lcom/roblox/universalapp/appratingprompt/AppRatingPromptHandler;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_2
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->K5()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-virtual {v0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v0

    sget-object v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->INSTANCE:Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/r;)V

    :cond_3
    return-void
.end method

.method public final m0()V
    .locals 4

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v1

    invoke-virtual {v1}, Lvi/h;->f()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onForegroundOrLogin: isForeground = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isLoggedIn = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->h:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/roblox/client/d;->e()Lcom/roblox/client/d;

    move-result-object v0

    new-instance v1, Lcom/roblox/client/startup/NativeHelper$f;

    invoke-direct {v1, p0}, Lcom/roblox/client/startup/NativeHelper$f;-><init>(Lcom/roblox/client/startup/NativeHelper;)V

    invoke-virtual {v0, v1}, Lcom/roblox/client/d;->b(Lcom/roblox/client/d$d;)V

    :cond_0
    return-void
.end method

.method public final n0(ILandroid/view/SurfaceView;Lcom/roblox/client/RbxKeyboard;Lmk/f$f;)V
    .locals 1
    .param p2    # Landroid/view/SurfaceView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/roblox/client/RbxKeyboard;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lmk/f$f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "surfaceView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rbxEditText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inputAdapter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput p1, p0, Lcom/roblox/client/startup/NativeHelper;->n:I

    iget-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->e:Lmk/f;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lmk/f;->I()V

    :cond_0
    new-instance p1, Lmk/f;

    iget-object v0, p0, Lcom/roblox/client/startup/NativeHelper;->a:Lcom/roblox/client/startup/MainGameActivity;

    invoke-direct {p1, v0, p2, p4}, Lmk/f;-><init>(Landroid/app/Activity;Landroid/view/SurfaceView;Lmk/f$f;)V

    iput-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->e:Lmk/f;

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    new-instance p1, Lwh/q0;

    invoke-direct {p1, p3}, Lwh/q0;-><init>(Lcom/roblox/client/RbxKeyboard;)V

    iput-object p1, p0, Lcom/roblox/client/startup/NativeHelper;->f:Lwh/w0;

    return-void
.end method

.method public final o0()V
    .locals 4

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->g:Z

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v1

    invoke-virtual {v1}, Lvi/h;->f()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onVisibleOrLogin: isVisible = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isLoggedIn = "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean v0, p0, Lcom/roblox/client/startup/NativeHelper;->g:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lvi/h;->e()Lvi/h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/h;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lvi/e;->c()Lvi/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/startup/NativeHelper;->p:Lvi/e$e;

    invoke-virtual {v0, v1}, Lvi/e;->b(Lvi/e$e;)V

    :cond_0
    return-void
.end method

.method public final onCodeParsedFromSMS(Lph/j;)V
    .locals 2
    .param p1    # Lph/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation runtime Lfv/j;
        threadMode = .enum Lorg/greenrobot/eventbus/ThreadMode;->MAIN:Lorg/greenrobot/eventbus/ThreadMode;
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SMS code received."

    const-string v1, "NativeHelper"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Calling IdentityProtocol to parse OTP."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->g()Lim/f;

    move-result-object v0

    iget-object p1, p1, Lph/j;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lim/f;->o(Ljava/lang/String;)V

    return-void
.end method
