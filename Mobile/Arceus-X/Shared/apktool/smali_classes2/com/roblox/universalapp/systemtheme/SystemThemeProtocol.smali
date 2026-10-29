.class public final Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;,
        Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;,
        Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;,
        Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u00048;3uB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0008J\r\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\n\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0008J\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u001bH\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0007\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008!\u0010\u0019J\u000f\u0010\"\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\"\u0010\u0003J\u0017\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\'H\u0002\u00a2\u0006\u0004\u0008)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010\'2\u0006\u0010+\u001a\u00020\'H\u0003\u00a2\u0006\u0004\u0008,\u0010-J\'\u00100\u001a\u00020\'2\u0006\u0010.\u001a\u00020\'2\u0006\u0010/\u001a\u00020\'2\u0006\u0010+\u001a\u00020\'H\u0003\u00a2\u0006\u0004\u00080\u00101R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u001c\u0010:\u001a\n 7*\u0004\u0018\u000106068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R#\u0010?\u001a\n 7*\u0004\u0018\u00010\'0\'8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008;\u0010<\u001a\u0004\u0008=\u0010>R#\u0010B\u001a\n 7*\u0004\u0018\u00010\'0\'8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008@\u0010<\u001a\u0004\u0008A\u0010>R#\u0010E\u001a\n 7*\u0004\u0018\u00010\'0\'8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008C\u0010<\u001a\u0004\u0008D\u0010>R#\u0010H\u001a\n 7*\u0004\u0018\u00010\'0\'8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008F\u0010<\u001a\u0004\u0008G\u0010>R#\u0010K\u001a\n 7*\u0004\u0018\u00010\'0\'8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008I\u0010<\u001a\u0004\u0008J\u0010>R\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010RR$\u0010Y\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010T8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u000c\n\u0004\u0008V\u0010W\u0012\u0004\u0008X\u0010\u0003R\u0018\u0010]\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008^\u0010_R\u0018\u0010b\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008a\u0010\\R\u0018\u0010e\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008c\u0010dR\u0018\u0010g\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008f\u0010\\R\u0018\u0010j\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008h\u0010iR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008l\u0010mR\u0018\u0010q\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008o\u0010pR\u0018\u0010t\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008r\u0010s\u00a8\u0006v"
    }
    d2 = {
        "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;",
        "Landroidx/lifecycle/f;",
        "<init>",
        "()V",
        "Landroidx/lifecycle/s;",
        "owner",
        "",
        "onCreate",
        "(Landroidx/lifecycle/s;)V",
        "onResume",
        "C",
        "onDestroy",
        "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;",
        "listener",
        "O",
        "(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;)V",
        "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;",
        "K",
        "(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;)V",
        "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;",
        "H",
        "(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;)V",
        "Lorg/json/JSONObject;",
        "jsonObject",
        "E",
        "(Lorg/json/JSONObject;)V",
        "D",
        "",
        "isSystemThemeAvailable",
        "()Z",
        "",
        "getSystemTheme",
        "()I",
        "F",
        "G",
        "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;",
        "themeValue",
        "Q",
        "(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;)V",
        "",
        "shouldHide",
        "L",
        "(Ljava/lang/String;)V",
        "path",
        "w",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "cookieName",
        "cookieValue",
        "v",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;",
        "Lku/p0;",
        "b",
        "Lku/p0;",
        "handlerScope",
        "Lcom/roblox/universalapp/messagebus/MessageBus;",
        "kotlin.jvm.PlatformType",
        "c",
        "Lcom/roblox/universalapp/messagebus/MessageBus;",
        "messageBus",
        "d",
        "Ljt/h;",
        "B",
        "()Ljava/lang/String;",
        "themeUpdatedMessageId",
        "e",
        "z",
        "setThemeMessageId",
        "f",
        "A",
        "themeParamKey",
        "g",
        "y",
        "setClassicThemeActiveMessageId",
        "h",
        "x",
        "setAppIconMessageId",
        "Landroid/os/HandlerThread;",
        "i",
        "Landroid/os/HandlerThread;",
        "cookieHandlerThread",
        "Landroid/os/Handler;",
        "j",
        "Landroid/os/Handler;",
        "cookieHandler",
        "Ljava/lang/ref/WeakReference;",
        "Landroid/content/Context;",
        "k",
        "Ljava/lang/ref/WeakReference;",
        "getContextRef$annotations",
        "contextRef",
        "Lcom/roblox/universalapp/messagebus/Connection;",
        "l",
        "Lcom/roblox/universalapp/messagebus/Connection;",
        "setThemeConn",
        "m",
        "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;",
        "themeListener",
        "n",
        "setClassicThemeConn",
        "o",
        "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;",
        "classicThemeListener",
        "p",
        "setAppIconConn",
        "q",
        "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;",
        "appIconListener",
        "Lku/d2;",
        "r",
        "Lku/d2;",
        "handlerJob",
        "s",
        "Ljava/lang/Integer;",
        "lastPublishedSystemTheme",
        "t",
        "Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;",
        "lastSetTheme",
        "a",
        "universalapp_googleProdRelease"
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
.field public static final a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lku/p0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lcom/roblox/universalapp/messagebus/MessageBus;

.field public static final d:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final g:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final h:Ljt/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final i:Landroid/os/HandlerThread;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final j:Landroid/os/Handler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static k:Ljava/lang/ref/WeakReference;
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

.field public static l:Lcom/roblox/universalapp/messagebus/Connection;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public static m:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public static n:Lcom/roblox/universalapp/messagebus/Connection;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public static o:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public static p:Lcom/roblox/universalapp/messagebus/Connection;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public static q:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public static r:Lku/d2;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public static s:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public static t:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;

    invoke-direct {v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;-><init>()V

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;

    invoke-static {}, Lku/g1;->a()Lku/l0;

    move-result-object v0

    invoke-static {v0}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v0

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->b:Lku/p0;

    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object v0

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->c:Lcom/roblox/universalapp/messagebus/MessageBus;

    new-instance v0, Lrm/a;

    invoke-direct {v0}, Lrm/a;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->d:Ljt/h;

    new-instance v0, Lrm/b;

    invoke-direct {v0}, Lrm/b;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->e:Ljt/h;

    new-instance v0, Lrm/c;

    invoke-direct {v0}, Lrm/c;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->f:Ljt/h;

    new-instance v0, Lrm/d;

    invoke-direct {v0}, Lrm/d;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->g:Ljt/h;

    new-instance v0, Lrm/e;

    invoke-direct {v0}, Lrm/e;-><init>()V

    invoke-static {v0}, Ljt/i;->b(Lkotlin/jvm/functions/Function0;)Ljt/h;

    move-result-object v0

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->h:Ljt/h;

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "CookieThread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->i:Landroid/os/HandlerThread;

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->j:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final I()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/JNISystemThemeProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "systemThemeSetAppIcon"

    invoke-static {v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final J()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/JNISystemThemeProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "systemThemeSetClassicThemeActive"

    invoke-static {v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final M(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lwk/j;->c()Lwk/j;

    move-result-object v0

    new-instance v1, Lrm/h;

    invoke-direct {v1}, Lrm/h;-><init>()V

    invoke-virtual {v0, p0, p1, v1}, Lwk/j;->g(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public static final N(Ljava/lang/Boolean;)V
    .locals 0

    return-void
.end method

.method public static final P()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/JNISystemThemeProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/JNISystemThemeProtocol;->getSystemThemeSetThemeMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final R(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lwk/j;->c()Lwk/j;

    move-result-object v0

    new-instance v1, Lrm/i;

    invoke-direct {v1}, Lrm/i;-><init>()V

    invoke-virtual {v0, p0, p1, v1}, Lwk/j;->g(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    return-void
.end method

.method public static final S(Ljava/lang/Boolean;)V
    .locals 0

    return-void
.end method

.method public static final T()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/JNISystemThemeProtocol;->getSystemThemeParamKey()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final U()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/JNISystemThemeProtocol;->getProtocolName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/JNISystemThemeProtocol;->getSystemThemeUpdatedMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roblox/universalapp/messagebus/MessageBus;->getMessageId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->R(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->S(Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic c()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->U()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->P()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->I()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->J()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final getSystemTheme()I
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->k:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/16 v1, 0x10

    if-eq v0, v1, :cond_2

    const/16 v1, 0x20

    if-eq v0, v1, :cond_1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->d:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    invoke-virtual {v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->c()I

    move-result v0

    return v0

    :cond_1
    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->h:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    invoke-virtual {v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->c()I

    move-result v0

    return v0

    :cond_2
    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->g:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    invoke-virtual {v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->c()I

    move-result v0

    return v0

    :cond_3
    :goto_0
    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->d:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    invoke-virtual {v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->c()I

    move-result v0

    return v0
.end method

.method public static synthetic h(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->M(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic i(Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->N(Ljava/lang/Boolean;)V

    return-void
.end method

.method public static final isSystemThemeAvailable()Z
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic j()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->T()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic k()Lcom/roblox/universalapp/messagebus/MessageBus;
    .locals 1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->c:Lcom/roblox/universalapp/messagebus/MessageBus;

    return-object v0
.end method

.method public static final synthetic l(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->x()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->y()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->z()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->B()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->D(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static final synthetic q(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->E(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static final synthetic r(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;Lorg/json/JSONObject;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->F(Lorg/json/JSONObject;)V

    return-void
.end method

.method public static final synthetic s(Lcom/roblox/universalapp/messagebus/Connection;)V
    .locals 0

    sput-object p0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->p:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method public static final synthetic t(Lcom/roblox/universalapp/messagebus/Connection;)V
    .locals 0

    sput-object p0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->n:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method public static final synthetic u(Lcom/roblox/universalapp/messagebus/Connection;)V
    .locals 0

    sput-object p0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->l:Lcom/roblox/universalapp/messagebus/Connection;

    return-void
.end method

.method public static final v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "="

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "; Path="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final w(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-static {}, Lvk/g;->c()Lvk/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lvk/b;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "www."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->f:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final B()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->d:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final C()V
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->G()V

    return-void
.end method

.method public final D(Lorg/json/JSONObject;)V
    .locals 1

    const-string v0, "AppIconName"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->q:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;->a(Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final E(Lorg/json/JSONObject;)V
    .locals 2

    const-string v0, "ClassicThemeActive"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->o:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;->a(Z)V

    :cond_0
    return-void
.end method

.method public final F(Lorg/json/JSONObject;)V
    .locals 2

    invoke-virtual {p0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->A()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->c:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c$a;

    invoke-virtual {v0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c$a;->a(I)Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    move-result-object p1

    if-eqz p1, :cond_0

    sput-object p1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->t:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->a:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;

    invoke-virtual {v0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->Q(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;)V

    const-string v1, "True"

    invoke-virtual {v0, v1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->L(Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->m:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;->a(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final G()V
    .locals 7

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->t:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->d()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->getSystemTheme()I

    move-result v0

    sget-object v1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->s:Ljava/lang/Integer;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->s:Ljava/lang/Integer;

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->r:Lku/d2;

    if-eqz v0, :cond_3

    sget-object v1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->b:Lku/p0;

    move-object v2, v0

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    new-instance v4, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$f;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$f;-><init>(Lnt/b;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    :cond_3
    :goto_1
    return-void
.end method

.method public final H(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;)V
    .locals 1
    .param p1    # Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->q:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;

    return-void
.end method

.method public final K(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;)V
    .locals 1
    .param p1    # Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->o:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;

    return-void
.end method

.method public final L(Ljava/lang/String;)V
    .locals 3

    const-string v0, "/my/account"

    invoke-static {v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const-string v2, "RBXHideThemeSetting"

    invoke-static {v2, p1, v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->j:Landroid/os/Handler;

    new-instance v2, Lrm/g;

    invoke-direct {v2, v1, p1}, Lrm/g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final O(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;)V
    .locals 1
    .param p1    # Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->m:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;

    return-void
.end method

.method public final Q(Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;)V
    .locals 3

    const-string v0, "/"

    invoke-static {v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$c;->b()Ljava/lang/String;

    move-result-object p1

    const-string v2, "RBXThemeOverride"

    invoke-static {v2, p1, v0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->j:Landroid/os/Handler;

    new-instance v2, Lrm/f;

    invoke-direct {v2, v1, p1}, Lrm/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onCreate(Landroidx/lifecycle/s;)V
    .locals 8
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Landroid/content/Context;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Landroid/content/Context;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    sput-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->k:Ljava/lang/ref/WeakReference;

    const/4 p1, 0x1

    invoke-static {v1, p1, v1}, Lku/g2;->b(Lku/d2;ILjava/lang/Object;)Lku/a0;

    move-result-object v3

    sput-object v3, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->r:Lku/d2;

    sget-object v2, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->b:Lku/p0;

    new-instance v5, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$e;

    invoke-direct {v5, v1}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$e;-><init>(Lnt/b;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/s;)V
    .locals 2
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    sput-object p1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->k:Ljava/lang/ref/WeakReference;

    sput-object p1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->m:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$d;

    sput-object p1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->o:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$b;

    sput-object p1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->q:Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol$a;

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->l:Lcom/roblox/universalapp/messagebus/Connection;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/universalapp/messagebus/Connection;->a()V

    :cond_0
    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->n:Lcom/roblox/universalapp/messagebus/Connection;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/roblox/universalapp/messagebus/Connection;->a()V

    :cond_1
    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->p:Lcom/roblox/universalapp/messagebus/Connection;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/roblox/universalapp/messagebus/Connection;->a()V

    :cond_2
    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->r:Lku/d2;

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    invoke-static {v0, p1, v1, p1}, Lku/d2$a;->a(Lku/d2;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_3
    sput-object p1, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->r:Lku/d2;

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

    invoke-virtual {p0}, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->G()V

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

.method public final x()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->h:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final y()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->g:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/roblox/universalapp/systemtheme/SystemThemeProtocol;->e:Ljt/h;

    invoke-interface {v0}, Ljt/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
